package X;

import Y.ACListenerS154S0100000_19;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import g1c.AjS66S0100000_19;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0idE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249940idE extends LinearLayout {
    public EnumC1249860id6 LL;
    public final C01GW LLILLJJLI;

    public final boolean LIZLLL() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    private final float getPressFeedbackRadius() {
        if (C255930A1f.LIZ() || C268330AfP.LJFF()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        }
        if (!C268330AfP.LJIIIZ()) {
            return C418440Gaw.LIZIZ(8);
        }
        try {
            return getContext().getResources().getDimension(R.dimen.b7);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return C418440Gaw.LIZIZ(8);
        }
    }

    public final TextView getTextView() {
        return (TextView) findViewById(R.id.fad);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1249940idE(android.content.Context r18) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1249940idE.<init>(android.content.Context):void");
    }

    public final void LIZ(EnumC1249860id6 enumC1249860id6) {
        this.LL = enumC1249860id6;
        if (enumC1249860id6 != null) {
            int i = C1249870id7.LIZ[enumC1249860id6.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C786410Ut5.LJZL(0, (LinearLayout) findViewById(R.id.faf));
                        C786410Ut5.LLIIL((RelativeLayout) findViewById(R.id.fac), 8);
                        return;
                    }
                    return;
                }
                C786410Ut5.LLIIL((RelativeLayout) findViewById(R.id.fac), 0);
                C786410Ut5.LJZL(8, (LinearLayout) findViewById(R.id.faf));
                return;
            }
            C786410Ut5.LJZL(0, (LinearLayout) findViewById(R.id.faf));
            C786410Ut5.LLIIL((RelativeLayout) findViewById(R.id.fac), 8);
        }
    }

    public final Drawable LIZIZ(int i) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        c384050F3z.LIZIZ = Integer.valueOf(i);
        return c384050F3z.LIZ(getContext());
    }

    public final void setComponentWidth(int i) {
        ((TextView) findViewById(R.id.fad)).setWidth(i);
        C426750GoL.LJIIIZ(findViewById(R.id.faf), 0, 0, 0, 0, false, 16);
    }

    public final void setIconDebounceOnClickListener(Function0<Unit> function0) {
        View viewFindViewById = findViewById(R.id.fa_);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS66S0100000_19(function0, 2), viewFindViewById);
        }
    }

    public final void LIZJ(EnumC1249860id6 enumC1249860id6, Integer num, Function0 function0) {
        if (num != null) {
            num.intValue();
            ((TuxIconView) findViewById(R.id.fa_)).setIconRes(num.intValue());
        }
        C786410Ut5.gb(this, new ACListenerS154S0100000_19(function0, 252));
        if (enumC1249860id6 == null) {
            enumC1249860id6 = EnumC1249860id6.ICON;
        }
        LIZ(enumC1249860id6);
    }
}
