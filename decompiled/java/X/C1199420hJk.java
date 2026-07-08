package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionRepository$operator$1$getRequestPopupEnable$result$1", f = "PoiPublishExtensionRepository.kt", l = {158}, m = "invokeSuspend")
public final class C1199420hJk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PopupEnableResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1199440hJm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199420hJk(C1199440hJm c1199440hJm, InterfaceC1364105Vn<? super C1199420hJk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1199440hJm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199420hJk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPublishExtensionRepository@30c1.operator$1$getRequestPopupEnable$result$1");
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
            C099G c099g = this.LLILLJJLI.LLILLL;
            if (c099g != null) {
                this.LL = 1;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$getRequestPopupEnable$result$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1199440hJm c1199440hJm = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1199440hJm c1199440hJm2 = this.LLILLJJLI;
        c1199440hJm.LLILLJJLI = jCurrentTimeMillis - c1199440hJm2.LL;
        C1199460hJo c1199460hJo = C1199460hJo.LIZ;
        C1199450hJn c1199450hJn = new C1199450hJn("video_post_page");
        c1199450hJn.LIZLLL = "network";
        c1199450hJn.LIZ(c1199440hJm2.LLILLJJLI);
        c1199450hJn.LIZIZ(2L);
        c1199460hJo.getClass();
        C1199460hJo.LIZ(c1199450hJn);
        C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$getRequestPopupEnable$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PopupEnableResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
