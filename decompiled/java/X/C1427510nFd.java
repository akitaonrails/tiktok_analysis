package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0nFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427510nFd extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJI = 0;
    public final C1427540nFg LL;
    public final InterfaceC1426290nDf LLILLJJLI;
    public final ISearchSugHelper LLILLL;
    public final C1361400lX0 LLILZ;
    public SearchSugEntity LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public final float LLIZLLLIL;
    public final C384050F3z LLJ;

    public final C1426830nEX I5() {
        String strSugMobType;
        SearchSugEntity searchSugEntity = this.LLILZIL;
        if (searchSugEntity == null) {
            return null;
        }
        ISearchSugHelper iSearchSugHelper = this.LLILLL;
        String str = (iSearchSugHelper == null || iSearchSugHelper.isSugNoCache(searchSugEntity.LIZIZ)) ? "editing_effect_sug_cache" : "editing_effect_sug";
        String str2 = searchSugEntity.content;
        int i = this.LLILZLL;
        Word word = searchSugEntity.mWord;
        String id = word != null ? word.getId() : null;
        String str3 = this.LLIZ;
        ISearchSugHelper iSearchSugHelper2 = this.LLILLL;
        if (iSearchSugHelper2 == null || (strSugMobType = iSearchSugHelper2.sugMobType(this.LLILZIL)) == null) {
            strSugMobType = "";
        }
        return new C1426830nEX(str, str2, id, str3, i, true, strSugMobType, searchSugEntity.LJI);
    }

    public C1427510nFd(C1427540nFg c1427540nFg, C1426300nDg c1426300nDg) {
        super(c1427540nFg.LL);
        this.LL = c1427540nFg;
        this.LLILLJJLI = c1426300nDg;
        this.LLILLL = (ISearchSugHelper) PluggableExtentionKt.pluggableSpi$default(ISearchSugHelper.class, false, false, false, 14, null);
        this.LLILZ = C1385040m98.LIZ(this.itemView.getContext(), true);
        this.LLIZ = "";
        float fLJ = C11VU.LJ(this.itemView.getContext()) - C11VU.LIZIZ(32.0f, this.itemView.getContext());
        this.LLIZLLLIL = fLJ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        this.LLJ = c384050F3z;
        C427690Gpr.LJ(this.itemView, 0.0f);
        this.LLIZLLLIL = fLJ - C11VU.LIZIZ(44.0f, this.itemView.getContext());
    }
}
