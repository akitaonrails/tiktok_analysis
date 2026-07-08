package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJ9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C0NJE LIZ;
    public final C0NJ8 LIZIZ;

    public C0NJ9() {
        this(0);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0NJ9.class, "skuID", "getSkuID()Ljava/lang/String;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0NJ9.class, "productID", "getProductID()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0NJ9.class, "isFullScreen", "isFullScreen()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0NJ9.class, "hasOpenSku", "getHasOpenSku()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0NJ9.class, "hasOpenCombinedOsp", "getHasOpenCombinedOsp()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0NJ9.class, "isOneClickPay", "isOneClickPay()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0NJ9.class, "fullScreenMode", "getFullScreenMode()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0NJ9.class, "checkedSkuIds", "getCheckedSkuIds()[Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0NJ9.class, "quantity", "getQuantity()Ljava/lang/Integer;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public C0NJ9(int i) {
        C0NJE c0nje = new C0NJE();
        this.LIZ = c0nje;
        this.LIZIZ = new C0NJ8(c0nje, "full_screen_mode");
    }

    public final <T> T LIZ(String str) {
        T t = null;
        try {
            t = (T) C23250099c.LJ(C23271099x.INSTANCE, new C591780NIy(this, str, null));
            return t;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return t;
        }
    }

    public final Object LIZIZ(Object obj, String str) throws Throwable {
        try {
            obj = C23250099c.LJ(C23271099x.INSTANCE, new C591770NIx(this, str, obj, null));
            return obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return obj;
        }
    }
}
