package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252321DDq<T> extends AbstractC2252361DDu<C2252341DDs> implements InterfaceC332260D0u<T>, InterfaceC346201Wa, InterfaceC23142094y<T> {
    public static final AtomicReferenceFieldUpdater LLILZLL = AtomicReferenceFieldUpdater.newUpdater(C2252321DDq.class, Object.class, "_state");
    public int LLILZIL;
    public volatile Object _state;

    @Override // X.AbstractC2252361DDu
    public final AbstractC2252411DDz[] LJI() {
        return new C2252341DDs[2];
    }

    @Override // X.C05YC
    public final void LIZIZ() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // X.AbstractC2252361DDu
    public final AbstractC2252411DDz LJFF() {
        return new C2252341DDs();
    }

    @Override // X.InterfaceC332260D0u, X.C05YD
    public final T getValue() {
        C09AU c09au = C09AV.LIZ;
        T t = (T) LLILZLL.get(this);
        if (t == c09au) {
            return null;
        }
        return t;
    }

    @Override // X.C01S9
    public final List<T> LIZ() {
        return Collections.singletonList(getValue());
    }

    public C2252321DDq(Object obj) {
        this._state = obj;
    }

    @Override // X.C05YC
    public final boolean LIZJ(T t) {
        setValue(t);
        return true;
    }

    @Override // X.InterfaceC332260D0u
    public final void setValue(T t) {
        if (t == null) {
            t = (T) C09AV.LIZ;
        }
        LJIIIIZZ(null, t);
    }

    public final boolean LJIIIIZZ(Object obj, Object obj2) {
        int i;
        C09AU c09au;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILZLL;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.LJFF(obj3, obj)) {
                return false;
            }
            if (Intrinsics.LJFF(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.LLILZIL;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.LLILZIL = i3;
                Object obj4 = this.LL;
                while (true) {
                    C2252341DDs[] c2252341DDsArr = (C2252341DDs[]) obj4;
                    if (c2252341DDsArr != null) {
                        for (C2252341DDs c2252341DDs : c2252341DDsArr) {
                            if (c2252341DDs != null) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2252341DDs.LIZ;
                                while (true) {
                                    Object obj5 = atomicReferenceFieldUpdater2.get(c2252341DDs);
                                    if (obj5 != null && obj5 != (c09au = C1BNE.LIZIZ)) {
                                        C09AU c09au2 = C1BNE.LIZ;
                                        if (obj5 == c09au2) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2252341DDs.LIZ;
                                            while (!atomicReferenceFieldUpdater3.compareAndSet(c2252341DDs, obj5, c09au)) {
                                                if (atomicReferenceFieldUpdater3.get(c2252341DDs) != obj5) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = C2252341DDs.LIZ;
                                            while (!atomicReferenceFieldUpdater4.compareAndSet(c2252341DDs, obj5, c09au2)) {
                                                if (atomicReferenceFieldUpdater4.get(c2252341DDs) != obj5) {
                                                    break;
                                                }
                                            }
                                            Unit unit = Unit.LIZ;
                                            C189200o6.m2constructorimpl(unit);
                                            ((C2252611DEt) obj5).resumeWith(unit);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.LLILZIL;
                        if (i == i3) {
                            this.LLILZIL = i3 + 1;
                            return true;
                        }
                        obj4 = this.LL;
                    }
                    i3 = i;
                }
            } else {
                this.LLILZIL = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:35:0x009b, B:37:0x00a1], limit reached: 67 */
    /* JADX WARN: Path cross not found for [B:37:0x00a1, B:35:0x009b], limit reached: 67 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x00ed, TryCatch #1 {all -> 0x00ed, blocks: (B:27:0x0083, B:28:0x0086, B:30:0x008e, B:32:0x0094, B:33:0x0098, B:35:0x009b, B:46:0x00c0, B:52:0x00d5, B:37:0x00a1, B:41:0x00a8, B:45:0x00bd, B:25:0x0072, B:26:0x0075), top: B:64:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x00ed, TryCatch #1 {all -> 0x00ed, blocks: (B:27:0x0083, B:28:0x0086, B:30:0x008e, B:32:0x0094, B:33:0x0098, B:35:0x009b, B:46:0x00c0, B:52:0x00d5, B:37:0x00a1, B:41:0x00a8, B:45:0x00bd, B:25:0x0072, B:26:0x0075), top: B:64:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[Catch: all -> 0x00ed, TryCatch #1 {all -> 0x00ed, blocks: (B:27:0x0083, B:28:0x0086, B:30:0x008e, B:32:0x0094, B:33:0x0098, B:35:0x009b, B:46:0x00c0, B:52:0x00d5, B:37:0x00a1, B:41:0x00a8, B:45:0x00bd, B:25:0x0072, B:26:0x0075), top: B:64:0x001e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e5 -> B:28:0x0086). Please report as a decompilation issue!!! */
    @Override // X.C01S9, X.InterfaceC346201Wa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC346701Wf<? super T> r13, X.InterfaceC1364105Vn<?> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252321DDq.collect(X.01Wf, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC332260D0u
    public final boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) C09AV.LIZ;
        }
        if (t2 == null) {
            t2 = (T) C09AV.LIZ;
        }
        return LJIIIIZZ(t, t2);
    }

    @Override // X.C05YC, X.InterfaceC346701Wf
    public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        setValue(t);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC23142094y
    public final InterfaceC346201Wa<T> fuse(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        if (i < 0 ? i == -2 : i < 2) {
            if (enumC2252401DDy == EnumC2252401DDy.DROP_OLDEST) {
                return this;
            }
        }
        if ((i == 0 || i == -3) && enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
            return this;
        }
        return new C23125094h(i, coroutineContext, enumC2252401DDy, this);
    }
}
