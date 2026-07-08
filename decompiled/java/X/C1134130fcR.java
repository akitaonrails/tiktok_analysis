package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.model.message.GameTricksGiftInfo;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134130fcR extends ConstraintLayout implements InterfaceC2176981AHw {
    public DataChannel LL;
    public ARunnableS117S0100000_17 LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final C16F5 LLILZ;
    public final C1126540fQC LLILZIL;
    public final LinearLayout LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC2176981AHw
    public final void b(GameTricksGiftInfo gameTricksGiftInfo) {
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFII() {
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LLILLJJLI;
        if (aRunnableS117S0100000_17 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS117S0100000_17);
        }
        this.LLILLJJLI = null;
        LJLI(0L);
        if (this.LLIZ) {
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LLFFF(this.LLILZIL);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
            c1320810kTXLIZJ.LJIIJJI = true;
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            C1126540fQC c1126540fQC = this.LLILZIL;
            if (c1126540fQC != null) {
                c1126540fQC.setController(abstractC1320710kTNLIZ);
            }
            ARunnableS117S0100000_17 aRunnableS117S0100000_172 = new ARunnableS117S0100000_17(this, 124);
            this.LLILLJJLI = aRunnableS117S0100000_172;
            HandlerHook.viewPostDelay(this, aRunnableS117S0100000_172, ((long) ViewerWishesConfig.INSTANCE.getGetValue().settlementDuration) * 1000);
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void LJLI(long j) {
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            if (j < 0) {
                j = 0;
            }
            c16f5.setText(C963140bAe.LJIIJ(j));
        }
    }

    public final void e0(final List<GiftPickWithScore> list) {
        ImageModel imageModel;
        String strLJIJJ;
        long j;
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.iy_);
        C500260Jjc.LLFFF(viewGroup);
        ArrayList arrayList = new ArrayList();
        Iterator<GiftPickWithScore> it2 = list.iterator();
        while (it2.hasNext()) {
            GiftPick giftPick = it2.next().giftPick;
            if (giftPick != null) {
                j = giftPick.giftPrice;
            } else {
                j = 0;
            }
            arrayList.add(Long.valueOf(j));
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        final int i = 0;
        for (GiftPickWithScore giftPickWithScore : list) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                final GiftPickWithScore giftPickWithScore2 = giftPickWithScore;
                View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hwp, viewGroup, false);
                View viewFindViewById = viewTd.findViewById(R.id.ize);
                TextView textView = (TextView) viewTd.findViewById(R.id.iwr);
                TextView textView2 = (TextView) viewTd.findViewById(R.id.iwo);
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                GiftPick giftPick2 = giftPickWithScore2.giftPick;
                if (giftPick2 != null) {
                    imageModel = giftPick2.giftIcon;
                } else {
                    imageModel = null;
                }
                c0jbnLIZ.LJIIIZ(imageModel);
                c0jbnLIZ.LJJI(viewFindViewById);
                GiftPick giftPick3 = giftPickWithScore2.giftPick;
                if (giftPick3 != null) {
                    str = giftPick3.customizedDesc;
                }
                textView.setText(str);
                long j2 = giftPickWithScore2.score;
                if (j2 < 1000000) {
                    strLJIJJ = String.valueOf(j2);
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131853303, C0KX5.LIZ(j2));
                }
                textView2.setText(strLJIJJ);
                if (!this.LLIZ) {
                    C500260Jjc.LJIILIIL(textView2);
                }
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0fav
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) {
                        long j3;
                        if (view != null) {
                            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                            GiftPick giftPick4 = giftPickWithScore2.giftPick;
                            if (giftPick4 != null) {
                                j3 = giftPick4.giftId;
                            } else {
                                j3 = 0;
                            }
                            Long lValueOf = Long.valueOf(j3);
                            Boolean bool = Boolean.FALSE;
                            iGiftService.openGiftDialog("gift", new C1129740fVM("viewer_wishes", lValueOf, bool, bool, C1125800fP0.LIZJ(), null, false, 192));
                            C1AI0.LJIIJ(list, this.LL, i, false, false, "live_detail", "original", "click", false);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, viewTd);
                viewGroup.addView(viewTd);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void onFinish(boolean z) {
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LLILLJJLI;
        if (aRunnableS117S0100000_17 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS117S0100000_17);
        }
        this.LLILLJJLI = null;
        C500260Jjc.LJIILIIL(this);
    }

    public C1134130fcR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLIZLLLIL(ViewerPicksInfo viewerPicksInfo, boolean z) {
        e0(viewerPicksInfo.giftPickList);
    }

    public C1134130fcR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hwo, this, true);
        this.LLILLL = (ConstraintLayout) findViewById(R.id.f0v);
        this.LLILZ = (C16F5) findViewById(R.id.f10);
        this.LLILZIL = (C1126540fQC) findViewById(R.id.e1a);
        this.LLILZLL = (LinearLayout) findViewById(R.id.iy_);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFF(ViewerPicksInfo viewerPicksInfo, boolean z, DataChannel dataChannel, Long l) {
        C500260Jjc.LLFFF(this);
        this.LL = dataChannel;
        this.LLIZ = viewerPicksInfo.hasScore;
        if (viewerPicksInfo.hasDuration) {
            C500260Jjc.LLFFF(this.LLILZ);
            C500260Jjc.LLFFF(this.LLILLL);
            long j = 0;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    j = jLongValue;
                }
            }
            LJLI(j);
        } else {
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LJIILIIL(this.LLILLL);
        }
        C500260Jjc.LJIILIIL(this.LLILZIL);
        e0(viewerPicksInfo.giftPickList);
    }
}
