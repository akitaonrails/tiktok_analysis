package X;

import Y.ACListenerS30S1300000_19;
import Y.ARunnableS23S1200000_19;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0iuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl$showFloatingNoticePhaseIII$1$1", f = "EducatePhotoModeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1260500iuG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EducatePhotoModeServiceImpl LL;
    public final /* synthetic */ BannerDisplayInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ViewStub LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ C1257230ioz LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260500iuG(EducatePhotoModeServiceImpl educatePhotoModeServiceImpl, BannerDisplayInfo bannerDisplayInfo, String str, ViewStub viewStub, int i, Activity activity, C1257230ioz c1257230ioz, InterfaceC1364105Vn<? super C1260500iuG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = educatePhotoModeServiceImpl;
        this.LLILLJJLI = bannerDisplayInfo;
        this.LLILLL = str;
        this.LLILZ = viewStub;
        this.LLILZIL = i;
        this.LLILZLL = activity;
        this.LLIZ = c1257230ioz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1260500iuG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View viewFindViewById;
        C1C7U.LIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EducatePhotoModeServiceImpl educatePhotoModeServiceImpl = this.LL;
        BannerDisplayInfo bannerDisplayInfo = this.LLILLJJLI;
        String str = this.LLILLL;
        educatePhotoModeServiceImpl.getClass();
        C823050WQl.LIZJ().submit(new ARunnableS23S1200000_19(educatePhotoModeServiceImpl, bannerDisplayInfo, str, 4));
        ViewStub viewStub = this.LLILZ;
        int i = this.LLILZIL;
        Activity activity = this.LLILZLL;
        C1257230ioz c1257230ioz = this.LLIZ;
        C1260670iuX c1260670iuX = new C1260670iuX(viewStub, i, activity, c1257230ioz);
        BannerDisplayInfo bannerDisplayInfo2 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        if (c1257230ioz != null) {
            C20515215Pi c20515215Pi = c1257230ioz.LIZ;
            c20515215Pi.LJI(new AwS583S0100000_4(c1260670iuX, 271));
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJIIJ = 0;
            c1057450dcl.LJ = bannerDisplayInfo2.title;
            c20515215Pi.LIZ.LJFF = C1260670iuX.LIZIZ(bannerDisplayInfo2.description, activity, new Object[0]);
            c20515215Pi.LJ();
            C20514915Pf c20514915Pf = c20515215Pi.LJ;
            if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
                viewFindViewById.setClickable(true);
                str2 = str2;
                C786410Ut5.I7(new ACListenerS30S1300000_19(c1260670iuX, bannerDisplayInfo2, c20515215Pi, str2, 2), viewFindViewById);
            }
            c20515215Pi.LIZ.LJIILJJIL = new AwS103S1200000_19(bannerDisplayInfo2, c1260670iuX, str2, 7);
            C1260250itr.LIZ().LJIIIIZZ(Integer.valueOf(bannerDisplayInfo2.hashCode()));
            C1260250itr.LIZ().LJIIIZ(bannerDisplayInfo2.topicType);
            C1260670iuX.LJ(c1260670iuX, null, "educate_phase_iii", null, String.valueOf(bannerDisplayInfo2.category), str2, 101);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
