package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;

/* JADX INFO: renamed from: X.0zME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892880zME extends AbstractC1542200qEc {
    public final Long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public boolean LLILZIL = true;
    public String LLILZLL = "";
    public boolean LLIZ = true;
    public PoiThirdPartyViewModel LLIZLLLIL;
    public SparkContext LLJ;
    public String LLJI;
    public Long LLJIJIL;
    public String LLJILJIL;

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, java.lang.CharSequence, java.lang.String] */
    @Override // X.AbstractC1537870q7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(X.InterfaceC1541990qEH r22) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892880zME.LJLIIIL(X.0qEH):void");
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        SparkActivity sparkActivityLIZ;
        this.LLJ = sparkContext;
        PoiThirdPartyViewModel poiThirdPartyViewModel = null;
        if (sparkContext != null) {
            sparkActivityLIZ = C1893200zMk.LIZ(sparkContext);
        } else {
            sparkActivityLIZ = null;
        }
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LLIZLLLIL = poiThirdPartyViewModel;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLIZ = true;
        if (this.LLILZLL.length() == 0) {
            this.LLILZLL = str;
            this.LLJIJIL = Long.valueOf(System.currentTimeMillis());
            PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLIZLLLIL;
            if (poiThirdPartyViewModel != null) {
                poiThirdPartyViewModel.LLIZLLLIL = this.LLILZLL;
            }
        }
    }

    public C1892880zME(Long l, String str, String str2) {
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLIZLLLIL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.LLILZ = c1542120qEU.LIZ;
            poiThirdPartyViewModel.LLILZIL = c1542120qEU.LIZIZ;
            poiThirdPartyViewModel.LLILZLL = c1542120qEU.LIZJ;
            poiThirdPartyViewModel.LLIZ = c1542120qEU.LIZLLL;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        this.LLIZ = false;
        this.LLJI = str2;
    }
}
