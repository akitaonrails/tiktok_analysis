package Y;

import X.C098200Yq;
import X.C0EBE;
import X.C0J19;
import X.C0J1D;
import X.C0JEP;
import X.C0JES;
import X.C1390380mHk;
import X.C189200o6;
import X.C19A3;
import X.C2350509Ix;
import X.C418440Gaw;
import X.C526910KlV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC538230L8z;
import X.InterfaceC526970Klb;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromote3PhotoWidget;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AutoCutStyleNextBtnConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS526S0100000_7 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS526S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        LivePromote3PhotoWidget livePromote3PhotoWidget = (LivePromote3PhotoWidget) aObjectS526S0100000_7.l0;
        livePromote3PhotoWidget.getClass();
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(livePromote3PhotoWidget.LLILZLL.pictures.get(iIntValue).bgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            int iIntValue3 = num.intValue();
            try {
                c098200Yq2 = Integer.valueOf(Color.parseColor(livePromote3PhotoWidget.LLILZLL.pictures.get(iIntValue2).bgColor));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj3 = c098200Yq2;
            }
            Integer num2 = (Integer) obj3;
            if (num2 != null) {
                ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(livePromote3PhotoWidget.LLJJLIIIJLLLLLLLZ, "backgroundColor", iIntValue3, num2.intValue());
                objectAnimatorOfArgb.setEvaluator(new ArgbEvaluator());
                objectAnimatorOfArgb.setDuration(350L);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(livePromote3PhotoWidget.LLJJL, "alpha", 1.0f, 0.3f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(livePromote3PhotoWidget.LLJJL, "alpha", 0.3f, 1.0f);
                objectAnimatorOfFloat.addListener(new ALAdapterS1S0101000_7(livePromote3PhotoWidget, iIntValue2, 0));
                long j = 350 / ((long) 2);
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat2.setDuration(j);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfArgb).with(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
                animatorSet.start();
            }
        }
        LivePromote3PhotoWidget livePromote3PhotoWidget2 = (LivePromote3PhotoWidget) aObjectS526S0100000_7.l0;
        livePromote3PhotoWidget2.LLJJJJJIL.removeCallbacks(livePromote3PhotoWidget2.LLJL);
        LivePromote3PhotoWidget livePromote3PhotoWidget3 = (LivePromote3PhotoWidget) aObjectS526S0100000_7.l0;
        C786410Ut5.LJLIIL(livePromote3PhotoWidget3.LLJJJJ, livePromote3PhotoWidget3.LLJJJJJIL, livePromote3PhotoWidget3.LLJL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        C0J19 c0j19;
        C0JES c0jes;
        OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MaterialSelectPagingScene materialSelectPagingScene = (MaterialSelectPagingScene) aObjectS526S0100000_7.l0;
        C0J1D c0j1d = materialSelectPagingScene.LLLFF;
        if (c0j1d != null && (c0j19 = materialSelectPagingScene.LLLF) != null && (c0jes = materialSelectPagingScene.LLLII) != null) {
            c0jes.LJII(onThisDayTiktokMediaModel, c0j1d, c0j19, zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        C19A3 c19a3;
        C526910KlV c526910KlV;
        final View view = (View) obj;
        final OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) obj2;
        if (!((C0JEP) aObjectS526S0100000_7.l0).LLLI(onThisDayTiktokMediaModel)) {
            final C0JEP c0jep = (C0JEP) aObjectS526S0100000_7.l0;
            Scene sceneLIZ = C0EBE.LIZ(view);
            if (sceneLIZ != null) {
                C19A3 c19a32 = (C19A3) sceneLIZ;
                c0jep.getClass();
                final ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = new ChoosePhotoPreviewPageConfig(0);
                choosePhotoPreviewPageConfig.showDockInPreviewPage = true;
                choosePhotoPreviewPageConfig.minSelectedPhotoCount = 1;
                choosePhotoPreviewPageConfig.showAutoCutBtn = true;
                choosePhotoPreviewPageConfig.hideAutoCutWithShowAutoCutModel = true;
                choosePhotoPreviewPageConfig.nextRuleAdjustment = true;
                choosePhotoPreviewPageConfig.forceHideMediaRecyclerView = true;
                choosePhotoPreviewPageConfig.autoCutStyleNextBtnConfig = new AutoCutStyleNextBtnConfig(16.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                InterfaceC526970Klb interfaceC526970Klb = new InterfaceC526970Klb() { // from class: X.0JEU
                    @Override // X.InterfaceC526970Klb
                    public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel) {
                        return true;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final boolean LJ(TikTokMediaModel tikTokMediaModel) {
                        return true;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final int LJI() {
                        return 3;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC526970Klb
                    public final boolean LJIIIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final boolean LIZ() {
                        return c0jep.LLIZ.size() >= c0jep.LLLFZ();
                    }

                    @Override // X.InterfaceC526970Klb
                    public final int LIZIZ() {
                        return onThisDayTiktokMediaModel.originIndex;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final List<TikTokMediaModel> LIZJ() {
                        return c0jep.LLIZ;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final boolean LJII() {
                        return choosePhotoPreviewPageConfig.supportRepeatSelect;
                    }

                    @Override // X.InterfaceC526970Klb
                    public final View LJFF(TikTokMediaModel tikTokMediaModel) {
                        return view;
                    }
                };
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "PREVIEW_CONFIG", choosePhotoPreviewPageConfig);
                C786410Ut5.LJJIJL(bundle, "key_short_video_context", c0jep.LLILLJJLI);
                bundle.putBoolean("from_album_thumbnail", false);
                ChooseMediaViewModel chooseMediaViewModel = c0jep.LLILZ;
                chooseMediaViewModel.getClass();
                chooseMediaViewModel.LLJJI = EnumC538230L8z.ALL;
                chooseMediaViewModel.wR2(chooseMediaViewModel.LLIZ);
                c0jep.LLILZ.xR2((ArrayList) c0jep.LLIZ);
                if (c19a32.findSceneByTag("PreviewRootScene") == null) {
                    Scene sceneLIZ2 = C2350509Ix.LIZ(bundle, C526910KlV.class);
                    if ((sceneLIZ2 instanceof C526910KlV) && (c526910KlV = (C526910KlV) sceneLIZ2) != null) {
                        c526910KlV.LLLLZIL = interfaceC526970Klb;
                    }
                    sceneLIZ2.disableSceneRestore();
                    if ((sceneLIZ2 instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ2) != null) {
                        c19a3.disableSupportRestore();
                    }
                    c19a32.add(R.id.drg, sceneLIZ2, "PreviewRootScene");
                }
            } else {
                throw new IllegalStateException("Scene not found");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean z = true;
        if (((C0JEP) aObjectS526S0100000_7.l0).LLLI(onThisDayTiktokMediaModel)) {
            Context contextRequireSceneContext = ((C0JEP) aObjectS526S0100000_7.l0).LLILLL.requireSceneContext();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(((C0JEP) aObjectS526S0100000_7.l0).LLJ);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(contextRequireSceneContext, 3087, creativeToastBuilder);
        } else {
            if (onThisDayTiktokMediaModel.selectIndex > 0) {
                z = false;
            }
            ((C0JEP) aObjectS526S0100000_7.l0).LLLIIIIL(z, onThisDayTiktokMediaModel, false, zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        ((C0J1D) aObjectS526S0100000_7.l0).LLILLJJLI.LIZLLL((View) obj, (OnThisDayTiktokMediaModel) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS526S0100000_7 aObjectS526S0100000_7, Object obj, Object obj2) {
        ((C0J19) aObjectS526S0100000_7.l0).LLILLL.LIZLLL((View) obj, (OnThisDayTiktokMediaModel) obj2);
        return Unit.LIZ;
    }
}
