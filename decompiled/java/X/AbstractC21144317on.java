package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.17on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21144317on extends AbstractC21144517op {
    public String LJIIL;

    public boolean LJIJ(Context context) {
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21144517op
    public final boolean LJIIJJI(Context context) {
        String str = this.LJIIL;
        switch (str.hashCode()) {
            case -1949423989:
                if (str.equals("androidx-material")) {
                    return true;
                }
                break;
            case -1854767153:
                if (str.equals("support")) {
                    return true;
                }
                break;
            case -933324823:
                if (str.equals("androidx")) {
                    return true;
                }
                break;
            case -788047292:
                if (str.equals("widget")) {
                    return true;
                }
                break;
            case 120176997:
                if (str.equals("support-material")) {
                    return true;
                }
                break;
            case 1673671211:
                if (str.equals("automatic")) {
                    return LJIJ(context);
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported appCompatViewInflaterClass : ");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", ");
        sbLIZ.append("appCompatViewInflaterClass");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(Context context, AttributeSet attributeSet) {
        String str = this.LJIIL;
        switch (str.hashCode()) {
            case -1949423989:
                if (str.equals("androidx-material")) {
                    return LJIJI(context, attributeSet);
                }
                break;
            case -1854767153:
                if (str.equals("support")) {
                    throw new IllegalStateException("Stub");
                }
                break;
            case -933324823:
                if (str.equals("androidx")) {
                    return LJIJI(context, attributeSet);
                }
                break;
            case -788047292:
                if (str.equals("widget")) {
                    return LJIJJLI(context, attributeSet);
                }
                break;
            case 120176997:
                if (str.equals("support-material")) {
                    throw new IllegalStateException("Stub");
                }
                break;
            case 1673671211:
                if (str.equals("automatic")) {
                    return LJIJJ(context, attributeSet);
                }
                break;
        }
        throw new IllegalStateException("");
    }

    public View LJIJI(Context context, AttributeSet attributeSet) {
        throw new IllegalStateException("Stub");
    }

    public View LJIJJ(Context context, AttributeSet attributeSet) {
        throw new IllegalStateException("Stub");
    }

    public View LJIJJLI(Context context, AttributeSet attributeSet) {
        throw new IllegalStateException("Stub");
    }
}
