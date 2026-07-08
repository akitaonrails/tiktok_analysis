package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.ILoginUtilsService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0XQC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQC implements InterfaceC849390XTt {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Intent LIZJ;
    public final /* synthetic */ Intent LIZLLL;
    public final /* synthetic */ Intent LJ;
    public final /* synthetic */ ArrayList LJFF;
    public final /* synthetic */ RecordConfig LJI;
    public final /* synthetic */ PushLoginActivity LJII;

    @Override // X.InterfaceC849390XTt
    public final void LIZ() throws Throwable {
        if (this.LIZ != null && !TextUtils.isEmpty(this.LIZIZ)) {
            if (TextUtils.equals(this.LIZIZ, C0XQ7.LJFF().getCurUserId())) {
                this.LIZ.putBoolean("login_jump", true);
                C786410Ut5.LJJIJL(this.LIZ, "push_intent", this.LIZJ);
                ((ILoginUtilsService) ServiceManager.get().getService(ILoginUtilsService.class)).LIZ(this.LIZ);
            } else {
                LIZJ(this.LJII, this.LIZLLL);
            }
            this.LJII.finish();
            return;
        }
        if (TextUtils.isEmpty(this.LIZIZ) || this.LIZIZ.equals(C0XQ7.LJFF().getCurUserId())) {
            Intent intent = this.LJ;
            if (intent != null) {
                LIZJ(this.LJII, intent);
            } else {
                ArrayList arrayList = this.LJFF;
                if (arrayList != null && arrayList.size() > 1) {
                    Activity activity = this.LJII;
                    ArrayList arrayList2 = this.LJFF;
                    Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[arrayList2.size()]);
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9H+ySHIaYnbNB5rqVJluIHlow==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {intentArr};
                    C0WZW c0wzw = new C0WZW(false, "([Landroid/content/Intent;)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11093, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivities", activity, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11093, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivities", null, objArr, activity, c0wzw, false);
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null) {
                            Object obj = objArr2[0];
                            if (obj != null) {
                                activity = (Activity) obj;
                            }
                            Object obj2 = objArr2[1];
                            if (obj2 != null) {
                                intentArr = (Intent[]) obj2;
                            }
                        }
                        activity.startActivities(intentArr);
                        c0wst.LIZ(11093, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivities", null, objArr, activity, c0wzw, true);
                    }
                }
            }
        }
        if (this.LJI != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("PushLogin", new C1401810maB(this, 0));
        }
        this.LJII.finish();
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        this.LJII.finish();
    }

    public static void LIZJ(PushLoginActivity pushLoginActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = pushLoginActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9H+ySHIaYnbNB5rqVJluIHlow==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/app/PushLoginActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public C0XQC(PushLoginActivity pushLoginActivity, Bundle bundle, String str, Intent intent, Intent intent2, Intent intent3, ArrayList arrayList, RecordConfig recordConfig) {
        this.LJII = pushLoginActivity;
        this.LIZ = bundle;
        this.LIZIZ = str;
        this.LIZJ = intent;
        this.LIZLLL = intent2;
        this.LJ = intent3;
        this.LJFF = arrayList;
        this.LJI = recordConfig;
    }
}
