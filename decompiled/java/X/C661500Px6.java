package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Px6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.mob.SearchPhotoMob$onPhotoPlayStart$1", f = "SearchPhotoMob.kt", l = {191}, m = "invokeSuspend")
public final class C661500Px6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C661480Px4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C661500Px6(C661480Px4 c661480Px4, InterfaceC1364105Vn<? super C661500Px6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c661480Px4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C661500Px6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strInvoke;
        Function1<? super Aweme, String> function1;
        C1C7U.LIZ("SearchPhotoMob@39e5.onPhotoPlayStart$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("SearchPhotoMob@39e5.onPhotoPlayStart$1");
                return objLJFF;
            }
        }
        C661480Px4 c661480Px4 = this.LLILLJJLI;
        c661480Px4.LLJJIJI = true;
        C653660PkS c653660PkSLJIIIZ = c661480Px4.LJIIIZ();
        if (c653660PkSLJIIIZ != null && (function1 = c653660PkSLJIIIZ.LJJLIIIJL) != null) {
            strInvoke = function1.invoke(this.LLILLJJLI.LJII());
        } else {
            strInvoke = null;
        }
        if (C123100dR.LIZ(strInvoke)) {
            this.LLILLJJLI.LJIILLIIL(C2097908Jt.LIZJ(new Pair("search_third_item_id", strInvoke)));
        } else {
            this.LLILLJJLI.LJIILLIIL(C2097608Jq.LJ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoMob@39e5.onPhotoPlayStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
