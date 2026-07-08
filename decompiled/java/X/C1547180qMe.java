package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0qMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547180qMe {
    public static volatile C1547180qMe LIZIZ;
    public final List<C08SR> LIZ;

    public C1547180qMe() {
        LinkedList linkedList = new LinkedList();
        this.LIZ = linkedList;
        linkedList.add(new C08SR() { // from class: X.0qMf
            @Override // X.C08SR
            public final WebResourceResponse LIZ(Uri uri) {
                return null;
            }
        });
        linkedList.add(new C08SR() { // from class: X.08SP
            public volatile String LIZ;
            public volatile String LIZIZ;
            public volatile String LIZJ;
            public volatile String LIZLLL;

            public static File LIZIZ(Context context) throws Throwable {
                File file = C786450Ut9.LIZJ;
                if (file != null && C786450Ut9.LJ) {
                    return file;
                }
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(objInvoke);
                        if (obj instanceof Application) {
                            applicationContext = ((Application) obj).getApplicationContext();
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Application context obtained through ActivityThread: ");
                            sbLIZ.append(applicationContext);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            System.out.println("Error: mInitialApplication is not an instance of Application");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error: ");
                        sbLIZ2.append(e.getMessage());
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(":");
                        sbLIZ3.append(C08RN.LIZJ());
                        sbLIZ3.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                return C786450Ut9.LIZJ;
            }

            @Override // X.C08SR
            public final WebResourceResponse LIZ(Uri uri) {
                if (TextUtils.equals(uri.getScheme(), "liveresource") && TextUtils.equals(uri.getHost(), "file")) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "path");
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        return null;
                    }
                    C0VSJ c0vsj = new C0VSJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (!c0vsj.exists()) {
                        return null;
                    }
                    try {
                        if (!LIZJ(c0vsj)) {
                            return null;
                        }
                        return new WebResourceResponse("", "", new C0VSP(c0vsj));
                    } catch (IOException | NullPointerException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return null;
            }

            public final boolean LIZJ(C0VSJ c0vsj) {
                Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                if (context != null) {
                    try {
                        if (this.LIZIZ == null || this.LIZIZ.isEmpty()) {
                            this.LIZIZ = C786410Ut5.w2(context).getCanonicalPath();
                        }
                        if (this.LIZ == null || this.LIZ.isEmpty()) {
                            this.LIZ = LIZIZ(context).getCanonicalPath();
                        }
                        if (this.LIZLLL == null || this.LIZLLL.isEmpty()) {
                            this.LIZLLL = C786410Ut5.x2(context).getCanonicalPath();
                        }
                        if (this.LIZJ == null || this.LIZJ.isEmpty()) {
                            this.LIZJ = C786410Ut5.y2(context, null).getCanonicalPath();
                        }
                        try {
                            String canonicalPath = c0vsj.getCanonicalPath();
                            if (this.LIZIZ != null && canonicalPath.startsWith(this.LIZIZ)) {
                                return true;
                            }
                            if (this.LIZIZ != null && canonicalPath.startsWith(this.LIZ)) {
                                return true;
                            }
                            if (this.LIZJ != null && canonicalPath.startsWith(this.LIZJ)) {
                                return true;
                            }
                            if (this.LIZLLL != null) {
                                if (canonicalPath.startsWith(this.LIZLLL)) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return false;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                return false;
            }
        });
    }
}
