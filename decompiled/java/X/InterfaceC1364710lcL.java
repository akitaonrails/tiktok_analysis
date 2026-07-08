package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.data.loader.FetchShareSortedListRequest;
import com.ss.android.ugc.aweme.internalshare.impl.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitRequest;
import com.ss.android.ugc.aweme.internalshare.impl.ui.LongPressShareWidget;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1364710lcL {
    View LIZ(Context context, int i, ViewGroup viewGroup);

    void LIZIZ(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair);

    void LIZJ(C19EG c19eg);

    Object LIZLLL(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, List<? extends IMContact> list, boolean z6, InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn);

    C1365140ld2 LJ(EditText editText, InterfaceC1631630sYr interfaceC1631630sYr, ViewGroup viewGroup);

    InterfaceC1366250lep LJFF(Activity activity, SharePackage sharePackage, IMContact iMContact, Set set, boolean z, InterfaceC1368680lik interfaceC1368680lik, boolean z2, C1214170hhX c1214170hhX, boolean z3, boolean z4, Boolean bool, boolean z5, boolean z6, InterfaceC1362600lYw interfaceC1362600lYw);

    Map<String, Boolean> LJI(String str);

    void LJII(Context context, int[] iArr, AwemeSharePackage awemeSharePackage, AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212, AwS387S0200000_21 awS387S0200000_21, Fragment fragment);

    C1214160hhW LJIIIIZZ(Context context, Integer num, String str, C1214170hhX c1214170hhX, boolean z, boolean z2);

    C19719912Dl LJIIIZ();

    InterfaceC1370520lli LJIIJ(String str, String str2, C1371590lnR c1371590lnR, Activity activity);

    void LJIIJJI(SharePackage sharePackage, List list, String str, InterfaceC1362600lYw interfaceC1362600lYw);

    boolean LJIIL(Aweme aweme);

    void LJIILIIL(View view, C19EG c19eg);

    boolean LJIILJJIL(RemoteImageView remoteImageView, TuxIconView tuxIconView, SharePackage sharePackage);

    List<SharePanelItemInfo> LJIILL(Integer num);

    boolean LJIILLIIL(Aweme aweme);

    C1229130i5f LJIIZILJ(SharePackage sharePackage);

    InternalShareExpHitRequest LJIJ();

    void LJIJI(String str, int i, InterfaceC1366080leY interfaceC1366080leY);

    void LJIJJ(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, InterfaceC1367420lgi interfaceC1367420lgi, InterfaceC1367420lgi interfaceC1367420lgi2);

    void LJIJJLI(Aweme aweme);

    void LJIL(boolean z);

    DownloadAndShareFragment LJJ(SharePackage sharePackage);

    ViewOnTouchListenerC1364750lcP LJJI();

    boolean LJJIFFI();

    boolean LJJII(Aweme aweme);

    boolean LJJIII(LifecycleOwner lifecycleOwner);

    Object LJJIIJ(InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn);

    void LJJIIJZLJL(C19EG c19eg, BaseSharePackage baseSharePackage);

    void LJJIIZ(int i, InterfaceC1366080leY interfaceC1366080leY, String str, String str2);

    C1363050lZf LJJIIZI(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z);

    LongPressShareWidget LJJIJ(C1363070lZh c1363070lZh, C1364510lc1 c1364510lc1);

    InterfaceC1356390lOv LJJIJIIJI(Fragment fragment, SharePackage sharePackage, C13BV c13bv, InterfaceC1362600lYw interfaceC1362600lYw, InterfaceC1356370lOt interfaceC1356370lOt);

    boolean LJJIJIIJIL(Integer num);

    Pair<FrameLayout, InterfaceC1366280les> LJJIJIL(Context context, C1371590lnR c1371590lnR, Fragment fragment, InterfaceC1362600lYw interfaceC1362600lYw);

    ViewOnTouchListenerC1364750lcP LJJIJL();

    void LJJIJLIJ(int i, Aweme aweme);

    int LJJIL();

    void LJJIZ(List<? extends IMContact> list);

    C1362860lZM LJJJ(C1362880lZO c1362880lZO, C1364530lc3 c1364530lc3);

    Pair LJJJI(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, LifecycleOwner lifecycleOwner, C19EG c19eg, InterfaceC1368050lhj interfaceC1368050lhj, C460910I5p c460910I5p);

    boolean LJJJIL();

    C1362920lZS LJJJJ(C1362890lZP c1362890lZP);

    FetchShareSortedListRequest LJJJJI();

    void LJJJJIZL(List<String> list, List<String> list2);

    C19719912Dl LJJJJJ();

    C594480NTi LJJJJJL(SessionInfo sessionInfo);

    Pair<InterfaceC1356400lOw, InterfaceC1356370lOt> LJJJJL(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, boolean z, boolean z2, boolean z3, LifecycleOwner lifecycleOwner, InterfaceC1363760lao interfaceC1363760lao, C1363630lab c1363630lab, boolean z4, C1362230lYL c1362230lYL, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1363370laB interfaceC1363370laB, EnumC1364450lbv enumC1364450lbv);

    void LJJJJLI(View view, C19EG c19eg, String str);

    C1364640lcE LJJJJLL(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z, boolean z2);
}
