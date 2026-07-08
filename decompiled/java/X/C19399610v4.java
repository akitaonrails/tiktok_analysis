package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19399610v4 extends LinearLayout {
    public final C1295960jpS LL;
    public final C19399210v0 LLILLJJLI;

    public final void setCenterSelectListener(InterfaceC19399010uy interfaceC19399010uy) {
        this.LLILLJJLI.setCenterSelectListener(interfaceC19399010uy);
    }

    public C19399610v4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setGravity(1);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dlc, this, true);
        this.LL = (C1295960jpS) findViewById(R.id.o6h);
        this.LLILLJJLI = (C19399210v0) findViewById(R.id.o6s);
    }
}
