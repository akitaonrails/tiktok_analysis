package X;

import com.bytedance.retrofit2.client.Request;

/* JADX INFO: renamed from: X.0XK0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XK0 {
    public static final C0XK1 LIZIZ = new C0XK1(false, false);
    public final C0XK0 LIZ;

    public abstract C0XK1 LIZ(C0XK5 c0xk5, Request request, C0X52 c0x52);

    public C0XK0(C0XK0 c0xk0) {
        this.LIZ = c0xk0;
    }

    public final C0XK1 LIZIZ(C0XK5 c0xk5, Request request, C0X52 c0x52) {
        C0XK0 c0xk0;
        C0XK1 c0xk1LIZ = LIZ(c0xk5, request, c0x52);
        if (!c0xk1LIZ.LIZIZ && (c0xk0 = this.LIZ) != null) {
            return c0xk0.LIZIZ(c0xk5, request, c0x52);
        }
        return c0xk1LIZ;
    }
}
