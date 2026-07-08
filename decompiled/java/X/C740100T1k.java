package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.ss.android.ugc.aweme.utils.FeedForestFetchRequestController;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS110S0400000_12;
import kotlin.jvm.internal.AwS448S0200000_12;

/* JADX INFO: renamed from: X.0T1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740100T1k {
    public final C1529660puO LIZ;
    public final Forest LIZIZ;
    public final C0TCI LIZJ;
    public WeakReference<LifecycleOwner> LIZLLL;
    public WeakReference<C1295960jpS> LJ;
    public boolean LJFF;

    public C740100T1k(C1529660puO c1529660puO, Forest forest) {
        C2272621DxM c2272621DxM = C0TCH.LIZJ;
        this.LIZ = c1529660puO;
        this.LIZIZ = forest;
        this.LIZJ = c2272621DxM;
        this.LIZLLL = new WeakReference<>(null);
        this.LJ = new WeakReference<>(null);
    }

    public final FeedForestFetchRequestController LIZ(Function1 function1, Function1 function12) {
        Lifecycle lifecycle;
        C0TLF c0tlf = new C0TLF(this);
        C1529660puO c1529660puO = this.LIZ;
        Forest forest = this.LIZIZ;
        LifecycleOwner lifecycleOwner = this.LIZLLL.get();
        if (lifecycleOwner != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        } else {
            lifecycle = null;
        }
        FeedForestFetchRequestController feedForestFetchRequestController = new FeedForestFetchRequestController(c1529660puO, forest, lifecycle, this.LIZJ);
        AwS110S0400000_12 awS110S0400000_12 = new AwS110S0400000_12(c0tlf, this, function1, feedForestFetchRequestController, 1);
        AwS448S0200000_12 awS448S0200000_12 = new AwS448S0200000_12(this, (C740100T1k) function12, (Function1<? super Throwable, Unit>) 3);
        feedForestFetchRequestController.LLIZLLLIL = awS110S0400000_12;
        feedForestFetchRequestController.LLJ = awS448S0200000_12;
        feedForestFetchRequestController.LIZIZ();
        return feedForestFetchRequestController;
    }
}
