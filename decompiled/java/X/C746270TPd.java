package X;

import java.net.Inet6Address;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746270TPd extends C09AY implements Function1<C838040WuA, String> {
    public final /* synthetic */ Inet6Address LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C746270TPd(Inet6Address inet6Address) {
        super(1);
        this.LL = inet6Address;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C838040WuA c838040WuA) throws Throwable {
        Object obj;
        Inet6Address inet6Address = this.LL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcJC+acxyxgQIiI13W/etPbXL+YCAu/R1zM0Bb7QJjCe6yoN6vCw/1XPD", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2778, "java/net/Inet6Address", "getHostAddress", inet6Address, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2778, "java/net/Inet6Address", "getHostAddress", null, objArr, inet6Address, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            inet6Address = (Inet6Address) obj;
        }
        String hostAddress = inet6Address.getHostAddress();
        c0wst.LIZ(2778, "java/net/Inet6Address", "getHostAddress", hostAddress, objArr, inet6Address, c0wzw, true);
        return hostAddress;
    }
}
