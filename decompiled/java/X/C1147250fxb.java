package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$onFavoriteClicked$1$1", f = "MusicGiftDetailViewModel.kt", l = {369}, m = "invokeSuspend")
public final class C1147250fxb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
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
    public C1147250fxb(MusicGiftDetailViewModel musicGiftDetailViewModel, int i, long j, boolean z, C1147350fxl c1147350fxl, boolean z2, boolean z3, boolean z4, LinkedHashSet<Long> linkedHashSet, InterfaceC1364105Vn<? super C1147250fxb> interfaceC1364105Vn) {
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
        return new C1147250fxb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMusicGiftService iMusicGiftService;
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1$1");
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
            InterfaceC597550Nc9 interfaceC597550Nc9 = this.LLILLJJLI.LLILZ;
            int i2 = this.LLILLL;
            List<Long> listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILZ));
            this.LL = 1;
            obj = interfaceC597550Nc9.LIZJ(i2, listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1$1");
                return objLJFF;
            }
        }
        AbstractC1147530fy3 abstractC1147530fy3 = (AbstractC1147530fy3) obj;
        if (abstractC1147530fy3 instanceof C1147590fy9) {
            if (this.LLILZIL && (iMusicGiftService = this.LLILLJJLI.LLJLILLLLZIIL) != null) {
                iMusicGiftService.QY((List) ((C1147590fy9) abstractC1147530fy3).LIZ);
            }
            this.LLILLJJLI.LLJLLL.remove(C2286608xc.LJFF(this.LLILZ));
            this.LLILLJJLI.YQ2(this.LLILZ, this.LLILZIL, this.LLILZLL);
            if (this.LLIZ) {
                this.LLILLJJLI.LLJJJJLIIL = true;
            }
            MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLILLJJLI;
            if (musicGiftDetailViewModel.LLJJJJJIL && musicGiftDetailViewModel.LLJJJJLIIL) {
                musicGiftDetailViewModel.LLJJJJLIIL = false;
                IMusicGiftService iMusicGiftService2 = musicGiftDetailViewModel.LLJLILLLLZIIL;
                if (iMusicGiftService2 != null) {
                    iMusicGiftService2.py1(C13LP.LLIIII(musicGiftDetailViewModel.LLJLLIL));
                }
            }
            if (this.LLILZIL) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856481));
            }
            this.LLILLJJLI.QQ2();
        } else if (abstractC1147530fy3 instanceof C1147540fy4) {
            this.LLILLJJLI.LLJLLL.remove(C2286608xc.LJFF(this.LLILZ));
            MusicGiftDetailViewModel musicGiftDetailViewModel2 = this.LLILLJJLI;
            musicGiftDetailViewModel2.LLJJL = this.LLIZLLLIL;
            musicGiftDetailViewModel2.XQ2(this.LLILZ, this.LLJ, false);
            this.LLILLJJLI.YQ2(this.LLILZ, this.LLJ, this.LLILZLL);
            this.LLILLJJLI.RQ2(this.LLJI);
            this.LLILLJJLI.QQ2();
        } else {
            if (!Intrinsics.LJFF(abstractC1147530fy3, C1147570fy7.LIZ) && !Intrinsics.LJFF(abstractC1147530fy3, C1147580fy8.LIZ)) {
                throw new C1954807lC();
            }
            this.LLILLJJLI.LLJLLL.remove(C2286608xc.LJFF(this.LLILZ));
            MusicGiftDetailViewModel musicGiftDetailViewModel3 = this.LLILLJJLI;
            musicGiftDetailViewModel3.LLJJL = this.LLIZLLLIL;
            musicGiftDetailViewModel3.XQ2(this.LLILZ, this.LLJ, false);
            this.LLILLJJLI.YQ2(this.LLILZ, this.LLJ, this.LLILZLL);
            this.LLILLJJLI.RQ2(this.LLJI);
            this.LLILLJJLI.QQ2();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.onFavoriteClicked$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
