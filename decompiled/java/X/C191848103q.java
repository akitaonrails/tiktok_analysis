package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Map;

/* JADX INFO: renamed from: X.103q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191848103q {
    public final Context LIZ;
    public final ViewModelStoreOwner LIZIZ;
    public final LifecycleOwner LIZJ;
    public final String LIZLLL;
    public final Bundle LJ;
    public final Map<Object, InterfaceC191818102m> LJFF;
    public final Map<Object, InterfaceC191837103f> LJI;
    public final InterfaceC191999109l LJII;

    public C191848103q(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, String str, Bundle bundle, Map map, C191993109f c191993109f, int i) {
        bundle = (i & 16) != 0 ? null : bundle;
        map = (i & 32) != 0 ? null : map;
        c191993109f = (i & 128) != 0 ? null : c191993109f;
        this.LIZ = context;
        this.LIZIZ = viewModelStoreOwner;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = str;
        this.LJ = bundle;
        this.LJFF = map;
        this.LJI = null;
        this.LJII = c191993109f;
    }
}
