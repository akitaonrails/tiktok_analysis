package X;

import com.ss.android.agilelogger.ALog;

/* JADX INFO: renamed from: X.0ruS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606580ruS {
    public static final void LIZ(InterfaceC214897198d interfaceC214897198d, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" [");
        sbLIZ.append(interfaceC214897198d);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFActivity", strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity");
        sbLIZ2.append(": ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LIZIZ(InterfaceC214902198i interfaceC214902198i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" <");
        sbLIZ.append(interfaceC214902198i);
        sbLIZ.append('>');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragment", strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragment");
        sbLIZ2.append(": ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
    }
}
