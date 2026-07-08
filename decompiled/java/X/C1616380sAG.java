package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616380sAG extends C09AY implements Function0<WeakHandler> {
    public C1616380sAG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final WeakHandler invoke() {
        return new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() { // from class: X.0sAH
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
            }
        });
    }
}
