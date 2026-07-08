package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.LiveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512500K8a extends C09AY implements InterfaceC1631630sYr<String, String, Boolean, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;
    public final /* synthetic */ LiveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1 LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C0KCC LLILZLL;
    public final /* synthetic */ C0K77 LLIZ;
    public final /* synthetic */ Object LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512500K8a(String str, C512520K8c c512520K8c, Lifecycle lifecycle, LiveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1 liveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1, LifecycleOwner lifecycleOwner, boolean z, C0KCC c0kcc, C0K77 c0k77, Object obj) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = liveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = z;
        this.LLILZLL = c0kcc;
        this.LLIZ = c0k77;
        this.LLIZLLLIL = obj;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, Boolean bool, Map<String, ? extends String> map) {
        Fragment fragment;
        Context context;
        bool.booleanValue();
        if (Intrinsics.LJFF(str, this.LL)) {
            try {
                this.LLIZ.LJJIJL(this.LLIZLLLIL);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLILLJJLI.removeObserver(this.LLILLL);
            Object obj = this.LLILZ;
            Context context2 = null;
            if ((obj instanceof Context) && (context = (Context) obj) != null) {
                context2 = context;
            } else if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null) {
                context2 = fragment.getContext();
            }
            boolean z = this.LLILZIL;
            C0KC9 c0kc9 = C0KC9.LIZ;
            C0KCC c0kcc = this.LLILZLL;
            Boolean boolValueOf = Boolean.valueOf(z);
            c0kc9.getClass();
            C0KC9.LIZLLL(c0kcc, boolValueOf, context2);
        }
        return Unit.LIZ;
    }
}
