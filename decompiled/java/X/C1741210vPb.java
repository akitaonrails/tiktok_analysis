package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0vPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741210vPb extends AbstractC1741230vPd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str = null;
        InterfaceC1741220vPc interfaceC1741220vPc = (InterfaceC1741220vPc) C1909107dp.LIZJ(InterfaceC1741220vPc.class, null);
        C1741260vPg c1741260vPg = C1741310vPl.LIZJ;
        if (c1741260vPg == null) {
            EnumC1741180vPY enumC1741180vPY = EnumC1741180vPY.OUT_OF_MALL;
            c1741260vPg = new C1741260vPg(enumC1741180vPY, enumC1741180vPY, new C1741150vPV(EnumC1741200vPa.UNEXPECTED, false, 6));
        }
        interfaceC1741220vPc.setVisible(Boolean.valueOf(c1741260vPg.LJ()));
        switch (C1741190vPZ.LIZ[c1741260vPg.LIZIZ.ordinal()]) {
            case 1:
            case 5:
                str = "show";
                break;
            case 2:
                str = "other_tab";
                break;
            case 3:
            case 6:
                str = "background";
                break;
            case 4:
            case 7:
                switch (C1741190vPZ.LIZIZ[c1741260vPg.LIZJ.LIZ.ordinal()]) {
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        str = "under_subpage";
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        str = "under_sparkview";
                        break;
                    default:
                        C1741370vPr.LIZ(C1741370vPr.LIZ, "convertMallStatusToJSBStatus", "unexpected desc", c1741260vPg, 56);
                        break;
                }
                break;
            default:
                throw new C1954807lC();
        }
        interfaceC1741220vPc.setStatus(str);
        completionBlock.onSuccess(interfaceC1741220vPc, "");
    }
}
