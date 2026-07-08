package X;

import android.util.Log;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.container.BasePigeonContainer;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YXD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YXD {
    public static final C0NZB LIZIZ(GECPigeon gECPigeon, C19719912Dl c19719912Dl) throws Exception {
        Class<? super Object> superclass;
        C0NZB c0nzbLIZLLL = LIZLLL(gECPigeon, c19719912Dl);
        if (c0nzbLIZLLL != null) {
            superclass = c0nzbLIZLLL.getClass().getSuperclass();
        } else {
            superclass = null;
        }
        if (!Intrinsics.LJFF(superclass, AbsPigeonGlobalProtocol.class)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("target component not the GlobalComponent!!! ");
            sbLIZ.append(c19719912Dl);
            sbLIZ.append(" \n ");
            sbLIZ.append(Log.getStackTraceString(new Exception()));
            Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ));
            if (gECPigeon.getPigeonDepend().LIZJ().LIZ()) {
                gECPigeon.getPigeonDepend().LIZIZ();
            } else {
                throw exc;
            }
        }
        if (c0nzbLIZLLL != null) {
            return c0nzbLIZLLL;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("target component is null: ");
        sbLIZ2.append(c19719912Dl);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final void LIZJ(GECPigeon gECPigeon, Function1<? super C0YXB, Unit> function1) {
        gECPigeon.getContainerStore().LIZ(function1);
    }

    public static final <T extends C0NZB> T LIZLLL(GECPigeon gECPigeon, C13IQ<? extends T> c13iq) {
        BasePigeonContainer basePigeonContainer;
        List<I_PROTOCOL> list;
        T t;
        for (C0YXB c0yxb : gECPigeon.getContainerStore().LIZ) {
            if ((c0yxb instanceof BasePigeonContainer) && (basePigeonContainer = (BasePigeonContainer) c0yxb) != null && (list = basePigeonContainer.LL) != 0) {
                for (I_PROTOCOL i_protocol : list) {
                    if (C09R7.LIZ(c13iq).isInstance(i_protocol) && (i_protocol instanceof C0NZB) && (t = (T) i_protocol) != null) {
                        return t;
                    }
                }
            }
        }
        return null;
    }

    public static final BasePigeonContainer LIZ(GECPigeon gECPigeon, C19719912Dl c19719912Dl, Function1 function1) {
        BasePigeonContainer basePigeonContainer = (BasePigeonContainer) C09R7.LIZ(c19719912Dl).getConstructor(GECPigeon.class).newInstance(gECPigeon);
        gECPigeon.getContainerStore().LIZ.add(0, basePigeonContainer);
        function1.invoke(basePigeonContainer);
        basePigeonContainer.LJJIL();
        return basePigeonContainer;
    }
}
