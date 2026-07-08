package X;

import java.net.Inet4Address;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746260TPc extends C09AY implements Function1<C838040WuA, String> {
    public final /* synthetic */ Inet4Address LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C746260TPc(Inet4Address inet4Address) {
        super(1);
        this.LL = inet4Address;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C838040WuA c838040WuA) throws Throwable {
        Object obj;
        Inet4Address inet4Address = this.LL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcJC+acxyxgQIiI13W/etPbXL+YCAu/R1zM0Bb7QJjCe6yoN6vCw/1XPD", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2777, "java/net/Inet4Address", "getHostAddress", inet4Address, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2777, "java/net/Inet4Address", "getHostAddress", null, objArr, inet4Address, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            inet4Address = (Inet4Address) obj;
        }
        String hostAddress = inet4Address.getHostAddress();
        c0wst.LIZ(2777, "java/net/Inet4Address", "getHostAddress", hostAddress, objArr, inet4Address, c0wzw, true);
        return hostAddress;
    }
}
