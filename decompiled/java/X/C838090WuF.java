package X;

import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.0WuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838090WuF {
    public static void LIZ(Cert cert, String[] strArr, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        C825940Wae c825940Wae = new C825940Wae(cert, C2188811AlT.LIZIZ(sbLIZ), strArr, Integer.valueOf(EnumC746240TPa.DIRECT_AUTH.getType()), "Collect");
        c825940Wae.LIZ(str, "sdkName");
        c825940Wae.LIZ(str2, "methodName");
        InterfaceC838120WuI interfaceC838120WuI = C838100WuG.LIZ;
        InterfaceC838160WuM interfaceC838160WuM = C837980Wu4.LIZ;
        if (interfaceC838160WuM != null) {
            interfaceC838160WuM.LIZ(c825940Wae);
        }
        InterfaceC838120WuI interfaceC838120WuI2 = C838100WuG.LIZ;
        if (interfaceC838120WuI2 != null) {
            interfaceC838120WuI2.check(c825940Wae, null);
        }
    }
}
