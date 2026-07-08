package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0yEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class CallableC1849870yEr<V> implements Callable {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ int LLILLJJLI;

    public CallableC1849870yEr(int i, Map map) {
        this.LL = map;
        this.LLILLJJLI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ListenableFuture<TaskDoneReponse> listenableFutureRequestOnNotificationAction;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("TouchPointsRepo@43f6.doUploadAction$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ == null || (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) == null) {
            listenableFutureRequestOnNotificationAction = null;
        } else {
            String str = this.LL.get("notification_id");
            if (str == null) {
                str = "";
            }
            int i = this.LLILLJJLI;
            String str2 = this.LL.get("classification");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.LL.get("material_id");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.LL.get("count");
            listenableFutureRequestOnNotificationAction = iNetworkApiLIZJ.requestOnNotificationAction(str, i, str2, str3, str4 != null ? CastIntegerProtector.parseInt(str4) : 0, 0, null);
        }
        C1C7U.LIZIZ("TouchPointsRepo@43f6.doUploadAction$1");
        return listenableFutureRequestOnNotificationAction;
    }
}
