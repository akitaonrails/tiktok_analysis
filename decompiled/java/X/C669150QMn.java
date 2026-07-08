package X;

import Y.ARunnableS3S0600000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669150QMn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchSugEntity LL;
    public final /* synthetic */ C21415018rM LLILLJJLI;
    public final /* synthetic */ Drawable LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ LinearLayout LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ C21415018rM LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669150QMn(int i, Drawable drawable, View view, LinearLayout linearLayout, C21415018rM c21415018rM, C21415018rM c21415018rM2, SearchSugEntity searchSugEntity) {
        super(0);
        this.LL = searchSugEntity;
        this.LLILLJJLI = c21415018rM;
        this.LLILLL = drawable;
        this.LLILZ = i;
        this.LLILZIL = linearLayout;
        this.LLILZLL = view;
        this.LLIZ = c21415018rM2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        SpannableStringBuilder spannableStringBuilder;
        System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(C0QNF.LIZ(this.LL, this.LLILLJJLI.getContext()));
        C669090QMh c669090QMh = C669090QMh.LIZ;
        Drawable drawable = this.LLILLL;
        int i = this.LLILZ;
        C21415018rM c21415018rM = this.LLILLJJLI;
        c669090QMh.getClass();
        if ((spannableStringBuilderValueOf == null || spannableStringBuilderValueOf.length() == 0) || drawable == null || drawable.getBounds().isEmpty()) {
            spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderValueOf);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderValueOf);
            C419890GdH c419890GdH = new C419890GdH(drawable, 2);
            c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), 0, C444960Hcc.LIZJ(c21415018rM.getContext()));
            spannableStringBuilder.append((CharSequence) "  ");
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, (spannableStringBuilder.length() - 1) - 1, spannableStringBuilder.length() - 1, 18);
        }
        SearchSugEntity searchSugEntity = this.LL;
        Context context = this.LLILLJJLI.getContext();
        c669090QMh.getClass();
        Layout layoutLIZJ = C669090QMh.LIZJ(searchSugEntity, spannableStringBuilder, context, -1, false);
        int lineCount = layoutLIZJ.getLineCount() - 1;
        SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilderValueOf3 = SpannableStringBuilder.valueOf(spannableStringBuilder);
        if (lineCount > 0) {
            String strLIZ = C420930Gex.LIZ(layoutLIZJ.getLineStart(lineCount), layoutLIZJ.getLineEnd(lineCount), spannableStringBuilder);
            if (strLIZ.length() != 0) {
                if (strLIZ.length() <= 2) {
                    spannableStringBuilderValueOf3 = SpannableStringBuilder.valueOf(spannableStringBuilderValueOf2.subSequence(0, spannableStringBuilder.length() - 2));
                } else {
                    Drawable drawable2 = this.LLILLL;
                    C21415018rM c21415018rM2 = this.LLILLJJLI;
                    int i2 = this.LLILZ;
                    int length = spannableStringBuilderValueOf2.length() - 2;
                    int length2 = spannableStringBuilderValueOf2.length() - 1;
                    C419890GdH c419890GdH2 = new C419890GdH(drawable2, 2);
                    c419890GdH2.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), 0, C444960Hcc.LIZJ(c21415018rM2.getContext()));
                    C786410Ut5.q2(spannableStringBuilderValueOf2, c419890GdH2, length, length2, 18);
                    spannableStringBuilderValueOf3 = spannableStringBuilderValueOf2;
                }
            }
        }
        SearchSugEntity searchSugEntity2 = this.LL;
        Context context2 = this.LLILLJJLI.getContext();
        c669090QMh.getClass();
        C09UZ.LIZJ(new ARunnableS3S0600000_10(C669090QMh.LIZJ(searchSugEntity2, spannableStringBuilderValueOf3, context2, -1, false), lineCount > 0 ? null : C669090QMh.LJ(this.LL, this.LLILLJJLI.getContext(), -1), this.LLILZLL, this.LLILZIL, this.LLILLJJLI, this.LLIZ, 0));
        return Unit.LIZ;
    }
}
