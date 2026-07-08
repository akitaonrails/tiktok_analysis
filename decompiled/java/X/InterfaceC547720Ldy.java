package X;

import androidx.lifecycle.Lifecycle;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ldy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC547720Ldy {
    void checkAutoTask(Lifecycle lifecycle, String str);

    void clearCameoAutoTask(String str);

    boolean isEnableAutoGen();

    boolean isEnableCheckAutoTask();

    void markCloudDraftConsumed();

    Object saveDraft(String str, String str2, String str3, List<String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void setAutoTaskId(String str, String str2);

    void stopObserveTask(String str);
}
