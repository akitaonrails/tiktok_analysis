package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608920NuU extends C09AY implements Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object>> {
    public C608920NuU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object> invoke(WeakReference<C704830Rkn> weakReference) {
        C704830Rkn c704830Rkn;
        WeakReference<C704830Rkn> weakReference2 = weakReference;
        if (weakReference2 != null) {
            c704830Rkn = weakReference2.get();
        } else {
            c704830Rkn = null;
        }
        return new C608900NuS(c704830Rkn);
    }
}
