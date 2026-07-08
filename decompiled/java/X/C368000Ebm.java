package X;

import Y.ALAdapterS2S0100000_5;
import Y.ALAdapterS2S0200000_5;
import Y.ARunnableS74S0200000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0Ebm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368000Ebm extends C21690419ug {
    public static final C369280Edq Companion = new Object() { // from class: X.0Edq
    };
    public final String TAG;
    public final C19EG activity;
    public FrameLayout aiExtendFrameFromXml;
    public C369690EeV aiExtendFrameViewFromXml;
    public TuxTextView aiExtendTextViewFromXml;
    public final C01GW blackSlotHint$delegate;
    public C359620E8a curSubTrackShowType;
    public C359480E7m customUIState;
    public Drawable disableOriginalVoiceIcon;
    public TextView dragTvFromXml;
    public View draggingMaskFromXml;
    public C368060Ebs dropTrack;
    public C368740Ecy effectTinyScrollerFromXml;
    public C367130EaN effectTinySnapViewFromXml;
    public boolean enableEffectTinyScroller;
    public Drawable enableOriginalVoiceIcon;
    public boolean enableStickerTinyScroller;
    public boolean enableTinyScroller;
    public C0GYW exceedLimitBgFromXml;
    public TextView exceedLimitTextFromXml;
    public C369010EdP exceedLimitViewFromXml;
    public final ValueAnimator firstAnim;
    public C369010EdP frameScrollerFromXml;
    public View gradientBgEndFromXml;
    public View gradientBgStartFromXml;
    public View ignoreMaskFromXml;
    public InterfaceC368580Eci innerListener;
    public boolean isActive;
    public boolean isAddBtnVisible;
    public boolean isCoverMode;
    public final C01GW isNewSubTrackHeight$delegate;
    public final C01GW isRTL$delegate;
    public ImageView ivAddFromXml;
    public C368140Ec0 ivTimeFromXml;
    public InterfaceC368620Ecm keyframeListener;
    public long lastSeekTimeStamp;
    public C0E8D legacyActionApi;
    public C0E8Y mobEvent;
    public C367970Ebj multiTrackAdapter;
    public C368010Ebn multiTrackFromXml;
    public C368740Ecy musicTinyScrollerFromXml;
    public C367130EaN musicTinySnapViewFromXml;
    public Function0<Unit> onAiExtendFrameBecameVisible;
    public Function1<? super String, Unit> onDropClick;
    public Function0<Unit> onFingerAndTrackStop;
    public double scale;
    public C368680Ecs scrollContainerFromXml;
    public C0E75 selectState;
    public boolean showSubTrackIcon;
    public C368740Ecy stickerTinyScrollerFromXml;
    public C367130EaN stickerTinySnapViewFromXml;
    public ViewStub stubDropTrackFromXml;
    public C368630Ecn subTrackGroupFromXml;
    public Map<String, Integer> subTrackStateBeforeSort;
    public C368740Ecy textTinyScrollerFromXml;
    public C367130EaN textTinySnapViewFromXml;
    public ViewStub timeContainerStubFromXml;
    public C368920EdG timeRulerFromXml;
    public C368850Ed9 timeRulerScrollerFromXml;
    public long timestamp;
    public TrackPanelActionListener trackPanelActionListener;
    public TuxIconView tvMuteFromXml;

    public final Pair<Integer, Integer> getFirstTransitionLocation() {
        ImageView firstTransitionIconView$editor_trackpanel_release;
        int[] iArr = new int[2];
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml == null || (firstTransitionIconView$editor_trackpanel_release = multiTrackFromXml.getFirstTransitionIconView$editor_trackpanel_release()) == null) {
            return new Pair<>(0, 0);
        }
        firstTransitionIconView$editor_trackpanel_release.getLocationInWindow(iArr);
        return new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final void release() {
        this.trackPanelActionListener = null;
    }

    private final C368460EcW getBlackSlotHint() {
        return (C368460EcW) this.blackSlotHint$delegate.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Edk] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0EcV] */
    private final void initSubTrack() {
        ?? r5 = new InterfaceC369580EeK() { // from class: X.0Edk
            @Override // X.InterfaceC369580EeK
            public final void pause() {
            }
        };
        ?? r6 = new InterfaceC369170Edf() { // from class: X.0EcV
            @Override // X.InterfaceC369170Edf
            public final boolean LIZ() {
                InterfaceC368620Ecm interfaceC368620Ecm = this.LIZ.keyframeListener;
                if (interfaceC368620Ecm != null) {
                    return interfaceC368620Ecm.LIZ();
                }
                return true;
            }

            @Override // X.InterfaceC369170Edf
            public final NLETimeSpaceNode LIZIZ() {
                InterfaceC368620Ecm interfaceC368620Ecm = this.LIZ.keyframeListener;
                if (interfaceC368620Ecm != null) {
                    return interfaceC368620Ecm.LIZIZ();
                }
                return null;
            }

            @Override // X.InterfaceC369170Edf
            public final boolean LIZJ() {
                InterfaceC368580Eci innerListener = this.LIZ.getInnerListener();
                if (innerListener != null) {
                    return innerListener.LIZ();
                }
                return false;
            }
        };
        setMultiTrackAdapter(new C367970Ebj(this.activity, this, getSubTrackGroupFromXml(), getScrollContainerFromXml(), r5, r6));
    }

    private final void initUISize() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = C368130Ebz.LJIIIZ;
        ViewGroup.LayoutParams layoutParams = getFrameScrollerFromXml().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = C0FU0.LIZ(i);
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(isNewSubTrackHeight() ? 6 : 20)));
            }
        } else {
            marginLayoutParams = null;
        }
        C369010EdP frameScrollerFromXml = getFrameScrollerFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameScrollerFromXml);
        frameScrollerFromXml.setLayoutParams(marginLayoutParams);
        changeTopMargin(getIvTimeFromXml(), Float.valueOf(21.0f));
        changeBottomMargin(getIvTimeFromXml(), 6.0f);
        C786410Ut5.M1(getMusicTinyScrollerFromXml(), 0);
        C786410Ut5.M1(getTextTinyScrollerFromXml(), 0);
        C786410Ut5.M1(getStickerTinyScrollerFromXml(), 0);
        C786410Ut5.M1(getEffectTinyScrollerFromXml(), 0);
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bqi));
        if (numLIZIZ != null) {
            getTextTinySnapViewFromXml().setColor(numLIZIZ.intValue());
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f9, getContext());
        if (numLIZJ != null) {
            getStickerTinySnapViewFromXml().setColor(numLIZJ.intValue());
        }
        Integer numLIZIZ2 = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bq8));
        if (numLIZIZ2 != null) {
            getEffectTinySnapViewFromXml().setColor(numLIZIZ2.intValue());
        }
        Integer numLIZIZ3 = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bq_));
        if (numLIZIZ3 != null) {
            getMusicTinySnapViewFromXml().setColor(numLIZIZ3.intValue());
        }
        int iLIZ = C0FU0.LIZ(C368130Ebz.LJII ? 1.5f : 1.0f);
        C367130EaN textTinySnapViewFromXml = getTextTinySnapViewFromXml();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iLIZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textTinySnapViewFromXml);
        textTinySnapViewFromXml.setLayoutParams(layoutParams2);
        C367130EaN musicTinySnapViewFromXml = getMusicTinySnapViewFromXml();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, C0FU0.LIZ(4.0f));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(musicTinySnapViewFromXml);
        musicTinySnapViewFromXml.setLayoutParams(layoutParams3);
        C367130EaN stickerTinySnapViewFromXml = getStickerTinySnapViewFromXml();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, iLIZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(stickerTinySnapViewFromXml);
        stickerTinySnapViewFromXml.setLayoutParams(layoutParams4);
        C367130EaN effectTinySnapViewFromXml = getEffectTinySnapViewFromXml();
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, iLIZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(effectTinySnapViewFromXml);
        effectTinySnapViewFromXml.setLayoutParams(layoutParams5);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isFirstTransitionVisibleOnScreen() {
        /*
            r4 = this;
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.0Ebn r0 = r4.getMultiTrackFromXml()
            r3 = 0
            if (r0 == 0) goto L49
            android.widget.ImageView r0 = r0.getFirstTransitionIconView$editor_trackpanel_release()
            if (r0 == 0) goto L49
            boolean r2 = r0.getGlobalVisibleRect(r1)
        L16:
            X.0Ebn r0 = r4.getMultiTrackFromXml()
            r1 = 1
            if (r0 == 0) goto L3a
            int r0 = r0.getSelectIndex()
            if (r0 != 0) goto L3a
        L23:
            X.0Ebn r0 = r4.getMultiTrackFromXml()
            if (r0 == 0) goto L38
            X.0E6E r1 = r0.getSelectedTrackStyle()
        L2d:
            X.0E6E r0 = X.C0E6E.CLIP
            if (r1 != r0) goto L47
            r0 = 1
        L32:
            if (r2 == 0) goto L37
            if (r0 != 0) goto L37
            r3 = 1
        L37:
            return r3
        L38:
            r1 = 0
            goto L2d
        L3a:
            X.0Ebn r0 = r4.getMultiTrackFromXml()
            if (r0 == 0) goto L47
            int r0 = r0.getSelectIndex()
            if (r0 != r1) goto L47
            goto L23
        L47:
            r0 = 0
            goto L32
        L49:
            r2 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368000Ebm.isFirstTransitionVisibleOnScreen():boolean");
    }

    public final FrameLayout getAiExtendFrameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.aiExtendFrameFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.anp);
            this.aiExtendFrameFromXml = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C369690EeV getAiExtendFrameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.aiExtendFrameViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.anq);
            this.aiExtendFrameViewFromXml = (C369690EeV) callbackFindViewById;
        }
        return (C369690EeV) callbackFindViewById;
    }

    public final TuxTextView getAiExtendTextViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.aiExtendTextViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ans);
            this.aiExtendTextViewFromXml = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TextView getDragTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.dragTvFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.g89);
            this.dragTvFromXml = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final View getDraggingMaskFromXml() {
        View view = this.draggingMaskFromXml;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.g8e);
        this.draggingMaskFromXml = viewFindViewById;
        return viewFindViewById;
    }

    public final C368740Ecy getEffectTinyScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.effectTinyScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gvb);
            this.effectTinyScrollerFromXml = (C368740Ecy) callbackFindViewById;
        }
        return (C368740Ecy) callbackFindViewById;
    }

    public final C367130EaN getEffectTinySnapViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.effectTinySnapViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gvc);
            this.effectTinySnapViewFromXml = (C367130EaN) callbackFindViewById;
        }
        return (C367130EaN) callbackFindViewById;
    }

    public final C0GYW getExceedLimitBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.exceedLimitBgFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hew);
            this.exceedLimitBgFromXml = (C0GYW) callbackFindViewById;
        }
        return (C0GYW) callbackFindViewById;
    }

    public final TextView getExceedLimitTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.exceedLimitTextFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hex);
            this.exceedLimitTextFromXml = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final C369010EdP getExceedLimitViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.exceedLimitViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hey);
            this.exceedLimitViewFromXml = (C369010EdP) callbackFindViewById;
        }
        return (C369010EdP) callbackFindViewById;
    }

    public final C369010EdP getFrameScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.frameScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iju);
            this.frameScrollerFromXml = (C369010EdP) callbackFindViewById;
        }
        return (C369010EdP) callbackFindViewById;
    }

    public final View getGradientBgEndFromXml() {
        View view = this.gradientBgEndFromXml;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.j4g);
        this.gradientBgEndFromXml = viewFindViewById;
        return viewFindViewById;
    }

    public final View getGradientBgStartFromXml() {
        View view = this.gradientBgStartFromXml;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.j4h);
        this.gradientBgStartFromXml = viewFindViewById;
        return viewFindViewById;
    }

    public final View getIgnoreMaskFromXml() {
        View view = this.ignoreMaskFromXml;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.k63);
        this.ignoreMaskFromXml = viewFindViewById;
        return viewFindViewById;
    }

    public final ImageView getIvAddFromXml() {
        KeyEvent.Callback callbackFindViewById = this.ivAddFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l5f);
            this.ivAddFromXml = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C368140Ec0 getIvTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.ivTimeFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lxt);
            this.ivTimeFromXml = (C368140Ec0) callbackFindViewById;
        }
        return (C368140Ec0) callbackFindViewById;
    }

    public final C367970Ebj getMultiTrackAdapter() {
        C367970Ebj c367970Ebj = this.multiTrackAdapter;
        if (c367970Ebj != null) {
            return c367970Ebj;
        }
        return null;
    }

    public final C368010Ebn getMultiTrackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.multiTrackFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.onq);
            this.multiTrackFromXml = (C368010Ebn) callbackFindViewById;
        }
        return (C368010Ebn) callbackFindViewById;
    }

    public final C368740Ecy getMusicTinyScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.musicTinyScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.osk);
            this.musicTinyScrollerFromXml = (C368740Ecy) callbackFindViewById;
        }
        return (C368740Ecy) callbackFindViewById;
    }

    public final C367130EaN getMusicTinySnapViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.musicTinySnapViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.osl);
            this.musicTinySnapViewFromXml = (C367130EaN) callbackFindViewById;
        }
        return (C367130EaN) callbackFindViewById;
    }

    public final C368680Ecs getScrollContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.scrollContainerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u2j);
            this.scrollContainerFromXml = (C368680Ecs) callbackFindViewById;
        }
        return (C368680Ecs) callbackFindViewById;
    }

    public final C368740Ecy getStickerTinyScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.stickerTinyScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w4f);
            this.stickerTinyScrollerFromXml = (C368740Ecy) callbackFindViewById;
        }
        return (C368740Ecy) callbackFindViewById;
    }

    public final C367130EaN getStickerTinySnapViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.stickerTinySnapViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w4g);
            this.stickerTinySnapViewFromXml = (C367130EaN) callbackFindViewById;
        }
        return (C367130EaN) callbackFindViewById;
    }

    public final ViewStub getStubDropTrackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.stubDropTrackFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wbu);
            this.stubDropTrackFromXml = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    public final C368630Ecn getSubTrackGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.subTrackGroupFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wdq);
            this.subTrackGroupFromXml = (C368630Ecn) callbackFindViewById;
        }
        return (C368630Ecn) callbackFindViewById;
    }

    public final C368740Ecy getTextTinyScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.textTinyScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xkg);
            this.textTinyScrollerFromXml = (C368740Ecy) callbackFindViewById;
        }
        return (C368740Ecy) callbackFindViewById;
    }

    public final C367130EaN getTextTinySnapViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.textTinySnapViewFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xkh);
            this.textTinySnapViewFromXml = (C367130EaN) callbackFindViewById;
        }
        return (C367130EaN) callbackFindViewById;
    }

    public final ViewStub getTimeContainerStubFromXml() {
        KeyEvent.Callback callbackFindViewById = this.timeContainerStubFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xw7);
            this.timeContainerStubFromXml = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    public final C368920EdG getTimeRulerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.timeRulerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xw1);
            this.timeRulerFromXml = (C368920EdG) callbackFindViewById;
        }
        return (C368920EdG) callbackFindViewById;
    }

    public final C368850Ed9 getTimeRulerScrollerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.timeRulerScrollerFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xw2);
            this.timeRulerScrollerFromXml = (C368850Ed9) callbackFindViewById;
        }
        return (C368850Ed9) callbackFindViewById;
    }

    public final TuxIconView getTvMuteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.tvMuteFromXml;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4r);
            this.tvMuteFromXml = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final boolean isNewSubTrackHeight() {
        return ((Boolean) this.isNewSubTrackHeight$delegate.getValue()).booleanValue();
    }

    public final boolean isRTL() {
        return ((Boolean) this.isRTL$delegate.getValue()).booleanValue();
    }

    public final void scrollToSelectSlotTrack() {
        NLETrackSlot nLETrackSlot = this.selectState.LIZJ;
        if (nLETrackSlot != null) {
            getSubTrackGroupFromXml().LJIIL(nLETrackSlot);
        }
    }

    private final void initListener() {
        getIvAddFromXml().setLayerType(2, null);
        C473601ss.LIZ(1000L, getIvAddFromXml(), new AwS584S0100000_5(this, 801));
        getFrameScrollerFromXml().setMustUpdateScrollXListener(new AwS584S0100000_5(this, 802));
        getFrameScrollerFromXml().setScrollChangeListener(new AwS619S0100000_5(this, 38));
        final AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(this, 804);
        getScrollContainerFromXml().setFingerStopListener(new AwS584S0100000_5(awS584S0100000_5, 803));
        C368680Ecs scrollContainerFromXml = getScrollContainerFromXml();
        scrollContainerFromXml.LLJILJIL.add(new C0EGA() { // from class: X.0Ec3
            @Override // X.C0EGA
            public final void LIZ(C0E6I c0e6i, int i) {
                InterfaceC368580Eci innerListener;
                C0E8Y mobEvent = this.LIZ.getMobEvent();
                if (mobEvent != null) {
                    mobEvent.LIZJ(c0e6i);
                }
                if (c0e6i == C0E6I.IDLE) {
                    if (!this.LIZ.getScrollContainerFromXml().LLJIJIL) {
                        awS584S0100000_5.invoke(Integer.valueOf(i));
                    }
                    InterfaceC368580Eci innerListener2 = this.LIZ.getInnerListener();
                    if (innerListener2 != null) {
                        innerListener2.LIZJ(i, false, true);
                    }
                    Function0<Unit> onFingerAndTrackStop = this.LIZ.getOnFingerAndTrackStop();
                    if (onFingerAndTrackStop != null) {
                        onFingerAndTrackStop.invoke();
                        return;
                    }
                    return;
                }
                if (c0e6i != C0E6I.DRAGGING || (innerListener = this.LIZ.getInnerListener()) == null) {
                    return;
                }
                innerListener.LIZJ(i, true, false);
            }
        });
        getIgnoreMaskFromXml().setOnTouchListener(new View.OnTouchListener() { // from class: X.0Eda
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    private final void initOriginUI() {
        getScrollContainerFromXml().setBackgroundColor(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getFrameScrollerFromXml().getLayoutParams();
        marginLayoutParams.topMargin = C0FU0.LIZ(20.0f);
        C369010EdP frameScrollerFromXml = getFrameScrollerFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameScrollerFromXml);
        frameScrollerFromXml.setLayoutParams(marginLayoutParams);
        C368850Ed9 timeRulerScrollerFromXml = getTimeRulerScrollerFromXml();
        int visibility = timeRulerScrollerFromXml.getVisibility();
        timeRulerScrollerFromXml.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, timeRulerScrollerFromXml);
        C786410Ut5.LJZI(8, getIvAddFromXml());
        TuxIconView tvMuteFromXml = getTvMuteFromXml();
        if (tvMuteFromXml != null) {
            C786410Ut5.LLLLLLZZ(tvMuteFromXml, 4);
        }
        C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
        int visibility2 = ivTimeFromXml.getVisibility();
        ivTimeFromXml.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, ivTimeFromXml);
    }

    private final void updateMuteBtnLayout() {
        TuxIconView tvMuteFromXml = getTvMuteFromXml();
        if (tvMuteFromXml != null) {
            ViewGroup.LayoutParams layoutParams = tvMuteFromXml.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = C293810BfP.LIZ() ? 48 : 20;
            int i2 = C293810BfP.LIZ() ? 60 : 20;
            int i3 = C293810BfP.LIZ() ? 18 : 32;
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C418440Gaw.LJFF(C0FU0.LIZJ(getContext()), getContext()) / 2) - i) - i3))));
            C786410Ut5.W5(tvMuteFromXml, marginLayoutParams);
        }
    }

    public final void cancelClipAnim() {
        Animation animation;
        C368400EcQ c368400EcQ = (C368400EcQ) findViewById(R.id.dqk);
        if (c368400EcQ == null || (animation = c368400EcQ.LLJLIL) == null) {
            return;
        }
        animation.cancel();
    }

    public final Function1<View, Unit> getOnClickNullAudioTrack() {
        return getSubTrackGroupFromXml().getOnClickNullAudioTrack();
    }

    public final Function1<View, Unit> getOnClickNullEffectTrack() {
        return getSubTrackGroupFromXml().getOnClickNullEffectTrack();
    }

    public final Function2<NLETrackSlot, View, Boolean> getOnShouldInterceptSlotClickEvent() {
        return getSubTrackGroupFromXml().getOnShouldInterceptSlotClickEvent();
    }

    public final void hide() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final void hideDraggingMask() {
        C786410Ut5.LJLLLLLL(4, getDraggingMaskFromXml());
        C786410Ut5.LJLLLLLL(8, getIgnoreMaskFromXml());
        C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ivTimeFromXml);
        ivTimeFromXml.setAlpha(1.0f);
    }

    public final void hideStickPoint() {
        getMultiTrackAdapter().getClass();
        ((ArrayList) getMultiTrackAdapter().LJJII).clear();
        C367970Ebj multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.LJIIZILJ(multiTrackAdapter.LJIIZILJ, null);
    }

    public final void initCustomUI() {
        TuxIconView tvMuteFromXml;
        ImageView ivAddFromXml = getIvAddFromXml();
        Typeface typeface = C368130Ebz.LIZ;
        Context context = getContext();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = C293820BfQ.LIZ() ? R.raw.icon_plus_fill : R.raw.icon_plus_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJFF = false;
        c419910GdJ.LIZIZ = C293820BfQ.LIZ() ? 14 : 24;
        c419910GdJ.LIZJ = C293820BfQ.LIZ() ? 14 : 24;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(new C1361400lX0(context, R.style.xm));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZJ = Float.valueOf(8);
        c384050F3z.LJII = 26;
        c384050F3z.LJI = 26;
        ivAddFromXml.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        if (C368130Ebz.LJII) {
            ivAddFromXml.setElevation(C390810FTz.LIZ(6.0f));
            ivAddFromXml.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        this.enableOriginalVoiceIcon = C368130Ebz.LJFF(R.raw.icon_speaker_2_fill_ltr, R.attr.eh, getContext());
        this.disableOriginalVoiceIcon = C368130Ebz.LJFF(R.raw.icon_speaker_x_mark_fill_ltr, R.attr.eh, getContext());
        updateMuteBtnLayout();
        if (C293810BfP.LIZ() && (tvMuteFromXml = getTvMuteFromXml()) != null) {
            C426750GoL.LJIIL(tvMuteFromXml, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 16);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getIvAddFromXml().getLayoutParams();
        float f = C368130Ebz.LJIILL;
        marginLayoutParams.width = C0FU0.LIZ(f);
        marginLayoutParams.height = C0FU0.LIZ(f);
        marginLayoutParams.setMarginEnd(C0FU0.LIZ(11.0f));
        q0.LJIJ(getTvMuteFromXml(), new C0FXM(1));
        if (C293820BfQ.LIZ()) {
            C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
            if (subTrackGroupFromXml != null) {
                changeTopPadding(subTrackGroupFromXml, 4);
            }
            C368630Ecn subTrackGroupFromXml2 = getSubTrackGroupFromXml();
            if (subTrackGroupFromXml2 != null) {
                changeBottomMargin(subTrackGroupFromXml2, 4.0f);
            }
        } else {
            C368630Ecn subTrackGroupFromXml3 = getSubTrackGroupFromXml();
            if (subTrackGroupFromXml3 != null) {
                changeTopPadding(subTrackGroupFromXml3, 6);
            }
        }
        setPlayHeadWidth(C418440Gaw.LIZIZ(2), 0.0f);
        FrameLayout aiExtendFrameFromXml = getAiExtendFrameFromXml();
        if (aiExtendFrameFromXml != null) {
            C786410Ut5.Kc(aiExtendFrameFromXml, isRTL() ? C497820Jfg.LIZIZ(getContext()) / 2 : C418440Gaw.LIZIZ(-22));
        }
        TuxTextView aiExtendTextViewFromXml = getAiExtendTextViewFromXml();
        if (aiExtendTextViewFromXml != null) {
            aiExtendTextViewFromXml.setText(getContext().getString(2131825492));
        }
    }

    public final void refreshVideoFramesIfNeeded() {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        multiTrackFromXml.getClass();
        C354270Duj.LIZJ(0L, new AwS549S0100000_5(multiTrackFromXml, 1223));
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            subTrackGroupFromXml.invalidate();
        }
    }

    public final void scrollToTrackEnd() {
        int desireMaxScrollX = getFrameScrollerFromXml().getDesireMaxScrollX();
        C368680Ecs scrollContainerFromXml = getScrollContainerFromXml();
        if (isRTL()) {
            desireMaxScrollX = -desireMaxScrollX;
        }
        C368680Ecs.e0(scrollContainerFromXml, desireMaxScrollX, false, false, 6);
    }

    public final void show() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void showDraggingMask() {
        C786410Ut5.LJLLLLLL(0, getDraggingMaskFromXml());
        C786410Ut5.LJLLLLLL(0, getIgnoreMaskFromXml());
        C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ivTimeFromXml);
        ivTimeFromXml.setAlpha(0.8f);
    }

    public final void unSelectTransition() {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        Iterator it2 = ((ArrayList) multiTrackFromXml.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C368220Ec8) it2.next()).LJIILL(EnumC368330EcJ.HIDE);
        }
        multiTrackFromXml.LLJILLL = -1;
    }

    public final void updateAIExtendFrame() {
        if (C369140Edc.LIZ()) {
            FrameLayout aiExtendFrameFromXml = getAiExtendFrameFromXml();
            if (this.isAddBtnVisible && aiExtendFrameFromXml != null && aiExtendFrameFromXml.getVisibility() == 8) {
                C786410Ut5.LJZ(0, aiExtendFrameFromXml);
                Function0<Unit> function0 = this.onAiExtendFrameBecameVisible;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            boolean z = this.isAddBtnVisible && aiExtendFrameFromXml != null && aiExtendFrameFromXml.getVisibility() == 0;
            C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
            if (multiTrackFromXml != null) {
                multiTrackFromXml.setAiExtendVisible(z);
            }
            C354270Duj.LIZJ(0L, new AwS549S0100000_5(this, 966));
        }
    }

    public final void updateLineTrackScale() {
        getTextTinyScrollerFromXml().requestLayout();
        getTextTinySnapViewFromXml().invalidate();
        getMusicTinyScrollerFromXml().requestLayout();
        getMusicTinySnapViewFromXml().invalidate();
        getStickerTinyScrollerFromXml().requestLayout();
        getStickerTinySnapViewFromXml().invalidate();
    }

    public final C19EG getActivity() {
        return this.activity;
    }

    public final boolean getEnableEffectTinyScroller$editor_trackpanel_release() {
        return this.enableEffectTinyScroller;
    }

    public final boolean getEnableStickerTinyScroller$editor_trackpanel_release() {
        return this.enableStickerTinyScroller;
    }

    public final boolean getEnableTinyScroller$editor_trackpanel_release() {
        return this.enableTinyScroller;
    }

    public final ValueAnimator getFirstAnim() {
        return this.firstAnim;
    }

    public final InterfaceC368580Eci getInnerListener() {
        return this.innerListener;
    }

    public final C0E8Y getMobEvent() {
        return this.mobEvent;
    }

    public final Function0<Unit> getOnAiExtendFrameBecameVisible() {
        return this.onAiExtendFrameBecameVisible;
    }

    public final Function1<String, Unit> getOnDropClick() {
        return this.onDropClick;
    }

    public final Function0<Unit> getOnFingerAndTrackStop() {
        return this.onFingerAndTrackStop;
    }

    public final double getScale() {
        return this.scale;
    }

    public final TrackPanelActionListener getTrackPanelActionListener() {
        return this.trackPanelActionListener;
    }

    private final void changeTopMargin(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getFrameScrollerFromXml().getLayoutParams();
        marginLayoutParams.topMargin = C0FU0.LIZ(f);
        C369010EdP frameScrollerFromXml = getFrameScrollerFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameScrollerFromXml);
        frameScrollerFromXml.setLayoutParams(marginLayoutParams);
    }

    @InterfaceC1294060jmO
    private final void enableAddMuteClickable(boolean z) {
        ImageView ivAddFromXml = getIvAddFromXml();
        if (ivAddFromXml != null) {
            ivAddFromXml.setClickable(z);
        }
        TuxIconView tvMuteFromXml = getTvMuteFromXml();
        if (tvMuteFromXml != null) {
            tvMuteFromXml.setClickable(z);
        }
    }

    private final void enableMainTrackOtherEvent(boolean z) {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        Iterator it2 = ((ArrayList) multiTrackFromXml.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ImageView transitionIcon = ((C368220Ec8) it2.next()).getTransitionIcon();
            if (transitionIcon != null) {
                transitionIcon.setClickable(z);
            }
        }
        multiTrackFromXml.LLJZ = z;
        multiTrackFromXml.LLJZIJLIL = z;
    }

    private final void enableMultiMusicEdit(boolean z) {
        getSubTrackGroupFromXml().setEnableMultiMusicEdit$editor_trackpanel_release(z);
    }

    private final void initDropTrack(long j) {
        try {
            View viewLJLLLL = C786410Ut5.LJLLLL(getStubDropTrackFromXml());
            C368820Ed6 c368820Ed6 = (C368820Ed6) viewLJLLLL.findViewById(R.id.ga6);
            C368060Ebs c368060Ebs = (C368060Ebs) viewLJLLLL.findViewById(R.id.qhv);
            c368060Ebs.getTrackLine().setLineColor(getResources().getColor(C368130Ebz.LJFF));
            long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            c368820Ed6.LLILZIL = j2;
            c368820Ed6.LLILZLL = (int) (j2 * c368820Ed6.LLIZLLLIL);
            c368820Ed6.LLIZ = 0;
            c368820Ed6.scrollTo(getFrameScrollerFromXml().getScrollX(), 0);
            c368820Ed6.setMustUpdateScrollXListener(new AwS584S0100000_5(c368060Ebs, 799));
            c368060Ebs.setOnDropClick(new AwS584S0100000_5(this, 800));
            c368060Ebs.LIZ();
            this.dropTrack = c368060Ebs;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private final void setAddBtnVisibility(boolean z) {
        int i;
        ImageView ivAddFromXml = getIvAddFromXml();
        if (ivAddFromXml != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJZI(i, ivAddFromXml);
        }
        syncAiExtendVisibility(z);
    }

    private final void setDropVisibility(TrackShowType trackShowType) {
        if (trackShowType != TrackShowType.PIP && trackShowType != TrackShowType.NORMAL_WITHOUT_OVERLAY) {
            if (trackShowType != TrackShowType.NORMAL) {
                C368060Ebs c368060Ebs = this.dropTrack;
                if (c368060Ebs != null) {
                    c368060Ebs.setDropGroupVisibility(8);
                }
                C368060Ebs c368060Ebs2 = this.dropTrack;
                if (c368060Ebs2 != null) {
                    c368060Ebs2.setPipTrackVisibility(0);
                    return;
                }
                return;
            }
            C368060Ebs c368060Ebs3 = this.dropTrack;
            if (c368060Ebs3 != null) {
                c368060Ebs3.setDropGroupVisibility(0);
            }
            C368060Ebs c368060Ebs4 = this.dropTrack;
            if (c368060Ebs4 == null) {
                return;
            }
            c368060Ebs4.setPipTrackVisibility(0);
            return;
        }
        C368060Ebs c368060Ebs5 = this.dropTrack;
        if (c368060Ebs5 != null) {
            c368060Ebs5.setDropGroupVisibility(8);
        }
        C368060Ebs c368060Ebs6 = this.dropTrack;
        if (c368060Ebs6 != null) {
            c368060Ebs6.setPipTrackVisibility(8);
        }
    }

    @InterfaceC1294060jmO
    private final void setMainTrackMuteBtnVisibility(boolean z) {
        int i;
        TuxIconView tvMuteFromXml = getTvMuteFromXml();
        if (tvMuteFromXml != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LLLLLLZZ(tvMuteFromXml, i);
        }
    }

    private final void setMultiFrameAlpha(float f) {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null) {
            multiTrackFromXml.setItemFrameAlpha(f);
        }
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml);
            subTrackGroupFromXml.setAlpha(f);
        }
    }

    private final void setOptHasFixSize(boolean z) {
        setHasFixSize(z);
    }

    @InterfaceC1294060jmO
    private final void setPipDropClickable(boolean z) {
        C368060Ebs c368060Ebs = this.dropTrack;
        if (c368060Ebs != null) {
            c368060Ebs.setPipDropViewClickable(z);
        }
    }

    private final void syncAiExtendVisibility(boolean z) {
        FrameLayout aiExtendFrameFromXml;
        boolean z2;
        this.isAddBtnVisible = z;
        if (!C369140Edc.LIZ() || (aiExtendFrameFromXml = getAiExtendFrameFromXml()) == null) {
            return;
        }
        int i = 0;
        if (aiExtendFrameFromXml.getVisibility() == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJZ(i, aiExtendFrameFromXml);
        if (z && z2) {
            Function0<Unit> function0 = this.onAiExtendFrameBecameVisible;
            if (function0 != null) {
                function0.invoke();
            }
            C354270Duj.LIZJ(0L, new AwS549S0100000_5(this, 965));
        }
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null) {
            multiTrackFromXml.setAiExtendVisible(z);
        }
    }

    public final boolean checkFirstTransitionVisibleInSafeArea(int i) {
        int width;
        ImageView firstTransitionIconView$editor_trackpanel_release;
        if (!isFirstTransitionVisibleOnScreen()) {
            return false;
        }
        int iIntValue = getFirstTransitionLocation().getFirst().intValue();
        int iLIZJ = C0FU0.LIZJ(getContext());
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null && (firstTransitionIconView$editor_trackpanel_release = multiTrackFromXml.getFirstTransitionIconView$editor_trackpanel_release()) != null) {
            width = firstTransitionIconView$editor_trackpanel_release.getWidth();
        } else {
            width = 0;
        }
        if (iIntValue <= i || (iLIZJ - iIntValue) - width <= i) {
            return false;
        }
        return true;
    }

    public final void disableOnTouchScroller(boolean z) {
        getScrollContainerFromXml().LLJJJJ = z;
    }

    @InterfaceC1294060jmO
    public final void enableMainTrackSlotClick(boolean z) {
        getMultiTrackFromXml().LLJJIJI = z;
    }

    @InterfaceC1294060jmO
    public final void enableMainTrackTransitionClickable(boolean z) {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        for (C368220Ec8 c368220Ec8 : (ArrayList) multiTrackFromXml.LLILLJJLI) {
            View transitionHighlight = c368220Ec8.getTransitionHighlight();
            if (transitionHighlight != null) {
                transitionHighlight.setClickable(z);
            }
            ImageView transitionIcon = c368220Ec8.getTransitionIcon();
            if (transitionIcon != null) {
                transitionIcon.setClickable(z);
            }
        }
        multiTrackFromXml.LLJZIJLIL = z;
    }

    public final void init(LayoutInflater layoutInflater) {
        System.currentTimeMillis();
        C21146717pB.LIZIZ(getContext(), R.layout.fx1, this, true);
        System.currentTimeMillis();
        C360610EBv.LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null) {
            multiTrackFromXml.setOnSegmentsUpdated(new AwS549S0100000_5(this, 963));
        }
        getScrollContainerFromXml().setTimelineScale(C360610EBv.LIZJ());
        C368010Ebn multiTrackFromXml2 = getMultiTrackFromXml();
        if (multiTrackFromXml2 != null) {
            multiTrackFromXml2.setTrackScrollHandle$editor_trackpanel_release(getScrollContainerFromXml());
        }
        initCustomUI();
        initUISize();
        initSubTrack();
        initListener();
        setHasFixSize(true);
        updateAIExtendFrame();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateMuteBtnLayout();
    }

    public final void scrollAudioTrack(boolean z) {
        if (z) {
            getSubTrackGroupFromXml().LLLFF = true;
            NLETrackSlot nLETrackSlot = this.selectState.LIZJ;
            if (nLETrackSlot != null) {
                getSubTrackGroupFromXml().LJIIL(nLETrackSlot);
            }
            getSubTrackGroupFromXml().LIZLLL(true);
            return;
        }
        getSubTrackGroupFromXml().LLLFF = false;
        NLETrackSlot nLETrackSlot2 = this.selectState.LIZJ;
        if (nLETrackSlot2 != null) {
            C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
            subTrackGroupFromXml.LJIIJ(subTrackGroupFromXml.LJ(nLETrackSlot2));
        }
        getSubTrackGroupFromXml().LIZLLL(false);
    }

    public final void scrollSelectTrackToFirst(boolean z) {
        if (z) {
            getSubTrackGroupFromXml().setAllowLastTrackPutFirst(true);
            NLETrackSlot nLETrackSlot = this.selectState.LIZJ;
            if (nLETrackSlot != null) {
                getSubTrackGroupFromXml().LJIIL(nLETrackSlot);
            }
            getSubTrackGroupFromXml().LIZLLL(true);
            return;
        }
        getSubTrackGroupFromXml().setAllowLastTrackPutFirst(false);
        NLETrackSlot nLETrackSlot2 = this.selectState.LIZJ;
        if (nLETrackSlot2 != null) {
            C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
            subTrackGroupFromXml.LJIIJ(subTrackGroupFromXml.LJ(nLETrackSlot2));
        }
        getSubTrackGroupFromXml().LIZLLL(false);
    }

    public final void setAiExtendEnabled(boolean z) {
        float f;
        FrameLayout aiExtendFrameFromXml = getAiExtendFrameFromXml();
        if (aiExtendFrameFromXml != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.U4(aiExtendFrameFromXml, f);
        }
    }

    public final void setAiExtendFrameFromXml(FrameLayout frameLayout) {
        this.aiExtendFrameFromXml = frameLayout;
    }

    public final void setAiExtendFrameViewFromXml(C369690EeV c369690EeV) {
        this.aiExtendFrameViewFromXml = c369690EeV;
    }

    public final void setAiExtendTextViewFromXml(TuxTextView tuxTextView) {
        this.aiExtendTextViewFromXml = tuxTextView;
    }

    public final void setAudioCollectionClickListener(Function1<? super View, Unit> function1) {
        getSubTrackGroupFromXml().setOnClickAudioCollectionTrack$editor_trackpanel_release(function1);
    }

    public final void setCustomUIState(C359480E7m c359480E7m) {
        float fFloatValue;
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null) {
            multiTrackFromXml.setTransitionIconForceHidden$editor_trackpanel_release(c359480E7m.LJIJJ);
        }
        enableMainTrackSlotClick(c359480E7m.LIZIZ);
        enableMainTrackOtherEvent(c359480E7m.LIZJ);
        enableAddMuteClickable(c359480E7m.LIZLLL);
        boolean z = this.enableTinyScroller;
        boolean z2 = c359480E7m.LJI;
        if (z != z2) {
            this.enableTinyScroller = z2;
            setPipDropVisibility(z2);
        }
        boolean z3 = this.enableEffectTinyScroller;
        boolean z4 = c359480E7m.LJII;
        if (z3 != z4) {
            this.enableEffectTinyScroller = z4;
        }
        setAddBtnVisibility(c359480E7m.LJIIIIZZ);
        setMainTrackMuteBtnVisibility(c359480E7m.LJIIIZ);
        C368010Ebn multiTrackFromXml2 = getMultiTrackFromXml();
        if (multiTrackFromXml2 != null) {
            multiTrackFromXml2.LLJJIJIIJIL = c359480E7m.LJIIJ;
        }
        boolean z5 = this.customUIState.LJIILIIL;
        boolean z6 = c359480E7m.LJIILIIL;
        if (z5 != z6) {
            setPipDropClickable(z6);
        }
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            subTrackGroupFromXml.setEnableClip$editor_trackpanel_release(c359480E7m.LJIIJJI);
        }
        C368630Ecn subTrackGroupFromXml2 = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml2 != null) {
            subTrackGroupFromXml2.setEnableDrag$editor_trackpanel_release(c359480E7m.LJIIL);
        }
        if (!Intrinsics.LJ(c359480E7m.LJIILL, this.customUIState.LJIILL)) {
            Float f = c359480E7m.LJIILL;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            setMultiFrameAlpha(fFloatValue);
        }
        enableMultiMusicEdit(c359480E7m.LJIILLIIL);
        setOptHasFixSize(c359480E7m.LJIJ);
        this.customUIState = c359480E7m;
    }

    public final void setDragState(boolean z) {
        if (z) {
            C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
            int visibility = ivTimeFromXml.getVisibility();
            ivTimeFromXml.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, ivTimeFromXml);
            C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
            int visibility2 = subTrackGroupFromXml.getVisibility();
            subTrackGroupFromXml.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, subTrackGroupFromXml);
            C368060Ebs c368060Ebs = this.dropTrack;
            if (c368060Ebs != null) {
                int visibility3 = c368060Ebs.getVisibility();
                c368060Ebs.setVisibility(4);
                C1602160rnK.LIZIZ(visibility3, 4, c368060Ebs);
            }
            this.subTrackStateBeforeSort.put("music_tiny_key", Integer.valueOf(getMusicTinyScrollerFromXml().getVisibility()));
            this.subTrackStateBeforeSort.put("text_tiny_key", Integer.valueOf(getTextTinyScrollerFromXml().getVisibility()));
            this.subTrackStateBeforeSort.put("effect_tiny_key", Integer.valueOf(getEffectTinyScrollerFromXml().getVisibility()));
            C786410Ut5.M1(getMusicTinyScrollerFromXml(), 4);
            C786410Ut5.M1(getTextTinyScrollerFromXml(), 4);
            C786410Ut5.M1(getEffectTinyScrollerFromXml(), 4);
            C368850Ed9 timeRulerScrollerFromXml = getTimeRulerScrollerFromXml();
            int visibility4 = timeRulerScrollerFromXml.getVisibility();
            timeRulerScrollerFromXml.setVisibility(4);
            C1602160rnK.LIZIZ(visibility4, 4, timeRulerScrollerFromXml);
            setAddBtnVisibility(false);
            setMainTrackMuteBtnVisibility(false);
            C786410Ut5.LLIL(getDragTvFromXml(), 0);
            getScrollContainerFromXml().setClipChildren(false);
            return;
        }
        C786410Ut5.LLIL(getDragTvFromXml(), 8);
        C368850Ed9 timeRulerScrollerFromXml2 = getTimeRulerScrollerFromXml();
        int visibility5 = timeRulerScrollerFromXml2.getVisibility();
        timeRulerScrollerFromXml2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility5, 0, timeRulerScrollerFromXml2);
        setAddBtnVisibility(true);
        setMainTrackMuteBtnVisibility(true);
        C368140Ec0 ivTimeFromXml2 = getIvTimeFromXml();
        int visibility6 = ivTimeFromXml2.getVisibility();
        ivTimeFromXml2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility6, 0, ivTimeFromXml2);
        C368630Ecn subTrackGroupFromXml2 = getSubTrackGroupFromXml();
        int visibility7 = subTrackGroupFromXml2.getVisibility();
        subTrackGroupFromXml2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility7, 0, subTrackGroupFromXml2);
        C368060Ebs c368060Ebs2 = this.dropTrack;
        if (c368060Ebs2 != null) {
            int visibility8 = c368060Ebs2.getVisibility();
            c368060Ebs2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility8, 0, c368060Ebs2);
        }
        Integer num = this.subTrackStateBeforeSort.get("music_tiny_key");
        if (num != null) {
            C786410Ut5.M1(getMusicTinyScrollerFromXml(), num.intValue());
        }
        Integer num2 = this.subTrackStateBeforeSort.get("text_tiny_key");
        if (num2 != null) {
            C786410Ut5.M1(getTextTinyScrollerFromXml(), num2.intValue());
        }
        Integer num3 = this.subTrackStateBeforeSort.get("effect_tiny_key");
        if (num3 != null) {
            C786410Ut5.M1(getEffectTinyScrollerFromXml(), num3.intValue());
        }
        getScrollContainerFromXml().setClipChildren(true);
    }

    public final void setDragTvFromXml(TextView textView) {
        this.dragTvFromXml = textView;
    }

    public final void setDraggingMaskFromXml(View view) {
        this.draggingMaskFromXml = view;
    }

    public final void setEffectTinyScrollerFromXml(C368740Ecy c368740Ecy) {
        this.effectTinyScrollerFromXml = c368740Ecy;
    }

    public final void setEffectTinySnapViewFromXml(C367130EaN c367130EaN) {
        this.effectTinySnapViewFromXml = c367130EaN;
    }

    public final void setEnableEffectTinyScroller$editor_trackpanel_release(boolean z) {
        this.enableEffectTinyScroller = z;
    }

    public final void setEnableStickerTinyScroller$editor_trackpanel_release(boolean z) {
        this.enableStickerTinyScroller = z;
    }

    public final void setEnableTinyScroller$editor_trackpanel_release(boolean z) {
        this.enableTinyScroller = z;
    }

    public final void setExceedLimitBgFromXml(C0GYW c0gyw) {
        this.exceedLimitBgFromXml = c0gyw;
    }

    public final void setExceedLimitTextFromXml(TextView textView) {
        this.exceedLimitTextFromXml = textView;
    }

    public final void setExceedLimitViewFromXml(C369010EdP c369010EdP) {
        this.exceedLimitViewFromXml = c369010EdP;
    }

    public final void setFingerUpAfterMovedListener(Function0<Unit> function0) {
        getScrollContainerFromXml().setFingerUpAfterMovedListener(function0);
    }

    public final void setForceTrackFirstEnabled(boolean z) {
        getSubTrackGroupFromXml().setForceTrackFirstEnabled(z);
    }

    public final void setFrameScrollerFromXml(C369010EdP c369010EdP) {
        this.frameScrollerFromXml = c369010EdP;
    }

    public final void setGradientBgEndFromXml(View view) {
        this.gradientBgEndFromXml = view;
    }

    public final void setGradientBgStartFromXml(View view) {
        this.gradientBgStartFromXml = view;
    }

    public final void setHorizontalFlingListener(Function1<? super Integer, Unit> function1) {
        getScrollContainerFromXml().setHorizontalFlingListener(function1);
    }

    public final void setIgnoreMaskFromXml(View view) {
        this.ignoreMaskFromXml = view;
    }

    public final void setInnerListener(InterfaceC368580Eci interfaceC368580Eci) {
        this.innerListener = interfaceC368580Eci;
    }

    public final void setIsCoverMode(boolean z) {
        this.isCoverMode = z;
        getMultiTrackFromXml().setIsCoverMode(z);
    }

    public final void setIvAddFromXml(ImageView imageView) {
        this.ivAddFromXml = imageView;
    }

    public final void setIvTimeFromXml(C368140Ec0 c368140Ec0) {
        this.ivTimeFromXml = c368140Ec0;
    }

    public final void setLegacyActionListener(C0E8D c0e8d) {
        this.legacyActionApi = c0e8d;
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            subTrackGroupFromXml.setLegacyActionApi$editor_trackpanel_release(c0e8d);
        }
    }

    public final void setMobEvent(C0E8Y c0e8y) {
        this.mobEvent = c0e8y;
    }

    public final void setMultiTrackAdapter(C367970Ebj c367970Ebj) {
        this.multiTrackAdapter = c367970Ebj;
    }

    public final void setMultiTrackFromXml(C368010Ebn c368010Ebn) {
        this.multiTrackFromXml = c368010Ebn;
    }

    public final void setMusicTinyScrollerFromXml(C368740Ecy c368740Ecy) {
        this.musicTinyScrollerFromXml = c368740Ecy;
    }

    public final void setMusicTinySnapViewFromXml(C367130EaN c367130EaN) {
        this.musicTinySnapViewFromXml = c367130EaN;
    }

    public final void setMuteEnable(boolean z) {
        float f;
        TuxIconView tvMuteFromXml = getTvMuteFromXml();
        if (tvMuteFromXml != null) {
            tvMuteFromXml.setEnabled(z);
        }
        TuxIconView tvMuteFromXml2 = getTvMuteFromXml();
        if (tvMuteFromXml2 != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C786410Ut5.x5(tvMuteFromXml2, f);
        }
    }

    public final void setMuteState(boolean z) {
        Drawable drawable;
        String string;
        TuxIconView tvMuteFromXml;
        if (z) {
            drawable = this.disableOriginalVoiceIcon;
        } else {
            drawable = this.enableOriginalVoiceIcon;
            if (drawable == null) {
                return;
            }
        }
        TuxIconView tvMuteFromXml2 = getTvMuteFromXml();
        if (tvMuteFromXml2 != null) {
            tvMuteFromXml2.setImageDrawable(drawable);
        }
        if (z) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131824469);
            } else {
                return;
            }
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                return;
            } else {
                string = context2.getString(2131824468);
            }
        }
        if (string != null && (tvMuteFromXml = getTvMuteFromXml()) != null) {
            tvMuteFromXml.setContentDescription(string);
        }
    }

    public final void setOnAiExtendFrameBecameVisible(Function0<Unit> function0) {
        this.onAiExtendFrameBecameVisible = function0;
    }

    public final void setOnClickNullAudioTrack(Function1<? super View, Unit> function1) {
        getSubTrackGroupFromXml().setOnClickNullAudioTrack(function1);
    }

    public final void setOnClickNullEffectTrack(Function1<? super View, Unit> function1) {
        getSubTrackGroupFromXml().setOnClickNullEffectTrack(function1);
    }

    public final void setOnDropClick(Function1<? super String, Unit> function1) {
        this.onDropClick = function1;
    }

    public final void setOnFingerAndTrackStop(Function0<Unit> function0) {
        this.onFingerAndTrackStop = function0;
    }

    public final void setOnShouldInterceptSlotClickEvent(Function2<? super NLETrackSlot, ? super View, Boolean> function2) {
        getSubTrackGroupFromXml().setOnShouldInterceptSlotClickEvent(function2);
    }

    @InterfaceC1294060jmO
    public final void setPipDropVisibility(boolean z) {
        if (z) {
            C368060Ebs c368060Ebs = this.dropTrack;
            if (c368060Ebs != null) {
                c368060Ebs.setDropGroupVisibility(0);
            }
            C368060Ebs c368060Ebs2 = this.dropTrack;
            if (c368060Ebs2 != null) {
                c368060Ebs2.setPipTrackVisibility(0);
                return;
            }
            return;
        }
        C368060Ebs c368060Ebs3 = this.dropTrack;
        if (c368060Ebs3 != null) {
            c368060Ebs3.setDropGroupVisibility(8);
        }
        C368060Ebs c368060Ebs4 = this.dropTrack;
        if (c368060Ebs4 == null) {
            return;
        }
        c368060Ebs4.setPipTrackVisibility(8);
    }

    public final void setPlayHeadLength(int i) {
        if (i < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getIvTimeFromXml().getLayoutParams();
        layoutParams.height = i;
        C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ivTimeFromXml);
        ivTimeFromXml.setLayoutParams(layoutParams);
    }

    public final void setScrollContainerFromXml(C368680Ecs c368680Ecs) {
        this.scrollContainerFromXml = c368680Ecs;
    }

    public final void setShowSubTrackIcon(boolean z) {
        this.showSubTrackIcon = z;
        getSubTrackGroupFromXml().invalidate();
    }

    public final void setStickerTinyScrollerFromXml(C368740Ecy c368740Ecy) {
        this.stickerTinyScrollerFromXml = c368740Ecy;
    }

    public final void setStickerTinySnapViewFromXml(C367130EaN c367130EaN) {
        this.stickerTinySnapViewFromXml = c367130EaN;
    }

    public final void setStubDropTrackFromXml(ViewStub viewStub) {
        this.stubDropTrackFromXml = viewStub;
    }

    public final void setSubTrackGroupFromXml(C368630Ecn c368630Ecn) {
        this.subTrackGroupFromXml = c368630Ecn;
    }

    public final void setSubTrackGroupRecording(boolean z) {
        int scrollY;
        int maxScrollY;
        getSubTrackGroupFromXml().setRecordingAudio$editor_trackpanel_release(z);
        if (!z && (scrollY = getSubTrackGroupFromXml().getScrollY()) > (maxScrollY = getSubTrackGroupFromXml().getMaxScrollY())) {
            getSubTrackGroupFromXml().LJIILL(scrollY - maxScrollY);
        }
    }

    public final void setSubTrackSelectState(C0E75 c0e75) {
        this.selectState = c0e75;
        if (c0e75.LIZIZ == null || c0e75.LIZJ == null || c0e75.LIZ) {
            getSubTrackGroupFromXml().LJIIJJI(false);
        } else {
            C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
            NLETrackSlot nLETrackSlot = c0e75.LIZJ;
            C0E6E c0e6e = c0e75.LJ;
            int i = C368630Ecn.LLLLJI;
            subTrackGroupFromXml.LJIILIIL(nLETrackSlot, c0e6e);
        }
        Boolean bool = c0e75.LJIIJ;
        if (bool != null) {
            setShowSubTrackIcon(bool.booleanValue());
        }
    }

    public final void setTextTinyScrollerFromXml(C368740Ecy c368740Ecy) {
        this.textTinyScrollerFromXml = c368740Ecy;
    }

    public final void setTextTinySnapViewFromXml(C367130EaN c367130EaN) {
        this.textTinySnapViewFromXml = c367130EaN;
    }

    public final void setTimeContainerStubFromXml(ViewStub viewStub) {
        this.timeContainerStubFromXml = viewStub;
    }

    public final void setTimeRulerFromXml(C368920EdG c368920EdG) {
        this.timeRulerFromXml = c368920EdG;
    }

    public final void setTimeRulerScrollerFromXml(C368850Ed9 c368850Ed9) {
        this.timeRulerScrollerFromXml = c368850Ed9;
    }

    public final void setTrackDragEventListener(InterfaceC369050EdT interfaceC369050EdT) {
        getSubTrackGroupFromXml().setTrackDragEventListener$editor_trackpanel_release(interfaceC369050EdT);
    }

    public final void setTrackKeyframeListener(InterfaceC368620Ecm interfaceC368620Ecm) {
        C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
        if (multiTrackFromXml != null) {
            multiTrackFromXml.setKeyframeListener(interfaceC368620Ecm);
        }
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            subTrackGroupFromXml.setKeyframeListener(interfaceC368620Ecm);
        }
        this.keyframeListener = interfaceC368620Ecm;
    }

    public final void setTrackPaints(C0ELG c0elg) {
        C368920EdG timeRulerFromXml = getTimeRulerFromXml();
        if (timeRulerFromXml != null) {
            timeRulerFromXml.setTimeLinePaint(c0elg.LIZ);
        }
        getMultiTrackAdapter().LJJIFFI.LJJIL = c0elg.LJI;
        getMultiTrackAdapter().LJIJJLI.LJIIZILJ = c0elg.LJI;
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml != null) {
            subTrackGroupFromXml.setAudioCollectionWavePainter$editor_trackpanel_release(c0elg.LJI);
        }
        getMultiTrackAdapter().LJIJI = c0elg.LIZJ;
        C368630Ecn subTrackGroupFromXml2 = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml2 != null) {
            subTrackGroupFromXml2.setNullAudioTrackPainter(c0elg.LIZLLL);
        }
        C368630Ecn subTrackGroupFromXml3 = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml3 != null) {
            subTrackGroupFromXml3.setNullEffectTrackPainter(c0elg.LJ);
        }
        C368630Ecn subTrackGroupFromXml4 = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml4 != null) {
            subTrackGroupFromXml4.setAudioCollectionLabelPainter$editor_trackpanel_release(c0elg.LJFF);
        }
        C368630Ecn subTrackGroupFromXml5 = getSubTrackGroupFromXml();
        if (subTrackGroupFromXml5 != null) {
            subTrackGroupFromXml5.setAudioCollectionCalStrategy$editor_trackpanel_release(AFwS234S0000000_5.get$arr$(392));
        }
    }

    public final void setTrackPanelActionListener(TrackPanelActionListener trackPanelActionListener) {
        this.trackPanelActionListener = trackPanelActionListener;
    }

    public final void setTvMuteFromXml(TuxIconView tuxIconView) {
        this.tvMuteFromXml = tuxIconView;
    }

    public final void switchUIState(C359620E8a c359620E8a) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        boolean z;
        int visibility;
        int visibility2;
        boolean z2;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = getFrameScrollerFromXml().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        if (c359620E8a.LIZ != TrackShowType.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        subTrackGroupFromXml.setEnableDrag$editor_trackpanel_release(z);
        if (c359620E8a.LIZIZ != this.curSubTrackShowType.LIZIZ) {
            this.firstAnim.removeAllUpdateListeners();
            this.firstAnim.removeAllListeners();
            if (c359620E8a.LJI) {
                this.firstAnim.setFloatValues(C814420VxA.LIZIZ(i / Resources.getSystem().getDisplayMetrics().density), c359620E8a.LIZIZ);
                this.firstAnim.addUpdateListener(new AUListenerS255S0100000_5(this, 19));
                this.firstAnim.start();
            } else {
                changeTopMargin(getFrameScrollerFromXml(), Float.valueOf(c359620E8a.LIZIZ));
            }
        }
        TrackShowType trackShowType = c359620E8a.LIZ;
        TrackShowType trackShowType2 = TrackShowType.PIP;
        if (trackShowType == trackShowType2 && this.curSubTrackShowType.LIZ != trackShowType2) {
            showPipTrackAnim(C0FU0.LIZ(c359620E8a.LIZLLL) + getFrameScrollerFromXml().getHeight() + C0FU0.LIZ(c359620E8a.LIZJ), C0FU0.LIZ(c359620E8a.LIZIZ) - i);
        } else {
            C359620E8a c359620E8a2 = this.curSubTrackShowType;
            if (c359620E8a2.LIZ == trackShowType2 && trackShowType != trackShowType2) {
                if (c359620E8a2.LJII) {
                    InterfaceC368580Eci interfaceC368580Eci = this.innerListener;
                    if (interfaceC368580Eci != null) {
                        interfaceC368580Eci.LIZLLL();
                    }
                } else {
                    hidePipTrackAnim(C0FU0.LIZ(c359620E8a.LIZLLL) + getFrameScrollerFromXml().getHeight() + C0FU0.LIZ(c359620E8a.LIZJ), C0FU0.LIZ(c359620E8a.LIZIZ) - i);
                }
            }
        }
        if (this.enableTinyScroller) {
            C368060Ebs c368060Ebs = this.dropTrack;
            if (c368060Ebs != null) {
                changeBottomMargin(c368060Ebs, c359620E8a.LIZLLL);
            }
            setDropVisibility(c359620E8a.LIZ);
        } else {
            C368060Ebs c368060Ebs2 = this.dropTrack;
            if (c368060Ebs2 != null) {
                c368060Ebs2.setDropGroupVisibility(8);
            }
            C368060Ebs c368060Ebs3 = this.dropTrack;
            if (c368060Ebs3 != null) {
                c368060Ebs3.setPipTrackVisibility(8);
            }
        }
        changeTopMargin(getSubTrackGroupFromXml(), Float.valueOf(c359620E8a.LIZJ));
        if (this.enableTinyScroller) {
            if (this.enableEffectTinyScroller) {
                changeBottomMargin(getEffectTinyScrollerFromXml(), c359620E8a.LJFF);
            }
            if (this.enableStickerTinyScroller) {
                changeBottomMargin(getStickerTinyScrollerFromXml(), c359620E8a.LJ);
            }
            C786410Ut5.M1(getTextTinyScrollerFromXml(), 0);
            C368740Ecy effectTinyScrollerFromXml = getEffectTinyScrollerFromXml();
            if (this.enableEffectTinyScroller) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.M1(effectTinyScrollerFromXml, i2);
            C368740Ecy stickerTinyScrollerFromXml = getStickerTinyScrollerFromXml();
            if (this.enableStickerTinyScroller) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.M1(stickerTinyScrollerFromXml, i3);
            C786410Ut5.M1(getMusicTinyScrollerFromXml(), 0);
            switch (C0E7L.LIZ[c359620E8a.LIZ.ordinal()]) {
                case 1:
                case 2:
                    C786410Ut5.M1(getTextTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getStickerTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getEffectTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getMusicTinyScrollerFromXml(), 8);
                    break;
                case 3:
                case 4:
                case 5:
                    C786410Ut5.M1(getMusicTinyScrollerFromXml(), 8);
                    break;
                case 6:
                    C786410Ut5.M1(getStickerTinyScrollerFromXml(), 8);
                    break;
                case 7:
                    C786410Ut5.M1(getTextTinyScrollerFromXml(), 8);
                    break;
                case 8:
                    C786410Ut5.M1(getEffectTinyScrollerFromXml(), 8);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C786410Ut5.M1(getTextTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getStickerTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getEffectTinyScrollerFromXml(), 8);
                    C786410Ut5.M1(getMusicTinyScrollerFromXml(), 8);
                    break;
                default:
                    throw new C1954807lC();
            }
        } else {
            C786410Ut5.M1(getMusicTinyScrollerFromXml(), 8);
            C786410Ut5.M1(getTextTinyScrollerFromXml(), 8);
            C786410Ut5.M1(getEffectTinyScrollerFromXml(), 8);
            C786410Ut5.M1(getStickerTinyScrollerFromXml(), 8);
        }
        if (c359620E8a.LIZ == TrackShowType.AUDIORECORD) {
            getSubTrackGroupFromXml().setScrollY(0);
        }
        this.curSubTrackShowType = c359620E8a;
        C368630Ecn subTrackGroupFromXml2 = getSubTrackGroupFromXml();
        TrackShowType trackShowType3 = c359620E8a.LIZ;
        subTrackGroupFromXml2.LLLIIL = trackShowType3;
        for (Map.Entry entry : ((LinkedHashMap) subTrackGroupFromXml2.LLLI).entrySet()) {
            entry.getKey();
            InterfaceC368720Ecw interfaceC368720Ecw = ((C369110EdZ) entry.getValue()).LIZIZ;
            if (interfaceC368720Ecw instanceof C367650EbD) {
                C367610Eb9 c367610Eb9 = ((C367650EbD) interfaceC368720Ecw).LLILLL;
                if (trackShowType3 == TrackShowType.NORMAL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c367610Eb9.setCurrentInRootState(z2);
            }
        }
        Map<String, Integer> map = this.subTrackStateBeforeSort;
        C368740Ecy musicTinyScrollerFromXml = getMusicTinyScrollerFromXml();
        int visibility3 = 4;
        if (musicTinyScrollerFromXml != null) {
            visibility = musicTinyScrollerFromXml.getVisibility();
        } else {
            visibility = 4;
        }
        map.put("music_tiny_key", Integer.valueOf(visibility));
        Map<String, Integer> map2 = this.subTrackStateBeforeSort;
        C368740Ecy textTinyScrollerFromXml = getTextTinyScrollerFromXml();
        if (textTinyScrollerFromXml != null) {
            visibility2 = textTinyScrollerFromXml.getVisibility();
        } else {
            visibility2 = 4;
        }
        map2.put("text_tiny_key", Integer.valueOf(visibility2));
        Map<String, Integer> map3 = this.subTrackStateBeforeSort;
        C368740Ecy effectTinyScrollerFromXml2 = getEffectTinyScrollerFromXml();
        if (effectTinyScrollerFromXml2 != null) {
            visibility3 = effectTinyScrollerFromXml2.getVisibility();
        }
        map3.put("effect_tiny_key", Integer.valueOf(visibility3));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tryRefreshLimitBg(long r11) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368000Ebm.tryRefreshLimitBg(long):void");
    }

    public final void updateRecordWavePoint(List<Float> list) {
        C368020Ebo c368020Ebo = getMultiTrackAdapter().LJJIFFI;
        c368020Ebo.LJJJI = list;
        c368020Ebo.LJIIZILJ = list.size() * 30 * c368020Ebo.LJIIIZ();
    }

    public C368000Ebm(Context context, C19EG c19eg) {
        this(context, c19eg, null, 0);
    }

    private final void hidePipTrackAnim(float f, int i) {
        float height = C368080Ebu.LLILZLL / getSubTrackGroupFromXml().getHeight();
        float height2 = (getHeight() - getFrameScrollerFromXml().getBottom()) - i;
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        C368150Ec1 c368150Ec1 = new C368150Ec1(subTrackGroupFromXml);
        c368150Ec1.LJ = height;
        c368150Ec1.LIZJ = -(f + ((height2 - (height2 * height)) / 2));
        c368150Ec1.LJI = 342L;
        c368150Ec1.LJIIIIZZ = new InterpolatorC366870EZx();
        c368150Ec1.LJIIIZ = new ALAdapterS2S0200000_5(subTrackGroupFromXml, this, 10);
        c368150Ec1.LIZ();
    }

    private final void showPipTrackAnim(float f, int i) {
        if (getSubTrackGroupFromXml().getHeight() <= 0) {
            return;
        }
        float height = C368080Ebu.LLILZLL / getSubTrackGroupFromXml().getHeight();
        float height2 = (getHeight() - getFrameScrollerFromXml().getBottom()) - i;
        float f2 = f + ((height2 - (height * height2)) / 2);
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        C368630Ecn subTrackGroupFromXml2 = subTrackGroupFromXml.getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml2);
        subTrackGroupFromXml2.setTranslationY(-f2);
        C368630Ecn subTrackGroupFromXml3 = subTrackGroupFromXml.getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml3);
        subTrackGroupFromXml3.setScaleY(0.0f);
        C368150Ec1 c368150Ec1 = new C368150Ec1(subTrackGroupFromXml);
        c368150Ec1.LIZJ = 0.0f;
        c368150Ec1.LJI = 342L;
        c368150Ec1.LJIIIIZZ = new InterpolatorC366870EZx();
        c368150Ec1.LJIIIZ = new ALAdapterS2S0100000_5(subTrackGroupFromXml, 15);
        c368150Ec1.LIZ();
    }

    public final void changeBottomMargin(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != C0FU0.LIZ(f)) {
            marginLayoutParams.bottomMargin = C0FU0.LIZ(f);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void changeTopMargin(View view, Float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (f != null) {
            f.floatValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != C0FU0.LIZ(f.floatValue())) {
                marginLayoutParams.topMargin = C0FU0.LIZ(f.floatValue());
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    public final void changeTopPadding(View view, int i) {
        C369030EdR.LIZJ(view, 0, C0FU0.LIZ(i), 0, 0);
    }

    public final void hideOrShowAnimMask(boolean z, boolean z2) {
        C368210Ec7 animMaskFromXml;
        Boolean bool;
        if (z2) {
            C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
            Boolean boolValueOf = Boolean.valueOf(z);
            C368220Ec8 c368220Ec8 = (C368220Ec8) C13LP.LJJJLZIJ(multiTrackFromXml.LLJJ, multiTrackFromXml.LLILLJJLI);
            if (c368220Ec8 != null && (animMaskFromXml = c368220Ec8.getAnimMaskFromXml()) != null) {
                if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                    C368610Ecl.LIZ(animMaskFromXml);
                    return;
                }
                if (animMaskFromXml.getVisibility() != 0) {
                    C368610Ecl.LIZJ(animMaskFromXml);
                    Object tag = animMaskFromXml.getTag(animMaskFromXml.LLILZ);
                    if (tag instanceof Boolean) {
                        bool = (Boolean) tag;
                    } else {
                        bool = null;
                    }
                    if (bool != null && bool.booleanValue()) {
                        animMaskFromXml.animate().cancel();
                    }
                    animMaskFromXml.setTag(animMaskFromXml.LLILZ, Boolean.TRUE);
                    C786410Ut5.T4(animMaskFromXml, 0.0f);
                    C786410Ut5.LJLLLLLL(0, animMaskFromXml);
                    animMaskFromXml.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new ARunnableS74S0200000_5(animMaskFromXml, animMaskFromXml, 47)).start();
                }
                if (animMaskFromXml.LLILLJJLI != C0E6E.LINE) {
                    return;
                }
                animMaskFromXml.invalidate();
                return;
            }
            return;
        }
        getSubTrackGroupFromXml().invalidate();
    }

    public final void setActive(boolean z, boolean z2) {
        this.isActive = z;
        if (!z && z2) {
            C368680Ecs.e0(getScrollContainerFromXml(), 0, false, false, 6);
        }
    }

    public final void setPlayHeadWidth(float f, float f2) {
        C368140Ec0 ivTimeFromXml = getIvTimeFromXml();
        ivTimeFromXml.setPlayHeadWidth(f);
        ivTimeFromXml.setGapWidth(f2);
        ivTimeFromXml.invalidate();
    }

    public final void setStickPoint(List<Long> list, Integer num) {
        getMultiTrackAdapter().getClass();
        ((ArrayList) getMultiTrackAdapter().LJJII).clear();
        ((ArrayList) getMultiTrackAdapter().LJJII).addAll(list);
        C367970Ebj multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.LJIIZILJ(multiTrackAdapter.LJIIZILJ, null);
    }

    public final void setTimeState(long j, long j2) {
        C368920EdG timeRulerFromXml = getTimeRulerFromXml();
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j / j3;
        timeRulerFromXml.setDurationTime(j4);
        C368460EcW blackSlotHint = getBlackSlotHint();
        long j5 = j2 / j3;
        blackSlotHint.LIZLLL = j5;
        blackSlotHint.LIZJ = j4;
        getScrollContainerFromXml().i0(j4);
        C368630Ecn subTrackGroupFromXml = getSubTrackGroupFromXml();
        subTrackGroupFromXml.LLLIIII = j4;
        subTrackGroupFromXml.LLLII = j5;
        subTrackGroupFromXml.requestLayout();
        if (this.timestamp > j4) {
            updatePlayState(new PlayPositionState(j, false, false), false, false);
        }
    }

    public final void showKeyFramePoints(boolean z, boolean z2) {
        if (z2) {
            C368010Ebn multiTrackFromXml = getMultiTrackFromXml();
            Boolean boolValueOf = Boolean.valueOf(z);
            C368220Ec8 c368220Ec8 = (C368220Ec8) C13LP.LJJJLZIJ(multiTrackFromXml.LLJJ, multiTrackFromXml.LLILLJJLI);
            if (c368220Ec8 != null) {
                if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                    C368610Ecl.LIZIZ(c368220Ec8.LLLIIIIL);
                    return;
                } else {
                    c368220Ec8.LLLIIIIL.LIZIZ(c368220Ec8.LLJILJILJ);
                    return;
                }
            }
            return;
        }
        setShowSubTrackIcon(z);
    }

    public final void updateScale(float f, boolean z) {
        C354270Duj.LIZJ(0L, new C368120Eby(this, f, z));
    }

    public C368000Ebm(Context context, C19EG c19eg, AttributeSet attributeSet) {
        this(context, c19eg, attributeSet, 0);
    }

    public final void setDropTrack(List<C350030Dnt> list, InterfaceC369210Edj interfaceC369210Edj, long j) {
        if (this.dropTrack == null) {
            initDropTrack(j);
        }
        C368060Ebs c368060Ebs = this.dropTrack;
        if (c368060Ebs != null) {
            c368060Ebs.LLILLL = list;
            C368420EcS c368420EcS = c368060Ebs.LL;
            c368420EcS.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368420EcS, null);
            c368420EcS.removeAllViews();
            c368420EcS.LLILLJJLI = list;
            c368420EcS.LLILLL.clear();
            ((ArrayList) c368420EcS.LL).clear();
            for (C350030Dnt c350030Dnt : c368420EcS.LLILLJJLI) {
                if (c350030Dnt.LIZJ == NLETrackType.VIDEO) {
                    for (NLETrackSlot nLETrackSlot : c350030Dnt.LIZLLL) {
                        C368690Ect c368690Ect = new C368690Ect(c368420EcS.getContext(), c350030Dnt.LIZ, nLETrackSlot, interfaceC369210Edj, c368420EcS.LLIZLLLIL);
                        ((ArrayList) c368420EcS.LL).add(c368690Ect);
                        int startTime = (int) (nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        final SparseArray<List<C368690Ect>> sparseArray = c368420EcS.LLILLL;
                        AbstractC2098408Jy abstractC2098408Jy = new AbstractC2098408Jy() { // from class: X.0Ecc
                            public int LL;

                            @Override // java.util.Iterator
                            public final boolean hasNext() {
                                return this.LL < sparseArray.size();
                            }

                            @Override // X.AbstractC2098408Jy
                            public final int nextInt() {
                                SparseArray<Object> sparseArray2 = sparseArray;
                                int i = this.LL;
                                this.LL = i + 1;
                                return sparseArray2.keyAt(i);
                            }
                        };
                        while (true) {
                            if (!abstractC2098408Jy.hasNext()) {
                                break;
                            }
                            int iNextInt = abstractC2098408Jy.nextInt();
                            if (Math.abs(iNextInt - startTime) <= c368420EcS.LLIZ) {
                                startTime = iNextInt;
                                break;
                            }
                        }
                        List<C368690Ect> arrayList = c368420EcS.LLILLL.get(startTime);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            c368420EcS.LLILLL.put(startTime, arrayList);
                        }
                        arrayList.add(c368690Ect);
                        c368420EcS.addView(c368690Ect.LIZ(), new FrameLayout.LayoutParams(C368690Ect.LJIIJ, C368690Ect.LJIIJJI));
                    }
                }
            }
            c368060Ebs.LLILLJJLI.setTrackList(list);
            c368060Ebs.requestLayout();
        }
    }

    public final void updatePlayState(PlayPositionState playPositionState, boolean z, boolean z2) {
        if (!this.isActive) {
            return;
        }
        C354270Duj.LIZJ(0L, new C368100Ebw(this, playPositionState, z2, z));
    }

    public C368000Ebm(Context context, C19EG c19eg, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.activity = c19eg;
        C0EHM.LIZ = C786410Ut5.N3(context);
        this.TAG = "TrackPanel";
        this.isActive = true;
        this.isAddBtnVisible = true;
        this.scale = 1.0d;
        this.selectState = new C0E75(false, null, null, null, null, null, false, false, false, false, null, false, 4094);
        this.curSubTrackShowType = new C359620E8a(TrackShowType.NORMAL, 0.0f, 0.0f, 0.0f, 0.0f, 1984);
        this.subTrackStateBeforeSort = new LinkedHashMap();
        this.customUIState = new C359480E7m(false, 4194303);
        this.isRTL$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(context, 964));
        this.isNewSubTrackHeight$delegate = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(279));
        C368160Ec2 c368160Ec2 = new C368160Ec2();
        c368160Ec2.setInterpolator(new InterpolatorC366870EZx());
        c368160Ec2.setDuration(342L);
        this.firstAnim = c368160Ec2;
        this.enableTinyScroller = true;
        this.enableEffectTinyScroller = true;
        this.blackSlotHint$delegate = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(278));
        this.showSubTrackIcon = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a6  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSubTrackState(com.bytedance.ies.nle.editor_jni.NLEModel r24, java.util.List<X.C350030Dnt> r25, com.bytedance.ies.nle.editor_jni.NLETrackSlot r26, com.ss.ugc.android.editor.track.TrackShowType r27) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368000Ebm.setSubTrackState(com.bytedance.ies.nle.editor_jni.NLEModel, java.util.List, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.ss.ugc.android.editor.track.TrackShowType):void");
    }
}
