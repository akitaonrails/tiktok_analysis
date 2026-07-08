package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121570fIB {
    public List<? extends User> LIZ;
    public C1130230fW9 LIZIZ;
    public String LIZJ;
    public EnumC1120600fGc LIZLLL;
    public Runnable LJ;
    public Map<String, String> LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public C1130240fWA LJIIJ;
    public long LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public GiftMessage LJIJJLI;
    public int LJIL;
    public Long LJJ;
    public C1129270fUb LJJI;
    public boolean LJJIFFI;
    public long LJJII;
    public final String LJJIII;

    public C1121570fIB() {
        this((User) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1121570fIB(User user) {
        List listLJIILJJIL;
        if (user != null) {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(user);
        } else {
            listLJIILJJIL = C13BV.INSTANCE;
        }
        this((List<? extends User>) listLJIILJJIL, 0L, (String) null);
    }

    public C1121570fIB(List<? extends User> list) {
        this(list, 0L, (String) null);
    }

    public C1121570fIB(List<? extends User> list, long j, String str) {
        this.LIZ = C13BV.INSTANCE;
        this.LIZLLL = EnumC1120600fGc.DEFAULT;
        this.LJIIJJI = -1L;
        this.LJIIL = "normal";
        this.LJIJI = "";
        this.LJJ = 0L;
        this.LJJIII = C1017903yT.LIZ();
        this.LIZ = list;
        this.LJIIIZ = j;
        this.LIZJ = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1121570fIB(long j, User user, String str) {
        List listLJIILJJIL;
        if (user != null) {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(user);
        } else {
            listLJIILJJIL = C13BV.INSTANCE;
        }
        this((List<? extends User>) listLJIILJJIL, j, str);
    }
}
