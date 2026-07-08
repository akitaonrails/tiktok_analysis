package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* JADX INFO: renamed from: X.0QTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671030QTt extends RecyclerView.ViewHolder implements C0QUA {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final InterfaceC425440GmE LL;
    public final C0QU6 LLILLJJLI;
    public SearchSugEntity LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public C1608500rxY LLJ;
    public final String LLJI;
    public final int LLJIJIL;
    public final FrameLayout LLJILJIL;
    public final C1610770s1D LLJILJILJ;
    public final C1610670s13 LLJILLL;
    public final TuxIconView LLJJ;
    public final C429940GtU LLJJI;
    public final LinearLayout LLJJIII;
    public final View LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final C425430GmD LLJJIJIL;
    public final FrameLayout LLJJJ;

    @Override // X.C0QUA
    public final void onViewDetachedFromWindow() {
        this.LLILZLL = false;
        C1608500rxY c1608500rxY = this.LLJ;
        if (c1608500rxY != null) {
            c1608500rxY.LJIIIIZZ();
        }
    }

    @Override // X.C0QUA
    public final void onViewAttachedToWindow() {
        ISearchSugContextAbility iSearchSugContextAbilityLIZJ;
        C670830QSz c670830QSzPD2;
        ISearchSugContextAbility iSearchSugContextAbilityLIZJ2;
        C670830QSz c670830QSzPD22;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(C946803n0.LIZ(this.itemView), C1388190mED.LIZIZ(this.itemView.getContext()));
        this.LLILZLL = true;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        String str = this.LLIZLLLIL;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LLILLL;
        String str2 = this.LLJI;
        String str3 = this.LLIZ;
        C0QU6 c0qu6 = this.LLILLJJLI;
        int i = (c0qu6 == null || (iSearchSugContextAbilityLIZJ2 = c0qu6.LIZJ()) == null || (c670830QSzPD22 = iSearchSugContextAbilityLIZJ2.pD2()) == null) ? 0 : c670830QSzPD22.LIZ;
        C0QU6 c0qu62 = this.LLILLJJLI;
        C670100QQe.LJ(fragmentLIZ, str, layoutPosition, searchSugEntity, str2, str3, i, c0qerLIZJ, (c0qu62 == null || (iSearchSugContextAbilityLIZJ = c0qu62.LIZJ()) == null || (c670830QSzPD2 = iSearchSugContextAbilityLIZJ.pD2()) == null) ? null : c670830QSzPD2.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C671030QTt(android.view.View r6, X.C0QT7 r7, X.C0QTK r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671030QTt.<init>(android.view.View, X.0QT7, X.0QTK, java.lang.String):void");
    }
}
