package X;

import android.content.Context;
import android.os.Handler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0OQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619290OQt {
    public static final C619290OQt LIZ = new C619290OQt();
    public static final ArrayDeque<C619260OQq> LIZIZ = new ArrayDeque<>();
    public static final ArrayDeque<C618800OOw> LIZJ = new ArrayDeque<>();
    public static final ArrayDeque<C0OQB> LIZLLL = new ArrayDeque<>();
    public static final ArrayDeque<C619280OQs> LJ = new ArrayDeque<>();
    public static volatile int LJFF;
    public static volatile long LJI;

    public static void LIZJ() {
        LJFF++;
        for (C619260OQq c619260OQq : LIZIZ) {
            c619260OQq.LLJILJIL = null;
            c619260OQq.LLJILJILJ = -1L;
            c619260OQq.LLJILLL = null;
            c619260OQq.LLJJ = null;
            c619260OQq.LLIZ = null;
            c619260OQq.LLIZLLLIL = null;
            c619260OQq.LLJ = null;
            c619260OQq.LLJI = null;
            c619260OQq.LLJIJIL = null;
        }
        for (C618800OOw c618800OOw : LIZJ) {
            c618800OOw.LLILLL = null;
            c618800OOw.LLILZ = null;
            c618800OOw.LLILZIL = null;
            c618800OOw.LLILLJJLI = "";
        }
        for (C0OQB c0oqb : LIZLLL) {
            Handler handler = c0oqb.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            c0oqb.LLILLJJLI = null;
            c0oqb.LLILLL = null;
            c0oqb.LLILZ = null;
            c0oqb.LLILZIL = null;
        }
        for (C619280OQs c619280OQs : LJ) {
            c619280OQs.LLJ = -1;
            c619280OQs.LLJI = null;
            c619280OQs.LLILZLL = null;
            c619280OQs.LLIZ = null;
            c619280OQs.LLIZLLLIL = null;
        }
    }

    public static void LIZ() {
        LIZJ();
        LIZIZ.clear();
        LIZJ.clear();
        LIZLLL.clear();
        LJ.clear();
    }

    public static long LIZIZ(Context context) {
        int iIntValue;
        int iIntValue2 = 0;
        boolean z = true;
        if (((Number) C279160Aws.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (!z) {
            return 0L;
        }
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
        long j3 = LJI;
        if (j3 == 0) {
            LJI = j2;
            return j2;
        }
        if (j3 != j2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EmojiPool theme changed prev=0x");
            CharsKt__CharJVMKt.checkRadix(16);
            sbLIZ.append(Long.toString(j3, 16));
            sbLIZ.append(" cur=0x");
            CharsKt__CharJVMKt.checkRadix(16);
            sbLIZ.append(Long.toString(j2, 16));
            sbLIZ.append(", clear pool");
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2187451AjH.LIZ;
            LIZ();
            LJI = j2;
        }
        return j2;
    }
}
