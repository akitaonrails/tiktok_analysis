package X;

import Y.ALAdapterS21S0100000_26;
import Y.ARunnableS35S0300000_2;
import Y.ATListenerS458S0100000_26;
import Y.AUListenerS274S0100000_26;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS705S0100000_26;

/* JADX INFO: renamed from: X.0w39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765730w39 extends FrameLayout {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final C1087110eOb LL;
    public final C1087110eOb LLILLJJLI;
    public final C1087110eOb LLILLL;
    public final View LLILZ;
    public final ConstraintLayout LLILZIL;
    public final C19736512Jv LLILZLL;
    public final C289601Ag LLIZ;
    public final C19736512Jv LLIZLLLIL;
    public final TuxTextView LLJ;
    public final View LLJI;
    public InterfaceC1765790w3F LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C1752050vh5 LLJJ;
    public boolean LLJJI;
    public Integer LLJJIII;
    public Float LLJJIJI;

    public final void LIZLLL() {
        this.LLJILLL = true;
        C998660c5w.LIZIZ(this.LLILZIL, new ALAdapterS21S0100000_26(this, 2), new AUListenerS274S0100000_26(this, 20));
    }

    public final void LIZIZ() {
        int visibility = this.LLJI.getVisibility();
        float alpha = this.LLILZIL.getAlpha();
        Integer num = this.LLJJIII;
        if (num != null && visibility == num.intValue() && Intrinsics.LIZLLL(this.LLJJIJI, alpha)) {
            return;
        }
        this.LLJJIII = Integer.valueOf(visibility);
        this.LLJJIJI = Float.valueOf(alpha);
        InterfaceC1765790w3F interfaceC1765790w3F = this.LLJIJIL;
        if (interfaceC1765790w3F != null) {
            interfaceC1765790w3F.LJI(alpha, visibility);
        }
    }

    public final void LIZJ() {
        C786410Ut5.I7(new AbS705S0100000_26(this, 1, 42), this.LLILZLL);
        C1752050vh5 c1752050vh5 = this.LLJJ;
        if (c1752050vh5 != null) {
            C19736512Jv c19736512Jv = this.LLILZLL;
            C419910GdJ c419910GdJ = c1752050vh5.LIZ;
            c19736512Jv.setStateDrawable(c419910GdJ != null ? c419910GdJ.LIZ(getContext()) : null);
        }
    }

    public final void LJFF() {
        C998660c5w.LIZIZ(this.LLILZIL, new ALAdapterS21S0100000_26(this, 3), new AUListenerS274S0100000_26(this, 18));
    }

    public final void LJI() {
        if (this.LLJILJILJ || !(C1507750pL3.LIZIZ != EnumC1508450pMB.PREVIEW || C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_IDLE || this.LLJJI)) {
            C786410Ut5.LLLLLLLLL(this.LLIZLLLIL, 8);
        } else {
            LJ(0);
        }
    }

    public final boolean getInFeedScene() {
        return this.LLJJI;
    }

    public final C1752050vh5 getMiddleAction() {
        return this.LLJJ;
    }

    public final boolean getNeedShowMask() {
        return this.LLJILLL;
    }

    public final InterfaceC1765790w3F getOnPlayerActionBarListener() {
        return this.LLJIJIL;
    }

    public final void LIZ(long j) {
        ARunnableS35S0300000_2 aRunnableS35S0300000_2 = new ARunnableS35S0300000_2(this.LLILZIL, new AUListenerS274S0100000_26(this, 19), new ALAdapterS21S0100000_26(this, 1), 10);
        C998660c5w.LIZIZ = aRunnableS35S0300000_2;
        C01GW c01gw = C998660c5w.LIZ;
        ((Handler) c01gw.getValue()).removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(j, (Handler) c01gw.getValue(), aRunnableS35S0300000_2);
    }

    public final void LJ(int i) {
        C443120HZe c443120HZe;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c443120HZe = new C443120HZe(8, 8, 8);
                } else {
                    c443120HZe = new C443120HZe(8, 8, 0);
                }
            } else {
                c443120HZe = new C443120HZe(8, 0, 8);
            }
        } else {
            c443120HZe = new C443120HZe(0, 8, 8);
        }
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
        int iIntValue3 = ((Number) c443120HZe.getThird()).intValue();
        C786410Ut5.LLLLLLLLL(this.LLIZLLLIL, iIntValue);
        C786410Ut5.LLLLLLLLLL(this.LLIZ, iIntValue2);
        C786410Ut5.LLILZIL(this.LL, iIntValue3);
    }

    public final void setCustomSliding(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setInFeedScene(boolean z) {
        this.LLJJI = z;
    }

    public final void setLoading(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setMiddleAction(C1752050vh5 c1752050vh5) {
        this.LLJJ = c1752050vh5;
        LIZJ();
    }

    public final void setNeedShowMask(boolean z) {
        this.LLJILLL = z;
    }

    public final void setNetSpeed(int i) {
        TuxTextView tuxTextView = this.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i < 0) {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append(" KB/s");
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setOnPlayerActionBarListener(InterfaceC1765790w3F interfaceC1765790w3F) {
        this.LLJIJIL = interfaceC1765790w3F;
    }

    public C1765730w39(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_s, this, true);
        C1087110eOb c1087110eOb = (C1087110eOb) findViewById(R.id.qn7);
        this.LL = c1087110eOb;
        C1087110eOb c1087110eOb2 = (C1087110eOb) findViewById(R.id.video_error);
        this.LLILLJJLI = c1087110eOb2;
        C1087110eOb c1087110eOb3 = (C1087110eOb) findViewById(R.id.video_retry);
        this.LLILLL = c1087110eOb3;
        View viewFindViewById = findViewById(R.id.qnd);
        C0GXB c0gxb = (C0GXB) findViewById(R.id.vkd);
        View viewFindViewById2 = findViewById(R.id.inu);
        View viewFindViewById3 = findViewById(R.id.video_retry_mask);
        this.LLILZ = viewFindViewById3;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.eqx);
        this.LLILZIL = constraintLayout;
        this.LLILZLL = (C19736512Jv) findViewById(R.id.vki);
        this.LLIZ = (C289601Ag) findViewById(R.id.xwn);
        this.LLIZLLLIL = (C19736512Jv) findViewById(R.id.qmi);
        this.LLJ = (TuxTextView) findViewById(R.id.qnh);
        this.LLJI = findViewById(R.id.a15);
        c1087110eOb.setReferencedIds(new int[]{R.id.qng, R.id.qnh});
        C786410Ut5.LLILZIL(c1087110eOb, 8);
        c1087110eOb2.setReferencedIds(new int[]{R.id.video_error_mask, R.id.qnv, R.id.qnw});
        C786410Ut5.LLILZIL(c1087110eOb2, 8);
        c1087110eOb3.setReferencedIds(new int[]{R.id.video_retry_mask, R.id.qnx, R.id.qny});
        C786410Ut5.LLILZIL(c1087110eOb3, 8);
        C786410Ut5.I7(new AbS705S0100000_26(this, 16, 42), viewFindViewById);
        C786410Ut5.xb(c0gxb, new C1775880wJW(this, 0));
        C786410Ut5.I7(new AbS705S0100000_26(this, 17, 42), viewFindViewById2);
        LIZJ();
        C786410Ut5.I7(new AbS705S0100000_26(this, 18, 42), viewFindViewById3);
        c0gxb.setMax(10000);
        c0gxb.setOnTouchListener(new ATListenerS458S0100000_26(this, 11));
        constraintLayout.setOnTouchListener(new ATListenerS458S0100000_26(this, 12));
    }
}
