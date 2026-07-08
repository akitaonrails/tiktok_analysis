package androidx.lifecycle;

import X.C09AE;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23119094b;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.CoroutineLiveData;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    public BlockRunner<T> blockRunner;
    public EmittedSource emittedSource;

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public static final Unit _init_$lambda$0(CoroutineLiveData coroutineLiveData) {
        coroutineLiveData.blockRunner = null;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L38
            r4 = r6
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r4 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L3e
            X.C155000ia.LIZIZ(r3)
        L22:
            r0 = 0
            r5.emittedSource = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r3)
            androidx.lifecycle.EmittedSource r0 = r5.emittedSource
            if (r0 == 0) goto L22
            r4.label = r1
            java.lang.Object r0 = r0.disposeNow(r4)
            if (r0 != r2) goto L22
            return r2
        L38:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r4 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r4.<init>(r5, r6)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_release(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> r7, X.InterfaceC1364105Vn<? super X.InterfaceC2238208po> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L4b
            r5 = r8
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r5 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2a
            if (r2 == r0) goto L38
            if (r2 != r1) goto L51
            X.C155000ia.LIZIZ(r4)
        L25:
            androidx.lifecycle.EmittedSource r4 = (androidx.lifecycle.EmittedSource) r4
            r6.emittedSource = r4
            return r4
        L2a:
            X.C155000ia.LIZIZ(r4)
            r5.L$0 = r7
            r5.label = r0
            java.lang.Object r0 = r6.clearSource$lifecycle_livedata_release(r5)
            if (r0 != r3) goto L3f
            return r3
        L38:
            java.lang.Object r7 = r5.L$0
            androidx.lifecycle.LiveData r7 = (androidx.lifecycle.LiveData) r7
            X.C155000ia.LIZIZ(r4)
        L3f:
            r0 = 0
            r5.L$0 = r0
            r5.label = r1
            java.lang.Object r4 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r6, r7, r5)
            if (r4 != r3) goto L25
            return r3
        L4b:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r5 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r5.<init>(r6, r8)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, X.05Vn):java.lang.Object");
    }

    public CoroutineLiveData(CoroutineContext coroutineContext, long j, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C23119094b c23119094b = new C23119094b((C09AE) coroutineContext.get(C09AE.LJJLJ));
        C1DFH c1dfh = C0PEM.LIZ;
        this.blockRunner = new BlockRunner<>(this, function2, j, C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII().plus(coroutineContext).plus(c23119094b)), new Function0() { // from class: X.09B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoroutineLiveData._init_$lambda$0(this.LL);
            }
        });
    }
}
