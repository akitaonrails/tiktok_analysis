package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746180TOu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ AdEntryShareSheetFragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C746180TOu(Function0<Unit> function0, int i, AdEntryShareSheetFragment adEntryShareSheetFragment, boolean z) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = i;
        this.LLILLL = adEntryShareSheetFragment;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LLILLJJLI, "cta_clicked");
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(this.LLILLL.LL);
        c2344009Gk.LJ(awemeRawAdLJJIJLIJ != null ? awemeRawAdLJJIJLIJ.getAdId() : null, "ad_id");
        C20684815ws.LJIILLIIL("ads_transparency_center_cell_click", c2344009Gk.LIZ);
        if (this.LLILZ) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this.LLILLL, C343970De7.LIZ);
        }
        return Unit.LIZ;
    }
}
