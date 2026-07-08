package X;

/* JADX INFO: renamed from: X.0Syo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739000Syo implements InterfaceC1292040jj8 {
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
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
            case 5:
                onResult$5(this, obj);
                break;
        }
    }

    public C739000Syo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C739000Syo c739000Syo, Object obj) {
        ((C731860SnI) c739000Syo.l0).cancelAnimation();
        ((C731860SnI) c739000Syo.l0).setComposition((C1294720jnS) obj);
        C731860SnI c731860SnI = (C731860SnI) c739000Syo.l0;
        if (c731860SnI.LLILLL == null) {
            c731860SnI.LLILLL = new C731870SnJ(c731860SnI);
        }
        c731860SnI.removeAnimatorListener(c731860SnI.LLILLL);
        C731860SnI c731860SnI2 = (C731860SnI) c739000Syo.l0;
        c731860SnI2.addAnimatorListener(c731860SnI2.LLILLL);
        ((C731860SnI) c739000Syo.l0).playAnimation();
    }

    public static final void onResult$1(C739000Syo c739000Syo, Object obj) {
        ((C731860SnI) c739000Syo.l0).cancelAnimation();
        ((C731860SnI) c739000Syo.l0).setComposition((C1294720jnS) obj);
        C731860SnI c731860SnI = (C731860SnI) c739000Syo.l0;
        if (c731860SnI.LLILZ == null) {
            c731860SnI.LLILZ = new C731870SnJ(c731860SnI);
        }
        c731860SnI.removeAnimatorListener(c731860SnI.LLILZ);
        C731860SnI c731860SnI2 = (C731860SnI) c739000Syo.l0;
        c731860SnI2.addAnimatorListener(c731860SnI2.LLILZ);
        ((C731860SnI) c739000Syo.l0).playAnimation();
    }

    public static final void onResult$2(C739000Syo c739000Syo, Object obj) {
        ((C731980SnU) c739000Syo.l0).cancelAnimation();
        ((C731980SnU) c739000Syo.l0).setComposition((C1294720jnS) obj);
        C731980SnU c731980SnU = (C731980SnU) c739000Syo.l0;
        if (c731980SnU.LL == null) {
            c731980SnU.LL = new C731990SnV(c731980SnU);
        }
        c731980SnU.removeAnimatorListener(c731980SnU.LL);
        C731980SnU c731980SnU2 = (C731980SnU) c739000Syo.l0;
        c731980SnU2.addAnimatorListener(c731980SnU2.LL);
        ((C731980SnU) c739000Syo.l0).playAnimation();
    }

    public static final void onResult$3(C739000Syo c739000Syo, Object obj) {
        ((C731980SnU) c739000Syo.l0).cancelAnimation();
        ((C731980SnU) c739000Syo.l0).setComposition((C1294720jnS) obj);
        C731980SnU c731980SnU = (C731980SnU) c739000Syo.l0;
        if (c731980SnU.LLILLJJLI == null) {
            c731980SnU.LLILLJJLI = new C731990SnV(c731980SnU);
        }
        c731980SnU.removeAnimatorListener(c731980SnU.LLILLJJLI);
        C731980SnU c731980SnU2 = (C731980SnU) c739000Syo.l0;
        c731980SnU2.addAnimatorListener(c731980SnU2.LLILLJJLI);
        ((C731980SnU) c739000Syo.l0).playAnimation();
    }

    public static final void onResult$4(C739000Syo c739000Syo, Object obj) {
        C731940SnQ c731940SnQ = (C731940SnQ) c739000Syo.l0;
        String str = C731940SnQ.LLIZ;
        c731940SnQ.cancelAnimation();
        c731940SnQ.setComposition((C1294720jnS) obj);
        if (c731940SnQ.LLILLJJLI == null) {
            c731940SnQ.LLILLJJLI = new C731950SnR(c731940SnQ);
        }
        c731940SnQ.removeAnimatorListener(c731940SnQ.LLILLJJLI);
        c731940SnQ.addAnimatorListener(c731940SnQ.LLILLJJLI);
        c731940SnQ.playAnimation();
    }

    public static final void onResult$5(C739000Syo c739000Syo, Object obj) {
        C731940SnQ c731940SnQ = (C731940SnQ) c739000Syo.l0;
        String str = C731940SnQ.LLIZ;
        c731940SnQ.cancelAnimation();
        c731940SnQ.setComposition((C1294720jnS) obj);
        if (c731940SnQ.LL == null) {
            c731940SnQ.LL = new C731950SnR(c731940SnQ);
        }
        c731940SnQ.removeAnimatorListener(c731940SnQ.LL);
        c731940SnQ.addAnimatorListener(c731940SnQ.LL);
        c731940SnQ.playAnimation();
    }
}
