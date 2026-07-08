package X;

/* JADX INFO: renamed from: X.01zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517501zx implements InterfaceC254600ye {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
        }
    }

    public static final void onShow$0(C517501zx c517501zx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tpBubble show: key=");
        sbLIZ.append(((C254700yf) c517501zx.l0).LIZIZ);
        C20441214yg.LIZIZ("ToolbarBroadcastEffectBehavior", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onShow$1(C517501zx c517501zx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tpBubble show: key=");
        sbLIZ.append(((C254700yf) c517501zx.l0).LIZIZ);
        C20441214yg.LIZIZ("ToolbarGiftBehavior", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C517501zx(C254700yf c254700yf, int i) {
        this.$t = i;
        this.l0 = c254700yf;
    }
}
