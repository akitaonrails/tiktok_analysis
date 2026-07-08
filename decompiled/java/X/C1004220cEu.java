package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004220cEu extends C09AY implements Function2<QuickShareButtonTrigger, C291001Au<? extends C0R9E>, Unit> {
    public C1004220cEu() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QuickShareButtonTrigger quickShareButtonTrigger, C291001Au<? extends C0R9E> c291001Au) {
        C0R9E c0r9e;
        QuickShareButtonTrigger quickShareButtonTrigger2 = quickShareButtonTrigger;
        C291001Au<? extends C0R9E> c291001Au2 = c291001Au;
        Object obj = null;
        if (c291001Au2 != null && (c0r9e = (C0R9E) c291001Au2.LIZ) != null && Intrinsics.LJFF(c0r9e.LIZ, ((VideoItemParams) C631370Opb.LIZ(quickShareButtonTrigger2)).getAweme().getAid())) {
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            C724270Sb3 c724270Sb3 = quickShareButtonTrigger2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            c1004550cFR.getClass();
            if (aid != null && C1004550cFR.LJ.contains(aid)) {
                C1720006oQ.LJ("QuickShareTrigger", "unRegisterElement ");
            }
        }
        return Unit.LIZ;
    }
}
