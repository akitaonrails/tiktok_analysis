package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0IOL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IOL implements C0IOG {
    public String LLILLL;
    public final Set<C0IKO> LL = new HashSet();
    public final Set<C0IOM> LLILLJJLI = new HashSet();
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.C0IOG
    public /* synthetic */ void LJIIJ(Room room) {
    }

    @Override // X.C0IOG
    public abstract Room LJIIJJI(int i);

    public abstract void LJIIL(C0ISF<Room> c0isf);

    public void LJIILIIL() {
    }

    public List<Long> LJIILL(int i) {
        return null;
    }

    public String LJIILLIIL(int i, long j) {
        return "";
    }

    public int LJIIZILJ() {
        return 0;
    }

    public abstract String LJIJI();

    public abstract int LJIJJLI();

    public String LJIL(long j) {
        return "";
    }

    public abstract List<Room> LJJ();

    public String LJJI() {
        return "";
    }

    public boolean LJJIFFI() {
        return false;
    }

    public int LJJIII(Room room, EnterRoomConfig enterRoomConfig) {
        return -1;
    }

    public boolean LJJIIJ() {
        return false;
    }

    public abstract void LJJIIJZLJL(int i);

    public void LJJIIZ() {
        LJJIIJZLJL(0);
    }

    public void LJJIJ() {
    }

    public void LJJIJIIJI() {
    }

    public void LJJIJIIJIL(int i) {
    }

    public void LJJIJIL(C0ITP c0itp, int i, boolean z) {
    }

    public boolean LJJIJLIJ(long j, boolean z) {
        return false;
    }

    public abstract void LJJIL(long j);

    public boolean LJJJ(int i, int i2) {
        return false;
    }

    public boolean LJJJI(int i, int i2) {
        return false;
    }

    public final void LJIILJJIL() {
        C20441214yg.LJIIIZ("removeAndSwipeItem", "notifyDataSetChanged");
        Iterator it2 = ((HashSet) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0IKO) it2.next()).LIZIZ();
        }
    }

    public void LJJIJL() {
        ((HashSet) this.LL).clear();
    }

    public String LJIJJ() {
        return LJJIIJ() ? "requesting" : "request_end";
    }

    public static String LJIJ(EnterRoomConfig enterRoomConfig) {
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.fragmentItemVPId)) {
            return enterRoomConfig.mRoomsData.fragmentItemVPId;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterRoomConfig.mRoomsData.roomId);
        sbLIZ.append("_");
        sbLIZ.append(enterRoomConfig.mLogData.requestId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        enterRoomConfig.mRoomsData.fragmentItemVPId = strLIZIZ;
        return strLIZIZ;
    }

    public static void LJJIZ(Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_loadmore");
        for (Map.Entry entry : map.entrySet()) {
            c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
        }
        c474500IjALIZ.LIZ();
    }

    public C0IOO LJJII(int i, Room room) {
        return new C0IOO() { // from class: X.0ION
        };
    }

    public final void LJJIIZI(String str, boolean z) {
        for (C0IOM c0iom : (HashSet) this.LLILLJJLI) {
            if (z) {
                c0iom.onSuccess();
            } else {
                c0iom.LJIIJ(str);
            }
        }
    }
}
