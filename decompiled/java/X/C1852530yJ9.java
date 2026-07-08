package X;

import Y.ATListenerS346S0200000_27;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput.TakoPhotoDisplayCell;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.List;

/* JADX INFO: renamed from: X.0yJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852530yJ9 extends FrameLayout {
    public final View LL;
    public final C1842270y2b LLILLJJLI;
    public final View LLILLL;
    public final TuxIconView LLILZ;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILZIL;
    public final View LLILZLL;
    public C1852540yJA LLIZ;

    public final void LIZ() {
        String string;
        Editable editableV = C2204961BRm.v(this.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcULlh489L8H/lFvO8iwQ/6GBqmmdqIRZPXxyj4xapGqU94kxOwBk=", null));
        if (editableV == null || (string = editableV.toString()) == null) {
            string = "";
        }
        if (string.length() > 0) {
            C0DSB.LIZJ(this.LL);
        } else {
            C0DSB.LIZIZ(this.LL);
        }
    }

    public final String getEditTextString() {
        return String.valueOf(C2204961BRm.v(this.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcULlh489L8H/lFvO8iwQ/6GBqmmdqIRZPXxyj4xapGqU94kxOwBk=", null)));
    }

    public final void setEditFocus(boolean z) {
        if (z) {
            this.LLILLJJLI.requestFocus();
        } else {
            this.LLILLJJLI.clearFocus();
        }
    }

    public final void setEnablePhotoPick(boolean z) {
        if (z) {
            this.LLILZ.setTintColorRes(R.attr.a1h);
            this.LLILLL.setEnabled(true);
        } else {
            this.LLILZ.setTintColorRes(R.attr.a1p);
            this.LLILLL.setEnabled(false);
        }
    }

    public final void setInputViewClickListener(C1852540yJA c1852540yJA) {
        this.LLIZ = c1852540yJA;
    }

    public final void setPhotos(List<C1852560yJC> list) {
        if (!list.isEmpty()) {
            C0DSB.LIZJ(this.LLILZIL);
            C0DSB.LIZJ(this.LLILZLL);
            C20600815jK<InterfaceC1891350zJl> state = this.LLILZIL.getState();
            if (state != null) {
                state.LJFF(null);
            }
            C20600815jK<InterfaceC1891350zJl> state2 = this.LLILZIL.getState();
            if (state2 != null) {
                state2.LIZLLL(list, null);
                return;
            }
            return;
        }
        C0DSB.LIZIZ(this.LLILZLL);
        C0DSB.LIZIZ(this.LLILZIL);
    }

    public C1852530yJ9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.fpi, this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        setBackground(c384050F3z.LIZ(context));
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.up8);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0r);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        tuxIconView.setTuxIcon(c419910GdJ);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        tuxIconView.setBackground(c384050F3z2.LIZ(context));
        View viewFindViewById = findViewById(R.id.up9);
        C786410Ut5.I7(new AkS94S0100000_27(this, 2), viewFindViewById);
        this.LL = viewFindViewById;
        C1842270y2b c1842270y2b = (C1842270y2b) findViewById(R.id.grz);
        c1842270y2b.addTextChangedListener(new C1864790ycv(this, 0));
        c1842270y2b.setOnTouchListener(new ATListenerS346S0200000_27(this, c1842270y2b, 0));
        c1842270y2b.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1864710ycn(this, 0));
        this.LLILLJJLI = c1842270y2b;
        View viewFindViewById2 = findViewById(R.id.xay);
        C786410Ut5.I7(new AkS94S0100000_27(this, 3), viewFindViewById2);
        this.LLILLL = viewFindViewById2;
        this.LLILZ = (TuxIconView) findViewById(R.id.xav);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.qc_);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoPhotoDisplayCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C04JB(context, 0));
        this.LLILZIL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILZLL = findViewById(R.id.vv6);
        LIZ();
    }
}
