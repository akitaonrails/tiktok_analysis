package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0sta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644480sta extends LinearLayout {
    public final C1645700svY LL;
    public final C1645700svY LLILLJJLI;

    public C1644480sta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1645700svY c1645700svY = new C1645700svY(getContext());
        this.LL = c1645700svY;
        C1645700svY c1645700svY2 = new C1645700svY(getContext());
        this.LLILLJJLI = c1645700svY2;
        setOrientation(1);
        addView(c1645700svY);
        addView(c1645700svY2);
        C1645700svY c1645700svY3 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1645700svY3);
        c1645700svY3.setScaleX(0.5f);
        C1645700svY c1645700svY4 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1645700svY4);
        c1645700svY4.setScaleY(0.5f);
    }

    public final void LIZ(C1644470stZ c1644470stZ, C1644470stZ c1644470stZ2, boolean z) {
        C1645700svY c1645700svY = this.LL;
        String str = c1644470stZ.LIZ;
        String str2 = c1644470stZ2.LIZ;
        c1645700svY.getClass();
        new RunnableC1645690svX(c1645700svY, str, str2, z).run();
        C1645700svY c1645700svY2 = this.LLILLJJLI;
        String str3 = c1644470stZ.LIZIZ;
        String str4 = c1644470stZ2.LIZIZ;
        c1645700svY2.getClass();
        new RunnableC1645690svX(c1645700svY2, str3, str4, z).run();
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }
}
