package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import wh6.AbS513S0200000_28;
import wh6.AbS707S0100000_28;

/* JADX INFO: renamed from: X.101Z, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101Z extends ConstraintLayout implements InterfaceC722460SVo<C101Y> {
    public final InterfaceC722440SVm<C101Y> LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final C197039127h LLILZLL;
    public final C197039127h LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final LinearLayout LLJ;
    public final TuxIconView LLJI;
    public final TuxTextView LLJIJIL;

    public final InterfaceC722440SVm<C101Y> getConfig() {
        return this.LL;
    }

    public final void e0(C197039127h c197039127h, C191784101e c191784101e) {
        c197039127h.setText(c191784101e.title);
        int i = C191785101f.LIZ[c191784101e.style.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c197039127h.setButtonVariant(2);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c197039127h.setButtonVariant(1);
            }
        } else {
            c197039127h.setButtonVariant(0);
        }
        AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(c191784101e, (C191784101e) this.LL, (InterfaceC722440SVm<?>) 75);
        if (c191784101e.enableDebouncing) {
            C786410Ut5.I7(new AbS707S0100000_28(awS394S0200000_28, 10, 42), c197039127h);
        } else {
            C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(awS394S0200000_28, 180));
        }
        C2271391DvN.LIZ(c197039127h, (C1A5L) C2271381DvM.LLLZLZ.getValue());
    }

    public final void h0(TuxIconView tuxIconView, C722300SUy c722300SUy) {
        if (c722300SUy.LIZ == C0SV1.LOCAL.ordinal()) {
            int i = c722300SUy.LIZIZ;
            if (i != -1) {
                tuxIconView.setImageResource(i);
            }
            Integer num = c722300SUy.LIZJ;
            if (num != null) {
                tuxIconView.setColorFilter(num.intValue());
                return;
            }
            return;
        }
        if (c722300SUy.LIZ != C0SV1.TUX.ordinal()) {
            return;
        }
        int i2 = c722300SUy.LIZIZ;
        if (i2 != -1) {
            tuxIconView.setIconRes(i2);
        }
        Integer num2 = c722300SUy.LIZJ;
        if (num2 == null) {
            return;
        }
        tuxIconView.setTintColor(num2.intValue());
    }

    @Override // X.InterfaceC722460SVo
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final void LLLLZLLLI(C101Y c101y, InterfaceC722440SVm<C101Y> interfaceC722440SVm) {
        Integer num;
        View.OnClickListener aCListenerS130S0200000_28;
        C0SVT c0svt = c101y.LJ;
        if (c0svt == null) {
            c0svt = new C0SVT(C0SXM.IMAGE.ordinal(), R.drawable.ffs, null, 4);
        }
        int i = c0svt.LIZ;
        if (i == C0SXM.IMAGE.ordinal()) {
            int i2 = c0svt.LIZIZ;
            if (i2 != -1) {
                setBackgroundResource(i2);
            }
        } else if (i == C0SXM.COLOR.ordinal() && (num = c0svt.LIZJ) != null) {
            setBackgroundColor(num.intValue());
        }
        setClickable(true);
        h0(this.LLILLJJLI, c101y.LIZ);
        TuxTextView tuxTextView = this.LLILLL;
        tuxTextView.setText(C101Q.LIZLLL(c101y.LIZIZ, tuxTextView.getContext()));
        TuxTextView tuxTextView2 = this.LLILZ;
        tuxTextView2.setText(C101Q.LIZLLL(c101y.LIZJ, tuxTextView2.getContext()));
        C191784101e c191784101e = c101y.LIZLLL;
        if (c191784101e != null) {
            if (c191784101e.enableDebouncing) {
                aCListenerS130S0200000_28 = new AbS513S0200000_28(c191784101e, interfaceC722440SVm, 1);
            } else {
                aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(c191784101e, interfaceC722440SVm, 65);
            }
            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
            this.LLILZIL.setMovementMethod(C431260Gvc.LIZ);
            TuxTextView tuxTextView3 = this.LLILZIL;
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZLLL(4);
            c444940Hca.LIZJ = c191784101e.title;
            c444940Hca.LIZIZ = true;
            c444940Hca.LIZIZ(42);
            c444940Hca.LJIIIIZZ = new AwS429S0200000_28(aCListenerS130S0200000_28, this, 144);
            tuxTextView3.setText(c444940Hca.LIZ(getContext()));
        } else {
            C786410Ut5.LLLLZLL(this.LLILZIL, 8);
        }
        C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
        C786410Ut5.LLLLLLJ(this.LLIZ, 8);
        if (!c101y.LJFF.isEmpty()) {
            C786410Ut5.LLLLLLJ(this.LLILZLL, 0);
            e0(this.LLILZLL, (C191784101e) ListProtector.get(c101y.LJFF, 0));
            if (c101y.LJFF.size() > 1) {
                C786410Ut5.LLLLLLJ(this.LLIZ, 0);
                e0(this.LLIZ, (C191784101e) ListProtector.get(c101y.LJFF, 1));
            }
        }
        C786410Ut5.LLLLZLL(this.LLIZLLLIL, 8);
        C191796101q c191796101q = c101y.LJI;
        if (c191796101q != null) {
            h0(this.LLJI, c191796101q.LIZ);
            this.LLJIJIL.setText(c191796101q.LIZIZ);
            C786410Ut5.LJZL(0, this.LLJ);
            return;
        }
        C786410Ut5.LJZL(8, this.LLJ);
    }

    public C101Z(Context context, C101Y c101y, InterfaceC722440SVm<C101Y> interfaceC722440SVm) {
        super(context, null);
        this.LL = interfaceC722440SVm;
        C786410Ut5.Sd(R.layout.i3f, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.jxe);
        this.LLILLL = (TuxTextView) findViewById(R.id.title);
        this.LLILZ = (TuxTextView) findViewById(R.id.eu1);
        this.LLILZIL = (TuxTextView) findViewById(R.id.mqq);
        this.LLILZLL = (C197039127h) findViewById(R.id.d6i);
        this.LLIZ = (C197039127h) findViewById(R.id.d6j);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.yzc);
        this.LLJ = (LinearLayout) findViewById(R.id.hit);
        this.LLJI = (TuxIconView) findViewById(R.id.his);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.hiu);
        LLLLZLLLI(c101y, interfaceC722440SVm);
    }
}
