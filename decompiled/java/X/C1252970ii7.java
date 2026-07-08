package X;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ii7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252970ii7 extends FrameLayout implements C16FG {
    public final C1390410mHn LL;
    public boolean LLILLJJLI;

    @Override // X.C16FG
    public int getActualHeight() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    public C1252970ii7(Context context) {
        super(context);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LL = c1390410mHn;
        addView(c1390410mHn, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), 17));
        C786410Ut5.LLJIJIL(this, 4);
    }

    @Override // X.C16FG
    public final void LIZIZ(boolean z) {
        this.LLILLJJLI = z;
        if (z) {
            this.LL.LIZJ();
        } else {
            this.LL.LIZLLL();
        }
    }

    @Override // X.C16FG
    public final void onHiddenChanged(boolean z) {
        if (z) {
            C786410Ut5.LLJIJIL(this, 4);
            this.LL.LIZLLL();
        } else {
            C786410Ut5.LLJIJIL(this, 0);
            if (!this.LLILLJJLI) {
                return;
            }
            this.LL.LIZJ();
        }
    }

    @Override // X.C16FG
    public final void LIZ(int i, boolean z) {
        if (!this.LLILLJJLI) {
            this.LL.LIZIZ(C13LZ.LIZLLL(Math.abs(i) / getActualHeight(), 0.0f, 1.0f), false);
        }
    }
}
