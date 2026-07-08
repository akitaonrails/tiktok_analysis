package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;

/* JADX INFO: renamed from: X.0hbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1210250hbD implements InterfaceC1603360rpG {
    public C431720GwM LL;
    public final C1252490ihL LLILLJJLI = new C1252490ihL();
    public C728560Shy LLILLL = new C728560Shy();

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return i + LivePreCreateNextRoomPlayer.ENABLE;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILLL.LJIIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        this.LLILLL.LIZ();
        this.LLILLL.LJIILJJIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LL = new C431720GwM((DetailFragmentPanel) interfaceC1209780haS);
        C728560Shy c728560Shy = this.LLILLL;
        c728560Shy.LLILLJJLI = interfaceC1209780haS;
        c728560Shy.LJIIJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        C431720GwM c431720GwM = this.LL;
        if (c431720GwM != null && c431720GwM.get() != 0) {
            ((InterfaceC1209780haS) this.LL.get()).S();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int i3;
        boolean z2;
        boolean zLJI = MethodIDManager.LJI(137892);
        if (!C1359600lU6.LIZJ()) {
            if (TextUtils.isEmpty(c2189821An6.getUpvoteId()) && TextUtils.isEmpty(c2189821An6.getCid())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ("notification_page".equals(c2189821An6.getEventType()) && !z2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = !TextUtils.isEmpty(c2189821An6.getUpvoteId()) ? 1 : 0;
        }
        this.LLILLL.LIZJ(c2189821An6.getAid(), c2189821An6.getEventType(), Integer.valueOf(i3), c2189821An6.getTranslatorId());
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
