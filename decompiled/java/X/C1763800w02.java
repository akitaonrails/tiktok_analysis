package X;

import Y.ACListenerS128S0200000_26;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763800w02 extends LinearLayout {
    public TuxTextView LL;
    public boolean LLILLJJLI;
    public ECRichText LLILLL;

    private final TuxTextView getTextView() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f9q);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        if (getVisibility() == 0) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        animate().alpha(1.0f).setDuration(300L).start();
    }

    public final void LIZIZ() {
        if (getVisibility() == 8) {
            return;
        }
        animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS113S0100000_13(this, 99)).start();
    }

    public final void LIZJ(ECRichText eCRichText) {
        if (eCRichText == null) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            this.LLILLL = null;
            return;
        }
        if (Intrinsics.LJFF(eCRichText, this.LLILLL)) {
            return;
        }
        this.LLILLL = eCRichText;
        TuxTextView textView = getTextView();
        if (textView != null) {
            C03C8.LIZJ(textView, eCRichText, "creator_video_entrance", null);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new ACListenerS128S0200000_26(this, onClickListener, 6));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && !this.LLILLJJLI) {
            this.LLILLJJLI = true;
            C1018703yb.LIZIZ("tiktokec_button_show", C2097608Jq.LJIIIIZZ(new Pair("entrance_info", "product_detail"), new Pair("button_name", "text"), new Pair("button_type", "create_video")));
        }
    }

    public C1763800w02(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aro, this, true);
        setOrientation(0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zl);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(20);
        c19659111vp.LJI = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }
}
