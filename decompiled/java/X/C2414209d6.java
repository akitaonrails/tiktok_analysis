package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.09d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2414209d6 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(298));

    public final void LIZ(final Context context, final View view, String str, final AwS393S0200000_27 awS393S0200000_27) throws Throwable {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(str).substring(8, 24));
        sbLIZ.append(".pdf");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
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
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Error: ");
                    sbLIZ3.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Application context obtained through ActivityThread: ");
                    sbLIZ4.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ4));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(th.getMessage());
                    sbLIZ5.append(":");
                    sbLIZ5.append(C08RN.LIZJ());
                    sbLIZ5.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ5));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ52 = C2188811AlT.LIZ();
                sbLIZ52.append(th.getMessage());
                sbLIZ52.append(":");
                sbLIZ52.append(C08RN.LIZJ());
                sbLIZ52.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ52));
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ2.append(file.getAbsolutePath());
        sbLIZ2.append("/jsbdownload");
        ((C2414409d8) this.LIZ.getValue()).LIZ(context, str, C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ, new InterfaceC2414709dB() { // from class: X.09d5
            @Override // X.InterfaceC2414709dB
            public final void LIZ() {
            }

            @Override // X.InterfaceC2414709dB
            public final void onFailed() {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C436201mq(awS393S0200000_27, view, null), 3);
            }

            @Override // X.InterfaceC2414709dB
            public final void onStart() {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C436401ms(awS393S0200000_27, view, null), 3);
            }

            @Override // X.InterfaceC2414709dB
            public final void onSuccess(String str2) {
                AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
                boolean z;
                String name;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C316901Kt(awS393S0200000_27, null), 3);
                C0VSJ c0vsj = new C0VSJ(str2);
                Context context2 = context;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(context.getPackageName());
                sbLIZ6.append(".fileprovider");
                Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context2, C2188811AlT.LIZIZ(sbLIZ6), c0vsj);
                String type = context.getContentResolver().getType(uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, type);
                intent.addFlags(1);
                Context context3 = context;
                Intent intentCreateChooser = Intent.createChooser(intent, "");
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(intentCreateChooser, 1207969292);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intentCreateChooser, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateChooser, context3);
                C2204961BRm.LJJJJJL(context3, intentCreateChooser, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck70pzucgc5/M8DBYlIPNINwPffoy8b0Mfu9z711gkKF2Htn0rB8=", null));
            }
        });
    }
}
