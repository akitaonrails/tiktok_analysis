package X;

import com.ss.android.ugc.aweme.autofill.AdPaymentList;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0duC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068260duC extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068260duC(int i, String str, long j, String str2, String str3, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int size;
        List<AdPaymentModel> list;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1068220du8.LIZ.getClass();
        c1023640ckE2.withParam(C1068220du8.LJIILJJIL, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C1068220du8.LJIILL, Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        if (!this.LLILLJJLI) {
            c1023640ckE2.withParam(C1068220du8.LJIIJ, this.LLILLL);
            c1023640ckE2.withParam(C1068220du8.LIZLLL, this.LLILZ);
        }
        c1023640ckE2.withParam(C1068220du8.LJIILLIIL, Long.valueOf(System.currentTimeMillis() - this.LLILZIL));
        C1002190cBd c1002190cBd = C1068220du8.LJIIZILJ;
        C1068720duw.LIZ.getClass();
        List<MaskInstrumentInfo> list2 = C1068720duw.LIZJ.get(this.LLILZLL);
        int size2 = 0;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        c1023640ckE2.withParam(c1002190cBd, Integer.valueOf(size));
        C1002190cBd c1002190cBd2 = C1068220du8.LJIJ;
        AdPaymentList adPaymentListLJIL = C1067990dtl.LJIL();
        if (adPaymentListLJIL != null && (list = adPaymentListLJIL.getList()) != null) {
            size2 = list.size();
        }
        c1023640ckE2.withParam(c1002190cBd2, Integer.valueOf(size2));
        return Unit.LIZ;
    }
}
