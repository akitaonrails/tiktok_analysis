package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.19eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21592019eo extends AbstractC2258741Day {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final C21592119ep LJI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(AbstractC21592019eo.class, "flowPlayback", "getFlowPlayback()Lkotlin/Pair;", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public void LJI() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, String> LJIJI() {
        C21592119ep c21592119ep = this.LJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJII;
        return (Pair) c21592119ep.LL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19ep] */
    public AbstractC21592019eo() {
        final Pair pair = new Pair("undefined", "undefined");
        this.LJI = new C0NTU<Pair<? extends String, ? extends String>>(pair) { // from class: X.19ep
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                this.LJI();
            }
        };
    }

    public final void LJIJJ(Pair<String, String> pair) {
        setValue(this, LJII[0], pair);
    }
}
