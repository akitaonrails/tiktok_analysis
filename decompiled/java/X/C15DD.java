package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvalidateGovernanceSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMetaMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15DD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DD extends FrameLayout implements InterfaceC20483715Df {
    public static final Map<String, String> LLJLLIL = C2097608Jq.LJIIIIZZ(new Pair("live_battle_score_animation_clap.webp", "live_battle_score_static_clap.png"), new Pair("live_battle_score_animation_come_on.webp", "live_battle_score_static_come_on.png"), new Pair("live_battle_score_animation_rush.webp", "live_battle_score_static_rush.png"), new Pair("live_battle_score_animation_sad.webp", "live_battle_score_static_sad.png"), new Pair("live_battle_score_animation_sunglasses.webp", "live_battle_score_static_sunglasses.png"), new Pair("live_battle_score_animation_weak.webp", "live_battle_score_static_weak.png"), new Pair("match_blood_shock_wave.webp", "match_blood_shock_wave.png"), new Pair("live_battle_score_animation_clap_20z.webp", "live_battle_score_static_clap.png"), new Pair("live_battle_score_animation_come_on_20z.webp", "live_battle_score_static_come_on.png"), new Pair("live_battle_score_animation_rush_20z.webp", "live_battle_score_static_rush.png"), new Pair("live_battle_score_animation_sad_20z.webp", "live_battle_score_static_sad.png"), new Pair("live_battle_score_animation_sunglasses_20z.webp", "live_battle_score_static_sunglasses.png"), new Pair("live_battle_score_animation_weak_20z.webp", "live_battle_score_static_weak.png"), new Pair("match_blood_shock_wave_10z.webp", "match_blood_shock_wave.png"));
    public C20478815Bi LL;
    public C1324720kZq LLILLJJLI;
    public C1324720kZq LLILLL;
    public C1324720kZq LLILZ;
    public C432120Gx0 LLILZIL;
    public C432120Gx0 LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public C1324720kZq LLJ;
    public C1143100fqu LLJI;
    public View LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public LinearLayout LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public float LLJJI;
    public ValueAnimator LLJJIII;
    public ValueAnimator LLJJIJI;
    public float LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public boolean LLJJL;
    public C15DC LLJJLIIIJLLLLLLLZ;
    public DataChannel LLJL;
    public final EnumC964170bCJ LLJLIL;
    public final C985820blE LLJLILLLLZIIL;
    public final C15DM LLJLL;

    public final void setAnchor(boolean z) {
    }

    public final void LIZ() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        c973660bRc.LJJZ(C500260Jjc.LJIIZILJ(this.LLJL));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C1121570fIB c1121570fIB = new C1121570fIB(room != null ? room.getOwner() : null);
        c1121570fIB.LIZJ = "only_gift_pk_mode";
        HashMap map = new HashMap();
        C973660bRc.LJIJ(c973660bRc, map, false, false, false, 12);
        C973660bRc.LJIJI(map);
        c1121570fIB.LJFF = map;
        c1121570fIB.LJIIIZ = C978520bZS.LJ(false);
        DataChannel dataChannel = this.LLJL;
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public final void LJ() {
        C20483515Dd.LIZ.LJFF(getPkProgressbarAnimFromXml(), "tiktok_live_match_redesign_resource_2", "live_battle_score_animation_weak_20z.webp");
        LIZJ(50.0f, 35.0f, -2.3f, 4.0f);
        LJFF(50.0f);
        this.LLJJLIIIJLLLLLLLZ = C15DC.WEAK;
        C20441214yg.LIZIZ("BattleHealthBarTAG", "animation state = weak");
    }

    public final void LJII() {
        long j = this.LLJJIJIL;
        if (j == -1) {
            return;
        }
        String strLIZIZ = C978440bZK.LIZIZ(this.LLJLILLLLZIIL, j, this.LLJJJIL, false, false);
        if (C978520bZS.LJIIJJI() && strLIZIZ.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("x ");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (this.LLJJJ > 0 && this.LLJLIL == EnumC964170bCJ.MATCH_START) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" + ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        getLeftTextFromXml().setText(strLIZIZ);
    }

    public final void LJIIIIZZ() {
        long j = this.LLJJJIL;
        if (j == -1) {
            return;
        }
        String strLIZIZ = C978440bZK.LIZIZ(this.LLJLILLLLZIIL, j, this.LLJJIJIL, true, false);
        if (C978520bZS.LJIIJJI() && strLIZIZ.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" x");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (this.LLJJJJ > 0 && this.LLJLIL == EnumC964170bCJ.MATCH_START) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" + ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        getRightTextFromXml().setText(strLIZIZ);
    }

    public final C1143100fqu getGiftIconBrightViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iy3);
            this.LLJI = (C1143100fqu) callbackFindViewById;
        }
        return (C1143100fqu) callbackFindViewById;
    }

    public final View getGiftIconMaskViewFromXml() {
        View view = this.LLJIJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.iy7);
        this.LLJIJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final View getLeftEnigmaHiddenScoreIcon() {
        View view = this.LLJILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.mjw);
        this.LLJILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final C1324720kZq getLeftGiftIconIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mk1);
            this.LLILLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C432120Gx0 getLeftTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ml9);
            this.LLILZIL = (C432120Gx0) callbackFindViewById;
        }
        return (C432120Gx0) callbackFindViewById;
    }

    public final FrameLayout getMatchItemEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2d);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getMatchLeftProgressExtraContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2h);
            this.LLJILJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getMatchRightProgressExtraContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o2t);
            this.LLJILJILJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1324720kZq getMiddleAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.obs);
            this.LLILLJJLI = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getPkProgressbarAnimFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qjs);
            this.LLJ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final FrameLayout getRewardAnimContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tj6);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final View getRightEnigmaHiddenScoreIcon() {
        View view = this.LLJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tl2);
        this.LLJJ = viewFindViewById;
        return viewFindViewById;
    }

    public final C1324720kZq getRightGiftIconIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tl8);
            this.LLILZ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C432120Gx0 getRightTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tmi);
            this.LLILZLL = (C432120Gx0) callbackFindViewById;
        }
        return (C432120Gx0) callbackFindViewById;
    }

    public final C20478815Bi getViewProgressbarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_progressbar);
            this.LL = (C20478815Bi) callbackFindViewById;
        }
        return (C20478815Bi) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((ArrayList) C20483515Dd.LJIIIIZZ).remove(this);
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIIZI(EnumC970300bMC.MATCH_HEALTH_BAR);
        super.onDetachedFromWindow();
    }

    private final float getGiftOnlyExtraSpace() {
        return C497740JfY.LJIIZILJ() * 0.08f;
    }

    public final void LJI() {
        if (getPkProgressbarAnimFromXml() == null) {
            return;
        }
        float fLIZ = getViewProgressbarFromXml().LIZ(0.0f);
        C1324720kZq pkProgressbarAnimFromXml = getPkProgressbarAnimFromXml();
        if (pkProgressbarAnimFromXml != null) {
            C786410Ut5.Qc(pkProgressbarAnimFromXml, (fLIZ - ((int) C497740JfY.LIZIZ(getViewProgressbarFromXml().LLJIJIL))) + 11);
        }
        getViewProgressbarFromXml().invalidate();
        FrameLayout rewardAnimContainerFromXml = getRewardAnimContainerFromXml();
        if (rewardAnimContainerFromXml != null) {
            C971140bNY.LIZJ((int) (fLIZ - (((int) C497740JfY.LIZIZ(this.LLJJIJIIJIL)) / 2)), rewardAnimContainerFromXml);
        }
    }

    @Override // X.InterfaceC20483715Df
    public final void dx() {
        FrameLayout rewardAnimContainerFromXml = getRewardAnimContainerFromXml();
        if (rewardAnimContainerFromXml != null) {
            C786410Ut5.LJZ(8, rewardAnimContainerFromXml);
        }
    }

    public final View getLeftTextView$liveinteract_impl_release() {
        return getLeftTextFromXml();
    }

    public final long getLeftValue$liveinteract_impl_release() {
        C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
        if (viewProgressbarFromXml != null) {
            return viewProgressbarFromXml.getLeftValue();
        }
        return 0L;
    }

    public final View getRightTextView$liveinteract_impl_release() {
        return getRightTextFromXml();
    }

    public final long getRightValue$liveinteract_impl_release() {
        C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
        if (viewProgressbarFromXml != null) {
            return viewProgressbarFromXml.getRightValue();
        }
        return 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 29);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 136);
        viewProgressbarFromXml.LLJJJIL = awS610S0100000_31;
        viewProgressbarFromXml.LLJJJJ = awS575S0100000_31;
        C432120Gx0 leftTextFromXml = getLeftTextFromXml();
        if (leftTextFromXml != null) {
            leftTextFromXml.setOptState(false);
        }
        C432120Gx0 rightTextFromXml = getRightTextFromXml();
        if (rightTextFromXml != null) {
            rightTextFromXml.setOptState(false);
        }
        C20478815Bi viewProgressbarFromXml2 = getViewProgressbarFromXml();
        C432120Gx0 leftTextFromXml2 = getLeftTextFromXml();
        C432120Gx0 rightTextFromXml2 = getRightTextFromXml();
        viewProgressbarFromXml2.LL = leftTextFromXml2;
        viewProgressbarFromXml2.LLILLJJLI = rightTextFromXml2;
        C20483515Dd.LIZ(this);
        LJFF(50.0f);
    }

    public final DataChannel getDataChannel() {
        return this.LLJL;
    }

    public final void LJFF(float f) {
        if (getViewProgressbarFromXml() == null) {
            return;
        }
        this.LLJJIJIIJIL = f;
        getViewProgressbarFromXml().setCoverWidth(f);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJL = dataChannel;
    }

    public final void setEmojiAnim(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animation state = emoji, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("BattleHealthBarTAG", C2188811AlT.LIZIZ(sbLIZ));
        float f = this.LLJJI;
        if (f < 0.25f) {
            str2 = "live_battle_score_animation_sad_20z.webp";
        } else if (f >= 0.5f && f != 0.5f) {
            if (f < 0.75f) {
                str2 = "live_battle_score_animation_clap_20z.webp";
            } else {
                str2 = "live_battle_score_animation_sunglasses_20z.webp";
            }
        } else {
            str2 = "live_battle_score_animation_come_on_20z.webp";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("and animationState = ");
        sbLIZ2.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ2.append(" filename = ");
        sbLIZ2.append(str2);
        C20441214yg.LIZIZ("BattleHealthBarTAG", C2188811AlT.LIZIZ(sbLIZ2));
        C20483515Dd.LIZ.LJFF(getPkProgressbarAnimFromXml(), "tiktok_live_match_redesign_resource_2", str2);
        LIZJ(34.0f, 34.0f, 0.0f, 0.0f);
        LJFF(34.0f);
        this.LLJJLIIIJLLLLLLLZ = C15DC.EMOJI;
        LJI();
        C786410Ut5.Yb(getPkProgressbarAnimFromXml(), 1.0f);
        C786410Ut5.LLJJIII(getPkProgressbarAnimFromXml(), 0);
        C786410Ut5.LLJJIII(getMiddleAnimFromXml(), 8);
    }

    public final void setGiftIconBrightViewFromXml(C1143100fqu c1143100fqu) {
        this.LLJI = c1143100fqu;
    }

    public final void setGiftIconMaskViewFromXml(View view) {
        this.LLJIJIL = view;
    }

    public final void setLeftData(C978270bZ3 c978270bZ3) {
        int i = 0;
        C786410Ut5.LLLFF(getLeftTextFromXml(), 0);
        C15DM c15dm = this.LLJLL;
        long j = c978270bZ3.LIZ;
        long j2 = c978270bZ3.LIZJ;
        c15dm.getClass();
        C15DO c15doLIZ = C15DM.LIZ(j, j2, 0L, 0L, false, false, true);
        long j3 = c978270bZ3.LIZJ;
        long j4 = c15doLIZ.LIZ;
        if (this.LLJJIJIL == j4) {
            return;
        }
        this.LLJJJ = Math.max(j3, this.LLJJJ);
        this.LLJJIJIL = j4;
        if (!C978520bZS.LJIIJJI()) {
            getViewProgressbarFromXml().setExtraSpace(0.0f);
        } else {
            getViewProgressbarFromXml().setExtraSpace(getGiftOnlyExtraSpace());
        }
        LIZIZ(j4, getViewProgressbarFromXml().getRightValue());
        LIZLLL(true, c978270bZ3.LIZIZ);
        C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
        if (viewProgressbarFromXml != null) {
            viewProgressbarFromXml.setLeftValue(j4);
        }
        View leftEnigmaHiddenScoreIcon = getLeftEnigmaHiddenScoreIcon();
        if (j3 <= 0 || C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, leftEnigmaHiddenScoreIcon);
    }

    public final void setLeftEnigmaHiddenScoreIcon(View view) {
        this.LLJILLL = view;
    }

    public final void setLeftGiftIconIvFromXml(C1324720kZq c1324720kZq) {
        this.LLILLL = c1324720kZq;
    }

    public final void setLeftTextFromXml(C432120Gx0 c432120Gx0) {
        this.LLILZIL = c432120Gx0;
    }

    public final void setMatchItemEffectContainerFromXml(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setMatchLeftProgressExtraContentFromXml(ConstraintLayout constraintLayout) {
        this.LLJILJIL = constraintLayout;
    }

    public final void setMatchRightProgressExtraContentFromXml(LinearLayout linearLayout) {
        this.LLJILJILJ = linearLayout;
    }

    public final void setMiddleAnimFromXml(C1324720kZq c1324720kZq) {
        this.LLILLJJLI = c1324720kZq;
    }

    public final void setPkProgressbarAnimFromXml(C1324720kZq c1324720kZq) {
        this.LLJ = c1324720kZq;
    }

    public final void setRewardAnimContainerFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setRightEnigmaHiddenScoreIcon(View view) {
        this.LLJJ = view;
    }

    public final void setRightGiftIconIvFromXml(C1324720kZq c1324720kZq) {
        this.LLILZ = c1324720kZq;
    }

    public final void setRightTextFromXml(C432120Gx0 c432120Gx0) {
        this.LLILZLL = c432120Gx0;
    }

    public final void setRightValue(C970820bN2 c970820bN2) {
        int i = 0;
        C786410Ut5.LLLFF(getRightTextFromXml(), 0);
        C15DM c15dm = this.LLJLL;
        long j = c970820bN2.LIZ;
        long j2 = c970820bN2.LIZIZ;
        c15dm.getClass();
        C15DO c15doLIZ = C15DM.LIZ(j, j2, 0L, 0L, false, false, false);
        long j3 = c970820bN2.LIZIZ;
        long j4 = c15doLIZ.LIZ;
        if (this.LLJJJIL == j4) {
            return;
        }
        this.LLJJJJ = Math.max(j3, this.LLJJJJ);
        this.LLJJJIL = j4;
        if (!C978520bZS.LJIIJJI()) {
            getViewProgressbarFromXml().setExtraSpace(0.0f);
        } else {
            getViewProgressbarFromXml().setExtraSpace(getGiftOnlyExtraSpace());
        }
        LIZIZ(getViewProgressbarFromXml().getLeftValue(), j4);
        LIZLLL(false, false);
        C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
        if (viewProgressbarFromXml != null) {
            viewProgressbarFromXml.setRightValue(j4);
        }
        View rightEnigmaHiddenScoreIcon = getRightEnigmaHiddenScoreIcon();
        if (j3 <= 0 || C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, rightEnigmaHiddenScoreIcon);
    }

    public final void setViewProgressbarFromXml(C20478815Bi c20478815Bi) {
        this.LL = c20478815Bi;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ImageModel imageModel;
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        long id;
        long jLongValue;
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
        super.setVisibility(i);
        if (i == 0) {
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJIL(C158B.LIZ());
            C970290bMB.LJJIJ(EnumC970300bMC.MATCH_HEALTH_BAR, true);
            if (C978520bZS.LJIIJJI() && getLeftGiftIconIvFromXml().getVisibility() != 0) {
                C786410Ut5.LLJJIII(getLeftGiftIconIvFromXml(), 0);
                C786410Ut5.LLJJIII(getRightGiftIconIvFromXml(), 0);
                C1324720kZq leftGiftIconIvFromXml = getLeftGiftIconIvFromXml();
                C1324720kZq rightGiftIconIvFromXml = getRightGiftIconIvFromXml();
                InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
                if (interfaceC975810bV5LIZLLL != null && (giftModeMetaV2LJJII2 = interfaceC975810bV5LIZLLL.LJJII()) != null && (anchorGiftModeMetaMap2 = giftModeMetaV2LJJII2.anchorGiftModeMetaByType.get(2L)) != null && (!anchorGiftModeMetaMap2.anchorGiftModeMetas.isEmpty()) && C978520bZS.LJIIJJI()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams3 = leftGiftIconIvFromXml.getLayoutParams();
                    if (layoutParams3 instanceof C19ME) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams2 = null;
                    }
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.width = C439101nJ.LIZ(30);
                        marginLayoutParams2.height = C439101nJ.LIZ(30);
                    }
                    ViewGroup.LayoutParams layoutParams4 = rightGiftIconIvFromXml.getLayoutParams();
                    if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams2.width = C439101nJ.LIZ(30);
                        layoutParams2.height = C439101nJ.LIZ(30);
                    }
                    DataChannel dataChannel = this.LLJL;
                    long jLongValue2 = 0;
                    if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
                        id = owner.getId();
                    } else {
                        id = 0;
                    }
                    List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                    Iterator<C954460awe> it2 = listLLILZLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().LJ));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        long jLongValue3 = ((Number) obj).longValue();
                        if (jLongValue3 != id && jLongValue3 != 0) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        jLongValue = ((Number) ListProtector.get(arrayList2, 0)).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    InterfaceC975810bV5 interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL();
                    if (interfaceC975810bV5LIZLLL2 != null && (giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL2.LJJII()) != null && (anchorGiftModeMetaMap = giftModeMetaV2LJJII.anchorGiftModeMetaByType.get(2L)) != null) {
                        GiftModeMetaList giftModeMetaList = anchorGiftModeMetaMap.anchorGiftModeMetas.get(Long.valueOf(id));
                        if (giftModeMetaList != null && (list2 = giftModeMetaList.giftModeMeta) != null && (giftModeMeta2 = (GiftModeMeta) C13LP.LJJJLZIJ(0, list2)) != null && (imageModel3 = giftModeMeta2.giftIconImage) != null) {
                            leftGiftIconIvFromXml.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.e2v));
                            C0JSS.LIZLLL(leftGiftIconIvFromXml, imageModel3);
                        }
                        if (jLongValue == 0) {
                            Set<Long> setKeySet = anchorGiftModeMetaMap.anchorGiftModeMetas.keySet();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : setKeySet) {
                                long jLongValue4 = ((Number) obj2).longValue();
                                if (jLongValue4 != id && jLongValue4 != 0) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                jLongValue2 = ((Number) ListProtector.get(arrayList3, 0)).longValue();
                            }
                            jLongValue = jLongValue2;
                        }
                        GiftModeMetaList giftModeMetaList2 = anchorGiftModeMetaMap.anchorGiftModeMetas.get(Long.valueOf(jLongValue));
                        if (giftModeMetaList2 != null && (list = giftModeMetaList2.giftModeMeta) != null && (giftModeMeta = (GiftModeMeta) C13LP.LJJJLZIJ(0, list)) != null && (imageModel2 = giftModeMeta.giftIconImage) != null) {
                            rightGiftIconIvFromXml.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.e2y));
                            C0JSS.LIZLLL(rightGiftIconIvFromXml, imageModel2);
                        }
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams5 = leftGiftIconIvFromXml.getLayoutParams();
                    if (layoutParams5 instanceof C19ME) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        marginLayoutParams.width = C439101nJ.LIZ(24);
                        marginLayoutParams.height = C439101nJ.LIZ(24);
                        C786410Ut5.u6(leftGiftIconIvFromXml, marginLayoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams6 = rightGiftIconIvFromXml.getLayoutParams();
                    if ((layoutParams6 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams6) != null) {
                        layoutParams.width = C439101nJ.LIZ(24);
                        layoutParams.height = C439101nJ.LIZ(24);
                        C786410Ut5.u6(rightGiftIconIvFromXml, layoutParams);
                    }
                    leftGiftIconIvFromXml.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.eix));
                    rightGiftIconIvFromXml.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.eiv));
                    GiftMode giftModeLJFF = C978520bZS.LJFF();
                    if (giftModeLJFF != null && (imageModel = giftModeLJFF.giftIconImage) != null) {
                        C0JSS.LIZLLL(leftGiftIconIvFromXml, imageModel);
                        C0JSS.LIZLLL(rightGiftIconIvFromXml, imageModel);
                    }
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        }
    }

    public C15DD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = 0.5f;
        this.LLJJIJIIJIL = 50.0f;
        this.LLJJIJIL = -1L;
        this.LLJJJ = -1L;
        this.LLJJJIL = -1L;
        this.LLJJJJ = -1L;
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = C15DC.MIDDLE;
        this.LLJLIL = EnumC964170bCJ.NONE;
        this.LLJLILLLLZIIL = new C985820blE(false, 0L);
        this.LLJLL = new C15DM();
        C786410Ut5.Sd(R.layout.hgh, C786410Ut5.ne(context), this);
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i3a);
        c1091250eVH.setEnableSizeChange(true);
        c1091250eVH.setEnableFixedSize(true);
        C1143680frq.LIZLLL(getMiddleAnimFromXml(), C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_battle_score_initial_animation.webp");
        C1143680frq.LIZLLL(getLeftEnigmaHiddenScoreIcon(), "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x.png");
        C1143680frq.LIZLLL(getRightEnigmaHiddenScoreIcon(), "tiktok_live_interaction_demand_23", "ttlive_icon_enigma_x.png");
        C500260Jjc.LJLIIIL(500L, getLeftGiftIconIvFromXml(), new AwS610S0100000_31(this, 574));
        C500260Jjc.LJLIIIL(500L, getRightGiftIconIvFromXml(), new AwS610S0100000_31(this, 575));
        getLeftGiftIconIvFromXml().setBackground(C800330VaR.LIZIZ(context, R.drawable.eix));
        getRightGiftIconIvFromXml().setBackground(C800330VaR.LIZIZ(context, R.drawable.eiv));
        if (!LiveMatchInvalidateGovernanceSettings.INSTANCE.isEnabled()) {
            setClipChildren(false);
        }
    }

    public final void LIZIZ(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return;
        }
        C786410Ut5.LLJJIII(getMiddleAnimFromXml(), 8);
        C786410Ut5.LLJJIII(getPkProgressbarAnimFromXml(), 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leftValue =");
        sbLIZ.append(j);
        sbLIZ.append(" rightValue = ");
        sbLIZ.append(j2);
        sbLIZ.append(" and animationState = ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("RedesignHealth", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJLIIIJLLLLLLLZ != C15DC.EMOJI) {
            C15DC c15dc = C15DC.SHOCK;
            long j3 = j - this.LLJJJJJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("animationSTate = ");
            sbLIZ2.append(this.LLJJLIIIJLLLLLLLZ);
            sbLIZ2.append(" leftChangedValue = ");
            sbLIZ2.append(j3);
            sbLIZ2.append(" oldRightValue ");
            sbLIZ2.append(this.LLJJJJLIIL);
            C20441214yg.LJ("BattleHealthBarTAG", C2188811AlT.LIZIZ(sbLIZ2));
            if (j3 >= 1000) {
                C15DC c15dc2 = this.LLJJLIIIJLLLLLLLZ;
                C15DC c15dc3 = C15DC.STRONG;
                if (c15dc2 != c15dc3) {
                    C20483515Dd.LIZ.LJFF(getPkProgressbarAnimFromXml(), "tiktok_live_match_redesign_resource_2", "live_battle_score_animation_rush_20z.webp");
                    LIZJ(55.0f, 28.0f, 1.0f, 0.0f);
                    LJFF(50.0f);
                    this.LLJJLIIIJLLLLLLLZ = c15dc3;
                    C20441214yg.LIZIZ("BattleHealthBarTAG", "animation state = strong");
                }
            } else if (j3 > 0) {
                if (this.LLJJLIIIJLLLLLLLZ != C15DC.WEAK) {
                    LJ();
                }
            } else if (this.LLJJJJJIL == 0 && this.LLJJJJLIIL == 0) {
                if (this.LLJJLIIIJLLLLLLLZ != C15DC.WEAK) {
                    LJ();
                }
            } else if (this.LLJJLIIIJLLLLLLLZ == c15dc) {
                LJ();
            }
            this.LLJJJJJIL = j;
            this.LLJJJJLIIL = j2;
            this.LLJJL = true;
            C20478815Bi viewProgressbarFromXml = getViewProgressbarFromXml();
            if (viewProgressbarFromXml != null) {
                viewProgressbarFromXml.setAnimationToRight(this.LLJJL);
            }
        }
    }

    public final void LIZLLL(boolean z, boolean z2) {
        float f;
        if (z) {
            LJII();
            LJIIIIZZ();
            ValueAnimator valueAnimator = this.LLJJIII;
            if ((valueAnimator != null && valueAnimator.isRunning()) || getLeftTextFromXml().getVisibility() == 8) {
                return;
            }
            float[] fArr = new float[2];
            fArr[0] = 1.0f;
            if (z2) {
                f = 2.0f;
            } else {
                f = 1.3f;
            }
            fArr[1] = f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            this.LLJJIII = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(200L);
            }
            ValueAnimator valueAnimator2 = this.LLJJIII;
            if (valueAnimator2 != null) {
                valueAnimator2.setRepeatCount(1);
            }
            ValueAnimator valueAnimator3 = this.LLJJIII;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatMode(2);
            }
            ValueAnimator valueAnimator4 = this.LLJJIII;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new AUListenerS278S0100000_31(this, 68));
            }
            ValueAnimator valueAnimator5 = this.LLJJIII;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        } else {
            LJIIIIZZ();
            LJII();
            ValueAnimator valueAnimator6 = this.LLJJIJI;
            if ((valueAnimator6 == null || !valueAnimator6.isRunning()) && getRightTextFromXml().getVisibility() != 8) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 1.3f);
                this.LLJJIJI = valueAnimatorOfFloat2;
                if (valueAnimatorOfFloat2 != null) {
                    valueAnimatorOfFloat2.setDuration(200L);
                }
                ValueAnimator valueAnimator7 = this.LLJJIJI;
                if (valueAnimator7 != null) {
                    valueAnimator7.setRepeatCount(1);
                }
                ValueAnimator valueAnimator8 = this.LLJJIJI;
                if (valueAnimator8 != null) {
                    valueAnimator8.setRepeatMode(2);
                }
                ValueAnimator valueAnimator9 = this.LLJJIJI;
                if (valueAnimator9 != null) {
                    valueAnimator9.addUpdateListener(new AUListenerS278S0100000_31(this, 69));
                }
                ValueAnimator valueAnimator10 = this.LLJJIJI;
                if (valueAnimator10 != null) {
                    valueAnimator10.start();
                }
            } else {
                return;
            }
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        ViewGroup.LayoutParams layoutParams;
        C1324720kZq pkProgressbarAnimFromXml = getPkProgressbarAnimFromXml();
        if (pkProgressbarAnimFromXml != null) {
            layoutParams = pkProgressbarAnimFromXml.getLayoutParams();
        } else {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = (int) C497740JfY.LIZIZ(f3);
        layoutParams2.topMargin = (int) C497740JfY.LIZIZ(f4);
        layoutParams2.width = (int) C497740JfY.LIZIZ(f);
        layoutParams2.height = (int) C497740JfY.LIZIZ(f2);
        C1324720kZq pkProgressbarAnimFromXml2 = getPkProgressbarAnimFromXml();
        if (pkProgressbarAnimFromXml2 != null) {
            C786410Ut5.u6(pkProgressbarAnimFromXml2, layoutParams2);
        }
    }
}
