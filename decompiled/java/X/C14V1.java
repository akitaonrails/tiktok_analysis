package X;

import Y.ARunnableS7S1101000_30;
import Y.ARunnableS99S0200000_30;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14V1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14V1 extends C14V4 {
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ IChooseMediaResultCallback LLILLL;

    @Override // X.C14VG
    public final void LIZIZ(C14V6 c14v6) {
        this.LLILLJJLI.runOnUiThread(new ARunnableS99S0200000_30(this.LLILLL, c14v6, 17));
    }

    @Override // X.C14VG
    public final void LIZ(int i, String str) {
        this.LLILLJJLI.runOnUiThread(new ARunnableS7S1101000_30(this.LLILLL, i, str, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14V1(Activity activity, IChooseMediaResultCallback iChooseMediaResultCallback, WeakReference<Context> weakReference) {
        super(weakReference);
        this.LLILLJJLI = activity;
        this.LLILLL = iChooseMediaResultCallback;
    }
}
