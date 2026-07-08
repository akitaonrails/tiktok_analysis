package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0s2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611360s2A extends ConstraintLayout {
    public final SmartImageView LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final View LLILZ;
    public final TuxTextView LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C1611380s2C LLJI;

    public C1611360s2A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void setPlayButtonVisible(boolean z) {
        int i;
        this.LLIZLLLIL = z;
        TuxIconView tuxIconView = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    public final void e0(long j, boolean z) {
        this.LLILZLL = z;
        this.LLIZ = j;
        int i = 8;
        if (z) {
            this.LLILZIL.setText(new SimpleDateFormat("MMM d", Locale.getDefault()).format(new Date(j)));
            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
            View view = this.LLILZ;
            if (!this.LLJ) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
            this.LLILZIL.setShadowLayer(4.0f, 0.0f, 1.0f, ColorProtector.parseColor("#1E000000"));
            return;
        }
        C786410Ut5.LLLLZLL(this.LLILZIL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0s2C] */
    public C1611360s2A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new InterfaceC427850Gq7() { // from class: X.0s2C
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                C1611360s2A c1611360s2A = this.LL;
                c1611360s2A.LLJ = true;
                C786410Ut5.LJLLLLLL(8, c1611360s2A.LLILZ);
            }
        };
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.co1, this, true);
        this.LL = (SmartImageView) findViewById(R.id.fqw);
        this.LLILLJJLI = findViewById(R.id.fqu);
        this.LLILLL = (TuxIconView) findViewById(R.id.fqz);
        this.LLILZ = findViewById(R.id.fr4);
        this.LLILZIL = (TuxTextView) findViewById(R.id.fqy);
    }

    public /* synthetic */ C1611360s2A(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
