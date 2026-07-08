package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14LJ {
    public static final String LIZJ(Throwable th) {
        String string;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            string = stringWriter.toString();
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        printWriter.close();
        return string;
    }

    public static final <T> long LIZLLL(T t) {
        try {
            Field declaredField = t.getClass().getDeclaredField("swigCPtr");
            declaredField.setAccessible(true);
            return declaredField.getLong(t);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static final void LJ(NLETrack nLETrack) {
        nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
    }

    public static final NLETrackSlot LIZ(NLEModel nLEModel, String str) {
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                    return nLETrackSlot;
                }
            }
        }
        return null;
    }

    public static final Pair<NLETrack, NLETrackSlot> LIZIZ(NLEModel nLEModel, String str) {
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                    return new Pair<>(nLETrack, nLETrackSlot);
                }
            }
        }
        return null;
    }
}
