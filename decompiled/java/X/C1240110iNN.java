package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240110iNN implements InterfaceC1240540iO4 {
    public final IMUser LIZ;
    public final EnumC1240620iOC LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final C0Y8T LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final IMUser LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public Map<String, String> LJIILIIL;
    public final C01GW LJIILJJIL;
    public final AwS598S0100000_19 LJIILL;
    public final C1266280j3a LJIILLIIL;
    public final AwS633S0100000_19 LJIIZILJ;
    public final AwS563S0100000_19 LJIJ;
    public final AwS633S0100000_19 LJIJI;
    public final AwS633S0100000_19 LJIJJ;
    public final C1266280j3a LJIJJLI;

    public C1240110iNN() {
        throw null;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC1240540iO4
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1240540iO4
    public final Object LJIIIZ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        return null;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final C1240140iNQ LIZIZ() {
        return C1240130iNP.LIZIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LIZLLL() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function0<String> LJ() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LJI() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJII() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function1<IDMAvatarLoader, Unit> LJIIJJI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJIIL() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LIZJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240110iNN)) {
            return false;
        }
        return Intrinsics.LJFF(((C1240110iNN) interfaceC1240540iO4).LIZLLL, this.LIZLLL);
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJIIJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240110iNN)) {
            return false;
        }
        C1240110iNN c1240110iNN = (C1240110iNN) interfaceC1240540iO4;
        if (!Intrinsics.LJFF(c1240110iNN.LIZ.getDisplayAvatar(), this.LIZ.getDisplayAvatar()) || !Intrinsics.LJFF(c1240110iNN.LIZJ, this.LIZJ) || !Intrinsics.LJFF(c1240110iNN.LJ, this.LJ) || c1240110iNN.LJIIL != this.LJIIL) {
            return false;
        }
        return true;
    }

    public C1240110iNN(IMUser iMUser, EnumC1240620iOC enumC1240620iOC, String str, String str2, Pair pair, Integer num, boolean z, C0Y8T c0y8t, boolean z2, String str3, IMUser iMUser2, long j, int i) {
        this.LIZ = iMUser;
        this.LIZIZ = enumC1240620iOC;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = pair;
        this.LJFF = num;
        this.LJI = z;
        this.LJII = c0y8t;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = str3;
        this.LJIIJ = iMUser2;
        this.LJIIJJI = j;
        this.LJIIL = i;
        this.LJIILIIL = null;
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(707));
        this.LJIILL = new AwS598S0100000_19(this, 776);
        this.LJIILLIIL = new C1266280j3a(this, 6);
        this.LJIIZILJ = new AwS633S0100000_19(this, 271);
        this.LJIJ = new AwS563S0100000_19(this, 3128);
        this.LJIJI = new AwS633S0100000_19(this, 270);
        this.LJIJJ = new AwS633S0100000_19(this, 269);
        this.LJIJJLI = new C1266280j3a(this, 9);
    }
}
