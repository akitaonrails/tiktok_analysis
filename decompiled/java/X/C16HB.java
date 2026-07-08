package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent$setUpLifecycleObserver$1;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.search.detail.adaption.SearchCellAdaptionComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkComponent;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.16HB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HB implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C16HB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LiveBaseSheetDialog liveBaseSheetDialog = (LiveBaseSheetDialog) c16hb.l0;
        if (liveBaseSheetDialog.LLJILJIL == null) {
            liveBaseSheetDialog.LJLIIL();
        }
        if (liveBaseSheetDialog.LLJILJIL.LJIJJ == 3) {
            ((LiveBaseSheetDialog) c16hb.l0).LLJJJJLIIL.setOffset(1.0f);
        } else {
            ((LiveBaseSheetDialog) c16hb.l0).LLJJJJLIIL.setOffset(0.0f);
        }
        ((LiveBaseSheetDialog) c16hb.l0).LLJJJJLIIL.removeOnLayoutChangeListener(c16hb);
    }

    public static final void onLayoutChange$1(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String aid;
        Integer num;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i7 - i5;
        int i12 = i8 - i6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search [onLayoutChange]");
        sbLIZ.append(", ");
        sbLIZ.append("aweme:");
        Aweme awemeKp = ((SearchCellAdaptionComponent) c16hb.l0).kp();
        if (awemeKp != null) {
            aid = awemeKp.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", ");
        sbLIZ.append("view:");
        ((SearchCellAdaptionComponent) c16hb.l0).getClass();
        sbLIZ.append(CellAdaptionComponentV2.up(view));
        sbLIZ.append(", ");
        sbLIZ.append("w:");
        sbLIZ.append(i9);
        sbLIZ.append(", ");
        sbLIZ.append("h:");
        sbLIZ.append(i10);
        sbLIZ.append(", ");
        sbLIZ.append("oldw:");
        sbLIZ.append(i11);
        sbLIZ.append(", ");
        sbLIZ.append("oldh:");
        sbLIZ.append(i12);
        sbLIZ.append(", ");
        sbLIZ.append("left:");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append("top:");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append("transx:");
        sbLIZ.append(view.getTranslationX());
        sbLIZ.append(", ");
        sbLIZ.append("transy:");
        sbLIZ.append(view.getTranslationY());
        sbLIZ.append(", ");
        sbLIZ.append("visibility:");
        sbLIZ.append(view.getVisibility());
        sbLIZ.append(", ");
        C2188811AlT.LIZIZ(sbLIZ);
        int id = view.getId();
        SearchCellAdaptionComponent searchCellAdaptionComponent = (SearchCellAdaptionComponent) c16hb.l0;
        if (id != searchCellAdaptionComponent.LLLILZ) {
            return;
        }
        if (i9 == i11 && i10 == i12) {
            return;
        }
        Integer num2 = searchCellAdaptionComponent.LLLLLLL;
        if (num2 == null || i9 != num2.intValue() || (num = ((SearchCellAdaptionComponent) c16hb.l0).LLLLLLLLL) == null || i10 != num.intValue()) {
            ((SearchCellAdaptionComponent) c16hb.l0).LLLLLLL = Integer.valueOf(i9);
            ((SearchCellAdaptionComponent) c16hb.l0).LLLLLLLLL = Integer.valueOf(i10);
            ((SearchCellAdaptionComponent) c16hb.l0).yp(EnumC1153720g82.CONTAINER_ADAPTION, Integer.valueOf(i9), Integer.valueOf(i10));
        }
    }

    public static final void onLayoutChange$10(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        EmoteEditDialogFragment emoteEditDialogFragment = (EmoteEditDialogFragment) c16hb.l0;
        if (emoteEditDialogFragment.LLJJJJJIL == null) {
            emoteEditDialogFragment.LLJJJJJIL = emoteEditDialogFragment.VR().getVisibleRect();
            ((EmoteEditDialogFragment) c16hb.l0).SR().setDisplayWindowRect(((EmoteEditDialogFragment) c16hb.l0).LLJJJJJIL);
        }
    }

    public static final void onLayoutChange$11(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = (SpotlightImageListPreviewDialogFragment) c16hb.l0;
        if (spotlightImageListPreviewDialogFragment.LLJJJ == null) {
            spotlightImageListPreviewDialogFragment.LLJJJ = spotlightImageListPreviewDialogFragment.PR().getVisibleRect();
            ((SpotlightImageListPreviewDialogFragment) c16hb.l0).OR().setDisplayWindowRect(((SpotlightImageListPreviewDialogFragment) c16hb.l0).LLJJJ);
        }
    }

    public static final void onLayoutChange$12(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) c16hb.l0;
        if (spotlightImageEditDialogFragment.LLJJJJJIL == null) {
            spotlightImageEditDialogFragment.LLJJJJJIL = spotlightImageEditDialogFragment.VR().getVisibleRect();
            ((SpotlightImageEditDialogFragment) c16hb.l0).SR().setDisplayWindowRect(((SpotlightImageEditDialogFragment) c16hb.l0).LLJJJJJIL);
        }
    }

    public static final void onLayoutChange$13(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C20689815xg c20689815xg = (C20689815xg) c16hb.l0;
        if (c20689815xg.LLILZLL == null) {
            C1336560ksw c1336560ksw = c20689815xg.LLILLL;
            C21513519Hh c21513519Hh = null;
            if (c1336560ksw == null) {
                c1336560ksw = null;
            }
            c20689815xg.LLILZLL = c1336560ksw.getVisibleRect();
            C20689815xg c20689815xg2 = (C20689815xg) c16hb.l0;
            C21513519Hh c21513519Hh2 = c20689815xg2.LLILLJJLI;
            if (c21513519Hh2 != null) {
                c21513519Hh = c21513519Hh2;
            }
            c21513519Hh.setDisplayWindowRect(c20689815xg2.LLILZLL);
        }
    }

    public static final void onLayoutChange$2(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC20570315eP abstractC20570315eP;
        view.removeOnLayoutChangeListener(c16hb);
        AbstractC20570315eP abstractC20570315eP2 = ((VideoShrinkComponent) c16hb.l0).LLJJL;
        if (abstractC20570315eP2 != null) {
            abstractC20570315eP2.LJI();
        }
        VideoShrinkComponent videoShrinkComponent = (VideoShrinkComponent) c16hb.l0;
        if (videoShrinkComponent.LLJLLL != 1) {
            float f = videoShrinkComponent.LLJZ;
            if (f > 0.0f && (abstractC20570315eP = videoShrinkComponent.LLJJL) != null) {
                abstractC20570315eP.LJFF(f, f, true, new C20571215eY(false, 0, 1023));
            }
        }
    }

    public static final void onLayoutChange$3(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c16hb);
        ((C20625115nF) c16hb.l0).LIZ();
        ((C20625115nF) c16hb.l0).LIZLLL();
    }

    public static final void onLayoutChange$4(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c16hb);
        C20625115nF c20625115nF = (C20625115nF) c16hb.l0;
        int height = c20625115nF.LLILZ.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        if (height > 0) {
            ViewGroup.LayoutParams layoutParams = c20625115nF.LLILLL.getLayoutParams();
            if (layoutParams.height != height) {
                layoutParams.height = height;
                C786410Ut5.a6(c20625115nF.LLILLL, layoutParams);
                C20625115nF c20625115nF2 = (C20625115nF) c16hb.l0;
                c20625115nF2.LLILLL.addOnLayoutChangeListener(new C16HB(c20625115nF2, 3));
                return;
            }
        }
        ((C20625115nF) c16hb.l0).LIZ();
        ((C20625115nF) c16hb.l0).LIZLLL();
    }

    public static final void onLayoutChange$5(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c16hb);
        if (!((ExploreRecommendTopicListComponent) c16hb.l0).Go().canScrollVertically(1)) {
            ((ExploreRecommendTopicListComponent) c16hb.l0).LLLIL = 3000L;
        }
        ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = (ExploreRecommendTopicListComponent) c16hb.l0;
        exploreRecommendTopicListComponent.getLifecycle().addObserver(new ExploreRecommendTopicListComponent$setUpLifecycleObserver$1(exploreRecommendTopicListComponent));
    }

    public static final void onLayoutChange$6(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent;
        int i9;
        Long l;
        view.removeOnLayoutChangeListener(c16hb);
        int height = view.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (view.getHeight() > 0 && height != (i9 = (exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) c16hb.l0).LLJJJJLIIL)) {
            exploreTopicGeneralFeedListComponent.LLJJJJLIIL = height;
            C1086520eNe c1086520eNeHp = exploreTopicGeneralFeedListComponent.Go();
            ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) c16hb.l0;
            c1086520eNeHp.setPaddingRelative(c1086520eNeHp.getPaddingStart(), exploreTopicGeneralFeedListComponent2.LLJJLIIIJLLLLLLLZ + exploreTopicGeneralFeedListComponent2.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeHp.getPaddingEnd(), c1086520eNeHp.getPaddingBottom());
            ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent3 = (ExploreTopicGeneralFeedListComponent) c16hb.l0;
            exploreTopicGeneralFeedListComponent3.Bp(exploreTopicGeneralFeedListComponent3.LLJJJJJIL);
            C20522315Sb c20522315Sb = ((ExploreTopicGeneralFeedListComponent) c16hb.l0).LLJIJIL;
            if (c20522315Sb != null) {
                c20522315Sb.setBallOffset(r0.LLJJLIIIJLLLLLLLZ + r0.LLJJJJLIIL);
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Banner] rebindRemeasure tabId=");
            C15V2 c15v2Ja = ((ExploreTopicGeneralFeedListComponent) c16hb.l0).ja();
            if (c15v2Ja != null) {
                l = c15v2Ja.LIZIZ;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            sbLIZ.append(" prev=");
            sbLIZ.append(i9);
            sbLIZ.append(" new=");
            sbLIZ.append(((ExploreTopicGeneralFeedListComponent) c16hb.l0).LLJJJJLIIL);
            sbLIZ.append(" bannerH=");
            sbLIZ.append(view.getHeight());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2153908cD.getClass();
            C2153908cD.LIZJ(3, strLIZIZ, "ExploreTopicGeneralFeedListComponent");
        }
    }

    public static final void onLayoutChange$7(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        int height;
        if ((i4 - i2 == i8 - i6 && i2 == i6) || (view2 = ((ExploreTopicGeneralFeedListComponent) c16hb.l0).LLJJIJI) == null || view2.getVisibility() != 0 || (height = view2.getHeight()) <= 0) {
            return;
        }
        ((ExploreTopicGeneralFeedListComponent) c16hb.l0).So(height, view2);
    }

    public static final void onLayoutChange$8(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((LiveBottomSheetDialog) c16hb.l0).LJLIIIL();
        ((LiveBottomSheetDialog) c16hb.l0).LLJILJILJ.removeOnLayoutChangeListener(c16hb);
    }

    public static final void onLayoutChange$9(C16HB c16hb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C20689515xd c20689515xd = (C20689515xd) c16hb.l0;
        if (c20689515xd.LLILZIL == null) {
            C1336570ksx c1336570ksx = c20689515xd.LLILLL;
            C21513519Hh c21513519Hh = null;
            if (c1336570ksx == null) {
                c1336570ksx = null;
            }
            c20689515xd.LLILZIL = c1336570ksx.getVisibleRect();
            C20689515xd c20689515xd2 = (C20689515xd) c16hb.l0;
            C21513519Hh c21513519Hh2 = c20689515xd2.LLILLJJLI;
            if (c21513519Hh2 != null) {
                c21513519Hh = c21513519Hh2;
            }
            c21513519Hh.setDisplayWindowRect(c20689515xd2.LLILZIL);
        }
    }
}
