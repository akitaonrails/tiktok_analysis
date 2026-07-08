package X;

import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0olt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485950olt extends C09AY implements Function0<Unit> {
    public C1485950olt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C310410CEt.LIZ.getClass();
        DispatchConfig dispatchConfig = (DispatchConfig) C310410CEt.LIZJ.getValue();
        if (dispatchConfig != null) {
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_FYP_FEED;
            c1490190osj.LIZIZ(enumC2262571Dh9, dispatchConfig);
            C2187451AjH.LJIIZILJ(new InterfaceC2184631Aej() { // from class: X.0olu
                @Override // X.InterfaceC2184631Aej
                public final void onFragmentChange(String str, String str2, boolean z) {
                    if (a0.LJJIIZI(str2, "FeedRecommendFragment", false)) {
                        C1490190osj.LIZIZ.LIZ(EnumC2262571Dh9.BIZ_FYP_FEED);
                    } else {
                        C1490190osj.LIZIZ.LIZJ(EnumC2262571Dh9.BIZ_FYP_FEED);
                    }
                }
            });
            if (a0.LJJIIZI(C2187451AjH.LJIIIZ, "FeedRecommendFragment", false)) {
                c1490190osj.LIZ(enumC2262571Dh9);
            }
        }
        return Unit.LIZ;
    }
}
