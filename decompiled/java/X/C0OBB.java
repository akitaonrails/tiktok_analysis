package X;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.otherpage.screenshot.TakoScreenShotListener$1;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OBB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBB extends AbstractC2361009My {
    public final String LL;
    public final WeakReference<LifecycleOwner> LLILLJJLI;
    public final WeakReference<C19EG> LLILLL;
    public final LifecycleOwner LLILZ;
    public final C19EG LLILZIL;
    public View LLILZLL;
    public String LLIZ;
    public Function0<Boolean> LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJ;
    public Function1<? super String, Unit> LLJI;
    public AnonymousClass0956 LLJIJIL;
    public C1856470yPV LLJILJIL;

    public final C19EG LIZ() {
        if (!C07Q4.LIZ()) {
            return this.LLILZIL;
        }
        WeakReference<C19EG> weakReference = this.LLILLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final LifecycleOwner LIZIZ() {
        if (!C07Q4.LIZ()) {
            return this.LLILZ;
        }
        WeakReference<LifecycleOwner> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        LifecycleCoroutineScope lifecycleScope;
        if (!this.LLIZLLLIL.invoke().booleanValue() || !Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LL, "general_search_tikbot") && (!Intrinsics.LJFF(this.LL, "homepage_hot_tikbot") || !C1591880rWk.LIZIZ.LJFF(LIZ()))) {
            return false;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        View view = this.LLILZLL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (view != null) {
            abstractC1387200mCcLIZ = C520040KaQ.LIZ(view);
        } else {
            abstractC1387200mCcLIZ = null;
        }
        if (!Intrinsics.LJFF(abstractC1387200mCcLJ, abstractC1387200mCcLIZ)) {
            return false;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleOwner lifecycleOwnerLIZIZ = LIZIZ();
        if ((lifecycleOwnerLIZIZ != null || (lifecycleOwnerLIZIZ = LIZ()) != null) && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C593390NPd(this, str, null), 3);
        }
        this.LLJIJIL = anonymousClass0956LIZLLL;
        return true;
    }

    public C0OBB(String str, C19EG c19eg, LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        this.LL = str;
        if (C07Q4.LIZ()) {
            this.LLILLJJLI = new WeakReference<>(lifecycleOwner);
            this.LLILLL = new WeakReference<>(c19eg);
        } else {
            this.LLILZIL = c19eg;
            this.LLILZ = lifecycleOwner;
        }
        LifecycleOwner lifecycleOwnerLIZIZ = LIZIZ();
        if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new TakoScreenShotListener$1(this, null), 3);
        }
        this.LLIZLLLIL = AFwS195S0000000_9.get$arr$(462);
        this.LLJ = AFwS231S0000000_3.get$arr$(173);
        this.LLJI = AFwS240S0000000_9.get$arr$(846);
    }
}
