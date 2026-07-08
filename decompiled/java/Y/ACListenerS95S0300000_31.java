package Y;

import X.C13BV;
import X.C13LQ;
import X.C1428470nHB;
import X.C1446650nkV;
import X.C16F5;
import X.C1868270yiX;
import X.C19EG;
import X.C20359314lT;
import X.C20368214mu;
import X.C20508915Mx;
import X.C20661615t8;
import X.C20684815ws;
import X.C20698415z4;
import X.C20698815z8;
import X.C341910Dan;
import X.C500260Jjc;
import X.C5183020f;
import X.C688120Qyw;
import X.InterfaceC20698115z1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435390H5l;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionParams;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.ICLALanguageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS466S0200000_31;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class ACListenerS95S0300000_31 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void onClick$0(ACListenerS95S0300000_31 aCListenerS95S0300000_31, View view) {
        ((C20661615t8) aCListenerS95S0300000_31.l0).LJIILIIL("add");
        TuxSheet tuxSheet = ((C20661615t8) aCListenerS95S0300000_31.l0).LLIZLLLIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        InterfaceC435390H5l interfaceC435390H5l = (InterfaceC435390H5l) aCListenerS95S0300000_31.l1;
        if (interfaceC435390H5l != null) {
            interfaceC435390H5l.LIZ(((C688120Qyw) aCListenerS95S0300000_31.l2).LIZ, ((C20661615t8) aCListenerS95S0300000_31.l0).getEnterFrom(), new AwS466S0200000_31((C20661615t8) aCListenerS95S0300000_31.l0, (C688120Qyw) aCListenerS95S0300000_31.l2, 7));
        }
        Function1<String, Unit> function1 = ((C20661615t8) aCListenerS95S0300000_31.l0).LLILZIL;
        if (function1 != null) {
            function1.invoke("add");
        }
    }

    public static final void onClick$1(ACListenerS95S0300000_31 aCListenerS95S0300000_31, View view) {
        String string;
        Integer numLJJLIIJ;
        int iIntValue = 1;
        view.setSelected(true);
        Condition condition = ((C1868270yiX) aCListenerS95S0300000_31.l0).LIZ.LIZ;
        CharSequence text = ((C16F5) aCListenerS95S0300000_31.l1).getText();
        if (text != null && (string = text.toString()) != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(string)) != null) {
            iIntValue = numLJJLIIJ.intValue();
        }
        condition.setParams(C20359314lT.LIZ(new ConditionParams(Integer.valueOf(iIntValue))));
        ((C1868270yiX) aCListenerS95S0300000_31.l0).LIZ.LIZ.setOperator("GREATER_THAN_OR_EQUAL_TO");
        ArrayList<C16F5> arrayList = ((C20368214mu) aCListenerS95S0300000_31.l2).LLILZIL;
        C16F5 c16f5 = (C16F5) aCListenerS95S0300000_31.l1;
        for (C16F5 c16f52 : arrayList) {
            if (!Intrinsics.LJFF(c16f52, c16f5)) {
                c16f52.setSelected(false);
            }
        }
        ((C20368214mu) aCListenerS95S0300000_31.l2).N5((C1868270yiX) aCListenerS95S0300000_31.l0);
    }

    public static final void onClick$2(ACListenerS95S0300000_31 aCListenerS95S0300000_31, View view) {
        List<String> listLJJLL;
        String enterFrom;
        Aweme awemeLIZ;
        InterfaceC20698115z1 interfaceC20698115z1;
        ICLALanguageService iCLALanguageServiceLIZ = C20698815z8.LIZ();
        Context contextRequireContext = ((PhotoTranslationPanelFragment) aCListenerS95S0300000_31.l0).requireContext();
        List<? extends ContentLanguage> list = ((PushSettings) aCListenerS95S0300000_31.l1).allDoNotTranslate;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String[] strArr = (String[]) aCListenerS95S0300000_31.l2;
        if (strArr == null || (listLJJLL = C13LQ.LJJLL(strArr)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        C20698415z4 c20698415z4 = ((PhotoTranslationPanelFragment) aCListenerS95S0300000_31.l0).LLILLJJLI;
        if (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null || (enterFrom = interfaceC20698115z1.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C20698415z4 c20698415z42 = ((PhotoTranslationPanelFragment) aCListenerS95S0300000_31.l0).LLILLJJLI;
        if (c20698415z42 != null) {
            awemeLIZ = c20698415z42.LIZ();
        } else {
            awemeLIZ = null;
        }
        SmartRoute smartRouteLJFF = iCLALanguageServiceLIZ.LJFF(contextRequireContext, list, listLJJLL, enterFrom, awemeLIZ);
        if (smartRouteLJFF != null) {
            smartRouteLJFF.open(1112);
        }
    }

    public static final void onClick$3(ACListenerS95S0300000_31 aCListenerS95S0300000_31, View view) {
        if (((C341910Dan) aCListenerS95S0300000_31.l0).LLILLJJLI) {
            return;
        }
        AssemVMLazy assemVMLazy = ((LandscapeProfileListCell) aCListenerS95S0300000_31.l1).LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LandscapeProfileListCell.LLILLL;
        assemVMLazy.getValue().setState(new AwS590S0100000_11((Aweme) aCListenerS95S0300000_31.l2, 602));
        AssemViewModel assemViewModel = (AssemViewModel) ((LandscapeProfileListCell) aCListenerS95S0300000_31.l1).LL.getValue();
        Aweme aweme = (Aweme) aCListenerS95S0300000_31.l2;
        if (aweme != null) {
            assemViewModel.setState(new C5183020f(aweme, 137));
        }
    }

    public static final void onClick$4(ACListenerS95S0300000_31 aCListenerS95S0300000_31, View view) {
        int iLJIIJJI;
        C19EG c19eg = (C19EG) aCListenerS95S0300000_31.l0;
        boolean zLIZIZ = C1446650nkV.LIZIZ((VideoPublishEditModel) aCListenerS95S0300000_31.l1);
        CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) aCListenerS95S0300000_31.l2;
        boolean zLIZ = C1446650nkV.LIZ((VideoPublishEditModel) aCListenerS95S0300000_31.l1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS95S0300000_31.l1;
        if (videoPublishEditModel != null) {
            iLJIIJJI = C1428470nHB.LJIIJJI(videoPublishEditModel);
        } else {
            iLJIIJJI = -1;
        }
        C20508915Mx.LIZ(c19eg, zLIZIZ, commerceToolsTcmModel, zLIZ, "edit", iLJIIJJI);
        C20684815ws.onEventV3("ttcm_edit_page_click_disclosure");
    }

    public ACListenerS95S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
