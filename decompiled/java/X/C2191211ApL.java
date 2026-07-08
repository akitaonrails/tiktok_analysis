package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS171S0101000_34;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS414S0200000_13;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.1ApL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.chunk.ChunkPreloadDeferredManager$deferredForMode$1", f = "ChunkPreloadDeferredManager.kt", l = {956}, m = "invokeSuspend")
public final class C2191211ApL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05XL<C1515820pY4<Object>> LLILLL;
    public final /* synthetic */ C05XL<C1515820pY4<Object>> LLILZ;
    public final /* synthetic */ EnumC994770bzf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191211ApL(C05XL<C1515820pY4<Object>> c05xl, C05XL<C1515820pY4<Object>> c05xl2, EnumC994770bzf enumC994770bzf, InterfaceC1364105Vn<? super C2191211ApL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05xl;
        this.LLILZ = c05xl2;
        this.LLILZIL = enumC994770bzf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2191211ApL c2191211ApL = new C2191211ApL(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2191211ApL.LLILLJJLI = obj;
        return c2191211ApL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1494600ozq requestInfo;
        C1C7U.LIZ("ChunkPreloadDeferredManager@81a.deferredForMode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C05XL<C1515820pY4<Object>> c05xl = this.LLILLL;
                this.LL = 1;
                obj = c05xl.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.deferredForMode$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1515820pY4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C05XL<C1515820pY4<Object>> c05xl2 = this.LLILZ;
        EnumC994770bzf enumC994770bzf = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            final C1515820pY4<Object> c1515820pY4 = (C1515820pY4) c098200Yq;
            C2191431Aph.LIZ.getClass();
            if (enumC994770bzf == EnumC994770bzf.PREREAD) {
                C034X.LIZIZ();
                final C2190971Aox c2190971Aox = new C2190971Aox();
                try {
                    final C1515820pY4<Object> c1515820pY42 = new C1515820pY4<>(new InterfaceC644200POo<Object>() { // from class: X.1Aor
                        @Override // X.InterfaceC644200POo
                        public final void LIZ(C0POE<Object> c0poe) {
                            C2190971Aox<Object> c2190971Aox2 = c2190971Aox;
                            synchronized (c2190971Aox2) {
                                try {
                                    int size = ((ArrayList) c2190971Aox2.LIZ).size();
                                    if (size > 0 || c2190971Aox2.LIZJ) {
                                        new AwS171S0101000_34(size, (int) c2190971Aox2, (C2190971Aox<Object>) 1);
                                        C034X.LIZIZ();
                                    }
                                    for (AbstractC989320bqs abstractC989320bqs : (ArrayList) c2190971Aox2.LIZ) {
                                        if (abstractC989320bqs instanceof C989300bqq) {
                                            c0poe.onNext(((C989300bqq) abstractC989320bqs).LIZ);
                                        } else if (Intrinsics.LJFF(abstractC989320bqs, C989330bqt.LIZ)) {
                                            c0poe.onComplete();
                                        } else if (abstractC989320bqs instanceof C989310bqr) {
                                            c0poe.onFailed(((C989310bqr) abstractC989320bqs).LIZ);
                                        } else {
                                            throw new C1954807lC();
                                        }
                                    }
                                    if (!c2190971Aox2.LIZJ) {
                                        ((ArrayList) c2190971Aox2.LIZIZ).add(c0poe);
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                    }, Boolean.TRUE);
                    try {
                        requestInfo = c1515820pY4.getRequestInfo();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        requestInfo = null;
                    }
                    new AwS270S0300000_26(c1515820pY4, c1515820pY42, (C1515820pY4<Object>) requestInfo, (C1494600ozq<?>) 151);
                    C034X.LIZIZ();
                    if (requestInfo != null) {
                        try {
                            c1515820pY42.setRequestInfo(requestInfo);
                            new AwS570S0100000_26(c1515820pY42, (C1515820pY4<Object>) 1592);
                            C034X.LIZIZ();
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            new AwS546S0100000_2(th3, 1199);
                            C034X.LIZIZ();
                        }
                    }
                    try {
                        c1515820pY42.LLILLL = c1515820pY4.LLILLL;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                    try {
                        c1515820pY4.LLILZLL = new InterfaceC1515700pXs() { // from class: X.1ApM
                            @Override // X.InterfaceC1515700pXs
                            public final void LIZ(C1494600ozq c1494600ozq) {
                                new AwS278S0300000_34((C1515820pY4) c1515820pY4, c1515820pY42, (C1515820pY4<Object>) c1494600ozq, (C1494600ozq) 6);
                                C034X.LIZIZ();
                                try {
                                    c1515820pY42.setRequestInfo(c1494600ozq);
                                    new AwS578S0100000_34(c1515820pY42, (C1515820pY4<Object>) 190);
                                    C034X.LIZIZ();
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    new AwS578S0100000_34(th5, 191);
                                    C034X.LIZIZ();
                                }
                            }
                        };
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        new AwS546S0100000_2(th5, 1200);
                        C034X.LIZIZ();
                    }
                    C23250099c.LIZLLL(C2191431Aph.LIZIZ, null, null, new C2191011Ap1(c1515820pY4, c2190971Aox, null), 3);
                    c1515820pY4 = c1515820pY42;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    new AwS414S0200000_13(enumC994770bzf, e, 17);
                    C034X.LIZIZ();
                }
            }
            c05xl2.LJIIZILJ(c1515820pY4);
        }
        C05XL<C1515820pY4<Object>> c05xl3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c05xl3.LJJJJJ(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChunkPreloadDeferredManager@81a.deferredForMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
