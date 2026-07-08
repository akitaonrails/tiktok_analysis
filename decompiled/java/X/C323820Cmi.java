package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.CaptionItem;
import tikcast.api.anchor.EditElementResult;
import tikcast.api.anchor.GetFragmentEditElementsReq;
import tikcast.api.anchor.GetFragmentEditElementsResp;

/* JADX INFO: renamed from: X.0Cmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$fetchCaptions$2$1", f = "LiveHighlightViewModel.kt", l = {193}, m = "invokeSuspend")
public final class C323820Cmi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair>, Object> {
    public C259800zU LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LiveHighlightViewModel LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323820Cmi(LiveHighlightViewModel liveHighlightViewModel, long j, InterfaceC1364105Vn<? super C323820Cmi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveHighlightViewModel;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323820Cmi c323820Cmi = new C323820Cmi(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c323820Cmi.LLILZ = obj;
        return c323820Cmi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C259800zU c259800zU;
        long j;
        C259800zU c259800zU2;
        Iterable iterable;
        Map<String, EditElementResult> map;
        EditElementResult editElementResult;
        CaptionItem captionItem;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.fetchCaptions$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.LLILLJJLI;
                    c259800zU = this.LL;
                    c259800zU2 = (C259800zU) this.LLILZ;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c259800zU = new C259800zU();
                LiveHighlightViewModel liveHighlightViewModel = this.LLILZIL;
                j = this.LLILZLL;
                C323990Cmz c323990Cmz = liveHighlightViewModel.LL.LLILLJJLI;
                List listSingletonList = Collections.singletonList(String.valueOf(j));
                List listSingletonList2 = Collections.singletonList(C2286608xc.LJ(2));
                this.LLILZ = c259800zU;
                this.LL = c259800zU;
                this.LLILLJJLI = j;
                this.LLILLL = 1;
                LiveHighlightApi liveHighlightApiLIZ = c323990Cmz.LL.LIZ();
                GetFragmentEditElementsReq getFragmentEditElementsReq = new GetFragmentEditElementsReq();
                getFragmentEditElementsReq.fragmentIds.addAll(listSingletonList);
                getFragmentEditElementsReq.types.addAll(listSingletonList2);
                obj = liveHighlightApiLIZ.getLiveHighlightEditElements(getFragmentEditElementsReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.fetchCaptions$2$1");
                    return objLJFF;
                }
                c259800zU2 = c259800zU;
            }
            c259800zU.element = ((C470590Icr) obj).data;
            GetFragmentEditElementsResp.ResponseData responseData = (GetFragmentEditElementsResp.ResponseData) c259800zU2.element;
            if (responseData == null || (map = responseData.editElementResultMap) == null || (editElementResult = map.get(String.valueOf(j))) == null || (captionItem = editElementResult.captionList) == null || (iterable = captionItem.caption) == null) {
                iterable = C13BV.INSTANCE;
            }
            c098200Yq = new Pair(C13LP.LLIIII(iterable), null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        long j2 = this.LLILZLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("LiveHighlightViewModel", "queryLiveHighlightEditElements caption failed... fragmentId: " + j2, thM5exceptionOrNullimpl);
            c098200Yq = new Pair(C13BV.INSTANCE, null);
        }
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.fetchCaptions$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
