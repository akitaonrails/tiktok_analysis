package X;

import android.os.Build;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0YLX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLX {
    public static final Request LIZ(int i, int i2, RequestBody requestBody, InterfaceC870750YDx interfaceC870750YDx, C870830YEf c870830YEf, String str) {
        C0YKM c0ykmLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(interfaceC870750YDx.LIZ().LIZJ());
        linkedHashMap.putAll(interfaceC870750YDx.LIZ().LJ(i2));
        if (c870830YEf.LJIJ) {
            linkedHashMap.put("IMSDK-User-ID", String.valueOf(interfaceC870750YDx.LJ().getUid()));
        }
        if (c870830YEf.LIZIZ && (c0ykmLIZJ = interfaceC870750YDx.LIZJ()) != null && c0ykmLIZJ.LIZ()) {
            linkedHashMap.put("should_return_invalid_token", "true");
        }
        C0YLY c0yly = new C0YLY();
        if (!c870830YEf.LJJLIIIIJ.LJII) {
            c0yly.LJFF = "local";
            c0yly.LJI = interfaceC870750YDx.LJ().getToken();
            c0yly.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
            c0yly.LJIILJJIL = Build.MODEL;
            c0yly.LJIILL = Build.VERSION.RELEASE;
        }
        c0yly.LJII = EnumC872610YLb.ANDROID;
        c0yly.LJIIL = c870830YEf.LJ;
        c0yly.LJIILLIIL = String.valueOf(c870830YEf.LIZLLL);
        if (C0YLW.LIZIZ == null) {
            synchronized (C0YLW.class) {
                try {
                    if (C0YLW.LIZIZ == null) {
                        C0YLW.LIZIZ = new C0YLW();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c0yly.LJ = Long.valueOf(C0YLW.LIZIZ.LIZ());
        c0yly.LJIIIIZZ = Integer.valueOf(i);
        c0yly.LJIILIIL = "android";
        c0yly.LJIIJJI = c870830YEf.LIZ;
        c0yly.LIZLLL = Integer.valueOf(i2);
        c0yly.LJJ = str;
        c0yly.LJIIJ = requestBody;
        C1516540pZE.LIZIZ(linkedHashMap);
        c0yly.LJIIZILJ = linkedHashMap;
        c0yly.LJIJJ = EnumC872600YLa.fromValue(c870830YEf.LJJI);
        return c0yly.build();
    }
}
