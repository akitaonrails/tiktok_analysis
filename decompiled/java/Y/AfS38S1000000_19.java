package Y;

import X.C09JN;
import X.C1839820xye;
import X.C1C7U;
import X.C2188811AlT;
import X.C727890Sgt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes20.dex */
public class AfS38S1000000_19 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS38S1000000_19(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }

    public static final void accept$0(AfS38S1000000_19 afS38S1000000_19, Object obj) {
        C1C7U.LIZ("TranslationLanguageViewModel@2d2e.updateSelectedTranslationLanguage$disposable$1");
        C1839820xye.LIZ().LIZJ(afS38S1000000_19.s0);
        C1C7U.LIZIZ("TranslationLanguageViewModel@2d2e.updateSelectedTranslationLanguage$disposable$1");
    }

    public static final void accept$1(AfS38S1000000_19 afS38S1000000_19, Object obj) {
        String str = afS38S1000000_19.s0;
        Aweme aweme = (Aweme) obj;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch user(");
        sbLIZ.append(str);
        sbLIZ.append(") story success.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("AwemeModel", strLIZIZ);
        if (aweme.getUserStory() != null) {
            aweme.getUserStory().setTotalVV(0L);
        }
    }
}
