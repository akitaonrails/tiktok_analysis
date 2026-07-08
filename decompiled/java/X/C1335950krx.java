package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.FeedForestFetchRequestController;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS229S0300000_20;
import kotlin.jvm.internal.AwS634S0100000_20;

/* JADX INFO: renamed from: X.0krx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335950krx extends C1331670kl3 {
    public final C1529660puO LJJLL;
    public final Forest LJJZ;
    public final C0TCI LJJZZI;
    public WeakReference<LifecycleOwner> LJJZZIII;
    public WeakReference<ImageView> LJL;
    public WeakReference<InterfaceC1334290kpH> LJLI;
    public Drawable LJLIIIL;
    public int LJLIIL;

    @Override // X.C1331670kl3
    public final void LJIIIZ() {
        LJIIJ(null);
    }

    @Override // X.C1331670kl3
    public final void LJIIJJI() {
        LJIIJ(null);
    }

    @Override // X.C1331670kl3
    public final void LJIIJ(InterfaceC427850Gq7 interfaceC427850Gq7) {
        Lifecycle lifecycle;
        C1529660puO c1529660puO = this.LJJLL;
        Forest forest = this.LJJZ;
        LifecycleOwner lifecycleOwner = this.LJJZZIII.get();
        if (lifecycleOwner != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        } else {
            lifecycle = null;
        }
        FeedForestFetchRequestController feedForestFetchRequestController = new FeedForestFetchRequestController(c1529660puO, forest, lifecycle, this.LJJZZI);
        AwS229S0300000_20 awS229S0300000_20 = new AwS229S0300000_20(this, interfaceC427850Gq7, feedForestFetchRequestController, 3);
        AwS634S0100000_20 awS634S0100000_20 = new AwS634S0100000_20(this, 2);
        feedForestFetchRequestController.LLIZLLLIL = awS229S0300000_20;
        feedForestFetchRequestController.LLJ = awS634S0100000_20;
        feedForestFetchRequestController.LIZIZ();
    }

    @Override // X.C1331670kl3
    public final void LJIIL(InterfaceC427850Gq7 interfaceC427850Gq7) {
        LJIIJ(interfaceC427850Gq7);
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJIJJLI(int i) {
        this.LJLIIL = i;
        this.LJLIIIL = null;
        this.LJIIZILJ = i;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJIL(Drawable drawable) {
        this.LJLIIIL = drawable;
        this.LJLIIL = 0;
        this.LJIJ = drawable;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJ(InterfaceC1334290kpH interfaceC1334290kpH) {
        this.LJLI = new WeakReference<>(interfaceC1334290kpH);
        this.LJJIIZI = interfaceC1334290kpH;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJI(ImageView imageView) {
        this.LJL = new WeakReference<>(imageView);
        this.LJJIJ = imageView;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJIIZ(int i) {
        this.LJIILIIL = i;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJIIZI(Drawable drawable) {
        this.LJIILL = drawable;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJIJL(Context context) {
        this.LIZJ = context;
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJIJLIJ(Fragment fragment) {
        this.LJJZZIII = new WeakReference<>(fragment);
        this.LIZJ = fragment.getActivity();
        return this;
    }

    @Override // X.C1331670kl3
    public final C1331670kl3 LJJIL(C19EG c19eg) {
        this.LJJZZIII = new WeakReference<>(c19eg);
        this.LIZJ = c19eg;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1335950krx(C1529660puO c1529660puO, Forest forest) {
        super(Uri.EMPTY);
        C2272621DxM c2272621DxM = C0TCH.LIZJ;
        this.LJJLL = c1529660puO;
        this.LJJZ = forest;
        this.LJJZZI = c2272621DxM;
        this.LJJZZIII = new WeakReference<>(null);
        this.LJL = new WeakReference<>(null);
        this.LJLI = new WeakReference<>(null);
    }

    public final void LJJIZ(File file, InterfaceC427850Gq7 interfaceC427850Gq7, FeedForestFetchRequestController feedForestFetchRequestController) {
        try {
            this.LIZ = Uri.fromFile(file);
            if (interfaceC427850Gq7 != null) {
                super.LJIIJ(interfaceC427850Gq7);
            } else {
                super.LJIIIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            feedForestFetchRequestController.LIZ(EnumC742810TBv.LIGHTEN_DISPLAY_FAILED, th);
        }
    }
}
