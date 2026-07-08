package Y;

import X.C09JN;
import X.C11PR;
import X.C13LP;
import X.C1462570oAB;
import X.C1629340sVA;
import X.C1629570sVX;
import X.C1629580sVY;
import X.C1629590sVZ;
import X.C1629600sVa;
import X.C1632580saO;
import X.C1634100scq;
import X.C1635160seY;
import X.C1635850sff;
import X.C1640510snB;
import X.C1640580snI;
import X.C1640790snd;
import X.C1640890snn;
import X.C1954807lC;
import X.C1C7U;
import X.EnumC1159860gHw;
import X.EnumC1641360soY;
import X.EnumC1641400soc;
import X.EnumC1641460soi;
import X.InterfaceC1423450n95;
import X.InterfaceC1625550sP3;
import X.InterfaceC1635920sfm;
import X.InterfaceC1635930sfn;
import X.InterfaceC1640330smt;
import X.InterfaceC1640930snr;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class AfS115S0300000_25 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DefaultStickerDataManager@c35d.download$2");
        ((DefaultStickerDataManager) afS115S0300000_25.l0).LJJZZI((C1629340sVA) afS115S0300000_25.l1, (InterfaceC1625550sP3) afS115S0300000_25.l2, ((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("DefaultStickerDataManager@c35d.download$2");
    }

    public static final void accept$1(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        int iIndexOf;
        LiveData<List<Effect>> liveDataHe;
        List<Effect> value;
        C1C7U.LIZ("InfoStickerSetDetailListView@ba48.initObserver$1");
        Pair pair = (Pair) obj;
        for (Effect effect : (List) pair.getFirst()) {
            InterfaceC1640930snr interfaceC1640930snr = (InterfaceC1640930snr) afS115S0300000_25.l0;
            if (interfaceC1640930snr != null) {
                String tag = EnumC1641360soY.STICKER_SET.getTag();
                String effectId = effect.getEffectId();
                InterfaceC1640330smt<Effect> interfaceC1640330smt = ((C1640580snI) afS115S0300000_25.l1).LJJIJL;
                if (interfaceC1640330smt != null && (liveDataHe = interfaceC1640330smt.he()) != null && (value = liveDataHe.getValue()) != null) {
                    iIndexOf = value.indexOf(effect);
                } else {
                    iIndexOf = 0;
                }
                interfaceC1640930snr.LIZ(false, false, false, null, tag, false, null, effectId, "", iIndexOf + 1, effect.getTags(), null, C1635160seY.LJFF(effect));
            }
        }
        C11PR<C1640890snn> c11pr = ((C1640790snd) afS115S0300000_25.l2).LJI;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.SET_STICKER_SUBPAGE;
        List list = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11pr.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, list, null, null, null, null, 65496));
        C1C7U.LIZIZ("InfoStickerSetDetailListView@ba48.initObserver$1");
    }

    public static final void accept$10(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        SearchStickerViewContainer searchStickerViewContainer;
        View view;
        C1C7U.LIZ("AbstractStickerView@dd31.initStickerViewStateObserverForSearchView$1");
        if (obj == EnumC1159860gHw.PRE_HIDE) {
            ((InterfaceC1635930sfn) afS115S0300000_25.l0).x4();
        } else if (obj == EnumC1159860gHw.SHOWN) {
            SearchStickerViewContainer searchStickerViewContainer2 = ((AbstractStickerView) afS115S0300000_25.l1).LLJJJJJIL;
            C1635850sff c1635850sff = null;
            if ((searchStickerViewContainer2 != null && !searchStickerViewContainer2.LIZJ(null)) || ((InterfaceC1635920sfm) afS115S0300000_25.l2).LIZ()) {
                AbstractStickerView abstractStickerView = (AbstractStickerView) afS115S0300000_25.l1;
                abstractStickerView.getClass();
                int i = abstractStickerView.LLIZ.LJI;
                if (i == 1 ? abstractStickerView.LJII() == abstractStickerView.LLJJL : (i == 2 || i == 3 || i == 4) && (searchStickerViewContainer = abstractStickerView.LLJJJJJIL) != null && (view = searchStickerViewContainer.LLJ) != null && view.getVisibility() == 0) {
                    C1635850sff c1635850sff2 = ((AbstractStickerView) afS115S0300000_25.l1).LLJJJJLIIL;
                    if (c1635850sff2 != null) {
                        c1635850sff = c1635850sff2;
                    }
                    c1635850sff.Zf(true);
                }
            }
        }
        C1C7U.LIZIZ("AbstractStickerView@dd31.initStickerViewStateObserverForSearchView$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        InterfaceC1640930snr interfaceC1640930snr;
        C1C7U.LIZ("InfoStickerSetDetailListView@ba48.initObserver$3");
        C1634100scq c1634100scq = (C1634100scq) obj;
        Effect effect = (Effect) c1634100scq.LIZ;
        if (!C1635160seY.LIZIZ(effect) && (interfaceC1640930snr = (InterfaceC1640930snr) afS115S0300000_25.l0) != null) {
            interfaceC1640930snr.LIZIZ(false, false, false, null, EnumC1641360soY.STICKER_SET.getTag(), C1462570oAB.LJIILIIL(effect), null, effect.getEffectId(), "", ((Number) c1634100scq.LIZIZ).intValue() + 1, effect.getTags(), null, C1635160seY.LJFF(effect));
        }
        ((C11PR) afS115S0300000_25.l2).onNext(new C1640890snn(EnumC1641460soi.STICKER_CLICK, EnumC1641400soc.SET_STICKER_SUBPAGE, Collections.singletonList(c1634100scq.LIZ), null, null, null, null, 65144));
        C1C7U.LIZIZ("InfoStickerSetDetailListView@ba48.initObserver$3");
    }

    public static final void accept$3(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.download$6");
        if (!((Boolean) obj).booleanValue()) {
            ((C1629570sVX) afS115S0300000_25.l0).LJ = true;
        }
        ((C1629570sVX) afS115S0300000_25.l0).LIZIZ((Effect) afS115S0300000_25.l1, (InterfaceC1625550sP3) afS115S0300000_25.l2);
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.download$6");
    }

    public static final void accept$4(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.downloadActual$2$1");
        C1632580saO c1632580saO = (C1632580saO) obj;
        int i = C1629580sVY.LIZ[c1632580saO.LIZ.ordinal()];
        if (i != 1) {
            int iIntValue = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ((C1629570sVX) afS115S0300000_25.l2).LIZLLL = false;
                        ((InterfaceC1625550sP3) afS115S0300000_25.l0).LJIILLIIL((Effect) afS115S0300000_25.l1, new ExceptionResult(c1632580saO.LIZLLL));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1629570sVX c1629570sVX = (C1629570sVX) afS115S0300000_25.l2;
                    c1629570sVX.LIZLLL = true;
                    c1629570sVX.LIZ((Effect) afS115S0300000_25.l1, (InterfaceC1625550sP3) afS115S0300000_25.l0);
                }
            } else {
                ((C1629570sVX) afS115S0300000_25.l2).LIZLLL = false;
                InterfaceC1625550sP3 interfaceC1625550sP3 = (InterfaceC1625550sP3) afS115S0300000_25.l0;
                Effect effect = (Effect) afS115S0300000_25.l1;
                Integer num = c1632580saO.LJ;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                interfaceC1625550sP3.LJII(iIntValue, effect);
            }
        } else {
            ((InterfaceC1625550sP3) afS115S0300000_25.l0).LJIIIIZZ((Effect) afS115S0300000_25.l1);
        }
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.downloadActual$2$1");
    }

    public static final void accept$5(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.downloadActual$2$2");
        ((C1629570sVX) afS115S0300000_25.l0).LIZLLL = false;
        ((InterfaceC1625550sP3) afS115S0300000_25.l1).LJIILLIIL((Effect) afS115S0300000_25.l2, new ExceptionResult(new Exception((Throwable) obj)));
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.downloadActual$2$2");
    }

    public static final void accept$6(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.observeNonStart$2");
        C1632580saO c1632580saO = (C1632580saO) obj;
        int i = C1629590sVZ.LIZ[c1632580saO.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((C1629570sVX) afS115S0300000_25.l2).LIZLLL = false;
                    ((InterfaceC1625550sP3) afS115S0300000_25.l0).LJIILLIIL((Effect) afS115S0300000_25.l1, new ExceptionResult(c1632580saO.LIZLLL));
                }
            } else {
                C1629570sVX c1629570sVX = (C1629570sVX) afS115S0300000_25.l2;
                c1629570sVX.LIZLLL = true;
                c1629570sVX.LIZ((Effect) afS115S0300000_25.l1, (InterfaceC1625550sP3) afS115S0300000_25.l0);
            }
        } else {
            ((InterfaceC1625550sP3) afS115S0300000_25.l0).LJIIIIZZ((Effect) afS115S0300000_25.l1);
        }
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.observeNonStart$2");
    }

    public static final void accept$7(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.observeNonStart$3");
        ((C1629570sVX) afS115S0300000_25.l0).LIZLLL = false;
        ((InterfaceC1625550sP3) afS115S0300000_25.l1).LJIILLIIL((Effect) afS115S0300000_25.l2, new ExceptionResult(new Exception((Throwable) obj)));
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.observeNonStart$3");
    }

    public static final void accept$8(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.observeStartOnly$2");
        C1632580saO c1632580saO = (C1632580saO) obj;
        if (C1629600sVa.LIZ[c1632580saO.LIZ.ordinal()] == 1) {
            int iIntValue = 0;
            ((C1629570sVX) afS115S0300000_25.l0).LIZLLL = false;
            InterfaceC1625550sP3 interfaceC1625550sP3 = (InterfaceC1625550sP3) afS115S0300000_25.l1;
            Effect effect = (Effect) afS115S0300000_25.l2;
            Integer num = c1632580saO.LJ;
            if (num != null) {
                iIntValue = num.intValue();
            }
            interfaceC1625550sP3.LJII(iIntValue, effect);
        }
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.observeStartOnly$2");
    }

    public static final void accept$9(AfS115S0300000_25 afS115S0300000_25, Object obj) {
        InfoStickerCollectListViewModel infoStickerCollectListViewModel;
        boolean z;
        LiveData<List<Effect>> liveDataHe;
        List<Effect> value;
        C1C7U.LIZ("InfoStickerCollectListView@3604.initObserver$1");
        Pair pair = (Pair) obj;
        for (Effect effect : (List) pair.getFirst()) {
            InterfaceC1640930snr interfaceC1640930snr = (InterfaceC1640930snr) afS115S0300000_25.l0;
            if (interfaceC1640930snr != null) {
                String tag = EnumC1641360soY.FAVORITE.getTag();
                InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95 = ((C1640510snB) afS115S0300000_25.l1).LJJIJLIJ;
                String str = null;
                if (interfaceC1423450n95 instanceof InfoStickerCollectListViewModel) {
                    infoStickerCollectListViewModel = (InfoStickerCollectListViewModel) interfaceC1423450n95;
                } else {
                    infoStickerCollectListViewModel = null;
                }
                int iIndexOf = 0;
                if (infoStickerCollectListViewModel != null && infoStickerCollectListViewModel.wQ2(effect)) {
                    z = true;
                } else {
                    z = false;
                }
                String effectId = effect.getEffectId();
                String resourceId = effect.getResourceId();
                boolean zLJIILIIL = C1462570oAB.LJIILIIL(effect);
                if (C1635160seY.LIZ(effect)) {
                    str = (String) C13LP.LJJJLL(effect.getFileUrl().getUrlList());
                }
                InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n952 = ((C1640510snB) afS115S0300000_25.l1).LJJIJLIJ;
                if (interfaceC1423450n952 != null && (liveDataHe = interfaceC1423450n952.he()) != null && (value = liveDataHe.getValue()) != null) {
                    iIndexOf = value.indexOf(effect);
                }
                interfaceC1640930snr.LIZ(false, z, false, null, tag, zLJIILIIL, str, effectId, resourceId, iIndexOf + 1, effect.getTags(), null, C1635160seY.LJFF(effect));
            }
        }
        C11PR<C1640890snn> c11pr = ((C1640790snd) afS115S0300000_25.l2).LJI;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.COLLECT;
        List list = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11pr.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, list, null, null, null, null, 65496));
        C1C7U.LIZIZ("InfoStickerCollectListView@3604.initObserver$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS115S0300000_25(X.C1629570sVX r2, X.InterfaceC1625550sP3 r3, com.ss.android.ugc.effectmanager.effect.model.Effect r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L18;
                case 4: goto L10;
                case 5: goto L5;
                case 6: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        L18:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS115S0300000_25.<init>(X.0sVX, X.0sP3, com.ss.android.ugc.effectmanager.effect.model.Effect, int):void");
    }

    public AfS115S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
