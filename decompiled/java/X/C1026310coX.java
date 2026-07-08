package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0coX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026310coX implements Serializable {
    public String LL;
    public AwemeRawAd LLILLJJLI;
    public AdlpExtraModel LLILLL;
    public boolean LLILZ;
    public final C1025720cna LLILZIL;
    public C1028100crQ LLILZLL;

    public final AdlpExtraModel getAdlpExtraModel() {
        return this.LLILLL;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.LLILLJJLI;
    }

    public final String getCustomUrl() {
        return this.LL;
    }

    public final C1028100crQ getPopUpCustomConfig() {
        return this.LLILZLL;
    }

    public final C1025720cna getTuxSheetConfig() {
        return this.LLILZIL;
    }

    public final boolean isFromJsb() {
        return this.LLILZ;
    }

    public final void setAdlpExtraModel(AdlpExtraModel adlpExtraModel) {
        this.LLILLL = adlpExtraModel;
    }

    public final void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.LLILLJJLI = awemeRawAd;
    }

    public final void setCustomUrl(String str) {
        this.LL = str;
    }

    public final void setFromJsb(boolean z) {
        this.LLILZ = z;
    }

    public final void setPopUpCustomConfig(C1028100crQ c1028100crQ) {
        this.LLILZLL = c1028100crQ;
    }

    public C1026310coX(String str, AwemeRawAd awemeRawAd, AdlpExtraModel adlpExtraModel, boolean z, C1025720cna c1025720cna, C1028100crQ c1028100crQ) {
        this.LL = str;
        this.LLILLJJLI = awemeRawAd;
        this.LLILLL = adlpExtraModel;
        this.LLILZ = z;
        this.LLILZIL = c1025720cna;
        this.LLILZLL = c1028100crQ;
    }
}
