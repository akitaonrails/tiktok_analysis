package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.PlaylistCollectionPageData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0hBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194200hBK extends C0OFL implements InterfaceC612260Nzs, InterfaceC1141530foN {
    public final FavoriteTabItemV2 LLILLJJLI;

    @Override // X.C0OFL
    public final FavoriteTabItemV2 LIZ() {
        return this.LLILLJJLI;
    }

    public C1194200hBK(C1206210hUh c1206210hUh) {
        this.LLILLJJLI = new FavoriteTabItemV2(new PlaylistCollectionPageData(), a0.LJJJLL(" 0", c1206210hUh.LIZ.getString(2131824969, 0)), "favourite_playlist", "mixes");
    }

    @Override // X.C0OFL
    public final void LIZJ(Lifecycle.Event event) {
        int i = C2020107vj.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                EventBus.LIZLLL().LJJI(this);
                C1548820qPI.LJIIIIZZ("sub_only_playlist_created", this);
                IStateNotifier iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IPlaylistCollectionStateNotifier.class, false, false, false, 14, null);
                if (iStateNotifier != null) {
                    iStateNotifier.removeSubscriber(this);
                    return;
                }
                return;
            }
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("sub_only_playlist_created", this);
        IStateNotifier iStateNotifier2 = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IPlaylistCollectionStateNotifier.class, false, false, false, 14, null);
        if (iStateNotifier2 == null) {
            return;
        }
        iStateNotifier2.addSubscriber(this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "sub_only_playlist_created")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        InterfaceC1871820yoG interfaceC1871820yoG = null;
        if (interfaceC1107590evd2 != null) {
            interfaceC1871820yoG = interfaceC1107590evd2.get("params");
        }
        if ((interfaceC1871820yoG instanceof InterfaceC1107590evd) && (interfaceC1107590evd = (InterfaceC1107590evd) interfaceC1871820yoG) != null) {
            interfaceC1107590evd.getString("mix_id");
        }
        C0OFL.LIZLLL(this.LL, 1);
    }

    @C14EU
    public final void onMixDeletedFromCollectionPage(C1169940gYC c1169940gYC) {
        C0OFL.LIZIZ(this.LL);
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Object obj, EnumC612200Nzm enumC612200Nzm) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            if (zBooleanValue) {
                C0OFL.LIZLLL(this.LL, 1);
            } else {
                C0OFL.LIZIZ(this.LL);
            }
        }
    }
}
