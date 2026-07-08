package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.invitation.newdesign.fragment.GroupInvitationFragment;
import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0i7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230060i7A {
    public final Context LIZ;
    public final C1230090i7D LIZIZ;
    public final EnumC1230590i81 LIZJ;
    public final EnumC1230500i7s LIZLLL;
    public final EnumC1229960i70 LJ;
    public final C1229500i6G LJFF;
    public final String LJI;
    public final Map<String, String> LJII;
    public final boolean LJIIIIZZ;
    public final View LJIIIZ;
    public final boolean LJIIJ;
    public final InterfaceC1229620i6S LJIIJJI;
    public final String LJIIL;
    public final C900560ZUo LJIILIIL;
    public final JoinApplyInfo LJIILJJIL;

    public final void LIZ(String str) {
        if (this.LJIIJ) {
            LIZIZ(this.LIZIZ);
            return;
        }
        if (str != null) {
            C1229780i6i.LIZ(this.LJIIIZ, str);
        }
        InterfaceC1229620i6S interfaceC1229620i6S = this.LJIIJJI;
        if (interfaceC1229620i6S == null) {
            return;
        }
        interfaceC1229620i6S.LIZ(null);
    }

    public final void LIZIZ(C1230090i7D c1230090i7D) {
        if (c1230090i7D != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.LJII);
            linkedHashMap.putAll(c1230090i7D.LJ);
            C1230090i7D c1230090i7D2 = new C1230090i7D(c1230090i7D.LIZ, c1230090i7D.LIZIZ, c1230090i7D.LIZJ, c1230090i7D.LIZLLL, linkedHashMap, c1230090i7D.LJFF);
            C1230330i7b c1230330i7b = GroupInvitationFragment.LLJJ;
            Context context = this.LIZ;
            C1229500i6G c1229500i6G = this.LJFF;
            C1230550i7x c1230550i7x = new C1230550i7x(c1230090i7D2, c1229500i6G.LIZ, c1229500i6G.LIZIZ, c1229500i6G, this.LIZLLL, this.LJIIJJI);
            c1230330i7b.getClass();
            if (C1230330i7b.LIZ(context, c1230550i7x) != null) {
                return;
            }
        }
        String string = this.LIZ.getString(2131835079);
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LIZ);
        C786410Ut5.J4(dialogC1389620mGW);
        C1229320i5y.LIZ.LJFF = System.currentTimeMillis();
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1230030i77(dialogC1389620mGW, this, string, null), 3);
    }

    public final void LIZJ(AbstractC1230100i7E abstractC1230100i7E) {
        abstractC1230100i7E.LIZJ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1230050i79(this, abstractC1230100i7E, null), 3);
    }

    public C1230060i7A(Context context, C1230080i7C c1230080i7C, C1230090i7D c1230090i7D, C1230110i7F c1230110i7F, EnumC1230590i81 enumC1230590i81) {
        this.LIZ = context;
        this.LIZIZ = c1230090i7D;
        this.LIZJ = enumC1230590i81;
        this.LIZLLL = c1230080i7C.LIZ;
        this.LJ = c1230080i7C.LIZIZ;
        this.LJFF = c1230080i7C.LIZJ;
        this.LJI = c1230080i7C.LIZLLL;
        this.LJII = c1230080i7C.LJ;
        this.LJIIIIZZ = c1230080i7C.LJFF;
        this.LJIIIZ = c1230080i7C.LJI;
        this.LJIIJ = c1230080i7C.LJII;
        this.LJIIJJI = c1230080i7C.LJIIIIZZ;
        this.LJIIL = c1230110i7F.LIZ;
        this.LJIILIIL = c1230110i7F.LIZIZ;
        this.LJIILJJIL = c1230110i7F.LIZJ;
    }
}
