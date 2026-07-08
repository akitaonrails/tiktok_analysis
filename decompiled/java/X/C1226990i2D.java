package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0i2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226990i2D extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final List<String> LLJ;
    public final String LLJI;
    public final EnumC1230500i7s LLJIJIL;
    public final String LLJILJIL;
    public final C1224440hy6 LLJILJILJ;
    public final C1227120i2Q LLJILLL;
    public final C1225930i0V LLJJ;
    public final C1225860i0O<C1227080i2M> LLJJI;
    public final C1227620i3E LLJJIII;
    public final C1224860hym LLJJIJI;
    public final C1223940hxI LLJJIJIIJIL;

    public C1226990i2D() {
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
        if (!(obj instanceof C1226990i2D)) {
            return false;
        }
        C1226990i2D c1226990i2D = (C1226990i2D) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226990i2D.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226990i2D.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226990i2D.LLILZIL) && this.LLILZLL == c1226990i2D.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1226990i2D.LLIZ) && this.LLIZLLLIL == c1226990i2D.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1226990i2D.LLJ) && Intrinsics.LJFF(this.LLJI, c1226990i2D.LLJI) && this.LLJIJIL == c1226990i2D.LLJIJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        EnumC1230500i7s enumC1230500i7s = this.LLJIJIL;
        return iHashCode + (enumC1230500i7s == null ? 0 : enumC1230500i7s.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddMemberTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", maxSelectableCount=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", withSuggest=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", defaultButtonHint=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", joinGroupSource=");
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
    public final /* bridge */ /* synthetic */ C1224340hxw LIZJ() {
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
    public final C1225860i0O<C1227080i2M> LJII() {
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

    public C1226990i2D(Context context, String str, String str2, int i, String str3, List list, String str4, EnumC1230500i7s enumC1230500i7s) {
        EnumC1224720hyY enumC1224720hyY;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = false;
        this.LLJ = list;
        this.LLJI = str4;
        this.LLJIJIL = enumC1230500i7s;
        this.LLJILJIL = "AddMemberTemplate";
        boolean z = false;
        this.LLJILJILJ = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.TOP, str, str2, false, false, false, null, 1920);
        this.LLJILLL = new C1227120i2Q(EnumC1224390hy1.MULTIPLE, i, true, null, null, list);
        this.LLJJ = new C1225930i0V(EnumC1226540i1U.TAB_KEY_FRIENDS, null, new C1227070i2L(C1226680i1i.LIZIZ(), null, list, null, null, Boolean.TRUE, false, null, null), 30);
        C1223610hwl c1223610hwl = new C1223610hwl(true, true);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        c20603715jn.LIZLLL = iMStyleViewBridgeApiLIZ != null ? iMStyleViewBridgeApiLIZ.LIZIZ() : null;
        this.LLJJI = new C1225860i0O<>(c1223610hwl, new C1227080i2M(c20603715jn, true, null, list, null, null));
        C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131827845, 0), true, false);
        C1224590hyL c1224590hyL2 = new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false);
        if (!a0.LJJJIL(str4)) {
            enumC1224720hyY = EnumC1224720hyY.POLICY;
        } else {
            enumC1224720hyY = EnumC1224720hyY.ONE_BUTTON;
        }
        this.LLJJIII = new C1227620i3E(str4, c1224590hyL, c1224590hyL2, enumC1224720hyY, str3, new C873240YNm(str3, C13BV.INSTANCE, C1229420i68.LIZ(C461720I8s.LIZJ(), null, new C900560ZUo("finish_add_member", str, str2), enumC1230500i7s, 6), z, 120), Boolean.FALSE, new AwS595S0100000_16(this, 282), new AwS595S0100000_16(this, 283), list, false);
        this.LLJJIJI = new C1224860hym(context.getString(2131831348), false, Collections.singleton(EnumC1224880hyo.START), false);
        this.LLJJIJIIJIL = new C1223940hxI(true, false, context.getString(2131831124));
    }
}
