package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import njp.a;
import tikcast.api.anchor.HashTag;

/* JADX INFO: renamed from: X.0xIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel$postAutoCut$1", f = "LiveQuickPostViewModel.kt", l = {109}, m = "invokeSuspend")
public final class C1813750xIb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveQuickPostViewModel LLILLL;
    public final /* synthetic */ PostConfigModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ List<HashTag> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ EditParams LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813750xIb(LiveQuickPostViewModel liveQuickPostViewModel, PostConfigModel postConfigModel, String str, int i, List<HashTag> list, String str2, EditParams editParams, int i2, InterfaceC1364105Vn<? super C1813750xIb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveQuickPostViewModel;
        this.LLILZ = postConfigModel;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = list;
        this.LLIZLLLIL = str2;
        this.LLJ = editParams;
        this.LLJI = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813750xIb c1813750xIb = new C1813750xIb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1813750xIb.LLILLJJLI = obj;
        return c1813750xIb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Map<String, String> map;
        String str;
        C1C7U.LIZ("LiveQuickPostViewModel@90c1.postAutoCut$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                LiveQuickPostViewModel liveQuickPostViewModel = this.LLILLL;
                PostConfigModel postConfigModel = this.LLILZ;
                String str2 = this.LLILZIL;
                int i2 = this.LLILZLL;
                List<HashTag> list = this.LLIZ;
                String str3 = this.LLIZLLLIL;
                EditParams editParams = this.LLJ;
                int i3 = this.LLJI;
                C1834900xqi c1834900xqi = liveQuickPostViewModel.LL.LLILLJJLI;
                if (postConfigModel == null || (str = postConfigModel.fragmentId) == null) {
                    str = "";
                }
                this.LL = 1;
                obj = c1834900xqi.LJLZ(str, str2, i2, list, str3, editParams, i3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postAutoCut$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveQuickPostViewModel liveQuickPostViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            liveQuickPostViewModel2.setState(AFwS269S0000000_27.get$arr$(329));
        }
        PostConfigModel postConfigModel2 = this.LLILZ;
        LiveQuickPostViewModel liveQuickPostViewModel3 = this.LLILLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            if (postConfigModel2 != null && (map = postConfigModel2.reportParams) != null) {
                C485260J1g c485260J1g = C485260J1g.LIZ;
                C0OFE.LIZ("fail_reason", "post_fail");
                c485260J1g.getClass();
                C20684815ws.LJIILLIIL("publish_fail", map);
            }
            liveQuickPostViewModel3.setState(AFwS269S0000000_27.get$arr$(330));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postAutoCut$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
