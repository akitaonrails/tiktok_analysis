package X;

import android.content.Context;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226190i0v extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final InterfaceC1225830i0L LLILZ;
    public final C869290Y8h LLIZLLLIL;
    public final Function1<C0Y8T, Boolean> LLJ;
    public final C1225930i0V LLJILJIL;
    public final C1225860i0O<C1223510hwb> LLJILJILJ;
    public final C1224340hxw LLJILLL;
    public final C1226220i0y LLJJ;
    public final C1224860hym LLJJI;
    public final C1223940hxI LLJJIII;
    public final String LLILZIL = "InboxTabPageStatusViewVH";
    public final String LLILZLL = "InboxTabPageStatusViewVH";
    public final int LLIZ = 99;
    public final String LLJI = "select_to_star_chat_page_template";
    public final C1224440hy6 LLJIJIL = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.TOP, "InboxTabPageStatusViewVH", "InboxTabPageStatusViewVH", false, false, false, null, 1920);

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226190i0v)) {
            return false;
        }
        C1226190i0v c1226190i0v = (C1226190i0v) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226190i0v.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226190i0v.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226190i0v.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226190i0v.LLILZLL) && this.LLIZ == c1226190i0v.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1226190i0v.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1226190i0v.LLJ);
    }

    public final int hashCode() {
        int iHashCode = this.LLILLL.hashCode() * 31;
        InterfaceC1225830i0L interfaceC1225830i0L = this.LLILZ;
        return ((((((((((iHashCode + (interfaceC1225830i0L == null ? 0 : interfaceC1225830i0L.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectToStarChatTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectorCallback=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", maxSelectCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", conversationQuery=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", filterAfterQuery=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJ;
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
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1223510hwb> LJII() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJI;
    }

    public C1226190i0v(Context context, C1226230i0z c1226230i0z, C869290Y8h c869290Y8h, AwS380S0200000_14 awS380S0200000_14) {
        Class<? extends PowerLoadingCell> clsLIZIZ;
        this.LLILLL = context;
        this.LLILZ = c1226230i0z;
        this.LLIZLLLIL = c869290Y8h;
        this.LLJ = awS380S0200000_14;
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LOCAL_CONVERSATION;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        if (iMStyleViewBridgeApiLIZ != null) {
            clsLIZIZ = iMStyleViewBridgeApiLIZ.LIZIZ();
        } else {
            clsLIZIZ = null;
        }
        c20603715jn.LIZLLL = clsLIZIZ;
        this.LLJILJIL = new C1225930i0V(enumC1226540i1U, null, new C1226200i0w(c20603715jn, c869290Y8h, awS380S0200000_14), 30);
        this.LLJILJILJ = new C1225860i0O<>(new C1223610hwl(false, false), new C1223510hwb(new C20603715jn(), false, false));
        this.LLJILLL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, 99, false, false);
        this.LLJJ = new C1226220i0y(new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131845369), true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, context, new AwS593S0100000_14(this, 383));
        this.LLJJI = new C1224860hym(context.getString(2131845366), false, Collections.singleton(EnumC1224880hyo.START), false);
        this.LLJJIII = new C1223940hxI(true, false, null);
    }
}
