package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S1100000_10;

/* JADX INFO: renamed from: X.0Qt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684490Qt5 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C684470Qt3 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684490Qt5(String str, String str2, C684470Qt3 c684470Qt3, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c684470Qt3;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        String str = "";
        if (!TextUtils.isEmpty(this.LL)) {
            String str2 = this.LL;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ2.LIZJ(0, str2, new AwS124S1100000_10(this.LLILLL, this.LLILZ, 20));
        }
        if (!TextUtils.isEmpty(this.LLILLJJLI)) {
            String str3 = this.LLILLJJLI;
            if (str3 != null) {
                str = str3;
            }
            c1397620mTQ2.LIZJ(1, str, new AwS124S1100000_10(this.LLILLL, this.LLILZ, 21));
        }
        return Unit.LIZ;
    }
}
