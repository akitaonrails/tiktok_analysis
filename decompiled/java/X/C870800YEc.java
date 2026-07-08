package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.RefreshAllMessageEntity;
import com.bytedance.im.core.proto.status_message.RefreshAllMessageValue;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870800YEc implements C0YEZ {
    public final C868780Y6i LIZ;
    public final Function0<InterfaceC869500Y9c> LIZIZ;
    public final Function0<InterfaceC870750YDx> LIZJ;
    public final Function0<C869650Y9r> LIZLLL;
    public final Function0<C0YJ9> LJ;
    public final Function0<InterfaceC864790XwD> LJFF;
    public final Function0<C870830YEf> LJI;
    public final Function1<C870830YEf, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Long> LJIIIZ;

    @Override // X.C0YEZ
    public final boolean LIZJ() {
        boolean z;
        long jLJJLI = this.LIZIZ.invoke().LJJLI();
        long jLJJI = this.LIZIZ.invoke().LJJI();
        int iLJJLIIIJ = this.LIZIZ.invoke().LJJLIIIJ();
        String strLJIIZILJ = this.LIZIZ.invoke().LJIIZILJ();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C868780Y6i c868780Y6i = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMDataResetManagercheckReset start, version:");
        sbLIZ.append(jLJJLI);
        sbLIZ.append(", lastVersion:");
        sbLIZ.append(jLJJI);
        C868780Y6i.LJIILIIL(c868780Y6i, C2188811AlT.LIZIZ(sbLIZ));
        Boolean boolLIZIZ = this.LIZJ.invoke().LIZIZ().LIZIZ();
        boolean zLIZLLL = this.LIZLLL.invoke().LIZLLL(false);
        this.LIZIZ.invoke().clearAll();
        if (zLIZLLL && (boolLIZIZ == null || boolLIZIZ.booleanValue())) {
            z = true;
            this.LIZIZ.invoke().LJJIJ(jLJJLI);
            this.LIZIZ.invoke().LJIIIIZZ(0L);
            this.LIZIZ.invoke().LJJIIZI("");
            this.LIZIZ.invoke().LJIJ(0);
        } else {
            z = false;
        }
        LJI(this.LIZIZ.invoke().LJJJZ(), jLJJLI, jLJJI, 2, SystemClock.uptimeMillis() - jUptimeMillis, z ? EnumC870900YEm.LLILLJJLI : EnumC870900YEm.LLILLL, 0, "", iLJJLIIIJ, strLJIIZILJ);
        C868780Y6i c868780Y6i2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMDataResetManagercheckReset delete db is success: ");
        sbLIZ2.append(zLIZLLL);
        sbLIZ2.append(" and host app is success: ");
        sbLIZ2.append(boolLIZIZ);
        C868780Y6i.LJIILIIL(c868780Y6i2, C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public final void LJII() {
        if (LIZLLL(this.LJI.invoke())) {
            C868780Y6i.LJIILJJIL(this.LIZ, "IMDataResetManager", "resetImmediately, start", 4);
            C870830YEf c870830YEfInvoke = this.LJI.invoke();
            LIZJ();
            C871360YGg c871360YGg = this.LJFF.invoke().getDomain().LIZLLL;
            c871360YGg.getClass();
            c871360YGg.LJ(InterfaceC871310YGb.LJI, C0YF8.LJIIIZ);
            this.LJFF.invoke().LIZLLL().LIZLLL().clear();
            this.LJFF.invoke().LIZLLL().LJI().V4(true);
            this.LJIIIIZZ.invoke();
            this.LJII.invoke(c870830YEfInvoke);
        }
    }

    public C870800YEc(C0YEM c0yem) {
        this(c0yem.LIZLLL(), new C870930YEp(c0yem), new C871000YEw(c0yem), new C870940YEq(c0yem), new C870970YEt(c0yem), new C871010YEx(c0yem), new C870980YEu(c0yem), new C870950YEr(c0yem), new AwS558S0100000_14(c0yem, 29), new AwS558S0100000_14(c0yem, 28));
    }

    @Override // X.C0YEZ
    public final C0Y7K LIZIZ(MessageBody messageBody) {
        long jLongValue;
        int iOptInt;
        Long l = messageBody.server_message_id;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jLJJI = this.LIZIZ.invoke().LJJI();
        String strOptString = "";
        C868780Y6i.LJIILIIL(this.LIZ, "IMDataResetManagerrecordTargetVersionFromCmdMsg start");
        try {
            JSONObject jSONObject = new JSONObject(messageBody.content);
            long jOptLong = jSONObject.optLong("reset_version");
            long jOptLong2 = jSONObject.optLong("user_id");
            iOptInt = jSONObject.optInt("reset_type");
            try {
                strOptString = jSONObject.optString("reason");
                try {
                    return LJFF(jLongValue, jOptLong2, jOptLong, jUptimeMillis, iOptInt, strOptString);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6i = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resetAllData parsed failed for msg id ");
                    sbLIZ.append(messageBody.server_message_id);
                    c868780Y6i.LJIIIIZZ("IMDataResetManager", C2188811AlT.LIZIZ(sbLIZ), e);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    EnumC870900YEm enumC870900YEm = EnumC870900YEm.LLILLL;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown message";
                    }
                    LJI(jLongValue, -1L, jLJJI, 1, jUptimeMillis2, enumC870900YEm, -1029, message, iOptInt, strOptString);
                    return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            iOptInt = 0;
        }
    }

    @Override // X.C0YEZ
    public final boolean LIZLLL(C870830YEf c870830YEf) {
        if (!c870830YEf.LJJIIJ) {
            C868780Y6i.LJIILIIL(this.LIZ, "IMDataResetManagercheckReset reset disabled");
            return false;
        }
        long jLJJLI = this.LIZIZ.invoke().LJJLI();
        if (jLJJLI <= 0) {
            C868780Y6i c868780Y6i = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMDataResetManagercheckReset version invalid:");
            sbLIZ.append(jLJJLI);
            C868780Y6i.LJIILIIL(c868780Y6i, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        long jLJJI = this.LIZIZ.invoke().LJJI();
        if (jLJJI >= jLJJLI) {
            C868780Y6i c868780Y6i2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMDataResetManagercheckReset already recover, version:");
            sbLIZ2.append(jLJJLI);
            sbLIZ2.append(", lastVersion:");
            sbLIZ2.append(jLJJI);
            C868780Y6i.LJIILIIL(c868780Y6i2, C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        return true;
    }

    @Override // X.C0YEZ
    public final C0Y7K LJ(MessageBody messageBody, StatusMessage statusMessage) {
        long jLongValue;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            Long l = messageBody.server_message_id;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = RefreshAllMessageEntity.ADAPTER.decode(statusMessage.entity).user_id;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            Long l3 = statusMessage.version;
            RefreshAllMessageValue refreshAllMessageValueDecode = RefreshAllMessageValue.ADAPTER.decode(statusMessage.value);
            C0YGM c0ygm = refreshAllMessageValueDecode.reset_type;
            if (c0ygm == null) {
                c0ygm = C0YGM.ResetTypeColdStart;
            }
            String str = refreshAllMessageValueDecode.reason;
            if (str == null) {
                str = "";
            }
            return LJFF(jLongValue, jLongValue2, l3.longValue(), jUptimeMillis, c0ygm.getValue(), str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIIIIZZ("IMDataResetManager", "decode reset all data StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    @Override // X.C0YEZ
    public final C0Y7K LIZ(long j, long j2, C0YGM c0ygm) {
        return LJFF(0L, j, j2, SystemClock.uptimeMillis(), c0ygm.getValue(), "cold_storage_migrate");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7K LJFF(long r29, long r31, long r33, long r35, int r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C870800YEc.LJFF(long, long, long, long, int, java.lang.String):X.0Y7K");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C870800YEc(C868780Y6i c868780Y6i, Function0<? extends InterfaceC869500Y9c> function0, Function0<? extends InterfaceC870750YDx> function02, Function0<? extends C869650Y9r> function03, Function0<? extends C0YJ9> function04, Function0<? extends InterfaceC864790XwD> function05, Function0<C870830YEf> function06, Function1<? super C870830YEf, Unit> function1, Function0<Unit> function07, Function0<Long> function08) {
        this.LIZ = c868780Y6i;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
        this.LJFF = function05;
        this.LJI = function06;
        this.LJII = function1;
        this.LJIIIIZZ = function07;
        this.LJIIIZ = function08;
    }

    public final void LJI(long j, long j2, long j3, int i, long j4, EnumC870900YEm enumC870900YEm, int i2, String str, int i3, String str2) {
        C0YJ9 c0yj9Invoke = this.LJ.invoke();
        c0yj9Invoke.LIZJ("imsdk_reset_data");
        c0yj9Invoke.LIZ(Long.valueOf(j), "msg_id");
        c0yj9Invoke.LIZ(Long.valueOf(j2), "reset_version");
        c0yj9Invoke.LIZ(Long.valueOf(j3), "last_version");
        c0yj9Invoke.LIZ(Integer.valueOf(i), "action");
        c0yj9Invoke.LIZ(Long.valueOf(j4), "duration");
        c0yj9Invoke.LIZ(String.valueOf(enumC870900YEm.LL), "result");
        c0yj9Invoke.LIZ(Integer.valueOf(i2), "error_code");
        c0yj9Invoke.LIZ(str, "error_msg");
        c0yj9Invoke.LIZ(Integer.valueOf(i3), "reset_type");
        c0yj9Invoke.LIZ(str2, "reason");
        c0yj9Invoke.LJ(1.0f);
    }
}
