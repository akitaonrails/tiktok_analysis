package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655010Pmd extends AbstractViewOnTouchListenerC446430Hez {
    public final /* synthetic */ AbstractC655570PnX LLJIJIL;

    @Override // X.AbstractViewOnTouchListenerC446430Hez
    public final void LIZ(boolean z) {
        int iIntValue;
        if (z) {
            View view = this.LLJIJIL.itemView;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, this.LLJIJIL.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view.setForeground(new ColorDrawable(iIntValue));
            return;
        }
        this.LLJIJIL.itemView.setForeground(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C655010Pmd(AbstractC655570PnX abstractC655570PnX, Context context) {
        super(context);
        this.LLJIJIL = abstractC655570PnX;
    }
}
