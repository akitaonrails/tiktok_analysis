package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.api.model.AntiCheatContent;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.StartEventConfig;
import com.bytedance.touchpoint.api.model.Status;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.TaskEventResponse;
import com.bytedance.touchpoint.api.model.UserActionContent;
import com.bytedance.touchpoint.api.model.WatchVideoTimeContent;
import com.bytedance.touchpoint.api.model.WatchedVideo;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898820zVo extends AbstractC1899280zWY implements InterfaceC1899330zWd {
    public int LLIZ;
    public final C1899050zWB LLIZLLLIL;
    public final Map<String, Integer> LLJ;
    public final Map<String, Integer> LLJI;
    public final Map<String, C1896810zSZ> LLJIJIL;
    public String LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public JSONObject LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public TaskEventResponse LLJJJJJIL;
    public final List<Bubble> LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;

    @Override // X.InterfaceC1899330zWd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
        this.LLIZ = 0;
        this.LL.LIZJ = 0;
        this.LLJILJILJ = 0;
        ((LinkedHashMap) this.LLJ).clear();
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZIZ(this.LL);
        this.LLJJ = 0;
        this.LLJJJIL = false;
        this.LLJJJJ = "";
        ((LinkedHashMap) this.LLJI).clear();
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
        WatchVideoTimeContent watchVideoTimeContent;
        List<WatchedVideo> list;
        Keva keva = C1898830zVp.LIZ;
        TaskEventContent taskEventContentLIZJ = C1898830zVp.LIZJ(this.LL);
        if (taskEventContentLIZJ == null || (watchVideoTimeContent = taskEventContentLIZJ.userActionContent.watchVideoTimeContent) == null || (list = watchVideoTimeContent.videos) == null || list.isEmpty()) {
            return;
        }
        for (WatchedVideo watchedVideo : list) {
            int i = this.LLIZ;
            int i2 = watchedVideo.duration;
            this.LLIZ = i + i2;
            this.LLJ.put(watchedVideo.itemId, Integer.valueOf(i2));
        }
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
        this.LLIZLLLIL.LIZ(this);
        C1898890zVv.LIZIZ = ((Keva) C1898890zVv.LIZ.getValue()).getLong(C1894310zOX.LIZ("auto_play_task_time"), 0L);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJII() {
        this.LL.LIZJ = Integer.valueOf(this.LLIZ);
    }

    @Override // X.InterfaceC1899330zWd
    public final void LJIIIIZZ() {
        StartEventConfig startEventConfig;
        Integer num;
        Integer num2;
        String strLJIJI;
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager;
        String str;
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager2;
        Integer num3;
        StartEventConfig startEventConfig2;
        Integer num4;
        Integer num5;
        Integer num6;
        if (this.LLILLJJLI) {
            if (this.LLJJIJI) {
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                double dLJJIII = abstractC1896090zRP != null ? abstractC1896090zRP.LJJIII() : 0.0d;
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                boolean zLJJIIZ = abstractC1896090zRP2 != null ? abstractC1896090zRP2.LJJIIZ() : false;
                if (dLJJIII == 0.0d && zLJJIIZ) {
                    return;
                }
                this.LLJJIJI = false;
                BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager3 = this.LLILZLL;
                if (baseTaskEventTimerPendantManager3 != null) {
                    baseTaskEventTimerPendantManager3.LLJIJIL = null;
                    C1898700zVc c1898700zVc = baseTaskEventTimerPendantManager3.LLIZ;
                    if (c1898700zVc != null) {
                        c1898700zVc.LJIJ(true);
                    }
                }
            }
            if (this.LLJJIJIIJIL || this.LLJJIJIL) {
                return;
            }
            C1896810zSZ c1896810zSZ = (C1896810zSZ) ((LinkedHashMap) this.LLJIJIL).get(this.LLJILJIL);
            if (c1896810zSZ != null) {
                c1896810zSZ.LJIIIZ = ((long) this.LLJJ) * 1000;
                List<AbstractC1898880zVu> list = this.LLILZIL;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (obj instanceof C1899230zWT) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!((AbstractC1898880zVu) it2.next()).LIZ(c1896810zSZ)) {
                            if (this.LLJJJIL && Intrinsics.LJFF(this.LLJJJJ, this.LLJILJIL)) {
                                return;
                            }
                            this.LLJJJIL = true;
                            this.LLJJJJ = this.LLJILJIL;
                            BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager4 = this.LLILZLL;
                            if (baseTaskEventTimerPendantManager4 != null) {
                                String str2 = this.LL.taskEventKey;
                                baseTaskEventTimerPendantManager4.LIZLLL(24, str2 != null ? str2 : "", "", null, true, false, null);
                                return;
                            }
                            return;
                        }
                    }
                }
                List<AbstractC1898880zVu> list2 = this.LLILZIL;
                if (list2 != null && !((ArrayList) list2).isEmpty()) {
                    for (AbstractC1898880zVu abstractC1898880zVu : (ArrayList) list2) {
                        if (Intrinsics.LJFF(abstractC1898880zVu.LIZLLL(), "tick") && !abstractC1898880zVu.LIZ(c1896810zSZ)) {
                            return;
                        }
                    }
                }
            }
            int i = this.LLIZ + 1;
            this.LLIZ = i;
            this.LL.LIZJ = Integer.valueOf(i);
            int i2 = this.LLJILJILJ + 1;
            this.LLJILJILJ = i2;
            this.LLJ.put(this.LLJILJIL, Integer.valueOf(i2));
            int i3 = this.LLJJ + 1;
            this.LLJJ = i3;
            this.LLJI.put(this.LLJILJIL, Integer.valueOf(i3));
            BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager5 = this.LLILZLL;
            int iIntValue = 20;
            if (baseTaskEventTimerPendantManager5 != null) {
                int i4 = this.LLIZ;
                ReportInstruction reportInstruction = this.LL.reportInstruction;
                baseTaskEventTimerPendantManager5.LJJLIIIIJ(i4, (reportInstruction == null || (num6 = reportInstruction.reportBatch) == null) ? 20 : num6.intValue());
            }
            int i5 = this.LLIZ;
            ReportInstruction reportInstruction2 = this.LL.reportInstruction;
            int iIntValue2 = (reportInstruction2 == null || (num5 = reportInstruction2.reportBatch) == null) ? 20 : num5.intValue();
            DisplayInfo displayInfo = this.LL.displayInfo;
            int iIntValue3 = (displayInfo == null || (startEventConfig2 = displayInfo.startEventConfig) == null || (num4 = startEventConfig2.showBubbleType) == null) ? 0 : num4.intValue();
            if (!this.LLJJJ && i5 <= iIntValue2 && iIntValue3 == 13) {
                C1897020zSu c1897020zSu = C1897020zSu.LIZ;
                String str3 = this.LL.taskEventKey;
                if (str3 == null) {
                    str3 = "";
                }
                if (C1897020zSu.LIZ(13, str3, null) != null) {
                    ReportInstruction reportInstruction3 = this.LL.reportInstruction;
                    int iIntValue4 = ((reportInstruction3 == null || (num3 = reportInstruction3.reportBatch) == null) ? 20 : num3.intValue()) - this.LLIZ;
                    if (iIntValue4 >= 0 && (str = new SimpleDateFormat("mm:ss", Locale.US).format(Integer.valueOf(iIntValue4 * LSPassThroughRecordSizeConfig.DEFAULT))) != null && (baseTaskEventTimerPendantManager2 = this.LLILZLL) != null) {
                        String str4 = this.LL.taskEventKey;
                        if (str4 == null) {
                            str4 = "";
                        }
                        baseTaskEventTimerPendantManager2.LIZLLL(13, str4, str, null, true, false, null);
                    }
                }
            }
            TaskEventResponse taskEventResponse = this.LLJJJJJIL;
            if (taskEventResponse != null && (strLJIJI = LJIJI(taskEventResponse)) != null && (baseTaskEventTimerPendantManager = this.LLILZLL) != null) {
                String str5 = this.LL.taskEventKey;
                baseTaskEventTimerPendantManager.LIZLLL(13, str5 != null ? str5 : "", strLJIJI, null, true, false, null);
            }
            int i6 = this.LLIZ;
            ReportInstruction reportInstruction4 = this.LL.reportInstruction;
            if (reportInstruction4 != null && (num2 = reportInstruction4.reportBatch) != null) {
                iIntValue = num2.intValue();
            }
            if (i6 >= iIntValue) {
                TaskEventContent taskEventContentLJIJ = LJIJ();
                this.LLIZ = 0;
                this.LL.LIZJ = 0;
                this.LLJILJILJ = 0;
                ((LinkedHashMap) this.LLJ).clear();
                Keva keva = C1898830zVp.LIZ;
                C1898830zVp.LIZIZ(this.LL);
                BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager6 = this.LLILZLL;
                if (baseTaskEventTimerPendantManager6 != null) {
                    DisplayInfo displayInfo2 = this.LL.displayInfo;
                    int iIntValue5 = (displayInfo2 == null || (startEventConfig = displayInfo2.startEventConfig) == null || (num = startEventConfig.showBubbleType) == null) ? 0 : num.intValue();
                    Bubble bubble = baseTaskEventTimerPendantManager6.LLJIJIL;
                    if (bubble != null && iIntValue5 == bubble.bubbleType) {
                        baseTaskEventTimerPendantManager6.LLJIJIL = null;
                        C1898700zVc c1898700zVc2 = baseTaskEventTimerPendantManager6.LLIZ;
                        if (c1898700zVc2 != null) {
                            c1898700zVc2.LJIJ(true);
                        }
                    }
                }
                this.LLJJJ = true;
                this.LLJJJJJIL = null;
                if (taskEventContentLJIJ != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1703090uQ7(this, taskEventContentLJIJ, null), 3);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("timed_task_time_up", linkedHashMap);
                }
            }
        }
    }

    @Override // X.AbstractC1899090zWF
    public final boolean LJIIIZ() {
        Boolean bool;
        ProgressInfo progressInfo = this.LL.progressInfo;
        return !((progressInfo == null || (bool = progressInfo.retainNewDay) == null) ? false : bool.booleanValue());
    }

    @Override // X.AbstractC1899090zWF
    public final void LJIIJJI() {
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILZLL;
        if (baseTaskEventTimerPendantManager != null) {
            baseTaskEventTimerPendantManager.LJJLIIIJILLIZJL();
        }
        C1898890zVv.LIZIZ = 0L;
        ((Keva) C1898890zVv.LIZ.getValue()).clear();
    }

    @Override // X.AbstractC1899090zWF
    public final void LJIILJJIL() {
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILZLL;
        if (baseTaskEventTimerPendantManager != null) {
            baseTaskEventTimerPendantManager.LJJLJ();
        }
    }

    @Override // X.AbstractC1899280zWY
    public final String LJIILL() {
        Status status = this.LL.status;
        return (Intrinsics.LJFF(status != null ? status.status : null, "finished") || this.LLJILLL) ? "complete" : "timing";
    }

    @Override // X.AbstractC1899280zWY
    public final void LJIIZILJ() {
        this.LLIZLLLIL.LIZLLL();
    }

    public final TaskEventContent LJIJ() {
        int i;
        boolean z;
        Object obj;
        Object obj2;
        String string;
        AntiCheatContent antiCheatContent;
        Object c098200Yq;
        C1896810zSZ c1896810zSZ;
        if (!(!this.LLJ.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LLJ).entrySet()) {
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (str != null && num != null && str.length() != 0 && ((LinkedHashMap) this.LLJIJIL).get(str) != null && (c1896810zSZ = (C1896810zSZ) ((LinkedHashMap) this.LLJIJIL).get(str)) != null) {
                arrayList.add(new WatchedVideo(str, num.intValue(), (int) c1896810zSZ.LJII, c1896810zSZ.LIZ, c1896810zSZ.LIZJ, c1896810zSZ.LIZIZ, System.currentTimeMillis()));
            }
        }
        WatchVideoTimeContent watchVideoTimeContent = new WatchVideoTimeContent(arrayList);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("mt_anti_cheating_debug", false)) {
            try {
                c098200Yq = (AntiCheatContent) C20484080s.LIZ((String) C288290BRr.LIZ.getValue(), AntiCheatContent.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            antiCheatContent = (AntiCheatContent) c098200Yq;
            if (antiCheatContent == null) {
                antiCheatContent = new AntiCheatContent(false, 0, false, false, false, false, 0L);
            }
        } else {
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            Double dValueOf = abstractC1896090zRP != null ? Double.valueOf(abstractC1896090zRP.LJJIII()) : null;
            AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            boolean zLJJIIZ = abstractC1896090zRP2 != null ? abstractC1896090zRP2.LJJIIZ() : false;
            boolean zLIZIZ = Intrinsics.LIZIZ(dValueOf, 0.0d);
            if (((Boolean) C0A4N.LIZ.getValue()).booleanValue() || C288280BRq.LIZ()) {
                JSONObject jSONObject = this.LLJJIII;
                i = (jSONObject == null || (obj2 = jSONObject.get("risk_type")) == null || (string = obj2.toString()) == null) ? 0 : CastIntegerProtector.parseInt(string);
                JSONObject jSONObject2 = this.LLJJIII;
                String string2 = (jSONObject2 == null || (obj = jSONObject2.get("reason")) == null) ? null : obj.toString();
                z = (i <= 0 || string2 == null || string2.length() == 0) ? false : true;
            } else {
                z = false;
                i = 0;
            }
            antiCheatContent = new AntiCheatContent(z, i, zLIZIZ, zLJJIIZ, false, false, C1898890zVv.LIZIZ);
        }
        return C1898850zVr.LIZ(this.LL, "watch_video_time", new UserActionContent(null, watchVideoTimeContent, null, null, null, null, null, antiCheatContent, null), null);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        TaskEventContent taskEventContentLJIJ = LJIJ();
        if (taskEventContentLJIJ != null) {
            Keva keva = C1898830zVp.LIZ;
            C1898830zVp.LIZLLL(this.LL, taskEventContentLJIJ);
        } else {
            Keva keva2 = C1898830zVp.LIZ;
            C1898830zVp.LIZIZ(this.LL);
        }
        ((Keva) C1898890zVv.LIZ.getValue()).storeLong(C1894310zOX.LIZ("auto_play_task_time"), C1898890zVv.LIZIZ);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        LJIIZILJ();
        this.LLIZLLLIL.LIZIZ();
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJL = null;
        ((ArrayList) this.LLJJJJLIIL).clear();
    }

    public C1898820zVo(TaskEvent taskEvent) {
        super(taskEvent);
        this.LLIZLLLIL = new C1899050zWB();
        this.LLJ = new LinkedHashMap();
        this.LLJI = new LinkedHashMap();
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = "";
        this.LLJJJJ = "";
        this.LLJJJJLIIL = new ArrayList();
    }

    @Override // X.AbstractC1899090zWF
    public final void LJIILIIL(InterfaceC1898470zVF<TaskEvent> interfaceC1898470zVF) {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJFF();
        }
        super.LJIILIIL(interfaceC1898470zVF);
    }

    @Override // X.AbstractC1899280zWY
    public final void LJIILLIIL(C1896810zSZ c1896810zSZ) {
        String str;
        int iIntValue;
        int iIntValue2;
        String strLIZIZ;
        if (!C1898870zVt.LIZ(c1896810zSZ, this.LLILZ)) {
            LJIIZILJ();
            return;
        }
        String str2 = c1896810zSZ.LJIIJ;
        String str3 = "";
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        this.LLJILJIL = str;
        Integer num = (Integer) ((LinkedHashMap) this.LLJ).get(str2);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJILJILJ = iIntValue;
        Integer num2 = (Integer) ((LinkedHashMap) this.LLJI).get(c1896810zSZ.LJIIJ);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLJJ = iIntValue2;
        String str4 = c1896810zSZ.LJIIJ;
        if (str4 != null) {
            this.LLJIJIL.put(str4, c1896810zSZ);
        }
        this.LLIZLLLIL.LIZJ();
        if ((((Boolean) C0A4N.LIZ.getValue()).booleanValue() || C288280BRq.LIZ()) && !this.LLJJI) {
            this.LLJJI = true;
            List<AbstractC1898880zVu> list = this.LLILZIL;
            if (list == null || ((ArrayList) list).isEmpty()) {
                strLIZIZ = "";
            } else {
                for (AbstractC1898880zVu abstractC1898880zVu : (ArrayList) list) {
                    if (Intrinsics.LJFF(abstractC1898880zVu.LIZJ(), "cheat_block_valid")) {
                        strLIZIZ = abstractC1898880zVu.LIZIZ();
                        break;
                    }
                }
                strLIZIZ = "";
            }
            C1896510zS5 c1896510zS5 = (C1896510zS5) C1619720sFe.LIZ.LIZ(11);
            if (c1896510zS5 != null) {
                String str5 = this.LL.taskEventKey;
                if (str5 != null) {
                    str3 = str5;
                }
                c1896510zS5.LIZIZ(str3, strLIZIZ, new AwS607S0100000_28(this, 31));
            }
        }
    }

    public final String LJIJI(TaskEventResponse taskEventResponse) {
        int iIntValue;
        Integer num;
        ReportInstruction reportInstruction = taskEventResponse.reportInstruction;
        if (reportInstruction != null && (num = reportInstruction.reportBatch) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 20;
        }
        int i = iIntValue - this.LLIZ;
        if (i < 0) {
            return null;
        }
        return new SimpleDateFormat("mm:ss", Locale.US).format(Integer.valueOf(i * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
        String str;
        TaskEventResponse taskEventResponse;
        Status status;
        List<WatchedVideo> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WatchVideoTimeContent watchVideoTimeContent = taskEventContent.userActionContent.watchVideoTimeContent;
        if (watchVideoTimeContent != null && (list = watchVideoTimeContent.videos) != null) {
            for (WatchedVideo watchedVideo : list) {
                String str2 = watchedVideo.pageType;
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null && str3.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append(',');
                    sbLIZ.append(watchedVideo.itemId);
                    linkedHashMap.put(str2, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    linkedHashMap.put(str2, watchedVideo.itemId);
                }
            }
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LL;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("group_ids", C20484080s.LIZJ(linkedHashMap));
        if (c1898920zVy == null || (taskEventResponse = c1898920zVy.LIZIZ) == null || (status = taskEventResponse.status) == null || (str = status.status) == null) {
            str = "";
        }
        linkedHashMap2.put("task_status", str);
        c1894320zOY.getClass();
        C1894320zOY.LJIIIZ(taskEvent, linkedHashMap2);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJIIL(String str, String str2) {
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILZLL;
        if (baseTaskEventTimerPendantManager != null) {
            baseTaskEventTimerPendantManager.LJJJZ();
        }
    }
}
