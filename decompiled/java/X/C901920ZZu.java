package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901920ZZu extends FrameLayout {
    public String LL;
    public final C426320Gne LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C901990Za1 LLILZ;

    public final void LIZ() {
        String str = this.LL;
        if (str != null) {
            C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this.LLILZ, str);
        }
        String str2 = this.LL;
        if (str2 != null) {
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            LIZIZ(c912070ZqH.LJIILIIL().LJIIIZ().LJIIJ(str2));
            c912070ZqH.LJIILIIL().LJIIIZ().LIZIZ(this.LLILZ, str2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String str = this.LL;
        if (str != null) {
            C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this.LLILZ, str);
        }
    }

    public final C09KS<C09KK> getCallback() {
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Za1] */
    public C901920ZZu(Context context) {
        super(context, null, 0);
        C426320Gne c426320Gne = new C426320Gne(context, null, 6);
        this.LLILLJJLI = c426320Gne;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextColorRes(R.attr.zi);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextAlignment(4);
        this.LLILLL = tuxTextView;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a1a, context));
        addView(c426320Gne, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 17));
        addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.LLILZ = new C09KS<C09KK>() { // from class: X.0Za1
            @Override // X.C09KS
            public final void Uj(C0OPV c0opv) {
            }

            @Override // X.C09KS
            public final void Z3(C912060ZqG c912060ZqG) {
            }

            @Override // X.C09KS
            public final void m4(String str) {
            }

            @Override // X.C09KS
            public final void rf(C1898507c7 c1898507c7) {
            }

            @Override // X.C09KS
            public final void l1(C09KK c09kk) {
                this.LL.LIZIZ(99);
            }

            @Override // X.C09KS
            public final void onProgress(int i) {
                this.LL.LIZIZ(C13LZ.LJ(C814420VxA.LIZIZ(i * 0.99f), 0, 99));
            }
        };
    }

    public final void LIZIZ(int i) {
        this.LLILLJJLI.LIZ(i, false);
        TuxTextView tuxTextView = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        invalidate();
    }

    public final void setMsgUuid$im_camera_card_release(String str) {
        this.LL = str;
        LIZ();
    }
}
