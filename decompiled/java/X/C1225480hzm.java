package X;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225480hzm extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final C1224440hy6 LLIZ;
    public final C1224860hym LLJILJIL;
    public final String LLILZIL = "show_existing_group";
    public final String LLILZLL = "SelectAGroupTemplate";
    public final C1224340hxw LLIZLLLIL = new C1224340hxw(EnumC1224390hy1.DISABLE, 0, false, false);
    public final C1225930i0V LLJ = new C1225930i0V(EnumC1226540i1U.TAB_KEY_SELECT_A_GROUP, null, new C1225510hzp(C1226680i1i.LIZIZ()), 30);
    public final C1225470hzl LLJI = C1225470hzl.LIZJ;
    public final C1224580hyK LLJIJIL = new C1224580hyK(EnumC1224720hyY.ONE_BUTTON, true, false, "", new C1224590hyL(EnumC1227730i3P.MAIN, false, "", true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false));
    public final C1223940hxI LLJILJILJ = new C1223940hxI(false, false, null);

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
        if (!(obj instanceof C1225480hzm)) {
            return false;
        }
        C1225480hzm c1225480hzm = (C1225480hzm) obj;
        return Intrinsics.LJFF(this.LLILLL, c1225480hzm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225480hzm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1225480hzm.LLILZIL);
    }

    public final int hashCode() {
        return (((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectAGroupTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final C1224580hyK LIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLILZLL;
    }

    public C1225480hzm(Context context, String str) {
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLIZ = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.NONE, str, "show_existing_group", false, false, false, null, 1920);
        this.LLJILJIL = new C1224860hym(context.getString(2131835394), true, Collections.singleton(EnumC1224880hyo.START), false);
    }
}
