package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0blB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985790blB extends FrameLayout {
    public InterfaceC985860blI LL;
    public EnumC964170bCJ LLILLJJLI;

    public final void setSmokeEffectChangeListener(InterfaceC985860blI interfaceC985860blI) {
        this.LL = interfaceC985860blI;
    }

    public C985790blB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.h81, C786410Ut5.ne(context), this);
    }
}
