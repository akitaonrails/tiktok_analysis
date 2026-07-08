package X;

import Y.ACListenerS13S1400000_7;
import Y.ACListenerS42S0201000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510590K0r extends C0K1I<C510460K0e> {
    public final Function0<Unit> LLILLJJLI;
    public final float LLILLL;
    public final TextView LLILZ;
    public final ImageView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final View LLIZLLLIL;
    public final ViewGroup LLJ;
    public final C417410GYh LLJI;
    public final ViewGroup LLJIJIL;
    public final C417410GYh LLJILJIL;
    public final C417410GYh LLJILJILJ;
    public final C417410GYh LLJILLL;
    public final ImageView LLJJ;
    public final ConstraintLayout LLJJI;
    public final TuxIconView LLJJIII;
    public final TuxTag LLJJIJI;
    public final ConstraintLayout LLJJIJIIJIL;
    public final TuxIconView LLJJIJIL;
    public final TuxTag LLJJJ;
    public final ConstraintLayout LLJJJIL;
    public final TuxIconView LLJJJJ;
    public final TuxTag LLJJJJJIL;

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        int i;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
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
        C417400GYg c417400GYg;
        C417400GYg c417400GYg2;
        C417400GYg c417400GYg3;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        String str;
        C510480K0g c510480K0g = (C510480K0g) interfaceC339570DSx;
        P5(c510480K0g);
        PGCGetSubPrivilegeDetailResponse.Data data = c510480K0g.LIZLLL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510480K0g.LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = data.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo != null) {
                i = subOnlyVideosBriefInfo.totalCount;
            } else {
                i = 0;
            }
            TextView textView = this.LLILZ;
            if (textView != null) {
                Object[] objArr = new Object[1];
                if (subOnlyVideosBriefInfo == null || (str = subOnlyVideosBriefInfo.totalCountStr) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                objArr[0] = str;
                textView.setText(C511520K4g.LJIIIIZZ(2131839639, objArr));
            }
            if (Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLJIJIL, EnumC510620K0u.SUB_ONLY_VIDEO.getSource())) {
                TextView textView2 = this.LLILZ;
                if (textView2 != null) {
                    C0K0R.LIZ(textView2);
                }
                C511430K3x c511430K3x = C511430K3x.LIZ;
                C417410GYh c417410GYh = this.LLJI;
                c511430K3x.getClass();
                C511430K3x.LIZLLL(c417410GYh, "tiktok_live_watch_resource_normal_1", "ttlive_sub_only_video_demo_card_image_holder.png");
                C417410GYh c417410GYh2 = this.LLJI;
                if (c417410GYh2 != null) {
                    C0K0R.LIZJ(c417410GYh2);
                }
                ViewGroup viewGroup = this.LLJIJIL;
                if (viewGroup != null) {
                    C0K0R.LIZ(viewGroup);
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
                    TextView textView3 = this.LLILZLL;
                    if (textView3 != null) {
                        textView3.setTextColor(C426930God.LIZ(R.attr.fa9, textView3.getContext()));
                        textView3.setText(C511520K4g.LJII(2131839363));
                        C786410Ut5.LJLLLLLL(0, textView3);
                        ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            C786410Ut5.g6(textView3, marginLayoutParams3);
                        }
                        if (i > 0) {
                            i5 = 12;
                        } else {
                            i5 = 0;
                        }
                        textView3.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i5)));
                    }
                    TextView textView4 = this.LLIZ;
                    if (textView4 != null) {
                        textView4.setText(C511520K4g.LJII(2131839302));
                    }
                    TextView textView5 = this.LLIZ;
                    if (textView5 != null) {
                        if (i > 0) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i4, textView5);
                    }
                    ViewGroup viewGroup2 = this.LLJIJIL;
                    if (viewGroup2 != null) {
                        layoutParams = viewGroup2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.topMargin = 0;
                        marginLayoutParams2.bottomMargin = 0;
                        C786410Ut5.X5(marginLayoutParams2, this.LLJIJIL);
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
                    C0K0R.LIZ(viewGroup3);
                    return;
                }
            } else if (i < 3) {
                ViewGroup viewGroup4 = this.LLJ;
                if (viewGroup4 == null) {
                    return;
                }
                C0K0R.LIZ(viewGroup4);
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
            C417410GYh c417410GYh3 = this.LLJI;
            if (c417410GYh3 != null) {
                C0K0R.LIZ(c417410GYh3);
            }
            if (i <= 3) {
                C0K0R.LIZ(this.LLJJ);
            } else {
                C0K0R.LIZJ(this.LLJJ);
                C511430K3x.LIZ.getClass();
                C511430K3x.LIZJ(this.LLJJ, C511430K3x.LIZ("ttlive_sub_only_video_cover_4_bg.png"));
                C417410GYh c417410GYh4 = this.LLJILLL;
                if (c417410GYh4 != null) {
                    int iLIZ = (int) C511520K4g.LIZ(9.0f);
                    C01GW c01gw = C0K51.LIZ;
                    ViewGroup.LayoutParams layoutParams3 = c417410GYh4.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        marginLayoutParams.setMarginEnd(iLIZ);
                        C786410Ut5.W5(c417410GYh4, marginLayoutParams);
                    }
                }
            }
            int iLIZ2 = (int) C511520K4g.LIZ(8.0f);
            C417410GYh c417410GYh5 = this.LLJILJIL;
            if (c417410GYh5 != null) {
                c417410GYh5.setAspectRatio(this.LLILLL);
            }
            C417410GYh c417410GYh6 = this.LLJILJILJ;
            if (c417410GYh6 != null) {
                c417410GYh6.setAspectRatio(this.LLILLL);
            }
            C417410GYh c417410GYh7 = this.LLJILLL;
            if (c417410GYh7 != null) {
                c417410GYh7.setAspectRatio(this.LLILLL);
            }
            C417410GYh c417410GYh8 = this.LLJILJIL;
            if ((c417410GYh8 instanceof C417400GYg) && (c417400GYg3 = (C417400GYg) c417410GYh8) != null) {
                c417400GYg3.LIZJ(iLIZ2, iLIZ2, iLIZ2, iLIZ2);
            }
            C417410GYh c417410GYh9 = this.LLJILJILJ;
            if ((c417410GYh9 instanceof C417400GYg) && (c417400GYg2 = (C417400GYg) c417410GYh9) != null) {
                c417400GYg2.LIZJ(iLIZ2, iLIZ2, iLIZ2, iLIZ2);
            }
            C417410GYh c417410GYh10 = this.LLJILLL;
            if ((c417410GYh10 instanceof C417400GYg) && (c417400GYg = (C417400GYg) c417410GYh10) != null) {
                c417400GYg.LIZJ(iLIZ2, iLIZ2, iLIZ2, iLIZ2);
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
            R5(sOVBriefInfo, lValueOf, secUid, this.LLJILJIL, this.LLJJI, this.LLJJIII, this.LLJJIJI);
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
            R5(sOVBriefInfo2, lValueOf2, secUid2, this.LLJILJILJ, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ);
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
            R5(sOVBriefInfo3, lValueOf3, secUid3, this.LLJILLL, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL);
            if (C0K7G.LJFF("sov_consumption_cover_list_picker_feature_toggle_enabled", true)) {
                C0K76.LIZ.getClass();
                if (C0K76.LIZIZ()) {
                    ImageView imageView = this.LLILZIL;
                    if (imageView != null) {
                        C786410Ut5.LJLLLLLL(0, imageView);
                    }
                    C786410Ut5.I7(new ACListenerS42S0201000_7(i, this, c510480K0g.LIZLLL.anchorDetail, 0), this.itemView);
                    return;
                }
            }
            ImageView imageView2 = this.LLILZIL;
            if (imageView2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, imageView2);
        }
    }

    public C510590K0r(View view, Function0<Unit> function0) {
        super(view);
        this.LLILLJJLI = function0;
        this.LLILLL = 0.7266667f;
        this.LLILZ = (TextView) view.findViewById(R.id.tv_title);
        this.LLILZIL = (ImageView) view.findViewById(R.id.wl8);
        this.LLILZLL = (TextView) view.findViewById(R.id.zf0);
        this.LLIZ = (TextView) view.findViewById(R.id.zzk);
        this.LLIZLLLIL = view.findViewById(R.id.wg7);
        this.LLJ = (ViewGroup) view.findViewById(R.id.tsc);
        this.LLJI = (C417410GYh) view.findViewById(R.id.flq);
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.video_cover_container);
        this.LLJILJIL = (C417410GYh) view.findViewById(R.id.video_cover_1);
        this.LLJILJILJ = (C417410GYh) view.findViewById(R.id.video_cover_2);
        this.LLJILLL = (C417410GYh) view.findViewById(R.id.video_cover_3);
        this.LLJJ = (ImageView) view.findViewById(R.id.video_cover_4);
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_1);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_1);
        this.LLJJIJI = (TuxTag) view.findViewById(R.id.wl5);
        this.LLJJIJIIJIL = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_2);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_2);
        this.LLJJJ = (TuxTag) view.findViewById(R.id.wl6);
        this.LLJJJIL = (ConstraintLayout) view.findViewById(R.id.video_cover_mask_3);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.video_cover_mask_icon_3);
        this.LLJJJJJIL = (TuxTag) view.findViewById(R.id.wl7);
    }

    public final void R5(SOVBriefInfo sOVBriefInfo, Long l, String str, C417410GYh c417410GYh, ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxTag tuxTag) {
        ImageModel imageModel;
        SOVMaskInfo sOVMaskInfo;
        ImageModel imageModel2;
        if (C0K7G.LJFF("sov_consumption_cover_list_picker_feature_toggle_enabled", true)) {
            C0K76.LIZ.getClass();
            if (C0K76.LIZIZ()) {
                if (c417410GYh != null) {
                    c417410GYh.setClickable(true);
                    C786410Ut5.Ca(c417410GYh, new ACListenerS13S1400000_7(c417410GYh, sOVBriefInfo, this, l, str, 0));
                }
                if (sOVBriefInfo != null) {
                    SOVMaskInfo sOVMaskInfo2 = sOVBriefInfo.maskInfo;
                    if (sOVMaskInfo2 != null && sOVMaskInfo2.type == 1) {
                        if (constraintLayout != null) {
                            C786410Ut5.LJLLLLLL(0, constraintLayout);
                        }
                        C511430K3x.LIZ.getClass();
                        C511430K3x.LIZLLL(tuxIconView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
                        return;
                    }
                    if (sOVBriefInfo.lockInfo == 1) {
                        ImageModel imageModel3 = sOVBriefInfo.cover;
                        C511420K3w.LJIIJ.getClass();
                        C511420K3w c511420K3w = new C511420K3w();
                        c511420K3w.LIZ = imageModel3;
                        c511420K3w.LIZ(c417410GYh);
                        if (constraintLayout != null) {
                            C786410Ut5.LJLLLLLL(0, constraintLayout);
                        }
                        if (tuxIconView == null) {
                            return;
                        }
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_lock;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.f8k);
                        c419910GdJ.LJFF = true;
                        tuxIconView.setTuxIcon(c419910GdJ);
                        return;
                    }
                    if (sOVBriefInfo.lockInfo == 2) {
                        ImageModel imageModel4 = sOVBriefInfo.cover;
                        C511420K3w.LJIIJ.getClass();
                        C511420K3w c511420K3w2 = new C511420K3w();
                        c511420K3w2.LIZ = imageModel4;
                        c511420K3w2.LIZ(c417410GYh);
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
                    imageModel2 = sOVBriefInfo.cover;
                } else {
                    imageModel2 = null;
                }
                C511420K3w.LJIIJ.getClass();
                C511420K3w c511420K3w3 = new C511420K3w();
                c511420K3w3.LIZ = imageModel2;
                c511420K3w3.LIZ(c417410GYh);
                return;
            }
        }
        if (sOVBriefInfo != null && (sOVMaskInfo = sOVBriefInfo.maskInfo) != null && sOVMaskInfo.type == 1) {
            if (constraintLayout != null) {
                C786410Ut5.LJLLLLLL(0, constraintLayout);
            }
            C511430K3x.LIZ.getClass();
            C511430K3x.LIZLLL(tuxIconView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLJJI;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(8, constraintLayout2);
        }
        C511420K3w.LJIIJ.getClass();
        C511420K3w c511420K3w4 = new C511420K3w();
        if (sOVBriefInfo != null) {
            imageModel = sOVBriefInfo.cover;
        } else {
            imageModel = null;
        }
        c511420K3w4.LIZ = imageModel;
        c511420K3w4.LIZ(c417410GYh);
    }
}
