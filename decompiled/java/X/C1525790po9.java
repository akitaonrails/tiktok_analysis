package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0po9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525790po9 extends AbstractC1525800poA implements InterfaceC1526090pod<EnumC1527170pqN> {
    public final Context LLILZIL;
    public final String LLILZLL;

    public C1525790po9(Context context) {
        super(context);
        this.LLILZIL = context;
        this.LLILZLL = "[HistoryDataMsgHandlerV4] ";
    }

    public static String LJ(C0WYV c0wyv) {
        try {
            String str = c0wyv.LJIIL;
            if (!TextUtils.isEmpty(str)) {
                Object[] array = new Regex(":").split(str, 0).toArray(new String[0]);
                if (array != null) {
                    return ((String[]) array)[r1.length - 1];
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.InterfaceC1526090pod
    public final boolean LIZ(EnumC1527170pqN enumC1527170pqN) {
        if (enumC1527170pqN == EnumC1527170pqN.Data) {
            return true;
        }
        return false;
    }

    public final void LJI(ArrayList<C0WYV> arrayList) {
        try {
            C0WYV c0wyv = arrayList.get(0);
            LJFF(c0wyv.LJI, c0wyv.LJIILIIL, LJ(c0wyv));
            C1526890ppv.LIZJ(this.LLILZIL).LIZIZ().LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJFF(long j, EnumC1525890poJ enumC1525890poJ, String str) {
        try {
            int i = C1525880poI.LIZ[enumC1525890poJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(enumC1525890poJ.getValue());
                        sbLIZ.append(':');
                        sbLIZ.append(j);
                        return;
                    }
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(enumC1525890poJ.getValue());
                sbLIZ2.append(':');
                sbLIZ2.append(j);
                sbLIZ2.append(':');
                sbLIZ2.append((Object) str);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(enumC1525890poJ.getValue());
            sbLIZ3.append(':');
            sbLIZ3.append(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0215  */
    @Override // X.InterfaceC1526090pod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r18, X.C1527010pq7 r19, java.util.List<X.C1527020pq8> r20) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525790po9.LIZIZ(int, X.0pq7, java.util.List):void");
    }
}
