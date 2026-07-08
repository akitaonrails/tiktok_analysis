package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Ti7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754130Ti7 implements C168Q<ActivityResult> {
    public final /* synthetic */ I18nSignUpActivity LIZ;

    public C754130Ti7(I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = i18nSignUpActivity;
    }

    @Override // X.C168Q
    public final void LIZ(ActivityResult activityResult) {
        ActivityResult activityResult2 = activityResult;
        int i = activityResult2.resultCode;
        Intent intent = activityResult2.data;
        if (intent != null) {
            I18nSignUpActivity i18nSignUpActivity = this.LIZ;
            if (intent.getIntExtra("error_code", -1) == 1097) {
                C1397580mTM c1397580mTM = new C1397580mTM(i18nSignUpActivity);
                c1397580mTM.LJFF(2131825241);
                c1397580mTM.LIZ(2131825240);
                C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(i18nSignUpActivity, 591));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    I18nSignUpActivity i18nSignUpActivity2 = this.LIZ;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(i18nSignUpActivity2), C0PEM.LIZJ, null, new C754120Ti6(i18nSignUpActivity2, extras, i, null), 2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
