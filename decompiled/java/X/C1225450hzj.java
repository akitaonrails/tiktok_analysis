package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225450hzj extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZLL;
    public final int LLIZ;
    public final List<String> LLIZLLLIL;
    public final C1224340hxw LLJIJIL;
    public final C1225930i0V LLJILJIL;
    public final C1225090hz9 LLJILLL;
    public final C1224860hym LLJJ;
    public final String LLILZ = "admin_management";
    public final String LLILZIL = "admin_add_button";
    public final String LLJ = "SetAdminTemplate";
    public final C1224440hy6 LLJI = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.TOP, "admin_management", "admin_add_button", false, false, false, null, 1920);
    public final C1225470hzl LLJILJILJ = C1225470hzl.LIZJ;
    public final C1223940hxI LLJJI = new C1223940hxI(false, false, null);

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
        if (!(obj instanceof C1225450hzj)) {
            return false;
        }
        C1225450hzj c1225450hzj = (C1225450hzj) obj;
        return Intrinsics.LJFF(this.LLILLL, c1225450hzj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225450hzj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1225450hzj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1225450hzj.LLILZLL) && this.LLIZ == c1225450hzj.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1225450hzj.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31;
        List<String> list = this.LLIZLLLIL;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetAdminTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", maxSelectableCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJ;
    }

    public C1225450hzj(Context context, String str, int i, List list) {
        this.LLILLL = context;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = list;
        this.LLJIJIL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, i, false, false);
        this.LLJILJIL = new C1225930i0V(EnumC1226540i1U.TAB_KEY_GROUP_MEMBER, null, new C1225500hzo(C1226680i1i.LIZIZ(), str, Boolean.FALSE, list, true), 30);
        this.LLJILLL = new C1225090hz9(new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131830186, CardStruct.IStatusCode.DEFAULT, Integer.valueOf(i)), true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, str);
        this.LLJJ = new C1224860hym(context.getString(2131830187), false, Collections.singleton(EnumC1224880hyo.START), false);
    }
}
