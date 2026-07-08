package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Map;

/* JADX INFO: renamed from: X.06Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617506Uz implements ViewModelStoreOwner, LifecycleOwner {
    public final String LL;
    public final Map<String, String> LLILLJJLI;
    public final C19EG LLILLL;
    public final Lifecycle LLILZ;
    public final ViewModelStore LLILZIL;

    public final Context LIZ() {
        C19EG c19eg = this.LLILLL;
        if (c19eg != null) {
            return c19eg;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLILZIL;
    }

    public C1617506Uz(C19EG c19eg, String str) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LL = str;
        this.LLILLJJLI = mapLJ;
        if (c19eg == null) {
            "Social Context init params error!".toString();
            throw new IllegalArgumentException("Social Context init params error!");
        }
        this.LLILLL = c19eg;
        if (c19eg != null) {
            this.LLILZ = c19eg.getLifecycle();
            this.LLILZIL = c19eg.getViewModelStore();
            return;
        }
        throw new IllegalStateException("Social Context need Lifecycle!");
    }
}
