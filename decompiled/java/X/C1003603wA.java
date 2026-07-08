package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S1200000_1;

/* JADX INFO: renamed from: X.03wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1003603wA {
    public static final /* synthetic */ int LIZJ = 0;
    public final ConcurrentHashMap<String, C996103ux> LIZ = new ConcurrentHashMap<>();
    public C996103ux LIZIZ;

    public final C996103ux LIZ(String str) {
        if (str != null) {
            C996103ux c996103ux = this.LIZ.get(str);
            C1326490kch c1326490kch = C1326490kch.LIZ;
            AwS118S1200000_1 awS118S1200000_1 = new AwS118S1200000_1(this, str, c996103ux, 5);
            c1326490kch.getClass();
            C1326490kch.LIZIZ(awS118S1200000_1);
            return c996103ux;
        }
        return null;
    }

    public final <T> T LIZIZ(String str, String str2, Integer num, Integer num2, Function1<? super C996103ux, ? extends T> function1) {
        C996103ux c996103uxLIZ = LIZ(C968803qY.LIZ(num, num2, str, str2));
        if (c996103uxLIZ != null) {
            return function1.invoke(c996103uxLIZ);
        }
        return null;
    }
}
