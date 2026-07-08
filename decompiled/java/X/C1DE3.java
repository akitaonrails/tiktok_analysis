package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DE3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DE3<T> {
    public static final AtomicIntegerFieldUpdater LIZIZ = AtomicIntegerFieldUpdater.newUpdater(C1DE3.class, "notCompletedCount");
    public final AnonymousClass0957<T>[] LIZ;
    public volatile int notCompletedCount;

    /* JADX INFO: renamed from: X.1DE3$a */
    public final class a extends C1DF1 {
        public static final AtomicReferenceFieldUpdater LLIZLLLIL = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        public final InterfaceC20236714Gf<List<? extends T>> LLILZIL;
        public InterfaceC2238208po LLILZLL;
        public volatile Object _disposer;

        @Override // X.C1DFU
        public final void LJII(Throwable th) {
            if (th != null) {
                C09AU c09auLJJIJ = this.LLILZIL.LJJIJ(th);
                if (c09auLJJIJ != null) {
                    this.LLILZIL.LJIIL(c09auLJJIJ);
                    C1DE4 c1de4 = (C1DE4) LLIZLLLIL.get(this);
                    if (c1de4 != null) {
                        c1de4.LJI();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1DE3.LIZIZ.decrementAndGet(C1DE3.this) != 0) {
                return;
            }
            InterfaceC20236714Gf<List<? extends T>> interfaceC20236714Gf = this.LLILZIL;
            AnonymousClass0957<T>[] anonymousClass0957Arr = C1DE3.this.LIZ;
            ArrayList arrayList = new ArrayList(anonymousClass0957Arr.length);
            for (AnonymousClass0957<T> anonymousClass0957 : anonymousClass0957Arr) {
                arrayList.add(anonymousClass0957.LIZLLL());
            }
            C189200o6.m2constructorimpl(arrayList);
            interfaceC20236714Gf.resumeWith(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            LJII(th);
            return Unit.LIZ;
        }

        public a(C2252611DEt c2252611DEt) {
            this.LLILZIL = c2252611DEt;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1DE3(AnonymousClass0957<? extends T>[] anonymousClass0957Arr) {
        this.LIZ = anonymousClass0957Arr;
        this.notCompletedCount = anonymousClass0957Arr.length;
    }

    public final Object LIZ(InterfaceC1364105Vn<? super List<? extends T>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        int length = this.LIZ.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass0957<T> anonymousClass0957 = this.LIZ[i];
            anonymousClass0957.start();
            a aVar = new a(c2252611DEt);
            aVar.LLILZLL = anonymousClass0957.LJII(aVar);
            aVarArr[i] = aVar;
        }
        C1DE4 c1de4 = new C1DE4(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            a aVar2 = aVarArr[i2];
            aVar2.getClass();
            a.LLIZLLLIL.set(aVar2, c1de4);
        }
        if (c2252611DEt.isCompleted()) {
            c1de4.LJI();
        } else {
            c2252611DEt.LJJII(c1de4);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
