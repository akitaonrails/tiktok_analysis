package X;

import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0ywE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876760ywE {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(786));

    public static final void LIZIZ(AbstractC1549150qPp<?, ?> abstractC1549150qPp) {
        InterfaceC1519030pdF interfaceC1519030pdF = (InterfaceC1519030pdF) LIZ.getValue();
        if (interfaceC1519030pdF != null) {
            interfaceC1519030pdF.LIZJ("pns_jsb_kit_invoke", null, C2097908Jt.LIZJ(new Pair("method_name", abstractC1549150qPp.getName())), null);
        }
    }

    public static final void LIZ(AbstractC1549150qPp<?, ?> abstractC1549150qPp, int i, String str) {
        InterfaceC1519030pdF interfaceC1519030pdF = (InterfaceC1519030pdF) LIZ.getValue();
        if (interfaceC1519030pdF != null) {
            interfaceC1519030pdF.LIZJ("pns_jsb_kit_error", null, C2097608Jq.LJIIIIZZ(new Pair("method_name", abstractC1549150qPp.getName()), new Pair("error_code", String.valueOf(i)), new Pair("error_reason", str)), null);
        }
    }
}
