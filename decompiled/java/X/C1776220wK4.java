package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.live.view.ECTrendingLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.video.view.ECTrendingVideoAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view.ECTrendingVoucherAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0wK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776220wK4 extends AbstractC2211791BhR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this);
            case 1:
                return LIZLLL$1(this);
            case 2:
                return LIZLLL$2(this);
            default:
                return super.LIZLLL();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final InterfaceC2211931Bhf LJFF() {
        switch (this.$t) {
            case 0:
                return LJFF$0(this);
            case 1:
                return LJFF$1(this);
            case 2:
                return LJFF$2(this);
            default:
                return super.LJFF();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        switch (this.$t) {
            case 0:
                this.l0 = function0;
                break;
            case 1:
                this.l0 = function0;
                break;
            case 2:
                this.l0 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZLLL$0(C1776220wK4 c1776220wK4) {
        return (Function0) c1776220wK4.l0;
    }

    public static final Function0 LIZLLL$1(C1776220wK4 c1776220wK4) {
        return (Function0) c1776220wK4.l0;
    }

    public static final Function0 LIZLLL$2(C1776220wK4 c1776220wK4) {
        return (Function0) c1776220wK4.l0;
    }

    public static final InterfaceC2211931Bhf LJFF$0(C1776220wK4 c1776220wK4) {
        return (C1776070wJp) c1776220wK4.l1;
    }

    public static final InterfaceC2211931Bhf LJFF$1(C1776220wK4 c1776220wK4) {
        return (C1776070wJp) c1776220wK4.l1;
    }

    public static final InterfaceC2211931Bhf LJFF$2(C1776220wK4 c1776220wK4) {
        return (C1776070wJp) c1776220wK4.l1;
    }

    public C1776220wK4(ECTrendingLiveAssem eCTrendingLiveAssem, int i) {
        this.$t = i;
        this.l0 = new AwS570S0100000_26(eCTrendingLiveAssem, 654);
        this.l1 = new C1776070wJp(eCTrendingLiveAssem, 1);
    }

    public C1776220wK4(ECTrendingVideoAssem eCTrendingVideoAssem, int i) {
        this.$t = i;
        this.l0 = new AwS570S0100000_26(eCTrendingVideoAssem, 655);
        this.l1 = new C1776070wJp(eCTrendingVideoAssem, 2);
    }

    public C1776220wK4(ECTrendingVoucherAssem eCTrendingVoucherAssem, int i) {
        this.$t = i;
        this.l0 = new AwS570S0100000_26(eCTrendingVoucherAssem, 656);
        this.l1 = new C1776070wJp(eCTrendingVoucherAssem, 3);
    }
}
