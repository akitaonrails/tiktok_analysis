package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.12oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19867112oH {
    public final C19866412oA LIZ;
    public final List<InterfaceC798000VSc> LIZIZ = new ArrayList();
    public final BPEAHandler LIZJ;

    public C19867112oH(C19866412oA c19866412oA) {
        String lowerCase;
        this.LIZ = c19866412oA;
        this.LIZJ = new BPEAHandler(c19866412oA.LIZ.getMainLooper());
        for (Uri uri : c19866412oA.LIZLLL) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                lowerCase = "";
            } else {
                lowerCase = scheme.toLowerCase();
            }
            if (!"".equals(lowerCase) && !"file".equals(lowerCase)) {
                if ("asset".equals(lowerCase)) {
                    String path = uri.getPath();
                    path = path.startsWith("/") ? path.substring(1) : path;
                    final Context context = c19866412oA.LIZ;
                    final C0VSJ c0vsj = new C0VSJ(path);
                    ((ArrayList) this.LIZIZ).add(new InterfaceC798000VSc(context, c0vsj) { // from class: X.08FC
                        public final File LIZ;
                        public final AssetManager LIZIZ;
                        public final AtomicBoolean LIZJ = new AtomicBoolean(false);

                        @Override // X.InterfaceC798000VSc
                        public final Map<String, Long> LIZ() {
                            return Collections.emptyMap();
                        }

                        @Override // X.InterfaceC798000VSc
                        public final String LIZJ() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("asset:///");
                            sbLIZ.append(this.LIZ);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC798000VSc
                        public final InputStream LIZIZ(String str) {
                            if (!this.LIZJ.get()) {
                                C1553130qWF.LIZ("WebOffline-falcon", "AssetResLoader ready to load, file:", str);
                                return this.LIZIZ.open(new C0VSJ(this.LIZ, str).getPath());
                            }
                            throw new RuntimeException("released!");
                        }

                        {
                            this.LIZ = c0vsj;
                            this.LIZIZ = context.getAssets();
                        }
                    });
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown scheme:");
                    sbLIZ.append(uri);
                    C1553130qWF.LIZLLL("WebOffline-falcon", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                String path2 = uri.getPath();
                final Context context2 = c19866412oA.LIZ;
                final String str = c19866412oA.LIZIZ;
                final C0VSJ c0vsj2 = new C0VSJ(path2);
                ((ArrayList) this.LIZIZ).add(new InterfaceC798000VSc(context2, str, c0vsj2) { // from class: X.0VSY
                    public final C0VSX LIZ;

                    @Override // X.InterfaceC798000VSc
                    public final Map<String, Long> LIZ() {
                        return this.LIZ.LIZJ();
                    }

                    @Override // X.InterfaceC798000VSc
                    public final String LIZJ() {
                        return this.LIZ.LIZJ;
                    }

                    public final void finalize() throws Throwable {
                        super.finalize();
                        try {
                            this.LIZ.LJ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2222008nC.LIZ(e);
                        }
                    }

                    @Override // X.InterfaceC798000VSc
                    public final InputStream LIZIZ(String str2) {
                        C1553130qWF.LIZ("WebOffline-falcon", "GeckoResLoader ready to load, file:", str2);
                        return this.LIZ.LIZLLL(str2);
                    }

                    {
                        if (context2 != null) {
                            if (!TextUtils.isEmpty(str)) {
                                this.LIZ = new C0VSX(context2, str, c0vsj2);
                                return;
                            }
                            throw new RuntimeException("access key is empty");
                        }
                        throw new RuntimeException("context is null");
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[EDGE_INSN: B:88:0x0104->B:34:0x0104 BREAK  A[LOOP:1: B:17:0x0090->B:21:0x00af], EDGE_INSN: B:34:0x0104->B:36:0x0113 BREAK  A[LOOP:2: B:23:0x00b9->B:33:0x00fe], PHI: r3
      0x0104: PHI (r3v2 boolean) = (r3v9 boolean), (r3v10 boolean), (r3v12 boolean), (r3v7 boolean), (r3v1 boolean) binds: [B:11:0x0052, B:13:0x005e, B:15:0x0077, B:89:0x0104, B:88:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LIZ(final android.webkit.WebView r19, java.lang.String r20, final com.bytedance.falconx.statistic.InterceptorModel r21) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19867112oH.LIZ(android.webkit.WebView, java.lang.String, com.bytedance.falconx.statistic.InterceptorModel):android.webkit.WebResourceResponse");
    }
}
