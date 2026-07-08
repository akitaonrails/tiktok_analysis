package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18NB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NB extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ ProductListModel LLIZLLLIL;
    public final /* synthetic */ Boolean LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18NB(int i, int i2, long j, ProductListModel productListModel, Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = z3;
        this.LLIZLLLIL = productListModel;
        this.LLJ = bool;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        AnchorPanelConfig anchorPanelConfig;
        AnchorPanelConfig anchorPanelConfig2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LL));
        c957403oi2.LIZLLL("is_prefetch_enabled", Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        c957403oi2.LIZLLL("use_cache", Integer.valueOf(this.LLILLL ? 1 : 0));
        String str = this.LLILZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("enter_from", str);
        c957403oi2.LIZLLL(Scene.SCENE_SERVICE, Integer.valueOf(this.LLILZIL));
        String str3 = this.LLILZLL;
        if (str3 != null) {
            str2 = str3;
        }
        c957403oi2.LIZLLL("entrance_form", str2);
        c957403oi2.LIZLLL("auto_show", Integer.valueOf(this.LLIZ ? 1 : 0));
        c957403oi2.LIZLLL("is_first_show", 1);
        ProductListModel productListModel = this.LLIZLLLIL;
        int i = 0;
        if ((productListModel != null && (anchorPanelConfig2 = productListModel.panelConfig) != null && anchorPanelConfig2.panelFullScreen) || Intrinsics.LJFF(this.LLJ, Boolean.TRUE)) {
            i = 1;
        }
        c957403oi2.LIZLLL("is_full_page", Integer.valueOf(i));
        c957403oi2.LIZLLL("position", Integer.valueOf(this.LLJI + 1));
        if (!Intrinsics.LJFF(this.LLILZ, "comment_anchor")) {
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            ProductListModel productListModel2 = this.LLIZLLLIL;
            c21272018Mk.getClass();
            if (productListModel2 == null || (anchorPanelConfig = productListModel2.panelConfig) == null) {
                anchorPanelConfig = new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
            }
            Map<String, ? extends Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(anchorPanelConfig));
            if (mapLJIIJ == null) {
                mapLJIIJ = C2097608Jq.LJ();
            }
            c957403oi2.LJ(mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
