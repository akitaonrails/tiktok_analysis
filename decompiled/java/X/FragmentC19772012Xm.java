package X;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12Xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class FragmentC19772012Xm extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICHELIOSw4LTdiPDs6JDZiCDwqJiYYKDw4DjctLiI2JjE=";
    public Intent LL;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit> LLILLJJLI;

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Intent intent;
        Fragment fragment;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intent = this.LL) != null) {
            int iIntValue = arguments.getInt("extra_request_code");
            C1701330uNH.LIZ(intent, this);
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8pfyinSYpCoLTRgjYAE0Mkg+IJQApCo=", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent, Integer.valueOf(iIntValue)};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "com/ss/android/ugc/aweme/sticker/utils/AsyncTaskFragment", "startActivityForResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11085, "com/ss/android/ugc/aweme/sticker/utils/AsyncTaskFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent = (Intent) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                }
            } else {
                fragment = this;
            }
            fragment.startActivityForResult(intent, iIntValue);
            c0wst.LIZ(11085, "com/ss/android/ugc/aweme/sticker/utils/AsyncTaskFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
