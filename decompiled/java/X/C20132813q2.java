package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.13q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20132813q2 extends C20131713pr {
    public String LLJIJIL;

    @Override // X.C20131713pr
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.LLJIJIL;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public C20132813q2(AbstractC20133313q7<? extends C20132813q2> abstractC20133313q7) {
        super(abstractC20133313q7);
    }

    @Override // X.C20131713pr
    public final void LJIIL(Context context, AttributeSet attributeSet) {
        super.LJIIL(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.FragmentNavigator);
        String strXd = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.FragmentNavigator_android_name);
        if (strXd != null) {
            this.LLJIJIL = strXd;
        }
        typedArrayObtainAttributes.recycle();
    }
}
