package X;

import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDK extends C0VDO {
    @Override // X.C0VDO
    public final String LJFF() {
        return "new_diskdir";
    }

    @Override // X.C0VDO
    public final boolean LJI(final C0VDC c0vdc) {
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(new InterfaceC792030V5d() { // from class: X.0VDJ
            @Override // X.InterfaceC792030V5d
            public final void LIZ() {
            }

            @Override // X.InterfaceC792030V5d
            public final void LJFF(JSONObject jSONObject, boolean z) {
                try {
                    try {
                        C0VDK c0vdk = this.LLILLJJLI;
                        C0VDC c0vdc2 = c0vdc;
                        c0vdk.getClass();
                        C0VDK.LJIIIIZZ(jSONObject, c0vdc2);
                    } catch (C0VFS e) {
                        TryCatchGuardChecker.doCheck(e);
                        C0VDK c0vdk2 = this.LLILLJJLI;
                        String message = e.getMessage();
                        C0VDC c0vdc3 = c0vdc;
                        c0vdk2.getClass();
                        C0VDO.LJII(message, c0vdc3);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringWriter stringWriter = new StringWriter();
                        e2.printStackTrace(new PrintWriter(stringWriter));
                        String strJ4 = C786410Ut5.j4("系统错误：%s", new Object[]{stringWriter.toString()});
                        C0VDK c0vdk3 = this.LLILLJJLI;
                        C0VDC c0vdc4 = c0vdc;
                        c0vdk3.getClass();
                        C0VDO.LJII(strJ4, c0vdc4);
                    }
                    ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).unregisterConfigListener(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).unregisterConfigListener(this);
                    throw th;
                }
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.OutputStreamWriter] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.OutputStreamWriter] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0VDn, java.io.OutputStreamWriter, java.io.Writer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(org.json.JSONObject r13, X.C0VDC r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VDK.LJIIIIZZ(org.json.JSONObject, X.0VDC):void");
    }
}
