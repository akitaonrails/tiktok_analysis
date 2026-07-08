package X;

import Y.ARunnableS126S0100000_26;
import com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem;
import com.ss.android.ugc.aweme.verify.ocr.OCRScannedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS109S1200000_26;

/* JADX INFO: renamed from: X.0ujU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715100ujU extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseVerifyUIContentAssem LLILLL;
    public final /* synthetic */ String LLILZ = "ocr_verify_failed_retriable";
    public final /* synthetic */ Runnable LLILZIL;
    public final /* synthetic */ Runnable LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715100ujU(String str, String str2, OCRScannedAssem oCRScannedAssem, ARunnableS126S0100000_26 aRunnableS126S0100000_26, ARunnableS126S0100000_26 aRunnableS126S0100000_262) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = oCRScannedAssem;
        this.LLILZIL = aRunnableS126S0100000_26;
        this.LLILZLL = aRunnableS126S0100000_262;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        c1397630mTR2.LIZJ(0, this.LL, new AwS109S1200000_26(this.LLILLL, this.LLILZ, this.LLILZIL, 15));
        c1397630mTR2.LIZJ(1, this.LLILLJJLI, new AwS109S1200000_26(this.LLILLL, this.LLILZ, this.LLILZLL, 16));
        return Unit.LIZ;
    }
}
