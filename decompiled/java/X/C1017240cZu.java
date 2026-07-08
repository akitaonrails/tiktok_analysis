package X;

import android.view.ViewStub;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdCipInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017240cZu extends C1029530ctj {
    public EnumC993260bxE LIZ;

    public static EnumC993260bxE LIZJ(InterfaceC1029540ctk interfaceC1029540ctk) {
        AdCipInfo cipInfo;
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Aweme aweme6;
        Aweme aweme7;
        AwemeRawAd awemeRawAd;
        Aweme aweme8;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        if (!(interfaceC1029540ctk instanceof C1017250cZv)) {
            return EnumC993260bxE.LL;
        }
        C1017250cZv c1017250cZv = (C1017250cZv) interfaceC1029540ctk;
        Aweme aweme9 = c1017250cZv.LIZ;
        AwemeRawAd awemeRawAd4 = null;
        if (aweme9 != null && (awemeRawAd3 = aweme9.getAwemeRawAd()) != null) {
            cipInfo = awemeRawAd3.getCipInfo();
        } else {
            cipInfo = null;
        }
        if (cipInfo != null) {
            return EnumC993260bxE.LLILLL;
        }
        if (!Intrinsics.LJFF(C1017290cZz.LIZ, "click_app_full_screen_ad") && !Intrinsics.LJFF(C1017290cZz.LIZ, "scroll_to_slide")) {
            z = false;
        } else {
            z = true;
        }
        Aweme aweme10 = c1017250cZv.LIZ;
        if (aweme10 != null) {
            awemeRawAd4 = aweme10.getAwemeRawAd();
        }
        if ((C1017180cZo.LIZJ(awemeRawAd4) && ((aweme8 = c1017250cZv.LIZ) == null || (awemeRawAd2 = aweme8.getAwemeRawAd()) == null || awemeRawAd2.getAdLive() == null)) || (((aweme = c1017250cZv.LIZ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LIZ(awemeRawAd)) || (((aweme2 = c1017250cZv.LIZ) != null && C1017070cZd.LJJLIIIJJI(aweme2, false)) || (((aweme3 = c1017250cZv.LIZ) != null && C1017070cZd.LJJLIIIJILLIZJL(aweme3, z)) || (((aweme4 = c1017250cZv.LIZ) != null && C1017070cZd.LJJZ(aweme4, "homepage_ad", "button")) || (((aweme5 = c1017250cZv.LIZ) != null && C1017070cZd.LJJLIIIJJIZ(aweme5)) || (((aweme6 = c1017250cZv.LIZ) != null && C1017070cZd.LIZIZ(aweme6)) || ((aweme7 = c1017250cZv.LIZ) != null && C1017070cZd.LJIIIZ(aweme7))))))))) {
            return EnumC993260bxE.LLILLJJLI;
        }
        return EnumC993260bxE.LL;
    }

    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final InterfaceC988160bp0 LIZ(InterfaceC1029540ctk interfaceC1029540ctk) {
        if (interfaceC1029540ctk instanceof C1017250cZv) {
            EnumC993260bxE enumC993260bxELIZJ = LIZJ(interfaceC1029540ctk);
            this.LIZ = enumC993260bxELIZJ;
            int iOrdinal = enumC993260bxELIZJ.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return new C1017800cao();
                    }
                    throw new C1954807lC();
                }
                return new C1017670cab();
            }
            ViewStub viewStub = ((C1017250cZv) interfaceC1029540ctk).LIZIZ;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.e9s);
                return new C1017680cac((LinearLayout) C786410Ut5.LJLLLL(viewStub));
            }
            return null;
        }
        return null;
    }

    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final boolean O(C1017250cZv c1017250cZv) {
        if (this.LIZ == null || LIZJ(c1017250cZv) != this.LIZ) {
            return true;
        }
        return false;
    }
}
