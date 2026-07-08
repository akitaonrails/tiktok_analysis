package X;

import Y.ARunnableS13S0000100_13;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.homepage.business.HomeToastTask;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;

/* JADX INFO: renamed from: X.0WcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826910WcD implements InterfaceC1590050rTn {
    public static final C826910WcD LIZ = new C826910WcD();

    @Override // X.InterfaceC1590050rTn
    public final void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        if (((Boolean) C2279461EKa.LIZIZ.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS13S0000100_13(jCurrentTimeMillis, 4));
        } else {
            LIZLLL(jCurrentTimeMillis);
        }
    }

    public static void LIZLLL(long j) {
        boolean z;
        int iLIZ = C826810Wc3.LIZ();
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        int iLIZIZ = (int) C844470XAv.LIZIZ();
        if (iLIZ != iLIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (C1400380mXs.LIZ().LIZ) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(new MobLaunchEventTask(z, j));
            c0cph.LIZIZ();
        }
        if (iLIZ == 0) {
            c844470XAv.getClass();
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "app_setting").edit();
            editorEdit.putInt("last_version_code", iLIZIZ);
            C1499900p8O.LIZ(editorEdit);
        }
        C1400380mXs.LIZ().LIZ = false;
        C799900VZk.LIZ.getClass();
        C0CPH c0cph2 = new C0CPH();
        c0cph2.LIZ(new AntispamApiUploadTask());
        c0cph2.LIZIZ();
    }

    @Override // X.InterfaceC1590050rTn
    public final void LIZIZ(C19EG c19eg) {
        if (!C1593730rZj.LIZIZ.LJJIFFI()) {
            return;
        }
        new HomeToastTask().run(c19eg);
    }

    @Override // X.InterfaceC1590050rTn
    public final void LIZJ(C19EG c19eg, Bundle bundle) {
        Bundle bundle2;
        try {
            if (Build.VERSION.SDK_INT == 28 && bundle != null && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                bundle2.setClassLoader(c19eg.getClassLoader());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
