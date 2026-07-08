package Y;

import X.C09JN;
import X.C11PR;
import X.C13LP;
import X.C1462570oAB;
import X.C1634100scq;
import X.C1635160seY;
import X.C1640510snB;
import X.C1640610snL;
import X.C1640770snb;
import X.C1640790snd;
import X.C1640890snn;
import X.C1640940sns;
import X.C1C7U;
import X.EnumC1641360soY;
import X.EnumC1641400soc;
import X.EnumC1641460soi;
import X.EnumC1641510son;
import X.InterfaceC1423450n95;
import X.InterfaceC1640330smt;
import X.InterfaceC1640930snr;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.gif.InfoStickerGifListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS269S0300000_25;

/* JADX INFO: loaded from: classes26.dex */
public class AfS70S0400000_25 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public static final void accept$0(AfS70S0400000_25 afS70S0400000_25, Object obj) {
        int iIndexOf;
        LiveData<List<StickerSetCategory>> liveDataHe;
        List<StickerSetCategory> value;
        C1C7U.LIZ("InfoStickerSetListView@3ab4.initObserver$2");
        Pair pair = (Pair) obj;
        for (StickerSetCategory stickerSetCategory : (List) pair.getFirst()) {
            InterfaceC1640930snr interfaceC1640930snr = (InterfaceC1640930snr) afS70S0400000_25.l0;
            if (interfaceC1640930snr != null) {
                String tag = EnumC1641360soY.STICKER_SET.getTag();
                String str = stickerSetCategory.id;
                InterfaceC1640330smt<StickerSetCategory> interfaceC1640330smt = ((C1640770snb) afS70S0400000_25.l1).LJJIJL;
                if (interfaceC1640330smt != null && (liveDataHe = interfaceC1640330smt.he()) != null && (value = liveDataHe.getValue()) != null) {
                    iIndexOf = value.indexOf(stickerSetCategory);
                } else {
                    iIndexOf = 0;
                }
                interfaceC1640930snr.LIZ(false, false, false, null, tag, false, null, str, "", iIndexOf + 1, Collections.singletonList("set_sticker"), null, true);
            }
        }
        C11PR c11pr = (C11PR) afS70S0400000_25.l3;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.SET_STICKER;
        List list = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11pr.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, null, null, null, null, list, 49116));
        C1C7U.LIZIZ("InfoStickerSetListView@3ab4.initObserver$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS70S0400000_25 afS70S0400000_25, Object obj) {
        C1C7U.LIZ("InfoStickerSetListView@3ab4.initObserver$4");
        C1634100scq c1634100scq = (C1634100scq) obj;
        StickerSetCategory stickerSetCategory = (StickerSetCategory) c1634100scq.LIZ;
        C1640790snd c1640790snd = (C1640790snd) afS70S0400000_25.l0;
        c1640790snd.LIZIZ.LIZIZ(new C1640940sns(EnumC1641510son.STICKERSET, new AwS269S0300000_25((C1640770snb) afS70S0400000_25.l1, stickerSetCategory, c1640790snd, 11)));
        ((C1640770snb) afS70S0400000_25.l1).LJJIL.tw(stickerSetCategory);
        ((C1640770snb) afS70S0400000_25.l1).LJJIL.loadData();
        InterfaceC1640930snr interfaceC1640930snr = (InterfaceC1640930snr) afS70S0400000_25.l2;
        if (interfaceC1640930snr != null) {
            String tag = EnumC1641360soY.STICKER_SET.getTag();
            String str = stickerSetCategory.id;
            interfaceC1640930snr.LIZIZ(false, false, false, null, tag, false, null, str, str, ((Number) c1634100scq.LIZIZ).intValue() + 1, Collections.singletonList("set_sticker"), null, true);
        }
        C11PR c11pr = (C11PR) afS70S0400000_25.l3;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.STICKER_CLICK;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.EMOJI;
        List listSingletonList = Collections.singletonList(c1634100scq.LIZ);
        ((Number) c1634100scq.LIZIZ).intValue();
        c11pr.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, null, null, null, null, listSingletonList, 48764));
        C1C7U.LIZIZ("InfoStickerSetListView@3ab4.initObserver$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS70S0400000_25 afS70S0400000_25, Object obj) {
        InterfaceC1640930snr interfaceC1640930snr;
        boolean z;
        String str;
        InfoStickerCollectListViewModel infoStickerCollectListViewModel;
        C1C7U.LIZ("InfoStickerCollectListView@3604.initObserver$3");
        C1634100scq c1634100scq = (C1634100scq) obj;
        Effect effect = (Effect) c1634100scq.LIZ;
        if (!C1635160seY.LIZIZ(effect) && (interfaceC1640930snr = (InterfaceC1640930snr) afS70S0400000_25.l0) != null) {
            String tag = EnumC1641360soY.FAVORITE.getTag();
            InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95 = ((C1640510snB) afS70S0400000_25.l1).LJJIJLIJ;
            if ((interfaceC1423450n95 instanceof InfoStickerCollectListViewModel) && (infoStickerCollectListViewModel = (InfoStickerCollectListViewModel) interfaceC1423450n95) != null && infoStickerCollectListViewModel.wQ2(effect)) {
                z = true;
            } else {
                z = false;
            }
            String effectId = effect.getEffectId();
            String resourceId = effect.getResourceId();
            int iIntValue = ((Number) c1634100scq.LIZIZ).intValue() + 1;
            boolean zLJIILIIL = C1462570oAB.LJIILIIL(effect);
            if (C1635160seY.LIZ(effect)) {
                str = (String) C13LP.LJJJLL(effect.getFileUrl().getUrlList());
            } else {
                str = null;
            }
            interfaceC1640930snr.LIZIZ(false, z, false, null, tag, zLJIILIIL, str, effectId, resourceId, iIntValue, effect.getTags(), null, C1635160seY.LJFF(effect));
        }
        ((C11PR) afS70S0400000_25.l3).onNext(new C1640890snn(EnumC1641460soi.STICKER_CLICK, EnumC1641400soc.COLLECT, Collections.singletonList(c1634100scq.LIZ), null, null, null, null, 65144));
        C1C7U.LIZIZ("InfoStickerCollectListView@3604.initObserver$3");
    }

    public static final void accept$3(AfS70S0400000_25 afS70S0400000_25, Object obj) {
        BaseInfoStickerListViewModel baseInfoStickerListViewModel;
        InterfaceC1640930snr interfaceC1640930snr;
        int iIndexOf;
        C1C7U.LIZ("InfoStickerGifListView@544c.initObserver$2");
        Pair pair = (Pair) obj;
        for (ProviderEffect providerEffect : (List) pair.getFirst()) {
            InterfaceC1640330smt<ProviderEffect> interfaceC1640330smt = ((C1640610snL) afS70S0400000_25.l0).LJJIJIL;
            if ((interfaceC1640330smt instanceof InfoStickerGifListViewModel) && (baseInfoStickerListViewModel = (BaseInfoStickerListViewModel) interfaceC1640330smt) != null && (interfaceC1640930snr = (InterfaceC1640930snr) afS70S0400000_25.l2) != null) {
                List list = (List) baseInfoStickerListViewModel.LL.getValue();
                if (list != null) {
                    iIndexOf = list.indexOf(providerEffect);
                } else {
                    iIndexOf = 0;
                }
                interfaceC1640930snr.LIZ(false, false, false, null, EnumC1641360soY.STICKER.getTag(), false, null, providerEffect.getId(), "", iIndexOf + 1, Collections.singletonList("tenor"), null, false);
            }
        }
        C11PR c11pr = (C11PR) afS70S0400000_25.l1;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.GIF_SUBPAGE;
        List list2 = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11pr.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, null, list2, null, null, null, 65492));
        C1C7U.LIZIZ("InfoStickerGifListView@544c.initObserver$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS70S0400000_25 afS70S0400000_25, Object obj) {
        InterfaceC1640930snr interfaceC1640930snr;
        C1C7U.LIZ("InfoStickerGifListView@544c.initObserver$3");
        C1634100scq c1634100scq = (C1634100scq) obj;
        InterfaceC1640330smt<ProviderEffect> interfaceC1640330smt = ((C1640610snL) afS70S0400000_25.l0).LJJIJIL;
        if ((interfaceC1640330smt instanceof InfoStickerGifListViewModel) && interfaceC1640330smt != null && (interfaceC1640930snr = (InterfaceC1640930snr) afS70S0400000_25.l2) != null) {
            interfaceC1640930snr.LIZIZ(false, false, false, null, EnumC1641360soY.STICKER.getTag(), false, null, ((ProviderEffect) c1634100scq.LIZ).getId(), "", ((Number) c1634100scq.LIZIZ).intValue() + 1, Collections.singletonList("tenor"), null, false);
        }
        ((C11PR) afS70S0400000_25.l1).onNext(new C1640890snn(EnumC1641460soi.STICKER_CLICK, EnumC1641400soc.GIF_SUBPAGE, null, Collections.singletonList(c1634100scq.LIZ), null, null, null, 65140));
        C1C7U.LIZIZ("InfoStickerGifListView@544c.initObserver$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS70S0400000_25(X.InterfaceC1640930snr r2, X.C1640790snd r3, X.C1640770snb r4, X.C11PR r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS70S0400000_25.<init>(X.0snr, X.0snd, X.0snb, X.11PR, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS70S0400000_25(Object obj, InterfaceC1640930snr interfaceC1640930snr, C1640510snB c1640510snB, C1640790snd c1640790snd, C11PR<C1640890snn> c11pr) {
        this.$t = c11pr;
        this.l0 = obj;
        this.l1 = interfaceC1640930snr;
        this.l2 = c1640510snB;
        this.l3 = c1640790snd;
    }
}
