package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504040Jpi extends AbstractC508030Jw9<C507640JvW> {
    public final Function0<Unit> LLILLJJLI;
    public final float LLILLL;
    public final C16F5 LLILZ;
    public final LiveIconView LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final ViewGroup LLJ;
    public final C1324720kZq LLJI;
    public final ViewGroup LLJIJIL;
    public final C1324720kZq LLJILJIL;
    public final C1324720kZq LLJILJILJ;
    public final C1324720kZq LLJILLL;
    public final C16FV LLJJ;
    public final ConstraintLayout LLJJI;
    public final TuxIconView LLJJIII;
    public final TuxTag LLJJIJI;
    public final ConstraintLayout LLJJIJIIJIL;
    public final TuxIconView LLJJIJIL;
    public final TuxTag LLJJJ;
    public final ConstraintLayout LLJJJIL;
    public final TuxIconView LLJJJJ;
    public final TuxTag LLJJJJJIL;

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        final int i;
        boolean z;
        SOVBriefInfo sOVBriefInfo;
        Long lValueOf;
        String secUid;
        SOVBriefInfo sOVBriefInfo2;
        Long lValueOf2;
        String secUid2;
        SOVBriefInfo sOVBriefInfo3;
        Long lValueOf3;
        List<SOVBriefInfo> list;
        List<SOVBriefInfo> list2;
        List<SOVBriefInfo> list3;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        String str;
        C507580JvQ c507580JvQ = (C507580JvQ) interfaceC515600KJy;
        R5(c507580JvQ);
        GetSubPrivilegeDetailResponse.Data data = c507580JvQ.LLILZ;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c507580JvQ.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo != null) {
                i = subOnlyVideosBriefInfo.totalCount;
            } else {
                i = 0;
            }
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                Object[] objArr = new Object[1];
                if (subOnlyVideosBriefInfo == null || (str = subOnlyVideosBriefInfo.totalCountStr) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                objArr[0] = str;
                c16f5.setText(C497740JfY.LJIJJ(2131844379, objArr));
            }
            if (Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLJIJIL, EnumC504050Jpj.SUB_ONLY_VIDEO.getSource())) {
                C16F5 c16f52 = this.LLILZ;
                if (c16f52 != null) {
                    C500260Jjc.LJIILIIL(c16f52);
                }
                C1143680frq.LIZLLL(this.LLJI, "tiktok_live_watch_resource_normal_1", "ttlive_sub_only_video_demo_card_image_holder.png");
                C1324720kZq c1324720kZq = this.LLJI;
                if (c1324720kZq != null) {
                    C500260Jjc.LLFFF(c1324720kZq);
                }
                ViewGroup viewGroup = this.LLJIJIL;
                if (viewGroup != null) {
                    C500260Jjc.LJIILIIL(viewGroup);
                    return;
                }
                return;
            }
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo2 = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo2 != null && subOnlyVideosBriefInfo2.isSovAdjustmentsEnabledForConsumer) {
                z = true;
            } else {
                z = false;
            }
            String secUid3 = null;
            if (z) {
                if (subOnlyVideosBriefInfo2 != null && subOnlyVideosBriefInfo2.creatorStatus == 1) {
                    C16F5 c16f53 = this.LLILZLL;
                    if (c16f53 != null) {
                        c16f53.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, c16f53.getContext()));
                        c16f53.setText(C497740JfY.LJIJI(2131839363));
                        C786410Ut5.LJLLLLLL(0, c16f53);
                        ViewGroup.LayoutParams layoutParams2 = c16f53.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            C786410Ut5.y6(c16f53, marginLayoutParams2);
                        }
                        if (i > 0) {
                            i5 = 12;
                        } else {
                            i5 = 0;
                        }
                        c16f53.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i5)));
                    }
                    C16F5 c16f54 = this.LLIZ;
                    if (c16f54 != null) {
                        c16f54.setText(C497740JfY.LJIJI(2131840777));
                    }
                    C16F5 c16f55 = this.LLIZ;
                    if (c16f55 != null) {
                        if (i > 0) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i4, c16f55);
                    }
                    ViewGroup viewGroup2 = this.LLJIJIL;
                    if (viewGroup2 != null) {
                        layoutParams = viewGroup2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.topMargin = 0;
                        marginLayoutParams.bottomMargin = 0;
                        C786410Ut5.X5(marginLayoutParams, this.LLJIJIL);
                    }
                    View view = this.LLIZLLLIL;
                    if (view != null) {
                        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo3 = data.subOnlyVideosBriefInfo;
                        if (subOnlyVideosBriefInfo3 != null && subOnlyVideosBriefInfo3.totalCount >= 4) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i3, view);
                    }
                } else {
                    ViewGroup viewGroup3 = this.LLJ;
                    if (viewGroup3 == null) {
                        return;
                    }
                    C500260Jjc.LJIILIIL(viewGroup3);
                    return;
                }
            } else if (i < 3) {
                ViewGroup viewGroup4 = this.LLJ;
                if (viewGroup4 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(viewGroup4);
                return;
            }
            ViewGroup viewGroup5 = this.LLJIJIL;
            if (viewGroup5 != null) {
                if (i > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, viewGroup5);
            }
            C1324720kZq c1324720kZq2 = this.LLJI;
            if (c1324720kZq2 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq2);
            }
            if (i <= 3) {
                C500260Jjc.LJIILIIL(this.LLJJ);
            } else {
                C500260Jjc.LLFFF(this.LLJJ);
                C1143680frq.LJI(this.LLJJ, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", "ttlive_sub_only_video_cover_4_bg.png"), null, true);
                C1324720kZq c1324720kZq3 = this.LLJILLL;
                if (c1324720kZq3 != null) {
                    C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(9.0f), c1324720kZq3);
                }
            }
            C1324720kZq c1324720kZq4 = this.LLJILJIL;
            if (c1324720kZq4 != null) {
                c1324720kZq4.setAspectRatio(this.LLILLL);
            }
            C1324720kZq c1324720kZq5 = this.LLJILJILJ;
            if (c1324720kZq5 != null) {
                c1324720kZq5.setAspectRatio(this.LLILLL);
            }
            C1324720kZq c1324720kZq6 = this.LLJILLL;
            if (c1324720kZq6 != null) {
                c1324720kZq6.setAspectRatio(this.LLILLL);
            }
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo4 = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo4 != null && (list3 = subOnlyVideosBriefInfo4.sovBriefInfo) != null) {
                sOVBriefInfo = (SOVBriefInfo) C13LP.LJJJLZIJ(0, list3);
            } else {
                sOVBriefInfo = null;
            }
            User user = data.anchorDetail;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            User user2 = data.anchorDetail;
            if (user2 != null) {
                secUid = user2.getSecUid();
            } else {
                secUid = null;
            }
            S5(sOVBriefInfo, lValueOf, secUid, this.LLJILJIL, this.LLJJI, this.LLJJIII, this.LLJJIJI);
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo5 = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo5 != null && (list2 = subOnlyVideosBriefInfo5.sovBriefInfo) != null) {
                sOVBriefInfo2 = (SOVBriefInfo) C13LP.LJJJLZIJ(1, list2);
            } else {
                sOVBriefInfo2 = null;
            }
            User user3 = data.anchorDetail;
            if (user3 != null) {
                lValueOf2 = Long.valueOf(user3.getId());
            } else {
                lValueOf2 = null;
            }
            User user4 = data.anchorDetail;
            if (user4 != null) {
                secUid2 = user4.getSecUid();
            } else {
                secUid2 = null;
            }
            S5(sOVBriefInfo2, lValueOf2, secUid2, this.LLJILJILJ, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ);
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo6 = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo6 != null && (list = subOnlyVideosBriefInfo6.sovBriefInfo) != null) {
                sOVBriefInfo3 = (SOVBriefInfo) C13LP.LJJJLZIJ(2, list);
            } else {
                sOVBriefInfo3 = null;
            }
            User user5 = data.anchorDetail;
            if (user5 != null) {
                lValueOf3 = Long.valueOf(user5.getId());
            } else {
                lValueOf3 = null;
            }
            User user6 = data.anchorDetail;
            if (user6 != null) {
                secUid3 = user6.getSecUid();
            }
            S5(sOVBriefInfo3, lValueOf3, secUid3, this.LLJILLL, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL);
            if (PrivilegePageVideoListSetting.INSTANCE.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21()) {
                LiveIconView liveIconView = this.LLILZIL;
                if (liveIconView != null) {
                    C786410Ut5.LJLLLLLL(0, liveIconView);
                }
                final User user7 = c507580JvQ.LLILZ.anchorDetail;
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JTh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FragmentManager supportFragmentManager;
                        C0JS1 c0js1 = new C0JS1(EnumC492180JRw.SUB_ONLY_VIDEO_PAGE, EnumC492200JRy.OPEN, "subscription_privilege_page", user7, Boolean.TRUE, Integer.valueOf(i), new SubOnlyVideoOpenParams("privilege_page_sov_section", EnumC492500JTc.PRIVILEGE_PAGE, i), 32);
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
                        if (c19egLIZIZ != null) {
                            supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                        } else {
                            supportFragmentManager = null;
                        }
                        C0JS0.LIZ(supportFragmentManager, c0js1, UserService.getInstance().user().LJIJJLI(), C497820Jfg.LIZ(this.itemView.getContext()), this.LLILLJJLI);
                    }
                }, this.itemView);
                return;
            }
            LiveIconView liveIconView2 = this.LLILZIL;
            if (liveIconView2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, liveIconView2);
        }
    }

    public C504040Jpi(View view, Function0<Unit> function0) {
        super(view);
        this.LLILLJJLI = function0;
        this.LLILLL = 0.7266667f;
        this.LLILZ = (C16F5) view.findViewById(R.id.tv_title);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.yu0);
        this.LLILZLL = (C16F5) view.findViewById(R.id.zf0);
        this.LLIZ = (C16F5) view.findViewById(R.id.zzk);
        this.LLIZLLLIL = view.findViewById(R.id.wg7);
        this.LLJ = (ViewGroup) view.findViewById(R.id.tsc);
        this.LLJI = (C1324720kZq) view.findViewById(R.id.flq);
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.video_cover_container);
        this.LLJILJIL = (C1324720kZq) view.findViewById(R.id.video_cover_1);
        this.LLJILJILJ = (C1324720kZq) view.findViewById(R.id.video_cover_2);
        this.LLJILLL = (C1324720kZq) view.findViewById(R.id.video_cover_3);
        this.LLJJ = (C16FV) view.findViewById(R.id.video_cover_4);
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_1);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_1);
        this.LLJJIJI = (TuxTag) view.findViewById(R.id.ytx);
        this.LLJJIJIIJIL = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_2);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_2);
        this.LLJJJ = (TuxTag) view.findViewById(R.id.yty);
        this.LLJJJIL = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_3);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_3);
        this.LLJJJJJIL = (TuxTag) view.findViewById(R.id.ytz);
    }

    public final void S5(final SOVBriefInfo sOVBriefInfo, final Long l, final String str, final C1324720kZq c1324720kZq, ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxTag tuxTag) {
        SOVMaskInfo sOVMaskInfo;
        ImageModel imageModel = null;
        if (PrivilegePageVideoListSetting.INSTANCE.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21()) {
            if (c1324720kZq != null) {
                c1324720kZq.setClickable(true);
                C786410Ut5.e8(c1324720kZq, new View.OnClickListener() { // from class: X.0Jph
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str2;
                        Context contextLIZ;
                        C1324720kZq c1324720kZq2 = c1324720kZq;
                        if (c1324720kZq2 != null && ViewTreeLifecycleOwner.get(c1324720kZq2) != null) {
                            SOVBriefInfo sOVBriefInfo2 = sOVBriefInfo;
                            Long l2 = l;
                            String str3 = str;
                            if (sOVBriefInfo2 != null && (str2 = sOVBriefInfo2.awemeId) != null && (contextLIZ = C176600m4.LIZ()) != null && l2 != null) {
                                long jLongValue = l2.longValue();
                                if (str3 != null) {
                                    ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).nB2(contextLIZ, str2, jLongValue, str3);
                                }
                            }
                        }
                    }
                });
            }
            if (sOVBriefInfo != null) {
                SOVMaskInfo sOVMaskInfo2 = sOVBriefInfo.maskInfo;
                if (sOVMaskInfo2 != null && sOVMaskInfo2.type == 1) {
                    if (constraintLayout != null) {
                        C786410Ut5.LJLLLLLL(0, constraintLayout);
                    }
                    C1143680frq.LIZLLL(tuxIconView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
                    return;
                }
                if (sOVBriefInfo.lockInfo == 1) {
                    C1819620xS4.LIZ().LJIIIZ(sOVBriefInfo.cover).LJJI(c1324720kZq);
                    if (constraintLayout != null) {
                        C786410Ut5.LJLLLLLL(0, constraintLayout);
                    }
                    if (tuxIconView == null) {
                        return;
                    }
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_lock;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.c9i);
                    c419910GdJ.LJFF = true;
                    tuxIconView.setTuxIcon(c419910GdJ);
                    return;
                }
                if (sOVBriefInfo.lockInfo == 2) {
                    C1819620xS4.LIZ().LJIIIZ(sOVBriefInfo.cover).LJJI(c1324720kZq);
                    if (tuxTag == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, tuxTag);
                    return;
                }
            }
            if (constraintLayout != null) {
                C786410Ut5.LJLLLLLL(8, constraintLayout);
            }
            if (sOVBriefInfo != null) {
                imageModel = sOVBriefInfo.cover;
            }
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(c1324720kZq);
            return;
        }
        if (sOVBriefInfo != null && (sOVMaskInfo = sOVBriefInfo.maskInfo) != null && sOVMaskInfo.type == 1) {
            if (constraintLayout != null) {
                C786410Ut5.LJLLLLLL(0, constraintLayout);
            }
            C1143680frq.LIZLLL(tuxIconView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLJJI;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(8, constraintLayout2);
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        if (sOVBriefInfo != null) {
            imageModel = sOVBriefInfo.cover;
        }
        c0jbnLIZ.LJIIIZ(imageModel).LJJI(c1324720kZq);
    }
}
