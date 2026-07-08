package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.160l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207053160l extends C09AY implements Function2<CLACaptionAssemV2, C160Z, Unit> {
    public C207053160l() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CLACaptionAssemV2 cLACaptionAssemV2, C160Z c160z) {
        LinearLayout linearLayout;
        CLACaptionAssemV2 cLACaptionAssemV22 = cLACaptionAssemV2;
        if (c160z.LIZ) {
            C207056160o c207056160o = cLACaptionAssemV22.LLLII;
            if (c207056160o != null) {
                AnonymousClass1611 anonymousClass1611 = c207056160o.LJII;
                anonymousClass1611.getClass();
                if (C0A7T.LIZ()) {
                    if (anonymousClass1611.LIZJ == null) {
                        View viewLJLLJ = C786410Ut5.LJLLJ(anonymousClass1611.LIZ.getContext(), R.layout.ad_, anonymousClass1611.LIZ);
                        anonymousClass1611.LIZJ = (LinearLayout) viewLJLLJ.findViewById(R.id.jep);
                        C786410Ut5.T4(viewLJLLJ, 1.0f);
                        float f = C715390S4j.LIZ;
                        C715390S4j.LIZJ(20, anonymousClass1611.LIZJ);
                        C715390S4j.LIZIZ(20, anonymousClass1611.LIZJ);
                        C786410Ut5.I7(new ACListenerS165S0100000_31(anonymousClass1611, 5), viewLJLLJ);
                    }
                    LinearLayout linearLayout2 = anonymousClass1611.LIZJ;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                }
            }
        } else {
            C207056160o c207056160o2 = cLACaptionAssemV22.LLLII;
            if (c207056160o2 != null && (linearLayout = c207056160o2.LJII.LIZJ) != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        return Unit.LIZ;
    }
}
