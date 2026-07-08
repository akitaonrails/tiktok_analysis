package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0blC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985800blC extends FrameLayout {
    public InterfaceC985830blF LL;

    public final void setBoostGlovesEffectChangeListener(InterfaceC985830blF interfaceC985830blF) {
        this.LL = interfaceC985830blF;
    }

    public C985800blC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.h7z, C786410Ut5.ne(context), this);
    }
}
