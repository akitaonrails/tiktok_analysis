package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IE1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE1 implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onResult$0(C0IE1 c0ie1, Object obj) {
        ((Function1) c0ie1.l0).invoke(obj);
    }

    @Override // X.InterfaceC1292040jj8
    public final /* synthetic */ void onResult(Object obj) {
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
            case 6:
                onResult$6(this, obj);
                break;
        }
    }

    public C0IE1(Function1 function1, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = function1;
        } else {
            this.l0 = function1;
        }
    }

    public static final void onResult$1(C0IE1 c0ie1, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS != null) {
            ((C1295960jpS) c0ie1.l0).setComposition(c1294720jnS);
        }
    }

    public static final void onResult$2(C0IE1 c0ie1, Object obj) {
        if (!((InterfaceC20236714Gf) c0ie1.l0).isCompleted()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0ie1.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static final void onResult$3(C0IE1 c0ie1, Object obj) {
        Throwable th = (Throwable) obj;
        if (!((InterfaceC20236714Gf) c0ie1.l0).isCompleted()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0ie1.l0;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
    }

    public static final void onResult$4(C0IE1 c0ie1, Object obj) {
        ((C1295960jpS) c0ie1.l0).setComposition((C1294720jnS) obj);
    }

    public static final void onResult$5(C0IE1 c0ie1, Object obj) {
        ((Function1) c0ie1.l0).invoke(obj);
        C990603u4.LIZJ = false;
    }

    public static final void onResult$6(C0IE1 c0ie1, Object obj) {
        ((Function0) c0ie1.l0).invoke();
        C990603u4.LIZJ = false;
    }

    public C0IE1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
