package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1044, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1044 extends AbstractC191841103j {
    public final CharSequence LIZJ;
    public final int LIZLLL = R.layout.ber;

    @Override // X.AbstractC191841103j
    public final int LJFF() {
        return this.LIZLLL;
    }

    public AnonymousClass1044(CharSequence charSequence) {
        this.LIZJ = charSequence;
    }

    @Override // X.InterfaceC191837103f
    public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
        AnonymousClass1044 anonymousClass1044;
        if ((abstractC191840103i instanceof AnonymousClass1044) && (anonymousClass1044 = (AnonymousClass1044) abstractC191840103i) != null) {
            TypedArray typedArrayObtainStyledAttributes = c191838103g.itemView.getContext().obtainStyledAttributes(null, R$styleable.TuxTextCell, R.attr.z2, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingStartEnd, -1);
            C426750GoL.LJIIIZ(c191838103g.itemView, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), null, false, 16);
            typedArrayObtainStyledAttributes.recycle();
            View view = c191838103g.itemView;
            Context context = view.getContext();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.ay));
            view.setBackground(c384050F3z.LIZ(context));
            ((TextView) c191838103g.itemView.findViewById(R.id.yal)).setText(anonymousClass1044.LIZJ);
        }
    }
}
