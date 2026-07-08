package X;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraTypeChannel;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19LR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LR implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$1(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$10(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$11(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$2(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$3(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$4(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$5(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$6(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$7(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$8(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationRepeat$9(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$0(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$10(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$11(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$2(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$4(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$6(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$7(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$8(C19LR c19lr, Animation animation) {
    }

    public static final void onAnimationStart$9(C19LR c19lr, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                break;
            case 1:
                onAnimationEnd$1(this, animation);
                break;
            case 2:
                onAnimationEnd$2(this, animation);
                break;
            case 3:
                onAnimationEnd$3(this, animation);
                break;
            case 4:
                onAnimationEnd$4(this, animation);
                break;
            case 5:
                onAnimationEnd$5(this, animation);
                break;
            case 6:
                onAnimationEnd$6(this, animation);
                break;
            case 7:
                onAnimationEnd$7(this, animation);
                break;
            case 8:
                onAnimationEnd$8(this, animation);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animation);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animation);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                break;
            case 1:
                onAnimationRepeat$1(this, animation);
                break;
            case 2:
                onAnimationRepeat$2(this, animation);
                break;
            case 3:
                onAnimationRepeat$3(this, animation);
                break;
            case 4:
                onAnimationRepeat$4(this, animation);
                break;
            case 5:
                onAnimationRepeat$5(this, animation);
                break;
            case 6:
                onAnimationRepeat$6(this, animation);
                break;
            case 7:
                onAnimationRepeat$7(this, animation);
                break;
            case 8:
                onAnimationRepeat$8(this, animation);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationRepeat$9(this, animation);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationRepeat$10(this, animation);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationRepeat$11(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                break;
            case 1:
                onAnimationStart$1(this, animation);
                break;
            case 2:
                onAnimationStart$2(this, animation);
                break;
            case 3:
                onAnimationStart$3(this, animation);
                break;
            case 4:
                onAnimationStart$4(this, animation);
                break;
            case 5:
                onAnimationStart$5(this, animation);
                break;
            case 6:
                onAnimationStart$6(this, animation);
                break;
            case 7:
                onAnimationStart$7(this, animation);
                break;
            case 8:
                onAnimationStart$8(this, animation);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$9(this, animation);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$10(this, animation);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$11(this, animation);
                break;
        }
    }

    public C19LR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(C19LR c19lr, Animation animation) {
        AnonymousClass1967 anonymousClass1967 = (AnonymousClass1967) c19lr.l0;
        anonymousClass1967.LLIZLLLIL = true;
        if (anonymousClass1967.LLILZIL != null) {
            HandlerHook.viewPostDelay(anonymousClass1967.LLILZIL, anonymousClass1967.LLJILJILJ, 3000L);
        }
    }

    public static final void onAnimationEnd$1(C19LR c19lr, Animation animation) {
        ((AnonymousClass1967) c19lr.l0).LJJJJLL(true);
    }

    public static final void onAnimationEnd$10(C19LR c19lr, Animation animation) {
        Activity activityHS = ((MiniGameFragment) c19lr.l0).hS();
        if (activityHS != null) {
            final MiniGameFragment miniGameFragment = (MiniGameFragment) c19lr.l0;
            activityHS.runOnUiThread(new Runnable() { // from class: X.18q9
                public final void LIZ() throws Throwable {
                    EditText keyboardEt;
                    MiniGameFragment miniGameFragment2 = miniGameFragment;
                    miniGameFragment2.A = false;
                    C21406418py c21406418py = miniGameFragment2.C;
                    if (c21406418py == null || c21406418py.getVisibility() != 8) {
                        C21406418py c21406418py2 = miniGameFragment2.C;
                        Editable editableLLJILLL = null;
                        EditText keyboardEt2 = c21406418py2 != null ? c21406418py2.getKeyboardEt() : null;
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        int i = C2187451AjH.LIZ;
                        if (keyboardEt2 != null) {
                            ((InputMethodManager) C786410Ut5.H2(contextLIZ, "input_method")).hideSoftInputFromWindow(keyboardEt2.getWindowToken(), 0);
                        }
                        C21406418py c21406418py3 = miniGameFragment2.C;
                        if (c21406418py3 != null) {
                            int visibility = c21406418py3.getVisibility();
                            c21406418py3.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c21406418py3);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C21406418py c21406418py4 = miniGameFragment2.C;
                            if (c21406418py4 != null && (keyboardEt = c21406418py4.getKeyboardEt()) != null) {
                                editableLLJILLL = C2204961BRm.LLJILLL(keyboardEt, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkiIup8KOOCryrpYUNFCQr7u9i+KqtycW6TH3eAUIbGoofeKE", null));
                            }
                            jSONObject.put("value", String.valueOf(editableLLJILLL));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i2 = C2187451AjH.LIZ;
                            C1720106oR.LIZ("minis-MiniGameFragment", e.getStackTrace().toString());
                        }
                        IMiniGameRuntimeAPI iMiniGameRuntimeAPINT = miniGameFragment2.nT();
                        if (iMiniGameRuntimeAPINT != null) {
                            iMiniGameRuntimeAPINT.emitJSAPIEvent("onKeyboardComplete", jSONObject);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MiniGameFragment@6eb9.hideKeyboardInputViewWithAnimation$1$onAnimationEnd$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MiniGameFragment@6eb9.hideKeyboardInputViewWithAnimation$1$onAnimationEnd$1");
                }
            });
        }
    }

    public static final void onAnimationEnd$11(C19LR c19lr, Animation animation) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        C21194617wu c21194617wu;
        if (C21198717xZ.LIZ() && (c21194617wu = ((C21203617yM) c19lr.l0).LLJJ) != null) {
            c21194617wu.LIZ();
        }
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) ((C21203617yM) c19lr.l0).LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LJJIL();
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("trans to init data");
        C21203617yM c21203617yM = (C21203617yM) c19lr.l0;
        PopupCardVO popupCardVO = c21203617yM.LL;
        if (popupCardVO != null) {
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) != null) {
                if (numValueOf.intValue() == 2) {
                    c21203617yM.LLJJIJIL.LIZ(1);
                    return;
                } else if (numValueOf.intValue() == 3) {
                    c21203617yM.LLJJIJIL.LIZ(2);
                    return;
                }
            }
            c21203617yM.LLJJIJIL.LIZ(-1);
        }
    }

    public static final void onAnimationEnd$2(C19LR c19lr, Animation animation) {
        FrameLayout frameLayout = ((AnonymousClass1965) c19lr.l0).LLIZLLLIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
    }

    public static final void onAnimationEnd$3(C19LR c19lr, Animation animation) {
        LinearLayout linearLayoutOR = ((LiveCoverCameraFragment) c19lr.l0).OR();
        if (linearLayoutOR != null) {
            C786410Ut5.W4(linearLayoutOR, 1.0f);
        }
        LiveCoverCameraFragment liveCoverCameraFragment = (LiveCoverCameraFragment) c19lr.l0;
        DataChannel dataChannel = liveCoverCameraFragment.LLJILLL;
        C19I2 c19i2 = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C19I2 c19i22 = liveCoverCameraFragment.LLJJ;
        if (c19i22 != null) {
            c19i2 = c19i22;
        }
        dataChannel.zW(LiveCoverCameraTypeChannel.class, Integer.valueOf(1 - c19i2.LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$4(X.C19LR r4, android.view.animation.Animation r5) {
        /*
            java.lang.Object r0 = r4.l0
            X.17yK r0 = (X.C21203417yK) r0
            T extends android.view.View r0 = r0.LLILZIL
            X.17yF r0 = (X.AbstractC21202917yF) r0
            if (r0 == 0) goto Ld
            r0.LJJIL()
        Ld:
            java.lang.Object r3 = r4.l0
            X.17yK r3 = (X.C21203417yK) r3
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r3.LL
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r0.flashSaleAtmosphereInfo
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r0 = r0.flashSaleAtmosphere
            if (r0 == 0) goto L4b
            int r0 = r0.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 2
            if (r1 == 0) goto L4b
            int r0 = r1.intValue()
            if (r0 != r2) goto L3e
            X.17yP r1 = r3.LLJJIJIL
            r0 = 1
            r1.LIZ(r0)
        L32:
            java.lang.Object r0 = r4.l0
            X.17yK r0 = (X.C21203417yK) r0
            X.17wt r0 = r0.LLJJ
            if (r0 == 0) goto L3d
            r0.LIZ()
        L3d:
            return
        L3e:
            int r1 = r1.intValue()
            r0 = 3
            if (r1 != r0) goto L4b
            X.17yP r0 = r3.LLJJIJIL
            r0.LIZ(r2)
            goto L32
        L4b:
            X.17yP r1 = r3.LLJJIJIL
            r0 = -1
            r1.LIZ(r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19LR.onAnimationEnd$4(X.19LR, android.view.animation.Animation):void");
    }

    public static final void onAnimationEnd$5(C19LR c19lr, Animation animation) {
        int i;
        LinearLayout linearLayout = (LinearLayout) ((com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment) c19lr.l0).LLJJJJLIIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, 1.0f);
        }
        com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment liveCoverCameraFragment = (com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment) c19lr.l0;
        com.ss.android.ugc.profile.business.ur.camera.datachannel.DataChannel dataChannel = liveCoverCameraFragment.LLIZLLLIL;
        if (dataChannel != null) {
            C21514619Hs c21514619Hs = liveCoverCameraFragment.LLJ;
            if (c21514619Hs != null) {
                i = c21514619Hs.LIZLLL;
            } else {
                i = 0;
            }
            dataChannel.yQ2(com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraTypeChannel.class, Integer.valueOf(1 - i));
        }
    }

    public static final void onAnimationEnd$6(C19LR c19lr, Animation animation) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        C21194517wt c21194517wt;
        if (C21198717xZ.LIZ() && (c21194517wt = ((C21203517yL) c19lr.l0).LLJJ) != null) {
            c21194517wt.LIZ();
        }
        T t = ((C21203517yL) c19lr.l0).LLILZIL;
        if (t instanceof InterfaceC21198817xa) {
            ((InterfaceC21198817xa) t).LLJI();
        }
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) ((C21203517yL) c19lr.l0).LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.LJJIL();
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("trans to init data");
        UsPopupCardVO usPopupCardVO = ((C21203517yL) c19lr.l0).LL;
        if (usPopupCardVO != null && (!C21194017wo.LIZIZ(usPopupCardVO))) {
            C21203517yL c21203517yL = (C21203517yL) c19lr.l0;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) != null) {
                if (numValueOf.intValue() == 2) {
                    c21203517yL.LLJJIJIL.LIZ(1);
                    return;
                } else if (numValueOf.intValue() == 3) {
                    c21203517yL.LLJJIJIL.LIZ(2);
                    return;
                }
            }
            c21203517yL.LLJJIJIL.LIZ(-1);
        }
    }

    public static final void onAnimationEnd$7(C19LR c19lr, Animation animation) {
        T t = ((C21203517yL) c19lr.l0).LLILZIL;
        if (t instanceof InterfaceC21198817xa) {
            ((InterfaceC21198817xa) t).LLLZLZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$8(X.C19LR r4, android.view.animation.Animation r5) {
        /*
            java.lang.Object r0 = r4.l0
            X.17yN r0 = (X.C21203717yN) r0
            T extends android.view.View r0 = r0.LLILZIL
            X.17y8 r0 = (X.AbstractC21202217y8) r0
            if (r0 == 0) goto Ld
            r0.LJJIL()
        Ld:
            java.lang.Object r3 = r4.l0
            X.17yN r3 = (X.C21203717yN) r3
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r3.LL
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r0.flashSaleAtmosphereInfo
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r0 = r0.flashSaleAtmosphere
            if (r0 == 0) goto L4b
            int r0 = r0.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 2
            if (r1 == 0) goto L4b
            int r0 = r1.intValue()
            if (r0 != r2) goto L3e
            X.17yO r1 = r3.LLJJIJIL
            r0 = 1
            r1.LIZ(r0)
        L32:
            java.lang.Object r0 = r4.l0
            X.17yN r0 = (X.C21203717yN) r0
            X.17wu r0 = r0.LLJJ
            if (r0 == 0) goto L3d
            r0.LIZ()
        L3d:
            return
        L3e:
            int r1 = r1.intValue()
            r0 = 3
            if (r1 != r0) goto L4b
            X.17yO r0 = r3.LLJJIJIL
            r0.LIZ(r2)
            goto L32
        L4b:
            X.17yO r1 = r3.LLJJIJIL
            r0 = -1
            r1.LIZ(r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19LR.onAnimationEnd$8(X.19LR, android.view.animation.Animation):void");
    }

    public static final void onAnimationEnd$9(C19LR c19lr, Animation animation) {
        C195H c195h = ((C195F) c19lr.l0).LIZJ;
        if (!c195h.LIZIZ) {
            c195h.LIZIZ = true;
            c195h.LIZ.run();
        }
        animation.setAnimationListener(null);
    }

    public static final void onAnimationStart$1(C19LR c19lr, Animation animation) {
        ((AnonymousClass1967) c19lr.l0).LLIZLLLIL = false;
    }

    public static final void onAnimationStart$3(C19LR c19lr, Animation animation) {
        LinearLayout linearLayoutOR = ((LiveCoverCameraFragment) c19lr.l0).OR();
        if (linearLayoutOR != null) {
            C786410Ut5.W4(linearLayoutOR, 0.5f);
        }
    }

    public static final void onAnimationStart$5(C19LR c19lr, Animation animation) {
        LinearLayout linearLayout = (LinearLayout) ((com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment) c19lr.l0).LLJJJJLIIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, 0.5f);
        }
    }
}
