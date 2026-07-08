package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC652420PiS extends AbstractC656440Pow {
    public final String LLILZ;
    public C653660PkS LLILZIL;
    public C654590Plx LLILZLL;
    public final List<C655440PnK> LLIZ;

    public abstract void LLLI(List<? extends Aweme> list, SearchCardInfo searchCardInfo, Long l, boolean z, String str);

    public AbstractC652420PiS(RecyclerView recyclerView) {
        super(recyclerView);
        this.LLILZ = "";
        this.LLIZ = new ArrayList();
    }
}
