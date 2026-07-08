package X;

import Y.AObjectS101S0101000_19;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.theater.common.CameoDraftListTextConfig;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1257670iph {
    void LIZ();

    C1255920ims<AbstractC1255880imo<?, ?>> LIZIZ();

    RecyclerView.ViewHolder LIZJ(ViewGroup viewGroup);

    AbstractC20656215sG LIZLLL(C0TGX c0tgx, ViewGroup viewGroup, boolean z, Function0 function0, Function0 function02);

    ProfileListFragment LJ(String str, boolean z);

    void LJFF(RecyclerView.ViewHolder viewHolder, CameoDraftInfo cameoDraftInfo, String str, String str2, CameoDraftListTextConfig cameoDraftListTextConfig, AObjectS101S0101000_19 aObjectS101S0101000_19);

    ProfileListFragment LJI(String str, String str2, String str3, Bundle bundle);

    void LJII(boolean z);

    RecyclerView.ViewHolder LJIIIIZZ(ViewGroup viewGroup);

    ProfileListFragment LJIIIZ(int i, String str, boolean z);

    void LJIIJ(RecyclerView.ViewHolder viewHolder, Aweme aweme, boolean z, boolean z2, C1259450isZ c1259450isZ);
}
