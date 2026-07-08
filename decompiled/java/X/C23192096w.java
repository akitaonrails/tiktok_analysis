package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$updateKaraokeStateWhenCreateRoom$1", f = "KaraokeViewModel.kt", l = {1692}, m = "invokeSuspend")
public final class C23192096w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23192096w(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23192096w(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.updateKaraokeStateWhenCreateRoom$1");
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
            KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
            AnonymousClass0970 anonymousClass0970 = new AnonymousClass0970(!this.LLILLL);
            this.LL = 1;
            if (karaokeViewModel.zQ2(anonymousClass0970, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateKaraokeStateWhenCreateRoom$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateKaraokeStateWhenCreateRoom$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
