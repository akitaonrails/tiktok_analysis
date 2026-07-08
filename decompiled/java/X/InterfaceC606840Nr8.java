package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Nr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC606840Nr8 {
    void LJIIJJI(String str);

    Aweme LJJIJIIJIL();

    C0SZ8 LJJIJIL(String str);

    Aweme LJJJLL(C0SZ8 c0sz8);

    IBaseListFragmentPanel LJJLIIIJJIZ();

    Aweme LJJLIIIJLJLI();

    void LJLJL(InterfaceC581420MrE interfaceC581420MrE);

    Aweme LLILLIZIL();

    Context getContext();

    String getEnterMethod();

    String getEventType();

    HashMap<String, String> getExtraParams();

    Fragment getFragment();

    int getPageType();
}
