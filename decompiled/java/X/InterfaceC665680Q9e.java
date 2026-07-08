package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import java.util.List;

/* JADX INFO: renamed from: X.0Q9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC665680Q9e {
    void clearData();

    void resetLoadMoreState();

    void setData(List<SearchUser> list);

    void setDataAfterLoadMore(List<SearchUser> list);

    void setLoadEmptyText(CharSequence charSequence);

    void setLoadEmptyTextColor(Integer num);

    void setLoadMoreListener(C0P6P c0p6p);

    void setShowFooter(boolean z);

    void showLoadMoreEmpty();

    void showLoadMoreError();

    void showLoadMoreLoading();
}
