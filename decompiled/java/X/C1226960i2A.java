package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226960i2A extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final List<String> LLIZ;
    public final int LLIZLLLIL;
    public final List<C1227140i2S> LLJ;
    public final C1227810i3X LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final EnumC1222430hur LLJILLL;
    public final C1224580hyK LLJJ;
    public final Function1<AbstractC1225770i0F, Map<String, String>> LLJJI;
    public final String LLJJIII;
    public final float LLJJIJI;
    public final String LLJJIJIIJIL;
    public final C1224440hy6 LLJJIJIL;
    public final C1226160i0s LLJJJ;
    public final C1225940i0W LLJJJIL;
    public final C1225860i0O<C1227080i2M> LLJJJJ;
    public final C1224580hyK LLJJJJJIL;
    public final C1224860hym LLJJJJLIIL;
    public final C1223940hxI LLJJL;

    public C1226960i2A() {
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
        if (!(obj instanceof C1226960i2A)) {
            return false;
        }
        C1226960i2A c1226960i2A = (C1226960i2A) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226960i2A.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226960i2A.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226960i2A.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226960i2A.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1226960i2A.LLIZ) && this.LLIZLLLIL == c1226960i2A.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1226960i2A.LLJ) && Intrinsics.LJFF(this.LLJI, c1226960i2A.LLJI) && this.LLJIJIL == c1226960i2A.LLJIJIL && this.LLJILJIL == c1226960i2A.LLJILJIL && this.LLJILJILJ == c1226960i2A.LLJILJILJ && this.LLJILLL == c1226960i2A.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1226960i2A.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1226960i2A.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1226960i2A.LLJJIII) && Float.compare(this.LLJJIJI, c1226960i2A.LLJJIJI) == 0;
    }

    public final String toString() {
        return "LiveInviteTemplateConfig(context=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", enterMethod=" + this.LLILZIL + ", conversationId=" + this.LLILZLL + ", alwaysSelectedAndDisableIdList=" + this.LLIZ + ", maxSelectableCount=" + this.LLIZLLLIL + ", tabInfoList=" + this.LLJ + ", emptyStatusInfo=" + this.LLJI + ", isFullScreen=" + this.LLJIJIL + ", needSearch=" + this.LLJILJIL + ", isPublicInvite=" + this.LLJILJILJ + ", selectedListPosition=" + this.LLJILLL + ", confirmWidgetProtocolConfig=" + this.LLJJ + ", logFinishAddBizExtra=" + this.LLJJI + ", chatType=" + this.LLJJIII + ", panelHeightRatio=" + this.LLJJIJI + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + this.LLJILLL.hashCode()) * 31;
        C1224580hyK c1224580hyK = this.LLJJ;
        int iHashCode2 = (iHashCode + (c1224580hyK == null ? 0 : c1224580hyK.hashCode())) * 31;
        Function1<AbstractC1225770i0F, Map<String, String>> function1 = this.LLJJI;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        String str = this.LLJJIII;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLJJIJI);
    }

    @Override // X.AbstractC1225780i0G
    public final C1224580hyK LIZ() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224340hxw LIZJ() {
        return this.LLJJJ;
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
    public final C1225860i0O<C1227080i2M> LJII() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJIJIIJIL;
    }

    public C1226960i2A(Context context, String str, String str2, String str3, List list, int i, List list2, C1227810i3X c1227810i3X, boolean z, boolean z2, EnumC1222430hur enumC1222430hur, C1224580hyK c1224580hyK, AwS33S0010000_19 awS33S0010000_19, String str4, float f, int i2) {
        boolean z3;
        EnumC1224880hyo enumC1224880hyo;
        EnumC1224830hyj enumC1224830hyj;
        float f2 = f;
        String str5 = str4;
        AwS33S0010000_19 awS33S0010000_192 = awS33S0010000_19;
        C1224580hyK c1224580hyK2 = c1224580hyK;
        EnumC1222430hur enumC1222430hur2 = enumC1222430hur;
        boolean z4 = z;
        boolean z5 = z2;
        List list3 = (i2 & 16) != 0 ? C13BV.INSTANCE : list;
        z4 = (i2 & 256) != 0 ? true : z4;
        if ((i2 & 512) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z5 = (i2 & 1024) != 0 ? true : z5;
        enumC1222430hur2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? EnumC1222430hur.TOP : enumC1222430hur2;
        c1224580hyK2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1224580hyK2;
        awS33S0010000_192 = (i2 & 8192) != 0 ? null : awS33S0010000_192;
        str5 = (i2 & 16384) != 0 ? null : str5;
        f2 = (i2 & 32768) != 0 ? 0.7f : f2;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = list3;
        this.LLIZLLLIL = i;
        this.LLJ = list2;
        this.LLJI = c1227810i3X;
        this.LLJIJIL = z4;
        this.LLJILJIL = z3;
        this.LLJILJILJ = z5;
        this.LLJILLL = enumC1222430hur2;
        this.LLJJ = c1224580hyK2;
        this.LLJJI = awS33S0010000_192;
        this.LLJJIII = str5;
        this.LLJJIJI = f2;
        this.LLJJIJIIJIL = "live_invite_template";
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLL = true;
        c1390920mIc.LIZ.LLJJL = (int) (f2 * C1232370iAt.LIZLLL(context));
        this.LLJJIJIL = new C1224440hy6(z4, null, c1390920mIc, null, enumC1222430hur2, str, str2, false, false, false, null, 1920);
        this.LLJJJ = new C1226160i0s(EnumC1224390hy1.MULTIPLE, i, list3);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C1227140i2S c1227140i2S = (C1227140i2S) it2.next();
            C1224570hyJ c1224570hyJ = new C1224570hyJ(c1227140i2S.LIZIZ, c1227140i2S.LIZ.getValue());
            C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
            List<String> list4 = this.LLIZ;
            C1227280i2g c1227280i2g = c1227140i2S.LIZJ;
            GroupInviteListRequest groupInviteListRequest = new GroupInviteListRequest(0, null, Integer.valueOf(c1227280i2g.LIZ), Long.valueOf(c1227280i2g.LIZLLL), c1227280i2g.LIZJ, c1227280i2g.LIZIZ, Boolean.TRUE, null, 130, null);
            C1227810i3X c1227810i3X2 = this.LLJI;
            if (c1227140i2S.LIZJ.LIZ == 3) {
                enumC1224830hyj = EnumC1224830hyj.HIGHER;
            } else {
                enumC1224830hyj = EnumC1224830hyj.NORMAL;
            }
            String str6 = this.LLILZLL;
            String str7 = c1227140i2S.LIZLLL;
            String str8 = this.LLJJIII;
            if (str8 == null) {
                str8 = "fan_group";
            }
            arrayList.add(new C1225950i0X(c1224570hyJ, new C1227100i2O(c20603715jnLIZIZ, list4, groupInviteListRequest, c1227810i3X2, enumC1224830hyj, str6, str7, str8, true)));
        }
        this.LLJJJIL = new C1225940i0W(arrayList);
        C1223610hwl c1223610hwl = new C1223610hwl(true, true);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        c20603715jn.LIZLLL = iMStyleViewBridgeApiLIZ != null ? iMStyleViewBridgeApiLIZ.LIZ() : null;
        this.LLJJJJ = new C1225860i0O<>(c1223610hwl, new C1227080i2M(c20603715jn, false, null, this.LLIZ, null, null));
        C1224580hyK c1227610i3D = this.LLJJ;
        if (c1227610i3D == null) {
            C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, this.LLILLL.getString(2131830167), true, false);
            C1224590hyL c1224590hyL2 = new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false);
            EnumC1224720hyY enumC1224720hyY = EnumC1224720hyY.ONE_BUTTON;
            String str9 = this.LLILZLL;
            c1227610i3D = new C1227610i3D(c1224590hyL, c1224590hyL2, enumC1224720hyY, str9, new C873240YNm(str9, C13BV.INSTANCE, C1229420i68.LIZ(C461720I8s.LIZJ(), "send_invite", new C900560ZUo("finish_add_member", this.LLILZ, this.LLILZIL), EnumC1230500i7s.ADD_MEMBER_LIVE_END, 2), false, 112), Boolean.FALSE, new AwS598S0100000_19(this, 858), new AwS598S0100000_19(this, 859), this.LLIZ, this.LLJILJILJ, null);
        }
        this.LLJJJJJIL = c1227610i3D;
        String string = this.LLILLL.getString(2131850365);
        if (this.LLJJIJIL.LIZ) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLJJJJLIIL = new C1224860hym(string, false, Collections.singleton(enumC1224880hyo), false);
        this.LLJJL = new C1223940hxI(this.LLJILJIL, false, this.LLILLL.getString(2131831124));
    }
}
