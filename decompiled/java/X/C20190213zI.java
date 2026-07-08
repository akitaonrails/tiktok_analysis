package X;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.13zI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20190213zI extends C1BVX {
    public ValueCallback<Uri[]> LL;
    public String LLILLJJLI;
    public final /* synthetic */ C1546730qLv LLILLL;
    public final /* synthetic */ C1546710qLt LLILZ;

    @Override // X.AbstractC1541670qDl
    public final AbstractC1541650qDj<?> getExtension() {
        return this.LLILLL;
    }

    public static File LIZJ(Context context) throws Throwable {
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

    public static final Intent LJ(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    public final Intent LIZLLL(Context context) {
        Uri uriFromFile;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            File fileY2 = C786410Ut5.y2(c2213981Bky.getApplicationContext(), Environment.DIRECTORY_DCIM);
            if (fileY2 == null) {
                fileY2 = new C0VSJ(LIZJ(c2213981Bky.getApplicationContext()), Environment.DIRECTORY_DCIM);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fileY2.getAbsolutePath());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("browser-photos");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            c0vsj.mkdirs();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsj.getAbsolutePath());
            sbLIZ2.append(str);
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append(".jpg");
            this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ2);
            C0VSJ c0vsj2 = new C0VSJ(this.LLILLJJLI);
            if (context != null && Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(context.getPackageName());
                sbLIZ3.append(".fileprovider");
                uriFromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ3), c0vsj2);
            } else {
                uriFromFile = Uri.fromFile(c0vsj2);
            }
            C189200o6.m2constructorimpl(intent.putExtra("output", uriFromFile));
            return intent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return intent;
        }
    }

    public final Intent LJFF(Context context) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent intentLJ = LJ(LIZLLL(context), new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND"));
        intentLJ.putExtra("android.intent.extra.INTENT", intent);
        return intentLJ;
    }

    public C20190213zI(C1546730qLv c1546730qLv, C1546710qLt c1546710qLt) {
        this.LLILLL = c1546730qLv;
        this.LLILZ = c1546710qLt;
    }

    public static void LIZ(SparkPopup sparkPopup, Intent intent) throws Throwable {
        Intent intent2;
        Fragment fragment;
        C1701330uNH.LIZ(intent, sparkPopup);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vN1X62VsZZnLTU0lSqj0Nn7RqjqAf/26xHp0hOXgHPtplTsitZ3KhVwctc=", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 666;
        Object[] objArr = {intent, 666};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/hybrid/spark/page/SparkPopup", "startActivityForResult", sparkPopup, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/hybrid/spark/page/SparkPopup", "startActivityForResult", null, objArr, sparkPopup, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = sparkPopup;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            fragment = sparkPopup;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/bytedance/hybrid/spark/page/SparkPopup", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public static void LIZIZ(Activity activity, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(666, activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vN1X62VsZZnLTU0lSqj0Nn7RqjqAf/26xHp0hOXgHPtplTsitZ3KhVwctc=", null));
    }

    public static void LJI(WebView webView, Intent intent) throws Throwable {
        String str;
        Context context;
        Activity activityLIZ;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        WebKitView webKitView2;
        C1537480q70 hybridContext2;
        SparkHostApiImpl sparkHostApiImplLLIL;
        int i;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (sparkHostApiImplLLIL = iSparkHostApi.LLIL()) != null) {
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 != null && iSparkHostApi2.LLIL() != null) {
                i = 1207965185;
            } else {
                i = 0;
            }
            sparkHostApiImplLLIL.LLJLILLLLZIIL(intent, i);
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        boolean z = webView instanceof WebKitView;
        String str2 = null;
        if (z && (webKitView2 = (WebKitView) webView) != null && (hybridContext2 = webKitView2.getHybridContext()) != null) {
            str = hybridContext2.containerId;
        } else {
            str = null;
        }
        c1529880puk.getClass();
        if (C1529880puk.LIZ(str) instanceof SparkPopup) {
            if (z && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null) {
                str2 = hybridContext.containerId;
            }
            LIZ((SparkPopup) C1529880puk.LIZ(str2), intent);
            return;
        }
        if (webView == null || (context = webView.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        LIZIZ(activityLIZ, intent);
    }

    @Override // X.C1BVX
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) throws Throwable {
        String[] strArr;
        String str;
        Activity activityLIZ;
        SparkHostApiImpl sparkHostApiImplLLIL;
        String str2;
        SparkHostApiImpl sparkHostApiImplLLIL2;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        WebKitView webKitView2;
        C1537480q70 hybridContext2;
        Intent intent;
        String str3;
        Activity activityLIZ2;
        SparkHostApiImpl sparkHostApiImplLLIL3;
        String str4;
        SparkHostApiImpl sparkHostApiImplLLIL4;
        WebKitView webKitView3;
        C1537480q70 hybridContext3;
        WebKitView webKitView4;
        C1537480q70 hybridContext4;
        Intent intent2;
        Intent intentLJ;
        String[] acceptTypes;
        final WebKitView webKitView5;
        if (super.onShowFileChooser(webView, valueCallback, fileChooserParams)) {
            return true;
        }
        int i = 0;
        if (webView == null) {
            return false;
        }
        if ((webView instanceof WebKitView) && (webKitView5 = (WebKitView) webView) != null) {
            final C1537480q70 hybridContext5 = webKitView5.getHybridContext();
            InterfaceC20190413zK interfaceC20190413zK = (InterfaceC20190413zK) hybridContext5.LJFF(InterfaceC20190413zK.class);
            if (interfaceC20190413zK != null) {
                interfaceC20190413zK.LIZIZ(666, new InterfaceC1387820mDc() { // from class: X.13zJ
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0057 A[EXC_TOP_SPLITTER, PHI: r4
                      0x0057: PHI (r4v1 android.net.Uri) = (r4v0 android.net.Uri), (r4v2 android.net.Uri) binds: [B:22:0x0055, B:10:0x0014] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:46:0x00a6). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:46:0x00a6). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0097 -> B:46:0x00a6). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0099 -> B:46:0x00a6). Please report as a decompilation issue!!! */
                    @Override // X.InterfaceC1387820mDc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onActivityResult(int r14, int r15, android.content.Intent r16) {
                        /*
                            r13 = this;
                            r2 = 666(0x29a, float:9.33E-43)
                            if (r14 != r2) goto Lb9
                            X.13zI r0 = r13.LIZ
                            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.LL
                            r12 = 0
                            if (r0 == 0) goto La6
                            r1 = -1
                            if (r16 == 0) goto L16
                            if (r15 != r1) goto L16
                            android.net.Uri r4 = r16.getData()
                            if (r4 != 0) goto L57
                        L16:
                            if (r16 == 0) goto L1e
                            android.net.Uri r0 = r16.getData()
                            if (r0 != 0) goto L9d
                        L1e:
                            if (r15 != r1) goto L9d
                            X.0VSJ r6 = new X.0VSJ
                            X.13zI r0 = r13.LIZ
                            java.lang.String r0 = r0.LLILLJJLI
                            r6.<init>(r0)
                            boolean r0 = r6.exists()
                            if (r0 == 0) goto L9d
                            android.net.Uri r4 = android.net.Uri.fromFile(r6)
                            X.13zI r0 = r13.LIZ
                            java.lang.String r5 = r0.LLILLJJLI
                            if (r5 == 0) goto L55
                            java.lang.Class<com.ss.android.ugc.aweme.spark.ISparkHostApi> r7 = com.ss.android.ugc.aweme.spark.ISparkHostApi.class
                            r8 = 0
                            r11 = 14
                            r9 = r8
                            r10 = r8
                            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
                            com.ss.android.ugc.aweme.spark.ISparkHostApi r3 = (com.ss.android.ugc.aweme.spark.ISparkHostApi) r3
                            if (r3 == 0) goto L55
                            X.1Bky r0 = X.C2213981Bky.LIZIZ
                            android.content.Context r1 = r0.getApplicationContext()
                            java.lang.String r0 = r6.getName()
                            r3.LJJLJ(r1, r5, r0)
                        L55:
                            if (r4 == 0) goto L9d
                        L57:
                            com.bytedance.lynx.hybrid.webkit.WebKitView r0 = r2     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            android.content.Context r0 = r0.getContext()     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            android.content.Context r0 = X.C786410Ut5.N3(r0)     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            boolean r0 = X.C2114508Qd.LJIIIIZZ(r0, r4)     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            if (r0 == 0) goto L77
                            X.13zI r0 = r13.LIZ     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            android.webkit.ValueCallback<android.net.Uri[]> r3 = r0.LL     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            if (r3 == 0) goto La6
                            r0 = 1
                            android.net.Uri[] r1 = new android.net.Uri[r0]     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            r0 = 0
                            r1[r0] = r4     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            r3.onReceiveValue(r1)     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            goto La6
                        L77:
                            X.13zI r0 = r13.LIZ     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.LL     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            if (r0 == 0) goto La6
                            r0.onReceiveValue(r12)     // Catch: java.io.IOException -> L81 java.lang.NullPointerException -> L8f
                            goto La6
                        L81:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            X.13zI r0 = r13.LIZ
                            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.LL
                            if (r0 == 0) goto La6
                            r0.onReceiveValue(r12)
                            goto La6
                        L8f:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            X.13zI r0 = r13.LIZ
                            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.LL
                            if (r0 == 0) goto La6
                            r0.onReceiveValue(r12)
                            goto La6
                        L9d:
                            X.13zI r0 = r13.LIZ
                            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.LL
                            if (r0 == 0) goto La6
                            r0.onReceiveValue(r12)
                        La6:
                            X.13zI r0 = r13.LIZ
                            r0.LL = r12
                            X.0q70 r1 = r3
                            java.lang.Class<X.13zK> r0 = X.InterfaceC20190413zK.class
                            java.lang.Object r0 = r1.LJFF(r0)
                            X.13zK r0 = (X.InterfaceC20190413zK) r0
                            if (r0 == 0) goto Lb9
                            r0.remove(r2)
                        Lb9:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20190313zJ.onActivityResult(int, int, android.content.Intent):void");
                    }
                });
            }
        }
        if (this.LL != null) {
            return true;
        }
        this.LL = valueCallback;
        if (fileChooserParams != null && (acceptTypes = fileChooserParams.getAcceptTypes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : acceptTypes) {
                if (str5 != null && str5.length() != 0) {
                    arrayList.add(str5);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = null;
        }
        if (strArr != null && strArr.length != 0) {
            if (strArr.length == 1) {
                String str6 = (String) C13LQ.LJIL(strArr);
                try {
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -661257167) {
                        if (iHashCode != 452781974) {
                            if (iHashCode == 1911932022 && str6.equals("image/*")) {
                                if (this.LLILZ.LLIZ) {
                                    intentLJ = LIZLLL(webView.getContext());
                                } else {
                                    intentLJ = LJ(LIZLLL(webView.getContext()));
                                }
                                Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                                intent3.addCategory("android.intent.category.OPENABLE");
                                intent3.setType("image/*");
                                intentLJ.putExtra("android.intent.extra.INTENT", intent3);
                                LJI(webView, intentLJ);
                                return true;
                            }
                        } else if (str6.equals("video/*")) {
                            if (!this.LLILZ.LLIZ) {
                                intent2 = LJ(new Intent("android.media.action.VIDEO_CAPTURE"));
                            } else {
                                intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                            }
                            Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
                            intent4.addCategory("android.intent.category.OPENABLE");
                            intent4.setType("video/*");
                            intent2.putExtra("android.intent.extra.INTENT", intent4);
                            LJI(webView, intent2);
                            return true;
                        }
                    } else if (str6.equals("audio/*")) {
                        if (!this.LLILZ.LLIZ) {
                            intent = LJ(new Intent("android.provider.MediaStore.RECORD_SOUND"));
                        } else {
                            intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
                        }
                        Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                        intent5.addCategory("android.intent.category.OPENABLE");
                        intent5.setType("audio/*");
                        intent.putExtra("android.intent.extra.INTENT", intent5);
                        LJI(webView, intent);
                        return true;
                    }
                    Intent intent6 = new Intent("android.intent.action.GET_CONTENT");
                    intent6.addCategory("android.intent.category.OPENABLE");
                    intent6.setType("*/*");
                    C1529880puk c1529880puk = SparkContext.Companion;
                    if ((webView instanceof WebKitView) && (webKitView4 = (WebKitView) webView) != null && (hybridContext4 = webKitView4.getHybridContext()) != null) {
                        str3 = hybridContext4.containerId;
                    } else {
                        str3 = null;
                    }
                    c1529880puk.getClass();
                    if (C1529880puk.LIZ(str3) instanceof SparkPopup) {
                        if ((webView instanceof WebKitView) && (webKitView3 = (WebKitView) webView) != null && (hybridContext3 = webKitView3.getHybridContext()) != null) {
                            str4 = hybridContext3.containerId;
                        } else {
                            str4 = null;
                        }
                        SparkPopup sparkPopup = (SparkPopup) C1529880puk.LIZ(str4);
                        Intent intentCreateChooser = Intent.createChooser(intent6, "File Chooser");
                        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi != null && (sparkHostApiImplLLIL4 = iSparkHostApi.LLIL()) != null) {
                            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi2 != null && iSparkHostApi2.LLIL() != null) {
                                i = 1207965185;
                            }
                            sparkHostApiImplLLIL4.LLJLILLLLZIIL(intentCreateChooser, i);
                        }
                        LIZ(sparkPopup, intentCreateChooser);
                        return true;
                    }
                    Context context = webView.getContext();
                    if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null) {
                        Intent intentCreateChooser2 = Intent.createChooser(intent6, "File Chooser");
                        ISparkHostApi iSparkHostApi3 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi3 != null && (sparkHostApiImplLLIL3 = iSparkHostApi3.LLIL()) != null) {
                            ISparkHostApi iSparkHostApi4 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi4 != null && iSparkHostApi4.LLIL() != null) {
                                i = 1207965185;
                            }
                            sparkHostApiImplLLIL3.LLJLILLLLZIIL(intentCreateChooser2, i);
                        }
                        LIZIZ(activityLIZ2, intentCreateChooser2);
                        return true;
                    }
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        LJI(webView, LJFF(webView.getContext()));
                        return true;
                    } catch (ActivityNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return true;
                    }
                }
            } else {
                try {
                    Intent intent7 = new Intent("android.intent.action.GET_CONTENT");
                    intent7.addCategory("android.intent.category.OPENABLE");
                    intent7.setType("*/*");
                    intent7.putExtra("android.intent.extra.MIME_TYPES", strArr);
                    C1529880puk c1529880puk2 = SparkContext.Companion;
                    if ((webView instanceof WebKitView) && (webKitView2 = (WebKitView) webView) != null && (hybridContext2 = webKitView2.getHybridContext()) != null) {
                        str = hybridContext2.containerId;
                    } else {
                        str = null;
                    }
                    c1529880puk2.getClass();
                    if (C1529880puk.LIZ(str) instanceof SparkPopup) {
                        if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null) {
                            str2 = hybridContext.containerId;
                        } else {
                            str2 = null;
                        }
                        SparkPopup sparkPopup2 = (SparkPopup) C1529880puk.LIZ(str2);
                        Intent intentCreateChooser3 = Intent.createChooser(intent7, "File Chooser");
                        ISparkHostApi iSparkHostApi5 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi5 != null && (sparkHostApiImplLLIL2 = iSparkHostApi5.LLIL()) != null) {
                            ISparkHostApi iSparkHostApi6 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi6 != null && iSparkHostApi6.LLIL() != null) {
                                i = 1207965185;
                            }
                            sparkHostApiImplLLIL2.LLJLILLLLZIIL(intentCreateChooser3, i);
                        }
                        LIZ(sparkPopup2, intentCreateChooser3);
                        return true;
                    }
                    Context context2 = webView.getContext();
                    if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                        Intent intentCreateChooser4 = Intent.createChooser(intent7, "File Chooser");
                        ISparkHostApi iSparkHostApi7 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi7 != null && (sparkHostApiImplLLIL = iSparkHostApi7.LLIL()) != null) {
                            ISparkHostApi iSparkHostApi8 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi8 != null && iSparkHostApi8.LLIL() != null) {
                                i = 1207965185;
                            }
                            sparkHostApiImplLLIL.LLJLILLLLZIIL(intentCreateChooser4, i);
                        }
                        LIZIZ(activityLIZ, intentCreateChooser4);
                        return true;
                    }
                } catch (ActivityNotFoundException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    try {
                        LJI(webView, LJFF(webView.getContext()));
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            }
        }
        return true;
    }
}
