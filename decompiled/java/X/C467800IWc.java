package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0IWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467800IWc {
    public static final C467800IWc LJIJ = C467810IWd.LIZ;
    public static final String LJIJI = "click";
    public static final String LJIJJ = "swipe";
    public static final String LJIJJLI = "is_esports";
    public static final String LJIL = "screen_type";
    public int LIZ;
    public FeedExtra LIZIZ;
    public long LJI;
    public long LJII;
    public String LJIIIIZZ;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final Map<Long, String> LIZJ = new LinkedHashMap();
    public String LIZLLL = "scroll";
    public String LJ = "drawer";
    public String LJFF = LJIJJ;
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public final Map<String, Boolean> LJIIJJI = new LinkedHashMap();
    public String LJIIL = "";
    public String LJIILL = "";
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(382));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(381));

    public final void LIZ() {
        this.LIZIZ = null;
        this.LJI = 0L;
        this.LIZ = 0;
        ((Vector) this.LJIILLIIL.getValue()).clear();
        ((HashSet) this.LJIIZILJ.getValue()).clear();
        this.LIZLLL = "scroll";
        this.LJ = "drawer";
        this.LJII = 0L;
        this.LJIIIIZZ = null;
        C467820IWe.LIZLLL().clear();
        ((LinkedHashMap) this.LJIIJJI).clear();
        this.LJIILIIL = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r3 = this;
            java.lang.String r2 = r3.LJIIIZ
            int r0 = r2.hashCode()
            java.lang.String r1 = ""
            switch(r0) {
                case -885429821: goto Lc;
                case -413485602: goto L17;
                case -338411386: goto L22;
                case 866925548: goto L35;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "game_drawer_drops"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "more_drops"
            return r1
        L17:
            java.lang.String r0 = "game_drawer"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "esports"
            return r1
        L22:
            java.lang.String r0 = "game_drawer_is_game"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting.INSTANCE
            boolean r0 = r0.isGameEntranceExp()
            if (r0 == 0) goto Lb
            java.lang.String r1 = "more_game"
            return r1
        L35:
            java.lang.String r0 = "game_drawer_guessing"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            boolean r0 = r3.LJIILJJIL
            if (r0 == 0) goto L44
            java.lang.String r1 = r3.LJIILL
            return r1
        L44:
            java.lang.String r1 = "more_guessing"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467800IWc.LIZIZ():java.lang.String");
    }

    public final int LIZJ() {
        return ((Vector) this.LJIILLIIL.getValue()).size();
    }

    public final int LJ() {
        FeedExtra feedExtra = this.LIZIZ;
        if (feedExtra == null) {
            return 0;
        }
        if (feedExtra.bannerContainer == null) {
            return 0;
        }
        FeedBannerContainer feedBannerContainer = feedExtra.bannerContainer;
        return !C086I.LIZIZ(feedBannerContainer != null ? feedBannerContainer.bannerList : null) ? 1 : 0;
    }

    public final boolean LJFF() {
        return Intrinsics.LJFF(this.LJIIIZ, "game_drawer_drops");
    }

    public final boolean LJI() {
        return Intrinsics.LJFF(this.LJIIIZ, "game_drawer");
    }

    public final void LJIIIIZZ() {
        Room room;
        String strSubstring = "";
        for (FeedItem feedItem : (HashSet) this.LJIIZILJ.getValue()) {
            if (feedItem != null && (room = feedItem.getRoom()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append(room.getId());
                sbLIZ.append(',');
                strSubstring = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (u.LJIIZILJ(strSubstring, ",", false)) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        if (C2093608Ic.LJ(strSubstring)) {
            return;
        }
        FeedExtra feedExtra = this.LIZIZ;
        if (C2093608Ic.LJ(feedExtra != null ? feedExtra.unreadExtra : null) || LiveDedupOptExp.INSTANCE.disableUnread()) {
            return;
        }
        C480460Ism.LIZ().getClass();
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class);
        FeedExtra feedExtra2 = this.LIZIZ;
        roomRetrofitApi.collectUnreadRequest(feedExtra2 != null ? feedExtra2.unreadExtra : null, strSubstring).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(this, 335), new C09JN() { // from class: X.00Su
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FeedDataManager@35a7.markDrawerUnReadToRemote$2");
                C1C7U.LIZIZ("FeedDataManager@35a7.markDrawerUnReadToRemote$2");
            }
        });
        ((HashSet) this.LJIIZILJ.getValue()).clear();
    }

    public static String LIZLLL(String str) {
        if (!C1697810uHb.LJIIJJI("", "game_drawer", "game_drawer_drops", "game_drawer_is_game", "game_drawer_guessing").contains(str)) {
            C20441214yg.LJ("Gecko_Resource_Loader", "please register type");
            return "";
        }
        return str;
    }

    public final void LJII(DataChannel dataChannel, boolean z) {
        if (this.LJI != 0) {
            if (LIZJ() == 0 || z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_total_duration");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(Integer.valueOf(LJ()), "has_banner");
                c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - this.LJI), "duration");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ), "total_explore_level");
                c474500IjALIZ.LJJII(this.LJIIIIZZ, "tab_type");
                c474500IjALIZ.LJJII(Integer.valueOf(LJIJ.LJI() ? 1 : 0), LJIJJLI);
                c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), LJIL);
                c474500IjALIZ.LJJII(LIZIZ(), "entrance_type");
                c474500IjALIZ.LIZ();
                this.LJI = 0L;
                this.LIZ = 0;
            }
        }
    }
}
