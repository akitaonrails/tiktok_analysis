package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0OxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC636100OxE implements InterfaceC1400710mYP {
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        return 0;
    }

    @Override // X.InterfaceC1400710mYP
    public abstract /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme);

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg) {
        return C635990Ox3.LIZIZ(this, i, c19eg);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
        C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        return C635990Ox3.LJ(this, viewHolder);
    }

    public abstract AbstractC1261240ivS onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, InterfaceC1260110itd interfaceC1260110itd);

    @Override // X.InterfaceC1400710mYP
    public C1398630mV3 onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        return null;
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C635990Ox3.LJFF(this, str);
    }

    @Override // X.InterfaceC1400710mYP
    public abstract /* synthetic */ boolean sendCustomRequest(C1255920ims c1255920ims, int i);
}
