package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632710sab implements InterfaceC1632620saS<Object, Object, Object> {
    public int LIZ = -1;
    public final /* synthetic */ C199494133s<C1632730sad<Object, Object, Object>> LIZIZ;
    public final /* synthetic */ C11PQ<C1632580saO<Object, Object>> LIZJ;
    public final /* synthetic */ Function1<Integer, Unit> LIZLLL;

    @Override // X.InterfaceC1632620saS
    public final void LIZJ(int i, Object obj) {
        if (i == this.LIZ) {
            return;
        }
        this.LIZ = i;
        this.LIZLLL.invoke(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1632620saS
    public final void LIZLLL(Object obj, Object obj2) {
        this.LIZIZ.LJIIZILJ(new C1632730sad<>(obj, obj2, true, null, null, null));
        if (C1632670saX.LIZ()) {
            this.LIZJ.onNext(new C1632580saO<>(EnumC1641380soa.SUCCESS, obj, obj2, null));
            this.LIZJ.onComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1632710sab(C199494133s<C1632730sad<Object, Object, Object>> c199494133s, C11PQ<C1632580saO<Object, Object>> c11pq, Function1<? super Integer, Unit> function1) {
        this.LIZIZ = c199494133s;
        this.LIZJ = c11pq;
        this.LIZLLL = function1;
    }

    @Override // X.InterfaceC1632620saS
    public final void LIZ(Object obj, Object obj2, Object obj3, long j) {
        this.LIZIZ.LJIIZILJ(new C1632730sad<>(obj, obj2, false, obj3, Long.valueOf(j), null));
        if (C1632670saX.LIZ()) {
            this.LIZJ.onNext(new C1632580saO<>(EnumC1641380soa.SUCCESS, obj, obj2, null));
            this.LIZJ.onComplete();
        }
    }

    @Override // X.InterfaceC1632620saS
    public final void LIZIZ(Object obj, Exception exc, Object obj2, long j) {
        String message;
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        if (Intrinsics.LJFF(message, "10019")) {
            LIZJ(this.LIZ, obj);
            return;
        }
        this.LIZIZ.LJIIZILJ(new C1632730sad<>(obj, null, false, obj2, Long.valueOf(j), exc));
        if (!C1632670saX.LIZ()) {
            return;
        }
        this.LIZJ.onNext(new C1632580saO<>(EnumC1641380soa.FAILED, obj, null, exc));
        this.LIZJ.onComplete();
    }
}
