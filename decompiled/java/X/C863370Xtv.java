package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Xtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863370Xtv {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C863360Xtu());

    public static final InterfaceC1439500nYy LIZ(String str) {
        C01GW c01gw = LIZ;
        InterfaceC1439500nYy interfaceC1439500nYy = (InterfaceC1439500nYy) ((Map) c01gw.getValue()).get(str);
        if (interfaceC1439500nYy == null) {
            C20337314hv c20337314hv = new C20337314hv(str);
            ((Map) c01gw.getValue()).put(str, c20337314hv);
            return c20337314hv;
        }
        return interfaceC1439500nYy;
    }
}
