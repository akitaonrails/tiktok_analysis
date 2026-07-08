package X;

import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.IconPrefetchManager$prefetchUrls$2", f = "IconPrefetchManager.kt", l = {86}, m = "invokeSuspend")
public final class C458101qN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C0HWB LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458101qN(C0HWB c0hwb, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c0hwb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C458101qN c458101qN = new C458101qN(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c458101qN.LLILLJJLI = obj;
        return c458101qN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IconPrefetchManager@1448.prefetchUrls$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            HashSet hashSet = new HashSet(this.LLILLL.size());
            C1DEK c1dekLIZ = C095G.LIZ(-2, null, 6);
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C458001qM(this.LLILLL, hashSet, c1dekLIZ, null), 3);
            C0HWB c0hwb = this.LLILZ;
            int i2 = c0hwb.LIZIZ;
            for (int i3 = 0; i3 < i2; i3++) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C458301qP(c1dekLIZ, c0hwb, null), 3);
            }
            this.LL = 1;
            if (anonymousClass0956LIZLLL.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("IconPrefetchManager@1448.prefetchUrls$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IconPrefetchManager@1448.prefetchUrls$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
