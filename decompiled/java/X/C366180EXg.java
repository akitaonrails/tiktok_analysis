package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: renamed from: X.0EXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366180EXg {
    public static final /* synthetic */ int LIZ = 0;

    public static NLEModel LIZ(InterfaceC1446740nke interfaceC1446740nke) {
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1446740nke.gc();
        if (abstractC1452680nuEGc == null || abstractC1452680nuEGc.LJII == null) {
            return null;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
        if (!(interfaceC1452170ntPLJJ instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) == null) {
            return null;
        }
        return c1463670oBx.LIZJ();
    }

    public static String LIZIZ(InterfaceC1446740nke interfaceC1446740nke, NLEModel nLEModel) {
        String strLIZJ;
        NLEModel nLEModelLIZ = LIZ(interfaceC1446740nke);
        if (nLEModelLIZ != null && (strLIZJ = C375260EnU.LIZJ(nLEModelLIZ)) != null && strLIZJ.length() > 0) {
            return strLIZJ;
        }
        return C375260EnU.LIZJ(nLEModel);
    }

    public static void LIZJ(InterfaceC1446740nke interfaceC1446740nke, NLEModel nLEModel) {
        AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1446740nke.gc();
        if (abstractC1452680nuEGc != null) {
            if (C350300DoK.LIZ()) {
                abstractC1452680nuEGc.LJJI(NLEModel.dynamicCast(nLEModel.deepClone()), true);
            } else {
                abstractC1452680nuEGc.LJJIFFI(C375260EnU.LIZJ(nLEModel), true);
            }
        }
    }
}
