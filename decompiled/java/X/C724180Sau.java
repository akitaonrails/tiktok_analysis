package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724180Sau extends C09AY implements Function1<ReusedAssem<?>, Unit> {
    public C724180Sau() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReusedAssem<?> reusedAssem) {
        ((CopyOnWriteArrayList) reusedAssem.LL.LL.getValue()).clear();
        return Unit.LIZ;
    }
}
