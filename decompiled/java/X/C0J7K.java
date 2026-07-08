package X;

import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J7K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7K extends C09AY implements Function0<Map<InterfaceC214902198i, WeakReference<SAFHelper.SAFLifecycleCompatWrapper>>> {
    public C0J7K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<InterfaceC214902198i, WeakReference<SAFHelper.SAFLifecycleCompatWrapper>> invoke() {
        return Collections.synchronizedMap(new WeakHashMap());
    }
}
