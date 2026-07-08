package X;

import android.content.Context;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0i29, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226950i29 extends AbstractC1225780i0G {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final List<String> LLIZ;
    public final int LLIZLLLIL;
    public final List<InvitationListTabInfo> LLJ;
    public final C1227810i3X LLJI;
    public final String LLJIJIL;
    public final EnumC1230500i7s LLJILJIL;
    public final String LLJILJILJ = "public_group_invite_template";
    public final C1224440hy6 LLJILLL;
    public final C1226170i0t LLJJ;
    public final C1225940i0W LLJJI;
    public final C1225860i0O<C1227080i2M> LLJJIII;
    public final C1227620i3E LLJJIJI;
    public final C1224860hym LLJJIJIIJIL;
    public final C1223940hxI LLJJIJIL;

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
        if (!(obj instanceof C1226950i29)) {
            return false;
        }
        C1226950i29 c1226950i29 = (C1226950i29) obj;
        return Intrinsics.LJFF(this.LLILLL, c1226950i29.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226950i29.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1226950i29.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1226950i29.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1226950i29.LLIZ) && this.LLIZLLLIL == c1226950i29.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1226950i29.LLJ) && Intrinsics.LJFF(this.LLJI, c1226950i29.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1226950i29.LLJIJIL) && this.LLJILJIL == c1226950i29.LLJILJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31;
        List<InvitationListTabInfo> list = this.LLJ;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31;
        EnumC1230500i7s enumC1230500i7s = this.LLJILJIL;
        return iHashCode2 + (enumC1230500i7s != null ? enumC1230500i7s.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicGroupInviteTemplateConfig(context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", maxSelectableCount=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", effectiveTabs=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", emptyStatusInfo=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", defaultButtonHint=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", joinGroupSource=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224580hyK LIZ() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final /* bridge */ /* synthetic */ C1224340hxw LIZJ() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1227080i2M> LJII() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Boolean, java.lang.Integer, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.00c6, com.ss.android.ugc.aweme.feature.newselector.config.newconversation.RecomReasonData, java.lang.Boolean, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.00c6, com.ss.android.ugc.aweme.feature.newselector.config.newconversation.RecomReasonData, java.lang.Boolean, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public C1226950i29(Context context, String str, String str2, String str3, List<String> list, int i, List<InvitationListTabInfo> list2, C1227810i3X c1227810i3X, String str4, EnumC1230500i7s enumC1230500i7s) {
        String strValueOf;
        String string;
        Object c098200Yq;
        ?? r13;
        C1223510hwb c1227090i2N;
        EnumC1226540i1U enumC1226540i1U;
        Class<? extends PowerLoadingCell> clsLIZIZ;
        EnumC1224720hyY enumC1224720hyY;
        EnumC1224880hyo enumC1224880hyo;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = list;
        this.LLIZLLLIL = i;
        this.LLJ = list2;
        this.LLJI = c1227810i3X;
        this.LLJIJIL = str4;
        this.LLJILJIL = enumC1230500i7s;
        ?? r132 = 0;
        this.LLJILLL = new C1224440hy6(true, null, C1226680i1i.LIZ(this), null, EnumC1222430hur.TOP, str, str2, false, false, false, null, 1920);
        this.LLJJ = new C1226170i0t(EnumC1224390hy1.MULTIPLE, i, list);
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            EnumC1226540i1U enumC1226540i1U2 = EnumC1226540i1U.TAB_KEY_FRIENDS;
            arrayList.add(new C1225950i0X(new C1224570hyJ(C1226560i1W.LIZ(enumC1226540i1U2), enumC1226540i1U2.getValue()), new C1227070i2L(C1226680i1i.LIZIZ(), null, list, null, null, null, null, null, null)));
        } else {
            ArrayList<InvitationListTabInfo> arrayList2 = new ArrayList();
            for (InvitationListTabInfo invitationListTabInfo : list2) {
                if (invitationListTabInfo.dataSource != 0) {
                    arrayList2.add(invitationListTabInfo);
                }
            }
            for (InvitationListTabInfo invitationListTabInfo2 : arrayList2) {
                int i2 = invitationListTabInfo2.invitationListType;
                if (i2 == 100) {
                    strValueOf = EnumC1226540i1U.TAB_KEY_FRIENDS.getValue();
                } else {
                    strValueOf = String.valueOf(i2);
                }
                String str5 = invitationListTabInfo2.displayName;
                if (str5 != null) {
                    string = a0.LJLIIIL(str5).toString();
                } else {
                    string = null;
                }
                String strLIZ = "";
                string = string == null ? "" : string;
                if (string.length() <= 0) {
                    switch (invitationListTabInfo2.invitationListType) {
                        case 1:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_SUBSCRIBERS;
                            break;
                        case 2:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_FANS;
                            break;
                        case 3:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_FOLLOWERS;
                            break;
                        case 4:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_CAMPUS_MEMBERS;
                            break;
                        case 5:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME;
                            break;
                        case 6:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_MOST_GIFT_COUNT;
                            break;
                        case 7:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_SMB;
                            break;
                        case 8:
                            enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST;
                            break;
                        default:
                            string = strLIZ;
                            break;
                    }
                    if (enumC1226540i1U != null) {
                        strLIZ = C1226560i1W.LIZ(enumC1226540i1U);
                    }
                    string = strLIZ;
                }
                if (invitationListTabInfo2.dataSource == 2) {
                    int i3 = invitationListTabInfo2.invitationListType;
                    List<String> list3 = this.LLIZ;
                    if (i3 == 100) {
                        r13 = r132;
                        c1227090i2N = new C1227070i2L(C1226680i1i.LIZIZ(), r13, list3, r13, r13, r13, r13, r13, r13);
                    } else {
                        r13 = r132;
                        c1227090i2N = new C1227070i2L(C1226680i1i.LIZIZ(), r13, list3, r13, r13, r13, r13, r13, r13);
                    }
                } else {
                    int i4 = invitationListTabInfo2.invitationListType;
                    List<GroupAccessCriteria> listLIZJ = C0Z58.LIZ.LIZJ(this.LLILZLL);
                    C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
                    List<String> list4 = this.LLIZ;
                    Integer numValueOf = Integer.valueOf(i4);
                    try {
                        c098200Yq = Long.valueOf(CastLongProtector.parseLong(this.LLILZLL));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    r13 = r132;
                    c1227090i2N = new C1227090i2N(c20603715jnLIZIZ, list4, new GroupInviteListRequest(0, r13, numValueOf, (Long) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq), C2097608Jq.LJ(), listLIZJ, r13, r13, 194, r13), this.LLJI, EnumC1224830hyj.HIGHER);
                }
                arrayList.add(new C1225950i0X(new C1224570hyJ(string, strValueOf), c1227090i2N));
                r132 = r13;
            }
        }
        this.LLJJI = new C1225940i0W(arrayList);
        C1223610hwl c1223610hwl = new C1223610hwl(true, true);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        if (iMStyleViewBridgeApiLIZ != null) {
            clsLIZIZ = iMStyleViewBridgeApiLIZ.LIZIZ();
        } else {
            clsLIZIZ = null;
        }
        c20603715jn.LIZLLL = clsLIZIZ;
        this.LLJJIII = new C1225860i0O<>(c1223610hwl, new C1227080i2M(c20603715jn, true, null, this.LLIZ, null, null));
        String str6 = this.LLJIJIL;
        C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, this.LLILLL.getString(2131830167), true, false);
        C1224590hyL c1224590hyL2 = new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false);
        if (!a0.LJJJIL(this.LLJIJIL)) {
            enumC1224720hyY = EnumC1224720hyY.POLICY;
        } else {
            enumC1224720hyY = EnumC1224720hyY.ONE_BUTTON;
        }
        String str7 = this.LLILZLL;
        this.LLJJIJI = new C1227620i3E(str6, c1224590hyL, c1224590hyL2, enumC1224720hyY, str7, new C873240YNm(str7, C13BV.INSTANCE, C1229420i68.LIZ(C461720I8s.LIZJ(), "send_invite", new C900560ZUo("finish_add_member", this.LLILZ, this.LLILZIL), this.LLJILJIL, 2), false, 112), Boolean.FALSE, new AwS593S0100000_14(this, 364), new AwS593S0100000_14(this, 365), this.LLIZ, true);
        String string2 = this.LLILLL.getString(2131831418);
        if (this.LLJILLL.LIZ) {
            enumC1224880hyo = EnumC1224880hyo.START;
        } else {
            enumC1224880hyo = EnumC1224880hyo.END;
        }
        this.LLJJIJIIJIL = new C1224860hym(string2, false, Collections.singleton(enumC1224880hyo), false);
        this.LLJJIJIL = new C1223940hxI(true, false, this.LLILLL.getString(2131831124));
    }
}
