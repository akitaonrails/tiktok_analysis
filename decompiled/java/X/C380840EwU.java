package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380840EwU extends C09AY implements Function2<String, C0EDV, Unit> {
    public final /* synthetic */ C380820EwS LL;
    public final /* synthetic */ C380780EwO LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380840EwU(C380820EwS c380820EwS, C380780EwO c380780EwO, long j) {
        super(2);
        this.LL = c380820EwS;
        this.LLILLJJLI = c380780EwO;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, C0EDV c0edv) {
        String message;
        Activity activity;
        C0EDV c0edv2 = c0edv;
        if (this.LL.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C380820EwS.t5(this.LL, this.LLILLJJLI.LIZLLL, null, EnumC1641380soa.FAILED, null, null, null, null, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            String str2 = this.LLILLJJLI.LIZJ;
            String strValueOf = String.valueOf(c0edv2.LIZIZ);
            Exception exc = c0edv2.LIZ;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = null;
            }
            C376300EpA.LIZIZ("download_stroke", str2, strValueOf, message, false, jCurrentTimeMillis, 1);
            if (Intrinsics.LJFF(this.LL.LLJJJJ, str) && (activity = this.LL.LLJJI) != null) {
                C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131834056);
                creativeToastBuilder.isCenterToast(false);
                creativeToastBuilder.duration(2000L);
                ((C1390360mHi) c1390390mHl.createToast(activity, 1074, creativeToastBuilder)).show();
            }
        }
        return Unit.LIZ;
    }
}
