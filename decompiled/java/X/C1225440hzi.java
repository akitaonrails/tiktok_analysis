package X;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225440hzi extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final EnumC1222430hur LLIZ;
    public final String LLIZLLLIL;
    public final Function1<Integer, String> LLJ;
    public final String LLJI;
    public final C894390Z6v LLJIJIL;
    public final String LLJILJIL;
    public final C1224440hy6 LLJILJILJ;
    public final C1224340hxw LLJILLL;
    public final C1225930i0V LLJJ;
    public final C1225470hzl LLJJI;
    public final C1225000hz0 LLJJIII;
    public final C1224860hym LLJJIJI;
    public final C1223940hxI LLJJIJIIJIL;

    public C1225440hzi() {
        throw null;
    }

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
        if (!(obj instanceof C1225440hzi)) {
            return false;
        }
        C1225440hzi c1225440hzi = (C1225440hzi) obj;
        return Intrinsics.LJFF(this.LLILLL, c1225440hzi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225440hzi.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1225440hzi.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1225440hzi.LLILZLL) && this.LLIZ == c1225440hzi.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1225440hzi.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1225440hzi.LLJ) && Intrinsics.LJFF(this.LLJI, c1225440hzi.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1225440hzi.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        Function1<Integer, String> function1 = this.LLJ;
        return ((((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoveMemberTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", selectedListPosition=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", navTitle=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", confirmButtonText=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", defaultButtonHint=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", removeMemberDialogText=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJILJIL;
    }

    public C1225440hzi(Context context, String str, EnumC1222430hur enumC1222430hur, String str2, C5183020f c5183020f, C894390Z6v c894390Z6v) {
        this.LLILLL = context;
        this.LLILZ = "group_management";
        this.LLILZIL = "group_management_cell";
        this.LLILZLL = str;
        this.LLIZ = enumC1222430hur;
        this.LLIZLLLIL = str2;
        this.LLJ = c5183020f;
        this.LLJI = "";
        this.LLJIJIL = c894390Z6v;
        this.LLJILJIL = "RemoveMemberTemplate";
        this.LLJILJILJ = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, enumC1222430hur, "group_management", "group_management_cell", false, false, false, null, 1920);
        this.LLJILLL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, Integer.MAX_VALUE, false, false);
        this.LLJJ = new C1225930i0V(EnumC1226540i1U.TAB_KEY_GROUP_MEMBER, null, new C1225500hzo(C1226680i1i.LIZIZ(), str, Boolean.TRUE, null, false), 30);
        this.LLJJI = C1225470hzl.LIZJ;
        this.LLJJIII = new C1225000hz0("", new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131830182), true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, str, c894390Z6v, c5183020f);
        this.LLJJIJI = new C1224860hym(str2, false, Collections.singleton(EnumC1224880hyo.START), false);
        this.LLJJIJIIJIL = new C1223940hxI(false, false, null);
    }
}
