package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoSlideGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.16Hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749116Hh implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrolled$0(C20749116Hh c20749116Hh, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C20749116Hh c20749116Hh, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(C20749116Hh c20749116Hh, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
        }
    }

    public static final void onPageScrollStateChanged$0(C20749116Hh c20749116Hh, int i) {
        int currentItem = 0;
        if (i != 0) {
            if (i == 1) {
                C15CZ c15cz = (C15CZ) c20749116Hh.l0;
                ViewPager vpContainerFromXml = c15cz.getVpContainerFromXml();
                if (vpContainerFromXml != null) {
                    currentItem = vpContainerFromXml.getCurrentItem();
                }
                c15cz.LLJJJ = currentItem;
                ((C15CZ) c20749116Hh.l0).LLJJJIL = true;
                return;
            }
            return;
        }
        C15CZ c15cz2 = (C15CZ) c20749116Hh.l0;
        if (!c15cz2.LLJJJIL) {
            return;
        }
        c15cz2.LLJJJIL = false;
        ViewPager vpContainerFromXml2 = c15cz2.getVpContainerFromXml();
        if (vpContainerFromXml2 != null) {
            currentItem = vpContainerFromXml2.getCurrentItem();
        }
        int i2 = ((C15CZ) c20749116Hh.l0).LLJJJ;
        if (currentItem > i2) {
            AnchorFinishEncourageData anchorFinishEncourageData = (AnchorFinishEncourageData) c20749116Hh.l1;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_slide");
            c474500IjALIZ.LJJIIJZLJL(C15CY.LJII(anchorFinishEncourageData));
            c474500IjALIZ.LJJII("proceed", "action_type");
            c474500IjALIZ.LIZ();
            return;
        }
        if (currentItem >= i2) {
            return;
        }
        AnchorFinishEncourageData anchorFinishEncourageData2 = (AnchorFinishEncourageData) c20749116Hh.l1;
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_positive_feedback_slide");
        c474500IjALIZ2.LJJIIJZLJL(C15CY.LJII(anchorFinishEncourageData2));
        c474500IjALIZ2.LJJII("go_back", "action_type");
        c474500IjALIZ2.LIZ();
    }

    public static final void onPageScrollStateChanged$1(C20749116Hh c20749116Hh, int i) {
        int currentItem = 0;
        if (i != 0) {
            if (i == 1) {
                C20480615Ca c20480615Ca = (C20480615Ca) c20749116Hh.l0;
                ViewPager vpContainerFromXml = c20480615Ca.getVpContainerFromXml();
                if (vpContainerFromXml != null) {
                    currentItem = vpContainerFromXml.getCurrentItem();
                }
                c20480615Ca.LLJJIJI = currentItem;
                C20480615Ca c20480615Ca2 = (C20480615Ca) c20749116Hh.l0;
                c20480615Ca2.LLJJIJIIJIL = true;
                C19386810t0 c19386810t0 = c20480615Ca2.LLJL;
                c19386810t0.LIZ = true;
                c19386810t0.LIZ();
                C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[pager] state=$state, draggingOrSettling=true");
                return;
            }
            return;
        }
        C20480615Ca c20480615Ca3 = (C20480615Ca) c20749116Hh.l0;
        if (!c20480615Ca3.LLJJIJIIJIL) {
            return;
        }
        c20480615Ca3.LLJJIJIIJIL = false;
        ViewPager vpContainerFromXml2 = c20480615Ca3.getVpContainerFromXml();
        if (vpContainerFromXml2 != null) {
            currentItem = vpContainerFromXml2.getCurrentItem();
        }
        int i2 = ((C20480615Ca) c20749116Hh.l0).LLJJIJI;
        if (currentItem > i2) {
            List list = (List) c20749116Hh.l1;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_slide");
            c474500IjALIZ.LJJIIJZLJL(C15CY.LJIIIIZZ(list));
            c474500IjALIZ.LJJII("proceed", "action_type");
            c474500IjALIZ.LIZ();
        } else if (currentItem < i2) {
            List list2 = (List) c20749116Hh.l1;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_positive_feedback_slide");
            c474500IjALIZ2.LJJIIJZLJL(C15CY.LJIIIIZZ(list2));
            c474500IjALIZ2.LJJII("go_back", "action_type");
            c474500IjALIZ2.LIZ();
        }
        C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[pager] state=IDLE, isUserDragging=false");
    }

    public static final void onPageScrollStateChanged$2(C20749116Hh c20749116Hh, int i) {
        TuxIconView tuxIconView;
        if (i != 0) {
            if (i == 2) {
                ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).ep();
                ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).kp();
                ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).LLJL = false;
                return;
            }
            return;
        }
        ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).ep();
        ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).kp();
        ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).LLJL = false;
        View view = ((C15LH) c20749116Hh.l1).LLIZLLLIL;
        if (view == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.video_slide_ad_hint_icon)) == null) {
            return;
        }
        tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
    }

    public static final void onPageSelected$1(C20749116Hh c20749116Hh, int i) {
        boolean z;
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2;
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV22;
        C20480615Ca c20480615Ca = (C20480615Ca) c20749116Hh.l0;
        int i2 = c20480615Ca.LLJJL;
        int size = c20480615Ca.LLJILJIL.size() - 1;
        if (i2 == size && i < size) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[pager] onPageSelected prev=");
        sbLIZ.append(i2);
        sbLIZ.append(" curr=");
        sbLIZ.append(i);
        sbLIZ.append(" leavingLastPage=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ));
        ((C20480615Ca) c20749116Hh.l0).h0(i2);
        ((C20480615Ca) c20749116Hh.l0).setProgressInstantTo100ForPage(i2);
        C20480615Ca c20480615Ca2 = (C20480615Ca) c20749116Hh.l0;
        if (c20480615Ca2.LLJJIJIIJIL) {
            c20480615Ca2.LLJJJJJIL = true;
            c20480615Ca2.LLJL.LIZ();
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, ((C20480615Ca) c20749116Hh.l0).LLJILJIL);
            if ((objLJJJLZIJ instanceof EndIncentiveSettlementFragmentV2) && (endIncentiveSettlementFragmentV22 = (EndIncentiveSettlementFragmentV2) objLJJJLZIJ) != null) {
                endIncentiveSettlementFragmentV22.OR();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[pager] onPageSelected page=");
            sbLIZ2.append(i);
            sbLIZ2.append(" userDrag=true -> action=forceComplete");
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[pager] onPageSelected page=");
            sbLIZ3.append(i);
            sbLIZ3.append(" userDrag=false -> action=startAnimator");
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (z) {
            C20480615Ca c20480615Ca3 = (C20480615Ca) c20749116Hh.l0;
            if (!c20480615Ca3.LLJJJJLIIL) {
                Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(size, c20480615Ca3.LLJILJIL);
                if ((objLJJJLZIJ2 instanceof EndIncentiveSettlementFragmentV2) && (endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) objLJJJLZIJ2) != null) {
                    endIncentiveSettlementFragmentV2.OR();
                }
                ((C20480615Ca) c20749116Hh.l0).e0();
            }
        }
        ((C20480615Ca) c20749116Hh.l0).e0();
        ((C20480615Ca) c20749116Hh.l0).LLJJL = i;
    }

    public static final void onPageSelected$2(C20749116Hh c20749116Hh, int i) {
        TuxIconView tuxIconView;
        if (i == 1) {
            CommercePhotoSlideGuideAssem commercePhotoSlideGuideAssem = (CommercePhotoSlideGuideAssem) c20749116Hh.l0;
            commercePhotoSlideGuideAssem.LLJL = true;
            commercePhotoSlideGuideAssem.ep();
            ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).kp();
            ((CommercePhotoSlideGuideAssem) c20749116Hh.l0).LLJL = false;
            View view = ((C15LH) c20749116Hh.l1).LLIZLLLIL;
            if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.video_slide_ad_hint_icon)) != null) {
                tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
            }
        }
    }

    public C20749116Hh(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public C20749116Hh(CommercePhotoSlideGuideAssem commercePhotoSlideGuideAssem, C15LH c15lh, VideoItemParams videoItemParams, int i) {
        this.$t = i;
        this.l0 = commercePhotoSlideGuideAssem;
        this.l1 = c15lh;
    }

    public static final void onPageScrolled$2(C20749116Hh c20749116Hh, int i, float f, int i2) {
        TuxIconView tuxIconView;
        CommercePhotoSlideGuideAssem commercePhotoSlideGuideAssem = (CommercePhotoSlideGuideAssem) c20749116Hh.l0;
        C15LH c15lh = (C15LH) c20749116Hh.l1;
        commercePhotoSlideGuideAssem.getClass();
        View view = c15lh.LLIZLLLIL;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.video_slide_ad_hint_icon);
        } else {
            tuxIconView = null;
        }
        if (i == 1) {
            commercePhotoSlideGuideAssem.LLJL = true;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
                return;
            }
            return;
        }
        if (i != 0) {
            return;
        }
        float fLIZJ = C12ES.LIZJ(110.0f, commercePhotoSlideGuideAssem.getContext());
        float f2 = i2;
        if (f2 > fLIZJ) {
            commercePhotoSlideGuideAssem.LLJL = true;
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
            return;
        }
        if (f2 >= fLIZJ || i2 < 0) {
            return;
        }
        commercePhotoSlideGuideAssem.LLJL = false;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
    }
}
