package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* JADX INFO: renamed from: X.0XTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC849400XTu implements Runnable {
    public final /* synthetic */ I18nLoginActivityComponent LL;

    public final void LIZ() {
        Fragment fragment;
        I18nLoginActivityComponent i18nLoginActivityComponent = this.LL;
        if (i18nLoginActivityComponent.LLILLJJLI == null && ((fragment = i18nLoginActivityComponent.LLILLL) == null || fragment.getActivity() == null)) {
            return;
        }
        I18nLoginActivityComponent i18nLoginActivityComponent2 = this.LL;
        Activity activity = i18nLoginActivityComponent2.LLILLJJLI;
        if (activity == null) {
            activity = i18nLoginActivityComponent2.LLILLL.getActivity();
        }
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = activity;
        I18nLoginActivityComponent i18nLoginActivityComponent3 = this.LL;
        c0xqs.LIZIZ = i18nLoginActivityComponent3.LLILZLL;
        c0xqs.LIZJ = i18nLoginActivityComponent3.LLIZ;
        c0xqs.LIZLLL = i18nLoginActivityComponent3.LLILZIL;
        final InterfaceC849390XTt interfaceC849390XTt = i18nLoginActivityComponent3.LLILZ;
        c0xqs.LJ = new C849360XTq(interfaceC849390XTt) { // from class: X.0XTr
            @Override // X.C849360XTq, X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                super.onResult(i, i2, obj);
                if (i == 12 && i2 == 1) {
                    C1440005kM.LIZ(new C849380XTs());
                }
            }
        };
        final Activity activity2 = i18nLoginActivityComponent3.LLILLJJLI;
        c0xqs.LJFF = new C19249010Si(activity2) { // from class: X.0XTv
        };
        iLoginServiceLIZJ.showLoginAndRegisterView(c0xqs.LIZ());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("I18nLoginActivityComponent@748e.<field>$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("I18nLoginActivityComponent@748e.<field>$1");
    }

    public RunnableC849400XTu(I18nLoginActivityComponent i18nLoginActivityComponent) {
        this.LL = i18nLoginActivityComponent;
    }
}
