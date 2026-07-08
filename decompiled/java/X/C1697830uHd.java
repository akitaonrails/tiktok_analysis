package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0uHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697830uHd {
    public static final C1697830uHd LIZ = new C1697830uHd();
    public static String LIZIZ;

    public static boolean LIZIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not Enable Connect Now because SDK version is ");
        sbLIZ.append(i);
        C2344809Gs.LJFF("NearbyBleUtils", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public static String LJ() {
        C13LT c13lt = new C13LT('A', 'Z');
        IntRange intRange = new IntRange(1, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            it2.nextInt();
            try {
                arrayList.add(Character.valueOf((char) AbstractC19994813Le.Default.nextInt(c13lt.LL, c13lt.LLILLJJLI + 1)));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new NoSuchElementException(e.getMessage());
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
        LIZIZ = strLJJLIIIJ;
        return strLJJLIIIJ;
    }

    public static boolean LIZ(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        int iLIZ = C838410Wul.LIZ(context, "android.permission.BLUETOOTH_SCAN");
        int iLIZ2 = C838410Wul.LIZ(context, "android.permission.BLUETOOTH_CONNECT");
        int iLIZ3 = C838410Wul.LIZ(context, "android.permission.BLUETOOTH_ADVERTISE");
        if (iLIZ != 0 || iLIZ2 != 0 || iLIZ3 != 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context) {
        Boolean boolValueOf;
        PackageManager packageManager;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth_le"));
        } else {
            boolValueOf = null;
        }
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(boolValueOf, bool)) {
            C2344809Gs.LJFF("NearbyBleUtils", "Not Enable Connect Now because BLE not supported");
        }
        return Intrinsics.LJFF(boolValueOf, bool);
    }

    public static void LIZLLL(Context context, Function0 function0, Function0 function02) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131824858);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS391S0200000_25(function02, (Function0<Unit>) function0, (Function0<Unit>) 409));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
