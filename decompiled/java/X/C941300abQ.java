package X;

import Y.AfS57S0110000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941300abQ extends FrameLayout {
    public C1324720kZq LL;
    public ConstraintLayout LLILLJJLI;
    public C16FV LLILLL;
    public ConstraintLayout LLILZ;
    public C1324720kZq LLILZIL;
    public ConstraintLayout LLILZLL;
    public C20743416Fc LLIZ;
    public C16FV LLIZLLLIL;
    public C1324720kZq LLJ;
    public C1126540fQC LLJI;
    public C20743416Fc LLJIJIL;
    public User LLJILJIL;
    public C16FZ LLJILJILJ;
    public TextView LLJILLL;
    public ImageView LLJJ;
    public final C01GW LLJJI;
    public final int[] LLJJIII;
    public final int[] LLJJIJI;
    public Pair<Integer, Integer> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public C11JF LLJJJIL;

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LLJJIJIL.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LLJJJ.getValue();
    }

    private final C941310abR getTalkVolumeAnimHandler() {
        return (C941310abR) this.LLJJI.getValue();
    }

    public final C16FV getIvNetworkStateFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lpm);
            this.LLIZLLLIL = (C16FV) callbackFindViewById;
        }
        return (C16FV) callbackFindViewById;
    }

    public final ConstraintLayout getLayoutTicketFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mgt);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C20743416Fc getNickNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p94);
            this.LLIZ = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final ConstraintLayout getOnlineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pmw);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn1);
            this.LLILZIL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C16FV getOnlinePlayerMuteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn2);
            this.LLILLL = (C16FV) callbackFindViewById;
        }
        return (C16FV) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerMuteVideoBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn4);
            this.LLJ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C20743416Fc getOnlineTicketFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn8);
            this.LLJIJIL = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final C1324720kZq getOnlineVoiceEffectFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pnc);
            this.LL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final ConstraintLayout getPauseContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q3t);
            this.LLILLJJLI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1126540fQC getPauseImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q3u);
            this.LLJI = (C1126540fQC) callbackFindViewById;
        }
        return (C1126540fQC) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getTalkVolumeAnimHandler().LIZIZ = true;
        C11JF c11jf = this.LLJJJIL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        c11jf.dispose();
    }

    public C941300abQ(Context context) {
        int i;
        super(context, null, 0);
        this.LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 819));
        this.LLJJIII = new int[]{R.id.p94, R.id.mgt, R.id.bxc, R.id.pn4, R.id.pnb, R.id.pmu, R.id.lpm};
        this.LLJJIJI = new int[]{R.id.p94, R.id.mgt, R.id.bxc, R.id.pn1, R.id.lpm};
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 817));
        this.LLJJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 818));
        Context context2 = getContext();
        if (C0IXT.LIZ()) {
            i = R.layout.hrt;
        } else {
            i = R.layout.hrs;
        }
        boolean z = FrameLayout.inflate(context2, i, this) instanceof ViewGroup;
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(false);
        }
        this.LLJILJILJ = (C16FZ) findViewById(R.id.nnp);
        this.LLJILLL = (TextView) findViewById(R.id.p94);
        findViewById(R.id.pn8);
        findViewById(R.id.pn_);
        ImageView imageView = (ImageView) findViewById(R.id.lpm);
        this.LLJJ = imageView;
        if (imageView != null) {
            C439101nJ.LJI(imageView);
        }
        C1143680frq.LIZLLL(getOnlinePlayerMuteFromXml(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute2.png");
    }

    public final void LIZIZ(boolean z) {
        C11JF c11jf = this.LLJJJIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        this.LLJJJIL = (C11JF) C11NZ.LJLJJLL(300L, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS57S0110000_15(this, z, 22));
    }

    public final void LJFF(EnumC920920a4Y enumC920920a4Y) {
        ImageView imageView = this.LLJJ;
        if (imageView != null) {
            int i = C936550aTl.LIZ[enumC920920a4Y.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C439101nJ.LJI(imageView);
                    return;
                } else {
                    C12ES.LJIILL(0, imageView);
                    C1143680frq.LIZLLL(imageView, C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multi_guest_network_state_very_bad.png");
                    return;
                }
            }
            C12ES.LJIILL(0, imageView);
            C1143680frq.LIZLLL(imageView, C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multi_guest_network_state_bad.png");
        }
    }

    public final void setCoinNum(long j) {
        String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        if (Intrinsics.LJFF(upperCase, String.valueOf(getOnlineTicketFromXml().getText()))) {
            return;
        }
        getOnlineTicketFromXml().setText(upperCase);
    }

    public final void setIvNetworkStateFromXml(C16FV c16fv) {
        this.LLIZLLLIL = c16fv;
    }

    public final void setLayoutTicketFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setMuteState(boolean z) {
        if (z) {
            C12ES.LJIILL(0, getOnlinePlayerMuteFromXml());
        } else {
            C439101nJ.LJI(getOnlinePlayerMuteFromXml());
        }
    }

    public final void setNickNameFromXml(C20743416Fc c20743416Fc) {
        this.LLIZ = c20743416Fc;
    }

    public final void setOnlineContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setOnlinePlayerAvatarFromXml(C1324720kZq c1324720kZq) {
        this.LLILZIL = c1324720kZq;
    }

    public final void setOnlinePlayerMuteFromXml(C16FV c16fv) {
        this.LLILLL = c16fv;
    }

    public final void setOnlinePlayerMuteVideoBgFromXml(C1324720kZq c1324720kZq) {
        this.LLJ = c1324720kZq;
    }

    public final void setOnlineTicketFromXml(C20743416Fc c20743416Fc) {
        this.LLJIJIL = c20743416Fc;
    }

    public final void setOnlineVoiceEffectFromXml(C1324720kZq c1324720kZq) {
        this.LL = c1324720kZq;
    }

    public final void setPauseContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setPauseImageFromXml(C1126540fQC c1126540fQC) {
        this.LLJI = c1126540fQC;
    }

    public final void setState(EnumC936560aTm enumC936560aTm) {
        C16FZ c16fz = null;
        switch (C936550aTl.LIZIZ[enumC936560aTm.ordinal()]) {
            case 1:
            case 2:
                C16FZ c16fz2 = this.LLJILJILJ;
                if (c16fz2 != null) {
                    c16fz = c16fz2;
                }
                C439101nJ.LJI(c16fz);
                return;
            case 3:
                C16FZ c16fz3 = this.LLJILJILJ;
                if (c16fz3 != null) {
                    c16fz = c16fz3;
                }
                C439101nJ.LJI(c16fz);
                return;
            case 4:
            case 5:
                C16FZ c16fz4 = this.LLJILJILJ;
                if (c16fz4 != null) {
                    c16fz = c16fz4;
                }
                C439101nJ.LJI(c16fz);
                return;
            case 6:
                C16FZ c16fz5 = this.LLJILJILJ;
                if (c16fz5 != null) {
                    c16fz = c16fz5;
                }
                C439101nJ.LJI(c16fz);
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void setUserInfo(User user) {
        this.LLJILJIL = user;
        ImageModel avatarThumb = user.getAvatarThumb();
        LIZ(getOnlinePlayerAvatarFromXml(), avatarThumb);
        LIZJ(avatarThumb, getOnlinePlayerMuteVideoBgFromXml());
        TextView textView = this.LLJILLL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C0KVU.LIZ(user));
    }

    public static void LIZ(C1324720kZq c1324720kZq, ImageModel imageModel) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            int width = c1324720kZq.getWidth();
            int height = c1324720kZq.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
            return;
        }
        C1121670fIL.LJIILIIL(c1324720kZq, imageModel, c1324720kZq.getWidth(), c1324720kZq.getHeight(), R.drawable.el_);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v4, types: [REQUEST, X.0kbR] */
    public static void LIZJ(ImageModel imageModel, C1324720kZq c1324720kZq) {
        String str;
        List urls;
        C1291820jim c1291820jim = new C1291820jim(5);
        if (C1819620xS4.LIZLLL(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) C13LP.LJJJLL(urls);
            } else {
                str = null;
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            if (c1324720kZq != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0abU
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                    }
                };
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
                return;
            }
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291820jim;
        ?? LIZ2 = c1325700kbQLIZJ.LIZ();
        if (c1324720kZq == null) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ2;
        c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq.getController();
        c1320810kTXLIZJ2.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0abV
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
            }
        };
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }

    public final boolean LIZLLL(int i, boolean z) {
        String str;
        Boolean boolValueOf;
        boolean zLJFF;
        InterfaceC1320850kTb controller;
        Animatable animatableLIZ;
        if (!z) {
            C941310abR talkVolumeAnimHandler = getTalkVolumeAnimHandler();
            talkVolumeAnimHandler.LIZIZ = false;
            int iVolumeThreshold = LiveSeiTalkSetting.INSTANCE.volumeThreshold();
            SpeakingVoiceConfig value = LiveMicVoiceSetting.INSTANCE.getValue();
            if (i <= iVolumeThreshold) {
                str = "";
            } else if (i > iVolumeThreshold && i <= value.getLow()) {
                str = "ttlive_sound_wavee_anim_low.webp";
            } else if (i > value.getLow() && i <= value.getHigh()) {
                str = "ttlive_sound_wavee_anim_medium.webp";
            } else {
                str = "ttlive_sound_wavee_anim_high.webp";
            }
            talkVolumeAnimHandler.LIZJ = str;
            C1324720kZq c1324720kZq = talkVolumeAnimHandler.LIZ;
            if (c1324720kZq != null && (controller = c1324720kZq.getController()) != null && (animatableLIZ = controller.LIZ()) != null) {
                boolValueOf = Boolean.valueOf(animatableLIZ.isRunning());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                zLJFF = Intrinsics.LJFF(talkVolumeAnimHandler.LIZJ, "");
            } else {
                talkVolumeAnimHandler.LIZ(talkVolumeAnimHandler.LIZJ);
                zLJFF = Intrinsics.LJFF(talkVolumeAnimHandler.LIZJ, "");
            }
            return !zLJFF;
        }
        getTalkVolumeAnimHandler().LIZIZ = true;
        C500260Jjc.LJIILLIIL(getOnlineVoiceEffectFromXml());
        return false;
    }

    public final void LJ(boolean z, boolean z2, C936540aTk c936540aTk) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        View viewFindViewById;
        View viewFindViewById2;
        int i;
        int i2;
        int iLIZ;
        Animator pauseAlphaOutAnimation;
        ImageModel avatarThumb;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        Boolean boolLJLZ = c936540aTk.LJI.LJLZ();
        if (boolLJLZ != null) {
            zBooleanValue = boolLJLZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolLJLZ2 = c936540aTk.LJ.LJLZ();
        if (boolLJLZ2 != null) {
            zBooleanValue2 = boolLJLZ2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        EnumC920920a4Y enumC920920a4YLIZ = C920910a4X.LIZ(c936540aTk.LJII);
        for (int i3 : this.LLJJIII) {
            ConstraintLayout onlineContainerFromXml = getOnlineContainerFromXml();
            if (onlineContainerFromXml != null && (viewFindViewById5 = onlineContainerFromXml.findViewById(i3)) != null) {
                C12ES.LJIILL(0, viewFindViewById5);
            }
        }
        for (int i4 : this.LLJJIJI) {
            ConstraintLayout onlineContainerFromXml2 = getOnlineContainerFromXml();
            if (onlineContainerFromXml2 != null && (viewFindViewById4 = onlineContainerFromXml2.findViewById(i4)) != null) {
                C12ES.LJIILL(0, viewFindViewById4);
            }
        }
        if (!z) {
            LIZIZ(false);
            setMuteState(zBooleanValue2);
            Pair<Integer, Integer> pair = this.LLJJIJIIJIL;
            if (pair != null) {
                int iIntValue = pair.getFirst().intValue();
                int iIntValue2 = pair.getSecond().intValue();
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iIntValue2;
                    layoutParams.width = iIntValue;
                }
                C786410Ut5.W5(this, layoutParams);
            }
            C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i = layoutParams2.width;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (layoutParams3 != null) {
                i2 = layoutParams3.height;
            } else {
                i2 = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("windowWidth = ");
            sbLIZ.append(i);
            sbLIZ.append(",windowHeight = ");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("GameLinkMicMaskHelper", C2188811AlT.LIZIZ(sbLIZ));
            int iLIZ2 = i2 - C439101nJ.LIZ(45);
            if (i > iLIZ2) {
                i = iLIZ2;
            }
            if (i < C439101nJ.LIZ(45)) {
                iLIZ = C439101nJ.LIZ(30);
            } else {
                int iLIZ3 = C439101nJ.LIZ(45);
                if (i <= C439101nJ.LIZ(70) && iLIZ3 <= i) {
                    iLIZ = C439101nJ.LIZ(40);
                } else {
                    int iLIZ4 = C439101nJ.LIZ(70);
                    if (i <= C439101nJ.LIZ(100) && iLIZ4 <= i) {
                        iLIZ = C439101nJ.LIZ(48);
                    } else {
                        iLIZ = C439101nJ.LIZ(60);
                    }
                }
            }
            C20441214yg.LIZIZ("GameLinkMicMaskHelper", "avatarWidth = " + iLIZ);
            ViewGroup.LayoutParams layoutParams4 = onlinePlayerAvatarFromXml.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = iLIZ;
                layoutParams4.width = iLIZ;
            }
            C786410Ut5.W5(onlinePlayerAvatarFromXml, layoutParams4);
            C941330abT.LIZIZ(getOnlinePlayerAvatarFromXml(), getOnlineVoiceEffectFromXml());
            ConstraintLayout onlineContainerFromXml3 = getOnlineContainerFromXml();
            C16FV onlinePlayerMuteFromXml = getOnlinePlayerMuteFromXml();
            C19MB c19mb = new C19MB();
            c19mb.LJII(onlineContainerFromXml3);
            c19mb.LJFF(onlinePlayerMuteFromXml.getId());
            c19mb.LJJIJ(onlinePlayerMuteFromXml.getId(), onlinePlayerMuteFromXml.getVisibility());
            c19mb.LJIIIIZZ(onlinePlayerMuteFromXml.getId(), 7, 0, 7);
            c19mb.LJIIIIZZ(onlinePlayerMuteFromXml.getId(), 3, 0, 3);
            c19mb.LIZIZ(onlineContainerFromXml3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) onlinePlayerMuteFromXml.getLayoutParams();
            if (z2) {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(12.0f);
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(12.0f);
                marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(6.0f));
                marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(0.0f);
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(6.0f);
            } else {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(16.0f);
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(16.0f);
                marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(8.0f));
                marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(0.0f);
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(8.0f);
            }
            C786410Ut5.W5(onlinePlayerMuteFromXml, marginLayoutParams);
            ConstraintLayout layoutTicketFromXml = getLayoutTicketFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutTicketFromXml.getLayoutParams();
            if (z2) {
                marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
                marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(6.0f);
            } else {
                marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(8.0f);
            }
            C786410Ut5.W5(layoutTicketFromXml, marginLayoutParams2);
            C20743416Fc nickNameFromXml = getNickNameFromXml();
            getOnlineContainerFromXml();
            C19ME c19me = (C19ME) nickNameFromXml.getLayoutParams();
            if (z2) {
                c19me.setMarginStart((int) C497740JfY.LIZIZ(3.0f));
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(6.0f);
                c19me.goneStartMargin = (int) C497740JfY.LIZIZ(6.0f);
            } else {
                c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(8.0f);
                c19me.goneStartMargin = (int) C497740JfY.LIZIZ(8.0f);
            }
            C786410Ut5.W5(nickNameFromXml, c19me);
            C16FV ivNetworkStateFromXml = getIvNetworkStateFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ivNetworkStateFromXml.getLayoutParams();
            if (z2) {
                marginLayoutParams3.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
            } else {
                marginLayoutParams3.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
            }
            C786410Ut5.W5(ivNetworkStateFromXml, marginLayoutParams3);
            LJFF(enumC920920a4YLIZ);
            if (zBooleanValue) {
                for (int i5 : this.LLJJIJI) {
                    ConstraintLayout onlineContainerFromXml4 = getOnlineContainerFromXml();
                    if (onlineContainerFromXml4 != null && (viewFindViewById3 = onlineContainerFromXml4.findViewById(i5)) != null) {
                        C439101nJ.LJI(viewFindViewById3);
                    }
                }
                ConstraintLayout pauseContainerFromXml = getPauseContainerFromXml();
                if (pauseContainerFromXml != null) {
                    C12ES.LJIILL(0, pauseContainerFromXml);
                }
                C439101nJ.LJI(getOnlinePlayerMuteFromXml());
                Animator pauseAlphaInAnimation = getPauseAlphaInAnimation();
                if (pauseAlphaInAnimation != null) {
                    pauseAlphaInAnimation.start();
                }
                if (getPauseImageFromXml() != null) {
                    C1143920fsE c1143920fsE = new C1143920fsE();
                    c1143920fsE.LIZ = getPauseImageFromXml();
                    c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                    if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        c1143920fsE.LIZJ = "ttlive_pause_live_coffee_cup.png";
                    } else {
                        c1143920fsE.LIZJ = "ttlive_pause_live_anim.webp";
                    }
                    c1143920fsE.LJFF = true;
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                }
                User user = this.LLJILJIL;
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                LIZJ(avatarThumb, getOnlinePlayerMuteVideoBgFromXml());
            } else {
                ConstraintLayout pauseContainerFromXml2 = getPauseContainerFromXml();
                if (pauseContainerFromXml2 != null && true == C500260Jjc.LJJJJIZL(pauseContainerFromXml2) && (pauseAlphaOutAnimation = getPauseAlphaOutAnimation()) != null) {
                    pauseAlphaOutAnimation.start();
                }
            }
            C1143680frq.LIZLLL(getOnlinePlayerMuteFromXml(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute2.png");
            return;
        }
        for (int i6 : this.LLJJIII) {
            ConstraintLayout onlineContainerFromXml5 = getOnlineContainerFromXml();
            if (onlineContainerFromXml5 != null && (viewFindViewById2 = onlineContainerFromXml5.findViewById(i6)) != null) {
                C439101nJ.LJI(viewFindViewById2);
            }
        }
        setMuteState(zBooleanValue2);
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new Pair<>(Integer.valueOf(getLayoutParams().width), Integer.valueOf(getLayoutParams().height));
        }
        C941330abT.LIZ(this, 48.0f);
        C941330abT.LIZ(getOnlinePlayerAvatarFromXml(), 40.0f);
        C941330abT.LIZIZ(getOnlinePlayerAvatarFromXml(), getOnlineVoiceEffectFromXml());
        ConstraintLayout onlineContainerFromXml6 = getOnlineContainerFromXml();
        C16FV onlinePlayerMuteFromXml2 = getOnlinePlayerMuteFromXml();
        C1324720kZq onlinePlayerAvatarFromXml2 = getOnlinePlayerAvatarFromXml();
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(onlineContainerFromXml6);
        c19mb2.LJFF(onlinePlayerMuteFromXml2.getId());
        c19mb2.LJJIJ(onlinePlayerMuteFromXml2.getId(), onlinePlayerMuteFromXml2.getVisibility());
        c19mb2.LJIIIIZZ(onlinePlayerMuteFromXml2.getId(), 7, onlinePlayerAvatarFromXml2.getId(), 7);
        c19mb2.LJIIIIZZ(onlinePlayerMuteFromXml2.getId(), 4, onlinePlayerAvatarFromXml2.getId(), 4);
        c19mb2.LIZIZ(onlineContainerFromXml6);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) onlinePlayerMuteFromXml2.getLayoutParams();
        marginLayoutParams4.width = (int) C497740JfY.LIZIZ(14.0f);
        marginLayoutParams4.height = (int) C497740JfY.LIZIZ(14.0f);
        marginLayoutParams4.setMarginEnd((int) C497740JfY.LIZIZ(-4.0f));
        marginLayoutParams4.bottomMargin = (int) C497740JfY.LIZIZ(-2.0f);
        C786410Ut5.W5(onlinePlayerMuteFromXml2, marginLayoutParams4);
        C1143680frq.LIZLLL(getOnlinePlayerMuteFromXml(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute.png");
        if (zBooleanValue) {
            for (int i7 : this.LLJJIJI) {
                ConstraintLayout onlineContainerFromXml7 = getOnlineContainerFromXml();
                if (onlineContainerFromXml7 != null && (viewFindViewById = onlineContainerFromXml7.findViewById(i7)) != null) {
                    C439101nJ.LJI(viewFindViewById);
                }
            }
            C12ES.LJIILL(0, getOnlinePlayerAvatarFromXml());
            C439101nJ.LJI(getPauseContainerFromXml());
            C439101nJ.LJI(getOnlinePlayerMuteFromXml());
        }
        LIZIZ(zBooleanValue);
    }
}
