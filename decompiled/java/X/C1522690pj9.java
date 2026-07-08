package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522690pj9 extends AbstractC1522680pj8 implements InterfaceC1529320ptq {
    public static final List<EnumC1533980q1M> LJIIL = C1697810uHb.LJIIJJI(EnumC1533980q1M.LYNX_TEMPLATE, EnumC1533980q1M.LYNX_COMPONENT, EnumC1533980q1M.LYNX_I18N, EnumC1533980q1M.LYNX_CHILD_RESOURCE, EnumC1533980q1M.LYNX_EXTERNAL_JS, EnumC1533980q1M.LYNX_SSR_TEMPLATE, EnumC1533980q1M.LYNX_FONT);
    public static final List<EnumC1533980q1M> LJIILIIL = C1697810uHb.LJIIJJI(EnumC1533980q1M.WEB_MAIN_DOCUMENT, EnumC1533980q1M.WEB_CHILD_RESOURCE);
    public final boolean LJII;
    public C0X9S<?> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final C1E6N LJIIJJI;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // X.AbstractC1522680pj8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel() {
        /*
            r4 = this;
            r3 = 0
            X.0X9S<?> r0 = r4.LJIIIIZZ     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            r0.cancel()     // Catch: java.lang.Throwable -> L10
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L10
        La:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L10
            goto L1c
        Le:
            r0 = r3
            goto La
        L10:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L1c:
            r2 = 0
            X.0X9S<?> r0 = r4.LJIIIIZZ     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L30
            boolean r1 = r0.isCanceled()     // Catch: java.lang.Throwable -> L32
            r0 = 1
            if (r1 != r0) goto L30
        L28:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L32
            goto L3e
        L30:
            r0 = 0
            goto L28
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L45
            r3 = r1
        L45:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L4d
            boolean r2 = r3.booleanValue()
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1522690pj9.cancel():boolean");
    }

    @Override // X.InterfaceC1529320ptq
    public final InterfaceC1531800pxq LIZIZ() {
        return (C1522610pj1) C1522700pjA.LIZ.LIZLLL(this);
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean isValid() {
        C0X9S<?> c0x9s = this.LJIIIIZZ;
        boolean z = false;
        if (c0x9s != null && !c0x9s.isCanceled()) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1522690pj9(String str, Map<String, String> map, WebResourceRequest webResourceRequest, C1534070q1V c1534070q1V) {
        Uri uri = c1534070q1V.LJII.LJ;
        C1533490q0Z c1533490q0Z = c1534070q1V.LIZIZ.LIZ;
        this(str, uri, map, c1533490q0Z.LJFF, c1533490q0Z.LIZLLL, webResourceRequest, c1533490q0Z.LJJJ, c1534070q1V.LJIIL);
    }

    public C1522690pj9(String str, Uri uri, Map<String, String> map, Map<String, ? extends Object> map2, long j, WebResourceRequest webResourceRequest, EnumC1533980q1M enumC1533980q1M, boolean z) {
        boolean z2;
        C1E6N c1e6n;
        super(str, uri, map2, j, map);
        this.LJII = z;
        this.LJIIIZ = LJIIL.contains(enumC1533980q1M);
        if (webResourceRequest == null && !LJIILIIL.contains(enumC1533980q1M)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LJIIJ = z2;
        if (z2) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointWebView;
        } else if (enumC1533980q1M != EnumC1533980q1M.OTHER) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointLynx;
        } else {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointNative;
        }
        this.LJIIJJI = c1e6n;
    }
}
