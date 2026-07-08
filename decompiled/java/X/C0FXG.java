package X;

/* JADX INFO: renamed from: X.0FXG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXG implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
        }
    }

    public C0FXG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C0FXG c0fxg, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1295960jpS lottieLoadingViewFromXml = ((C0EDF) c0fxg.l0).getLottieLoadingViewFromXml();
        if (lottieLoadingViewFromXml != null) {
            lottieLoadingViewFromXml.setComposition(c1294720jnS);
        }
        C1295960jpS lottieLoadingViewFromXml2 = ((C0EDF) c0fxg.l0).getLottieLoadingViewFromXml();
        if (lottieLoadingViewFromXml2 != null) {
            lottieLoadingViewFromXml2.playAnimation();
        }
    }

    public static final void onResult$1(C0FXG c0fxg, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1295960jpS lottieLoadingViewFromXml = ((AbstractC360710ECf) c0fxg.l0).getLottieLoadingViewFromXml();
        if (lottieLoadingViewFromXml != null) {
            lottieLoadingViewFromXml.setComposition(c1294720jnS);
        }
        C1295960jpS lottieLoadingViewFromXml2 = ((AbstractC360710ECf) c0fxg.l0).getLottieLoadingViewFromXml();
        if (lottieLoadingViewFromXml2 != null) {
            lottieLoadingViewFromXml2.playAnimation();
        }
    }

    public static final void onResult$2(C0FXG c0fxg, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1295960jpS c1295960jpS = ((C361110EDt) c0fxg.l0).LLIZLLLIL;
        if (c1295960jpS != null) {
            c1295960jpS.setComposition(c1294720jnS);
        }
        C1295960jpS c1295960jpS2 = ((C361110EDt) c0fxg.l0).LLIZLLLIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.playAnimation();
        }
    }
}
