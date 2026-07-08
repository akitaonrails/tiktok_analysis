package X;

import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.SearchPovInteractionPowerCell;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685960QvS extends C09AY implements Function1<C1A5S, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1A5Q LLILLJJLI;
    public final /* synthetic */ SearchPovInteractionPowerCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685960QvS(boolean z, C1A5Q c1a5q, SearchPovInteractionPowerCell searchPovInteractionPowerCell) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c1a5q;
        this.LLILLL = searchPovInteractionPowerCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1A5S c1a5s) {
        String str;
        String str2;
        C683220Qr2 c683220Qr2Invoke;
        C682270QpV c682270QpV;
        Function0<C683220Qr2> function0;
        if (c1a5s == C1A5S.DISLIKE) {
            if (this.LL) {
                boolean z = C0Q9J.LIZ;
                C1A5Q c1a5q = this.LLILLJJLI;
                C684910Qtl c684910Qtl = this.LLILLL.LL;
                if (c684910Qtl != null && (c682270QpV = c684910Qtl.LLILLJJLI) != null && (function0 = c682270QpV.buildFeedbackModel) != null) {
                    c683220Qr2Invoke = function0.invoke();
                } else {
                    c683220Qr2Invoke = null;
                }
                C684120QsU.LIZIZ(c1a5q, c683220Qr2Invoke, false, null, null, 28);
            }
            str = "click_dislike";
        } else {
            str = "click_dislike_cancel";
        }
        C0PXJ c0pxj = C0PXJ.LIZ;
        Map<String, String> mapLLLFZ = this.LLILLL.LLLFZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchPovInteractionPowerCell searchPovInteractionPowerCell = this.LLILLL;
        linkedHashMap.put("button_type", str);
        linkedHashMap.put("is_page", "1");
        C684910Qtl c684910Qtl2 = searchPovInteractionPowerCell.LL;
        if (c684910Qtl2 != null && (str2 = c684910Qtl2.LL) != null) {
            linkedHashMap.put("unique_id", str2);
        }
        c0pxj.getClass();
        C0PXJ.LJIIL(mapLLLFZ, linkedHashMap);
        return Unit.LIZ;
    }
}
