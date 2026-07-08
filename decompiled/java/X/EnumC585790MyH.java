package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585790MyH {
    public static final /* synthetic */ EnumC585790MyH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585790MyH TASK_EXEC;

    public static InterfaceC2044707zh<EnumC585790MyH> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC585790MyH[] values() {
        return (EnumC585790MyH[]) LL.clone();
    }

    static {
        boolean zLJI = MethodIDManager.LJI(196716);
        EnumC585790MyH enumC585790MyH = new EnumC585790MyH();
        TASK_EXEC = enumC585790MyH;
        EnumC585790MyH[] enumC585790MyHArr = {enumC585790MyH};
        LL = enumC585790MyHArr;
        LLILLJJLI = new C2254308sP(enumC585790MyHArr);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static EnumC585790MyH valueOf(String str) {
        return (EnumC585790MyH) C08FF.LIZ(EnumC585790MyH.class, str);
    }
}
