package X;

import Y.ARunnableS116S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011110cQ1 extends AbstractC1010710cPN<ViewGroup> {
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public final Integer LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC1010450cOx LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewDetachedFromWindow() {
        LJIIL(false);
    }

    public final void LJIIIZ() {
        ISearchAdEventLogger iSearchAdEventLogger = this.LL.LJ;
        C1009980cOC.LIZ.getClass();
        iSearchAdEventLogger.logAd(C1009980cOC.LJJLIIIJJI);
        LJIIL(false);
    }

    public final EnumC1011340cQO LJIIJ() {
        AwemeRawAd awemeRawAd;
        if (C1010120cOQ.LIZJ(this.LLILLJJLI)) {
            return EnumC1011340cQO.FOLLOW;
        }
        Aweme aweme = this.LLILLJJLI;
        return (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !C1010120cOQ.LJJIJIIJIL(awemeRawAd)) ? EnumC1011340cQO.NORMAL : EnumC1011340cQO.TOP_SINGLE_CARD;
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void bind() {
        int i = C1011330cQN.LIZ[LJIIJ().ordinal()];
        if (i == 1) {
            this.LLJILJIL = R.layout.esr;
            this.LLJILJILJ = R.id.u5y;
        } else if (i == 2) {
            this.LLJILJIL = R.layout.c7p;
            this.LLJILJILJ = R.id.idx;
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            this.LLJILJIL = R.layout.ess;
            this.LLJILJILJ = R.id.o1i;
        }
        if (!C1011530cQh.LIZ().enableMaskLayoutInflate && LJIIJ() != EnumC1011340cQO.TOP_SINGLE_CARD) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), this.LLJILJIL, this.LL.LIZIZ, true);
            ViewGroup viewGroup = viewTd instanceof ViewGroup ? (ViewGroup) viewTd : null;
            this.LLIZ = viewGroup;
            this.LLILZLL = viewGroup != null ? (ViewGroup) viewGroup.findViewById(this.LLJILJILJ) : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maskType = ");
            sbLIZ.append(LJIIJ());
            sbLIZ.append(" add mask componentView = ");
            sbLIZ.append(this.LLILZLL);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C2510609se.LIZ;
        }
        ViewGroup viewGroup2 = this.LLIZ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
    }

    @Override // X.AbstractC1010710cPN
    public final /* bridge */ /* synthetic */ View LIZIZ() {
        return this.LLILZLL;
    }

    public C1011110cQ1(C1010580cPA c1010580cPA) {
        int iIntValue;
        Integer num;
        super(c1010580cPA);
        AwemeSearchAdModel awemeSearchAdModel = this.LLILLL;
        if (awemeSearchAdModel != null && (num = awemeSearchAdModel.showMaskTimes) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2;
        }
        this.LLIZLLLIL = Integer.valueOf(iIntValue);
    }

    @Override // X.AbstractC1010710cPN
    public final void LIZJ(InterfaceC1010450cOx interfaceC1010450cOx) {
        this.LLJIJIL = interfaceC1010450cOx;
        C1009940cO8.LIZIZ(interfaceC1010450cOx, this.LLILZIL, C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 773)), new Pair(C1010920cPi.LIZ, new AwS560S0100000_16(this, 774)), new Pair(C1010900cPg.LIZ, new AwS417S0200000_16(this, interfaceC1010450cOx, 77))));
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        AwemeRawAd awemeRawAd;
        Aweme aweme = c1010580cPA.LJI.getAweme();
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && !C1010120cOQ.LJIILL(aweme) && (C1010120cOQ.LJIIJJI(aweme) || C1010120cOQ.LIZJ(aweme))) {
            return true;
        }
        Aweme aweme2 = c1010580cPA.LJI.getAweme();
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && C1010120cOQ.LJJIJIIJIL(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public final void LJII(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            this.LLJI = true;
            this.LLJ = true;
            InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
            if (interfaceC1011430cQX != null) {
                interfaceC1011430cQX.LIZIZ(EnumC1011130cQ3.MASK_SHOW);
                interfaceC1011430cQX.LIZ(C1011570cQl.LIZ((C1011570cQl) interfaceC1011430cQX.LIZJ().getValue(), true, 0, 0, 126));
                return;
            }
            return;
        }
        InterfaceC1011430cQX interfaceC1011430cQX2 = this.LL.LIZLLL;
        if (interfaceC1011430cQX2 != null) {
            interfaceC1011430cQX2.LIZIZ(EnumC1011130cQ3.MASK_HIDE);
            interfaceC1011430cQX2.LIZ(C1011570cQl.LIZ((C1011570cQl) interfaceC1011430cQX2.LIZJ().getValue(), false, 0, 0, 126));
        }
        this.LLJI = false;
    }

    public final void LJIIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideMaskLayout isMaskShowing=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append("  needDelay=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (!this.LLJI) {
            return;
        }
        if (z) {
            C786410Ut5.LJLIIL(500L, C423340Giq.LIZ, new ARunnableS116S0100000_16(this, 171));
        } else {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            LJII(false);
        }
    }
}
