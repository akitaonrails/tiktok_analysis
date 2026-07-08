package X;

import Y.ARunnableS112S0100000_12;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.ComboBar;
import com.bytedance.android.livesdk.widgets.LiveNewSpecialGiftWidget;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS48S0001000_3;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126100fPU extends C09AY implements InterfaceC1631620sYq<Integer, Integer, EnumC1126060fPQ, Unit> {
    public final /* synthetic */ LiveNewSpecialGiftWidget LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ GiftGalleryExtra LLILZLL;
    public final /* synthetic */ C1125860fP6 LLIZ;
    public final /* synthetic */ Long LLIZLLLIL;
    public final /* synthetic */ C1123400fL8 LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126100fPU(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget, long j, Integer num, String str, String str2, GiftGalleryExtra giftGalleryExtra, C1125860fP6 c1125860fP6, Long l, C1123400fL8 c1123400fL8) {
        super(3);
        this.LL = liveNewSpecialGiftWidget;
        this.LLILLJJLI = j;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = giftGalleryExtra;
        this.LLIZ = c1125860fP6;
        this.LLIZLLLIL = l;
        this.LLJ = c1123400fL8;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, EnumC1126060fPQ enumC1126060fPQ) {
        int i;
        C1126110fPV c1126110fPV;
        C1126110fPV c1126110fPV2;
        ComboBar comboBarById;
        int iIntValue;
        int iIntValue2 = num.intValue();
        int iIntValue3 = num2.intValue();
        EnumC1126060fPQ enumC1126060fPQ2 = enumC1126060fPQ;
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.LL;
        long j = this.LLILLJJLI;
        Integer num3 = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        GiftGalleryExtra giftGalleryExtra = this.LLILZLL;
        C1125860fP6 c1125860fP6 = this.LLIZ;
        Long l = this.LLIZLLLIL;
        C1123400fL8 c1123400fL8 = this.LLJ;
        int iIntValue4 = 0;
        if (c1123400fL8 != null) {
            i = c1123400fL8.LIZIZ;
        } else {
            i = 0;
        }
        liveNewSpecialGiftWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleProgressSponsor ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(' ');
        sbLIZ.append(iIntValue3);
        C20441214yg.LJIIIZ("LiveNewSpecialGiftWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC1126060fPQ2 == EnumC1126060fPQ.VAULT_EOY) {
            C1126110fPV c1126110fPV3 = liveNewSpecialGiftWidget.LLILLJJLI;
            if (c1126110fPV3 != null) {
                C500260Jjc.LLFFF(c1126110fPV3);
            }
            C1126110fPV c1126110fPV4 = liveNewSpecialGiftWidget.LLILLJJLI;
            if (c1126110fPV4 != null && (comboBarById = GiftManager.inst().getComboBarById(j)) != null) {
                Long l2 = c1126110fPV4.LLJILLL;
                if (l2 == null || j != l2.longValue()) {
                    c1126110fPV4.LIZJ(j);
                }
                c1126110fPV4.LIZLLL(comboBarById.leftIcon);
                C500260Jjc.LLFFF(c1126110fPV4.LLILLJJLI);
                c1126110fPV4.LLILLJJLI.getLayoutParams().width = C1126110fPV.LLJJJ;
                C500260Jjc.LJIILIIL(c1126110fPV4.LLJI);
                C500260Jjc.LLFFF(c1126110fPV4.LLJIJIL);
                c1126110fPV4.LLJILLL = Long.valueOf(j);
                long j2 = iIntValue2;
                long j3 = comboBarById.targetComboNum;
                if (j2 < j3) {
                    c1126110fPV4.LLJIJIL.LJJJI(R.style.a9d);
                    C1124870fNV.LIZJ().getClass();
                    String strLIZIZ = C1124870fNV.LIZIZ("ttlive_vaultFest_combo_progress");
                    if (strLIZIZ == null) {
                        strLIZIZ = C497740JfY.LJIJI(2131856875);
                    }
                    SpannableString spannableString = new SpannableString(strLIZIZ);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
                    String strValueOf = String.valueOf(iIntValue2);
                    int iLJJJ = a0.LJJJ(spannableString, String.valueOf(iIntValue2), 0, false, 6);
                    if (iLJJJ < 0) {
                        iLJJJ = 0;
                    }
                    C16F5 c16f5 = c1126110fPV4.LLJIJIL;
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezt, c1126110fPV4.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c16f5.setTextColor(iIntValue);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f00, c1126110fPV4.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue4 = numLIZJ2.intValue();
                    }
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue4), iLJJJ, strValueOf.length() + iLJJJ, 33);
                    C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.5384616f), iLJJJ, strValueOf.length() + iLJJJ, 34);
                    C786410Ut5.q2(spannableStringBuilder, new C444930HcZ(C1119920fFW.LIZJ(c1126110fPV4.LLJIJIL.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c1126110fPV4.getContext())), iLJJJ, strValueOf.length() + iLJJJ, 33);
                    c1126110fPV4.LLJIJIL.setText(spannableStringBuilder);
                    c1126110fPV4.LLJILJIL.setText(comboBarById.displayTextBeforeReach);
                } else {
                    if (j2 == j3) {
                        C500260Jjc.LLFFF(c1126110fPV4.LLIZLLLIL);
                        if (C497740JfY.LJJ()) {
                            C786410Ut5.Wb(c1126110fPV4.LLIZLLLIL, -1.0f);
                        } else {
                            C786410Ut5.Wb(c1126110fPV4.LLIZLLLIL, 1.0f);
                        }
                        c1126110fPV4.LLIZLLLIL.playAnimation();
                        c1126110fPV4.LLJIJIL.animate().scaleX(1.5f).scaleY(1.5f).setDuration(150L).withEndAction(new ARunnableS112S0100000_12(c1126110fPV4, 269)).start();
                    }
                    c1126110fPV4.LLJIJIL.LJJJI(R.style.a8t);
                    c1126110fPV4.LLJILJIL.setText(comboBarById.displayTextAfterReach);
                    C16F5 c16f52 = c1126110fPV4.LLJIJIL;
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.f00, c1126110fPV4.getContext());
                    if (numLIZJ3 != null) {
                        iIntValue4 = numLIZJ3.intValue();
                    }
                    c16f52.setTextColor(iIntValue4);
                    c1126110fPV4.LLJIJIL.setText(comboBarById.targetReachTitle);
                }
            }
        } else if (iIntValue2 <= iIntValue3) {
            C1126110fPV c1126110fPV5 = liveNewSpecialGiftWidget.LLILLJJLI;
            if (c1126110fPV5 != null) {
                C500260Jjc.LLFFF(c1126110fPV5);
            }
            int i2 = C1126080fPS.LIZ[enumC1126060fPQ2.ordinal()];
            if ((i2 == 1 || i2 == 2 || i2 == 3) && (c1126110fPV2 = liveNewSpecialGiftWidget.LLILLJJLI) != null) {
                c1126110fPV2.LJI(j, num3, iIntValue2, iIntValue3, str2, giftGalleryExtra, c1125860fP6, enumC1126060fPQ2, l, i, new AwS48S0001000_3(iIntValue3, 6));
            }
        } else {
            C1126220fPg c1126220fPg = liveNewSpecialGiftWidget.LL;
            if (c1126220fPg != null && c1126220fPg.LIZJ(giftGalleryExtra, str) && C1126080fPS.LIZ[enumC1126060fPQ2.ordinal()] == 2 && (c1126110fPV = liveNewSpecialGiftWidget.LLILLJJLI) != null) {
                c1126110fPV.LJI(j, num3, iIntValue3, iIntValue3, str2, giftGalleryExtra, c1125860fP6, enumC1126060fPQ2, l, 0, new AwS561S0100000_17(liveNewSpecialGiftWidget, 494));
            }
        }
        return Unit.LIZ;
    }
}
