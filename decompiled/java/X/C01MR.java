package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightApi;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;

/* JADX INFO: renamed from: X.01MR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightPopupHelper$getFragmentDetail$1$responseData$1", f = "GeneralHighlightPopupHelper.kt", l = {183}, m = "invokeSuspend")
public final class C01MR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentListResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MR(String str, InterfaceC1364105Vn<? super C01MR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1$responseData$1");
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
            C480460Ism.LIZ().getClass();
            LiveHighlightApi liveHighlightApi = (LiveHighlightApi) C480460Ism.LIZLLL(LiveHighlightApi.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put(Scene.SCENE_SERVICE, C2286608xc.LJ(17));
            map.put("fragment_ids", this.LLILLJJLI);
            map.put("get_result_by", C2286608xc.LJ(1));
            this.LL = 1;
            obj = liveHighlightApi.getLiveFragmentInfos(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1$responseData$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.getFragmentDetail$1$responseData$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentListResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
