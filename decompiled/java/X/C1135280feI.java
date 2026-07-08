package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0feI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1135280feI {
    public int LIZ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public User LJIIIZ;
    public long LJIIJ;
    public User LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILLIIL;
    public long LJIJJ;
    public List<LynxGiftExtra> LJIL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LJIILL = "";
    public final C0T6Z LJIIZILJ = new C0T6Z();
    public int LJIJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public String LJIJI = "";
    public List<Long> LJIJJLI = null;

    public final long LIZIZ() {
        User user;
        if (this.LJIIJ <= 0 && (user = this.LJIIIZ) != null && user.getId() > 0) {
            this.LJIIJ = this.LJIIIZ.getId();
        }
        return this.LJIIJ;
    }

    public long LIZ() {
        return this.LJIJJ;
    }
}
