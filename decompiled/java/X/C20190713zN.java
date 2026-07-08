package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13zN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20190713zN {
    public static String LIZ;

    public static void LIZ(final int i, final Activity activity, final Fragment fragment) {
        String[] strArr;
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 == 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C0UT9 c0ut9 = new C0UT9(activity, TokenCert.with("bpea-webcast-hybrid-common-gallery"));
        C142V c142v = new C142V() { // from class: X.09gb
            @Override // X.C142V
            public final void LIZ(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LIZIZ(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LIZLLL(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJ(String str, String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJFF(String... strArr2) {
            }

            @Override // X.C142V
            public final void LIZJ(String... strArr2) throws Throwable {
                if (!"mounted".equals(C786410Ut5.X3())) {
                    C12ES.LJI(2131851934, activity);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965186);
                try {
                    Fragment fragment2 = fragment;
                    if (fragment2 != null) {
                        int i3 = i;
                        C1701330uNH.LIZ(intent, fragment2);
                        C2204961BRm.LLJL(fragment2, intent, i3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSrUewzh/lk", null));
                    } else {
                        Activity activity2 = activity;
                        int i4 = i;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                        C1701330uNH.LIZ(intent, activity2);
                        C2204961BRm.LJIIZILJ(i4, activity2, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSrUewzh/lk", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C12ES.LJI(2131851933, activity);
                }
            }
        };
        if (i2 >= 34) {
            z = true;
        } else {
            z = false;
        }
        c0ut9.LIZ(c142v, z, strArr);
    }
}
