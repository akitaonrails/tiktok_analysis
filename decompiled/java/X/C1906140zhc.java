package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906140zhc {
    public static final C1906140zhc LIZ = new C1906140zhc();

    static {
        C341940Daq.LIZ(10.0d);
    }

    public static String LIZJ(User user) {
        if (user != null) {
            C1243240iSQ.LIZ.getClass();
            return C1243240iSQ.LIZ(user, true);
        }
        return "";
    }

    public static void LIZLLL(Context context, int i) {
        Intent intent;
        if (C1388190mED.LIZ(context) != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            String stringExtra = null;
            if (activityLIZ != null && (intent = activityLIZ.getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
                try {
                    stringExtra = intent.getStringExtra("rule_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    c2344009Gk.LJIIIIZZ("account_type", "fans");
                    c2344009Gk.LJIIIIZZ("client_order", String.valueOf(i));
                    c2344009Gk.LJIIIIZZ("rule_id", stringExtra);
                    c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
                    C20684815ws.LJIILLIIL("enter_personal_detail_backup_from_push", c2344009Gk.LIZ);
                }
            }
        }
    }

    public static void LIZ(View view, EnumC1906160zhe enumC1906160zhe, final float f) {
        if (view == null) {
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        int i = C1906150zhd.LIZ[enumC1906160zhe.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C427690Gpr.LJI(view, null);
                    return;
                }
                throw new C1954807lC();
            }
            if (f <= 0.0f) {
                f = C418440Gaw.LIZIZ(28);
            }
            C427690Gpr.LJFF(view, f);
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ZC1
            /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Drawable colorDrawable;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view2.setBackground(c259800zU.element);
                    return false;
                }
                c259800zU.element = view2.getBackground();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view2.getContext());
                if (numLIZJ == null) {
                    return false;
                }
                float f2 = f;
                int iIntValue = numLIZJ.intValue();
                C1906140zhc c1906140zhc = C1906140zhc.LIZ;
                Context context = view2.getContext();
                c1906140zhc.getClass();
                if (f2 > 0.0f) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c384050F3z.LIZJ = Float.valueOf(f2);
                    colorDrawable = c384050F3z.LIZ(context);
                } else {
                    colorDrawable = new ColorDrawable(iIntValue);
                }
                view2.setBackground(colorDrawable);
                return false;
            }
        });
    }
}
