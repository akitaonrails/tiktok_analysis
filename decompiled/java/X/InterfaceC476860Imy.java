package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Imy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC476860Imy {
    FeedItem LIZIZ();

    void LIZJ(C0IVA c0iva);

    boolean LIZLLL();

    int LJ(EnumC471790Ien enumC471790Ien);

    void LJFF(C0IVA c0iva);

    boolean LJI();

    void LJII();

    List<FeedItem> LJIIIIZZ();

    int LJIIIZ(EnumC471790Ien enumC471790Ien);

    boolean LJIIJ();

    void LJIIJJI(LifecycleOwner lifecycleOwner, boolean z, EnumC471720Ieg enumC471720Ieg);

    BaseListResponse<FeedItem, FeedExtra> LJIIL(EnumC471790Ien enumC471790Ien, Boolean bool);

    void LJIILIIL(C0IVB c0ivb, EnumC471750Iej enumC471750Iej);

    int LJIILJJIL();

    void LJIILL();

    Pair<Integer, Pair<Integer, Integer>> LJIILLIIL(GuestApplyInfo guestApplyInfo, boolean z);

    int LJIIZILJ(EnumC471790Ien enumC471790Ien);

    void LJIJ(EnumC471750Iej enumC471750Iej);

    int LJIJI(EnumC471790Ien enumC471790Ien);

    void LJIJJ();

    boolean hasLivePermission();
}
