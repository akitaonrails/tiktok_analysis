package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorLiveFragmentDeleteResponse;

/* JADX INFO: renamed from: X.01MT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightPopupHelper$deleteHighlight$1$1", f = "GeneralHighlightPopupHelper.kt", l = {213}, m = "invokeSuspend")
public final class C01MT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentDeleteResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MT(String str, InterfaceC1364105Vn<? super C01MT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1$1");
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
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = liveHighlightApi.deleteLiveFragmentInfo(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentDeleteResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
