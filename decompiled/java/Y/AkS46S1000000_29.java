package Y;

import X.C1105304Tz;
import X.C11NZ;
import X.C1799490wvb;
import X.C19641511sz;
import X.C19651811ue;
import X.C19652211ui;
import X.C19652811uo;
import X.C20467080b;
import X.EnumC1430380nKG;
import X.EnumC1988707qf;
import X.InterfaceC1487280oo2;
import X.InterfaceC1799500wvc;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.Status;
import com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base.ArticleStickerContentCheckResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AkS46S1000000_29 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public AkS46S1000000_29(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS46S1000000_29 akS46S1000000_29, Object obj) {
        boolean z;
        String str;
        ArticleStickerContentCheckResponse articleStickerContentCheckResponse = (ArticleStickerContentCheckResponse) obj;
        Integer num = articleStickerContentCheckResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = akS46S1000000_29.s0;
        if (z) {
            str = null;
        } else {
            str = articleStickerContentCheckResponse.statusMessage;
        }
        return new C19641511sz(str2, z, str);
    }

    public static final Object apply$1(AkS46S1000000_29 akS46S1000000_29, Object obj) {
        return new C19641511sz(akS46S1000000_29.s0, false, C20467080b.LIZIZ(R.string.m25));
    }

    public static final Object apply$2(AkS46S1000000_29 akS46S1000000_29, Object obj) {
        Status status = (Status) obj;
        String str = akS46S1000000_29.s0;
        boolean zLJFF = Intrinsics.LJFF(status.statusCode, CardStruct.IStatusCode.DEFAULT);
        String str2 = status.statusMessage;
        if (str2 == null || str2.length() == 0) {
            status.statusMessage = C20467080b.LIZIZ(R.string.m25);
        }
        return new C19652811uo(str, zLJFF, status, Intrinsics.LJFF(status.statusCode, "3004101"));
    }

    public static final Object apply$3(AkS46S1000000_29 akS46S1000000_29, Object obj) {
        C19652811uo c19652811uo = (C19652811uo) obj;
        if (c19652811uo.LIZIZ) {
            InterfaceC1799500wvc.LIZ.getClass();
            return C1799490wvb.LIZ().LIZ(EnumC1430380nKG.NEWS.getTYPE(), EnumC1988707qf.LINK_CHECK.getValue(), akS46S1000000_29.s0, null).LJJJJZI(new AkS46S1000000_29(akS46S1000000_29.s0, 2));
        }
        return C11NZ.LJJJJZ(c19652811uo);
    }

    public static final Object apply$4(AkS46S1000000_29 akS46S1000000_29, Object obj) {
        C19652211ui c19652211ui = (C19652211ui) obj;
        String strLIZIZ = C19651811ue.LIZIZ(akS46S1000000_29.s0);
        if (c19652211ui.LIZIZ && ((Boolean) C1105304Tz.LIZ.getValue()).booleanValue()) {
            if (strLIZIZ.length() == 0) {
                return C11NZ.LJJJJZ(new C19652211ui(""));
            }
            InterfaceC1799500wvc.LIZ.getClass();
            return C1799490wvb.LIZ().LIZ(EnumC1430380nKG.NEWS.getTYPE(), EnumC1988707qf.TITLE_CHECK.getValue(), null, strLIZIZ).LJJJJZI(new AkS107S1100000_29(strLIZIZ, c19652211ui, 0));
        }
        return C11NZ.LJJJJZ(c19652211ui);
    }
}
