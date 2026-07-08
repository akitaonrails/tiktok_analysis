package X;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;

/* JADX INFO: renamed from: X.0lZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363070lZh extends C1362890lZP {
    public final InterfaceC1363120lZm LIZJ;
    public final FrameLayout LIZLLL;
    public final RecyclerView LJ;
    public final LinearLayout LJFF;
    public final InterfaceC1364520lc2 LJI;
    public final List<IMContact> LJII;
    public final C788580Uwa LJIIIIZZ;

    public C1363070lZh(Activity activity, C1372810lpP c1372810lpP, SharePackage sharePackage, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, InterfaceC1364520lc2 interfaceC1364520lc2, List list, C1372840lpS c1372840lpS, C788580Uwa c788580Uwa) {
        super(activity, sharePackage);
        this.LIZJ = c1372810lpP;
        this.LIZLLL = frameLayout;
        this.LJ = recyclerView;
        this.LJFF = linearLayout;
        this.LJI = interfaceC1364520lc2;
        this.LJII = list;
        this.LJIIIIZZ = c788580Uwa;
    }
}
