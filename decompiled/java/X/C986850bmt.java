package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: X.0bmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986850bmt extends Property {
    public final int $t;

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.$t) {
            case 0:
                return get$0(this, obj);
            case 1:
                return get$1(this, obj);
            default:
                return super.get(obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                set$0(this, obj, obj2);
                break;
            case 1:
                set$1(this, obj, obj2);
                break;
            default:
                super.set(obj, obj2);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C986850bmt(java.lang.Class r3, java.lang.Class<java.lang.Integer> r4) {
        /*
            r2 = this;
            r2.$t = r4
            if (r4 == 0) goto Lb
            r0 = r2
            java.lang.String r1 = "backgroundColor"
        L7:
            r0.<init>(r3, r1)
            return
        Lb:
            r0 = r2
            java.lang.String r1 = "progress"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C986850bmt.<init>(java.lang.Class, int):void");
    }

    public static final Object get$0(C986850bmt c986850bmt, Object obj) {
        return Integer.valueOf(((ProgressBar) obj).getProgress());
    }

    public static final Object get$1(C986850bmt c986850bmt, Object obj) {
        int color;
        ColorDrawable colorDrawable;
        Drawable background = ((View) obj).getBackground();
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            color = colorDrawable.getColor();
        } else {
            color = -1;
        }
        return Integer.valueOf(color);
    }

    public static final void set$0(C986850bmt c986850bmt, Object obj, Object obj2) {
        ((ProgressBar) obj).setProgress(((Number) obj2).intValue());
    }

    public static final void set$1(C986850bmt c986850bmt, Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Number) obj2).intValue());
    }
}
