package X;

import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0etO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106200etO {
    public long LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;
    public final ImageModel LJFF;
    public final ImageModel LJI;
    public final ImageModel LJII;
    public final String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public long LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public final Room LJIJJLI;
    public Map<String, String> LJIL;
    public final List<AbstractC1210780hc4> LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public boolean LJJIJIIJI;
    public final List<User> LJJIJIIJIL;
    public final List<User> LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public boolean LJJIZ;
    public AdLiveEnterRoomConfig LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public String LJJJJ;
    public Bundle LJJJJI;
    public InterfaceC1106740euG LJJJJIZL;
    public InterfaceC1106730euF LJJJJJ;
    public C0J84 LJJJJJL;
    public InterfaceC470410IcZ LJJJJL;
    public String LJJJJLI;
    public String LJJJJLL;
    public boolean LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public int LJJJLL;
    public String LJJJLZIJ;
    public boolean LJJJZ;
    public InterfaceC751850TeR LJJL;
    public int LJJLI;
    public boolean LJJLIIIIJ;
    public InterfaceC1085960eMk LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public final boolean LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public final String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public User LJJLIL;
    public ShareFromInfo LJJLJ;

    public final C1106210etP LIZLLL() {
        return new C1106210etP(this);
    }

    public C1106200etO() {
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJJ = new ArrayList();
        this.LJJIJIIJIL = new ArrayList();
        this.LJJIJIL = new ArrayList();
        this.LJJJI = true;
        this.LJJJIL = false;
        this.LJJJJZ = false;
        this.LJJJJZI = false;
        this.LJJJLIIL = false;
        this.LJJJLL = 0;
        this.LJJJLZIJ = "";
        this.LJJJZ = false;
        this.LJJLI = -1;
        this.LJJLIIIIJ = true;
        this.LJJLIIIJILLIZJL = false;
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJJIZ = false;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIIJ = null;
    }

    public C1106200etO(Room room) {
        Boolean bool;
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJJ = new ArrayList();
        this.LJJIJIIJIL = new ArrayList();
        this.LJJIJIL = new ArrayList();
        this.LJJJI = true;
        boolean zBooleanValue = false;
        this.LJJJIL = false;
        this.LJJJJZ = false;
        this.LJJJJZI = false;
        this.LJJJLIIL = false;
        this.LJJJLL = 0;
        this.LJJJLZIJ = "";
        this.LJJJZ = false;
        this.LJJLI = -1;
        this.LJJLIIIIJ = true;
        this.LJJLIIIJILLIZJL = false;
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJJIZ = false;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIIJ = null;
        this.LIZ = room.getId();
        this.LJII = room.getCover();
        this.LJIJ = room.getRequestId();
        this.LJIIIZ = room.getShareUrl();
        this.LJIIJ = room.getTitle();
        this.LJIJJLI = room;
        LiveEventInfo liveEventInfo = room.liveEventInfo;
        if (liveEventInfo != null && (bool = liveEventInfo.isPaidEvent) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LJJLIIIJJIZ = zBooleanValue;
        if (room.getStreamType() != null) {
            this.LJIILJJIL = C354201Zc.LIZ(room.getStreamType());
        }
        User owner = room.getOwner();
        if (owner != null) {
            this.LIZIZ = owner.getId();
            this.LJ = owner.getAvatarThumb();
            this.LJFF = owner.getAvatarMedium();
            this.LJI = owner.getAvatarLarge();
            this.LJIIIIZZ = C1106230etR.LIZ(owner);
            this.LIZLLL = C1106230etR.LIZIZ(owner);
            this.LJIJJ = owner.getSecUid();
        }
    }

    public C1106200etO(User user) {
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJJ = new ArrayList();
        this.LJJIJIIJIL = new ArrayList();
        this.LJJIJIL = new ArrayList();
        this.LJJJI = true;
        this.LJJJIL = false;
        this.LJJJJZ = false;
        this.LJJJJZI = false;
        this.LJJJLIIL = false;
        this.LJJJLL = 0;
        this.LJJJLZIJ = "";
        this.LJJJZ = false;
        this.LJJLI = -1;
        this.LJJLIIIIJ = true;
        this.LJJLIIIJILLIZJL = false;
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJJIZ = false;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIIJ = null;
        if (user != null) {
            this.LIZIZ = user.getId();
            this.LJ = user.getAvatarThumb();
            this.LJFF = user.getAvatarMedium();
            this.LJI = user.getAvatarLarge();
            this.LJIIIIZZ = C1106230etR.LIZ(user);
            this.LIZLLL = C1106230etR.LIZIZ(user);
            this.LJIJJ = user.getSecUid();
        }
    }

    public final void LIZ(Boolean bool, String str) {
        if (this.LJJJJI == null) {
            this.LJJJJI = new Bundle();
        }
        this.LJJJJI.putBoolean(str, bool.booleanValue());
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LJJJJI == null) {
            this.LJJJJI = new Bundle();
        }
        C786410Ut5.LJJJI(str, str2, this.LJJJJI);
    }

    public final void LIZJ(String str, ArrayList arrayList) {
        if (this.LJJJJI == null) {
            this.LJJJJI = new Bundle();
        }
        C786410Ut5.LJJJIL(this.LJJJJI, str, arrayList);
    }
}
