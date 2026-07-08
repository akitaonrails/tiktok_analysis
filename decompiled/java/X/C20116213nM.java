package X;

import android.net.Uri;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20116213nM extends AbstractC20116113nL {
    public final String LIZ = "GECKO";

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.LIZ;
    }

    public final C0VSJ LIZIZ(String str, C1557570qdP c1557570qdP) {
        String str2 = c1557570qdP.LIZ;
        GeckoConfig geckoConfigLIZ = C1533610q0l.LIZ(C20116813nS.LIZ.LIZ(getService()), c1557570qdP.LIZ);
        geckoConfigLIZ.getOfflineDir();
        geckoConfigLIZ.getLoaderDepender().LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("using gecko info [accessKey=");
        sbLIZ.append(str2);
        sbLIZ.append(",filePath=");
        sbLIZ.append((Object) "");
        sbLIZ.append(']');
        printLog(C2188811AlT.LIZIZ(sbLIZ), EnumC20115313nD.I, "");
        if ("".length() == 0) {
            return null;
        }
        return new C0VSJ("");
    }

    public final void LIZ(Uri uri, C20116013nK c20116013nK, InterfaceC20115813nI interfaceC20115813nI) {
        String strSubstring;
        if (Intrinsics.LJFF(uri.getScheme(), "local_file") && Intrinsics.LJFF(uri.getAuthority(), "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && u.LJJIIJZLJL(path, "/", false) && (strSubstring = path.substring(1)) != null) {
                new ArrayList().add(strSubstring);
                C1533610q0l.LIZ(C20116813nS.LIZ.LIZ(getService()), c20116013nK.LIZ).getLoaderDepender().LIZLLL();
            } else {
                new ArrayList();
                interfaceC20115813nI.LIZ(new Exception("update failed because channel is null"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[Catch: FileNotFoundException -> 0x00bd, TryCatch #0 {FileNotFoundException -> 0x00bd, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0012, B:10:0x001a, B:12:0x0020, B:17:0x0030, B:19:0x0038, B:30:0x0058, B:31:0x005b, B:33:0x0086, B:34:0x0092, B:22:0x0042, B:24:0x004a, B:27:0x0051, B:36:0x0095, B:37:0x00a8, B:38:0x00a9, B:39:0x00bc), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20117213nW LIZJ(android.net.Uri r7, X.C1557570qdP r8, java.lang.String r9) {
        /*
            r6 = this;
            r5 = 0
            java.lang.String r2 = r7.getScheme()     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r3 = " not found"
            if (r2 == 0) goto La9
            int r1 = r2.hashCode()     // Catch: java.io.FileNotFoundException -> Lbd
            r0 = 1303296464(0x4daeb9d0, float:3.6642662E8)
            if (r1 != r0) goto La9
            java.lang.String r0 = "local_file"
            boolean r0 = r2.equals(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto La9
            java.lang.String r4 = r7.getAuthority()     // Catch: java.io.FileNotFoundException -> Lbd
            if (r4 == 0) goto L95
            int r2 = r4.hashCode()     // Catch: java.io.FileNotFoundException -> Lbd
            r0 = -554435892(0xffffffffdef3facc, float:-8.790294E18)
            java.lang.String r1 = ""
            if (r2 == r0) goto L42
            r0 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r2 != r0) goto L95
            java.lang.String r0 = "absolute"
            boolean r0 = r4.equals(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto L95
            X.0VSJ r4 = new X.0VSJ     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r0 = r7.getPath()     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto L58
            r1 = r0
            goto L58
        L42:
            java.lang.String r0 = "relative"
            boolean r0 = r4.equals(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto L95
            java.lang.String r0 = r7.getPath()     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto L51
            r1 = r0
        L51:
            X.0VSJ r4 = r6.LIZIZ(r1, r8)     // Catch: java.io.FileNotFoundException -> Lbd
            if (r4 != 0) goto L5b
            return r5
        L58:
            r4.<init>(r1)     // Catch: java.io.FileNotFoundException -> Lbd
        L5b:
            X.13nW r3 = new X.13nW     // Catch: java.io.FileNotFoundException -> Lbd
            r3.<init>()     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r2 = "load from gecko success"
            X.13nD r1 = X.EnumC20115313nD.I     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r0 = ""
            r6.printLog(r2, r1, r0)     // Catch: java.io.FileNotFoundException -> Lbd
            X.13nR r2 = new X.13nR     // Catch: java.io.FileNotFoundException -> Lbd
            r2.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lbd
            X.13nN r1 = X.C20116813nS.LIZ     // Catch: java.io.FileNotFoundException -> Lbd
            com.bytedance.ies.bullet.service.base.IResourceLoaderService r0 = r6.getService()     // Catch: java.io.FileNotFoundException -> Lbd
            X.0q0i r1 = r1.LIZ(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r0 = r8.LIZ     // Catch: java.io.FileNotFoundException -> Lbd
            com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig r1 = X.C1533610q0l.LIZ(r1, r0)     // Catch: java.io.FileNotFoundException -> Lbd
            X.13nV r0 = r1.getLoaderDepender()     // Catch: java.io.FileNotFoundException -> Lbd
            boolean r0 = r0 instanceof X.InterfaceC20117313nX     // Catch: java.io.FileNotFoundException -> Lbd
            if (r0 == 0) goto L92
            X.13nV r0 = r1.getLoaderDepender()     // Catch: java.io.FileNotFoundException -> Lbd
            X.13nX r0 = (X.InterfaceC20117313nX) r0     // Catch: java.io.FileNotFoundException -> Lbd
            r1.getOfflineDir()     // Catch: java.io.FileNotFoundException -> Lbd
            r0.LIZ()     // Catch: java.io.FileNotFoundException -> Lbd
        L92:
            r3.LIZ = r2     // Catch: java.io.FileNotFoundException -> Lbd
            return r3
        L95:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.io.FileNotFoundException -> Lbd
            r0.append(r7)     // Catch: java.io.FileNotFoundException -> Lbd
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            throw r1     // Catch: java.io.FileNotFoundException -> Lbd
        La9:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.io.FileNotFoundException -> Lbd
            r0.append(r7)     // Catch: java.io.FileNotFoundException -> Lbd
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Lbd
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Lbd
            throw r1     // Catch: java.io.FileNotFoundException -> Lbd
        Lbd:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20116213nM.LIZJ(android.net.Uri, X.0qdP, java.lang.String):X.13nW");
    }

    public final void LIZLLL(C1868620yj6 c1868620yj6, C1557570qdP c1557570qdP, String str, String str2, Function1 function1) {
        String strLIZIZ;
        new C20117013nU();
        if (a0.LJJIIZI(str2, "..", false)) {
            function1.invoke(new IllegalArgumentException("illegal bundle"));
            return;
        }
        if (str2.length() == 0) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(a0.LJJJJZ("/", str2));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZJ(C20116513nP.LIZ(strLIZIZ), c1557570qdP, str);
        c1868620yj6.getClass();
        throw null;
    }

    public final void LJ(final C1868620yj6 c1868620yj6, final C1557570qdP c1557570qdP, final String str, final String str2, final String str3, final Function1<? super C1868620yj6, Unit> function1, final Function1<? super Throwable, Unit> function12) throws JSONException {
        final boolean z;
        final C20117013nU c20117013nU = new C20117013nU();
        c1868620yj6.getClass();
        if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(null, "onlyLocal"), "1") && !c1557570qdP.LJ) {
            z = false;
        } else {
            z = true;
            if (!(c1868620yj6 instanceof C20117613na)) {
                function12.invoke(new Exception("gecko only local"));
            } else {
                ((C20117613na) c1868620yj6).LIZJ = "gecko only local";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.LIZ);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                jSONObject.put("detail", c1868620yj6);
                throw null;
            }
        }
        Uri uriLIZ = C20116513nP.LIZ(str);
        c1557570qdP.LJIILLIIL = 1;
        LIZ(uriLIZ, c1557570qdP, new InterfaceC20115813nI(c20117013nU, this, str3, str, str2, z, c1557570qdP, function1, function12) { // from class: X.13nO
            public final /* synthetic */ Function1<C1868620yj6, Unit> LIZIZ;
            public final /* synthetic */ Function1<Throwable, Unit> LIZJ;

            @Override // X.InterfaceC20115813nI
            public final void LIZ(Throwable th) {
                this.LIZ.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = function1;
                this.LIZJ = function12;
            }
        });
    }
}
