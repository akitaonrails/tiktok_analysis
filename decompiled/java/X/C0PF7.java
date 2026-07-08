package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;

/* JADX INFO: renamed from: X.0PF7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0PF7 {
    public static final C0PF6 LIZ = C0PF6.LIZ;

    SearchCardViewHolder LIZ(Context context, ViewGroup viewGroup);

    int LJFF();

    ISearchCardProtocol<InterfaceC594520NTm> getProtocol();

    int getViewType();
}
