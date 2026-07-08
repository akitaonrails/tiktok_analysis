package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C604790Nnp extends C2217421BqW implements InterfaceC1631630sYr<Context, C604810Nnr, C604870Nnx, Function1<? super Boolean, ? extends Unit>, Unit> {
    public C604790Nnp(C604850Nnv c604850Nnv) {
        super(4, c604850Nnv, C604850Nnv.class, "subscribeBulletin", "subscribeBulletin(Landroid/content/Context;Lcom/ss/android/ugc/aweme/bulletin/BulletinInviteConfig;Lcom/ss/android/ugc/aweme/bulletin/BulletinInviteTracker;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Context context, C604810Nnr c604810Nnr, C604870Nnx c604870Nnx, Function1<? super Boolean, ? extends Unit> function1) {
        LifecycleCoroutineScope lifecycleScope;
        Context context2 = context;
        C604810Nnr c604810Nnr2 = c604810Nnr;
        C604870Nnx c604870Nnx2 = c604870Nnx;
        Function1<? super Boolean, ? extends Unit> function12 = function1;
        this.receiver.getClass();
        LifecycleOwner lifecycleOwner = c604810Nnr2.LIZIZ;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C604800Nnq(context2, c604810Nnr2, c604870Nnx2, function12, null), 2);
        }
        return Unit.LIZ;
    }
}
