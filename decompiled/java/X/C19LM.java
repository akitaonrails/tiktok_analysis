package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.widget.WidgetHost;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleRootFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19LM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LM extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        if (1 - this.$t != 0) {
            super.onFragmentAttached(fragmentManager, fragment, context);
        } else {
            onFragmentAttached$0(this, fragmentManager, fragment, context);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        if (this.$t != 0) {
            super.onFragmentViewDestroyed(fragmentManager, fragment);
        } else {
            onFragmentViewDestroyed$0(this, fragmentManager, fragment);
        }
    }

    public C19LM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentViewDestroyed$0(C19LM c19lm, FragmentManager fragmentManager, Fragment fragment) {
        if (fragment == ((WidgetHost) c19lm.l0).LL) {
            fragmentManager.LLIILZL(c19lm);
            C19EH c19ehLJIIJ = fragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ((WidgetHost) c19lm.l0);
            c19ehLJIIJ.LJIIL();
            WidgetHost widgetHost = (WidgetHost) c19lm.l0;
            Iterator<Function0<Unit>> it2 = widgetHost.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
            widgetHost.LLILZIL.clear();
        }
    }

    public static final void onFragmentAttached$0(C19LM c19lm, FragmentManager fragmentManager, Fragment fragment, Context context) {
        SAFTikTokFragment sAFTikTokFragment;
        super.onFragmentAttached(fragmentManager, fragment, context);
        Fragment fragmentLJJJJZ = ((FlexibleRootFragment) c19lm.l0).getChildFragmentManager().LJJJJZ(R.id.icg);
        FlexibleRootFragment flexibleRootFragment = (FlexibleRootFragment) c19lm.l0;
        if (fragmentLJJJJZ instanceof SAFTikTokFragment) {
            sAFTikTokFragment = (SAFTikTokFragment) fragmentLJJJJZ;
        } else {
            sAFTikTokFragment = null;
        }
        flexibleRootFragment.LLJJI = sAFTikTokFragment;
        flexibleRootFragment.iS(fragmentLJJJJZ);
        fragmentManager.LLIILZL(c19lm);
        ((FlexibleRootFragment) c19lm.l0).LLJJJJJIL = null;
    }
}
