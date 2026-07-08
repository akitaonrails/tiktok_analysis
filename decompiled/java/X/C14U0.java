package X;

import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14U0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C14U0 extends WeakHandler.IHandler {
    void cancelMultiUpload();

    void multiUploadImages(List<C20272214Tw> list, Function0<Unit> function0);

    void releaseListener();
}
