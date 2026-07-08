package X;

import com.bytedance.pipo.stellar.base.page.StellarPageViewModel;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM;
import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0wJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776150wJx extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776150wJx(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        StellarPageViewModel stellarPageViewModel = (StellarPageViewModel) c1776150wJx.l0;
        stellarPageViewModel.getClass();
        String str = null;
        stellarPageViewModel.setState(new AwS76S1000000_26(null, 51));
        C1222130huN c1222130huN = C1222130huN.LIZ;
        C1719840ur8 c1719840ur8 = ((StellarPageViewModel) c1776150wJx.l0).LL;
        if (c1719840ur8 != null) {
            str = c1719840ur8.LLJILJIL;
        }
        c1222130huN.getClass();
        C1222130huN.LIZIZ("STELLAR_EVENT_DATA_FETCH_FAIL", str, "client_exception");
    }

    public static final void LJJ$1(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        GiftCardCheckoutVM giftCardCheckoutVM = (GiftCardCheckoutVM) c1776150wJx.l0;
        giftCardCheckoutVM.getClass();
        giftCardCheckoutVM.setState(AFwS268S0000000_26.get$arr$(697));
    }

    public static final void LJJ$2(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        GiftCardCheckoutVM giftCardCheckoutVM = (GiftCardCheckoutVM) c1776150wJx.l0;
        giftCardCheckoutVM.getClass();
        giftCardCheckoutVM.setState(AFwS268S0000000_26.get$arr$(699));
    }

    public static final void LJJ$3(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        GiftCardCheckoutVM giftCardCheckoutVM = (GiftCardCheckoutVM) c1776150wJx.l0;
        giftCardCheckoutVM.getClass();
        giftCardCheckoutVM.setState(AFwS268S0000000_26.get$arr$(698));
    }

    public static final void LJJ$4(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        ((OCRVerifyViewModel) c1776150wJx.l0).setState(new AwS605S0100000_26(th, 431));
    }

    public static final void LJJ$5(C1776150wJx c1776150wJx, CoroutineContext coroutineContext, Throwable th) {
        C1713600uh4.LIZIZ(th);
        ((C1713570uh1) c1776150wJx.l0).LJIILIIL.LIZ(C1713490ugt.LIZ("GLOBAL_CATCH", th, 4));
    }
}
