package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$roleChangeListener$1$onChange$1", f = "KaraokeViewModel.kt", l = {187, 188}, m = "invokeSuspend")
public final class C097H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097H(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097H(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.roleChangeListener$1$onChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.roleChangeListener$1$onChange$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
            AnonymousClass0975 anonymousClass0975 = new AnonymousClass0975(this.LLILLL);
            this.LL = 1;
            if (karaokeViewModel.zQ2(anonymousClass0975, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.roleChangeListener$1$onChange$1");
                return objLJFF;
            }
        }
        Integer numLJ = C2286608xc.LJ(this.LLILLJJLI.LL.LJIIJJI());
        if (numLJ != null && numLJ.intValue() != 1) {
            KaraokeViewModel karaokeViewModel2 = this.LLILLJJLI;
            this.LL = 2;
            if (karaokeViewModel2.iR2() == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.roleChangeListener$1$onChange$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.roleChangeListener$1$onChange$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
