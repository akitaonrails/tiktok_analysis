package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.live.view.ECTrendingLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.video.view.ECTrendingVideoAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view.ECTrendingVoucherAssem;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776070wJp implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1776070wJp(Object obj, StellarCardAdapter<T> stellarCardAdapter) {
        this.$t = stellarCardAdapter;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1776070wJp c1776070wJp, View view, String str) {
        StellarCardAdapter stellarCardAdapter;
        InterfaceC1720700usW interfaceC1720700usWR5;
        long jLongValue;
        InterfaceC1720550usH interfaceC1720550usH = (InterfaceC1720550usH) ((StellarCardAdapter) c1776070wJp.l0).getItem();
        if (interfaceC1720550usH != null && (interfaceC1720700usWR5 = (stellarCardAdapter = (StellarCardAdapter) c1776070wJp.l0).R5()) != null) {
            long j = stellarCardAdapter.LL;
            Long l = stellarCardAdapter.LLILLL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j2 = stellarCardAdapter.LLILLJJLI;
            interfaceC1720700usWR5.KH2(interfaceC1720550usH, j + jLongValue + j2, stellarCardAdapter.LL, j2, stellarCardAdapter.LLILLL);
        }
        ((StellarCardAdapter) c1776070wJp.l0).P5();
    }

    public static final void LIZ$1(C1776070wJp c1776070wJp, View view, String str) {
        String str2;
        ((ECTrendingLiveAssem) c1776070wJp.l0).op().zQ2(EnumC685980QvU.LIVE.getType(), str);
        View viewLJJIJL = ((ECTrendingLiveAssem) c1776070wJp.l0).LJJIJL();
        if (viewLJJIJL != null) {
            C049L c049l = new C049L();
            C1742410vRX c1742410vRX = C1742410vRX.LIZ;
            C1742820vSC c1742820vSC = ((ECTrendingLiveAssem) c1776070wJp.l0).op().LL;
            if (c1742820vSC != null) {
                str2 = c1742820vSC.LJIIIIZZ;
            } else {
                str2 = null;
            }
            c1742410vRX.getClass();
            C1748720vbi.LJ(viewLJJIJL, c049l, C1742410vRX.LIZIZ(str2), ((ECTrendingLiveAssem) c1776070wJp.l0).op().LLILZLL, new AwS605S0100000_26((ECTrendingLiveAssem) c1776070wJp.l0, 284));
        }
    }

    public static final void LIZ$2(C1776070wJp c1776070wJp, View view, String str) {
        String str2;
        ((ECTrendingVideoAssem) c1776070wJp.l0).op().zQ2(EnumC685980QvU.VIDEO.getType(), str);
        View viewLJJIJL = ((ECTrendingVideoAssem) c1776070wJp.l0).LJJIJL();
        C049L c049l = new C049L();
        C1742410vRX c1742410vRX = C1742410vRX.LIZ;
        C1742820vSC c1742820vSC = ((ECTrendingVideoAssem) c1776070wJp.l0).op().LL;
        if (c1742820vSC != null) {
            str2 = c1742820vSC.LJIIIIZZ;
        } else {
            str2 = null;
        }
        c1742410vRX.getClass();
        C1748720vbi.LJ(viewLJJIJL, c049l, C1742410vRX.LIZIZ(str2), ((ECTrendingVideoAssem) c1776070wJp.l0).op().LLILZLL, new AwS605S0100000_26((ECTrendingVideoAssem) c1776070wJp.l0, 288));
    }

    public static final void LIZ$3(C1776070wJp c1776070wJp, View view, String str) {
        if (view != null) {
            C1748720vbi.LIZLLL(view, new C1751560vgI(), new AwS605S0100000_26((ECTrendingVoucherAssem) c1776070wJp.l0, 295));
        }
    }
}
