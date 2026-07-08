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
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240220iNY implements InterfaceC1240540iO4 {
    public final IMUser LIZ;
    public final C0Y8T LIZIZ;
    public final EnumC1240620iOC LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final String LJFF;
    public final String LJI;
    public Map<String, String> LJII;
    public C1240530iO3 LJIIIIZZ;
    public final AwS598S0100000_19 LJIIIZ;
    public final AwS626S0100000_12 LJIIJ;
    public final AwS626S0100000_12 LJIIJJI;
    public final C1266280j3a LJIIL;
    public final C1266280j3a LJIILIIL;

    public C1240220iNY() {
        throw null;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function0<String> LJ() {
        return null;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJII() {
        return null;
    }

    @Override // X.InterfaceC1240540iO4
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final C1240140iNQ LIZIZ() {
        return C1240130iNP.LIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LJI() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function1<IDMAvatarLoader, Unit> LJIIJJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJIIL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LIZJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240220iNY)) {
            return false;
        }
        return Intrinsics.LJFF(((C1240220iNY) interfaceC1240540iO4).LIZ.getUid(), this.LIZ.getUid());
    }

    @Override // X.InterfaceC1240540iO4
    public final Object LJIIIZ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        boolean z;
        if (!(interfaceC1240540iO4 instanceof C1240220iNY)) {
            return null;
        }
        C1240220iNY c1240220iNY = (C1240220iNY) interfaceC1240540iO4;
        boolean z2 = true;
        boolean z3 = !Intrinsics.LJFF(c1240220iNY.LIZ.getDisplayAvatar(), this.LIZ.getDisplayAvatar());
        if (Intrinsics.LJFF(c1240220iNY.LJFF, this.LJFF) && Intrinsics.LJFF(c1240220iNY.LIZLLL, this.LIZLLL)) {
            z = false;
        } else {
            z = true;
        }
        if (Intrinsics.LJFF(c1240220iNY.LJI, this.LJI) && Intrinsics.LJFF(c1240220iNY.LJ, this.LJ)) {
            z2 = false;
        }
        return new C1240570iO7(z3, z, z2);
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJIIJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240220iNY)) {
            return false;
        }
        C1240220iNY c1240220iNY = (C1240220iNY) interfaceC1240540iO4;
        if (!Intrinsics.LJFF(c1240220iNY.LIZ.getDisplayAvatar(), this.LIZ.getDisplayAvatar()) || !Intrinsics.LJFF(c1240220iNY.LJFF, this.LJFF) || !Intrinsics.LJFF(c1240220iNY.LJI, this.LJI) || !Intrinsics.LJFF(c1240220iNY.LIZLLL, this.LIZLLL) || !Intrinsics.LJFF(c1240220iNY.LJ, this.LJ)) {
            return false;
        }
        return true;
    }

    public final void LJIILIIL(String str, InboxSearchGenericAbility inboxSearchGenericAbility) {
        String str2;
        Integer numLJIIJJI;
        String str3;
        int i;
        C1241480iPa c1241480iPaKs0;
        C1240530iO3 c1240530iO3 = this.LJIIIIZZ;
        if (c1240530iO3 != null && (str2 = c1240530iO3.LLILZIL.get("rank_num")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            int iIntValue = numLJIIJJI.intValue();
            if (Intrinsics.LJFF(c1240530iO3.LLILZIL.get("tab_name"), EnumC1240620iOC.ALL.getValue())) {
                str3 = "all";
            } else {
                str3 = "account";
            }
            String str4 = "relation";
            if (!Intrinsics.LJFF(c1240530iO3.LLJI, "relation")) {
                str4 = "local";
            }
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = this.LIZ.getFollowStatus();
            c2201941BFw.getClass();
            if (C2201941BFw.LIZLLL(followStatus)) {
                i = 4;
            } else if (this.LIZ.isMAF()) {
                i = 5;
            } else if (this.LIZ.getFollowStatus() == 1) {
                i = 1;
            } else if (this.LIZ.getFollowerStatus() == 1) {
                i = 2;
            } else if (this.LIZ.getFollowStatus() == 4) {
                i = 3;
            } else {
                i = 0;
            }
            C1240600iOA.LIZIZ.LIZ(iIntValue, i, this.LIZ.getFollowStatus(), this.LIZ.getFollowerStatus(), str, str3, c1240530iO3.LLJILJIL, str4);
            if (inboxSearchGenericAbility != null && (c1241480iPaKs0 = inboxSearchGenericAbility.Ks0()) != null) {
                c1241480iPaKs0.LIZJ++;
            }
        }
    }

    public C1240220iNY(IMUser iMUser, C0Y8T c0y8t, EnumC1240620iOC enumC1240620iOC, Pair pair, Pair pair2, String str, String str2) {
        this.LIZ = iMUser;
        this.LIZIZ = c0y8t;
        this.LIZJ = enumC1240620iOC;
        this.LIZLLL = pair;
        this.LJ = pair2;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = null;
        this.LJIIIZ = new AwS598S0100000_19(this, 781);
        this.LJIIJ = new AwS626S0100000_12(this, 62);
        this.LJIIJJI = new AwS626S0100000_12(this, 60);
        this.LJIIL = new C1266280j3a(this, 17);
        this.LJIILIIL = new C1266280j3a(this, 15);
    }
}
