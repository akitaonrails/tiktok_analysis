package X;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.KidsDraftVideoFeedFragment;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$Companion$mHandler$1;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774712Yn implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$1(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$10(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$11(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$15(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$2(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$3(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$4(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$5(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$6(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$8(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrollStateChanged$9(C19774712Yn c19774712Yn, int i) {
    }

    public static final void onPageScrolled$0(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$10(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$11(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$13(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$14(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$5(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$6(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$7(C19774712Yn c19774712Yn, int i, float f, int i2) {
    }

    public static final void onPageScrolled$9(C19774712Yn c19774712Yn, int i, float f, int i2) {
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
            case 3:
                onPageScrollStateChanged$3(this, i);
                break;
            case 4:
                onPageScrollStateChanged$4(this, i);
                break;
            case 5:
                onPageScrollStateChanged$5(this, i);
                break;
            case 6:
                onPageScrollStateChanged$6(this, i);
                break;
            case 7:
                onPageScrollStateChanged$7(this, i);
                break;
            case 8:
                onPageScrollStateChanged$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageScrollStateChanged$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageScrollStateChanged$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageScrollStateChanged$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageScrollStateChanged$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageScrollStateChanged$13(this, i);
                break;
            case 14:
                onPageScrollStateChanged$14(this, i);
                break;
            case 15:
                onPageScrollStateChanged$15(this, i);
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
            case 3:
                onPageScrolled$3(this, i, f, i2);
                break;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                break;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                break;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                break;
            case 7:
                onPageScrolled$7(this, i, f, i2);
                break;
            case 8:
                onPageScrolled$8(this, i, f, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageScrolled$9(this, i, f, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageScrolled$10(this, i, f, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageScrolled$11(this, i, f, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageScrolled$12(this, i, f, i2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageScrolled$13(this, i, f, i2);
                break;
            case 14:
                onPageScrolled$14(this, i, f, i2);
                break;
            case 15:
                onPageScrolled$15(this, i, f, i2);
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
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            case 5:
                onPageSelected$5(this, i);
                break;
            case 6:
                onPageSelected$6(this, i);
                break;
            case 7:
                onPageSelected$7(this, i);
                break;
            case 8:
                onPageSelected$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageSelected$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageSelected$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageSelected$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageSelected$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageSelected$13(this, i);
                break;
            case 14:
                onPageSelected$14(this, i);
                break;
            case 15:
                onPageSelected$15(this, i);
                break;
        }
    }

    public C19774712Yn(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$12(C19774712Yn c19774712Yn, int i) {
        boolean z;
        C113R c113r = ((C113T) c19774712Yn.l0).LLJJIII;
        if (c113r != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            c113r.LJJIJL(z);
        }
    }

    public static final void onPageScrollStateChanged$13(C19774712Yn c19774712Yn, int i) {
        boolean z;
        C113S c113s = ((C113Z) c19774712Yn.l0).LLJJ;
        if ((c113s instanceof C113S) && c113s != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            c113s.LJJIJL(z);
        }
    }

    public static final void onPageScrollStateChanged$14(C19774712Yn c19774712Yn, int i) {
        C21594419fC c21594419fC;
        C19564311gX c19564311gX;
        C0DXP c0dxp;
        if (i == 0 && (c21594419fC = ((C19564111gV) c19774712Yn.l0).LLILLJJLI) != null) {
            int currentItem = c21594419fC.getCurrentItem();
            C19564111gV c19564111gV = (C19564111gV) c19774712Yn.l0;
            if (c19564111gV.LLJI.indexOfKey(currentItem) >= 0 && (c19564311gX = (C19564311gX) c19564111gV.LLJI.get(currentItem)) != null && (c0dxp = c19564311gX.LJIIJ) != null) {
                c0dxp.LJJIJIIJIL();
            }
        }
    }

    public static final void onPageScrollStateChanged$7(C19774712Yn c19774712Yn, int i) {
        C419260GcG c419260GcGUr2;
        C419260GcG c419260GcGUr22;
        if (i != 0) {
            if (i == 1) {
                ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
                C1462760oAU c1462760oAU = imagePublishFullPagePreviewScene.LLLFZ;
                InterfaceC1453410nvP interfaceC1453410nvP = null;
                if (c1462760oAU == null) {
                    c1462760oAU = null;
                }
                if (!c1462760oAU.LLLIZZ) {
                    InterfaceC1453410nvP interfaceC1453410nvP2 = imagePublishFullPagePreviewScene.LLJZIJLIL;
                    if (interfaceC1453410nvP2 != null) {
                        interfaceC1453410nvP = interfaceC1453410nvP2;
                    }
                    interfaceC1453410nvP.pause(true);
                    ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene2 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
                    imagePublishFullPagePreviewScene2.LLL = true;
                    imagePublishFullPagePreviewScene2.LLLF = false;
                }
                ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene3 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
                imagePublishFullPagePreviewScene3.getClass();
                if (C0C0S.LIZ()) {
                    InterfaceC19715212Bq interfaceC19715212Bq = imagePublishFullPagePreviewScene3.LLLLIIL;
                    if (interfaceC19715212Bq != null) {
                        interfaceC19715212Bq.show();
                        return;
                    }
                    return;
                }
                C120F c120f = imagePublishFullPagePreviewScene3.LLLLIIIILLL;
                if (c120f == null || (c419260GcGUr22 = c120f.Ur2()) == null) {
                    return;
                }
                C12C5.LIZIZ(c419260GcGUr22, 150L, 0.0f, null, 6);
                return;
            }
            return;
        }
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene4 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
        imagePublishFullPagePreviewScene4.getClass();
        if (C0C0S.LIZ()) {
            InterfaceC19715212Bq interfaceC19715212Bq2 = imagePublishFullPagePreviewScene4.LLLLIIL;
            if (interfaceC19715212Bq2 == null) {
                return;
            }
            interfaceC19715212Bq2.hide();
            return;
        }
        C120F c120f2 = imagePublishFullPagePreviewScene4.LLLLIIIILLL;
        if (c120f2 == null || (c419260GcGUr2 = c120f2.Ur2()) == null) {
            return;
        }
        C12C5.LIZJ(c419260GcGUr2, 0L, null, null, 15);
    }

    public static final void onPageSelected$0(C19774712Yn c19774712Yn, int i) {
        ((C19557811fU) c19774712Yn.l0).LJIIIZ();
        C19557811fU c19557811fU = (C19557811fU) c19774712Yn.l0;
        c19557811fU.LJJIZ = c19557811fU.LJJIJ.LJJIJL(i).getKey();
        C19557811fU c19557811fU2 = (C19557811fU) c19774712Yn.l0;
        List<EffectPointModel> listLLILIL = null;
        if (C19558011fW.LIZJ(c19557811fU2.LJIJI, c19557811fU2.LJJIJ, c19557811fU2.LJIJJLI())) {
            C19557811fU c19557811fU3 = (C19557811fU) c19774712Yn.l0;
            c19557811fU3.LIZIZ.prepare().LJ(new C19774512Yl(c19557811fU3, 0), C15O7.LJIIIIZZ, null);
            ((C19557811fU) c19774712Yn.l0).LJIILIIL();
        } else {
            if (C113I.LIZJ(((C19557811fU) c19774712Yn.l0).LJJIJ.LJJIJL(i).getKey())) {
                C128Y c128y = ((C19557811fU) c19774712Yn.l0).LJJIJ.LLJIJIL;
                if (c128y != null) {
                    listLLILIL = ((InterfaceC19557211fO) c128y).LLILIL();
                }
                ((C19557811fU) c19774712Yn.l0).LJIJJ(true);
                ((C19557811fU) c19774712Yn.l0).LJIIZILJ(listLLILIL, true, false);
                return;
            }
            C128Y c128y2 = ((C19557811fU) c19774712Yn.l0).LJJIJ.LLJIJIL;
            if (c128y2 != null) {
                List<EffectPointModel> listLLILIL2 = ((InterfaceC19557211fO) c128y2).LLILIL();
                C19557811fU c19557811fU4 = (C19557811fU) c19774712Yn.l0;
                c19557811fU4.LJIIIIZZ.LJI(listLLILIL2, c19557811fU4.LJJIFFI.LIZ);
            }
            ((C19557811fU) c19774712Yn.l0).LJIIIIZZ.LJIIIIZZ(false);
            ((C19557811fU) c19774712Yn.l0).LJIIZILJ(null, false, false);
        }
    }

    public static final void onPageSelected$1(C19774712Yn c19774712Yn, int i) {
        EffectCategoryResponse effectCategoryResponse;
        ((C19557511fR) c19774712Yn.l0).LJIIIZ();
        C1413450msx c1413450msx = C1413450msx.LIZ;
        C19557511fR c19557511fR = (C19557511fR) c19774712Yn.l0;
        VideoPublishEditModel videoPublishEditModel = c19557511fR.LIZ;
        String str = c19557511fR.LJJJJI;
        c1413450msx.getClass();
        C1413450msx.LJIIIIZZ(videoPublishEditModel, str, false, 0, false);
        C19557511fR c19557511fR2 = (C19557511fR) c19774712Yn.l0;
        C194364112k c194364112k = c19557511fR2.LJJIJIL;
        if (i < c194364112k.LLJ.size()) {
            effectCategoryResponse = (EffectCategoryResponse) ListProtector.get(c194364112k.LLJ, i);
        } else {
            effectCategoryResponse = null;
        }
        c19557511fR2.LJJJJI = effectCategoryResponse.getKey();
        C19557511fR c19557511fR3 = (C19557511fR) c19774712Yn.l0;
        if (C19558011fW.LIZJ(c19557511fR3.LJIL, c19557511fR3.LJJIJIL, c19557511fR3.LJJLI)) {
            ((C19557511fR) c19774712Yn.l0).LJIIJJI();
            ((C19557511fR) c19774712Yn.l0).LJIILL();
            return;
        }
        C128Y c128y = ((C19557511fR) c19774712Yn.l0).LJJIJIL.LLJIJIL;
        if (c128y != null && (c128y instanceof InterfaceC19557211fO)) {
            ((InterfaceC19557211fO) c128y).w4();
            Fragment fragment = ((C19557511fR) c19774712Yn.l0).LJJIJIL.LLJIJIL;
            if (fragment instanceof FilterEffectTabFragment) {
                ((LiveData) ((FilterEffectTabFragment) fragment).LLJJJJJIL.getValue()).setValue(Boolean.valueOf(!r1.ZR()));
            }
        }
        C128Y c128y2 = ((C19557511fR) c19774712Yn.l0).LJJIJIL.LLJIJIL;
        if (c128y2 != null && (c128y2 instanceof InterfaceC19557211fO)) {
            List<EffectPointModel> listLLILIL = ((InterfaceC19557211fO) c128y2).LLILIL();
            C19557511fR c19557511fR4 = (C19557511fR) c19774712Yn.l0;
            c19557511fR4.LJIIIZ.LJI(listLLILIL, c19557511fR4.LJJIIJ.LIZ);
        }
        ((C19557511fR) c19774712Yn.l0).LJIIIZ.LJIIIIZZ(false);
        ((C19557511fR) c19774712Yn.l0).LJIJ(null, false, false);
    }

    public static final void onPageSelected$10(C19774712Yn c19774712Yn, int i) {
        C19554311ev c19554311ev;
        C19553011ei c19553011ei = (C19553011ei) c19774712Yn.l0;
        c19553011ei.LLJJJJLIIL = i;
        C19553511en c19553511en = c19553011ei.LLJJLIIIJLLLLLLLZ;
        if (c19553511en != null && (c19554311ev = c19553511en.LLILZLL.get(i)) != null) {
            c19554311ev.LJ.refresh();
            if (c19554311ev.LIZJ.LIZ == 1 && ((C19552511ed) c19554311ev.LJIIJJI.getValue()).LJ) {
                c19554311ev.LJ.clear();
                ((C19552511ed) c19554311ev.LJIIJJI.getValue()).LJ = false;
                C1749280vcc c1749280vcc = c19554311ev.LJIIJ;
                if (c1749280vcc != null) {
                    C786410Ut5.l9(c1749280vcc, new View.OnClickListener() { // from class: X.11eq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                }
                c19554311ev.LJFF.dispose();
                c19554311ev.LJFF = new C11NJ();
                c19554311ev.LIZIZ(0);
            }
        }
        C19553011ei c19553011ei2 = (C19553011ei) c19774712Yn.l0;
        Pair<Integer, Integer> pair = c19553011ei2.LLJJJJJIL;
        if (pair != null) {
            C19553511en c19553511en2 = c19553011ei2.LLJJLIIIJLLLLLLLZ;
            if (c19553511en2 != null) {
                c19553511en2.LJJIJIL(pair, EnumC19554111et.PREVIEW, 1);
            }
            C19553511en c19553511en3 = c19553011ei2.LLJJLIIIJLLLLLLLZ;
            if (c19553511en3 != null) {
                c19553511en3.LJJIJIL(pair, EnumC19554111et.SELECT, 1);
            }
        }
        C19553011ei c19553011ei3 = (C19553011ei) c19774712Yn.l0;
        c19553011ei3.LLJJJJJIL = null;
        c19553011ei3.LLLLIL().LJFF();
    }

    public static final void onPageSelected$11(C19774712Yn c19774712Yn, int i) {
        C194330111c c194330111c = (C194330111c) c19774712Yn.l0;
        T t = c194330111c.LIZ;
        if (t != 0) {
            c194330111c.LIZ(t);
            c194330111c.LIZIZ(t);
            AbstractC194339111l.LJI(c194330111c, new AwS430S0200000_29(c194330111c, (AbstractC194339111l<int>) t, 99));
        }
    }

    public static final void onPageSelected$12(C19774712Yn c19774712Yn, int i) {
        EffectCategoryResponse effectCategoryResponse;
        String key;
        C19YA c19ya;
        List<EffectPointModel> listLJJIZ;
        C12H3 curSelectedTab;
        EffectCategoryModel effectCategoryModel;
        C113T c113t = (C113T) c19774712Yn.l0;
        C113R c113r = c113t.LLJJIII;
        if (!(c113r instanceof C113R) ? !(c113r instanceof C113Q) || (effectCategoryResponse = (EffectCategoryResponse) C13LP.LJJJLZIJ(i, c113t.LLJJIJI)) == null || (key = effectCategoryResponse.getKey()) == null : (effectCategoryModel = (EffectCategoryModel) C13LP.LJJJLZIJ(i, c113t.LLJJIJIIJIL)) == null || (key = effectCategoryModel.getKey()) == null) {
            key = "";
        }
        C19YA c19ya2 = ((C113T) c19774712Yn.l0).LLJJ;
        if ((c19ya2 == null || (curSelectedTab = c19ya2.getCurSelectedTab()) == null || curSelectedTab.LIZLLL != i) && (c19ya = ((C113T) c19774712Yn.l0).LLJJ) != null) {
            c19ya.selectTab(c19ya.getTabAt(i));
        }
        C113R c113r2 = ((C113T) c19774712Yn.l0).LLJJIII;
        if (c113r2 != null) {
            listLJJIZ = c113r2.LJJIZ(i);
        } else {
            listLJJIZ = null;
        }
        ((C113T) c19774712Yn.l0).LLJJIJIL.BQ2().setValue(new C364270EPx(i, key, listLJJIZ));
    }

    public static final void onPageSelected$13(C19774712Yn c19774712Yn, int i) {
        String strLIZIZ = C194381113b.LIZIZ(((C113Z) c19774712Yn.l0).LLJJIJIIJIL, i);
        C113S c113s = ((C113Z) c19774712Yn.l0).LLJJ;
        List<EffectPointModel> listLJJIZ = null;
        if ((c113s instanceof C113S) && c113s != null) {
            listLJJIZ = c113s.LJJIZ(i);
        }
        ((C113Z) c19774712Yn.l0).LLJJIII.BQ2().setValue(new C364270EPx(i, strLIZIZ, listLJJIZ));
        C113D panelListener = ((C113Z) c19774712Yn.l0).getPanelListener();
        if (panelListener != null) {
            panelListener.LJIJJ(new C364270EPx(i, strLIZIZ, listLJJIZ));
        }
    }

    public static final void onPageSelected$14(C19774712Yn c19774712Yn, int i) {
        C0DXP c0dxp;
        C19564311gX c19564311gX = (C19564311gX) ((C19564111gV) c19774712Yn.l0).LLJI.get(i);
        if (c19564311gX != null && (c0dxp = c19564311gX.LJIIJ) != null) {
            c0dxp.LLILZLL.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$15(C19774712Yn c19774712Yn, int i) {
        ((C19563711gR) ((AbstractC19563811gS) c19774712Yn.l0).LLLLIL()).LIZ.invoke(Integer.valueOf(i));
    }

    public static final void onPageSelected$2(C19774712Yn c19774712Yn, int i) {
        ((C19411010wu) c19774712Yn.l0).setPageSelected(i);
    }

    public static final void onPageSelected$3(C19774712Yn c19774712Yn, int i) {
        C422020Ggi c422020Ggi;
        View view = ((C19649211uE) c19774712Yn.l0).LLJJJJLIIL;
        if ((view instanceof C422020Ggi) && (c422020Ggi = (C422020Ggi) view) != null) {
            c422020Ggi.setSelectedIndex(i);
        }
    }

    public static final void onPageSelected$4(C19774712Yn c19774712Yn, int i) {
        String str;
        InputMethodManager inputMethodManager;
        Iterator<Fragment> it2 = ((MentionUserVideoActivity) c19774712Yn.l0).LLILZ.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof MentionVideoFragment) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i == i2) {
            String str2 = MentionVideoFragment._pnsPageId;
            MentionUserVideoActivity mentionUserVideoActivity = (MentionUserVideoActivity) c19774712Yn.l0;
            String str3 = mentionUserVideoActivity.LLJI;
            C0ZIO.LIZ.getClass();
            if (new C1436840nUg(C0CHQ.LIZ).LIZJ().getBoolean("mention_video_guide_panel", true)) {
                C770750ULh c770750ULh = new C770750ULh();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.x3;
                c770750ULh.LIZ = c0hti.LIZ(mentionUserVideoActivity);
                c770750ULh.LIZLLL = 2;
                c770750ULh.LJ = mentionUserVideoActivity.getString(2131830011);
                c770750ULh.LJ(new C1667580tUq(R.raw.icon_at, null, mentionUserVideoActivity.getString(2131830008), null, 8), new C1667580tUq(R.raw.icon_tilt_light_bulb, null, mentionUserVideoActivity.getString(2131830009), null, 8), new C1667580tUq(R.raw.icon_bell, null, mentionUserVideoActivity.getString(2131830010), null, 8));
                c770750ULh.LJIILLIIL = false;
                c770750ULh.LJI(mentionUserVideoActivity.getString(2131830007), new AwS69S1000000_18(str3, 4));
                c770750ULh.LIZIZ().LIZ.show(mentionUserVideoActivity.getSupportFragmentManager(), "mention_video_educational_panel");
                new C1436840nUg(C0CHQ.LIZ).LIZJ().edit().putBoolean("mention_video_guide_panel", false).apply();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "video_post_page");
                c0lab.LJ("creation_id", str3);
                C20684815ws.LJIILLIIL("show_credits_video_popup", c0lab.LIZ);
            }
        }
        Object systemService = ((MentionUserVideoActivity) c19774712Yn.l0).getSystemService("input_method");
        if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
            inputMethodManager.hideSoftInputFromWindow(((MentionUserVideoActivity) c19774712Yn.l0).getWindow().getDecorView().getWindowToken(), 0);
        }
        MentionUserVideoActivity mentionUserVideoActivity2 = (MentionUserVideoActivity) c19774712Yn.l0;
        mentionUserVideoActivity2.getClass();
        C0LAB c0lab2 = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = mentionUserVideoActivity2.LLIZLLLIL;
        if (videoPublishEditModel != null) {
            C580270MpN.LIZJ(videoPublishEditModel, c0lab2, mentionUserVideoActivity2.LLJ);
            if (i == 0) {
                str = "people";
            } else {
                str = "video";
            }
            c0lab2.LJ("to_status", str);
            C20684815ws.LJIILLIIL("change_at_type", c0lab2.LIZ);
        }
    }

    public static final void onPageSelected$5(C19774712Yn c19774712Yn, int i) {
        C11VF.LIZIZ.LJIILIIL((Fragment) ListProtector.get(((MentionVideoActivity) c19774712Yn.l0).LLIZ, i));
    }

    public static final void onPageSelected$6(C19774712Yn c19774712Yn, int i) {
        C11VF.LIZIZ.LJIILIIL((Fragment) ListProtector.get(((MentionVideoFragment) c19774712Yn.l0).LLJILJIL, i));
        ((MentionVideoFragment) c19774712Yn.l0).VR(i);
    }

    public static final void onPageSelected$7(C19774712Yn c19774712Yn, int i) {
        C419260GcG c419260GcGUr2;
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
        if (imagePublishFullPagePreviewScene.mView == null) {
            return;
        }
        InterfaceC1453410nvP interfaceC1453410nvP = imagePublishFullPagePreviewScene.LLJZIJLIL;
        C19647111tt c19647111tt = null;
        if (interfaceC1453410nvP == null) {
            interfaceC1453410nvP = null;
        }
        interfaceC1453410nvP.kM1(i, 0.0f);
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene2 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
        C19715812Bw c19715812Bw = imagePublishFullPagePreviewScene2.LLLFFI;
        if (c19715812Bw != null) {
            c19715812Bw.LJLJJI(i);
        }
        C19647111tt c19647111tt2 = imagePublishFullPagePreviewScene2.LLLII;
        if (c19647111tt2 != null) {
            c19647111tt = c19647111tt2;
        }
        c19647111tt.LJJIL(i);
        if (((ImagePublishFullPagePreviewScene) c19774712Yn.l0).mView.getVisibility() == 0) {
            ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene3 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
            if (imagePublishFullPagePreviewScene3.LLLILZJ) {
                C857450XkN c857450XkN = C857450XkN.LIZ;
                VideoPublishEditModel videoPublishEditModel = imagePublishFullPagePreviewScene3.LLJJL;
                boolean z = imagePublishFullPagePreviewScene3.LLL;
                c857450XkN.getClass();
                C857450XkN.LIZ(videoPublishEditModel, z, i, "video_post_page", "preview_full_page");
            }
        }
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene4 = (ImagePublishFullPagePreviewScene) c19774712Yn.l0;
        int i2 = i + 1;
        imagePublishFullPagePreviewScene4.getClass();
        if (C0C0S.LIZ()) {
            InterfaceC19715212Bq interfaceC19715212Bq = imagePublishFullPagePreviewScene4.LLLLIIL;
            if (interfaceC19715212Bq != null) {
                interfaceC19715212Bq.vI1(i2);
                return;
            }
            return;
        }
        C120F c120f = imagePublishFullPagePreviewScene4.LLLLIIIILLL;
        if (c120f == null || (c419260GcGUr2 = c120f.Ur2()) == null) {
            return;
        }
        c419260GcGUr2.setCurrentNum(i2);
    }

    public static final void onPageSelected$8(C19774712Yn c19774712Yn, int i) {
        String creationId;
        AwemeDraft awemeDraftLJ;
        String creationId2;
        String creationId3;
        boolean z;
        boolean z2;
        String creationId4;
        VideoPublishEditModel videoPublishEditModel = ((KidsDraftVideoFeedFragment) c19774712Yn.l0).LLIZLLLIL;
        View viewFindViewById = null;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) ListProtector.get(((KidsDraftVideoFeedFragment) c19774712Yn.l0).RR().LLILZLL, i);
        if (creationId != null) {
            if (videoPublishEditModel2 != null) {
                creationId4 = videoPublishEditModel2.getCreationId();
            } else {
                creationId4 = null;
            }
            if (!Intrinsics.LJFF(creationId4, creationId)) {
                KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment = (KidsDraftVideoFeedFragment) c19774712Yn.l0;
                kidsDraftVideoFeedFragment.getClass();
                if (C19460911Bv.LIZLLL()) {
                    if (C19460911Bv.LIZLLL()) {
                        C19460911Bv.LIZ();
                    }
                    C19460311Bp.LIZIZ = 1;
                    C19460311Bp.LIZJ = 0;
                    C19460311Bp.LIZLLL = null;
                    C19459811Bk c19459811BkMR = kidsDraftVideoFeedFragment.MR();
                    if (c19459811BkMR != null) {
                        C19459811Bk.LIZLLL();
                        c19459811BkMR.LIZJ();
                        ImageView imageView = c19459811BkMR.LLILLJJLI;
                        if (imageView == null) {
                            imageView = null;
                        }
                        C786410Ut5.LJZI(8, imageView);
                        TextView textView = c19459811BkMR.LLILLL;
                        if (textView == null) {
                            textView = null;
                        }
                        C786410Ut5.LLIL(textView, 8);
                        C786410Ut5.LLIL(c19459811BkMR.getMDownloadFailedTextView(), 8);
                        TextView textView2 = c19459811BkMR.LLILZ;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        C786410Ut5.LLIL(textView2, 8);
                        TextView textView3 = c19459811BkMR.LLILZIL;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        C786410Ut5.LLIL(textView3, 8);
                        TextView textView4 = c19459811BkMR.LLIZ;
                        if (textView4 == null) {
                            textView4 = null;
                        }
                        C786410Ut5.LLIL(textView4, 8);
                        C786410Ut5.LLIIL(c19459811BkMR.getMDownloadProgressViewRoot(), 8);
                    }
                    kidsDraftVideoFeedFragment.UR(false);
                }
            }
        }
        int count = ((KidsDraftVideoFeedFragment) c19774712Yn.l0).RR().getCount();
        for (int i2 = 0; i2 < count; i2++) {
            C19461011Bw c19461011BwLJJIJIL = ((KidsDraftVideoFeedFragment) c19774712Yn.l0).RR().LJJIJIL(i2);
            if (c19461011BwLJJIJIL != null) {
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c19461011BwLJJIJIL.LIZJ(z2);
            }
        }
        KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment2 = (KidsDraftVideoFeedFragment) c19774712Yn.l0;
        kidsDraftVideoFeedFragment2.LLIZLLLIL = videoPublishEditModel2;
        if (videoPublishEditModel2 != null) {
            new C1438570nXT("VideoPublishFragment");
            awemeDraftLJ = C1438570nXT.LJ(videoPublishEditModel2, "KidsEdit");
        } else {
            awemeDraftLJ = null;
        }
        kidsDraftVideoFeedFragment2.LLJ = awemeDraftLJ;
        KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment3 = (KidsDraftVideoFeedFragment) c19774712Yn.l0;
        kidsDraftVideoFeedFragment3.LLJI = i + 1;
        C19459811Bk c19459811BkMR2 = kidsDraftVideoFeedFragment3.MR();
        if (c19459811BkMR2 != null) {
            VideoPublishEditModel videoPublishEditModel3 = kidsDraftVideoFeedFragment3.LLIZLLLIL;
            if (videoPublishEditModel3 != null) {
                creationId2 = videoPublishEditModel3.getCreationId();
            } else {
                creationId2 = null;
            }
            VideoPublishEditModel videoPublishEditModel4 = C19460311Bp.LIZLLL;
            if (videoPublishEditModel4 != null) {
                creationId3 = videoPublishEditModel4.getCreationId();
            } else {
                creationId3 = null;
            }
            if (creationId2 != null && Intrinsics.LJFF(creationId2, creationId3)) {
                z = true;
            } else {
                z = false;
            }
            if (C19461111Bx.LJ && z) {
                kidsDraftVideoFeedFragment3.UR(true);
                c19459811BkMR2.LJ(C19460311Bp.LIZJ);
            } else {
                VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = C19459811Bk.LLJIJIL;
                if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(1) && z) {
                    kidsDraftVideoFeedFragment3.UR(true);
                    c19459811BkMR2.LIZIZ();
                } else if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(2) && z) {
                    kidsDraftVideoFeedFragment3.UR(true);
                    c19459811BkMR2.LIZ();
                } else {
                    kidsDraftVideoFeedFragment3.UR(false);
                }
            }
        } else {
            kidsDraftVideoFeedFragment3.UR(false);
        }
        if (i == ((KidsDraftVideoFeedFragment) c19774712Yn.l0).RR().getCount() - 1) {
            KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment4 = (KidsDraftVideoFeedFragment) c19774712Yn.l0;
            View view = kidsDraftVideoFeedFragment4.LLILZIL;
            if (view == null) {
                View view2 = kidsDraftVideoFeedFragment4.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.nns);
                }
                kidsDraftVideoFeedFragment4.LLILZIL = (C1607680rwE) viewFindViewById;
                view = viewFindViewById;
            }
            C1607680rwE c1607680rwE = (C1607680rwE) view;
            C1235870iGX c1235870iGXLIZIZ = c1607680rwE.LIZIZ(true);
            if (c1235870iGXLIZIZ != null) {
                c1235870iGXLIZIZ.LJII();
            }
            c1607680rwE.LLIZLLLIL = 1;
            if (c1607680rwE.LLILLJJLI != null) {
                c1607680rwE.LIZ();
            }
            if (c1607680rwE.LLJILJIL != -1 && !TextUtils.isEmpty(c1607680rwE.LLJILJILJ)) {
                c1607680rwE.LLJILJIL = -1L;
            }
        }
    }

    public static final void onPageSelected$9(C19774712Yn c19774712Yn, int i) {
        C194328111a c194328111a;
        InterfaceC19407610wM interfaceC19407610wM;
        C194329111b c194329111b = (C194329111b) c19774712Yn.l0;
        List<List<ReadTextEffectBean>> list = c194329111b.LLJ;
        if (((List) C13LP.LJJJLZIJ(i, list)) != null && (!r0.isEmpty()) && (interfaceC19407610wM = c194329111b.LLJILJIL) != null) {
            interfaceC19407610wM.LLLFFI((ReadTextEffectBean) ListProtector.get((List) ListProtector.get(list, i), 0));
        }
        if (C848680XRa.LIZJ() && (c194328111a = ((C194329111b) c19774712Yn.l0).LLJIJIL) != null) {
            int count = c194328111a.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                C194329111b c194329111b2 = (C194329111b) c19774712Yn.l0;
                List<List<ReadTextEffectBean>> list2 = c194329111b2.LLJ;
                if (((List) C13LP.LJJJLZIJ(i2, list2)) != null && (!r0.isEmpty())) {
                    if (i2 == i) {
                        EditTTSPanelFragment editTTSPanelFragment = (EditTTSPanelFragment) C13LP.LJJJLZIJ(i2, c194329111b2.LLJILJILJ);
                        if (editTTSPanelFragment != null) {
                            editTTSPanelFragment.MR(true);
                        }
                    } else {
                        C19Y3 c19y3 = c194329111b2.LLILLL;
                        View view = null;
                        if (c19y3 == null) {
                            c19y3 = null;
                        }
                        C19Y5 c19y5LJIIIZ = c19y3.LJIIIZ(i2);
                        if (c19y5LJIIIZ != null) {
                            view = c19y5LJIIIZ.LJFF;
                        }
                        if (view instanceof C1642680sqg) {
                            ((C1642680sqg) view).LIZ(C194329111b.LIZIZ((List) ListProtector.get(list2, i2)));
                        }
                    }
                }
            }
        }
    }

    public static final void onPageScrolled$12(C19774712Yn c19774712Yn, int i, float f, int i2) {
        C19YA c19ya;
        C113T c113t = (C113T) c19774712Yn.l0;
        C19YA c19ya2 = c113t.LLJJ;
        if (c19ya2 != null && c19ya2.getVisibility() == 0 && (c19ya = c113t.LLJJ) != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19ya);
            c19ya.setTranslationY(0.0f);
        }
    }

    public static final void onPageScrolled$15(C19774712Yn c19774712Yn, int i, float f, int i2) {
        AbstractC19563811gS abstractC19563811gS = (AbstractC19563811gS) c19774712Yn.l0;
        if (!abstractC19563811gS.LLJLLIL) {
            abstractC19563811gS.LLLLLLL();
        }
    }

    public static final void onPageScrolled$2(C19774712Yn c19774712Yn, int i, float f, int i2) {
        C19411010wu c19411010wu = (C19411010wu) c19774712Yn.l0;
        c19411010wu.LLILZLL = i;
        c19411010wu.LLILZIL = f;
        C786410Ut5.Mc(c19411010wu.LLILLJJLI, c19411010wu.LIZ(f, i));
    }

    public static final void onPageScrolled$8(C19774712Yn c19774712Yn, int i, float f, int i2) {
        if (((KidsDraftVideoFeedFragment) c19774712Yn.l0).LLJIJIL && f == 0.0f && i2 == 0) {
            c19774712Yn.onPageSelected(i);
            ((KidsDraftVideoFeedFragment) c19774712Yn.l0).LLJIJIL = false;
        }
    }
}
