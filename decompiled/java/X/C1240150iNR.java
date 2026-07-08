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
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240150iNR implements InterfaceC1240540iO4 {
    public final IMUser LIZ;
    public final C0Y8T LIZIZ;
    public final boolean LIZJ;
    public final EnumC1240620iOC LIZLLL;
    public final String LJ;
    public final Pair<Integer, Integer> LJFF;
    public final Integer LJI;
    public final C1240340iNk LJII;
    public final String LJIIIIZZ;
    public final long LJIIIZ;
    public final String LJIIJ;
    public Map<String, String> LJIIJJI;
    public final C01GW LJIIL;
    public final AwS598S0100000_19 LJIILIIL;
    public final C1266280j3a LJIILJJIL;
    public final AwS633S0100000_19 LJIILL;
    public final AwS563S0100000_19 LJIILLIIL;
    public final AwS626S0100000_12 LJIIZILJ;
    public final AwS626S0100000_12 LJIJ;
    public final C1266280j3a LJIJI;

    public C1240150iNR() {
        throw null;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1240540iO4
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LIZ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1240540iO4
    public final C1240140iNQ LIZIZ() {
        return C1240130iNP.LIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function0<String> LJ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LJI() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJII() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function1<IDMAvatarLoader, Unit> LJIIJJI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJIIL() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LIZJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240150iNR)) {
            return false;
        }
        return Intrinsics.LJFF(((C1240150iNR) interfaceC1240540iO4).LIZ.getUid(), this.LIZ.getUid());
    }

    @Override // X.InterfaceC1240540iO4
    public final Object LJIIIZ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240150iNR)) {
            return null;
        }
        C1240150iNR c1240150iNR = (C1240150iNR) interfaceC1240540iO4;
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(c1240150iNR.LIZ.getDisplayAvatar(), this.LIZ.getDisplayAvatar());
        boolean z3 = !Intrinsics.LJFF(c1240150iNR.LIZ.getNickName(), this.LIZ.getNickName());
        if (Intrinsics.LJFF(c1240150iNR.LJ, this.LJ) && Intrinsics.LJFF(c1240150iNR.LJFF, this.LJFF) && c1240150iNR.LJIIIZ == this.LJIIIZ && c1240150iNR.LJII.LIZ.size() == this.LJII.LIZ.size()) {
            z = false;
        }
        return new C1240570iO7(z2, z3, z);
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJIIJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240150iNR)) {
            return false;
        }
        C1240150iNR c1240150iNR = (C1240150iNR) interfaceC1240540iO4;
        if (!Intrinsics.LJFF(c1240150iNR.LIZ.getDisplayAvatar(), this.LIZ.getDisplayAvatar()) || !Intrinsics.LJFF(c1240150iNR.LIZ.getNickName(), this.LIZ.getNickName()) || !Intrinsics.LJFF(c1240150iNR.LJ, this.LJ) || !Intrinsics.LJFF(c1240150iNR.LJFF, this.LJFF) || c1240150iNR.LJIIIZ != this.LJIIIZ || c1240150iNR.LJII.LIZ.size() != this.LJII.LIZ.size()) {
            return false;
        }
        return true;
    }

    public C1240150iNR(IMUser iMUser, C0Y8T c0y8t, boolean z, EnumC1240620iOC enumC1240620iOC, String str, Pair pair, Integer num, C1240340iNk c1240340iNk, String str2, long j, String str3) {
        this.LIZ = iMUser;
        this.LIZIZ = c0y8t;
        this.LIZJ = z;
        this.LIZLLL = enumC1240620iOC;
        this.LJ = str;
        this.LJFF = pair;
        this.LJI = num;
        this.LJII = c1240340iNk;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = j;
        this.LJIIJ = str3;
        this.LJIIJJI = null;
        this.LJIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(709));
        this.LJIILIIL = new AwS598S0100000_19(this, 779);
        this.LJIILJJIL = new C1266280j3a(this, 11);
        this.LJIILL = new AwS633S0100000_19(this, 273);
        this.LJIILLIIL = new AwS563S0100000_19(this, 3130);
        this.LJIIZILJ = new AwS626S0100000_12(this, 58);
        this.LJIJ = new AwS626S0100000_12(this, 57);
        this.LJIJI = new C1266280j3a(this, 13);
    }
}
