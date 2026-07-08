package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548880Lfq {
    public static final C548880Lfq LIZ = new C548880Lfq();

    public static Object LIZJ(Object obj) {
        if (obj instanceof AIGC) {
            return LIZJ(((AIGC) obj).getValue());
        }
        if (!(obj instanceof Boolean)) {
            return obj;
        }
        return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
    }

    public static void LIZLLL(InterfaceC548890Lfr interfaceC548890Lfr, InterfaceC548750Lfd interfaceC548750Lfd, Function1 function1) {
        String name = interfaceC548890Lfr.getName();
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, interfaceC548890Lfr.getName(), interfaceC548890Lfr, interfaceC548750Lfd, function1);
        C20684815ws.LJIILLIIL(name, c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0LAB r11, java.lang.String r12, X.InterfaceC548890Lfr r13, X.InterfaceC548750Lfd r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C548880Lfq.LIZ(X.0LAB, java.lang.String, X.0Lfr, X.0Lfd, kotlin.jvm.functions.Function1):void");
    }
}
