package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225590hzx extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final Function1<List<C1224840hyk>, Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final List<String> LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final int LLJJ;
    public final String LLJJI;
    public final C1225610hzz LLJJIII;
    public final C1224440hy6 LLJJIJI;
    public final C1224340hxw LLJJIJIIJIL;
    public final C1225930i0V LLJJIJIL;
    public final C1225860i0O<C1223510hwb> LLJJJ;
    public final C1224580hyK LLJJJIL;
    public final C1224860hym LLJJJJ;
    public final C1223940hxI LLJJJJJIL;

    public C1225590hzx() {
        throw null;
    }

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225590hzx)) {
            return false;
        }
        C1225590hzx c1225590hzx = (C1225590hzx) obj;
        return Intrinsics.LJFF(this.LLILLL, c1225590hzx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225590hzx.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1225590hzx.LLILZIL) && this.LLILZLL == c1225590hzx.LLILZLL && this.LLIZ == c1225590hzx.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1225590hzx.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1225590hzx.LLJ) && Intrinsics.LJFF(this.LLJI, c1225590hzx.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1225590hzx.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1225590hzx.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1225590hzx.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1225590hzx.LLJILLL) && this.LLJJ == c1225590hzx.LLJJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        List<String> list = this.LLJI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILJILJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJILLL;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LLJJ;
    }

    public final String toString() {
        return "CollectionInviteFriendTemplateConfig(context=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", enterMethod=" + this.LLILZIL + ", maxSelectableCount=" + this.LLILZLL + ", isFullScreen=" + this.LLIZ + ", onSelectedCallback=" + this.LLIZLLLIL + ", onDismiss=" + this.LLJ + ", defaultSelectIdList=" + this.LLJI + ", title=" + this.LLJIJIL + ", defaultButtonHint=" + this.LLJILJIL + ", buttonText=" + this.LLJILJILJ + ", enterType=" + this.LLJILLL + ", isNewTag=" + this.LLJJ + ')';
    }

    @Override // X.AbstractC1225780i0G
    public final C1224580hyK LIZ() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1223510hwb> LJII() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJI;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0hzz] */
    public C1225590hzx(Context context, String str, AwS597S0100000_18 awS597S0100000_18, AwS562S0100000_18 awS562S0100000_18, List list, String str2, String str3, String str4, String str5, int i) {
        String str6 = str4;
        String str7 = str3;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = "click_invite_friends";
        this.LLILZLL = 1;
        this.LLIZ = false;
        this.LLIZLLLIL = awS597S0100000_18;
        this.LLJ = awS562S0100000_18;
        this.LLJI = list;
        this.LLJIJIL = str2;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str6;
        this.LLJILLL = str5;
        this.LLJJ = i;
        this.LLJJI = "CollectionInviteFriend";
        this.LLJJIII = new InterfaceC1225830i0L() { // from class: X.0hzz
            @Override // X.InterfaceC1225830i0L
            public final void LIZLLL(EnumC1223630hwn enumC1223630hwn) {
            }

            @Override // X.InterfaceC1225830i0L
            public final void LJ() {
            }

            @Override // X.InterfaceC1225830i0L
            public final void LJFF(AbstractC1225650i03 abstractC1225650i03) {
            }

            @Override // X.InterfaceC1225830i0L
            public final void LJI() {
                this.LIZ.LLJ.invoke();
            }
        };
        this.LLJJIJI = new C1224440hy6(false, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.TOP, str, "click_invite_friends", false, false, false, null, 1920);
        this.LLJJIJIIJIL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, 1, false, false);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_COLLECTION_INVITE_FRIEND;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 2;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        this.LLJJIJIL = new C1225930i0V(enumC1226540i1U, null, new C1225620i00(c20603715jn, list), 30);
        C1223610hwl c1223610hwl = new C1223610hwl(false, false);
        C20603715jn c20603715jn2 = new C20603715jn();
        c20603715jn2.LIZJ = true;
        c20603715jn2.LIZ = 2;
        c20603715jn2.LIZLLL = LoadingFooterCell.class;
        this.LLJJJ = new C1225860i0O<>(c1223610hwl, new C1223510hwb(c20603715jn2, false, false));
        this.LLJJJIL = new C1224580hyK(EnumC1224720hyY.POLICY, true, false, str7 == null ? "" : str7, new C1224590hyL(EnumC1227730i3P.MAIN, false, str6 == null ? "" : str6, true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false));
        this.LLJJJJ = new C1224860hym(str2 != null ? str2 : "", false, Collections.singleton(EnumC1224880hyo.START), false);
        this.LLJJJJJIL = new C1223940hxI(true, false, null);
    }
}
