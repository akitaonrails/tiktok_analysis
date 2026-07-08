package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;

/* JADX INFO: renamed from: X.11Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19465611Dq {
    public static JediViewHolderProxyHost LIZ(Fragment fragment, C19EG c19eg) {
        FragmentManager childFragmentManager;
        JediViewHolderProxyHost jediViewHolderProxyHost;
        FragmentManager fragmentManager;
        if (c19eg == null || (childFragmentManager = c19eg.getSupportFragmentManager()) == null) {
            childFragmentManager = fragment.getChildFragmentManager();
        }
        String str = JediViewHolderProxyHost.LLILZIL;
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(str);
        if (!(fragmentLJJJJZI instanceof JediViewHolderProxyHost) || (jediViewHolderProxyHost = (JediViewHolderProxyHost) fragmentLJJJJZI) == null) {
            jediViewHolderProxyHost = new JediViewHolderProxyHost();
            jediViewHolderProxyHost.LL = fragment;
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                fragmentManager.LJZL(new C19773012Xw(jediViewHolderProxyHost, 0), false);
            }
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(jediViewHolderProxyHost, str);
            c19ehLJIIJ.LJIIL();
        }
        return jediViewHolderProxyHost;
    }
}
