package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240160iNS implements InterfaceC1240540iO4 {
    public final C0Y8T LIZ;
    public final EnumC1240620iOC LIZIZ;
    public final String LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final Integer LJ;
    public final C1240340iNk LJFF;
    public final String LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public final AwS598S0100000_19 LJIIJ;
    public final C1266280j3a LJIIJJI;
    public final AwS633S0100000_19 LJIIL;
    public final AwS563S0100000_19 LJIILIIL;
    public final AwS626S0100000_12 LJIILJJIL;
    public final AwS626S0100000_12 LJIILL;
    public final C1266280j3a LJIILLIIL;

    public C1240160iNS() {
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
        return this.LJIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final C1240140iNQ LIZIZ() {
        return C1240130iNP.LIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function0<String> LJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJII() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function1<IDMAvatarLoader, Unit> LJIIJJI() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJIIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LIZJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240160iNS)) {
            return false;
        }
        return Intrinsics.LJFF(((C1240160iNS) interfaceC1240540iO4).LIZ.getConversationId(), this.LIZ.getConversationId());
    }

    @Override // X.InterfaceC1240540iO4
    public final Object LJIIIZ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        String icon;
        String icon2;
        String name;
        String name2 = null;
        if (!(interfaceC1240540iO4 instanceof C1240160iNS)) {
            return null;
        }
        C1240160iNS c1240160iNS = (C1240160iNS) interfaceC1240540iO4;
        C0Y8Y coreInfo = c1240160iNS.LIZ.getCoreInfo();
        if (coreInfo != null) {
            icon = coreInfo.getIcon();
        } else {
            icon = null;
        }
        C0Y8Y coreInfo2 = this.LIZ.getCoreInfo();
        if (coreInfo2 != null) {
            icon2 = coreInfo2.getIcon();
        } else {
            icon2 = null;
        }
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(icon, icon2);
        C0Y8Y coreInfo3 = c1240160iNS.LIZ.getCoreInfo();
        if (coreInfo3 != null) {
            name = coreInfo3.getName();
        } else {
            name = null;
        }
        C0Y8Y coreInfo4 = this.LIZ.getCoreInfo();
        if (coreInfo4 != null) {
            name2 = coreInfo4.getName();
        }
        boolean z3 = !Intrinsics.LJFF(name, name2);
        if (Intrinsics.LJFF(c1240160iNS.LIZJ, this.LIZJ) && Intrinsics.LJFF(c1240160iNS.LIZLLL, this.LIZLLL) && c1240160iNS.LJII == this.LJII && c1240160iNS.LJFF.LIZ.size() == this.LJFF.LIZ.size()) {
            z = false;
        }
        return new C1240570iO7(z2, z3, z);
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJIIJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        String icon;
        String icon2;
        String name;
        if (!(interfaceC1240540iO4 instanceof C1240160iNS)) {
            return false;
        }
        C1240160iNS c1240160iNS = (C1240160iNS) interfaceC1240540iO4;
        C0Y8Y coreInfo = c1240160iNS.LIZ.getCoreInfo();
        String name2 = null;
        if (coreInfo != null) {
            icon = coreInfo.getIcon();
        } else {
            icon = null;
        }
        C0Y8Y coreInfo2 = this.LIZ.getCoreInfo();
        if (coreInfo2 != null) {
            icon2 = coreInfo2.getIcon();
        } else {
            icon2 = null;
        }
        if (!Intrinsics.LJFF(icon, icon2)) {
            return false;
        }
        C0Y8Y coreInfo3 = c1240160iNS.LIZ.getCoreInfo();
        if (coreInfo3 != null) {
            name = coreInfo3.getName();
        } else {
            name = null;
        }
        C0Y8Y coreInfo4 = this.LIZ.getCoreInfo();
        if (coreInfo4 != null) {
            name2 = coreInfo4.getName();
        }
        if (!Intrinsics.LJFF(name, name2) || !Intrinsics.LJFF(c1240160iNS.LIZJ, this.LIZJ) || !Intrinsics.LJFF(c1240160iNS.LIZLLL, this.LIZLLL) || c1240160iNS.LJII != this.LJII || c1240160iNS.LJFF.LIZ.size() != this.LJFF.LIZ.size()) {
            return false;
        }
        return true;
    }

    public C1240160iNS(C0Y8T c0y8t, EnumC1240620iOC enumC1240620iOC, String str, Pair pair, Integer num, C1240340iNk c1240340iNk, String str2, long j, String str3) {
        this.LIZ = c0y8t;
        this.LIZIZ = enumC1240620iOC;
        this.LIZJ = str;
        this.LIZLLL = pair;
        this.LJ = num;
        this.LJFF = c1240340iNk;
        this.LJI = str2;
        this.LJII = j;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = null;
        this.LJIIJ = new AwS598S0100000_19(this, 780);
        this.LJIIJJI = new C1266280j3a(this, 14);
        this.LJIIL = new AwS633S0100000_19(this, 274);
        this.LJIILIIL = new AwS563S0100000_19(this, 3131);
        this.LJIILJJIL = new AwS626S0100000_12(this, 61);
        this.LJIILL = new AwS626S0100000_12(this, 59);
        this.LJIILLIIL = new C1266280j3a(this, 16);
    }
}
