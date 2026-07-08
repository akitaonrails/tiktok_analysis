package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0QAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C666130QAx implements InterfaceC1603360rpG {
    public final String LL;
    public final C683690Qrn LLILLJJLI = new C683690Qrn(1);
    public final C666120QAw LLILLL = new C666120QAw();

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public int getPageType(int i) {
        return i + LivePreCreateNextRoomPlayer.ENABLE;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return this.LLILLJJLI.getData() == null || C086I.LIZIZ(this.LLILLJJLI.getData().items);
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

    public C666130QAx(String str) {
        String strLIZIZ;
        if (TextUtils.isEmpty(str)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(str);
            sbLIZ.append(e3.f);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LL = strLIZIZ;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        C666120QAw c666120QAw = this.LLILLL;
        c666120QAw.LLILLJJLI = interfaceC1209780haS;
        c666120QAw.LJIIJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        C666120QAw c666120QAw;
        T t;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ == null) {
            awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Ar(str);
        }
        if (awemeLLILZ != null && (t = (c666120QAw = this.LLILLL).LL) != 0 && t.getData() != null && ((BatchDetailList) c666120QAw.LL.getData()).items != null) {
            ((BatchDetailList) c666120QAw.LL.getData()).items.remove(awemeLLILZ);
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILLL.LIZJ(this.LL, c2189821An6.getPushParams(), c2189821An6.getEventType());
    }
}
