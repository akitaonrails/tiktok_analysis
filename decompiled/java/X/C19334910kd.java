package X;

import android.content.Intent;
import com.bytedance.ies.xbridge.base.activity.GetPermissionActivity;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionsGrantCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionsGrantResult;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334910kd implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C19334910kd c19334910kd) {
    }

    public static final void onCanceled$1(C19334910kd c19334910kd) {
    }

    public static final void onCanceled$2(C19334910kd c19334910kd) {
    }

    public static final void onCanceled$3(C19334910kd c19334910kd) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
            case 2:
                LIZ$2(this, c0hwoArr);
                break;
            case 3:
                LIZ$3(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
            case 3:
                onCanceled$3(this);
                break;
        }
    }

    public C19334910kd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C19334910kd c19334910kd, C0HWO... c0hwoArr) throws Throwable {
        boolean z;
        if (c0hwoArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
            C2204961BRm.LLLJL((GetPermissionActivity) c19334910kd.l0, new Intent("GetPermissionActivity.permission_granted"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr9FfsTWOdOPNwKHA4BbOj9pGJ4A/Ivk1bR77uk86/k6bmzkA==", null));
        } else if (c0hwoArr.length != 0 && !C0VE9.LJIIJ((GetPermissionActivity) c19334910kd.l0, c0hwoArr[0].LIZ)) {
            C2204961BRm.LLLJL((GetPermissionActivity) c19334910kd.l0, new Intent("GetPermissionActivity.permission_rejected"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr9FfsTWOdOPNwKHA4BbOj9pGJ4A/Ivk1bR77uk86/k6bmzkA==", null));
        } else {
            C2204961BRm.LLLJL((GetPermissionActivity) c19334910kd.l0, new Intent("GetPermissionActivity.permission_denied"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr9FfsTWOdOPNwKHA4BbOj9pGJ4A/Ivk1bR77uk86/k6bmzkA==", null));
        }
        ((GetPermissionActivity) c19334910kd.l0).finish();
    }

    public static final void LIZ$1(C19334910kd c19334910kd, C0HWO... c0hwoArr) throws Throwable {
        for (C0HWO c0hwo : c0hwoArr) {
            if (c0hwo.LIZIZ != EnumC442280HVy.GRANTED) {
                QRCodePermissionActivity qRCodePermissionActivity = (QRCodePermissionActivity) c19334910kd.l0;
                qRCodePermissionActivity.getClass();
                C21566919al c21566919al = new C21566919al(qRCodePermissionActivity);
                c21566919al.LJFF(2131830635);
                c21566919al.LIZ(2131830636);
                c21566919al.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC19332910kJ(qRCodePermissionActivity, 1), false);
                c21566919al.LJIIJ(R.string.ftf, new DialogInterfaceOnClickListenerC19332910kJ(qRCodePermissionActivity, 0), false);
                c21566919al.LIZLLL = new DialogInterfaceOnDismissListenerC19333210kM(qRCodePermissionActivity, 9);
                new C21566519ah(c21566919al).LIZLLL();
                return;
            }
            ((QRCodePermissionActivity) c19334910kd.l0).LLLLLZL();
        }
    }

    public static final void LIZ$2(C19334910kd c19334910kd, C0HWO... c0hwoArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        OnPermissionsGrantCallback onPermissionsGrantCallback = (OnPermissionsGrantCallback) c19334910kd.l0;
        for (C0HWO c0hwo : c0hwoArr) {
            String str = c0hwo.LIZ;
            if (c0hwo.LIZ()) {
                i = 0;
            } else {
                i = -1;
            }
            arrayList.add(new OnPermissionsGrantResult(str, i));
        }
        onPermissionsGrantCallback.onResult((OnPermissionsGrantResult[]) arrayList.toArray(new OnPermissionsGrantResult[0]));
    }

    public static final void LIZ$3(C19334910kd c19334910kd, C0HWO... c0hwoArr) {
        Function0 function0;
        for (C0HWO c0hwo : c0hwoArr) {
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.SYSTEM_ALERT_WINDOW")) {
                if (c0hwo.LIZ() && (function0 = (Function0) c19334910kd.l0) != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
        }
    }
}
