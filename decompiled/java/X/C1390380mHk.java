package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* JADX INFO: renamed from: X.0mHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390380mHk {
    public static final void LJFF(C1389890mGx c1389890mGx, CreativeToastBuilder creativeToastBuilder) {
        Long l = creativeToastBuilder.getConfig().duration;
        if (l != null) {
            c1389890mGx.LIZLLL(l.longValue());
        }
        String str = creativeToastBuilder.getConfig().message;
        if (str != null) {
            c1389890mGx.LJIIJ(str);
        }
        Integer num = creativeToastBuilder.getConfig().messageRes;
        if (num != null) {
            c1389890mGx.LJIIIZ(num.intValue());
        }
        Integer num2 = creativeToastBuilder.getConfig().icon;
        if (num2 != null) {
            c1389890mGx.LJFF(num2.intValue());
        }
        Integer num3 = creativeToastBuilder.getConfig().iconColor;
        if (num3 != null) {
            c1389890mGx.LJI(num3.intValue());
        }
        Integer num4 = creativeToastBuilder.getConfig().iconColorRes;
        if (num4 != null) {
            c1389890mGx.LJII(num4.intValue());
        }
        Boolean bool = creativeToastBuilder.getConfig().acrossActivities;
        if (bool != null) {
            c1389890mGx.LIZ(bool.booleanValue());
        }
    }

    public static final void LJI(C1233040iBy c1233040iBy, CreativeToastBuilder creativeToastBuilder) {
        Long l = creativeToastBuilder.getConfig().duration;
        if (l != null) {
            c1233040iBy.LIZ(l.longValue());
        }
        String str = creativeToastBuilder.getConfig().message;
        if (str != null) {
            c1233040iBy.LIZJ(str);
        }
        Integer num = creativeToastBuilder.getConfig().messageRes;
        if (num != null) {
            c1233040iBy.LIZIZ(num.intValue());
        }
        Integer num2 = creativeToastBuilder.getConfig().icon;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            C1389890mGx c1389890mGx = c1233040iBy.LIZIZ;
            if (c1389890mGx != null) {
                c1389890mGx.LJFF(iIntValue);
            }
        }
        Integer num3 = creativeToastBuilder.getConfig().iconColor;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            C1389890mGx c1389890mGx2 = c1233040iBy.LIZIZ;
            if (c1389890mGx2 != null) {
                c1389890mGx2.LJI(iIntValue2);
            }
        }
        Integer num4 = creativeToastBuilder.getConfig().iconColorRes;
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            C1389890mGx c1389890mGx3 = c1233040iBy.LIZIZ;
            if (c1389890mGx3 != null) {
                c1389890mGx3.LJII(iIntValue3);
            }
        }
    }

    public static final void LIZ(Activity activity, int i, CreativeToastBuilder creativeToastBuilder) {
        if (creativeToastBuilder.getConfig().message == null && creativeToastBuilder.getConfig().messageRes == null) {
            if (activity == null) {
                return;
            }
        } else if (activity == null) {
            return;
        }
        if (creativeToastBuilder.getOriginUsingToast().isTuxToast()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            LJFF(c1389890mGx, creativeToastBuilder);
            c1389890mGx.LJIIJJI();
        } else {
            if (creativeToastBuilder.getOriginUsingToast().isTuxToastLegacy()) {
                C1233040iBy c1233040iBy = new C1233040iBy(activity);
                LJI(c1233040iBy, creativeToastBuilder);
                c1233040iBy.LIZLLL();
                return;
            }
            ((C1390360mHi) C1390390mHl.LIZ.createToast(activity, i, creativeToastBuilder)).show();
        }
    }

    public static final void LIZIZ(Dialog dialog, int i, CreativeToastBuilder creativeToastBuilder) {
        if (creativeToastBuilder.getConfig().message == null && creativeToastBuilder.getConfig().messageRes == null) {
            if (dialog == null) {
                return;
            }
        } else if (dialog == null) {
            return;
        }
        if (creativeToastBuilder.getOriginUsingToast().isTuxToast()) {
            C1389890mGx c1389890mGx = new C1389890mGx(dialog);
            LJFF(c1389890mGx, creativeToastBuilder);
            c1389890mGx.LJIIJJI();
        } else {
            if (creativeToastBuilder.getOriginUsingToast().isTuxToastLegacy()) {
                C1233040iBy c1233040iBy = new C1233040iBy(dialog.getContext());
                LJI(c1233040iBy, creativeToastBuilder);
                c1233040iBy.LIZLLL();
                return;
            }
            ((C1390360mHi) C1390390mHl.LIZ.createToast(dialog, i, creativeToastBuilder)).show();
        }
    }

    public static final void LIZJ(Context context, int i, CreativeToastBuilder creativeToastBuilder) {
        if (creativeToastBuilder.getConfig().message == null && creativeToastBuilder.getConfig().messageRes == null) {
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            if (creativeToastBuilder.getOriginUsingToast().isTuxToast()) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                LJFF(c1389890mGx, creativeToastBuilder);
                c1389890mGx.LJIIJJI();
            } else {
                if (creativeToastBuilder.getOriginUsingToast().isTuxToastLegacy()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    LJI(c1233040iBy, creativeToastBuilder);
                    c1233040iBy.LIZLLL();
                    return;
                }
                ((C1390360mHi) C1390390mHl.LIZ.createToast(activityLIZ, i, creativeToastBuilder)).show();
            }
        }
    }

    public static final void LIZLLL(View view, int i, CreativeToastBuilder creativeToastBuilder) {
        if (creativeToastBuilder.getConfig().message == null && creativeToastBuilder.getConfig().messageRes == null) {
            if (view == null) {
                return;
            }
        } else if (view == null) {
            return;
        }
        if (creativeToastBuilder.getOriginUsingToast().isTuxToast()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            LJFF(c1389890mGx, creativeToastBuilder);
            c1389890mGx.LJIIJJI();
        } else {
            if (creativeToastBuilder.getOriginUsingToast().isTuxToastLegacy()) {
                C1233040iBy c1233040iBy = new C1233040iBy(view.getContext());
                LJI(c1233040iBy, creativeToastBuilder);
                c1233040iBy.LIZLLL();
                return;
            }
            ((C1390360mHi) C1390390mHl.LIZ.createToast(view, i, creativeToastBuilder)).show();
        }
    }

    public static final void LJ(Fragment fragment, int i, CreativeToastBuilder creativeToastBuilder) {
        if (creativeToastBuilder.getConfig().message == null && creativeToastBuilder.getConfig().messageRes == null) {
            if (fragment == null) {
                return;
            }
        } else if (fragment == null) {
            return;
        }
        if (creativeToastBuilder.getOriginUsingToast().isTuxToast()) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            LJFF(c1389890mGx, creativeToastBuilder);
            c1389890mGx.LJIIJJI();
        } else {
            if (creativeToastBuilder.getOriginUsingToast().isTuxToastLegacy()) {
                C1233040iBy c1233040iBy = new C1233040iBy(fragment.getContext());
                LJI(c1233040iBy, creativeToastBuilder);
                c1233040iBy.LIZLLL();
                return;
            }
            ((C1390360mHi) C1390390mHl.LIZ.createToast(fragment, i, creativeToastBuilder)).show();
        }
    }
}
