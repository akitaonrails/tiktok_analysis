package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0Px5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661490Px5 implements InterfaceC641090PCp {
    public View LIZ;
    public boolean LIZIZ;
    public Aweme LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public C586970N0l LJFF;
    public InterfaceC652950PjJ LJI;
    public InterfaceC641090PCp LJII;
    public C652990PjN LJIIIIZZ;
    public AbstractC653010PjP LJIIIZ;
    public C658950Psz LJIIJ;
    public C0N0Y LJIILIIL;
    public String LJIILJJIL;
    public InterfaceC661680PxO LJIILL;
    public C653660PkS LJIL;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJIIJI;
    public Long LJJIJIIJIL;
    public C664400Q4g LJJIJIL;
    public AwS554S0100000_10 LJJIZ;
    public boolean LJIIJJI = true;
    public boolean LJIIL = true;
    public final CopyOnWriteArraySet<OnUIPlayListener> LJIILLIIL = new CopyOnWriteArraySet<>();
    public String LJIIZILJ = "";
    public final String LJIJ = "";
    public final String LJIJI = "";
    public String LJIJJ = "";
    public final int LJIJJLI = 9;
    public String LJJ = "";
    public int LJJI = -1;
    public int LJJIFFI = -1;
    public String LJJII = "";
    public long LJJIJ = -1;
    public long LJJIJL = -1;
    public String LJJIJLIJ = "";
    public long LJJIL = -1;

    @Override // X.InterfaceC641090PCp
    public final /* synthetic */ Fragment LIZ() {
        return null;
    }

    public final int LIZJ() {
        InterfaceC641090PCp interfaceC641090PCp = this.LJII;
        Fragment fragmentLJ = C651580Ph6.LJ(interfaceC641090PCp != null ? interfaceC641090PCp.LIZ() : null);
        if (fragmentLJ == null) {
            View view = this.LIZ;
            fragmentLJ = view != null ? C651580Ph6.LIZLLL(view) : null;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = getContext();
        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
        sAFHelper.getClass();
        return SAFHelper.LJIILL(fragmentLJ, c19egLIZIZ);
    }

    public final String LIZLLL() {
        Aweme aweme = this.LIZJ;
        String aid = aweme != null ? aweme.getAid() : null;
        if (C145500h3.LIZ() || ((Number) C1830107Et.LIZ.getValue()).intValue() == 1) {
            if (this.LJIILJJIL == null) {
                InterfaceC641090PCp interfaceC641090PCp = this.LJII;
                this.LJIILJJIL = interfaceC641090PCp != null ? interfaceC641090PCp.getIdentifier() : null;
            }
            identifier = this.LJIILJJIL;
        } else {
            InterfaceC641090PCp interfaceC641090PCp2 = this.LJII;
            if (interfaceC641090PCp2 != null) {
                identifier = interfaceC641090PCp2.getIdentifier();
            }
        }
        return C0P7S.LIZ(identifier, aid);
    }

    public final C661550PxB LJ() {
        C661550PxB c661550PxB;
        if (this.LIZJ != null) {
            C661830Pxd c661830Pxd = C661820Pxc.LIZ;
            String strLIZLLL = LIZLLL();
            if (!((HashMap) c661830Pxd.LIZ).isEmpty() && (c661550PxB = (C661550PxB) ((HashMap) c661830Pxd.LIZ).get(strLIZLLL)) != null) {
                return c661550PxB;
            }
        }
        if (this.LIZJ == null) {
            return null;
        }
        String strLIZLLL2 = LIZLLL();
        if (this.LIZJ == null) {
            return null;
        }
        C661550PxB c661550PxB2 = new C661550PxB(this.LIZJ, new C662100Py4(), strLIZLLL2);
        ((HashMap) C661820Pxc.LIZ.LIZ).put(strLIZLLL2, c661550PxB2);
        return c661550PxB2;
    }

    @Override // X.InterfaceC641090PCp
    public final Context getContext() {
        InterfaceC641090PCp interfaceC641090PCp = this.LJII;
        if (interfaceC641090PCp != null) {
            return interfaceC641090PCp.getContext();
        }
        return null;
    }

    @Override // X.InterfaceC641090PCp
    public final String getIdentifier() {
        String identifier;
        InterfaceC641090PCp interfaceC641090PCp = this.LJII;
        return (interfaceC641090PCp == null || (identifier = interfaceC641090PCp.getIdentifier()) == null) ? "" : identifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[PHI: r3
      0x0055: PHI (r3v3 X.0N0Y) = (r3v0 X.0N0Y), (r3v4 X.0N0Y) binds: [B:90:0x016c, B:14:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[EDGE_INSN: B:54:0x00d4->B:55:0x00d5 BREAK  A[LOOP:0: B:78:0x0134->B:96:?]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C661490Px5 r6) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661490Px5.LIZIZ(X.0Px5):void");
    }

    public final void LJFF(String str) {
        this.LJJ = str;
        C653660PkS c653660PkS = this.LJIL;
        if (c653660PkS != null) {
            c653660PkS.LJJLI = new AwS589S0100000_10(this, 497);
        }
    }
}
