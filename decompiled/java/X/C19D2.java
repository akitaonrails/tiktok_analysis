package X;

import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19D2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19D2 extends C19DE {
    public WeakReference<BaseActivity> LLILLJJLI;

    @Override // X.C19DE, X.InterfaceC21503119Dh
    public void LJJIJLIJ(BaseActivity baseActivity) {
        this.LLILLJJLI = null;
    }

    @Override // X.C19DE, X.InterfaceC21503119Dh
    public void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
        if (baseActivity != null) {
            this.LLILLJJLI = new WeakReference<>(baseActivity);
        }
    }
}
