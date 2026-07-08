package X;

import android.content.Context;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feature.newselector.config.newconversation.RecomReasonData;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226980i2C extends AbstractC1227390i2r {
    public static final /* synthetic */ int LLLII = 0;
    public final Context LLILLL;
    public final Map<String, Object> LLILZ;
    public final InterfaceC1225830i0L LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Map<String, String> LLIZLLLIL;
    public final boolean LLJ;
    public final List<String> LLJI;
    public final String LLJIJIL;
    public final EnumC913760Zt0 LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final int LLJJ;
    public final boolean LLJJI;
    public final String LLJJIII;
    public final Function1<C0Y8T, Unit> LLJJIJI;
    public final Function1<Integer, String> LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final List<String> LLJJJIL;
    public final String LLJJJJ;
    public final List<C1226750i1p> LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final RecomReasonData LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final EnumC1222430hur LLJLLIL;
    public final EnumC1230500i7s LLJLLL;
    public final String LLJZ;
    public final C1225520hzq LLJZIJLIL;
    public final C1227120i2Q LLL;
    public final C1225930i0V LLLF;
    public final C1225860i0O<C1227080i2M> LLLFF;
    public final C1228000i3q LLLFFI;
    public final C1224860hym LLLFZ;
    public final C1223940hxI LLLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226980i2C)) {
            return false;
        }
        C1226980i2C c1226980i2C = (C1226980i2C) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226980i2C.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226980i2C.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226980i2C.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226980i2C.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1226980i2C.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1226980i2C.LLIZLLLIL) && this.LLJ == c1226980i2C.LLJ && Intrinsics.LJFF(this.LLJI, c1226980i2C.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1226980i2C.LLJIJIL) && this.LLJILJIL == c1226980i2C.LLJILJIL && this.LLJILJILJ == c1226980i2C.LLJILJILJ && this.LLJILLL == c1226980i2C.LLJILLL && this.LLJJ == c1226980i2C.LLJJ && this.LLJJI == c1226980i2C.LLJJI && Intrinsics.LJFF(this.LLJJIII, c1226980i2C.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1226980i2C.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1226980i2C.LLJJIJIIJIL) && this.LLJJIJIL == c1226980i2C.LLJJIJIL && this.LLJJJ == c1226980i2C.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c1226980i2C.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1226980i2C.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1226980i2C.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1226980i2C.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1226980i2C.LLJJL) && this.LLJJLIIIJLLLLLLLZ == c1226980i2C.LLJJLIIIJLLLLLLLZ && this.LLJL == c1226980i2C.LLJL && this.LLJLIL == c1226980i2C.LLJLIL && this.LLJLILLLLZIIL == c1226980i2C.LLJLILLLLZIIL && this.LLJLL == c1226980i2C.LLJLL && this.LLJLLIL == c1226980i2C.LLJLLIL && this.LLJLLL == c1226980i2C.LLJLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LLILLL.hashCode() * 31;
        Map<String, Object> map = this.LLILZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC1225830i0L interfaceC1225830i0L = this.LLILZIL;
        int iHashCode3 = (((((iHashCode2 + (interfaceC1225830i0L == null ? 0 : interfaceC1225830i0L.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        Map<String, String> map2 = this.LLIZLLLIL;
        int iHashCode4 = (((iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        List<String> list = this.LLJI;
        int iHashCode5 = (((((((((((((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + this.LLJJ) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + this.LLJJIII.hashCode()) * 31;
        Function1<C0Y8T, Unit> function1 = this.LLJJIJI;
        int iHashCode6 = (((((((((((((iHashCode5 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + this.LLJJJJJIL.hashCode()) * 31;
        String str = this.LLJJJJLIIL;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        RecomReasonData recomReasonData = this.LLJJL;
        int iHashCode8 = (((((((((((((iHashCode7 + (recomReasonData == null ? 0 : recomReasonData.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + C786410Ut5.Z2(this.LLJLILLLLZIIL)) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31) + this.LLJLLIL.hashCode()) * 31;
        EnumC1230500i7s enumC1230500i7s = this.LLJLLL;
        return iHashCode8 + (enumC1230500i7s != null ? enumC1230500i7s.hashCode() : 0);
    }

    public final String toString() {
        return "NewConversationTemplateConfig(context=" + this.LLILLL + ", extraETParams=" + this.LLILZ + ", selectorCallback=" + this.LLILZIL + ", enterFrom=" + this.LLILZLL + ", enterMethod=" + this.LLIZ + ", bizExtMap=" + this.LLIZLLLIL + ", showActiveStatus=" + this.LLJ + ", defaultSelectedIdList=" + this.LLJI + ", navTitle=" + this.LLJIJIL + ", groupType=" + this.LLJILJIL + ", enterChatRoomAfterCreatedSuccess=" + this.LLJILJILJ + ", enterQuickChat=" + this.LLJILLL + ", quickChatViewType=" + this.LLJJ + ", disableMask=" + this.LLJJI + ", trafficType=" + this.LLJJIII + ", createGroupCallback=" + this.LLJJIJI + ", confirmButtonText=" + this.LLJJIJIIJIL + ", defaultShowKeyboard=" + this.LLJJIJIL + ", reportShowDismissEvent=" + this.LLJJJ + ", stickyTopUidList=" + this.LLJJJIL + ", stickyTopText=" + this.LLJJJJ + ", headerList=" + this.LLJJJJJIL + ", recId=" + this.LLJJJJLIIL + ", recomReasonData=" + this.LLJJL + ", shouldReduceRecom=" + this.LLJJLIIIJLLLLLLLZ + ", sendInviteAfterCreatedSuccess=" + this.LLJL + ", isFullScreen=" + this.LLJLIL + ", confirmWidgetManagedExternally=" + this.LLJLILLLLZIIL + ", searchBarManagedExternally=" + this.LLJLL + ", selectedListPosition=" + this.LLJLLIL + ", joinGroupSource=" + this.LLJLLL + ')';
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224340hxw LIZJ() {
        return this.LLL;
    }

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLLFZ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLLF;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLLI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1227080i2M> LJII() {
        return this.LLLFF;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224440hy6 LJIIIZ() {
        return this.LLJZIJLIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJZ;
    }

    @Override // X.AbstractC1227390i2r
    public final AbstractC1227390i2r LJIIJJI(boolean z, EnumC1222430hur enumC1222430hur, InterfaceC1225830i0L interfaceC1225830i0L, Map map) {
        return LJIIL(this, map, interfaceC1225830i0L, false, 0, false, z, true, true, enumC1222430hur, 1140850681);
    }

    public static C1226980i2C LJIIL(C1226980i2C c1226980i2C, Map map, InterfaceC1225830i0L interfaceC1225830i0L, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, EnumC1222430hur enumC1222430hur, int i2) {
        Context context;
        String str;
        String str2;
        Map<String, String> map2;
        boolean z6;
        List<String> list;
        String str3;
        EnumC913760Zt0 enumC913760Zt0;
        boolean z7;
        String str4;
        Function1<C0Y8T, Unit> function1;
        Function1<Integer, String> function12;
        boolean z8;
        boolean z9;
        List<String> list2;
        String str5;
        List<C1226750i1p> list3;
        String str6;
        RecomReasonData recomReasonData;
        boolean z10;
        boolean z11;
        boolean z12 = z5;
        boolean z13 = z3;
        boolean z14 = z4;
        InterfaceC1225830i0L interfaceC1225830i0L2 = interfaceC1225830i0L;
        boolean z15 = z2;
        EnumC1222430hur enumC1222430hur2 = enumC1222430hur;
        Map map3 = map;
        int i3 = i;
        boolean z16 = z;
        EnumC1230500i7s enumC1230500i7s = null;
        if ((i2 & 1) != 0) {
            context = c1226980i2C.LLILLL;
        } else {
            context = null;
        }
        if ((i2 & 2) != 0) {
            map3 = c1226980i2C.LLILZ;
        }
        if ((i2 & 4) != 0) {
            interfaceC1225830i0L2 = c1226980i2C.LLILZIL;
        }
        if ((i2 & 8) != 0) {
            str = c1226980i2C.LLILZLL;
        } else {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = c1226980i2C.LLIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = c1226980i2C.LLIZLLLIL;
        } else {
            map2 = null;
        }
        if ((i2 & 64) != 0) {
            z6 = c1226980i2C.LLJ;
        } else {
            z6 = false;
        }
        if ((i2 & 128) != 0) {
            list = c1226980i2C.LLJI;
        } else {
            list = null;
        }
        if ((i2 & 256) != 0) {
            str3 = c1226980i2C.LLJIJIL;
        } else {
            str3 = null;
        }
        if ((i2 & 512) != 0) {
            enumC913760Zt0 = c1226980i2C.LLJILJIL;
        } else {
            enumC913760Zt0 = null;
        }
        if ((i2 & 1024) != 0) {
            z7 = c1226980i2C.LLJILJILJ;
        } else {
            z7 = false;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z16 = c1226980i2C.LLJILLL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = c1226980i2C.LLJJ;
        }
        if ((i2 & 8192) != 0) {
            z15 = c1226980i2C.LLJJI;
        }
        if ((i2 & 16384) != 0) {
            str4 = c1226980i2C.LLJJIII;
        } else {
            str4 = null;
        }
        if ((32768 & i2) != 0) {
            function1 = c1226980i2C.LLJJIJI;
        } else {
            function1 = null;
        }
        if ((65536 & i2) != 0) {
            function12 = c1226980i2C.LLJJIJIIJIL;
        } else {
            function12 = null;
        }
        if ((131072 & i2) != 0) {
            z8 = c1226980i2C.LLJJIJIL;
        } else {
            z8 = false;
        }
        if ((262144 & i2) != 0) {
            z9 = c1226980i2C.LLJJJ;
        } else {
            z9 = false;
        }
        if ((524288 & i2) != 0) {
            list2 = c1226980i2C.LLJJJIL;
        } else {
            list2 = null;
        }
        if ((1048576 & i2) != 0) {
            str5 = c1226980i2C.LLJJJJ;
        } else {
            str5 = null;
        }
        if ((2097152 & i2) != 0) {
            list3 = c1226980i2C.LLJJJJJIL;
        } else {
            list3 = null;
        }
        if ((4194304 & i2) != 0) {
            str6 = c1226980i2C.LLJJJJLIIL;
        } else {
            str6 = null;
        }
        if ((8388608 & i2) != 0) {
            recomReasonData = c1226980i2C.LLJJL;
        } else {
            recomReasonData = null;
        }
        if ((16777216 & i2) != 0) {
            z10 = c1226980i2C.LLJJLIIIJLLLLLLLZ;
        } else {
            z10 = false;
        }
        if ((33554432 & i2) != 0) {
            z11 = c1226980i2C.LLJL;
        } else {
            z11 = false;
        }
        if ((67108864 & i2) != 0) {
            z13 = c1226980i2C.LLJLIL;
        }
        if ((134217728 & i2) != 0) {
            z14 = c1226980i2C.LLJLILLLLZIIL;
        }
        if ((268435456 & i2) != 0) {
            z12 = c1226980i2C.LLJLL;
        }
        if ((536870912 & i2) != 0) {
            enumC1222430hur2 = c1226980i2C.LLJLLIL;
        }
        if ((i2 & 1073741824) != 0) {
            enumC1230500i7s = c1226980i2C.LLJLLL;
        }
        c1226980i2C.getClass();
        return new C1226980i2C(context, map3, interfaceC1225830i0L2, str, str2, map2, z6, list, str3, enumC913760Zt0, z7, z16, i3, z15, str4, function1, function12, z8, z9, list2, str5, list3, str6, recomReasonData, z10, z11, z13, z14, z12, enumC1222430hur2, enumC1230500i7s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1226980i2C(Context context, Map map, C1226240i10 c1226240i10, String str, String str2, boolean z, List list, String str3, EnumC913760Zt0 enumC913760Zt0, boolean z2, String str4, Function1 function1, Function1 function12, boolean z3, List list2, String str5, List list3, String str6, RecomReasonData recomReasonData, boolean z4, boolean z5, boolean z6, EnumC1230500i7s enumC1230500i7s, int i) {
        EnumC1222430hur enumC1222430hur;
        boolean z7 = z4;
        RecomReasonData recomReasonData2 = recomReasonData;
        List list4 = list3;
        C1226240i10 c1226240i102 = c1226240i10;
        Function1 awS598S0100000_19 = function12;
        Function1 function13 = function1;
        boolean z8 = z5;
        boolean z9 = z3;
        List list5 = list;
        EnumC913760Zt0 enumC913760Zt02 = enumC913760Zt0;
        boolean z10 = z6;
        List list6 = list2;
        String string = str3;
        boolean z11 = z2;
        boolean z12 = z;
        String str7 = str4;
        String str8 = str6;
        Map map2 = (i & 2) != 0 ? null : map;
        c1226240i102 = (i & 4) != 0 ? null : c1226240i102;
        z12 = (i & 64) != 0 ? true : z12;
        list5 = (i & 128) != 0 ? null : list5;
        string = (i & 256) != 0 ? context.getString(2131831123) : string;
        enumC913760Zt02 = (i & 512) != 0 ? EnumC913760Zt0.NORMAL_GROUP_CHAT : enumC913760Zt02;
        z11 = (i & 1024) != 0 ? true : z11;
        str7 = (i & 16384) != 0 ? "" : str7;
        function13 = (32768 & i) != 0 ? null : function13;
        awS598S0100000_19 = (65536 & i) != 0 ? new AwS598S0100000_19(context, 869) : awS598S0100000_19;
        z9 = (262144 & i) != 0 ? false : z9;
        list6 = (524288 & i) != 0 ? C13BV.INSTANCE : list6;
        String str9 = (1048576 & i) == 0 ? str5 : "";
        list4 = (2097152 & i) != 0 ? C13BV.INSTANCE : list4;
        str8 = (4194304 & i) != 0 ? null : str8;
        recomReasonData2 = (8388608 & i) != 0 ? null : recomReasonData2;
        z7 = (16777216 & i) != 0 ? false : z7;
        z8 = (33554432 & i) != 0 ? false : z8;
        z10 = (67108864 & i) != 0 ? true : z10;
        if ((536870912 & i) != 0) {
            enumC1222430hur = EnumC1222430hur.TOP;
        } else {
            enumC1222430hur = null;
        }
        this(context, map2, c1226240i102, str, str2, null, z12, list5, string, enumC913760Zt02, z11, false, 0, false, str7, function13, awS598S0100000_19, false, z9, list6, str9, list4, str8, recomReasonData2, z7, z8, z10, false, false, enumC1222430hur, (i & 1073741824) == 0 ? enumC1230500i7s : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1226980i2C(Context context, Map<String, ? extends Object> map, InterfaceC1225830i0L interfaceC1225830i0L, String str, String str2, Map<String, String> map2, boolean z, List<String> list, String str3, EnumC913760Zt0 enumC913760Zt0, boolean z2, boolean z3, int i, boolean z4, String str4, Function1<? super C0Y8T, Unit> function1, Function1<? super Integer, String> function12, boolean z5, boolean z6, List<String> list2, String str5, List<? extends C1226750i1p> list3, String str6, RecomReasonData recomReasonData, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, EnumC1222430hur enumC1222430hur, EnumC1230500i7s enumC1230500i7s) {
        boolean z12;
        EnumC114800c6 enumC114800c6;
        Class<? extends PowerLoadingCell> clsLIZ;
        EnumC114800c6 enumC114800c62;
        boolean z13;
        int size;
        C1224590hyL c1224590hyL;
        EnumC1224720hyY enumC1224720hyY;
        EnumC1224880hyo enumC1224880hyo;
        this.LLILLL = context;
        this.LLILZ = map;
        this.LLILZIL = interfaceC1225830i0L;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = map2;
        this.LLJ = z;
        this.LLJI = list;
        this.LLJIJIL = str3;
        this.LLJILJIL = enumC913760Zt0;
        this.LLJILJILJ = z2;
        this.LLJILLL = z3;
        this.LLJJ = i;
        this.LLJJI = z4;
        this.LLJJIII = str4;
        this.LLJJIJI = function1;
        this.LLJJIJIIJIL = function12;
        this.LLJJIJIL = z5;
        this.LLJJJ = z6;
        this.LLJJJIL = list2;
        this.LLJJJJ = str5;
        this.LLJJJJJIL = list3;
        this.LLJJJJLIIL = str6;
        this.LLJJL = recomReasonData;
        this.LLJJLIIIJLLLLLLLZ = z7;
        this.LLJL = z8;
        this.LLJLIL = z9;
        this.LLJLILLLLZIIL = z10;
        this.LLJLL = z11;
        this.LLJLLIL = enumC1222430hur;
        this.LLJLLL = enumC1230500i7s;
        this.LLJZ = "NewConversationTemplate";
        C1390920mIc c1390920mIcLIZ = C1226680i1i.LIZ(this);
        if ((!list2.isEmpty()) && C123100dR.LIZ(str6)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.LLJZIJLIL = new C1225520hzq(z9, c1390920mIcLIZ, enumC1222430hur, str, str2, z12, z10, z11);
        this.LLL = new C1227120i2Q(EnumC1224390hy1.MULTIPLE, C0ZFX.LIZ("default") - 1, z, list, list2, null);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_FRIENDS;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list3);
        arrayList.add(new C1226940i28(0));
        C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
        if (C123100dR.LIZ(str6) && (!list2.isEmpty()) && recomReasonData != null) {
            enumC114800c6 = EnumC114800c6.CONTACT_MODULE;
        } else {
            enumC114800c6 = EnumC114800c6.RELATION_MODEL;
        }
        Boolean bool = Boolean.TRUE;
        this.LLLF = new C1225930i0V(enumC1226540i1U, arrayList, new C1227070i2L(c20603715jnLIZIZ, list, null, enumC114800c6, list2, bool, bool, str5, recomReasonData), 28);
        C1223610hwl c1223610hwl = new C1223610hwl(true, true);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        if (iMStyleViewBridgeApiLIZ != null) {
            clsLIZ = iMStyleViewBridgeApiLIZ.LIZ();
        } else {
            clsLIZ = null;
        }
        c20603715jn.LIZLLL = clsLIZ;
        if (C123100dR.LIZ(str6) && (!list2.isEmpty()) && recomReasonData != null) {
            enumC114800c62 = EnumC114800c6.CONTACT_MODULE;
        } else {
            enumC114800c62 = EnumC114800c6.RELATION_MODEL;
        }
        this.LLLFF = new C1225860i0O<>(c1223610hwl, new C1227080i2M(c20603715jn, true, list, null, enumC114800c62, list2));
        if (enumC1222430hur == EnumC1222430hur.TOP) {
            z13 = true;
        } else {
            z13 = false;
        }
        EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C1224590hyL c1224590hyL2 = new C1224590hyL(enumC1227730i3P, true, (String) function12.invoke(Integer.valueOf(size)), true, false);
        if (!z7) {
            c1224590hyL = new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false);
            enumC1224720hyY = EnumC1224720hyY.ONE_BUTTON;
        } else {
            c1224590hyL = new C1224590hyL(EnumC1227730i3P.SECONDARY, true, context.getString(2131831531), true, false);
            enumC1224720hyY = EnumC1224720hyY.TWO_BUTTON_B;
        }
        this.LLLFFI = new C1228000i3q(z13, c1224590hyL2, c1224590hyL, enumC1224720hyY, enumC913760Zt0, z2, z3, i, z4, str4, function1, function12, AFwS257S0000000_19.get$arr$(780), list2, str6, z7, z8, map2, enumC1230500i7s);
        if (z9) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLLFZ = new C1224860hym(str3, false, Collections.singleton(enumC1224880hyo), false);
        this.LLLI = new C1223940hxI(true, z5, context.getString(2131831124));
    }
}
