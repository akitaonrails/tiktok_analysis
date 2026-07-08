package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773012Xw extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (1 - this.$t != 0) {
            super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        } else {
            onFragmentViewCreated$0(this, fragmentManager, fragment, view, bundle);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        switch (this.$t) {
            case 0:
                onFragmentViewDestroyed$0(this, fragmentManager, fragment);
                break;
            case 1:
                onFragmentViewDestroyed$1(this, fragmentManager, fragment);
                break;
            default:
                super.onFragmentViewDestroyed(fragmentManager, fragment);
                break;
        }
    }

    public C19773012Xw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentViewDestroyed$0(C19773012Xw c19773012Xw, FragmentManager fragmentManager, Fragment fragment) {
        if (fragment == ((JediViewHolderProxyHost) c19773012Xw.l0).LL) {
            fragmentManager.LLIILZL(c19773012Xw);
            C19EH c19ehLJIIJ = fragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ((JediViewHolderProxyHost) c19773012Xw.l0);
            c19ehLJIIJ.LJIIL();
            JediViewHolderProxyHost jediViewHolderProxyHost = (JediViewHolderProxyHost) c19773012Xw.l0;
            Iterator<Function0<Unit>> it2 = jediViewHolderProxyHost.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
            jediViewHolderProxyHost.LLILLL.clear();
        }
    }

    public static final void onFragmentViewDestroyed$1(C19773012Xw c19773012Xw, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        ((AbstractC214814194y) c19773012Xw.l0).fragmentList.remove(fragment);
    }

    public static final void onFragmentViewCreated$0(C19773012Xw c19773012Xw, FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        try {
            if (Intrinsics.LJFF(C535690Kzf.LIZ(view), (AbstractC214814194y) c19773012Xw.l0) && !((AbstractC214814194y) c19773012Xw.l0).fragmentList.contains(fragment)) {
                ((AbstractC214814194y) c19773012Xw.l0).fragmentList.add(fragment);
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
