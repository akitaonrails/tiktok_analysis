package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1237630iJN extends DialogC19728412Gs {
    public C1235870iGX LL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Activity ownerActivity;
        Object obj;
        if (isShowing() || (ownerActivity = getOwnerActivity()) == null || ownerActivity.isFinishing()) {
            return;
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhi8vBjokJR8ns1ry50ImszoW9UruCtTG4ifA=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C1235870iGX c1235870iGX = this.LL;
        if (c1235870iGX == null) {
            c1235870iGX = null;
        }
        c1235870iGX.LJI();
        C1235870iGX c1235870iGX2 = this.LL;
        (c1235870iGX2 != null ? c1235870iGX2 : null).LJIIIIZZ();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || ownerActivity.isFinishing()) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1235870iGX c1235870iGX = this.LL;
        if (c1235870iGX == null) {
            c1235870iGX = null;
        }
        C786410Ut5.LLLLIILL(c1235870iGX, 8);
    }

    public DialogC1237630iJN(C19EG c19eg) {
        super(c19eg, R.style.xv);
        setOwnerActivity(c19eg);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d94);
        C1235870iGX c1235870iGX = (C1235870iGX) findViewById(R.id.w28);
        this.LL = c1235870iGX;
        if (c1235870iGX == null) {
            c1235870iGX = null;
        }
        c1235870iGX.setBuilder(C1209530ha3.LIZ(getContext()));
    }
}
