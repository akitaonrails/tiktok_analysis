package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.LazyLoadContext;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.05n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456705n3 {
    public final String LIZ;
    public final LazyLoadContext LIZIZ;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public volatile boolean LJ;

    public static InterfaceC1456905n5 LIZ() {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder;
        C01K1 c01k1Build;
        IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IECRetrofitFactory.class, false, false, false, 14, null);
        if (iECRetrofitFactory != null && (interfaceC859903XpCreateBuilder = iECRetrofitFactory.createBuilder("https://oec-api.tiktokv.com/")) != null && (c01k1Build = interfaceC859903XpCreateBuilder.build()) != null) {
            return (InterfaceC1456905n5) c01k1Build.create(InterfaceC1456905n5.class);
        }
        "IECRetrofitFactory SPI not available".toString();
        throw new IllegalStateException("IECRetrofitFactory SPI not available");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[Catch: Exception -> 0x00f9, o -> 0x014a, IOException -> 0x019a, TryCatch #2 {o -> 0x014a, IOException -> 0x019a, Exception -> 0x00f9, blocks: (B:25:0x0089, B:27:0x0095, B:28:0x0099, B:30:0x009f, B:31:0x00a3, B:35:0x00b0, B:37:0x00df, B:34:0x00ad, B:42:0x00f4), top: B:78:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: Exception -> 0x00f9, o -> 0x014a, IOException -> 0x019a, TryCatch #2 {o -> 0x014a, IOException -> 0x019a, Exception -> 0x00f9, blocks: (B:25:0x0089, B:27:0x0095, B:28:0x0099, B:30:0x009f, B:31:0x00a3, B:35:0x00b0, B:37:0x00df, B:34:0x00ad, B:42:0x00f4), top: B:78:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[Catch: Exception -> 0x00f9, o -> 0x014a, IOException -> 0x019a, TryCatch #2 {o -> 0x014a, IOException -> 0x019a, Exception -> 0x00f9, blocks: (B:25:0x0089, B:27:0x0095, B:28:0x0099, B:30:0x009f, B:31:0x00a3, B:35:0x00b0, B:37:0x00df, B:34:0x00ad, B:42:0x00f4), top: B:78:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456705n3.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C1456705n3(String str, LazyLoadContext lazyLoadContext) {
        this.LIZ = str;
        this.LIZIZ = lazyLoadContext;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1457305n9.LIZ);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
