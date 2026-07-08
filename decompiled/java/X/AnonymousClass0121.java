package X;

import android.content.Context;
import android.graphics.Paint;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0121, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0121 implements AnonymousClass0123 {
    public final int LIZ;
    public final int LIZIZ = R.attr.nh;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0121)) {
            return false;
        }
        AnonymousClass0121 anonymousClass0121 = (AnonymousClass0121) obj;
        return this.LIZ == anonymousClass0121.LIZ && this.LIZIZ == anonymousClass0121.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResStrokeConfig(widthRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", attrRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0121(int i) {
        this.LIZ = i;
    }

    @Override // X.AnonymousClass0123
    public final void LIZ(Context context, Paint paint) {
        int iIntValue;
        paint.setStyle(Paint.Style.STROKE);
        Integer numLIZJ = C1308910kAL.LIZJ(this.LIZIZ, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(context.getResources().getDimension(this.LIZ));
    }
}
