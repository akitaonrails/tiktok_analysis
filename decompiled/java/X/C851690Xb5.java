package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Xb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851690Xb5 extends C851700Xb6 {
    @Override // X.C851700Xb6
    public void setDesc(String str) {
        getChecklistItemDescFromXml().setText(str);
    }

    @Override // X.C851700Xb6
    public void setVariant(EnumC851670Xb3 enumC851670Xb3) {
        int i = C851680Xb4.LIZ[enumC851670Xb3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                getChecklistItemCheckFromXml().setChecked(true);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                if (numLIZJ != null) {
                    getChecklistItemDescFromXml().setTextColor(numLIZJ.intValue());
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        getChecklistItemCheckFromXml().setChecked(false);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ2 == null) {
            return;
        }
        getChecklistItemDescFromXml().setTextColor(numLIZJ2.intValue());
    }

    public C851690Xb5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
