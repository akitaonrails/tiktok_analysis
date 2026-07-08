package X;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor_data.FinishEncourageDecoupling;

/* JADX INFO: renamed from: X.0jwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300630jwz extends C1295710jp3 {
    public final /* synthetic */ FinishEncourageDecoupling LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300630jwz(C1295960jpS c1295960jpS, FinishEncourageDecoupling finishEncourageDecoupling) {
        super(c1295960jpS);
        this.LIZJ = finishEncourageDecoupling;
    }

    @Override // X.C1295710jp3
    public final String LIZIZ(String str, String str2) {
        double d;
        if (Intrinsics.LJFF(str, "nub")) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            FinishEncourageDecoupling finishEncourageDecoupling = this.LIZJ;
            if (finishEncourageDecoupling != null) {
                d = finishEncourageDecoupling.expectedScores;
            } else {
                d = 0.0d;
            }
            objArr[0] = Double.valueOf(d);
            return C786410Ut5.k4(locale, "%.2f USD", Arrays.copyOf(objArr, 1));
        }
        return str2;
    }
}
