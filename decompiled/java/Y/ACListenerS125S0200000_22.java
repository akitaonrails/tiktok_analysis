package Y;

import X.AbstractC1427970nGN;
import X.C0CHQ;
import X.C0HWQ;
import X.C1391600mJi;
import X.C1402600mbS;
import X.C1403560md0;
import X.C1403570md1;
import X.C1408710mlJ;
import X.C1413230msb;
import X.C1418910n1l;
import X.C1419150n29;
import X.C1427840nGA;
import X.C1427890nGF;
import X.C1427900nGG;
import X.C1427930nGJ;
import X.C1443330nf9;
import X.C1443340nfA;
import X.C18JY;
import X.C1908480zlO;
import X.C19292410dm;
import X.C20684815ws;
import X.C21372118kR;
import X.C418440Gaw;
import X.C443090HZb;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC1415820mwm;
import X.ViewOnClickListenerC1419140n28;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.powercell.SkuPropValueSelectionCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class ACListenerS125S0200000_22 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        C1408710mlJ c1408710mlJ;
        Function2<? super C1408710mlJ, ? super Integer, Unit> function2;
        int bindingAdapterPosition = ((SkuPropValueSelectionCell) aCListenerS125S0200000_22.l0).getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (function2 = (c1408710mlJ = (C1408710mlJ) aCListenerS125S0200000_22.l1).LLJI) != null) {
            function2.invoke(c1408710mlJ, Integer.valueOf(bindingAdapterPosition));
        }
    }

    public static final void onClick$1(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        MutableLiveData<AbstractC1427970nGN> event = ((C1427900nGG) aCListenerS125S0200000_22.l0).LL.getEvent();
        if (event != null) {
            PhotoTemplateAsset photoTemplateAsset = (PhotoTemplateAsset) aCListenerS125S0200000_22.l1;
            event.setValue(new C1427930nGJ(photoTemplateAsset, ((C1427900nGG) aCListenerS125S0200000_22.l0).LLILZ.indexOf(photoTemplateAsset)));
        }
    }

    public static final void onClick$10(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        C1413230msb c1413230msb = (C1413230msb) aCListenerS125S0200000_22.l0;
        c1413230msb.LLILLJJLI.creativeModel.editSaveLocalModel.selectedImagesList = c1413230msb.LLJI;
        ((Function1) aCListenerS125S0200000_22.l1).invoke(Boolean.FALSE);
    }

    public static final void onClick$11(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        ((C1413230msb) aCListenerS125S0200000_22.l0).LLILLJJLI.creativeModel.editSaveLocalModel.selectedImagesList = null;
        ((Function1) aCListenerS125S0200000_22.l1).invoke(Boolean.TRUE);
    }

    public static final void onClick$12(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        if (((C1413230msb) aCListenerS125S0200000_22.l0).LIZ()) {
            C1413230msb c1413230msb = (C1413230msb) aCListenerS125S0200000_22.l0;
            EditSaveLocalModel editSaveLocalModel = c1413230msb.LLILLJJLI.creativeModel.editSaveLocalModel;
            editSaveLocalModel.selectedImagesList = c1413230msb.LLJI;
            editSaveLocalModel.isChoosePhotos = true;
            c1413230msb.LLILLL.invoke();
            ((Function1) aCListenerS125S0200000_22.l1).invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$2(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        MutableLiveData<AbstractC1427970nGN> event = ((C1427840nGA) aCListenerS125S0200000_22.l0).LL.getEvent();
        if (event != null) {
            event.setValue(new C1427890nGF((CategoryInfo) aCListenerS125S0200000_22.l1, false));
        }
    }

    public static final void onClick$3(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        InnerPushMessage innerPushMessage;
        C1443330nf9 c1443330nf9 = (C1443330nf9) aCListenerS125S0200000_22.l0;
        c1443330nf9.LLJILJIL = true;
        C1443340nfA c1443340nfA = c1443330nf9.LLJ;
        if (c1443340nfA != null && (innerPushMessage = c1443340nfA.LLILLJJLI) != null) {
            C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 0);
        }
        ((Function0) aCListenerS125S0200000_22.l1).invoke();
    }

    public static final void onClick$4(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        Integer numValueOf = Integer.valueOf(((C1419150n29) aCListenerS125S0200000_22.l0).getBindingAdapterPosition());
        if (numValueOf.intValue() != -1) {
            ViewOnClickListenerC1419140n28 viewOnClickListenerC1419140n28 = (ViewOnClickListenerC1419140n28) aCListenerS125S0200000_22.l1;
            int iIntValue = numValueOf.intValue();
            InterfaceC1415820mwm interfaceC1415820mwm = viewOnClickListenerC1419140n28.LLILLL;
            if (interfaceC1415820mwm != null) {
                interfaceC1415820mwm.LIZ(iIntValue);
            }
        }
    }

    public static final void onClick$5(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        ((TuxSheet) aCListenerS125S0200000_22.l0).dismiss();
        ((Function1) aCListenerS125S0200000_22.l1).invoke(Boolean.FALSE);
    }

    public static final void onClick$6(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        ((TuxSheet) aCListenerS125S0200000_22.l0).dismiss();
        ((Function1) aCListenerS125S0200000_22.l1).invoke(Boolean.TRUE);
    }

    public static final void onClick$7(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        ((C1418910n1l) aCListenerS125S0200000_22.l0).setBack(true);
        ((TuxSheet) aCListenerS125S0200000_22.l1).dismiss();
    }

    public static final void onClick$8(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        ((C1418910n1l) aCListenerS125S0200000_22.l0).setBack(false);
        ((TuxSheet) aCListenerS125S0200000_22.l1).dismiss();
    }

    public static final void onClick$9(ACListenerS125S0200000_22 aCListenerS125S0200000_22, View view) {
        Boolean boolValueOf;
        String str;
        String string;
        int i;
        int i2;
        C21372118kR c21372118kR = (C21372118kR) aCListenerS125S0200000_22.l0;
        View view2 = c21372118kR.LL;
        if (view2 != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS125S0200000_22.l1;
            C0HWQ c0hwq = new C0HWQ(c21372118kR.getContext());
            ArrayList arrayList = new ArrayList();
            if (c21372118kR.LLIZLLLIL) {
                string = c21372118kR.getContext().getString(2131846739);
            } else {
                string = c21372118kR.getContext().getString(2131846738);
            }
            if (Intrinsics.LJFF(videoPublishEditModel.creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility, "Everyone")) {
                i = R.raw.icon_tick_fill;
            } else {
                i = 0;
            }
            arrayList.add(new C443090HZb(string, new AwS423S0200000_22(c21372118kR, videoPublishEditModel, 76), 0, null, i, null, 0, false, false, null, 1004));
            String string2 = c21372118kR.getContext().getString(2131846740);
            if (Intrinsics.LJFF(videoPublishEditModel.creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility, "Friends")) {
                i2 = R.raw.icon_tick_fill;
            } else {
                i2 = 0;
            }
            arrayList.add(new C443090HZb(string2, new AwS423S0200000_22(c21372118kR, videoPublishEditModel, 77), 0, null, i2, null, 0, false, false, null, 1004));
            c0hwq.LJIIL(Collections.singletonList(arrayList));
            c0hwq.LLJ = true;
            c0hwq.LLILZLL = (ViewGroup) view2.getRootView();
            C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LJIJJ = true;
            c1391600mJi.LJIIL = false;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c0hwq.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c0hwq.LIZIZ().show();
        }
        C1402600mbS c1402600mbS = C1402600mbS.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) aCListenerS125S0200000_22.l1;
        c1402600mbS.getClass();
        C1403560md0 c1403560md0LIZIZ = C1403570md1.LIZIZ();
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            boolValueOf = Boolean.valueOf(currentUser.LJIIJJI());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(videoPublishEditModel2.creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility, "Everyone")) {
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                str = "followers";
            } else {
                str = "public";
            }
        } else {
            str = "friend";
        }
        c1403560md0LIZIZ.LJ("enter_from", "video_post_page");
        String str2 = "1";
        c1403560md0LIZIZ.LJ("is_from_save_draft_popup", "1");
        c1403560md0LIZIZ.LJ("current_status", str);
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1403560md0LIZIZ.LJ("is_private_account", str2);
        C20684815ws.LJIILLIIL("click_privacy_setting", c1403560md0LIZIZ.LIZ);
    }

    public ACListenerS125S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
