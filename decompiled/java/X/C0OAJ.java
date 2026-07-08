package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel$mobPlayButtonShow$1", f = "LandscapeFragmentPanel.kt", l = {}, m = "invokeSuspend")
public final class C0OAJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OAJ(String str, Aweme aweme, long j, InterfaceC1364105Vn<? super C0OAJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OAJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Boolean boolValueOf;
        Object service;
        boolean z;
        String aid2;
        C1C7U.LIZ("LandscapeFragmentPanel@649b.mobPlayButtonShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!((Boolean) C1818007Ac.LIZ.getValue()).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LandscapeFragmentPanel@649b.mobPlayButtonShow$1");
            return unit;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        Aweme aweme = this.LLILLJJLI;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isPhotoMode(aweme2));
        } else {
            boolValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("is_photo", C0OAL.LIZIZ(boolValueOf));
        c2344009Gk.LJIIIIZZ("visual_pause_time_pos", String.valueOf(this.LLILLL));
        C20684815ws.LJIILLIIL("play_button_show", c2344009Gk.LIZ);
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
            }
        }
        InterfaceC634440OuY interfaceC634440OuY = (InterfaceC634440OuY) service;
        String str2 = this.LL;
        Aweme aweme3 = this.LLILLJJLI;
        if (aweme3 != null && AwemeExtKt.isPhotoMode(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme4 = this.LLILLJJLI;
        if (aweme4 != null && (aid2 = aweme4.getAid()) != null) {
            str = aid2;
        }
        interfaceC634440OuY.LJI(str2, str, String.valueOf(this.LLILLL), "landscape_full_screen", z);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeFragmentPanel@649b.mobPlayButtonShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
