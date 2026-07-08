package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Ptg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$bindProductDynamicAnchorOnCover$1$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
public final class C659380Ptg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchVideoHolder LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AnchorCommonStruct LLILLL;
    public final /* synthetic */ ViewObjectWrapper LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C659380Ptg(SearchVideoHolder searchVideoHolder, String str, AnchorCommonStruct anchorCommonStruct, ViewObjectWrapper viewObjectWrapper, Aweme aweme, InterfaceC1364105Vn<? super C659380Ptg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchVideoHolder;
        this.LLILLJJLI = str;
        this.LLILLL = anchorCommonStruct;
        this.LLILZ = viewObjectWrapper;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C659380Ptg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String aid;
        View viewLIZ;
        List<? extends InterfaceC655250Pn1> listLIZIZ;
        C1C7U.LIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1$1");
            return unit;
        }
        if (!Intrinsics.LJFF(this.LL.a, C660630Pvh.LIZ)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1$1");
            return unit2;
        }
        if (this.LLILLL.getStyle() == 1) {
            FrameLayout frameLayout = this.LL.LLLFFI;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            InterfaceC655060Pmi interfaceC655060Pmi = (InterfaceC655060Pmi) this.LL.LLLFF.getValue();
            if (interfaceC655060Pmi != null && (viewLIZ = interfaceC655060Pmi.LIZ(this.LLILZ)) != null) {
                FrameLayout frameLayout2 = this.LL.LLLFFI;
                if (frameLayout2 != null) {
                    frameLayout2.addView(viewLIZ);
                }
                SearchVideoHolder searchVideoHolder = this.LL;
                InterfaceC655060Pmi interfaceC655060Pmi2 = (InterfaceC655060Pmi) searchVideoHolder.LLLFF.getValue();
                if (interfaceC655060Pmi2 == null || (listLIZIZ = interfaceC655060Pmi2.LIZIZ(C13LE.LIZ(InterfaceC655250Pn1.class))) == null) {
                    listLIZIZ = C13BV.INSTANCE;
                }
                searchVideoHolder.LLJJI = listLIZIZ;
                SearchVideoHolder searchVideoHolder2 = this.LL;
                searchVideoHolder2.LLLLZ = this.LLILZ;
                searchVideoHolder2.j7().LL = true;
                this.LL.b7().getClass();
                this.LL.f8(this.LLILZIL);
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1$1");
                return unit3;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1$1");
        return unit4;
    }
}
