package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245090iVP {
    public static final C1245090iVP LIZ = new C1245090iVP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(819));

    public static final void LIZ() {
        LIZ.getClass();
        C01GW c01gw = LIZIZ;
        Keva keva = (Keva) c01gw.getValue();
        C1222200huU c1222200huU = C1222200huU.LIZ;
        c1222200huU.getClass();
        ArrayList arrayList = (ArrayList) C13LQ.LJLI(keva.getStringArray(C1222200huU.LIZ("shown_notification_timestamp_array"), new String[0]));
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        Keva keva2 = (Keva) c01gw.getValue();
        c1222200huU.getClass();
        keva2.storeStringArray(C1222200huU.LIZ("shown_notification_timestamp_array"), (String[]) arrayList.toArray(new String[0]));
    }
}
