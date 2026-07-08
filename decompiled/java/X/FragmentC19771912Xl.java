package X;

import android.app.Fragment;
import android.os.Bundle;

/* JADX INFO: renamed from: X.12Xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class FragmentC19771912Xl extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUpHELIOSOyI6OzYlJiF9GCA+JCYgOywjJwkhKSIhLCEn";
    public InterfaceC19772112Xn LL;

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Fragment fragment;
        super.onCreate(bundle);
        String[] stringArray = getArguments().getStringArray("permissions");
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqtcZLHzyGrEY6Hk+1ppfa3R+KPP5X1mCSmGfzp", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 1;
        Object[] objArr = {stringArray, 1};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102601, "com/ss/android/ugc/aweme/permission/PermissionFragment", "requestPermissions", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102601, "com/ss/android/ugc/aweme/permission/PermissionFragment", "requestPermissions", null, objArr, this, c0wzw, false);
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
                stringArray = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = this;
        }
        fragment.requestPermissions(stringArray, iIntValue);
        c0wst.LIZ(102601, "com/ss/android/ugc/aweme/permission/PermissionFragment", "requestPermissions", null, objArr, fragment, c0wzw, true);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11052, "com/ss/android/ugc/aweme/permission/PermissionFragment", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqtcZLHzyGrEY6Hk+1ppfa3R+KPP5X1mCSmGfzp", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
        InterfaceC19772112Xn interfaceC19772112Xn = this.LL;
        if (interfaceC19772112Xn != null) {
            interfaceC19772112Xn.LIZ(iArr2, strArr2);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
