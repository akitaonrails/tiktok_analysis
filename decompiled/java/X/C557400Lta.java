package X;

import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Lta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557400Lta extends C09AY implements InterfaceC1631630sYr<SpannableString, List<? extends C0M37>, List<? extends MetricAffectingSpan>, Boolean, Unit> {
    public final /* synthetic */ C557370LtX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557400Lta(C557370LtX c557370LtX) {
        super(4);
        this.LL = c557370LtX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(SpannableString spannableString, List<? extends C0M37> list, List<? extends MetricAffectingSpan> list2, Boolean bool) {
        boolean z;
        SpannableString spannableString2 = spannableString;
        List<? extends C0M37> list3 = list;
        List<? extends MetricAffectingSpan> list4 = list2;
        boolean zBooleanValue = bool.booleanValue();
        C557370LtX c557370LtX = this.LL;
        c557370LtX.LLJJIJI = spannableString2;
        if (c557370LtX.LLJJIJIIJIL.size() == list3.size() && !zBooleanValue) {
            z = false;
        } else {
            z = true;
        }
        C557370LtX c557370LtX2 = this.LL;
        c557370LtX2.LLJJIJIIJIL = list3;
        c557370LtX2.LLJJIJIL = list4;
        c557370LtX2.uo().onNext(spannableString2.toString());
        if (z) {
            this.LL.O0().onNext(this.LL.uk());
        }
        return Unit.LIZ;
    }
}
