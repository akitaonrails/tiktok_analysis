package X;

import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.14iQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20340414iQ {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS221S0000000_31.get$arr$(497));

    public static Gson LIZ() {
        return (Gson) LIZ.getValue();
    }

    public static void LIZIZ(Function0 function0) {
        InterfaceC20338714i9 interfaceC20338714i9;
        InterfaceC20338714i9 interfaceC20338714i92 = C20338614i8.LIZIZ;
        if (interfaceC20338714i92 != null && ((C20338514i7) interfaceC20338714i92).LIZ.isOpen() && (interfaceC20338714i9 = C20338614i8.LIZIZ) != null) {
            ((C20338514i7) interfaceC20338714i9).LIZ.sendMessage((WLDataModel) function0.invoke());
        }
    }

    public static void LIZJ(Function0 function0) {
        InterfaceC20338714i9 interfaceC20338714i9 = C20338614i8.LIZIZ;
        if (interfaceC20338714i9 != null && ((C20338514i7) interfaceC20338714i9).LIZ.isOpen()) {
            function0.invoke();
        }
    }
}
