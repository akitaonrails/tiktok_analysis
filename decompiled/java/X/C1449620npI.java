package X;

import android.graphics.Matrix;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0npI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449620npI {
    public static Matrix LIZ(NLETrackSlot nLETrackSlot) {
        try {
            if (nLETrackSlot.hasExtra("crop_matrix")) {
                return LIZIZ(nLETrackSlot.getExtra("crop_matrix"));
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final Matrix LIZIZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(CastFloatProtector.parseFloat((String) it2.next())));
        }
        float[] fArrLLI = C13LP.LLI(arrayList);
        Matrix matrix = new Matrix();
        matrix.setValues(fArrLLI);
        return matrix;
    }

    public static final String LIZJ(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return C13LQ.LJJIJLIJ(fArr, ",", null, 62);
    }
}
