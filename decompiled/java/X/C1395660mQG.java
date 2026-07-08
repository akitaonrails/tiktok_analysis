package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0mQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395660mQG {
    public static final C1395660mQG LIZ = new C1395660mQG();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(212));

    public static String LIZ() {
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktok_minis");
        sbLIZ.append('_');
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getSchemaUrlWithOutSchema, shortId:");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        return strLIZIZ;
    }

    public static void LIZIZ(Activity activity, Function1 function1) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeToAddShortcut, executor:");
        C01GW c01gw = LIZIZ;
        sbLIZ.append(c01gw.getValue());
        sbLIZ.append(", activity:");
        sbLIZ.append(activity);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC435390H5l interfaceC435390H5l = (InterfaceC435390H5l) c01gw.getValue();
        if (interfaceC435390H5l != null) {
            interfaceC435390H5l.LIZ(activity, "minigame", new AwS635S0100000_21(function1, (Function1<? super Boolean, Unit>) 110));
        }
    }
}
