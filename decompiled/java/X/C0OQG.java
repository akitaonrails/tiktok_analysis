package X;

import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0OQG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQG {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        C0OS8.LIZ.getClass();
        Integer num = C0OS8.LJII().fpsDetailedCollectSampleRate;
        int iLJ = C13LZ.LJ(num != null ? num.intValue() : 15, 0, 100);
        return iLJ > 0 && System.nanoTime() % ((long) 100) < ((long) iLJ) && C296740Bk8.LIZ();
    }

    public static List LIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        boolean z;
        C0OQJ c0oqj;
        String string;
        int i;
        boolean z2;
        boolean z3;
        String string2;
        String string3;
        String string4;
        String string5;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int childCount = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i2);
            if (childAt != null) {
                if (childAt.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        Object tag = childAt.getTag(R.id.d2g);
                        if (tag == null || (string = tag.toString()) == null) {
                            string = "";
                        }
                        Object tag2 = childAt.getTag(R.id.d2f);
                        if (tag2 != null && (string5 = tag2.toString()) != null) {
                            i = CastIntegerProtector.parseInt(string5);
                        } else {
                            i = -1;
                        }
                        Object tag3 = childAt.getTag(R.id.d2d);
                        if (tag3 != null && (string4 = tag3.toString()) != null) {
                            z2 = Boolean.parseBoolean(string4);
                        } else {
                            z2 = false;
                        }
                        Object tag4 = childAt.getTag(R.id.d2e);
                        if (tag4 != null && (string3 = tag4.toString()) != null) {
                            z3 = Boolean.parseBoolean(string3);
                        } else {
                            z3 = false;
                        }
                        Object tag5 = childAt.getTag(R.id.d2c);
                        if (tag5 == null || (string2 = tag5.toString()) == null) {
                            string2 = "";
                        }
                        c0oqj = new C0OQJ(string, i, string2, z2, z3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FPS collect Info error: ");
                        sbLIZ.append(e.getMessage());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        c0oqj = null;
                    }
                    if (c0oqj != null) {
                        c13dvLIZIZ.add(c0oqj);
                    }
                }
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
