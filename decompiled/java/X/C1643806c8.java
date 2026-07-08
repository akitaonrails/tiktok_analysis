package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1643806c8 extends CardView implements C06OA {
    public final /* synthetic */ C06ME LLIZLLLIL;
    public final View LLJ;
    public Animator LLJI;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LLIZLLLIL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LLIZLLLIL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LLIZLLLIL.l(c06mf);
    }

    public C1643806c8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = new C06ME();
        FrameLayout.inflate(context, R.layout.cf1, this);
        setBackground(null);
        this.LLJ = findViewById(R.id.k6m);
    }
}
