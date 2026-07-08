package X;

import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.StartCondition;
import com.bytedance.touchpoint.api.model.Status;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.TaskEventResponse;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS18S0120000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899080zWE implements InterfaceC1898130zUh {
    public final AbstractC1899090zWF LIZ;
    public final TaskEvent LIZIZ;
    public boolean LJIIIIZZ;
    public final Keva LIZJ = Keva.getRepo("incentive_task_event");
    public final String LIZLLL = "refresh_time";
    public long LJ = -1;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(461));
    public EnumC1899140zWK LJII = EnumC1899140zWK.INITIAL;
    public final ARunnableS128S0100000_28 LJIIIZ = new ARunnableS128S0100000_28(this, 64);

    @Override // X.InterfaceC1898130zUh
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1898130zUh
    public final void LIZJ() {
        this.LIZ.LJI();
    }

    @Override // X.InterfaceC1898130zUh
    public final boolean LJFF() {
        EnumC1899140zWK enumC1899140zWK = this.LJII;
        return enumC1899140zWK == EnumC1899140zWK.FINISHED || enumC1899140zWK == EnumC1899140zWK.STOP;
    }

    @Override // X.InterfaceC1898130zUh
    public final boolean LJI() {
        return this.LJII == EnumC1899140zWK.FINISHED;
    }

    @Override // X.InterfaceC1898130zUh
    public final boolean LJII() {
        return this.LJII == EnumC1899140zWK.FINISHED;
    }

    @Override // X.InterfaceC1898130zUh
    public final Integer LJIIIIZZ() {
        TimeInfo timeInfo;
        DisplayInfo displayInfo = this.LIZIZ.displayInfo;
        if (displayInfo == null || (timeInfo = displayInfo.timeInfo) == null) {
            return null;
        }
        return timeInfo.timerLaunchPlayId;
    }

    @Override // X.InterfaceC1898130zUh
    public final void LJIIIZ() {
        C01U6.LIZIZ(new AwS572S0100000_28(this, 666));
    }

    public final boolean LJIILL() {
        this.LJIIIIZZ = this.LJ == this.LIZJ.getLong(C1894310zOX.LIZ(LJIIL(this.LIZIZ)), 0L);
        this.LIZIZ.getClass();
        return this.LJIIIIZZ;
    }

    public final void LJIJ() {
        if (this.LIZ.LJIIIZ()) {
            this.LIZ.LJ();
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                abstractC1896090zRP.LJII();
            }
        }
    }

    @Override // X.InterfaceC1898130zUh
    public final String getTaskEventKey() {
        String str = this.LIZIZ.taskEventKey;
        return str == null ? "" : str;
    }

    public final void LJIIZILJ() {
        int iLIZIZ = C1899200zWQ.LIZIZ();
        long j = this.LJ;
        long j2 = j - ((long) iLIZIZ);
        if (j2 < 0 || j <= 0) {
            return;
        }
        C786410Ut5.LJLIIL(j2 * 1000, this.LJFF, this.LJIIIZ);
    }

    @Override // X.InterfaceC1898130zUh
    public final void onAppForeground() {
        if (this.LJ >= C1899200zWQ.LIZIZ()) {
            this.LJFF.removeCallbacks(this.LJIIIZ);
            LJIIZILJ();
            return;
        }
        LJIJ();
        this.LIZ.LJIIJ();
        this.LJ = -1L;
        StartCondition startCondition = this.LIZIZ.startCondition;
        if (Intrinsics.LJFF(startCondition != null ? startCondition.startMode : null, "auto") || this.LJII == EnumC1899140zWK.START) {
            LJ(false, false);
        }
    }

    @Override // X.InterfaceC1898130zUh
    public final boolean LJIIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1898130zUh
    public final void LIZLLL(InterfaceC1898470zVF<TaskEvent> interfaceC1898470zVF) {
        this.LIZ.LJIILIIL(interfaceC1898470zVF);
    }

    public final String LJIIL(TaskEvent taskEvent) {
        String str = taskEvent.taskEventKey;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = taskEvent.userActionType;
        if (str3 != null) {
            str2 = str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIILIIL(C1898920zVy c1898920zVy) {
        Status status;
        Long l;
        TaskEventResponse taskEventResponse = c1898920zVy.LIZIZ;
        if (taskEventResponse != null && (status = taskEventResponse.status) != null && (l = status.refreshTimeStamp) != null) {
            if (l.longValue() < C1899200zWQ.LIZIZ()) {
                LJIJ();
                this.LIZ.LJIIJ();
                this.LJ = -1L;
                LJ(false, false);
                return;
            }
            this.LJ = l.longValue();
            this.LIZJ.storeLong(C1894310zOX.LIZ(LJIIL(this.LIZIZ)), this.LJ);
            this.LJFF.removeCallbacks(this.LJIIIZ);
            LJIIZILJ();
        }
    }

    public final void LJIILJJIL(C1898920zVy c1898920zVy) {
        String str;
        ReportInstruction reportInstruction;
        Integer num;
        ReportInstruction reportInstruction2;
        TaskEventResponse taskEventResponse = c1898920zVy.LIZIZ;
        if (taskEventResponse == null) {
            this.LJII = EnumC1899140zWK.START;
            this.LIZ.LLILLJJLI = true;
            return;
        }
        Status status = taskEventResponse.status;
        if (status != null && (str = status.status) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1422950650) {
                if (iHashCode != -673660814) {
                    if (iHashCode != 24665195 || !str.equals("inactive")) {
                        return;
                    }
                    LJIIIZ();
                    return;
                }
                if (!str.equals("finished")) {
                    return;
                }
                this.LJII = EnumC1899140zWK.FINISHED;
                AbstractC1899090zWF abstractC1899090zWF = this.LIZ;
                abstractC1899090zWF.LLILLJJLI = false;
                abstractC1899090zWF.LJIILJJIL();
                this.LIZJ.storeLong(C1894310zOX.LIZ(LJIIL(this.LIZIZ)), -1L);
                return;
            }
            if (!str.equals("active")) {
                return;
            }
            TaskEventResponse taskEventResponse2 = c1898920zVy.LIZIZ;
            if (taskEventResponse2 != null && (reportInstruction = taskEventResponse2.reportInstruction) != null && (num = reportInstruction.reportBatch) != null && (reportInstruction2 = this.LIZIZ.reportInstruction) != null) {
                reportInstruction2.reportBatch = num;
            }
            this.LJII = EnumC1899140zWK.START;
            this.LIZ.LLILLJJLI = true;
            return;
        }
        this.LJII = EnumC1899140zWK.START;
        this.LIZ.LLILLJJLI = true;
    }

    public final void LJIILLIIL(C1898920zVy c1898920zVy) {
        String str;
        String str2;
        String str3;
        Object objValueOf;
        String str4;
        String str5 = c1898920zVy.LIZ;
        TaskEventResponse taskEventResponse = c1898920zVy.LIZIZ;
        if (taskEventResponse != null) {
            str = taskEventResponse.statusMsg;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str5, str)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = c1898920zVy.LIZ;
        }
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        TaskEvent taskEvent = this.LIZIZ;
        TaskEventResponse taskEventResponse2 = c1898920zVy.LIZIZ;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_id", taskEvent.id);
            String str6 = taskEvent.taskEventKey;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("event_key", str6);
            jSONObject.put("event_type", taskEvent.userActionType);
            jSONObject.put("event_name", taskEvent.taskEventName);
            Status status = taskEvent.status;
            if (status == null || (str3 = status.status) == null) {
                str3 = "";
            }
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
            if (taskEventResponse2 == null) {
                objValueOf = "";
            } else {
                objValueOf = Integer.valueOf(taskEventResponse2.statusCode);
            }
            jSONObject.put("status_code", objValueOf);
            jSONObject.put("error_code", str2);
            if (taskEventResponse2 != null && (str4 = taskEventResponse2.statusMsg) != null) {
                str7 = str4;
            }
            jSONObject.put("result", str7);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("campaign_task_event_response_monitor", jSONObject);
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent2 = this.LIZIZ;
        TaskEventResponse taskEventResponse3 = c1898920zVy.LIZIZ;
        c1894320zOY.getClass();
        C01U6.LIZJ(new AwS143S1200000_28(taskEvent2, taskEventResponse3, str2, 10));
    }

    public C1899080zWE(AbstractC1899090zWF abstractC1899090zWF, TaskEvent taskEvent) {
        this.LIZ = abstractC1899090zWF;
        this.LIZIZ = taskEvent;
        C01U6.LIZIZ(new AwS572S0100000_28(this, 664));
    }

    @Override // X.InterfaceC1898130zUh
    public final void LIZIZ(String str, String str2) {
        this.LIZ.LJIIL(str, str2);
    }

    @Override // X.InterfaceC1898130zUh
    public final void LJ(boolean z, boolean z2) {
        C01U6.LIZIZ(new AwS18S0120000_28(this, z2, z, 0));
    }

    @Override // X.InterfaceC1898130zUh
    public final void LJIIJJI(TaskEventContent taskEventContent, boolean z, Function1<? super C1898920zVy, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(137678);
        C01U6.LIZIZ(new AwS272S0300000_28(this, z, taskEventContent, function1, 7));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
