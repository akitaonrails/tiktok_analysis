package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0f4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.messagehistory.MessageHistoryFetcher$fetchHistory$1", f = "MessageHistoryFetcher.kt", l = {99}, m = "invokeSuspend")
public final class C1113000f4M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1112000f2k LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113000f4M(C1112000f2k c1112000f2k, InterfaceC1364105Vn<? super C1113000f4M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1112000f2k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1113000f4M(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MessageHistoryFetcher@f94f.fetchHistory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1112000f2k c1112000f2k = this.LLILLJJLI;
            c1112000f2k.LIZ = true;
            C1DFB c1dfb = C0PEM.LIZJ;
            C1113020f4O c1113020f4O = new C1113020f4O(c1112000f2k, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1113020f4O);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageHistoryFetcher@f94f.fetchHistory$1");
                return objLJFF;
            }
        }
        C1113010f4N c1113010f4N = (C1113010f4N) obj;
        C1112000f2k c1112000f2k2 = this.LLILLJJLI;
        c1112000f2k2.LIZ = false;
        if (c1113010f4N == null) {
            c1113010f4N = new C1113010f4N(C13BV.INSTANCE, false, "");
        }
        c1112000f2k2.LJ = c1113010f4N.LIZIZ;
        c1112000f2k2.LIZLLL = c1113010f4N.LIZJ;
        InterfaceC1112820f44 interfaceC1112820f44 = c1112000f2k2.LJI;
        if (interfaceC1112820f44 != null) {
            ((C1111930f2d) interfaceC1112820f44).LJLLI(c1113010f4N);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageHistoryFetcher@f94f.fetchHistory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
