package X;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226610i1b extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1226850i1z LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL = "live_end_live_invite_group_chat";
    public final C1224440hy6 LLJ;
    public final C1224340hxw LLJI;
    public final C1225930i0V LLJIJIL;
    public final C1225470hzl LLJILJIL;
    public final C1226630i1d LLJILJILJ;
    public final C1224860hym LLJILLL;
    public final C1223940hxI LLJJ;

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return null;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226610i1b)) {
            return false;
        }
        C1226610i1b c1226610i1b = (C1226610i1b) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226610i1b.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226610i1b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226610i1b.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226610i1b.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1226610i1b.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveSelectInviteGroupTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", defaultSelectedId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJ;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLIZLLLIL;
    }

    public C1226610i1b(Context context, String str, String str2, C1226850i1z c1226850i1z, String str3) {
        Set setSingleton;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c1226850i1z;
        this.LLIZ = str3;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLL = true;
        c1390920mIc.LIZ.LLJJL = (int) (((double) C1336100ksC.LIZIZ(context)) * 0.7d);
        this.LLJ = new C1224440hy6(false, null, c1390920mIc, null, EnumC1222430hur.NONE, str, str2, false, false, false, null, 1920);
        C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131850366), true, false);
        this.LLJI = new C1224340hxw(EnumC1224390hy1.SINGLE, 1, false, false);
        this.LLJIJIL = new C1225930i0V(EnumC1226540i1U.TAB_KEY_END_LIVE_INVITE_GROUPS, Collections.singletonList(C1226730i1n.LJ(new C1226730i1n(0), new AwS563S0100000_19(this, 3354), 13)), new C1225960i0Y(C1226680i1i.LIZIZ(), (str3 == null || (setSingleton = Collections.singleton(str3)) == null) ? C08CX.INSTANCE : setSingleton), 28);
        this.LLJILJIL = C1225470hzl.LIZJ;
        this.LLJILJILJ = new C1226630i1d(c1224590hyL, new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, c1226850i1z);
        this.LLJILLL = new C1224860hym(context.getString(2131850367), false, Collections.singleton(EnumC1224880hyo.END), false);
        this.LLJJ = new C1223940hxI(false, false, null);
    }
}
