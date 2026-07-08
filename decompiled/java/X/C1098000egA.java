package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0egA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1098000egA {
    public final boolean LIZ;
    public int LJIIL;
    public Map<String, Object> LJIILJJIL;
    public final Map<String, Object> LJIILL;
    public String LIZIZ = "unknown";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public String LJIILIIL = "spark_view";

    public final Map<String, Object> LIZIZ() {
        User owner;
        Map<String, Object> map = this.LJIILJJIL;
        if (map != null) {
            this.LJIILL.putAll(map);
        }
        this.LJIILL.put("biz", this.LIZIZ);
        this.LJIILL.put("schema", this.LIZJ);
        this.LJIILL.put("url", this.LIZLLL);
        this.LJIILL.put("render_type", this.LJ);
        this.LJIILL.put("network_start", Long.valueOf(this.LJFF));
        this.LJIILL.put("network_end", Long.valueOf(this.LJI));
        this.LJIILL.put("container_create_start", Long.valueOf(this.LJII));
        this.LJIILL.put("container_create_end", Long.valueOf(this.LJIIIIZZ));
        this.LJIILL.put("url_load_start", Long.valueOf(this.LJIIIZ));
        this.LJIILL.put("url_load_end", Long.valueOf(this.LJIIJ));
        this.LJIILL.put("real_show", Long.valueOf(this.LJIIJJI));
        this.LJIILL.put("reuse_type", Integer.valueOf(this.LJIIL));
        this.LJIILL.put("spark_container_type", this.LJIILIIL);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long currentUserId = interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id = (room == null || (owner = room.getOwner()) == null) ? 0L : owner.getId();
        this.LJIILL.put("is_anchor", Integer.valueOf((id == 0 || currentUserId == 0 || id != currentUserId) ? 0 : 1));
        return this.LJIILL;
    }

    public C1098000egA(boolean z) {
        Map<String, Object> map;
        this.LIZ = z;
        if (z) {
            map = new ConcurrentHashMap<>();
        } else {
            map = new HashMap<>();
        }
        this.LJIILL = map;
    }

    public final void LIZ(Object obj, String str) {
        Map<String, Object> map;
        if (this.LJIILJJIL == null) {
            if (this.LIZ) {
                map = new ConcurrentHashMap<>();
            } else {
                map = new HashMap<>();
            }
            this.LJIILJJIL = map;
        }
        Map<String, Object> map2 = this.LJIILJJIL;
        if (map2 != null) {
            map2.put(str, obj);
        }
    }
}
