package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.notification.open.component.viewmodel.NoticeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS134S0101000_28;

/* JADX INFO: renamed from: X.0zav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901990zav implements InterfaceC336510DHd, InterfaceC1906690ziV {
    public final C1901980zau LL;
    public final NoticeViewModel LLILLJJLI;

    @Override // X.InterfaceC1906690ziV
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC1906690ziV
    public final void LLJIJIL() {
    }

    public C1901990zav(C1901980zau c1901980zau, NoticeViewModel noticeViewModel) {
        this.LL = c1901980zau;
        this.LLILLJJLI = noticeViewModel;
    }

    @Override // X.InterfaceC1906690ziV
    public final void LLJLLIL(int i, C1242320iQw c1242320iQw) {
        C19EG activity;
        FragmentManager fragmentManager = this.LL.LLIZLLLIL.getFragmentManager();
        if (fragmentManager != null || ((activity = this.LL.LLIZLLLIL.getActivity()) != null && (fragmentManager = activity.getSupportFragmentManager()) != null)) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(R.string.gm7);
            c1247510iZJ.LIZJ = 1;
            c1247510iZJ.LIZ(new AwS134S0101000_28(this, i, 25));
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZJ().show(fragmentManager, "delete_notice");
        }
    }
}
