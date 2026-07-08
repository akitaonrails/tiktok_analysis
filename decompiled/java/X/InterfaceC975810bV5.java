package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC975810bV5 {
    Text LIZ();

    long LIZIZ();

    void LIZJ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12);

    List<GiftMode> LIZLLL();

    boolean LJ();

    void LJFF(Text text);

    LiveData<GiftMode> LJI();

    GiftModeMeta LJII();

    void LJIIIIZZ(MatchSettingsInfo matchSettingsInfo);

    long LJIIIZ();

    GiftMode LJIIJ();

    void LJIIJJI(int i, boolean z);

    void LJIIL();

    int LJIILIIL();

    long LJIILJJIL();

    void LJIILL(long j);

    MutableLiveData LJIILLIIL();

    GiftMode LJIIZILJ();

    void LJIJ();

    Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> LJIJI();

    GiftMode LJIJJ();

    void LJIJJLI();

    int LJIL();

    MatchSettingsInfo LJJ();

    void LJJI();

    GiftMode LJJIFFI(long j);

    GiftModeMetaV2 LJJII();

    void LJJIII(int i);

    void LJJIIJ(List<GiftMode> list);

    void LJJIIJZLJL(GiftMode giftMode, boolean z, boolean z2);

    boolean LJJIIZ();

    void LJJIIZI(Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> map);

    void LJJIJ(int i);

    int LJJIJIIJI();

    boolean LJJIJIIJIL();

    void LJJIJIL(GiftModeMetaV2 giftModeMetaV2);

    void LJJIJL(GiftModeMeta giftModeMeta);
}
