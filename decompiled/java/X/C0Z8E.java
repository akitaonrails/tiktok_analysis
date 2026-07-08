package X;

import X.InterfaceC888500YtM;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Z8E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0Z8E<VO extends InterfaceC888500YtM> implements C0Z73<VO> {
    public VO LIZIZ;
    public int LIZJ = -1;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public C0Z8E(View view) {
        this.LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1551));
        this.LJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1550));
        this.LJFF = C452501pT.LIZIZ(new AwS545S0100000_1(view, 1701));
        this.LJI = C452501pT.LIZIZ(new AwS545S0100000_1(view, 1702));
        this.LJII = C452501pT.LIZIZ(new AwS415S0200000_14((C0Z8E) this, view, (View) 115));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS415S0200000_14((C0Z8E) this, view, (View) 114));
    }

    public static String LIZIZ(C0Z86 c0z86) {
        String displayName;
        if (c0z86 instanceof C0Z8L) {
            IMUser imUser = ((C0Z8L) c0z86).getImUser();
            if (imUser != null && (displayName = imUser.getDisplayName()) != null) {
                return displayName;
            }
        } else if (c0z86 instanceof C0Z8M) {
            return ((C0Z8M) c0z86).getName();
        }
        return "";
    }

    public void LIZ(VO vo) {
        this.LIZIZ = vo;
    }
}
