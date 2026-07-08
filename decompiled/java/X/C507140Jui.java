package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.SubSpaceInfo;

/* JADX INFO: renamed from: X.0Jui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507140Jui extends AbstractC508030Jw9<C507650JvX> {
    public final Function0<Unit> LLILLJJLI;
    public final LinearLayout LLILLL;
    public final LiveIconView LLILZ;
    public final ViewGroup LLILZIL;
    public final C16F5 LLILZLL;
    public final C197039127h LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        FragmentManager supportFragmentManager;
        List<C499090Jhj> listLIZ;
        C19EG c19egLIZ;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        C508400Jwk c508400Jwk;
        GetSubPrivilegeDetailResponse.Data data;
        SubAdminPermission subAdminPermission;
        FragmentManager supportFragmentManager2;
        C19EG c19egLIZ2;
        final C507650JvX c507650JvX = (C507650JvX) interfaceC515600KJy;
        R5(c507650JvX);
        if (!this.LLIZLLLIL) {
            Boolean boolValueOf = null;
            if (PrivilegePageVideoListSetting.INSTANCE.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21()) {
                Context context = this.itemView.getContext();
                Context context2 = this.itemView.getContext();
                if (context2 != null && (c19egLIZ2 = C1124140fMK.LIZ(context2)) != null) {
                    supportFragmentManager2 = c19egLIZ2.getSupportFragmentManager();
                } else {
                    supportFragmentManager2 = null;
                }
                listLIZ = C507260Juu.LIZ(c507650JvX, context, supportFragmentManager2, new C507190Jun(c507650JvX), this.LLILLJJLI);
            } else {
                Context context3 = this.itemView.getContext();
                Context context4 = this.itemView.getContext();
                if (context4 != null && (c19egLIZ = C1124140fMK.LIZ(context4)) != null) {
                    supportFragmentManager = c19egLIZ.getSupportFragmentManager();
                } else {
                    supportFragmentManager = null;
                }
                listLIZ = C507260Juu.LIZ(c507650JvX, context3, supportFragmentManager, new C507200Juo(c507650JvX), null);
            }
            if (listLIZ.size() > 10) {
                C500260Jjc.LLFFF(this.LLILZIL);
                C16F5 c16f5 = this.LLILZLL;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJJ(2131844365, Integer.valueOf(listLIZ.size())));
                }
                List<C499090Jhj> listLL = C13LP.LL(listLIZ, 10);
                final List listLLD = C13LP.LLD(listLIZ.size() - 10, listLIZ);
                if (listLL != null) {
                    for (C499090Jhj c499090Jhj : listLL) {
                        LinearLayout linearLayout = this.LLILLL;
                        if (linearLayout != null) {
                            linearLayout.addView(S5(c499090Jhj, c507650JvX));
                        }
                    }
                }
                ViewGroup viewGroup = this.LLILZIL;
                if (viewGroup != null) {
                    C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0Juj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C507140Jui c507140Jui = this.LL;
                            if (c507140Jui.LLJ) {
                                return;
                            }
                            c507140Jui.LLJ = true;
                            List<C499090Jhj> list = listLLD;
                            if (list != null) {
                                C507650JvX c507650JvX2 = c507650JvX;
                                for (C499090Jhj c499090Jhj2 : list) {
                                    LinearLayout linearLayout2 = c507140Jui.LLILLL;
                                    if (linearLayout2 != null) {
                                        linearLayout2.addView(c507140Jui.S5(c499090Jhj2, c507650JvX2));
                                    }
                                }
                            }
                            C500260Jjc.LJIILIIL(this.LL.LLILZIL);
                        }
                    });
                }
            } else {
                C500260Jjc.LJIILIIL(this.LLILZIL);
                for (C499090Jhj c499090Jhj2 : listLIZ) {
                    LinearLayout linearLayout2 = this.LLILLL;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(S5(c499090Jhj2, c507650JvX));
                    }
                }
            }
            this.LLIZLLLIL = true;
            if (c507650JvX != null && (data = c507650JvX.LLILZ) != null && (subAdminPermission = data.adminPermission) != null) {
                boolValueOf = Boolean.valueOf(subAdminPermission.allowPinPerk);
            }
            if (C500260Jjc.LJJJI(boolValueOf) && c507650JvX != null && (subscriptionPrivilegeDetailFragment = c507650JvX.LLILZIL) != null && (c508400Jwk = subscriptionPrivilegeDetailFragment.LLJJIII) != null && c508400Jwk.LJIIJ && !Intrinsics.LJFF(c507650JvX.LLJ, "others_homepage")) {
                C197039127h c197039127h = this.LLIZ;
                if (c197039127h != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h);
                }
                C197039127h c197039127h2 = this.LLIZ;
                if (c197039127h2 != null) {
                    c197039127h2.setText(C497740JfY.LJIJI(2131849255));
                }
                C197039127h c197039127h3 = this.LLIZ;
                if (c197039127h3 != null) {
                    C786410Ut5.U8(c197039127h3, new View.OnClickListener() { // from class: X.0Jb1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean zBooleanValue;
                            String str;
                            Context context5;
                            String string;
                            String string2;
                            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2;
                            Function0<Unit> function0;
                            User owner;
                            SubscribeInfo subscribeInfo;
                            User owner2;
                            String secUid;
                            User owner3;
                            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3;
                            Boolean bool;
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            Room roomLJJLI = C500260Jjc.LJJLI();
                            C507140Jui c507140Jui = this.LL;
                            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = c507650JvX.LLILZIL;
                            if (subscriptionPrivilegeDetailFragment4 != null && (bool = subscriptionPrivilegeDetailFragment4.LL) != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            c507140Jui.getClass();
                            if (zBooleanValue) {
                                str = "anchor";
                            } else {
                                str = "moderator";
                            }
                            C0K8F c0k8f = C0K8F.LIZ;
                            C507650JvX c507650JvX2 = c507650JvX;
                            Boolean boolValueOf2 = null;
                            if (c507650JvX2 != null && (subscriptionPrivilegeDetailFragment3 = c507650JvX2.LLILZIL) != null) {
                                context5 = subscriptionPrivilegeDetailFragment3.getContext();
                            } else {
                                context5 = null;
                            }
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
                            C0K8F.LJII(context5, strPinManagementPage, mapLJIIIIZZ);
                            C507650JvX c507650JvX3 = c507650JvX;
                            if (c507650JvX3 != null && (subscriptionPrivilegeDetailFragment2 = c507650JvX3.LLILZIL) != null && (function0 = subscriptionPrivilegeDetailFragment2.LLILZ) != null) {
                                function0.invoke();
                            }
                        }
                    });
                }
            } else {
                C197039127h c197039127h4 = this.LLIZ;
                if (c197039127h4 != null) {
                    C786410Ut5.LJLLLLLL(8, c197039127h4);
                }
            }
            LiveIconView liveIconView = this.LLILZ;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JhZ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = c507650JvX.LLILZIL;
                        if (subscriptionPrivilegeDetailFragment2 != null) {
                            String strLJIJI = C497740JfY.LJIJI(2131844494);
                            if (subscriptionPrivilegeDetailFragment2.isAdded()) {
                                C474840Iji.LIZ(subscriptionPrivilegeDetailFragment2.getParentFragmentManager(), strLJIJI);
                            }
                        }
                        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = c507650JvX.LLILZIL;
                        if (subscriptionPrivilegeDetailFragment3 != null) {
                            subscriptionPrivilegeDetailFragment3.hS(C507380Jv6.LIZ(5).LIZ, C2097608Jq.LJ());
                        }
                    }
                });
            }
        }
    }

    public C507140Jui(View view, Function0<Unit> function0) {
        super(view);
        this.LLILLJJLI = function0;
        this.LLILLL = (LinearLayout) view.findViewById(R.id.q8y);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.cto);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.uj7);
        this.LLILZLL = (C16F5) view.findViewById(R.id.ujc);
        this.LLIZ = (C197039127h) view.findViewById(R.id.qg2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0Juk] */
    public final C499060Jhg S5(C499090Jhj c499090Jhj, C507650JvX c507650JvX) {
        FrameLayout extraBottomContainer;
        final ArrayList arrayList;
        final Long lValueOf;
        List<SOVBriefInfo> list;
        int i;
        int i2;
        FrameLayout extraBottomContainer2;
        SpaceActivityIndicator spaceActivityIndicator;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = this.itemView.getContext();
        final String secUid = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (context == null) {
            return null;
        }
        int i3 = 6;
        int i4 = 0;
        C499060Jhg c499060Jhg = new C499060Jhg(context, objArr2 == true ? 1 : 0, i3, i4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) C497740JfY.LIZIZ(8.0f);
        layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(8.0f);
        layoutParams.setMarginStart((int) C497740JfY.LIZIZ(16.0f));
        boolean z = c499090Jhj instanceof C499110Jhl;
        if (z && ((C499110Jhl) c499090Jhj).LJI == 1) {
            layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(0.0f));
            ViewGroup.LayoutParams layoutParams2 = c499060Jhg.getIconArrow().getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(16.0f));
            }
            C786410Ut5.w6(c499060Jhg.getIconArrow(), layoutParams2);
        } else {
            layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(16.0f));
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c499060Jhg);
        c499060Jhg.setLayoutParams(layoutParams);
        C1324720kZq icon = c499060Jhg.getIcon();
        ViewGroup.LayoutParams layoutParams3 = icon.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = (int) C497740JfY.LIZIZ(44.0f);
            layoutParams3.height = (int) C497740JfY.LIZIZ(44.0f);
            C786410Ut5.W5(icon, layoutParams3);
            c499060Jhg.setUIData(c499090Jhj);
            if (z) {
                C499110Jhl c499110Jhl = (C499110Jhl) c499090Jhj;
                if (c499110Jhl.LJI == 2 && (extraBottomContainer2 = c499060Jhg.getExtraBottomContainer()) != null) {
                    extraBottomContainer2.setClipToPadding(false);
                    SubSpaceInfo subSpaceInfo = c499110Jhl.LIZIZ.spaceInfo;
                    if (subSpaceInfo != null && (spaceActivityIndicator = subSpaceInfo.spaceActivityIndicator) != null && (!spaceActivityIndicator.spaceActivityInfoList.isEmpty())) {
                        C507840Jvq c507840Jvq = new C507840Jvq(c499060Jhg.getContext(), objArr == true ? 1 : 0, i3, i4);
                        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                        c507840Jvq.e0(new AbstractC507850Jvr() { // from class: X.0Jvt
                            {
                                EnumC428930Grr enumC428930Grr = EnumC428930Grr.SMALL;
                            }
                        }, true);
                        c507840Jvq.h0(spaceActivityIndicator, new C507250Jut());
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c507840Jvq);
                        c507840Jvq.setLayoutParams(layoutParams4);
                        extraBottomContainer2.setClipToPadding(false);
                        extraBottomContainer2.addView(c507840Jvq);
                    }
                }
                if (c499110Jhl.LJI == 1 && (extraBottomContainer = c499060Jhg.getExtraBottomContainer()) != null) {
                    final C0DLV c0dlv = new C0DLV(c499060Jhg.getContext());
                    ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0dlv);
                    c0dlv.setLayoutParams(layoutParams5);
                    SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = c499110Jhl.LIZIZ.subOnlyVideosBriefInfo;
                    if (subOnlyVideosBriefInfo != null && (list = subOnlyVideosBriefInfo.sovBriefInfo) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (SOVBriefInfo sOVBriefInfo : list) {
                            LiveSubOnlySpacePreviewSetting liveSubOnlySpacePreviewSetting = LiveSubOnlySpacePreviewSetting.INSTANCE;
                            if (!liveSubOnlySpacePreviewSetting.displaySubOnlyPreviewTab() && liveSubOnlySpacePreviewSetting.displaySubOnlyPreviewPage()) {
                                i = 90;
                            } else {
                                i = 109;
                            }
                            if (!liveSubOnlySpacePreviewSetting.displaySubOnlyPreviewTab() && liveSubOnlySpacePreviewSetting.displaySubOnlyPreviewPage()) {
                                i2 = 124;
                            } else {
                                i2 = 150;
                            }
                            arrayList.add(new C507220Juq(sOVBriefInfo, i, i2));
                        }
                    } else {
                        arrayList = null;
                    }
                    User user = c499110Jhl.LIZIZ.anchorDetail;
                    if (user != null) {
                        lValueOf = Long.valueOf(user.getId());
                    } else {
                        lValueOf = null;
                    }
                    User user2 = c499110Jhl.LIZIZ.anchorDetail;
                    if (user2 != null) {
                        secUid = user2.getSecUid();
                    }
                    if (arrayList != null) {
                        c0dlv.LL.setAdapter(new C507170Jul(new InterfaceC507230Jur() { // from class: X.0Juk
                            @Override // X.InterfaceC507230Jur
                            public final void LIZ(int i5) {
                                String str;
                                SOVBriefInfo sOVBriefInfo2 = ((C507220Juq) ListProtector.get(arrayList, i5)).LIZ;
                                if (sOVBriefInfo2 != null && (str = sOVBriefInfo2.awemeId) != null) {
                                    C0DLV c0dlv2 = c0dlv;
                                    Long l = lValueOf;
                                    String str2 = secUid;
                                    Context context2 = c0dlv2.getContext();
                                    if (l != null) {
                                        long jLongValue = l.longValue();
                                        if (str2 != null) {
                                            ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).nB2(context2, str, jLongValue, str2);
                                        }
                                    }
                                }
                            }
                        }, arrayList));
                    }
                    extraBottomContainer.addView(c0dlv);
                }
            }
            C2211631BhB.LJ(c499060Jhg, new C507340Jv2(c507650JvX, c499090Jhj, this));
            return c499060Jhg;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
