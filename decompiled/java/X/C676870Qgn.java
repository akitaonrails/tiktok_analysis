package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676870Qgn extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ EcSearchResultContainerAssem LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ C676920Qgs LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C676870Qgn(boolean z, int i, int i2, int i3, EcSearchResultContainerAssem ecSearchResultContainerAssem, Integer num, C676920Qgs c676920Qgs, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = ecSearchResultContainerAssem;
        this.LLILZLL = num;
        this.LLIZ = c676920Qgs;
        this.LLIZLLLIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        EnumC669620QOi enumC669620QOiLIZIZ;
        StringBuilder sb = new StringBuilder("result=");
        sb.append(this.LL ? "UseOverlay" : "FixedBelowHeader");
        sb.append(" outerPaddingTop=");
        sb.append(this.LLILLJJLI);
        sb.append(" headerHeight=");
        sb.append(this.LLILLL);
        sb.append(" scene=InitPadding position=");
        sb.append(this.LLILZ);
        sb.append(" tab=");
        C669790QOz c669790QOz = this.LLILZIL.LLJLILLLLZIIL;
        String enterSearchFrom = null;
        sb.append((c669790QOz == null || (enumC669620QOiLIZIZ = c669790QOz.LIZIZ(this.LLILZ)) == null) ? null : enumC669620QOiLIZIZ.getTabName());
        sb.append(" shopTabPos=");
        sb.append(this.LLILZLL);
        sb.append(" canCollapse=");
        C676920Qgs c676920Qgs = this.LLIZ;
        sb.append(c676920Qgs != null ? c676920Qgs.LIZ : false);
        sb.append(" canUseOverlay=");
        sb.append(this.LL);
        sb.append(" fixEnable=");
        sb.append(this.LLIZLLLIL);
        sb.append(" layoutMode=");
        sb.append(this.LL ? "OverlayForShopTab" : "FixedBelowHeader");
        sb.append(" rootEnterFromType=");
        SearchResultParam searchResultParam = this.LLILZIL.LLJLIL;
        sb.append((searchResultParam == null || (searchEnterParam2 = searchResultParam.getSearchEnterParam()) == null) ? null : Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam2)));
        sb.append(" enterFrom=");
        SearchResultParam searchResultParam2 = this.LLILZIL.LLJLIL;
        if (searchResultParam2 != null && (searchEnterParam = searchResultParam2.getSearchEnterParam()) != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        }
        sb.append(enterSearchFrom);
        sb.append(" reason=");
        if (this.LLIZLLLIL) {
            C676920Qgs c676920Qgs2 = this.LLIZ;
            if (c676920Qgs2 == null || (str = c676920Qgs2.LIZIZ) == null) {
                str = "NonShopTabUsesOuterPadding";
            }
        } else {
            str = "FixDisabledUseOldShopOverlay";
        }
        sb.append(str);
        return sb.toString();
    }
}
