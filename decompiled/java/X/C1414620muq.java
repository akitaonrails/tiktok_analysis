package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0muq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414620muq {
    public static final C1414620muq LIZ = new C1414620muq();
    public static final AtomicReference<C1414630mur> LIZIZ = new AtomicReference<>(null);
    public static VideoPublishEditModel LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(kotlin.jvm.functions.Function0 r12) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414620muq.LIZ(kotlin.jvm.functions.Function0):void");
    }

    public static void LIZJ(long j, EnumC1412690mrj enumC1412690mrj, Function0 function0) {
        AtomicReference<C1414630mur> atomicReference;
        C1414630mur c1414630mur;
        if (j == 0 || (c1414630mur = (atomicReference = LIZIZ).get()) == null) {
            return;
        }
        if (c1414630mur.LIZ == null) {
            atomicReference.set(C1414630mur.LIZ(c1414630mur, Long.valueOf(j), null, enumC1412690mrj, null, null, null, null, null, 250));
        }
        LIZ(new AwS566S0100000_22(function0, (Function0<Boolean>) 861));
    }

    public static void LIZIZ(long j, int i, Integer num, String str, Function0 function0) {
        AtomicReference<C1414630mur> atomicReference = LIZIZ;
        C1414630mur c1414630mur = atomicReference.get();
        if (c1414630mur == null) {
            return;
        }
        atomicReference.set(C1414630mur.LIZ(c1414630mur, null, null, null, Long.valueOf(j), Integer.valueOf(i), null, str, num, 39));
        LIZ(new AwS566S0100000_22(function0, (Function0<Boolean>) 860));
    }
}
