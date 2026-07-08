package X;

import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: X.0VaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800250VaJ implements InterfaceC800110Va5 {
    public final /* synthetic */ List<String> LIZ;

    @Override // X.InterfaceC800110Va5
    public final String scene() {
        return "broadcast-create-room";
    }

    public C800250VaJ(List<String> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC800110Va5
    public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2 == null) {
            return EnumC800210VaF.Normal;
        }
        if (Looper.getMainLooper().isCurrentThread()) {
            return EnumC800210VaF.Normal;
        }
        if (this.LIZ.contains(interfaceC800080Va2.key())) {
            return EnumC800210VaF.Normal;
        }
        EnumC799980VZs enumC799980VZsTriggerType = interfaceC800080Va2.triggerType();
        if (enumC799980VZsTriggerType != EnumC799980VZs.TASK_BACKGROUND && enumC799980VZsTriggerType != EnumC799980VZs.TASK_BOOT_FINISH) {
            return EnumC800210VaF.Normal;
        }
        return EnumC800210VaF.Suspend;
    }
}
