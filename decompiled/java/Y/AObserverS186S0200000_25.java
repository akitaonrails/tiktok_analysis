package Y;

import X.AbstractC19484711Kz;
import X.C11HU;
import X.C11NJ;
import X.C13LP;
import X.C1453000nuk;
import X.C1465720oFG;
import X.C1624110sMj;
import X.C1627000sRO;
import X.C1629980sWC;
import X.C1630440sWw;
import X.C1636320sgQ;
import X.C1637120shi;
import X.C1638720skI;
import X.C1641640sp0;
import X.C1644370stP;
import X.C1644380stQ;
import X.C1701940uOG;
import X.C2281551ESb;
import X.C375780EoK;
import X.C443120HZe;
import X.EnumC1641470soj;
import X.EnumC1641550sor;
import X.InterfaceC1625880sPa;
import X.InterfaceC1631540sYi;
import X.InterfaceC420801kM;
import X.InterfaceC424690Gl1;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.shortvideo.filter.c;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerRecommendTabViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AObserverS186S0200000_25 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        C1629980sWC c1629980sWC = (C1629980sWC) aObserverS186S0200000_25.l0;
        InterfaceC1631540sYi interfaceC1631540sYi = (InterfaceC1631540sYi) aObserverS186S0200000_25.l1;
        c1629980sWC.getClass();
        Object first = ((C443120HZe) obj).getFirst();
        int iGp = interfaceC1631540sYi.Gp(first);
        if (iGp >= 0) {
            c1629980sWC.LIZIZ.notifyItemChanged(iGp, first);
        }
    }

    public static final void onChanged$1(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        c cVar = (c) aObserverS186S0200000_25.l0;
        cVar.LLLIIIIL = (List) obj;
        cVar.L6((InitialFilterConfig) aObserverS186S0200000_25.l1);
    }

    public static final void onChanged$10(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        FilterBean filterBean;
        C1453000nuk c1453000nuk = (C1453000nuk) obj;
        if (c1453000nuk != null && (filterBean = c1453000nuk.LIZIZ) != C1638720skI.LIZLLL()) {
            C1644370stP c1644370stP = (C1644370stP) aObserverS186S0200000_25.l0;
            c1644370stP.LJIIIZ = filterBean;
            c1644370stP.LIZJ.Oc(true, filterBean, false, false);
            ((Function1) aObserverS186S0200000_25.l1).invoke(filterBean);
            ((C1644370stP) aObserverS186S0200000_25.l0).LJ.removeObserver(aObserverS186S0200000_25);
        }
    }

    public static final void onChanged$11(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        String str;
        EnumC1641550sor enumC1641550sor;
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
        if (stickerTagChangeData != null && (str = stickerTagChangeData.tabKey) != null && str.length() != 0) {
            if (Intrinsics.LJFF(stickerTagChangeData.tabKey, "sticker_category:search")) {
                if (((C1637120shi) aObserverS186S0200000_25.l0).LIZJ.length() > 0) {
                    C1637120shi c1637120shi = (C1637120shi) aObserverS186S0200000_25.l0;
                    c1637120shi.LIZ(c1637120shi.LIZJ, false).removeObserver((AObserverS227S0100000_25) aObserverS186S0200000_25.l1);
                }
                ((C1637120shi) aObserverS186S0200000_25.l0).LIZJ = "";
                return;
            }
            if (Intrinsics.LJFF(stickerTagChangeData.tabKey, ((C1637120shi) aObserverS186S0200000_25.l0).LIZJ)) {
                return;
            }
            if (((C1637120shi) aObserverS186S0200000_25.l0).LIZJ.length() > 0) {
                C1637120shi c1637120shi2 = (C1637120shi) aObserverS186S0200000_25.l0;
                c1637120shi2.LIZ(c1637120shi2.LIZJ, false).removeObserver((AObserverS227S0100000_25) aObserverS186S0200000_25.l1);
            }
            LiveData<C1641640sp0<CategoryEffectModel>> liveDataLIZ = ((C1637120shi) aObserverS186S0200000_25.l0).LIZ(stickerTagChangeData.tabKey, false);
            C1641640sp0<CategoryEffectModel> value = liveDataLIZ.getValue();
            EnumC1641550sor enumC1641550sor2 = null;
            if (value != null) {
                enumC1641550sor = value.LIZIZ;
            } else {
                enumC1641550sor = null;
            }
            if (enumC1641550sor != EnumC1641550sor.SUCCESS) {
                liveDataLIZ.observe(((C1637120shi) aObserverS186S0200000_25.l0).LIZ.getLifecycleOwner(), (AObserverS227S0100000_25) aObserverS186S0200000_25.l1);
                C1641640sp0<CategoryEffectModel> value2 = liveDataLIZ.getValue();
                if (value2 != null) {
                    enumC1641550sor2 = value2.LIZIZ;
                }
                if (enumC1641550sor2 == EnumC1641550sor.ERROR && ((C1637120shi) aObserverS186S0200000_25.l0).LIZJ()) {
                    ((C1637120shi) aObserverS186S0200000_25.l0).LIZLLL.getValue().LIZ();
                }
            }
            ((C1637120shi) aObserverS186S0200000_25.l0).LIZJ = stickerTagChangeData.tabKey;
            return;
        }
        ((C1637120shi) aObserverS186S0200000_25.l0).LIZJ = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$12(Y.AObserverS186S0200000_25 r8, java.lang.Object r9) {
        /*
            java.lang.Object r7 = r8.l0
            X.0sik r7 = (X.C1637760sik) r7
            java.lang.Object r4 = r8.l1
            X.0sNh r4 = (X.InterfaceC1624710sNh) r4
            android.util.Pair r9 = (android.util.Pair) r9
            r7.getClass()
            if (r9 == 0) goto L77
            java.lang.Object r0 = r9.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r7.LIZLLL()
            long r2 = X.C566050MHz.LIZIZ()
            boolean r0 = r5.LJJLL()
            r8 = 1
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r1 = r5.cameraComponentModel
            int r0 = r1.recordMode
            if (r0 == r8) goto L78
            long r2 = r1.mMaxDuration
        L30:
            X.1DKk r0 = r7.LIZ
            long r5 = r0.getEndFrameTimeUS()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension.calculateRealTime(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LIZLLL()
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            long r0 = r0.mTotalRecordingTime
            long r5 = r5 + r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L77
            boolean r0 = r7.LJFF
            if (r0 == 0) goto L77
            r7.LJFF = r1
            r7.LJIIIIZZ = r8
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r7.LIZLLL()
            java.lang.Object r0 = r9.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.gameScore = r0
            X.0sNg r4 = (X.C1624700sNg) r4
            r4.getClass()
            X.0sst r1 = new X.0sst
            java.lang.String r0 = "game_record_full"
            r1.<init>(r0)
            r0 = 2
            r1.LIZ = r0
            X.0t0B r0 = r4.LIZ
            r0.h81(r1)
        L77:
            return
        L78:
            boolean r0 = r5.LJJJJLL()
            if (r0 == 0) goto L30
            r2 = 3000(0xbb8, double:1.482E-320)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS186S0200000_25.onChanged$12(Y.AObserverS186S0200000_25, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$2(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        Effect effect;
        HorizontalEffectsModel horizontalEffectsModel = (HorizontalEffectsModel) ((C1641640sp0) obj).LIZ;
        if (horizontalEffectsModel != null) {
            LiveData liveData = (LiveData) aObserverS186S0200000_25.l0;
            l0 l0Var = (l0) aObserverS186S0200000_25.l1;
            List<? extends Effect> list = horizontalEffectsModel.insert_effects;
            if (list == null || (effect = (Effect) C13LP.LJJJLL(list)) == null) {
                effect = (Effect) C13LP.LJJJLL(horizontalEffectsModel.trending_effects);
            }
            liveData.removeObserver(aObserverS186S0200000_25);
            if (effect != null) {
                l0Var.Xe(effect);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$3(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        PanelInfoModel panelInfoModel = (PanelInfoModel) ((C1641640sp0) obj).LIZ;
        if (panelInfoModel != null) {
            ((l0) aObserverS186S0200000_25.l0).I9(aObserverS186S0200000_25, panelInfoModel, (InterfaceC1625880sPa) aObserverS186S0200000_25.l1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02f8  */
    /* JADX WARN: Type inference failed for: r17v2, types: [T, com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$4(Y.AObserverS186S0200000_25 r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS186S0200000_25.onChanged$4(Y.AObserverS186S0200000_25, java.lang.Object):void");
    }

    public static final void onChanged$5(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        FilterBean filterBean;
        C1453000nuk c1453000nuk = (C1453000nuk) obj;
        if (c1453000nuk != null && (filterBean = c1453000nuk.LIZIZ) != C1638720skI.LIZLLL()) {
            C1644380stQ c1644380stQ = (C1644380stQ) aObserverS186S0200000_25.l0;
            boolean z = c1453000nuk.LJ;
            c1644380stQ.LJIIIIZZ = filterBean;
            C1465720oFG.LIZ(c1644380stQ.LIZJ, true, filterBean, z, 8);
            ((Function1) aObserverS186S0200000_25.l1).invoke(filterBean);
            ((C1644380stQ) aObserverS186S0200000_25.l0).LJ.removeObserver(aObserverS186S0200000_25);
        }
    }

    public static final void onChanged$6(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        AbstractC19484711Kz abstractC19484711Kz = (AbstractC19484711Kz) obj;
        if (abstractC19484711Kz == null) {
            ((InfoStickerRecommendTabViewModel) aObserverS186S0200000_25.l0).vQ2((List) aObserverS186S0200000_25.l1);
            return;
        }
        C11HU c11huLJJ = abstractC19484711Kz.LJJ(C1701940uOG.LIZIZ());
        InfoStickerRecommendTabViewModel infoStickerRecommendTabViewModel = (InfoStickerRecommendTabViewModel) aObserverS186S0200000_25.l0;
        List list = (List) aObserverS186S0200000_25.l1;
        InterfaceC420801kM interfaceC420801kMLJJIIZ = c11huLJJ.LJJIIZ(new AfS159S0200000_25(infoStickerRecommendTabViewModel, list, 6), new AfS159S0200000_25(infoStickerRecommendTabViewModel, list, 7));
        InfoStickerRecommendTabViewModel infoStickerRecommendTabViewModel2 = (InfoStickerRecommendTabViewModel) aObserverS186S0200000_25.l0;
        C11NJ c11nj = infoStickerRecommendTabViewModel2.LLJIJIL;
        if (c11nj == null) {
            c11nj = new C11NJ();
            infoStickerRecommendTabViewModel2.LLJIJIL = c11nj;
        }
        c11nj.LIZ(interfaceC420801kMLJJIIZ);
    }

    public static final void onChanged$7(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        C443120HZe c443120HZe = (C443120HZe) obj;
        if (c443120HZe != null) {
            C1636320sgQ c1636320sgQ = (C1636320sgQ) aObserverS186S0200000_25.l0;
            EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) aObserverS186S0200000_25.l1;
            Object first = c443120HZe.getFirst();
            int iLLLI = c1636320sgQ.LLLI(first);
            if (iLLLI >= 0) {
                effectTemplateCategoryFragment.getClass();
                c1636320sgQ.notifyItemChanged(iLLLI + 1, first);
            }
        }
    }

    public static final void onChanged$8(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        Effect effect;
        C1624110sMj c1624110sMj = (C1624110sMj) obj;
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) aObserverS186S0200000_25.l0;
        String effectId = null;
        if (c1624110sMj != null) {
            effect = c1624110sMj.LIZIZ;
        } else {
            effect = null;
        }
        effectTemplateCategoryFragment.LLJJJJ = effect;
        if (!effectTemplateCategoryFragment.getUserVisibleHint()) {
            TemplateEffectsViewModel templateEffectsViewModelBS = ((EffectTemplateCategoryFragment) aObserverS186S0200000_25.l0).bS();
            Effect effect2 = ((EffectTemplateCategoryFragment) aObserverS186S0200000_25.l0).LLJJJJ;
            if (effect2 != null) {
                effectId = effect2.getEffectId();
            }
            templateEffectsViewModelBS.EQ2(effectId);
        }
        if (c1624110sMj != null) {
            ((C1636320sgQ) aObserverS186S0200000_25.l1).notifyDataSetChanged();
        }
    }

    public static final void onChanged$9(AObserverS186S0200000_25 aObserverS186S0200000_25, Object obj) {
        EnumC1641470soj enumC1641470soj = (EnumC1641470soj) obj;
        if (enumC1641470soj != null) {
            int i = C1630440sWw.LIZ[enumC1641470soj.ordinal()];
            boolean z = false;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ((InterfaceC424690Gl1) aObserverS186S0200000_25.l1).LJJ(false);
                }
            } else {
                AbstractStickerView abstractStickerView = (AbstractStickerView) aObserverS186S0200000_25.l0;
                if (abstractStickerView.LLL) {
                    C1627000sRO.LIZIZ(abstractStickerView.LL, true);
                }
                ((AbstractStickerView) aObserverS186S0200000_25.l0).LLL = true;
                ((InterfaceC424690Gl1) aObserverS186S0200000_25.l1).LJJ(true);
            }
            AbstractStickerView abstractStickerView2 = (AbstractStickerView) aObserverS186S0200000_25.l0;
            if (enumC1641470soj == EnumC1641470soj.LOADING && !abstractStickerView2.LLJZ && C2281551ESb.LIZIZ.LJFF().LIZ()) {
                z = true;
            }
            View view = abstractStickerView2.LLJZIJLIL;
            if (view != null) {
                C375780EoK.LIZIZ(view, z);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS186S0200000_25(X.C1636640sgw r2, com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 7 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS186S0200000_25.<init>(X.0sgw, com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS186S0200000_25(Object obj, LiveData<C1641640sp0<HorizontalEffectsModel>> liveData, l0 l0Var) {
        this.$t = l0Var;
        this.l0 = obj;
        this.l1 = liveData;
    }
}
