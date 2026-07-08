package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor.CountryListDialogFragment;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128290fT1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1127520fRm LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ List<GiftColorInfo> LLILZ;
    public final /* synthetic */ Gift.ColorPickerInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128290fT1(C1127520fRm c1127520fRm, long j, long j2, List<GiftColorInfo> list, Gift.ColorPickerInfo colorPickerInfo) {
        super(0);
        this.LL = c1127520fRm;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = list;
        this.LLILZIL = colorPickerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1127520fRm c1127520fRm = this.LL;
        long j = this.LLILLJJLI;
        c1127520fRm.getClass();
        C1128300fT2 c1128300fT2 = C1128300fT2.LIZ;
        Gift gift = c1127520fRm.LLILZ;
        C1127870fSL c1127870fSL = c1127520fRm.LLILLJJLI;
        GiftColorInfo giftColorInfo = c1127870fSL.LIZ;
        long jLJIIJ = C1128300fT2.LJIIJ(c1128300fT2, gift, j, giftColorInfo != null ? giftColorInfo.colorId : null, c1127870fSL.LIZIZ, null, null, 240);
        C1128320fT4.LIZIZ(Long.valueOf(this.LLILLL), Long.valueOf(jLJIIJ));
        final C1127520fRm c1127520fRm2 = this.LL;
        final long j2 = this.LLILLL;
        final List<GiftColorInfo> list = this.LLILZ;
        final Gift.ColorPickerInfo colorPickerInfo = this.LLILZIL;
        if (colorPickerInfo == null) {
            c1127520fRm2.getClass();
        } else {
            FragmentManager fragmentManagerLJJ = C520010KaN.LJJ(c1127520fRm2.LL, false);
            if (fragmentManagerLJJ != null && !C464790IKn.LIZ.LIZIZ(c1127520fRm2.LLILZLL)) {
                CountryListDialogFragment countryListDialogFragment = new CountryListDialogFragment();
                InterfaceC1128440fTG interfaceC1128440fTG = new InterfaceC1128440fTG() { // from class: X.0fT0
                    @Override // X.InterfaceC1128440fTG
                    public final void LIZ(GiftColorInfo giftColorInfo2) {
                        List<GiftColorInfo> list2 = list;
                        GiftColorInfo giftColorInfoLIZJ = C1128300fT2.LIZJ(giftColorInfo2.colorId.longValue(), colorPickerInfo, list2);
                        if (giftColorInfoLIZJ != null) {
                            giftColorInfo2 = giftColorInfoLIZJ;
                        }
                        C1127520fRm c1127520fRm3 = c1127520fRm2;
                        c1127520fRm3.LLILLJJLI.LIZ = giftColorInfo2;
                        c1127520fRm3.LLILZIL = null;
                        GiftColorInfo giftColorInfoLJII = C1128300fT2.LJII(j2, colorPickerInfo, list);
                        C1128340fT6 c1128340fT6LJ = c1127520fRm2.LJ();
                        C1127870fSL c1127870fSL2 = c1127520fRm2.LLILLJJLI;
                        List<GiftColorInfo> list3 = list;
                        c1127870fSL2.getClass();
                        c1128340fT6LJ.e0(new C1128330fT5(C1128300fT2.LJ(list3, giftColorInfoLJII, c1127870fSL2.LIZ), giftColorInfo2.colorId.longValue(), j2));
                        C784440Upu.LIZ().LIZIZ(new C1127980fSW(giftColorInfo2.colorId, true));
                        C1128320fT4.LIZ(Integer.valueOf(C1128300fT2.LJIIL(list, giftColorInfoLJII, giftColorInfo2)), C1128300fT2.LJFF(giftColorInfo2, giftColorInfoLJII, c1127520fRm2.LLILLJJLI.LIZ), Long.valueOf(j2), giftColorInfo2.colorId);
                    }
                };
                countryListDialogFragment.LLJZIJLIL = j2;
                countryListDialogFragment.LLL = colorPickerInfo;
                countryListDialogFragment.LLLF = jLJIIJ;
                countryListDialogFragment.LLJZ = interfaceC1128440fTG;
                c1127520fRm2.LLILZLL = C19322110iZ.LJFF(fragmentManagerLJJ, countryListDialogFragment, "live_gift_color_country_picker_sheet", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
            }
        }
        return Unit.LIZ;
    }
}
