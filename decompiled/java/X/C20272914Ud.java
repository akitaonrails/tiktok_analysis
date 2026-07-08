package X;

import Y.ARunnableS7S1101000_30;
import Y.ARunnableS99S0200000_30;
import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20272914Ud extends AbstractC20272814Uc {
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ InterfaceC20273014Ue LLILLL;

    @Override // X.C14UF
    public final void LIZIZ(C14UE c14ue) {
        this.LLILLJJLI.runOnUiThread(new ARunnableS99S0200000_30(this.LLILLL, c14ue, 21));
    }

    @Override // X.C14UF
    public final void LIZ(int i, String str) {
        this.LLILLJJLI.runOnUiThread(new ARunnableS7S1101000_30(this.LLILLL, i, str, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20272914Ud(Activity activity, C14UQ c14uq, WeakReference weakReference) {
        super(weakReference);
        this.LLILLJJLI = activity;
        this.LLILLL = c14uq;
    }
}
