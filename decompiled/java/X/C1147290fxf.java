package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$onFavoriteClicked$1", f = "MusicGiftDetailViewModel.kt", l = {368}, m = "invokeSuspend")
public final class C1147290fxf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1147350fxl LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ LinkedHashSet<Long> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147290fxf(MusicGiftDetailViewModel musicGiftDetailViewModel, int i, long j, boolean z, C1147350fxl c1147350fxl, boolean z2, boolean z3, boolean z4, LinkedHashSet<Long> linkedHashSet, InterfaceC1364105Vn<? super C1147290fxf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = c1147350fxl;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = linkedHashSet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147290fxf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1");
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
            C09AM c09am = C09AM.LL;
            C1147250fxb c1147250fxb = new C1147250fxb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c09am, c1147250fxb) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
