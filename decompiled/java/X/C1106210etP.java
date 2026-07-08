package X;

import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0etP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106210etP {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
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
    public final boolean LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final long LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final List<AbstractC1210780hc4> LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final String LJJI;
    public final String LJJIFFI;
    public String LJJII;
    public final String LJJIII;
    public final String LJJIIJ;
    public final Map<String, String> LJJIIJZLJL;
    public final Room LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final boolean LJJIJIIJI;
    public final long LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final List<User> LJJIJL;
    public final List<User> LJJIJLIJ;
    public final String LJJIL;
    public final String LJJIZ;
    public final boolean LJJJ;
    public final AdLiveEnterRoomConfig LJJJI;
    public final boolean LJJJIL;
    public final boolean LJJJJ;
    public final String LJJJJI;
    public final Bundle LJJJJIZL;
    public final InterfaceC1106740euG LJJJJJ;
    public final InterfaceC1106730euF LJJJJJL;
    public final C0J84 LJJJJL;
    public final InterfaceC470410IcZ LJJJJLI;
    public final String LJJJJLL;
    public final String LJJJJZ;
    public boolean LJJJJZI;
    public final boolean LJJJLIIL;
    public final boolean LJJJLL;
    public final boolean LJJJLZIJ;
    public final int LJJJZ;
    public final String LJJL;
    public final boolean LJJLI;
    public final InterfaceC751850TeR LJJLIIIIJ;
    public final int LJJLIIIJ;
    public final boolean LJJLIIIJILLIZJL;
    public final InterfaceC1085960eMk LJJLIIIJJI;
    public final boolean LJJLIIIJJIZ;
    public final int LJJLIIIJL;
    public final boolean LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public final boolean LJJLIL;
    public boolean LJJLJ;
    public float LJJLJLI;
    public float LJJLL;
    public boolean LJJZ;
    public String LJJZZI;
    public final User LJJZZIII;
    public final ShareFromInfo LJL;
    public final String LJLI;

    public final void LIZIZ() {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = "";
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = "";
        }
        if (this.LJIIL == null) {
            this.LJIIL = "";
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = "";
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shareParam - shareLiveIntent : ");
        sbLIZ.append(this.LJJJJZ);
        sbLIZ.append(" - descOverrideMode: ");
        sbLIZ.append(this.LJJLIIIJL);
        sbLIZ.append(" - useTopFragment: ");
        sbLIZ.append(this.LJJLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1106210etP(C1106200etO c1106200etO) {
        ArrayList arrayList = new ArrayList();
        this.LJJIJL = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJJIJLIJ = arrayList2;
        this.LJJJJZI = false;
        this.LJJLIIIJLJLI = false;
        this.LJJLIL = false;
        this.LJLI = UUID.randomUUID().toString();
        c1106200etO.getClass();
        this.LJIIJ = c1106200etO.LJIIJ;
        this.LJIIJJI = c1106200etO.LJIIJJI;
        this.LJIIL = c1106200etO.LJIIL;
        this.LJIIIZ = c1106200etO.LJIIIZ;
        this.LIZIZ = c1106200etO.LIZ;
        this.LIZJ = c1106200etO.LIZIZ;
        this.LIZ = c1106200etO.LIZJ;
        this.LJ = c1106200etO.LJ;
        this.LJFF = c1106200etO.LJFF;
        this.LJI = c1106200etO.LJI;
        this.LJII = c1106200etO.LJII;
        this.LJIIIIZZ = c1106200etO.LJIIIIZZ;
        this.LJIILIIL = c1106200etO.LJIILIIL;
        this.LJIILJJIL = c1106200etO.LJIILJJIL;
        this.LJIILL = c1106200etO.LJIILL;
        this.LJIILLIIL = c1106200etO.LJIILLIIL;
        this.LJIIZILJ = c1106200etO.LJIIZILJ;
        this.LJIJ = c1106200etO.LJIJ;
        this.LJIJI = c1106200etO.LJIJI;
        this.LJJIIZ = c1106200etO.LJIJJLI;
        this.LJJIIJZLJL = c1106200etO.LJIL;
        this.LIZLLL = c1106200etO.LIZLLL;
        this.LJIJJ = c1106200etO.LJIJJ;
        this.LJIJJLI = c1106200etO.LJJ;
        this.LJIL = c1106200etO.LJJI;
        this.LJJ = c1106200etO.LJJIFFI;
        this.LJJI = c1106200etO.LJJII;
        this.LJJIFFI = c1106200etO.LJJIII;
        this.LJJIII = c1106200etO.LJJIIJ;
        this.LJJIIZI = c1106200etO.LJJIIJZLJL;
        this.LJJIJ = c1106200etO.LJJIIZ;
        this.LJJIJIIJI = c1106200etO.LJJIIZI;
        this.LJJIJIIJIL = c1106200etO.LJJIJ;
        this.LJJIJIL = c1106200etO.LJJIJIIJI;
        this.LJJLIIIJLJLI = c1106200etO.LJJLIIIJJIZ;
        this.LJJLIIIJLLLLLLLZ = c1106200etO.LJJLIIIJLJLI;
        this.LJJLIIJ = c1106200etO.LJJLIIIJLLLLLLLZ;
        this.LJJLJ = false;
        this.LJJLJLI = 0.0f;
        this.LJJLL = 0.0f;
        this.LJJJ = c1106200etO.LJJIZ;
        this.LJJJI = c1106200etO.LJJJ;
        this.LJJJIL = c1106200etO.LJJJI;
        this.LJJJJI = c1106200etO.LJJJJ;
        this.LJJJJIZL = c1106200etO.LJJJJI;
        if (!((ArrayList) c1106200etO.LJJIJIIJIL).isEmpty()) {
            arrayList.addAll(c1106200etO.LJJIJIIJIL);
        }
        if (!((ArrayList) c1106200etO.LJJIJIL).isEmpty()) {
            arrayList2.addAll(c1106200etO.LJJIJIL);
        }
        this.LJJIL = c1106200etO.LJJIJL;
        this.LJJIIJ = c1106200etO.LJJIJLIJ;
        this.LJJIZ = c1106200etO.LJJIL;
        this.LJJJJJ = c1106200etO.LJJJJIZL;
        this.LJJJJJL = c1106200etO.LJJJJJ;
        this.LJJJJLL = c1106200etO.LJJJJLL;
        this.LJJJJZ = c1106200etO.LJJJJLI;
        this.LJJJJ = c1106200etO.LJJJIL;
        this.LJJJJL = c1106200etO.LJJJJJL;
        this.LJJJJLI = c1106200etO.LJJJJL;
        this.LJJJLIIL = c1106200etO.LJJJJZ;
        this.LJJJLL = c1106200etO.LJJJJZI;
        this.LJJJLZIJ = c1106200etO.LJJJLIIL;
        this.LJJJZ = c1106200etO.LJJJLL;
        this.LJJL = c1106200etO.LJJJLZIJ;
        this.LJJLI = c1106200etO.LJJJZ;
        this.LJJLIIIJJIZ = c1106200etO.LJJLIIIJILLIZJL;
        this.LJJLIIIIJ = c1106200etO.LJJL;
        this.LJJLIIIJ = c1106200etO.LJJLI;
        this.LJJLIIIJILLIZJL = c1106200etO.LJJLIIIIJ;
        this.LJJLIIIJJI = c1106200etO.LJJLIIIJ;
        this.LJJLIIIJL = c1106200etO.LJJLIIIJJI;
        this.LJJLIL = c1106200etO.LJJLIIIJL;
        this.LJJZZIII = c1106200etO.LJJLIL;
        this.LJL = c1106200etO.LJJLJ;
        this.LJJII = c1106200etO.LJJLIIJ;
    }

    public static C1106200etO LIZ(Room room) {
        return new C1106200etO(room);
    }
}
