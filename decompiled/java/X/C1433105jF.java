package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433105jF extends C09AY implements Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object>> {
    public C1433105jF() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object> invoke(WeakReference<C704830Rkn> weakReference) {
        WeakReference<C704830Rkn> weakReference2 = weakReference;
        if (weakReference2 != null) {
            weakReference2.get();
        }
        return new C1433005jE();
    }
}
