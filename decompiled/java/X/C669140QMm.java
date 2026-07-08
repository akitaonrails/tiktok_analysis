package X;

import Y.ARunnableS43S0300000_10;
import android.content.Context;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669140QMm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchSugEntity LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ LinearLayout LLILZ;
    public final /* synthetic */ C21415018rM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669140QMm(SearchSugEntity searchSugEntity, Context context, float f, LinearLayout linearLayout, C21415018rM c21415018rM) {
        super(0);
        this.LL = searchSugEntity;
        this.LLILLJJLI = context;
        this.LLILLL = f;
        this.LLILZ = linearLayout;
        this.LLILZIL = c21415018rM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        System.currentTimeMillis();
        CharSequence charSequenceLIZ = C0QNF.LIZ(this.LL, this.LLILLJJLI);
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = (int) this.LLILLL;
        c444830HcP.LIZLLL = false;
        c444830HcP.LJIILIIL(charSequenceLIZ);
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJIIIZ(1);
        c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
        C669090QMh c669090QMh = C669090QMh.LIZ;
        Context context = this.LLILLJJLI;
        c669090QMh.getClass();
        c444830HcP.LJIILJJIL(C669090QMh.LJI(context));
        c444830HcP.LJII(31);
        C09UZ.LIZJ(new ARunnableS43S0300000_10(c444830HcP.LIZIZ(), this.LLILZIL, this.LLILZ, 13));
        return Unit.LIZ;
    }
}
