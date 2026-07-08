package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IE0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE0 implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onResult$0(C0IE0 c0ie0, Object obj) {
        ((C428230Gqj) c0ie0.l0).LLJJ.cancelAnimation();
        C786410Ut5.LLD(8, ((C428230Gqj) c0ie0.l0).LLJJ);
        Function0 function0 = (Function0) c0ie0.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onResult$1(C0IE0 c0ie0, Object obj) {
        ((C1295960jpS) c0ie0.l0).setComposition((C1294720jnS) obj);
        C786410Ut5.LLLLLLZZ(((C427370GpL) c0ie0.l1).LLILLL, 8);
        C786410Ut5.LLD(0, (C1295960jpS) c0ie0.l0);
        if (((C427370GpL) c0ie0.l1).isAttachedToWindow()) {
            ((C1295960jpS) c0ie0.l0).playAnimation();
        }
    }

    public static final void onResult$2(C0IE0 c0ie0, Object obj) {
        C786410Ut5.LJJJZ((C1295960jpS) c0ie0.l1, ((C427370GpL) c0ie0.l0).LLILLJJLI);
        ((C427370GpL) c0ie0.l0).LLILZ = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C0IE0(X.C1295960jpS r2, X.C427370GpL r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IE0.<init>(X.0jpS, X.0GpL, int):void");
    }

    public C0IE0(C428230Gqj c428230Gqj, Function0 function0, int i) {
        this.$t = i;
        this.l0 = c428230Gqj;
        this.l1 = function0;
    }
}
