package X;

import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681010QnT implements InterfaceC1891350zJl {
    public final SearchSugEntity LL;
    public final InterfaceC681060QnY LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C681010QnT) {
            return Intrinsics.LJFF(this.LL.content, ((C681010QnT) interfaceC1891350zJl).LL.content);
        }
        return false;
    }

    public C681010QnT(SearchSugEntity searchSugEntity, SearchMusicSugFragment searchMusicSugFragment) {
        this.LL = searchSugEntity;
        this.LLILLJJLI = searchMusicSugFragment;
    }
}
