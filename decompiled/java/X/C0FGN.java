package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FGN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGN extends C09AY implements Function1<C387490FHf, C387490FHf> {
    public final /* synthetic */ C0FGO LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FGN(C0FGO c0fgo, String str, int i) {
        super(1);
        this.LL = c0fgo;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C387490FHf invoke(C387490FHf c387490FHf) {
        String str;
        C387490FHf c387490FHf2 = c387490FHf;
        C0FGO c0fgo = this.LL;
        List<C0FGS> list = c0fgo.LLJJJJ;
        List<C0FGZ> list2 = c0fgo.LLJJJJJIL;
        String str2 = this.LLILLJJLI;
        TextStyleModel textStyle = c0fgo.LLJJIJIIJIL.getTextStyle();
        if (textStyle != null) {
            str = textStyle.styleResId;
        } else {
            str = null;
        }
        return C387490FHf.LIZ(c387490FHf2, null, list, list2, Integer.valueOf(this.LLILLL), new C387180FGa(str2, str), false, false, null, null, new C375830EoP(0), null, 0, 3457);
    }
}
