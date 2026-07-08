package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.127p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class DialogC197047127p extends C19GU {
    public static final C01GW<List<String>> LLIZLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(305));
    public SparkContext LLILZLL;
    public SparkPopupSchemaParam LLIZ;

    public DialogC197047127p() {
        throw null;
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        Window window = getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHIk2iFV2Mt8XtHFKW0LGJoFbCvFymrxI=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "SparkPopupDialog show", this.LLILZLL);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(8);
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLIZ;
        if (sparkPopupSchemaParam == null || !sparkPopupSchemaParam.getForceDialogNonCancelable()) {
            return;
        }
        setCancelable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC197047127p.LJJZ():void");
    }

    public DialogC197047127p(Context context) {
        super(context, R.style.nr);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(i);
        LJJZ();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(view);
        LJJZ();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(view, layoutParams);
        LJJZ();
    }
}
