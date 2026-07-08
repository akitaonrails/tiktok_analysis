package X;

import android.content.Context;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226970i2B extends AbstractC1227390i2r {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final Context LLILLL;
    public final Map<String, Object> LLILZ;
    public final InterfaceC1225830i0L LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final EnumC1222430hur LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final C1227140i2S LLJILJIL;
    public final C1226850i1z LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final boolean LLJJ;
    public final List<String> LLJJI;
    public final Function1<C0Y8T, Unit> LLJJIII;
    public final Function1<Integer, String> LLJJIJI;
    public final String LLJJIJIIJIL = "live_end_live_create_group_chat";
    public final C1224440hy6 LLJJIJIL;
    public final C1224340hxw LLJJJ;
    public final C1225930i0V LLJJJIL;
    public final C1225470hzl LLJJJJ;
    public final C1227630i3F LLJJJJJIL;
    public final C1224860hym LLJJJJLIIL;
    public final C1223940hxI LLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226970i2B)) {
            return false;
        }
        C1226970i2B c1226970i2B = (C1226970i2B) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226970i2B.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226970i2B.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226970i2B.LLILZIL) && this.LLILZLL == c1226970i2B.LLILZLL && this.LLIZ == c1226970i2B.LLIZ && this.LLIZLLLIL == c1226970i2B.LLIZLLLIL && this.LLJ == c1226970i2B.LLJ && Intrinsics.LJFF(this.LLJI, c1226970i2B.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1226970i2B.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1226970i2B.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1226970i2B.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1226970i2B.LLJILLL) && this.LLJJ == c1226970i2B.LLJJ && Intrinsics.LJFF(this.LLJJI, c1226970i2B.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1226970i2B.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1226970i2B.LLJJIJI);
    }

    public final int hashCode() {
        int iHashCode = this.LLILLL.hashCode() * 31;
        Map<String, Object> map = this.LLILZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC1225830i0L interfaceC1225830i0L = this.LLILZIL;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (interfaceC1225830i0L == null ? 0 : interfaceC1225830i0L.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
        Map<String, String> map2 = this.LLJILLL;
        int iHashCode4 = (((iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        List<String> list = this.LLJJI;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Function1<C0Y8T, Unit> function1 = this.LLJJIII;
        return ((iHashCode5 + (function1 != null ? function1.hashCode() : 0)) * 31) + this.LLJJIJI.hashCode();
    }

    public final String toString() {
        return "LiveCreateGroupTemplateConfig(context=" + this.LLILLL + ", extraETParams=" + this.LLILZ + ", selectorCallback=" + this.LLILZIL + ", confirmWidgetManagedExternally=" + this.LLILZLL + ", searchBarManagedExternally=" + this.LLIZ + ", selectedListPosition=" + this.LLIZLLLIL + ", isFullScreen=" + this.LLJ + ", enterFrom=" + this.LLJI + ", enterMethod=" + this.LLJIJIL + ", tabInfo=" + this.LLJILJIL + ", param=" + this.LLJILJILJ + ", bizExtMap=" + this.LLJILLL + ", showActiveStatus=" + this.LLJJ + ", defaultSelectedIdList=" + this.LLJJI + ", createGroupCallback=" + this.LLJJIII + ", confirmButtonText=" + this.LLJJIJI + ')';
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1227390i2r
    public final AbstractC1227390i2r LJIIJJI(boolean z, EnumC1222430hur enumC1222430hur, InterfaceC1225830i0L interfaceC1225830i0L, Map map) {
        return new C1226970i2B(this.LLILLL, map, interfaceC1225830i0L, true, true, enumC1222430hur, z, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1226970i2B(Context context, Map<String, ? extends Object> map, InterfaceC1225830i0L interfaceC1225830i0L, boolean z, boolean z2, EnumC1222430hur enumC1222430hur, boolean z3, String str, String str2, C1227140i2S c1227140i2S, C1226850i1z c1226850i1z, Map<String, String> map2, boolean z4, List<String> list, Function1<? super C0Y8T, Unit> function1, Function1<? super Integer, String> function12) {
        EnumC1224830hyj enumC1224830hyj;
        int size;
        EnumC1224880hyo enumC1224880hyo;
        this.LLILLL = context;
        this.LLILZ = map;
        this.LLILZIL = interfaceC1225830i0L;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = enumC1222430hur;
        this.LLJ = z3;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = c1227140i2S;
        this.LLJILJILJ = c1226850i1z;
        this.LLJILLL = map2;
        this.LLJJ = z4;
        this.LLJJI = list;
        this.LLJJIII = function1;
        this.LLJJIJI = function12;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLL = true;
        c1390920mIc.LIZ.LLJJL = (int) (((double) C1336100ksC.LIZIZ(context)) * 0.7d);
        this.LLJJIJIL = new C1224440hy6(false, null, c1390920mIc, null, enumC1222430hur, str, str2, z, z2, false, null, 1536);
        this.LLJJJ = new C1224340hxw(EnumC1224390hy1.MULTIPLE, C0ZFX.LIZ("default") - 1, true, z4);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST;
        C13BV c13bv = C13BV.INSTANCE;
        C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
        C1227280i2g c1227280i2g = c1227140i2S.LIZJ;
        int i = c1227280i2g.LIZ;
        GroupInviteListRequest groupInviteListRequest = new GroupInviteListRequest(0, null, Integer.valueOf(i), Long.valueOf(c1227280i2g.LIZLLL), c1227280i2g.LIZJ, c1227280i2g.LIZIZ, Boolean.TRUE, null, 130, null);
        C1227810i3X c1227810i3XLJ = C1226680i1i.LJ();
        if (c1227140i2S.LIZJ.LIZ == 3) {
            enumC1224830hyj = EnumC1224830hyj.HIGHER;
        } else {
            enumC1224830hyj = EnumC1224830hyj.NORMAL;
        }
        this.LLJJJIL = new C1225930i0V(enumC1226540i1U, c13bv, new C1227100i2O(c20603715jnLIZIZ, null, groupInviteListRequest, c1227810i3XLJ, enumC1224830hyj, "", c1227140i2S.LIZLLL, "", false), 28);
        this.LLJJJJ = C1225470hzl.LIZJ;
        EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        this.LLJJJJJIL = new C1227630i3F(new C1224590hyL(enumC1227730i3P, true, (String) function12.invoke(Integer.valueOf(size)), true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, new AwS598S0100000_19(this, 818), function1);
        String string = context.getString(2131831123);
        if (z3) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLJJJJLIIL = new C1224860hym(string, false, Collections.singleton(enumC1224880hyo), false);
        this.LLJJL = new C1223940hxI(false, false, "");
    }
}
