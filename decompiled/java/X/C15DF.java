package X;

import Y.AAListenerS262S0200000_7;
import Y.AAListenerS327S0100000_16;
import Y.ALAdapterS1S0000000_16;
import Y.ALAdapterS25S0100000_31;
import Y.ALAdapterS25S0200000_31;
import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS13S0201000_6;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS76S0200000_7;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS278S0100000_31;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.CanPlayRevealAnimationChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaAnimationTimingSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaThreadLogicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFixProgressAnimation;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchProgressBarScaleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMetaMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15DF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DF extends FrameLayout {
    public static final /* synthetic */ int LLLLLZ = 0;
    public C1324720kZq LL;
    public C1324720kZq LLILLJJLI;
    public C1324720kZq LLILLL;
    public ConstraintLayout LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C1324720kZq LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public C1142950fqf LLJI;
    public final TuxTextView LLJIJIL;
    public final C1324720kZq LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public C15DA LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C985820blE LLJJJJ;
    public boolean LLJJJJJIL;
    public DataChannel LLJJJJLIIL;
    public final C1324720kZq LLJJL;
    public final C1324720kZq LLJJLIIIJLLLLLLLZ;
    public final C1143100fqu LLJL;
    public final View LLJLIL;
    public final View LLJLILLLLZIIL;
    public final View LLJLL;
    public final TextureViewSurfaceTextureListenerC1288630jdd LLJLLIL;
    public final TuxTextView LLJLLL;
    public final TuxTextView LLJZ;
    public final TuxTextView LLJZIJLIL;
    public final TuxTextView LLL;
    public final ConstraintLayout LLLF;
    public final TextureViewSurfaceTextureListenerC1288630jdd LLLFF;
    public final TextureViewSurfaceTextureListenerC1288630jdd LLLFFI;
    public final TextureViewSurfaceTextureListenerC1288630jdd LLLFZ;
    public final ConstraintLayout LLLI;
    public final ConstraintLayout LLLII;
    public final ConstraintLayout LLLIIII;
    public final ConstraintLayout LLLIIIIL;
    public final boolean[] LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C15DM LLLJ;
    public C15DJ LLLJIL;
    public boolean LLLJL;
    public AnimatorSet LLLL;
    public final PathInterpolator LLLLII;
    public ObjectAnimator LLLLIIIILLL;
    public final PathInterpolator LLLLIIL;
    public final long LLLLIILL;
    public final C1324720kZq LLLLIILLL;
    public final C1324720kZq LLLLIL;
    public final C1324720kZq LLLLILI;
    public final C1324720kZq LLLLJ;
    public final TuxTextView LLLLJI;
    public final TuxTextView LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public boolean LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public long LLLLLLIL;
    public ObjectAnimator LLLLLLJ;
    public int LLLLLLL;
    public C1324720kZq LLLLLLLLL;
    public AnimatorSet LLLLLLLLLL;
    public float LLLLLLLZIL;
    public Gift LLLLLLZ;
    public final C15DK LLLLLLZZ;

    public final void LJIJJLI() {
        for (C1324720kZq c1324720kZq : C1697810uHb.LJIIJJI(this.LLLLIILLL, this.LLLLIL, this.LLLLILI, this.LLLLJ)) {
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
                C786410Ut5.h5(c1324720kZq, 1.0f);
                C786410Ut5.Qc(c1324720kZq, 0.0f);
            }
        }
        TuxTextView tuxTextView = this.LLLLJI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C786410Ut5.B5(tuxTextView, 0.0f);
        }
        TuxTextView tuxTextView2 = this.LLLLL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            C786410Ut5.B5(tuxTextView2, 0.0f);
        }
    }

    public final void LIZIZ() {
        if (this.LLLILZ) {
            return;
        }
        this.LLLIL = true;
        this.LLLILZ = true;
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 17);
        LiveMatchEnigmaAnimationTimingSettings liveMatchEnigmaAnimationTimingSettings = LiveMatchEnigmaAnimationTimingSettings.INSTANCE;
        HandlerHook.viewPostDelay(this, aRunnableS131S0100000_31, liveMatchEnigmaAnimationTimingSettings.getEnigmaPulseAnimationDelay());
        HandlerHook.viewPostDelay(this, new ARunnableS106S0100000_6((Object) this, 20), liveMatchEnigmaAnimationTimingSettings.getEnigmaFirstShowAnimationDelay());
        HandlerHook.viewPostDelay(this, new ARunnableS106S0100000_6((Object) this, 21), 3000L);
    }

    public final void LJI() {
        if (this.LLJJJ) {
            this.LLJJJ = false;
            FrameLayout matchItemFlashContainerFromXml = getMatchItemFlashContainerFromXml();
            if (matchItemFlashContainerFromXml != null) {
                C786410Ut5.LJZ(8, matchItemFlashContainerFromXml);
            }
            FrameLayout matchItemFlashContainerFromXml2 = getMatchItemFlashContainerFromXml();
            if (matchItemFlashContainerFromXml2 != null) {
                C786410Ut5.LJJJJIZL(matchItemFlashContainerFromXml2);
            }
            this.LLLLLLL = 0;
            FrameLayout waveAnimationContainerFromXml = getWaveAnimationContainerFromXml();
            if (waveAnimationContainerFromXml != null) {
                C786410Ut5.LJZ(8, waveAnimationContainerFromXml);
            }
            AnimatorSet animatorSet = this.LLLLLLLLLL;
            if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null)) {
                AnimatorSet animatorSet2 = this.LLLLLLLLLL;
                if (animatorSet2 != null) {
                    animatorSet2.end();
                }
                FrameLayout waveAnimationContainerFromXml2 = getWaveAnimationContainerFromXml();
                if (waveAnimationContainerFromXml2 != null) {
                    C786410Ut5.LJJJJIZL(waveAnimationContainerFromXml2);
                }
            }
            DataChannel dataChannel = this.LLJJJJLIIL;
            Object objGg0 = dataChannel != null ? dataChannel.gg0(BattleStateChannel.class) : null;
            this.LLJJIII = C15DA.STAND_BY;
            if ((objGg0 != EnumC964170bCJ.SETTLE_START && objGg0 != EnumC964170bCJ.PUNISH_START) || this.LLJJ != 0) {
                LJJI();
            } else {
                C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "setEmojiAnim() when boost gloves cleared");
                setEmojiAnim(true);
            }
        }
    }

    public final void LJII() {
        float[] dividerPosition;
        ArrayList arrayList = new ArrayList();
        this.LLLLLLLLLL = new AnimatorSet();
        C1142950fqf c1142950fqf = this.LLJI;
        this.LLLLLLLZIL = (c1142950fqf == null || (dividerPosition = c1142950fqf.getDividerPosition()) == null) ? 0.0f : dividerPosition[1];
        int childCount = getWaveAnimationContainerFromXml().getChildCount();
        for (int i = 0; i < childCount; i++) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getWaveAnimationContainerFromXml().getChildAt(i), (Property<View, Float>) View.TRANSLATION_X, getWidth() * (-1.0f), (getWidth() * (-1.0f)) + this.LLLLLLLZIL);
            objectAnimatorOfFloat.setStartDelay(((long) i) * 500);
            objectAnimatorOfFloat.setDuration(3500L);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setRepeatCount(-1);
            arrayList.add(objectAnimatorOfFloat);
        }
        AnimatorSet animatorSet = this.LLLLLLLLLL;
        if (animatorSet != null) {
            animatorSet.playTogether(arrayList);
        }
        AnimatorSet animatorSet2 = this.LLLLLLLLLL;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(4000L);
        }
        AnimatorSet animatorSet3 = this.LLLLLLLLLL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void LJIILL() {
        C1324720kZq c1324720kZq;
        ImageModel imageModel;
        LinearLayout.LayoutParams layoutParams;
        GiftModeMetaV2 giftModeMetaV2LJJII;
        AnchorGiftModeMetaMap anchorGiftModeMetaMap;
        List<GiftModeMeta> list;
        GiftModeMeta giftModeMeta;
        ImageModel imageModel2;
        List<GiftModeMeta> list2;
        GiftModeMeta giftModeMeta2;
        ImageModel imageModel3;
        Room room;
        User owner;
        LinearLayout.LayoutParams layoutParams2;
        GiftModeMetaV2 giftModeMetaV2LJJII2;
        AnchorGiftModeMetaMap anchorGiftModeMetaMap2;
        C1324720kZq c1324720kZq2 = this.LLJJL;
        if (c1324720kZq2 == null || (c1324720kZq = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        InterfaceC975810bV5 designatedGiftRepo = getDesignatedGiftRepo();
        if (!((designatedGiftRepo == null || (giftModeMetaV2LJJII2 = designatedGiftRepo.LJJII()) == null || (anchorGiftModeMetaMap2 = giftModeMetaV2LJJII2.anchorGiftModeMetaByType.get(2L)) == null || !(anchorGiftModeMetaMap2.anchorGiftModeMetas.isEmpty() ^ true) || !LJIILJJIL()) ? false : true)) {
            ViewGroup.LayoutParams layoutParams3 = c1324720kZq2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof C19ME ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.width = C439101nJ.LIZ(24);
                marginLayoutParams.height = C439101nJ.LIZ(24);
                C786410Ut5.u6(c1324720kZq2, marginLayoutParams);
            }
            ViewGroup.LayoutParams layoutParams4 = c1324720kZq.getLayoutParams();
            if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.width = C439101nJ.LIZ(24);
                layoutParams.height = C439101nJ.LIZ(24);
                C786410Ut5.u6(c1324720kZq, layoutParams);
            }
            c1324720kZq2.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.eix));
            c1324720kZq.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.eiv));
            GiftMode giftModeLJFF = C978520bZS.LJFF();
            if (giftModeLJFF == null || (imageModel = giftModeLJFF.giftIconImage) == null) {
                return;
            }
            C0JSS.LIZLLL(c1324720kZq2, imageModel);
            C0JSS.LIZLLL(c1324720kZq, imageModel);
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = c1324720kZq2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams5 instanceof C19ME ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.width = C439101nJ.LIZ(30);
            marginLayoutParams2.height = C439101nJ.LIZ(30);
            C786410Ut5.u6(c1324720kZq2, marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams6 = c1324720kZq.getLayoutParams();
        if ((layoutParams6 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams6) != null) {
            layoutParams2.width = C439101nJ.LIZ(30);
            layoutParams2.height = C439101nJ.LIZ(30);
        }
        DataChannel dataChannel = this.LLJJJJLIIL;
        long id = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) ? 0L : owner.getId();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue != id && jLongValue != 0) {
                arrayList2.add(obj);
            }
        }
        long jLongValue2 = arrayList2.isEmpty() ^ true ? ((Number) ListProtector.get(arrayList2, 0)).longValue() : 0L;
        InterfaceC975810bV5 designatedGiftRepo2 = getDesignatedGiftRepo();
        if (designatedGiftRepo2 == null || (giftModeMetaV2LJJII = designatedGiftRepo2.LJJII()) == null || (anchorGiftModeMetaMap = giftModeMetaV2LJJII.anchorGiftModeMetaByType.get(2L)) == null) {
            return;
        }
        GiftModeMetaList giftModeMetaList = anchorGiftModeMetaMap.anchorGiftModeMetas.get(Long.valueOf(id));
        if (giftModeMetaList != null && (list2 = giftModeMetaList.giftModeMeta) != null && (giftModeMeta2 = (GiftModeMeta) C13LP.LJJJLZIJ(0, list2)) != null && (imageModel3 = giftModeMeta2.giftIconImage) != null) {
            c1324720kZq2.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.e2v));
            C0JSS.LIZLLL(c1324720kZq2, imageModel3);
        }
        if (jLongValue2 == 0) {
            Set<Long> setKeySet = anchorGiftModeMetaMap.anchorGiftModeMetas.keySet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : setKeySet) {
                long jLongValue3 = ((Number) obj2).longValue();
                if (jLongValue3 != id && jLongValue3 != 0) {
                    arrayList3.add(obj2);
                }
            }
            Long l = (Long) C13LP.LJJJLL(arrayList3);
            jLongValue2 = l != null ? l.longValue() : 0L;
        }
        GiftModeMetaList giftModeMetaList2 = anchorGiftModeMetaMap.anchorGiftModeMetas.get(Long.valueOf(jLongValue2));
        if (giftModeMetaList2 == null || (list = giftModeMetaList2.giftModeMeta) == null || (giftModeMeta = (GiftModeMeta) C13LP.LJJJLZIJ(0, list)) == null || (imageModel2 = giftModeMeta.giftIconImage) == null) {
            return;
        }
        c1324720kZq.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.e2y));
        C0JSS.LIZLLL(c1324720kZq, imageModel2);
    }

    public final void LJIILLIIL() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        c973660bRc.LJJZ(C500260Jjc.LJIIZILJ(this.LLJJJJLIIL));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C1121570fIB c1121570fIB = new C1121570fIB(room != null ? room.getOwner() : null);
        c1121570fIB.LIZJ = "only_gift_pk_mode";
        HashMap map = new HashMap();
        C973660bRc.LJIJ(c973660bRc, map, false, false, false, 12);
        C973660bRc.LJIJI(map);
        c1121570fIB.LJFF = map;
        c1121570fIB.LJIIIZ = C978520bZS.LJ(false);
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public final void LJIJJ() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "score component reset");
        this.LLJJIII = C15DA.STAND_BY;
        C1142950fqf c1142950fqf = this.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.LLJ = -1;
            c1142950fqf.LLILZLL = false;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            int size = (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null) ? 0 : value.size();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reset, teamSize = ");
            sbLIZ.append(size);
            C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
            c1142950fqf.LIZ(-1, size);
            ValueAnimator valueAnimator = c1142950fqf.LLJIJIL;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            c1142950fqf.invalidate();
        }
        this.LLLLLLIL = 25L;
        this.LLLJL = false;
        AnimatorSet animatorSet = this.LLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLL = null;
        LJIJJLI();
        C15DJ c15dj = this.LLLJIL;
        if (c15dj != null) {
            c15dj.LIZ();
        }
        this.LLLLLL = false;
        this.LLLLLJIL = false;
        this.LLLLLIL = -1;
        this.LLLLLILLIL = -1;
        this.LLLLLJLJLL = false;
        C1324720kZq c1324720kZq = this.LLJILJIL;
        if (c1324720kZq != null) {
            C500260Jjc.LJIILIIL(c1324720kZq);
        }
        this.LLJILLL = 0L;
        this.LLJJ = 0L;
        this.LLJJI = 0L;
        this.LLJILJILJ = -1L;
        this.LLJJIJI = 25.0f;
        C1324720kZq matchFirstDividerAnimFromXml = getMatchFirstDividerAnimFromXml();
        if (matchFirstDividerAnimFromXml != null) {
            C500260Jjc.LLFFF(matchFirstDividerAnimFromXml);
        }
        ConstraintLayout llMatchScoreTextFromXml = getLlMatchScoreTextFromXml();
        if (llMatchScoreTextFromXml != null) {
            C500260Jjc.LJIILIIL(llMatchScoreTextFromXml);
        }
        this.LLJJIJIL = false;
        this.LLJJJ = false;
        this.LLJJJIL = false;
        this.LLLILZJ = false;
        this.LLLIL = false;
        this.LLLILZ = false;
        this.LLJJJJ = new C985820blE(false, 0L);
        this.LLJJJJJIL = false;
        ConstraintLayout constraintLayout = this.LLLF;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLLFF;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            textureViewSurfaceTextureListenerC1288630jdd.clearAnimation();
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = this.LLLFFI;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            textureViewSurfaceTextureListenerC1288630jdd2.clearAnimation();
        }
        ConstraintLayout constraintLayout2 = this.LLLF;
        if (constraintLayout2 != null && (layoutParams2 = constraintLayout2.getLayoutParams()) != null && (layoutParams2 instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.gravity = 8388627;
            layoutParams3.setMarginStart(0);
            layoutParams3.setMarginEnd(0);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = this.LLLFZ;
        if (textureViewSurfaceTextureListenerC1288630jdd3 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd3, 8);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd4 = this.LLLFZ;
        if (textureViewSurfaceTextureListenerC1288630jdd4 != null) {
            textureViewSurfaceTextureListenerC1288630jdd4.clearAnimation();
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd5 = this.LLLFZ;
        if (textureViewSurfaceTextureListenerC1288630jdd5 != null && (layoutParams = textureViewSurfaceTextureListenerC1288630jdd5.getLayoutParams()) != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams4.gravity = 8388627;
            layoutParams4.setMarginStart(0);
            layoutParams4.setMarginEnd(0);
        }
        ConstraintLayout constraintLayout3 = this.LLLI;
        if (constraintLayout3 != null) {
            C500260Jjc.LJIILIIL(constraintLayout3);
        }
        ConstraintLayout constraintLayout4 = this.LLLII;
        if (constraintLayout4 != null) {
            C500260Jjc.LJIILIIL(constraintLayout4);
        }
        ConstraintLayout constraintLayout5 = this.LLLIIII;
        if (constraintLayout5 != null) {
            C500260Jjc.LJIILIIL(constraintLayout5);
        }
        ConstraintLayout constraintLayout6 = this.LLLIIIIL;
        if (constraintLayout6 != null) {
            C500260Jjc.LJIILIIL(constraintLayout6);
        }
        boolean[] zArr = this.LLLIIIL;
        Arrays.fill(zArr, 0, zArr.length, false);
        C500260Jjc.LJIILIIL(this.LLJLLIL);
        C500260Jjc.LJIILIIL(this.LLJLLL);
        C500260Jjc.LJIILIIL(this.LLJZ);
        C500260Jjc.LJIILIIL(this.LLJLILLLLZIIL);
        C500260Jjc.LJIILIIL(this.LLJLL);
        TuxTextView tuxTextView = this.LLLLJI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C786410Ut5.B5(tuxTextView, 0.0f);
        }
        TuxTextView tuxTextView2 = this.LLLLL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            C786410Ut5.B5(tuxTextView2, 0.0f);
        }
        C786410Ut5.LL(8, (ConstraintLayout) findViewById(R.id.mjz));
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.zW(CanPlayRevealAnimationChannel.class, Boolean.FALSE);
        }
        ObjectAnimator objectAnimator = this.LLLLLLJ;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
    }

    public final void LJJI() {
        float[] dividerPosition;
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "setNormalGrowthAnimation");
        C20483515Dd.LIZ.LJFF(getMatchEmojiAnimFromXml(), "tiktok_live_match_redesign_resource", "live_battle_score_animation_weak.webp");
        LJIL(66.0f, 36.0f, -3.3f, 4.0f);
        this.LLJJIJI = 66.0f;
        ViewGroup.LayoutParams layoutParams = getMatchEmojiAnimFromXml().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.LLJJIJIIJIL = (int) (((int) C497740JfY.LIZIZ(this.LLJJIJI)) * 0.72f);
        if (marginLayoutParams != null) {
            C1142950fqf c1142950fqf = this.LLJI;
            marginLayoutParams.setMarginStart((int) (((c1142950fqf == null || (dividerPosition = c1142950fqf.getDividerPosition()) == null) ? 0.0f : dividerPosition[1]) - this.LLJJIJIIJIL));
        }
        C786410Ut5.u6(getMatchEmojiAnimFromXml(), marginLayoutParams);
        this.LLJJIII = C15DA.WEAK;
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "animation state = weak");
    }

    public final void LJJIIJ() {
        AnimatorSet animatorSet = this.LLLLLLLLLL;
        if (animatorSet == null || !animatorSet.isRunning()) {
            LJJIFFI(getWaveAnimationContainerFromXml(), false);
            C786410Ut5.LJJJJIZL(getWaveAnimationContainerFromXml());
            int i = 0;
            do {
                View viewSd = C786410Ut5.Sd(R.layout.hs1, C786410Ut5.ne(getContext()), null);
                FrameLayout waveAnimationContainerFromXml = getWaveAnimationContainerFromXml();
                if (waveAnimationContainerFromXml != null) {
                    waveAnimationContainerFromXml.addView(viewSd, new FrameLayout.LayoutParams(-1, -1));
                }
                i++;
            } while (i < 3);
            C1142950fqf c1142950fqf = this.LLJI;
            if (c1142950fqf == null || c1142950fqf.getMeasuredWidth() != 0) {
                LJII();
                return;
            }
            C1142950fqf c1142950fqf2 = this.LLJI;
            if (c1142950fqf2 != null) {
                HandlerHook.viewPost(c1142950fqf2, new ARunnableS131S0100000_31(this, 19));
            }
        }
    }

    public final ConstraintLayout getLlMatchScoreTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nfa);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1324720kZq getMatchEmojiAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o21);
            this.LLIZ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getMatchFirstDividerAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o23);
            this.LL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final FrameLayout getMatchItemFlashContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2f);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getMatchScoreRankNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2u);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1324720kZq getMatchSecondDividerAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2x);
            this.LLILLJJLI = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getMatchThirdDividerAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o32);
            this.LLILLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final TuxTextView getTvRightMatchScoreTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_right_match_score_text);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getWaveAnimationContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wave_animation_container);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIIZI(EnumC970300bMC.MATCH_HEALTH_BAR);
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        AnimatorSet animatorSet = this.LLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLL = null;
        LJIJJLI();
        C15DJ c15dj = this.LLLJIL;
        if (c15dj != null) {
            c15dj.LIZ();
        }
        this.LLLJIL = null;
        ConstraintLayout constraintLayout = this.LLLF;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
            constraintLayout.clearAnimation();
        }
        ObjectAnimator objectAnimator = this.LLLLLLJ;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
    }

    public static int LJIIIZ() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        int i = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        int i2 = -1;
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            if (value.size() < 2) {
                return -1;
            }
            long j = Long.MIN_VALUE;
            for (C976480bWA c976480bWA : value) {
                int i3 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                long j2 = c976480bWA.LIZIZ;
                if (j2 > j) {
                    i2 = i;
                    j = j2;
                }
                i = i3;
            }
        }
        return i2;
    }

    public static boolean LJIILJJIL() {
        return C978520bZS.LJIIJJI() && C970370bMJ.LJIIJ();
    }

    private final InterfaceC975810bV5 getDesignatedGiftRepo() {
        return C915980Zwa.LJI().LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void LJ() {
        ?? r3;
        float f;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateScoreReveal: leftEnigma=");
        C15DF c15df = this;
        sbLIZ.append(c15df.LLJJ);
        sbLIZ.append(", rightEnigma=");
        sbLIZ.append(c15df.LLJJI);
        sbLIZ.append(", isUserInEnigma=");
        sbLIZ.append(c15df.LLLILZLLLI);
        sbLIZ.append(", hasRivalSmoke=");
        sbLIZ.append(c15df.LLJJIJIL);
        sbLIZ.append(", isIndividual=");
        sbLIZ.append(C970370bMJ.LJ());
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        View view = c15df.LLJLILLLLZIIL;
        View view2 = c15df.LLJLL;
        ArrayList arrayList = new ArrayList();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (c15df.LLLILZLLLI || c15df.LLJJ <= 0) {
            r3 = 0;
            f = 0.0f;
            i = 2;
        } else {
            c15df.LJJIJIL(c15df.LLLLJI, true);
            r3 = 0;
            r3 = 0;
            f = 0.0f;
            i = 2;
            c15df.LIZ(view, c15df.LLLLIILLL, c15df.LLLLIL, c15df.LLLLJI, arrayList, linearInterpolator, true);
            TuxTextView tuxTextView = c15df.LLLLJI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C786410Ut5.B5(tuxTextView, 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(280L);
                objectAnimatorOfFloat.setStartDelay(240L);
                objectAnimatorOfFloat.setInterpolator(linearInterpolator);
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        long j = c15df.LLJJI;
        C15DF c15df2 = c15df;
        if (j > 0) {
            boolean z = c15df.LLJJIJIL;
            c15df2 = c15df;
            if (!z) {
                c15df.LJJIJIL(c15df.LLLLL, r3);
                C1324720kZq c1324720kZq = c15df.LLLLILI;
                C1324720kZq c1324720kZq2 = c15df.LLLLJ;
                TuxTextView tuxTextView2 = c15df.LLLLL;
                C15DF c15df3 = c15df;
                arrayList = arrayList;
                c15df3.LIZ(view2, c1324720kZq, c1324720kZq2, tuxTextView2, arrayList, linearInterpolator, true);
                TuxTextView tuxTextView3 = c15df3.LLLLL;
                c15df2 = c15df3;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, r3);
                    C786410Ut5.B5(tuxTextView3, f);
                    float[] fArr = new float[i];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.ALPHA, fArr);
                    objectAnimatorOfFloat2.setDuration(280L);
                    objectAnimatorOfFloat2.setStartDelay(240L);
                    objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
                    arrayList.add(objectAnimatorOfFloat2);
                    c15df2 = c15df3;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new ALAdapterS25S0100000_31(c15df2, 5));
            animatorSet.start();
            c15df2.LLLL = animatorSet;
        }
        if (c15df2.LLLLLJIL) {
            return;
        }
        C1142950fqf c1142950fqf = c15df2.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.LJIIIZ();
        }
        c15df2.LJJIJIIJI();
    }

    public final void LJIIIIZZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ConstraintLayout llMatchScoreTextFromXml = getLlMatchScoreTextFromXml();
        if (llMatchScoreTextFromXml == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = llMatchScoreTextFromXml.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.width = -2;
        C786410Ut5.m6(llMatchScoreTextFromXml, marginLayoutParams);
    }

    public final void LJIJI() {
        if (getVisibility() == 0 && isShown()) {
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJIL(C158B.LIZ());
            C970290bMB.LJJIJ(EnumC970300bMC.MATCH_HEALTH_BAR, true);
        }
    }

    public final void LJJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupEnigmaHideAnimation: isScoreRevealActive=");
        sbLIZ.append(this.LLLJL);
        sbLIZ.append(", leftPlusSign.vis=");
        TuxTextView tuxTextView = this.LLJLLL;
        sbLIZ.append(tuxTextView != null ? Integer.valueOf(tuxTextView.getVisibility()) : null);
        sbLIZ.append(", leftXIcon.vis=");
        View view = this.LLJLILLLLZIIL;
        sbLIZ.append(view != null ? Integer.valueOf(view.getVisibility()) : null);
        sbLIZ.append(", enigmaXContainer.vis=");
        View viewFindViewById = findViewById(R.id.mjz);
        sbLIZ.append(viewFindViewById != null ? Integer.valueOf(viewFindViewById.getVisibility()) : null);
        sbLIZ.append(", leftRevealedScore.vis=");
        TuxTextView tuxTextView2 = this.LLLLJI;
        sbLIZ.append(tuxTextView2 != null ? Integer.valueOf(tuxTextView2.getVisibility()) : null);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        AnimatorSet animatorSet = this.LLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLL = null;
        this.LLLJL = false;
        C786410Ut5.LL(0, (ConstraintLayout) findViewById(R.id.mjz));
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
            C786410Ut5.T4(view2, 1.0f);
        }
        TuxTextView tuxTextView3 = this.LLJLLL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            C786410Ut5.B5(tuxTextView3, 1.0f);
        }
        TuxTextView tuxTextView4 = this.LLLLJI;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
            C786410Ut5.B5(tuxTextView4, 0.0f);
        }
        LJIJJLI();
        LJJIFFI(this.LLJLLIL, false);
        final TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLJLLIL;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            textureViewSurfaceTextureListenerC1288630jdd.setStartFrame(0);
            C500260Jjc.LLFFF(textureViewSurfaceTextureListenerC1288630jdd);
            textureViewSurfaceTextureListenerC1288630jdd.setObjectFit(EnumC1311910kFB.COVER);
            textureViewSurfaceTextureListenerC1288630jdd.setObjectPosition(EnumC1297350jrh.CENTER);
            textureViewSurfaceTextureListenerC1288630jdd.setLayerType(2, null);
            TuxTextView tuxTextView5 = this.LLJLLL;
            if (tuxTextView5 != null && tuxTextView5.getVisibility() == 0) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView5, (Property<TuxTextView, Float>) View.ALPHA, tuxTextView5.getAlpha(), 0.0f);
                LiveMatchEnigmaAnimationTimingSettings liveMatchEnigmaAnimationTimingSettings = LiveMatchEnigmaAnimationTimingSettings.INSTANCE;
                objectAnimatorOfFloat.setStartDelay(liveMatchEnigmaAnimationTimingSettings.getEnigmaLeftPlusFadeDelay());
                objectAnimatorOfFloat.setDuration(liveMatchEnigmaAnimationTimingSettings.getEnigmaLeftPlusFadeDuration());
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new ALAdapterS25S0100000_31(tuxTextView5, 6));
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
            C1288910je5.LIZ(textureViewSurfaceTextureListenerC1288630jdd, new C1288120jco(this) { // from class: X.15DI
                public final /* synthetic */ C15DF LIZIZ;

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LIZ(C1288070jcj c1288070jcj) {
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LIZJ(C1288070jcj c1288070jcj) {
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LIZLLL(C1288070jcj c1288070jcj) {
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJFF(C1288090jcl c1288090jcl) {
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJII(C1288100jcm c1288100jcm) {
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LIZIZ(C1288070jcj c1288070jcj) {
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "Enigma X Animation onFirstFrame");
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJ(C1288070jcj c1288070jcj) {
                    C15DF c15df;
                    TuxTextView tuxTextView6;
                    int width;
                    int iLIZIZ;
                    C500260Jjc.LJIILIIL(textureViewSurfaceTextureListenerC1288630jdd);
                    C500260Jjc.LJIILIIL(this.LIZIZ.LLJLLL);
                    View view3 = this.LIZIZ.LLJLILLLLZIIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.LIZIZ.findViewById(R.id.mjz);
                    C786410Ut5.LL(8, constraintLayout);
                    if (C970370bMJ.LJ() && (tuxTextView6 = (c15df = this.LIZIZ).LLJZIJLIL) != null && tuxTextView6.getVisibility() == 0) {
                        TuxTextView tuxTextView7 = c15df.LLJLLL;
                        if (tuxTextView7 != null) {
                            width = tuxTextView7.getWidth();
                        } else {
                            width = 0;
                        }
                        Integer numValueOf = Integer.valueOf(constraintLayout.getWidth());
                        if (numValueOf.intValue() > 0) {
                            iLIZIZ = numValueOf.intValue();
                        } else {
                            iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
                        }
                        float f = width + iLIZIZ;
                        C786410Ut5.Vc(tuxTextView6, f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView6, (Property<TuxTextView, Float>) View.TRANSLATION_X, f, 0.0f);
                        objectAnimatorOfFloat2.setStartDelay(0L);
                        objectAnimatorOfFloat2.setDuration(LiveMatchEnigmaAnimationTimingSettings.INSTANCE.getOpponentClosingBracketAnimationDuration());
                        objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.38f, 0.0f, 0.66f, 1.0f));
                        objectAnimatorOfFloat2.addListener(new ALAdapterS25S0100000_31(tuxTextView6, 7));
                        C786410Ut5.Pd(objectAnimatorOfFloat2);
                    }
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "Enigma X Animation onComplete called");
                    textureViewSurfaceTextureListenerC1288630jdd.LIZLLL(this);
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJIIIIZZ(C1288060jci c1288060jci) {
                    String strLIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Enigma X Animation onError: ");
                    if (c1288060jci != null) {
                        strLIZIZ = c1288060jci.LIZIZ();
                    } else {
                        strLIZIZ = null;
                    }
                    sbLIZ2.append(strLIZIZ);
                    C20441214yg.LJ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJIIIZ(C1288070jcj c1288070jcj) {
                    Integer numValueOf;
                    C15DF c15df = this.LIZIZ;
                    HandlerHook.viewPostDelay(c15df, new ARunnableS131S0100000_31(c15df, 18), 100L);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Enigma X Animation onStart: animView.vis=");
                    sbLIZ2.append(textureViewSurfaceTextureListenerC1288630jdd.getVisibility());
                    sbLIZ2.append(", leftXIcon.vis=");
                    View view3 = this.LIZIZ.LLJLILLLLZIIL;
                    Integer numValueOf2 = null;
                    if (view3 != null) {
                        numValueOf = Integer.valueOf(view3.getVisibility());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append(", leftPlus.vis=");
                    TuxTextView tuxTextView6 = this.LIZIZ.LLJLLL;
                    if (tuxTextView6 != null) {
                        numValueOf2 = Integer.valueOf(tuxTextView6.getVisibility());
                    }
                    sbLIZ2.append(numValueOf2);
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJIIJ(C1288070jcj c1288070jcj) {
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "Enigma X Animation onCancel");
                }

                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                public final void LJIIJJI(C1288070jcj c1288070jcj) {
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "Enigma X Animation onReady");
                }

                {
                    this.LIZIZ = this;
                }
            });
            C1288910je5.LIZIZ(textureViewSurfaceTextureListenerC1288630jdd);
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "Enigma X Animation play() called");
        }
    }

    public final void LJJIII() {
        Boolean bool;
        if (!LJIILJJIL()) {
            TuxTextView tuxTextView = this.LLJIJIL;
            if (C500260Jjc.LJJIIZ(tuxTextView != null ? tuxTextView.getText() : null) || C500260Jjc.LJJIIZ(getTvRightMatchScoreTextFromXml().getText())) {
                return;
            }
        }
        C1324720kZq c1324720kZq = this.LLJJL;
        int i = 8;
        boolean zBooleanValue = false;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, (LJIILJJIL() && C970370bMJ.LJIIJ()) ? 0 : 8);
        }
        C1324720kZq c1324720kZq2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1324720kZq2 != null) {
            if (LJIILJJIL() && C970370bMJ.LJIIJ()) {
                i = 0;
            }
            C786410Ut5.LLJJIII(c1324720kZq2, i);
        }
        if (!LJIILJJIL()) {
            TuxTextView tuxTextView2 = this.LLJIJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(CardStruct.IStatusCode.DEFAULT);
            }
            TuxTextView tvRightMatchScoreTextFromXml = getTvRightMatchScoreTextFromXml();
            if (tvRightMatchScoreTextFromXml != null) {
                tvRightMatchScoreTextFromXml.setText(CardStruct.IStatusCode.DEFAULT);
                return;
            }
            return;
        }
        LJIILL();
        TuxTextView tuxTextView3 = this.LLJIJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(" x 0");
        }
        TuxTextView tvRightMatchScoreTextFromXml2 = getTvRightMatchScoreTextFromXml();
        if (tvRightMatchScoreTextFromXml2 != null) {
            tvRightMatchScoreTextFromXml2.setText(" 0 x ");
        }
        DataChannel dataChannel = this.LLJJJJLIIL;
        Gift gift = dataChannel != null ? (Gift) dataChannel.gg0(GiftSelectedChangeEvent.class) : null;
        DataChannel dataChannel2 = this.LLJJJJLIIL;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(GiftDialogVisibilityChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (gift == null || !zBooleanValue) {
            return;
        }
        LJIILIIL(gift);
    }

    public final void LJJIJIIJI() {
        C1324720kZq matchFirstDividerAnimFromXml = getMatchFirstDividerAnimFromXml();
        if (matchFirstDividerAnimFromXml != null) {
            C500260Jjc.LJIILIIL(matchFirstDividerAnimFromXml);
        }
        LJJIFFI(getMatchEmojiAnimFromXml(), false);
        LJJI();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15DF.LJJIJIIJIL():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJIJI();
    }

    public final TextView getScoreTextView() {
        return this.LLJIJIL;
    }

    public static void LIZLLL(C15DF c15df) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateScoreHide: leftEnigma=");
        C15DF c15df2 = c15df;
        sbLIZ.append(c15df2.LLJJ);
        sbLIZ.append(", rightEnigma=");
        sbLIZ.append(c15df2.LLJJI);
        sbLIZ.append(", hasRivalSmoke=");
        sbLIZ.append(c15df2.LLJJIJIL);
        sbLIZ.append(", hasOnComplete=");
        sbLIZ.append(false);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        View view = c15df2.LLJLILLLLZIIL;
        View view2 = c15df2.LLJLL;
        ArrayList arrayList = new ArrayList();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (c15df2.LLJJ > 0 && !c15df2.LLLILZLLLI) {
            C786410Ut5.LL(0, (ConstraintLayout) c15df2.findViewById(R.id.mjz));
            i = 2;
            c15df2.LIZ(view, c15df2.LLLLIILLL, c15df2.LLLLIL, c15df2.LLLLJI, arrayList, linearInterpolator, false);
            TuxTextView tuxTextView = c15df2.LLLLJI;
            if (tuxTextView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(280L);
                objectAnimatorOfFloat.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(tuxTextView, 25));
                arrayList.add(objectAnimatorOfFloat);
            }
        } else {
            i = 2;
        }
        if (c15df2.LLJJI > 0 && !c15df2.LLJJIJIL) {
            C1324720kZq c1324720kZq = c15df2.LLLLILI;
            C1324720kZq c1324720kZq2 = c15df2.LLLLJ;
            TuxTextView tuxTextView2 = c15df2.LLLLL;
            c15df2 = c15df2;
            arrayList = arrayList;
            c15df2.LIZ(view2, c1324720kZq, c1324720kZq2, tuxTextView2, arrayList, linearInterpolator, false);
            TuxTextView tuxTextView3 = c15df2.LLLLL;
            if (tuxTextView3 != null) {
                float[] fArr = new float[i];
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.ALPHA, fArr);
                objectAnimatorOfFloat2.setDuration(280L);
                objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat2.addListener(new ALAdapterS25S0200000_31(tuxTextView3, c15df2, 7));
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            c15df2.LLLL = animatorSet;
        }
        C1142950fqf c1142950fqf = c15df2.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.LJIIIZ();
        }
    }

    public static String LJIJ(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJ("LiveMatchBasicScoreComponent", "BufferedReader failed to close");
                        }
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    try {
                        bufferedReader.close();
                        return null;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJ("LiveMatchBasicScoreComponent", "BufferedReader failed to close");
                        return null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C20441214yg.LJ("LiveMatchBasicScoreComponent", "BufferedReader failed to close");
                    throw th;
                }
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEmojiAnim(boolean z) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        float[] dividerPosition;
        long j = this.LLLLLLIL;
        if (j < 25) {
            str = "live_battle_score_animation_sad_20z.webp";
        } else if (j <= 50) {
            str = "live_battle_score_animation_come_on_20z.webp";
        } else if (j < 75) {
            str = "live_battle_score_animation_clap_20z.webp";
        } else {
            str = "live_battle_score_animation_sunglasses_20z.webp";
        }
        C1324720kZq matchEmojiAnimFromXml = getMatchEmojiAnimFromXml();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (matchEmojiAnimFromXml != null) {
            layoutParams = matchEmojiAnimFromXml.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        float f = 0.0f;
        LJIL(34.0f, 34.0f, 0.0f, 0.0f);
        this.LLJJIJI = 34.0f;
        this.LLJJIJIIJIL = (((int) C497740JfY.LIZIZ(34.0f)) * 2) / 3;
        if (marginLayoutParams != null) {
            C1142950fqf c1142950fqf = this.LLJI;
            if (c1142950fqf != null && (dividerPosition = c1142950fqf.getDividerPosition()) != null) {
                f = dividerPosition[1];
            }
            marginLayoutParams.setMarginStart((int) (f - this.LLJJIJIIJIL));
        }
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "setEmoji, fileName = ".concat(str));
        C1324720kZq matchEmojiAnimFromXml2 = getMatchEmojiAnimFromXml();
        if (matchEmojiAnimFromXml2 != null) {
            C786410Ut5.u6(matchEmojiAnimFromXml2, marginLayoutParams);
        }
        if (z) {
            LJJIFFI(getMatchEmojiAnimFromXml(), false);
        }
        C500260Jjc.LJIILIIL(getMatchFirstDividerAnimFromXml());
        C20483515Dd.LIZ.LJFF(this.LLJILJIL, "tiktok_live_match_redesign_resource_2", str);
        this.LLJJIII = C15DA.EMOJI;
    }

    public final void LIZJ(Function0<Unit> function0) {
        View viewFindViewById = findViewById(R.id.o2t);
        if (viewFindViewById == null) {
            function0.invoke();
            return;
        }
        int width = viewFindViewById.getWidth();
        function0.invoke();
        if (width <= 0) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewFindViewById, new ARunnableS13S0201000_6(viewFindViewById, width, this, 0));
    }

    public final String LJIIJJI(long j) {
        DataChannel dataChannel = this.LLJJJJLIIL;
        if ((dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) || j < 1000000) {
            return C978440bZK.LIZLLL(j);
        }
        return "1M+";
    }

    public final void LJIILIIL(Gift gift) {
        Boolean boolValueOf;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJJLIIJ());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf) && gift.id == C978520bZS.LJ(false)) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10);
            valueAnimatorOfInt.setDuration(400L);
            valueAnimatorOfInt.addListener(new ALAdapterS25S0100000_31(this, 17));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.35f);
            valueAnimatorOfFloat.setDuration(260L);
            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 24));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.35f, 0.8f);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.67f, 1.0f));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(this, 25));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.8f, 1.2f);
            valueAnimatorOfFloat3.setDuration(200L);
            valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS278S0100000_31(this, 26));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.2f, 0.9f);
            valueAnimatorOfFloat4.setDuration(200L);
            valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS278S0100000_31(this, 30));
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.9f, 1.0f);
            valueAnimatorOfFloat5.setDuration(200L);
            valueAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS278S0100000_31(this, 31));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJLIL, (Property<View, Float>) View.ALPHA, 0.0f, 0.9f);
            objectAnimatorOfFloat.setDuration(260L);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 22));
            objectAnimatorOfFloat.addListener(new ALAdapterS25S0100000_31(this, 18));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJLIL, (Property<View, Float>) View.ALPHA, 0.9f, 0.0f);
            objectAnimatorOfFloat2.setDuration(800L);
            objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.23f, 0.0f, 0.42f, 1.0f));
            objectAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(this, 23));
            objectAnimatorOfFloat2.addListener(new ALAdapterS25S0100000_31(this, 19));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1, 10);
            valueAnimatorOfInt2.setDuration(1200L);
            valueAnimatorOfInt2.addListener(new ALAdapterS1S0000000_16(4));
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(1.0f, 10.0f);
            valueAnimatorOfFloat6.setDuration(2660L);
            valueAnimatorOfFloat6.addListener(new ALAdapterS25S0100000_31(this, 15));
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder builderBefore = animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfFloat);
            FrameLayout waveAnimationContainerFromXml = getWaveAnimationContainerFromXml();
            if (waveAnimationContainerFromXml != null) {
                C786410Ut5.LJZ(8, waveAnimationContainerFromXml);
            }
            FrameLayout waveAnimationContainerFromXml2 = getWaveAnimationContainerFromXml();
            if (waveAnimationContainerFromXml2 != null && waveAnimationContainerFromXml2.getChildCount() > 0) {
                C786410Ut5.LJJJJIZL(getWaveAnimationContainerFromXml());
            }
            int iLIZIZ = (int) C497740JfY.LIZIZ(95.0f);
            int i = 0;
            do {
                View viewSd = C786410Ut5.Sd(R.layout.hs0, C786410Ut5.ne(getContext()), null);
                FrameLayout waveAnimationContainerFromXml3 = getWaveAnimationContainerFromXml();
                if (waveAnimationContainerFromXml3 != null) {
                    waveAnimationContainerFromXml3.addView(viewSd, new FrameLayout.LayoutParams(iLIZIZ, -1));
                }
                C786410Ut5.Jc(viewSd, -iLIZIZ);
                i++;
            } while (i < 2);
            float f = -iLIZIZ;
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(f, 0.0f);
            valueAnimatorOfFloat7.setDuration(1300L);
            valueAnimatorOfFloat7.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat7.addUpdateListener(new AUListenerS256S0100000_6(this, 55));
            valueAnimatorOfFloat7.addListener(new ALAdapterS3S0100000_6(this, 23));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getWaveAnimationContainerFromXml().getChildAt(0), (Property<View, Float>) View.ALPHA, 0.5f, 0.0f);
            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(f, 0.0f);
            valueAnimatorOfFloat8.setDuration(1300L);
            valueAnimatorOfFloat8.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat8.addUpdateListener(new AUListenerS256S0100000_6(this, 57));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(getWaveAnimationContainerFromXml().getChildAt(1), (Property<View, Float>) View.ALPHA, 0.5f, 0.0f);
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(0, 12);
            valueAnimatorOfInt3.setDuration(1000L);
            ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(0, 12);
            valueAnimatorOfInt4.setDuration(300L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(valueAnimatorOfInt3).before(valueAnimatorOfFloat7).before(valueAnimatorOfInt4);
            animatorSet2.play(valueAnimatorOfFloat8).after(valueAnimatorOfInt4);
            animatorSet2.play(objectAnimatorOfFloat3).after(2000L);
            animatorSet2.play(objectAnimatorOfFloat4).after(2300L);
            animatorSet2.addListener(new ALAdapterS3S0100000_6(this, 22));
            builderBefore.before(animatorSet2).before(objectAnimatorOfFloat).before(valueAnimatorOfInt2);
            animatorSet.play(valueAnimatorOfFloat2).after(valueAnimatorOfFloat);
            animatorSet.play(valueAnimatorOfFloat3).after(valueAnimatorOfFloat2);
            animatorSet.play(valueAnimatorOfFloat4).after(valueAnimatorOfFloat3);
            animatorSet.play(valueAnimatorOfFloat5).after(valueAnimatorOfFloat4);
            animatorSet.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
            animatorSet.play(valueAnimatorOfFloat6).after(valueAnimatorOfInt2);
            animatorSet.addListener(new ALAdapterS25S0100000_31(this, 16));
            animatorSet.start();
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null) {
                interfaceC973730bRjYf22.LJIJ();
            }
        }
        this.LLLLLLZ = gift;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(int r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15DF.LJJIJ(int):void");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
            C975400bUQ.LIZ.LIZ = i;
        }
    }

    public final void setEmojiWhenBattleFinish(EnumC964170bCJ enumC964170bCJ) {
        if ((enumC964170bCJ == EnumC964170bCJ.SETTLE_START || enumC964170bCJ == EnumC964170bCJ.PUNISH_START || enumC964170bCJ == EnumC964170bCJ.DRAW) && this.LLJJIII != C15DA.EMOJI && this.LLJJ == 0) {
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "setEmojiAnim() battle finish");
            setEmojiAnim(true);
        }
    }

    public final void setIsBoosting(boolean z) {
        C1142950fqf c1142950fqf = this.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.setIsBoosting(z);
        }
    }

    public final void setLlMatchScoreTextFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setMatchEmojiAnimFromXml(C1324720kZq c1324720kZq) {
        this.LLIZ = c1324720kZq;
    }

    public final void setMatchFirstDividerAnimFromXml(C1324720kZq c1324720kZq) {
        this.LL = c1324720kZq;
    }

    public final void setMatchItemFlashContainerFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setMatchScoreRankNumberFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setMatchSecondDividerAnimFromXml(C1324720kZq c1324720kZq) {
        this.LLILLJJLI = c1324720kZq;
    }

    public final void setMatchThirdDividerAnimFromXml(C1324720kZq c1324720kZq) {
        this.LLILLL = c1324720kZq;
    }

    public final void setRivalSmoke(boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        boolean z2;
        boolean z3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRivalSmoke: hasRivalSmoke=");
        sbLIZ.append(z);
        sbLIZ.append(", isScoreRevealActive=");
        sbLIZ.append(this.LLLJL);
        sbLIZ.append(", lastRightEnigma=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", rightPlusSign=");
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            numValueOf = Integer.valueOf(tuxTextView.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", rightXIcon=");
        View view = this.LLJLL;
        if (view != null) {
            numValueOf2 = Integer.valueOf(view.getVisibility());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIL = z;
        C1142950fqf c1142950fqf = this.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.setRivalSmoke(z);
        }
        if (C970370bMJ.LJ()) {
            ConstraintLayout llMatchScoreTextFromXml = getLlMatchScoreTextFromXml();
            if (llMatchScoreTextFromXml != null) {
                if (!z && this.LLJJJIL) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C500260Jjc.LJLJLJ(llMatchScoreTextFromXml, z3);
            }
            View view2 = this.LLJLILLLLZIIL;
            if (!z && this.LLJJJIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            C500260Jjc.LJLJLJ(view2, z2);
        }
        if (z) {
            C500260Jjc.LJIILIIL(getMatchSecondDividerAnimFromXml());
            C500260Jjc.LJIILIIL(getMatchThirdDividerAnimFromXml());
        }
        if (z) {
            AnimatorSet animatorSet = this.LLLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLLL = null;
            C1324720kZq matchFirstDividerAnimFromXml = getMatchFirstDividerAnimFromXml();
            if (matchFirstDividerAnimFromXml != null) {
                C500260Jjc.LJIILIIL(matchFirstDividerAnimFromXml);
            }
            C1324720kZq matchEmojiAnimFromXml = getMatchEmojiAnimFromXml();
            if (matchEmojiAnimFromXml != null) {
                C500260Jjc.LJIILIIL(matchEmojiAnimFromXml);
            }
            AnimatorSet animatorSet2 = this.LLLLLLLLLL;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            FrameLayout waveAnimationContainerFromXml = getWaveAnimationContainerFromXml();
            if (waveAnimationContainerFromXml != null) {
                C786410Ut5.LJZ(8, waveAnimationContainerFromXml);
            }
            FrameLayout matchItemFlashContainerFromXml = getMatchItemFlashContainerFromXml();
            if (matchItemFlashContainerFromXml != null) {
                C786410Ut5.LJZ(8, matchItemFlashContainerFromXml);
            }
            View view3 = this.LLJLL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            TuxTextView tuxTextView2 = this.LLJZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            TuxTextView tuxTextView3 = this.LLLLL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                C786410Ut5.B5(tuxTextView3, 0.0f);
            }
            for (C1324720kZq c1324720kZq : C1697810uHb.LJIIJJI(this.LLLLILI, this.LLLLJ)) {
                if (c1324720kZq != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 8);
                    C786410Ut5.h5(c1324720kZq, 1.0f);
                    C786410Ut5.Qc(c1324720kZq, 0.0f);
                }
            }
            return;
        }
        if (this.LLJJI > 0) {
            TuxTextView tuxTextView4 = this.LLJZ;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            if (this.LLLJL) {
                View view4 = this.LLJLL;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(4, view4);
                }
                LJJIJIL(this.LLLLL, false);
                TuxTextView tuxTextView5 = this.LLLLL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                    C786410Ut5.B5(tuxTextView5, 1.0f);
                }
            } else {
                View view5 = this.LLJLL;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(0, view5);
                }
                TuxTextView tuxTextView6 = this.LLLLL;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 8);
                    C786410Ut5.B5(tuxTextView6, 0.0f);
                }
            }
        }
        C15DA c15da = this.LLJJIII;
        if (c15da != null) {
            int i = C15DB.LIZ[c15da.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        C1324720kZq matchEmojiAnimFromXml2 = getMatchEmojiAnimFromXml();
                        if (matchEmojiAnimFromXml2 != null) {
                            C500260Jjc.LLFFF(matchEmojiAnimFromXml2);
                        }
                        C1324720kZq matchFirstDividerAnimFromXml2 = getMatchFirstDividerAnimFromXml();
                        if (matchFirstDividerAnimFromXml2 != null) {
                            C500260Jjc.LJIILIIL(matchFirstDividerAnimFromXml2);
                        }
                        LJJIIJ();
                        return;
                    }
                    return;
                }
                C1324720kZq matchEmojiAnimFromXml3 = getMatchEmojiAnimFromXml();
                if (matchEmojiAnimFromXml3 != null) {
                    C500260Jjc.LLFFF(matchEmojiAnimFromXml3);
                }
                C1324720kZq matchFirstDividerAnimFromXml3 = getMatchFirstDividerAnimFromXml();
                if (matchFirstDividerAnimFromXml3 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(matchFirstDividerAnimFromXml3);
                return;
            }
            C500260Jjc.LLFFF(getMatchFirstDividerAnimFromXml());
            C1324720kZq matchEmojiAnimFromXml4 = getMatchEmojiAnimFromXml();
            if (matchEmojiAnimFromXml4 == null) {
                return;
            }
            C500260Jjc.LJIILIIL(matchEmojiAnimFromXml4);
        }
    }

    public final void setTvRightMatchScoreTextFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LJIJI();
        }
    }

    public final void setWaveAnimationContainerFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [X.15DK] */
    public C15DF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJILJ = -1L;
        this.LLJJJJ = new C985820blE(false, 0L);
        this.LLLIIIL = new boolean[4];
        this.LLLJ = new C15DM();
        this.LLLLII = new PathInterpolator(0.66f, 0.0f, 0.34f, 1.0f);
        this.LLLLIIL = new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f);
        this.LLLLIILL = 260L;
        this.LLLLLIL = -1;
        this.LLLLLILLIL = -1;
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "init LiveMatchBasicScoreComponent");
        C786410Ut5.Sd(R.layout.h80, C786410Ut5.ne(context), this);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.o2v);
        this.LLJILJIL = (C1324720kZq) findViewById(R.id.o21);
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.mk1);
        this.LLJJL = c1324720kZq;
        C1324720kZq c1324720kZq2 = (C1324720kZq) findViewById(R.id.tl8);
        this.LLJJLIIIJLLLLLLLZ = c1324720kZq2;
        this.LLJL = (C1143100fqu) findViewById(R.id.iy3);
        this.LLJLIL = findViewById(R.id.iy7);
        this.LLJLILLLLZIIL = findViewById(R.id.mjw);
        this.LLJLL = findViewById(R.id.tl2);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.mki);
        this.LLJLLL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.tlx);
        this.LLJZ = tuxTextView2;
        this.LLJZIJLIL = (TuxTextView) findViewById(R.id.e2z);
        this.LLL = (TuxTextView) findViewById(R.id.poe);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.h6l);
        this.LLLF = constraintLayout;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.h6h);
        this.LLLFF = textureViewSurfaceTextureListenerC1288630jdd;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.h6j);
        this.LLLFFI = textureViewSurfaceTextureListenerC1288630jdd2;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.h6k);
        this.LLLFZ = textureViewSurfaceTextureListenerC1288630jdd3;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.i10);
        this.LLLI = constraintLayout2;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById(R.id.uhz);
        this.LLLII = constraintLayout3;
        ConstraintLayout constraintLayout4 = (ConstraintLayout) findViewById(R.id.xtp);
        this.LLLIIII = constraintLayout4;
        ConstraintLayout constraintLayout5 = (ConstraintLayout) findViewById(R.id.iih);
        this.LLLIIIIL = constraintLayout5;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd4 = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.mjx);
        this.LLJLLIL = textureViewSurfaceTextureListenerC1288630jdd4;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd, 8);
        }
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd2, 8);
        }
        if (textureViewSurfaceTextureListenerC1288630jdd3 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd3, 8);
        }
        if (constraintLayout2 != null) {
            C786410Ut5.LL(8, constraintLayout2);
        }
        if (constraintLayout3 != null) {
            C786410Ut5.LL(8, constraintLayout3);
        }
        if (constraintLayout4 != null) {
            C786410Ut5.LL(8, constraintLayout4);
        }
        if (constraintLayout5 != null) {
            C786410Ut5.LL(8, constraintLayout5);
        }
        EnumC1297350jrh enumC1297350jrh = EnumC1297350jrh.RIGHT;
        LJIIZILJ(this, textureViewSurfaceTextureListenerC1288630jdd, "enigma_bar_effect", enumC1297350jrh);
        LJIIZILJ(this, textureViewSurfaceTextureListenerC1288630jdd2, "enigma_bar_effect_solo", enumC1297350jrh);
        LJIIZILJ(this, textureViewSurfaceTextureListenerC1288630jdd3, "enigma_pulse_effect", enumC1297350jrh);
        LJIIZILJ(this, textureViewSurfaceTextureListenerC1288630jdd4, "enigmaX_hide_effect", EnumC1297350jrh.CENTER);
        if (tuxTextView != null) {
            tuxTextView.setText("+");
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText("+");
        }
        LJIILL();
        if (c1324720kZq != null) {
            C500260Jjc.LJLIIIL(500L, c1324720kZq, new AwS610S0100000_31(this, 286));
        }
        if (c1324720kZq2 != null) {
            C500260Jjc.LJLIIIL(500L, c1324720kZq2, new AwS610S0100000_31(this, 287));
        }
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "initProgressBar");
        C1142950fqf c1142950fqf = (C1142950fqf) findViewById(R.id.o2m);
        this.LLJI = c1142950fqf;
        if (c1142950fqf != null) {
            c1142950fqf.setGetScoreTextMeasuredWidthCallback(new AwS610S0100000_31(this, 30));
        }
        C1143680frq.LIZLLL(getMatchFirstDividerAnimFromXml(), "tiktok_live_interaction_normal_1", "live_battle_score_initial_animation.webp");
        C1143680frq.LIZLLL(getMatchSecondDividerAnimFromXml(), "tiktok_live_interaction_normal_1", "live_battle_score_initial_animation.webp");
        C1143680frq.LIZLLL(getMatchThirdDividerAnimFromXml(), "tiktok_live_interaction_normal_1", "live_battle_score_initial_animation.webp");
        C1143680frq.LIZLLL(this.LLJLILLLLZIIL, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x.png");
        C1143680frq.LIZLLL(this.LLJLL, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x.png");
        this.LLLLIILLL = (C1324720kZq) findViewById(R.id.mkt);
        this.LLLLIL = (C1324720kZq) findViewById(R.id.mku);
        this.LLLLILI = (C1324720kZq) findViewById(R.id.tm5);
        this.LLLLJ = (C1324720kZq) findViewById(R.id.tm6);
        C1143680frq.LIZLLL(this.LLLLIILLL, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x_left.png");
        C1143680frq.LIZLLL(this.LLLLIL, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x_right.png");
        C1143680frq.LIZLLL(this.LLLLILI, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x_left.png");
        C1143680frq.LIZLLL(this.LLLLJ, "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x_right.png");
        this.LLLLJI = (TuxTextView) findViewById(R.id.mjy);
        this.LLLLL = (TuxTextView) findViewById(R.id.tl3);
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.zW(CanPlayRevealAnimationChannel.class, Boolean.FALSE);
        }
        this.LLLLLLIL = 25L;
        this.LLLLLLLZIL = -1.0f;
        this.LLLLLLZZ = new C1288120jco() { // from class: X.15DK
            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LIZ(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LIZIZ(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LIZJ(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LIZLLL(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJFF(C1288090jcl c1288090jcl) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJII(C1288100jcm c1288100jcm) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJIIIIZZ(C1288060jci c1288060jci) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJIIJ(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJIIJJI(C1288070jcj c1288070jcj) {
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJ(C1288070jcj c1288070jcj) {
                C1324720kZq matchEmojiAnimFromXml;
                ConstraintLayout constraintLayout6 = this.LIZ.LLLF;
                if (constraintLayout6 != null) {
                    C786410Ut5.LL(8, constraintLayout6);
                }
                C1142950fqf c1142950fqf2 = this.LIZ.LLJI;
                if (c1142950fqf2 != null) {
                    c1142950fqf2.setIsBoosting(false);
                }
                C1142950fqf c1142950fqf3 = this.LIZ.LLJI;
                if (c1142950fqf3 != null) {
                    c1142950fqf3.invalidate();
                }
                if (!C915980Zwa.LJFF().Nt() && (matchEmojiAnimFromXml = this.LIZ.getMatchEmojiAnimFromXml()) != null) {
                    HandlerHook.viewPost(matchEmojiAnimFromXml, new ARunnableS131S0100000_31(matchEmojiAnimFromXml, 109));
                }
            }

            @Override // X.C1288120jco, X.InterfaceC1288110jcn
            public final void LJIIIZ(C1288070jcj c1288070jcj) {
                if (!C915980Zwa.LJFF().Nt()) {
                    C1142950fqf c1142950fqf2 = this.LIZ.LLJI;
                    if (c1142950fqf2 != null) {
                        c1142950fqf2.setIsBoosting(true);
                    }
                    C1142950fqf c1142950fqf3 = this.LIZ.LLJI;
                    if (c1142950fqf3 != null) {
                        c1142950fqf3.invalidate();
                    }
                    C1324720kZq matchFirstDividerAnimFromXml = this.LIZ.getMatchFirstDividerAnimFromXml();
                    if (matchFirstDividerAnimFromXml != null) {
                        C500260Jjc.LJIILIIL(matchFirstDividerAnimFromXml);
                    }
                    C1324720kZq matchEmojiAnimFromXml = this.LIZ.getMatchEmojiAnimFromXml();
                    if (matchEmojiAnimFromXml != null) {
                        C500260Jjc.LJIILIIL(matchEmojiAnimFromXml);
                    }
                    AnimatorSet animatorSet = this.LIZ.LLLLLLLLLL;
                    if (animatorSet != null) {
                        animatorSet.end();
                    }
                    FrameLayout waveAnimationContainerFromXml = this.LIZ.getWaveAnimationContainerFromXml();
                    if (waveAnimationContainerFromXml != null) {
                        C786410Ut5.LJZ(8, waveAnimationContainerFromXml);
                    }
                    FrameLayout matchItemFlashContainerFromXml = this.LIZ.getMatchItemFlashContainerFromXml();
                    if (matchItemFlashContainerFromXml != null) {
                        C786410Ut5.LJZ(8, matchItemFlashContainerFromXml);
                    }
                }
            }
        };
    }

    public static String LJIIL(String str, String str2) {
        File fileLJII = C1143780fs0.LJII(str, str2);
        if (fileLJII != null && fileLJII.exists()) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json file ");
                sbLIZ.append(str2);
                sbLIZ.append(" read successfully");
                C20441214yg.LJIIIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
                return LJIJ(new InputStreamReader(new C0VSP(fileLJII)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveMatchBasicScoreComponent", "Failed to read gecko file", e);
                return null;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Gecko file not exist: ");
        sbLIZ2.append(fileLJII);
        C20441214yg.LJ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJ(long r7, boolean r9) {
        /*
            r6 = this;
            r5 = 1
            r2 = 0
            if (r9 != 0) goto L5d
            X.0blE r1 = r6.LLJJJJ
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L5d
            long r3 = r1.LIZIZ
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L5d
            java.lang.String r0 = X.C978440bZK.LIZJ(r3)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r0
            r0 = 2131853303(0x7f117ff7, float:1.934025E38)
            java.lang.String r3 = X.C497740JfY.LJIJJ(r0, r1)
        L1f:
            boolean r0 = X.C970370bMJ.LJ()
            if (r0 == 0) goto L5c
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L5c
            boolean r0 = X.C970370bMJ.LJIIIZ()
            if (r0 != 0) goto L5c
            int r0 = r3.length()
            if (r0 <= 0) goto L5c
            char r0 = r3.charAt(r2)
            r2 = 40
            if (r0 == r2) goto L5c
            com.bytedance.tux.input.TuxTextView r0 = r6.LLL
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 != 0) goto L5c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            r1.append(r3)
            r0 = 41
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L5c:
            return r3
        L5d:
            java.lang.String r3 = X.C978440bZK.LIZLLL(r7)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15DF.LJIIJ(long, boolean):java.lang.String");
    }

    public final void LJJIFFI(View view, boolean z) {
        if (z) {
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
        } else if (this.LLJJIJIL) {
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
        } else if (view != null) {
            C500260Jjc.LLFFF(view);
        }
    }

    public final void LJJIJIL(TuxTextView tuxTextView, boolean z) {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        long jLJJJJJ;
        C976480bWA c976480bWA;
        TuxTextView tvRightMatchScoreTextFromXml;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRevealedScoreText: isLeft=");
        sbLIZ.append(z);
        sbLIZ.append(", isIndividual=");
        sbLIZ.append(C970370bMJ.LJ());
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null) {
                jLJJJJJ = interfaceC973730bRjYf22.LJJJJJ();
            } else {
                jLJJJJJ = 0;
            }
            if (z && C970370bMJ.LJ()) {
                if (this.LLLLLJIL) {
                    i = this.LLLLLILLIL;
                } else {
                    i = (int) this.LLJILJILJ;
                }
                c976480bWA = (C976480bWA) C13LP.LJJJLZIJ(i, value);
                if (c976480bWA == null) {
                    return;
                }
            } else {
                C976480bWA c976480bWA2 = null;
                if (z) {
                    Iterator<C976480bWA> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C976480bWA next = it2.next();
                        if (jLJJJJJ == next.LIZ) {
                            c976480bWA2 = next;
                            break;
                        }
                    }
                    c976480bWA = c976480bWA2;
                    if (c976480bWA == null) {
                        return;
                    }
                } else {
                    Iterator<C976480bWA> it3 = value.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C976480bWA next2 = it3.next();
                        if (jLJJJJJ != next2.LIZ) {
                            c976480bWA2 = next2;
                            break;
                        }
                    }
                    c976480bWA = c976480bWA2;
                    if (c976480bWA == null) {
                        return;
                    }
                }
            }
            long j = c976480bWA.LIZJ;
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "updateRevealedScoreText: isLeft=" + z + ", enigmaScore=" + j);
            if (tuxTextView != null) {
                C978440bZK.LIZ(j, tuxTextView, C500260Jjc.LJIIZILJ(this.LLJJJJLIIL));
            }
            if (z) {
                tvRightMatchScoreTextFromXml = this.LLJIJIL;
            } else {
                tvRightMatchScoreTextFromXml = getTvRightMatchScoreTextFromXml();
            }
            if (tvRightMatchScoreTextFromXml != null) {
                float textSize = tvRightMatchScoreTextFromXml.getTextSize();
                if (tuxTextView != null) {
                    tuxTextView.setTextSize(0, textSize);
                }
            }
        }
    }

    public final void LJJIIJZLJL(int i, long j, View view) {
        float f;
        ValueAnimator valueAnimator;
        LiveMatchProgressBarScaleSetting liveMatchProgressBarScaleSetting = LiveMatchProgressBarScaleSetting.INSTANCE;
        if (liveMatchProgressBarScaleSetting.directReturn()) {
            return;
        }
        if ((view != null && view.getVisibility() == 8) || this.LLLIL || this.LLLIZZ) {
            return;
        }
        Object tag = null;
        if (view != null) {
            tag = view.getTag(R.id.yv7);
        }
        if ((tag instanceof ValueAnimator) && (valueAnimator = (ValueAnimator) tag) != null) {
            valueAnimator.cancel();
        }
        if (liveMatchProgressBarScaleSetting.fixScale() && view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
        float[] fArr = new float[2];
        fArr[0] = 1.0f;
        if (i == 0 && this.LLJJJ) {
            f = 1.8f;
        } else {
            f = 1.3f;
        }
        fArr[1] = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setRepeatCount(1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 58));
        if (view != null) {
            view.setTag(R.id.yv7, valueAnimatorOfFloat);
        }
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat.addListener(new AAListenerS327S0100000_16(valueAnimatorOfFloat, 5));
    }

    public final void LJJIIZI(boolean z, ConstraintLayout constraintLayout, int i) {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd;
        FrameLayout.LayoutParams layoutParams;
        float f;
        int i2;
        C1142950fqf c1142950fqf;
        float[] dividerPosition;
        if (constraintLayout != null && i <= 3) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            textureViewSurfaceTextureListenerC1288630jdd = null;
                        } else {
                            textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.iii);
                        }
                    } else {
                        textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.xtq);
                    }
                } else {
                    textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.ui0);
                }
            } else {
                textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) findViewById(R.id.i11);
            }
            if (z && C915980Zwa.LJFF().Nt()) {
                if (constraintLayout != null) {
                    ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                        if (layoutParams != null && (c1142950fqf = this.LLJI) != null && (dividerPosition = c1142950fqf.getDividerPosition()) != null && dividerPosition.length >= 2) {
                            int i3 = i * 2;
                            float f2 = dividerPosition[i3];
                            layoutParams.width = (int) (dividerPosition[i3 + 1] - f2);
                            layoutParams.height = (int) C497740JfY.LIZIZ(16.0f);
                            layoutParams.gravity = 8388627;
                            layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(0.0f);
                            layoutParams.topMargin = (int) C497740JfY.LIZIZ(0.0f);
                            layoutParams.setMarginStart((int) f2);
                            layoutParams.setMarginEnd(0);
                        }
                    } else {
                        layoutParams = null;
                    }
                    C786410Ut5.m6(constraintLayout, layoutParams);
                    C500260Jjc.LLFFF(constraintLayout);
                    if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                        textureViewSurfaceTextureListenerC1288630jdd.setStartFrame(0);
                        C500260Jjc.LLFFF(textureViewSurfaceTextureListenerC1288630jdd);
                        textureViewSurfaceTextureListenerC1288630jdd.setObjectFit(EnumC1311910kFB.COVER);
                        if (i == 0) {
                            f = 1.0f;
                        } else {
                            f = -1.0f;
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
                        textureViewSurfaceTextureListenerC1288630jdd.setScaleX(f);
                        textureViewSurfaceTextureListenerC1288630jdd.setAutoPlay(true);
                        textureViewSurfaceTextureListenerC1288630jdd.setLoop(true);
                        Paint paint = new Paint();
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                        if (i == 0) {
                            i2 = 255;
                        } else {
                            i2 = 178;
                        }
                        paint.setAlpha(i2);
                        textureViewSurfaceTextureListenerC1288630jdd.setLayerType(2, paint);
                        if (textureViewSurfaceTextureListenerC1288630jdd.getPlayer().oi()) {
                            return;
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("enigma_wind_effect");
                    sbLIZ.append(File.separator);
                    sbLIZ.append("data.json");
                    String strLJIIL = LJIIL("tiktok_live_match_enigma_reveal_resource", C2188811AlT.LIZIZ(sbLIZ));
                    if (strLJIIL == null) {
                        strLJIIL = "";
                    }
                    String strLJJIFFI = u.LJJIFFI(strLJIIL, "{local_path}", C1143780fs0.LJIIJ("tiktok_live_match_enigma_reveal_resource", "enigma_wind_effect"), false);
                    if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                        textureViewSurfaceTextureListenerC1288630jdd.setJson(strLJJIFFI);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Enigma Wind Animation Json Updated \n");
                    sbLIZ2.append(strLJJIFFI);
                    C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                textureViewSurfaceTextureListenerC1288630jdd.stop();
            }
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
        }
    }

    public static void LJIIZILJ(final C15DF c15df, final TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd, final String str, EnumC1297350jrh enumC1297350jrh) {
        final boolean z = false;
        EnumC1311910kFB enumC1311910kFB = EnumC1311910kFB.COVER;
        c15df.getClass();
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            textureViewSurfaceTextureListenerC1288630jdd.setStartFrame(0);
            textureViewSurfaceTextureListenerC1288630jdd.setObjectFit(enumC1311910kFB);
            textureViewSurfaceTextureListenerC1288630jdd.setObjectPosition(enumC1297350jrh);
            textureViewSurfaceTextureListenerC1288630jdd.setLayerType(2, null);
            if (LiveMatchEnigmaThreadLogicSetting.INSTANCE.isEnabled()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1296690jqd(c15df, "tiktok_live_match_enigma_reveal_resource", str, textureViewSurfaceTextureListenerC1288630jdd, false, null), 3);
            } else {
                new BPEAThread(new Runnable() { // from class: X.0je3
                    public final /* synthetic */ String LLILLJJLI = "tiktok_live_match_enigma_reveal_resource";

                    public final void LIZ() {
                        C15DF c15df2 = this.LL;
                        String str2 = this.LLILLJJLI;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(File.separator);
                        sbLIZ.append("data.json");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c15df2.getClass();
                        String strLJIIL = C15DF.LJIIL(str2, strLIZIZ);
                        if (strLJIIL == null) {
                            return;
                        }
                        String strLJJIFFI = u.LJJIFFI(strLJIIL, "{local_path}", C1143780fs0.LJIIJ(this.LLILLJJLI, str), false);
                        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = textureViewSurfaceTextureListenerC1288630jdd;
                        HandlerHook.viewPost(textureViewSurfaceTextureListenerC1288630jdd2, new ARunnableS5S1110000_20(textureViewSurfaceTextureListenerC1288630jdd2, strLJJIFFI, z, 5));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$2");
                    }
                }).start();
            }
        }
    }

    public final void LJIL(float f, float f2, float f3, float f4) {
        FrameLayout.LayoutParams layoutParams;
        C1324720kZq matchEmojiAnimFromXml = getMatchEmojiAnimFromXml();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (matchEmojiAnimFromXml != null) {
            layoutParams2 = matchEmojiAnimFromXml.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(f3);
            layoutParams.topMargin = (int) C497740JfY.LIZIZ(f4);
            layoutParams.width = (int) C497740JfY.LIZIZ(f);
            layoutParams.height = (int) C497740JfY.LIZIZ(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    public final void LJFF(boolean z, long j, long j2, long j3, Function0<Unit> function0) {
        int i;
        boolean z2;
        AnimatorSet animatorSet;
        ?? arrayList;
        int iIntValue;
        if (z) {
            i = R.id.mjr;
        } else {
            i = R.id.tky;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(i);
        this.LLLIIL = true;
        if (z) {
            TuxTextView tuxTextView = this.LLJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 4);
            }
            TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLJLLIL;
            if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                C500260Jjc.LJIILIIL(textureViewSurfaceTextureListenerC1288630jdd);
            }
            C500260Jjc.LJIILIIL(this.LLJLILLLLZIIL);
            TuxTextView tuxTextView2 = this.LLJLLL;
            if (tuxTextView2 != null) {
                C500260Jjc.LJIILIIL(tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(LJIIJ(j2, false));
            }
        } else {
            TuxTextView tvRightMatchScoreTextFromXml = getTvRightMatchScoreTextFromXml();
            if (tvRightMatchScoreTextFromXml != null) {
                C786410Ut5.LLLLZLL(tvRightMatchScoreTextFromXml, 4);
            }
            View view = this.LLJLL;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
            TuxTextView tuxTextView4 = this.LLJZ;
            if (tuxTextView4 != null) {
                C500260Jjc.LJIILIIL(tuxTextView4);
            }
            TuxTextView tvRightMatchScoreTextFromXml2 = getTvRightMatchScoreTextFromXml();
            if (tvRightMatchScoreTextFromXml2 != null) {
                tvRightMatchScoreTextFromXml2.setText(LJIIJ(j2, false));
            }
        }
        C476640Imc c476640Imc = C476640Imc.LIZ;
        C0HAZ c0haz = new C0HAZ(z, this, linearLayout, j2, function0);
        c476640Imc.getClass();
        if (j3 >= 1) {
            Context context = linearLayout.getContext();
            C786410Ut5.LJJJJJL(linearLayout);
            C786410Ut5.LJZL(0, linearLayout);
            LiveMatchFixProgressAnimation liveMatchFixProgressAnimation = LiveMatchFixProgressAnimation.INSTANCE;
            if (liveMatchFixProgressAnimation.getValue()) {
                C786410Ut5.Rb(linearLayout, 1.0f);
                C786410Ut5.sc(linearLayout, 1.0f);
            }
            if (liveMatchFixProgressAnimation.getValue()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_X, 1.0f, 1.37f);
                objectAnimatorOfFloat.setDuration(120L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_Y, 1.0f, 1.37f);
                objectAnimatorOfFloat2.setDuration(120L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(1880L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_X, 1.37f, 1.0f);
                objectAnimatorOfFloat3.setDuration(500L);
                objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_Y, 1.37f, 1.0f);
                objectAnimatorOfFloat4.setDuration(500L);
                objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                z2 = false;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet.playSequentially(animatorSet2, valueAnimatorOfFloat, animatorSet3);
                animatorSet.start();
            } else {
                z2 = false;
                animatorSet = null;
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h82, linearLayout, z2);
            viewTd.measure(-2, -2);
            int measuredHeight = viewTd.getMeasuredHeight();
            List listLIZLLL = C476640Imc.LIZLLL(j);
            List listLIZLLL2 = C476640Imc.LIZLLL(j2);
            LinkedList linkedList = (LinkedList) listLIZLLL;
            List listLL = C13LP.LL(listLIZLLL2, linkedList.size());
            if (linkedList.size() != listLL.size()) {
                arrayList = C13BV.INSTANCE;
            } else {
                int size = linkedList.size();
                arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(0);
                }
                int iIntValue2 = 0;
                int size2 = linkedList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int iIntValue3 = ((Number) ListProtector.get(listLIZLLL, i3)).intValue();
                    Integer num = (Integer) C13LP.LJJJLZIJ(i3, listLL);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = iIntValue3;
                    }
                    ListProtector.set(arrayList, i3, Integer.valueOf(Math.min((((iIntValue - iIntValue3) + 10) % 10) + (iIntValue2 * 10) + 10, 24)));
                    iIntValue2 = ((Number) ListProtector.get(arrayList, i3)).intValue() / 10;
                }
            }
            LinkedList linkedList2 = (LinkedList) listLIZLLL2;
            int size3 = (linkedList2.size() - linkedList.size()) + 1;
            if (size3 <= 0) {
                size3 = 1;
            }
            long j4 = j3 / ((long) size3);
            ArrayList arrayList2 = new ArrayList(listLIZLLL);
            C013C c013c = new C013C();
            if (LiveMatchFixProgressAnimation.INSTANCE.getValue()) {
                HandlerHook.viewPostDelay(linearLayout, new ARunnableS76S0200000_7(c013c, c0haz, 37), j3 + (((long) linkedList2.size()) * 120) + 1500);
                if (animatorSet != null) {
                    animatorSet.addListener(new AAListenerS262S0200000_7(c013c, c0haz, 5));
                }
            }
            C476640Imc.LIZJ(measuredHeight, size3, 0, j3, j4, context, linearLayout, arrayList2, listLIZLLL2, arrayList, listLIZLLL, c0haz, c013c, true);
        }
    }

    public final void LIZ(View view, C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, TuxTextView tuxTextView, List<Animator> list, LinearInterpolator linearInterpolator, boolean z) {
        float measuredWidth;
        int width;
        int width2;
        if (view == null) {
            return;
        }
        if (tuxTextView == null) {
            measuredWidth = 0.0f;
        } else {
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = tuxTextView.getMeasuredWidth();
        }
        float fLIZIZ = (int) C497740JfY.LIZIZ(6.0f);
        if (c1324720kZq != null) {
            width = c1324720kZq.getWidth();
        } else {
            width = 0;
        }
        float f = width;
        if (c1324720kZq2 != null) {
            width2 = c1324720kZq2.getWidth();
        } else {
            width2 = 0;
        }
        float fMax = Math.max(f, Math.max(width2, fLIZIZ));
        float fMax2 = Math.max(measuredWidth - fMax, fMax);
        if (fMax <= 0.0f) {
            return;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(4, view);
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
                C786410Ut5.h5(c1324720kZq, 1.0f);
                C786410Ut5.Qc(c1324720kZq, 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.TRANSLATION_X, 0.0f, -fMax);
                objectAnimatorOfFloat.setDuration(480L);
                objectAnimatorOfFloat.setInterpolator(this.LLLLII);
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(objectAnimatorOfFloat);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(280L);
                objectAnimatorOfFloat2.setStartDelay(200L);
                objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat2.addListener(new ALAdapterS25S0100000_31(c1324720kZq, 2));
                arrayList.add(objectAnimatorOfFloat2);
            }
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 0);
                C786410Ut5.h5(c1324720kZq2, 1.0f);
                C786410Ut5.Qc(c1324720kZq2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1324720kZq2, (Property<C1324720kZq, Float>) View.TRANSLATION_X, 0.0f, fMax2);
                objectAnimatorOfFloat3.setDuration(480L);
                objectAnimatorOfFloat3.setInterpolator(this.LLLLII);
                ArrayList arrayList2 = (ArrayList) list;
                arrayList2.add(objectAnimatorOfFloat3);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1324720kZq2, (Property<C1324720kZq, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat4.setDuration(280L);
                objectAnimatorOfFloat4.setStartDelay(200L);
                objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat4.addListener(new ALAdapterS25S0100000_31(c1324720kZq2, 3));
                arrayList2.add(objectAnimatorOfFloat4);
                return;
            }
            return;
        }
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C786410Ut5.h5(c1324720kZq, 0.0f);
            float f2 = -fMax;
            C786410Ut5.Qc(c1324720kZq, f2);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.TRANSLATION_X, f2, 0.0f);
            objectAnimatorOfFloat5.setDuration(480L);
            objectAnimatorOfFloat5.setInterpolator(this.LLLLII);
            ArrayList arrayList3 = (ArrayList) list;
            arrayList3.add(objectAnimatorOfFloat5);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat6.setDuration(280L);
            objectAnimatorOfFloat6.setInterpolator(linearInterpolator);
            objectAnimatorOfFloat6.addListener(new ALAdapterS25S0200000_31(c1324720kZq, view, 4));
            arrayList3.add(objectAnimatorOfFloat6);
        }
        if (c1324720kZq2 == null) {
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq2, 0);
        C786410Ut5.h5(c1324720kZq2, 0.0f);
        C786410Ut5.Qc(c1324720kZq2, fMax2);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(c1324720kZq2, (Property<C1324720kZq, Float>) View.TRANSLATION_X, fMax2, 0.0f);
        objectAnimatorOfFloat7.setDuration(480L);
        objectAnimatorOfFloat7.setInterpolator(this.LLLLII);
        ArrayList arrayList4 = (ArrayList) list;
        arrayList4.add(objectAnimatorOfFloat7);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(c1324720kZq2, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat8.setDuration(280L);
        objectAnimatorOfFloat8.setInterpolator(linearInterpolator);
        objectAnimatorOfFloat8.addListener(new ALAdapterS25S0100000_31(c1324720kZq2, 4));
        arrayList4.add(objectAnimatorOfFloat8);
    }
}
