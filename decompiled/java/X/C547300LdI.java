package X;

import com.bytedance.aigc.proto.Business;
import com.bytedance.aigc.proto.Scene;
import com.bytedance.aigc.proto.Tenant;

/* JADX INFO: renamed from: X.0LdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547300LdI {
    public static final C547200Ld8 LIZ = new C547200Ld8(Tenant.NO, Business.NO, Scene.NO);
    public static final C547200Ld8 LIZIZ;
    public static final C547200Ld8 LIZJ;
    public static final C547200Ld8 LIZLLL;

    static {
        Tenant tenant = Tenant.aigc;
        Business business = Business.AI_THEATER;
        LIZIZ = new C547200Ld8(tenant, business, Scene.CAMEO);
        LIZJ = new C547200Ld8(tenant, business, Scene.VIDEO);
        LIZLLL = new C547200Ld8(tenant, Business.AI_PORTRAIT, Scene.PORTRAIT);
    }
}
