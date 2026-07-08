package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498100Jg8 extends AbstractC508030Jw9<C507610JvT> {
    public final LinearLayout LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public final LiveIconView LLILZIL;
    public final ViewGroup LLILZLL;
    public final C16F5 LLIZ;
    public boolean LLIZLLLIL;

    public C498100Jg8(View view) {
        super(view);
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.q8y);
        this.LLILLL = (C16F5) view.findViewById(R.id.zgp);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.zgq);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.cto);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.uj7);
        this.LLIZ = (C16F5) view.findViewById(R.id.ujc);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        Boolean boolValueOf;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        C508400Jwk c508400Jwk;
        final C507610JvT c507610JvT = (C507610JvT) interfaceC515600KJy;
        R5(c507610JvT);
        final GetSubPrivilegeDetailResponse.Data data = c507610JvT.LLILZ;
        final SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = c507610JvT.LLILZIL;
        if (subscriptionPrivilegeDetailFragment2 != null) {
            LiveIconView liveIconView = this.LLILZIL;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JhY
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = subscriptionPrivilegeDetailFragment2;
                        String strLJIJI = C497740JfY.LJIJI(2131844494);
                        if (subscriptionPrivilegeDetailFragment3.isAdded()) {
                            C474840Iji.LIZ(subscriptionPrivilegeDetailFragment3.getParentFragmentManager(), strLJIJI);
                        }
                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = subscriptionPrivilegeDetailFragment2;
                        if (subscriptionPrivilegeDetailFragment4 != null) {
                            subscriptionPrivilegeDetailFragment4.hS(C507380Jv6.LIZ(5).LIZ, C2097608Jq.LJ());
                        }
                    }
                });
            }
            SubAdminPermission subAdminPermission = data.adminPermission;
            if (subAdminPermission != null) {
                boolValueOf = Boolean.valueOf(subAdminPermission.allowPinPerk);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (subscriptionPrivilegeDetailFragment = c507610JvT.LLILZIL) != null && (c508400Jwk = subscriptionPrivilegeDetailFragment.LLJJIII) != null && c508400Jwk.LJIIJ && !Intrinsics.LJFF(c507610JvT.LLJ, "others_homepage")) {
                LiveIconView liveIconView2 = this.LLILZ;
                if (liveIconView2 != null) {
                    C786410Ut5.LJLLLLLL(0, liveIconView2);
                }
                C16F5 c16f5 = this.LLILLL;
                if (c16f5 != null) {
                    C786410Ut5.LJLLLLLL(0, c16f5);
                }
                C16F5 c16f52 = this.LLILLL;
                if (c16f52 != null) {
                    C786410Ut5.l8(c16f52, new View.OnClickListener() { // from class: X.0Jb0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Boolean bool;
                            String str;
                            String string;
                            String string2;
                            User owner;
                            SubscribeInfo subscribeInfo;
                            User owner2;
                            String secUid;
                            User owner3;
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            Room roomLJJLI = C500260Jjc.LJJLI();
                            C498100Jg8 c498100Jg8 = this.LL;
                            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = subscriptionPrivilegeDetailFragment2;
                            c498100Jg8.getClass();
                            DataChannel dataChannelLJ = C475510Ikn.LJ(subscriptionPrivilegeDetailFragment3);
                            Boolean boolValueOf2 = null;
                            if (dataChannelLJ != null) {
                                bool = (Boolean) dataChannelLJ.gg0(UserIsAnchorChannel.class);
                            } else {
                                bool = null;
                            }
                            if (C500260Jjc.LJJJI(bool)) {
                                str = "anchor";
                            } else {
                                str = "moderator";
                            }
                            C0K8F c0k8f = C0K8F.LIZ;
                            Context context = subscriptionPrivilegeDetailFragment2.getContext();
                            String strPinManagementPage = LiveSubscriptionAnchorUrlSetting.pinManagementPage();
                            Pair[] pairArr = new Pair[7];
                            if (roomLJJLI != null) {
                                string = Long.valueOf(roomLJJLI.getId()).toString();
                            } else {
                                string = null;
                            }
                            String str2 = "";
                            if (string == null) {
                                string = "";
                            }
                            pairArr[0] = new Pair("room_id", string);
                            if (roomLJJLI == null || (owner3 = roomLJJLI.getOwner()) == null || (string2 = Long.valueOf(owner3.getId()).toString()) == null) {
                                string2 = "";
                            }
                            pairArr[1] = new Pair("anchor_id", string2);
                            if (roomLJJLI != null && (owner2 = roomLJJLI.getOwner()) != null && (secUid = owner2.getSecUid()) != null) {
                                str2 = secUid;
                            }
                            pairArr[2] = new Pair("sec_anchor_id", str2);
                            pairArr[3] = new Pair("show_entrance", "privilege_intro_page");
                            pairArr[4] = new Pair("user_type", str);
                            if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                                boolValueOf2 = Boolean.valueOf(subscribeInfo.isSubscribed());
                            }
                            pairArr[5] = new Pair("is_subscribe", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf2))) ? 1 : 0));
                            pairArr[6] = new Pair("previous_page_name", "privilege_intro_page");
                            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                            c0k8f.getClass();
                            C0K8F.LJII(context, strPinManagementPage, mapLJIIIIZZ);
                            subscriptionPrivilegeDetailFragment2.LLILZ.invoke();
                        }
                    });
                }
            }
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0Jhd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:101:0x01ff A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01cc  */
                /* JADX WARN: Type inference failed for: r0v34, types: [X.0JBN] */
                /* JADX WARN: Type inference failed for: r11v3, types: [androidx.fragment.app.FragmentManager] */
                /* JADX WARN: Type inference failed for: r11v6 */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r22v0, types: [X.03nA, X.09AJ<java.util.List<X.0Jhg>>] */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v5, types: [com.bytedance.android.live.base.model.ImageModel] */
                /* JADX WARN: Type inference failed for: r3v8 */
                /* JADX WARN: Type inference failed for: r3v9 */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1, types: [X.0Jhg, android.view.View, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v3 */
                @Override // X.InterfaceC1478005qU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void subscribe(X.C09AJ<java.util.List<X.C499060Jhg>> r22) {
                    /*
                        Method dump skipped, instruction units count: 526
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C499030Jhd.subscribe(X.09AJ):void");
                }
            }).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0Jfp
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CustomizedPerksItemViewHolder@91f2.onBindViewHolder$4");
                    List<View> list = (List) obj;
                    LinearLayout linearLayout = this.LL.LLILLJJLI;
                    if (linearLayout != null) {
                        C786410Ut5.LJJJJJL(linearLayout);
                    }
                    if (list.size() <= 6) {
                        C498100Jg8 c498100Jg8 = this.LL;
                        for (View view : list) {
                            LinearLayout linearLayout2 = c498100Jg8.LLILLJJLI;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(view);
                            }
                        }
                        this.LL.LLIZLLLIL = true;
                    } else {
                        C16F5 c16f53 = this.LL.LLIZ;
                        if (c16f53 != null) {
                            c16f53.setText(C497740JfY.LJIJJ(2131844365, Integer.valueOf(list.size())));
                        }
                        List<View> listSubList = list.subList(0, 6);
                        final List listSubList2 = list.subList(6, list.size());
                        C498100Jg8 c498100Jg82 = this.LL;
                        for (View view2 : listSubList) {
                            LinearLayout linearLayout3 = c498100Jg82.LLILLJJLI;
                            if (linearLayout3 != null) {
                                linearLayout3.addView(view2);
                            }
                        }
                        final C498100Jg8 c498100Jg83 = this.LL;
                        final ViewGroup viewGroup = c498100Jg83.LLILZLL;
                        if (viewGroup != null) {
                            final SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = subscriptionPrivilegeDetailFragment2;
                            C500260Jjc.LLFFF(viewGroup);
                            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0Jfq
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    String str;
                                    if (!c498100Jg83.LLIZLLLIL) {
                                        C500260Jjc.LJIILIIL(viewGroup);
                                        C498100Jg8 c498100Jg84 = c498100Jg83;
                                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = subscriptionPrivilegeDetailFragment3;
                                        c498100Jg84.getClass();
                                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_privilege_intro_view_more_click");
                                        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(subscriptionPrivilegeDetailFragment4));
                                        if (subscriptionPrivilegeDetailFragment4 != null) {
                                            str = subscriptionPrivilegeDetailFragment4.LLILZIL;
                                        } else {
                                            str = null;
                                        }
                                        c474500IjALIZ.LJJII(str, "show_entrance");
                                        c474500IjALIZ.LIZ();
                                        List<C499060Jhg> list2 = listSubList2;
                                        C498100Jg8 c498100Jg85 = c498100Jg83;
                                        for (C499060Jhg c499060Jhg : list2) {
                                            LinearLayout linearLayout4 = c498100Jg85.LLILLJJLI;
                                            if (linearLayout4 != null) {
                                                linearLayout4.addView(c499060Jhg);
                                            }
                                        }
                                        c498100Jg83.LLIZLLLIL = true;
                                    }
                                }
                            });
                        }
                    }
                    C1C7U.LIZIZ("CustomizedPerksItemViewHolder@91f2.onBindViewHolder$4");
                }
            }, new C09JN() { // from class: X.00Jc
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CustomizedPerksItemViewHolder@91f2.onBindViewHolder$5");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PerksViewHolder bind error: ");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("CustomizedPerksItemViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("CustomizedPerksItemViewHolder@91f2.onBindViewHolder$5");
                }
            });
        }
    }

    @Override // X.AbstractC508030Jw9
    public final Map P5(C507580JvQ c507580JvQ) {
        SubPackagePrivilege subPackagePrivilegeZS;
        List<SubCustomizedBenefit> list;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c507580JvQ.LLILZIL;
        boolean z = false;
        if (subscriptionPrivilegeDetailFragment != null && (subPackagePrivilegeZS = subscriptionPrivilegeDetailFragment.zS()) != null && (list = subPackagePrivilegeZS.customizedBenefits) != null) {
            ArrayList arrayList = new ArrayList();
            for (SubCustomizedBenefit subCustomizedBenefit : list) {
                if (subCustomizedBenefit.benefitType != 2) {
                    arrayList.add(subCustomizedBenefit);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((SubCustomizedBenefit) it2.next()).perkTags.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return C2097908Jt.LIZJ(new Pair("is_perks_rare", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)));
    }
}
