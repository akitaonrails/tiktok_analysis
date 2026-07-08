package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487150J8n extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C487150J8n() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        C512350K7l c512350K7l = C512350K7l.LIZ;
        View view = c0rf02.LIZ;
        String str = c0rf02.LJIIIZ;
        Fragment fragment = c0rf02.LIZJ;
        c512350K7l.getClass();
        return new SearchLiveCardViewHolder(view, fragment, str);
    }
}
