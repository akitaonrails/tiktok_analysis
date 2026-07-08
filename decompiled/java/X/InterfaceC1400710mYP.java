package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0mYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1400710mYP extends Serializable {
    C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme);

    C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i);

    C1255920ims getPresenter(int i, C19EG c19eg);

    C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i);

    void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh);

    boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder);

    AbstractC1261240ivS onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd);

    void onJumpToDetail(String str);

    boolean sendCustomRequest(C1255920ims c1255920ims, int i);
}
