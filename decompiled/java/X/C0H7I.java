package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0H7I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7I {
    public final /* synthetic */ InterfaceC20236714Gf<C443120HZe<String, ? extends C0H7H, Boolean>> LIZ;

    public C0H7I(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    public final void LIZ(String str, C0H7H c0h7h, boolean z) {
        if (str != null && (!a0.LJJJIL(str))) {
            InterfaceC20236714Gf<C443120HZe<String, ? extends C0H7H, Boolean>> interfaceC20236714Gf = this.LIZ;
            C443120HZe c443120HZe = new C443120HZe(str, c0h7h, Boolean.valueOf(z));
            C189200o6.m2constructorimpl(c443120HZe);
            interfaceC20236714Gf.resumeWith(c443120HZe);
            return;
        }
        InterfaceC20236714Gf<C443120HZe<String, ? extends C0H7H, Boolean>> interfaceC20236714Gf2 = this.LIZ;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf2.resumeWith(null);
    }
}
