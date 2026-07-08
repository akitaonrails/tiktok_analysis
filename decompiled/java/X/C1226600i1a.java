package X;

import android.content.Context;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226600i1a extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final C1390920mIc LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final long LLJIJIL;
    public final C1224590hyL LLJILJIL;
    public final Integer LLJILJILJ;
    public final C1226850i1z LLJILLL;
    public final String LLJJ;
    public final C1224440hy6 LLJJI;
    public final C1224340hxw LLJJIII;
    public final C1225930i0V LLJJIJI;
    public final C1225470hzl LLJJIJIIJIL;
    public final C1226580i1Y LLJJIJIL;
    public final C1224860hym LLJJJ;
    public final C1223940hxI LLJJJIL;

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
        if (!(obj instanceof C1226600i1a)) {
            return false;
        }
        C1226600i1a c1226600i1a = (C1226600i1a) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226600i1a.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226600i1a.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226600i1a.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226600i1a.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1226600i1a.LLIZ) && this.LLIZLLLIL == c1226600i1a.LLIZLLLIL && this.LLJ == c1226600i1a.LLJ && this.LLJI == c1226600i1a.LLJI && this.LLJIJIL == c1226600i1a.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1226600i1a.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1226600i1a.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1226600i1a.LLJILLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C1390920mIc c1390920mIc = this.LLIZ;
        int iHashCode2 = (((((((((((iHashCode + (c1390920mIc == null ? 0 : c1390920mIc.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Y2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31;
        Integer num = this.LLJILJILJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C1226850i1z c1226850i1z = this.LLJILLL;
        return iHashCode3 + (c1226850i1z != null ? c1226850i1z.hashCode() : 0);
    }

    public final String toString() {
        return "CreatorGroupTemplateConfig(context=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", enterMethod=" + this.LLILZIL + ", conversationId=" + this.LLILZLL + ", sheetBuilder=" + this.LLIZ + ", isFullScreen=" + this.LLIZLLLIL + ", leaveGroup=" + this.LLJ + ", includeSelf=" + this.LLJI + ", delayTime=" + this.LLJIJIL + ", defaultMainButtonState=" + this.LLJILJIL + ", sheetBuilderVariant=" + this.LLJILJILJ + ", params=" + this.LLJILLL + ')';
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJ;
    }

    public C1226600i1a(Context context, String str, String str2, boolean z, boolean z2, long j, C1226850i1z c1226850i1z) {
        Integer num;
        List listSingletonList;
        EnumC1224880hyo enumC1224880hyo;
        C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131850366), true, false);
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = "";
        this.LLIZ = null;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = true;
        this.LLJIJIL = j;
        this.LLJILJIL = c1224590hyL;
        this.LLJILJILJ = null;
        this.LLJILLL = c1226850i1z;
        this.LLJJ = "live_creator_group_template";
        if (z) {
            num = 5555;
        } else {
            num = null;
        }
        int i = 0;
        this.LLJJI = new C1224440hy6(z, num, C1226680i1i.LIZ(this), null, EnumC1222430hur.NONE, str, str2, false, false, false, null, 1920);
        this.LLJJIII = new C1224340hxw(EnumC1224390hy1.SINGLE, 1, false, false);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_CREATOR_GROUP;
        GroupCompositeType groupCompositeType = new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.FAN_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue());
        GroupEntrance groupEntrance = (GroupEntrance) ((LinkedHashMap) C1229040i5W.LJII(Collections.singletonList(groupCompositeType))).get(groupCompositeType);
        if (groupEntrance != null && groupEntrance.canCreate) {
            listSingletonList = Collections.singletonList(C1226730i1n.LJ(new C1226730i1n(i), null, 29));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        this.LLJJIJI = new C1225930i0V(enumC1226540i1U, listSingletonList, new C1225530hzr(C1226680i1i.LIZIZ(), j), 28);
        this.LLJJIJIIJIL = C1225470hzl.LIZJ;
        this.LLJJIJIL = new C1226580i1Y(c1224590hyL, new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, c1226850i1z);
        String string = context.getString(2131850367);
        if (z) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLJJJ = new C1224860hym(string, false, Collections.singleton(enumC1224880hyo), false);
        this.LLJJJIL = new C1223940hxI(false, false, null);
    }
}
