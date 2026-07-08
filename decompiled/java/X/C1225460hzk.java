package X;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225460hzk extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final C1390920mIc LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final C1224590hyL LLJIJIL;
    public final Integer LLJILJIL;
    public final Integer LLJILJILJ;
    public final String LLJILLL = "transfer_group_owner_template";
    public final C1224440hy6 LLJJ;
    public final C1224340hxw LLJJI;
    public final C1225930i0V LLJJIII;
    public final C1225470hzl LLJJIJI;
    public final C1224990hyz LLJJIJIIJIL;
    public final C1224860hym LLJJIJIL;
    public final C1223940hxI LLJJJ;

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
        if (!(obj instanceof C1225460hzk)) {
            return false;
        }
        C1225460hzk c1225460hzk = (C1225460hzk) obj;
        return Intrinsics.LJFF(this.LLILLL, c1225460hzk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1225460hzk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1225460hzk.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1225460hzk.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1225460hzk.LLIZ) && this.LLIZLLLIL == c1225460hzk.LLIZLLLIL && this.LLJ == c1225460hzk.LLJ && this.LLJI == c1225460hzk.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1225460hzk.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1225460hzk.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1225460hzk.LLJILJILJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C1390920mIc c1390920mIc = this.LLIZ;
        int iHashCode2 = (((((((((iHashCode + (c1390920mIc == null ? 0 : c1390920mIc.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31;
        Integer num = this.LLJILJIL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJILJILJ;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "TransferOwnerTemplateConfig(context=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", enterMethod=" + this.LLILZIL + ", conversationId=" + this.LLILZLL + ", sheetBuilder=" + this.LLIZ + ", isFullScreen=" + this.LLIZLLLIL + ", leaveGroup=" + this.LLJ + ", includeSelf=" + this.LLJI + ", defaultMainButtonState=" + this.LLJIJIL + ", sheetBuilderVariant=" + this.LLJILJIL + ", backgroundColor=" + this.LLJILJILJ + ')';
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1225860i0O LJII() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJILLL;
    }

    public C1225460hzk(Context context, String str, String str2, String str3, C1390920mIc c1390920mIc, boolean z, boolean z2, boolean z3, C1224590hyL c1224590hyL, Integer num, Integer num2) {
        EnumC1224880hyo enumC1224880hyo;
        C1390920mIc c1390920mIc2 = c1390920mIc;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c1390920mIc2;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
        this.LLJIJIL = c1224590hyL;
        this.LLJILJIL = num;
        this.LLJILJILJ = num2;
        this.LLJJ = new C1224440hy6(z, z ? 5555 : null, c1390920mIc2 == null ? C1226680i1i.LIZ(this) : c1390920mIc2, num, EnumC1222430hur.NONE, str, str2, false, false, false, num2, 896);
        this.LLJJI = new C1224340hxw(EnumC1224390hy1.SINGLE, 1, false, false);
        this.LLJJIII = new C1225930i0V(EnumC1226540i1U.TAB_KEY_GROUP_MEMBER, null, new C1225500hzo(C1226680i1i.LIZIZ(), str3, Boolean.valueOf(z3), null, false), 30);
        this.LLJJIJI = C1225470hzl.LIZJ;
        this.LLJJIJIIJIL = new C1224990hyz(c1224590hyL, new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), EnumC1224720hyY.ONE_BUTTON, str3, Boolean.valueOf(z2));
        String string = context.getString(2131828482);
        if (z) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLJJIJIL = new C1224860hym(string, false, Collections.singleton(enumC1224880hyo), false);
        this.LLJJJ = new C1223940hxI(false, false, null);
    }
}
