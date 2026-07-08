package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;

/* JADX INFO: renamed from: X.0iRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractActivityC1242660iRU extends BaseActivity {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public volatile MusProfileEditFragment LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractActivityC1242660iRU.class, "musProfileEditFragment", "getMusProfileEditFragment()Lcom/ss/android/ugc/profile/business/ur/ui/MusProfileEditFragment;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MusProfileEditFragment LLLLLZL() {
        MusProfileEditFragment musProfileEditFragment = this.LL;
        if (musProfileEditFragment == null) {
            synchronized (this) {
                musProfileEditFragment = this.LL;
                if (musProfileEditFragment == null) {
                    MusProfileEditFragment musProfileEditFragment2 = (MusProfileEditFragment) getSupportFragmentManager().LJJJJZI("user_profile_edit_fragment");
                    if (musProfileEditFragment2 == null) {
                        musProfileEditFragment2 = new MusProfileEditFragment();
                    } else {
                        musProfileEditFragment2.LLLZLL = true;
                    }
                    this.LL = musProfileEditFragment2;
                    return musProfileEditFragment2;
                }
            }
        }
        return musProfileEditFragment;
    }
}
