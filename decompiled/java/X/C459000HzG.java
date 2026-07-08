package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459000HzG {
    public static InterfaceC1175904ir LIZ(UIAssem uIAssem) {
        return (InterfaceC1175904ir) uIAssem.getConfig().LLILZ.get("ACTION");
    }

    public static C05YD LIZIZ(UIAssem uIAssem) {
        return (C05YD) uIAssem.getConfig().LLILZ.get("UI_STATE");
    }

    public static Function2 LIZJ(UIAssem uIAssem) {
        Object obj = uIAssem.getConfig().LLILZ.get("VIEW_CONFIG");
        if (C19719512Dh.LJFF(2, obj)) {
            return (Function2) obj;
        }
        return null;
    }
}
