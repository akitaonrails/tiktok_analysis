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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240210iNX implements InterfaceC1240540iO4 {
    public final C0Y8T LIZ;
    public final EnumC1240620iOC LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Pair<Integer, Integer> LJFF;
    public final String LJI;
    public Map<String, String> LJII;
    public C1240530iO3 LJIIIIZZ;
    public final AwS598S0100000_19 LJIIIZ;
    public final C1266280j3a LJIIJ;
    public final AwS626S0100000_12 LJIIJJI;
    public final AwS626S0100000_12 LJIIL;
    public final C1266280j3a LJIILIIL;

    public C1240210iNX() {
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
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1240540iO4
    public final C1240140iNQ LIZIZ() {
        return C1240130iNP.LIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1240540iO4
    public final InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> LJI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function1<IDMAvatarLoader, Unit> LJIIJJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1240540iO4
    public final Function2<TuxTextView, Integer, CharSequence> LJIIL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LIZJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        if (!(interfaceC1240540iO4 instanceof C1240210iNX)) {
            return false;
        }
        return Intrinsics.LJFF(((C1240210iNX) interfaceC1240540iO4).LIZ.getConversationId(), this.LIZ.getConversationId());
    }

    @Override // X.InterfaceC1240540iO4
    public final Object LJIIIZ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        boolean z;
        boolean z2;
        boolean z3;
        String icon;
        String icon2 = null;
        if (!(interfaceC1240540iO4 instanceof C1240210iNX)) {
            return null;
        }
        Pair<Integer, Integer> pair = this.LIZJ;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        boolean z4 = false;
        if (iIntValue >= 0 && iIntValue2 > iIntValue && iIntValue2 <= this.LJ.length()) {
            z = false;
        } else {
            z = true;
        }
        C1240210iNX c1240210iNX = (C1240210iNX) interfaceC1240540iO4;
        Pair<Integer, Integer> pair2 = c1240210iNX.LIZJ;
        if (pair2 == null) {
            pair2 = new Pair<>(-1, -1);
        }
        int iIntValue3 = pair2.getFirst().intValue();
        int iIntValue4 = pair2.getSecond().intValue();
        if (iIntValue3 >= 0 && iIntValue4 > iIntValue3 && iIntValue4 <= c1240210iNX.LJ.length()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2 && (!z ? !(!Intrinsics.LJFF(this.LJ, c1240210iNX.LJ) || !Intrinsics.LJFF(this.LIZJ, c1240210iNX.LIZJ)) : this.LIZLLL == c1240210iNX.LIZLLL)) {
            z3 = false;
        } else {
            z3 = true;
        }
        C0Y8Y coreInfo = c1240210iNX.LIZ.getCoreInfo();
        if (coreInfo != null) {
            icon = coreInfo.getIcon();
        } else {
            icon = null;
        }
        C0Y8Y coreInfo2 = this.LIZ.getCoreInfo();
        if (coreInfo2 != null) {
            icon2 = coreInfo2.getIcon();
        }
        boolean z5 = !Intrinsics.LJFF(icon, icon2);
        if (!Intrinsics.LJFF(c1240210iNX.LJI, this.LJI) || !Intrinsics.LJFF(c1240210iNX.LJFF, this.LJFF)) {
            z4 = true;
        }
        return new C1240570iO7(z5, z4, z3);
    }

    @Override // X.InterfaceC1240540iO4
    public final boolean LJIIJ(InterfaceC1240540iO4 interfaceC1240540iO4) {
        String icon;
        if (!(interfaceC1240540iO4 instanceof C1240210iNX)) {
            return false;
        }
        C1240210iNX c1240210iNX = (C1240210iNX) interfaceC1240540iO4;
        C0Y8Y coreInfo = c1240210iNX.LIZ.getCoreInfo();
        String icon2 = null;
        if (coreInfo != null) {
            icon = coreInfo.getIcon();
        } else {
            icon = null;
        }
        C0Y8Y coreInfo2 = this.LIZ.getCoreInfo();
        if (coreInfo2 != null) {
            icon2 = coreInfo2.getIcon();
        }
        if (!Intrinsics.LJFF(icon, icon2) || !Intrinsics.LJFF(c1240210iNX.LJI, this.LJI) || !Intrinsics.LJFF(c1240210iNX.LJFF, this.LJFF) || !Intrinsics.LJFF(c1240210iNX.LJ, this.LJ) || c1240210iNX.LIZLLL != this.LIZLLL || !Intrinsics.LJFF(c1240210iNX.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    public final void LJIILIIL(String str, InboxSearchGenericAbility inboxSearchGenericAbility) {
        String str2;
        Integer numLJIIJJI;
        String str3;
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
            C1240600iOA.LIZIZ.LIZ(iIntValue, 6, -1, -1, str, str3, c1240530iO3.LLJILJIL, str4);
            if (inboxSearchGenericAbility != null && (c1241480iPaKs0 = inboxSearchGenericAbility.Ks0()) != null) {
                c1241480iPaKs0.LIZJ++;
            }
        }
    }

    public C1240210iNX(C0Y8T c0y8t, EnumC1240620iOC enumC1240620iOC, Pair pair, int i, String str, Pair pair2, String str2) {
        this.LIZ = c0y8t;
        this.LIZIZ = enumC1240620iOC;
        this.LIZJ = pair;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = pair2;
        this.LJI = str2;
        this.LJII = null;
        new AwS563S0100000_19(this, 3127);
        this.LJIIIZ = new AwS598S0100000_19(this, 777);
        this.LJIIJ = new C1266280j3a(this, 7);
        this.LJIIJJI = new AwS626S0100000_12(this, 54);
        this.LJIIL = new AwS626S0100000_12(this, 53);
        this.LJIILIIL = new C1266280j3a(this, 8);
    }
}
