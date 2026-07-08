package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.component.FriendsDetailTransitionAssem;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeAbility;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModePanelControlShadowAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedCreativeLivePhotoVideoTagAssem;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import com.ss.android.ugc.feed.platform.tablet.RotateLandscapeVideoShrinkComponent;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0SyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewOnLayoutChangeListenerC738740SyO implements View.OnLayoutChangeListener {
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
            case 14:
                onLayoutChange$14(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC738740SyO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Number numberValueOf;
        View view2;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738740SyO);
        Object parent = ((FeedCreativeLivePhotoVideoTagAssem) viewOnLayoutChangeListenerC738740SyO.l0).LJJIJL().getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            numberValueOf = Integer.valueOf(view2.getWidth());
        } else {
            numberValueOf = Float.valueOf(0.0f);
        }
        FeedCreativeLivePhotoVideoTagAssem feedCreativeLivePhotoVideoTagAssem = (FeedCreativeLivePhotoVideoTagAssem) viewOnLayoutChangeListenerC738740SyO.l0;
        int width = feedCreativeLivePhotoVideoTagAssem.LJJIJL().getWidth();
        boolean z = true;
        if (feedCreativeLivePhotoVideoTagAssem.LJJIJL().getVisibility() != 0) {
            width = 0;
        }
        float fFloatValue = (numberValueOf.floatValue() - width) + ((FeedCreativeLivePhotoVideoTagAssem) viewOnLayoutChangeListenerC738740SyO.l0).Lf() + C418440Gaw.LIZIZ(4);
        FeedCreativeLivePhotoVideoTagAssem feedCreativeLivePhotoVideoTagAssem2 = (FeedCreativeLivePhotoVideoTagAssem) viewOnLayoutChangeListenerC738740SyO.l0;
        if (fFloatValue < ((Number) feedCreativeLivePhotoVideoTagAssem2.LLJZIJLIL.getValue()).intValue()) {
            z = false;
        }
        feedCreativeLivePhotoVideoTagAssem2.ka(z);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        CommercePhotoModeAssem commercePhotoModeAssem = (CommercePhotoModeAssem) viewOnLayoutChangeListenerC738740SyO.l0;
        IPhotoSlidesAbility iPhotoSlidesAbilityBo = commercePhotoModeAssem.Bo();
        if (iPhotoSlidesAbilityBo != null) {
            interfaceC719460SKaLJLIL = iPhotoSlidesAbilityBo.LJLIL();
        } else {
            interfaceC719460SKaLJLIL = null;
        }
        commercePhotoModeAssem.Fo(interfaceC719460SKaLJLIL, 0L);
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float translationY;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738740SyO);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        TuxTextView tuxTextView = ((VideoAuthorInfoRelationAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLJZIJLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.getLocationOnScreen(iArr);
        TuxTextView tuxTextView2 = ((VideoAuthorInfoRelationAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLL;
        if (tuxTextView2 != null) {
            tuxTextView2.getLocationOnScreen(iArr2);
            VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = (VideoAuthorInfoRelationAssem) viewOnLayoutChangeListenerC738740SyO.l0;
            TuxTextView tuxTextView3 = videoAuthorInfoRelationAssem.LLL;
            if (tuxTextView3 != null) {
                int i9 = iArr[1];
                TuxTextView tuxTextView4 = videoAuthorInfoRelationAssem.LLJZIJLIL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                int baseline = i9 + tuxTextView4.getBaseline();
                TuxTextView tuxTextView5 = ((VideoAuthorInfoRelationAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLL;
                if (tuxTextView5 != null) {
                    float baseline2 = (baseline - tuxTextView5.getBaseline()) - iArr2[1];
                    TuxTextView tuxTextView6 = ((VideoAuthorInfoRelationAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLL;
                    if (tuxTextView6 == null) {
                        translationY = 0.0f;
                    } else {
                        translationY = tuxTextView6.getTranslationY();
                    }
                    C786410Ut5.wd(tuxTextView3, baseline2 + translationY);
                }
            }
        }
    }

    public static final void onLayoutChange$11(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View viewLLLLLLLZIL = ((FriendsDetailTransitionAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLLLLLLZIL();
        if (viewLLLLLLLZIL != null) {
            C786410Ut5.gd(((FriendsDetailTransitionAssem) viewOnLayoutChangeListenerC738740SyO.l0).Ip(), viewLLLLLLLZIL.getTranslationY());
        }
        View viewLLLLLLLZIL2 = ((FriendsDetailTransitionAssem) viewOnLayoutChangeListenerC738740SyO.l0).LLLLLLLZIL();
        if (viewLLLLLLLZIL2 != null) {
            Integer numValueOf = Integer.valueOf(viewLLLLLLLZIL2.getHeight());
            if (numValueOf.intValue() > 0) {
                FriendsDetailTransitionAssem friendsDetailTransitionAssem = (FriendsDetailTransitionAssem) viewOnLayoutChangeListenerC738740SyO.l0;
                friendsDetailTransitionAssem.Tp(-1, numValueOf.intValue(), friendsDetailTransitionAssem.Ip());
            }
        }
    }

    public static final void onLayoutChange$12(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LivePhotoStruct livePhotoStruct;
        Video video;
        if ((i3 - i != i7 - i5 || i2 - i4 != i6 - i8) && (livePhotoStruct = ((LivePhotoViewHolder) viewOnLayoutChangeListenerC738740SyO.l0).LLLLLLLLLL) != null && (video = livePhotoStruct.videoModel) != null) {
            LivePhotoViewHolder livePhotoViewHolder = (LivePhotoViewHolder) viewOnLayoutChangeListenerC738740SyO.l0;
            ImageView.ScaleType scaleType = livePhotoViewHolder.LLLLZLLLI;
            if (scaleType == null) {
                scaleType = livePhotoViewHolder.LLJLLIL.getScaleType();
            }
            livePhotoViewHolder.LJLLI(video, scaleType);
        }
    }

    public static final void onLayoutChange$13(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C720390SNp) viewOnLayoutChangeListenerC738740SyO.l0).LJIIIIZZ();
        ((C720390SNp) viewOnLayoutChangeListenerC738740SyO.l0).getClass();
        if (((Boolean) C277540AuG.LIZ.getValue()).booleanValue()) {
            ((C720390SNp) viewOnLayoutChangeListenerC738740SyO.l0).LJI();
        }
    }

    public static final void onLayoutChange$14(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AdMultiContentViewHolder adMultiContentViewHolder;
        C1013640cU6 c1013640cU6;
        if ((i != i5 || i2 != i6 || i3 != i7 || i4 != i8) && (c1013640cU6 = (adMultiContentViewHolder = (AdMultiContentViewHolder) viewOnLayoutChangeListenerC738740SyO.l0).LLLJIL) != null) {
            c1013640cU6.LJ(adMultiContentViewHolder.LLLI, adMultiContentViewHolder.LLLIIII, true);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7) {
            return;
        }
        ((FriendsDetailBottomBarQuickDMAssem) viewOnLayoutChangeListenerC738740SyO.l0).hp();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == null) {
            return;
        }
        ((PhotoModePanelControlShadowAssem) viewOnLayoutChangeListenerC738740SyO.l0).ep();
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == null) {
            return;
        }
        ((PhotoModePanelControlShadowAssem) viewOnLayoutChangeListenerC738740SyO.l0).hp();
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC710220RtU interfaceC710220RtUYn;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) ((InteractAreaComponent) viewOnLayoutChangeListenerC738740SyO.l0).LLLIL.getValue();
        if (iPhotoSlidesAbility != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null) {
            interfaceC710220RtUYn.LJIJ(view, i2, i4, i6, i8);
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((InteractRightAreaComponent) viewOnLayoutChangeListenerC738740SyO.l0).Ap();
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738740SyO);
        RotateLandscapeVideoShrinkComponent rotateLandscapeVideoShrinkComponent = (RotateLandscapeVideoShrinkComponent) viewOnLayoutChangeListenerC738740SyO.l0;
        if (rotateLandscapeVideoShrinkComponent.LLJLLIL == 0 && rotateLandscapeVideoShrinkComponent.LLJLLL > 0.0f) {
            TabletFakeLandscapeAbility tabletFakeLandscapeAbility = (TabletFakeLandscapeAbility) rotateLandscapeVideoShrinkComponent.LLJLILLLLZIIL.getValue();
            if (tabletFakeLandscapeAbility != null) {
                tabletFakeLandscapeAbility.NA1();
            }
            RotateLandscapeVideoShrinkComponent rotateLandscapeVideoShrinkComponent2 = (RotateLandscapeVideoShrinkComponent) viewOnLayoutChangeListenerC738740SyO.l0;
            AbstractC726740Sf2 abstractC726740Sf2 = rotateLandscapeVideoShrinkComponent2.LLJJL;
            if (abstractC726740Sf2 != null) {
                float f = rotateLandscapeVideoShrinkComponent2.LLJLLL;
                abstractC726740Sf2.LIZIZ(f, f);
            }
        }
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i7 - i5;
        if (i9 > 0 && i9 != i10) {
            VideoDescAssem videoDescAssem = (VideoDescAssem) viewOnLayoutChangeListenerC738740SyO.l0;
            HandlerHook.viewRemoveCallbacks(videoDescAssem.LJJIJL(), videoDescAssem.LLLLIILLL);
            HandlerHook.viewPost(videoDescAssem.LJJIJL(), videoDescAssem.LLLLIILLL);
        }
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C719660SKu) viewOnLayoutChangeListenerC738740SyO.l0).LJIJ(view, i2, i4, i6, i8);
    }
}
