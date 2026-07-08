package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0OS5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS5 {
    public static final C0OS5 LIZ = new C0OS5();
    public static final ArrayDeque<C0OS1> LIZIZ = new ArrayDeque<>();
    public static final ArrayDeque<C0OS4> LIZJ = new ArrayDeque<>();
    public static final ArrayDeque<C0OS3> LIZLLL = new ArrayDeque<>();
    public static volatile int LJ;
    public static volatile long LJFF;

    public static void LIZ(Context context) {
        int iIntValue;
        int iIntValue2 = 0;
        if (((Number) C279160Aws.LIZ.getValue()).intValue() == 1) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            long j = ((long) iIntValue) & 4294967295L;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            long j2 = (((long) iIntValue2) & 4294967295L) | (j << 32);
            if (j2 == 0) {
                j2 = 1;
            }
            long j3 = LJFF;
            if (j3 == 0) {
                LJFF = j2;
                return;
            }
            if (j3 != j2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CommentFlowViewPool theme changed prev=0x");
                CharsKt__CharJVMKt.checkRadix(16);
                sbLIZ.append(Long.toString(j3, 16));
                sbLIZ.append(" cur=0x");
                CharsKt__CharJVMKt.checkRadix(16);
                sbLIZ.append(Long.toString(j2, 16));
                sbLIZ.append(", clear pool");
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                LJ++;
                LIZIZ.clear();
                LIZJ.clear();
                LIZLLL.clear();
                LJFF = j2;
            }
        }
    }
}
