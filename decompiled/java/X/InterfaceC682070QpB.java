package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.text.SpannableString;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0QpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC682070QpB {
    void LIZ(FragmentManager fragmentManager);

    boolean LIZIZ();

    C670530QRv LIZJ(C670540QRw c670540QRw);

    void LIZLLL(C19EG c19eg, Fragment fragment, Aweme aweme, String str);

    boolean LJ(String str);

    SpannableString LJFF(Context context, String str, List<? extends Position> list);

    void LJI(RecyclerView recyclerView, List list, ACListenerS165S0100000_31 aCListenerS165S0100000_31);

    boolean LJII(Aweme aweme);

    boolean LJIIIIZZ();

    void LJIIIZ(String str, String str2, String str3);
}
