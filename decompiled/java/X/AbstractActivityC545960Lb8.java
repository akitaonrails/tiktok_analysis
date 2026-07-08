package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Lb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC545960Lb8 extends AbstractActivityC1674880tgc {
    public final ArrayList<InterfaceC545970Lb9> LLIZ = new ArrayList<>();

    public Bundle LLLZZIL(Intent intent) {
        return null;
    }

    public abstract Class<? extends Scene> LLZ();

    public abstract void LLZLI();

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
        Iterator<InterfaceC545970Lb9> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().nm();
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
        Iterator<InterfaceC545970Lb9> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().S3(z);
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
        Iterator<InterfaceC545970Lb9> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().p2(z);
        }
    }

    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        Bundle bundleLLLZZIL = LLLZZIL(getIntent());
        C214873197f c214873197f = new C214873197f(this, LLZ());
        c214873197f.LIZJ = bundleLLLZZIL;
        LLZLI();
        c214873197f.LJI = false;
        c214873197f.LIZ();
    }
}
