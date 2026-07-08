package Y;

import X.AbstractC1542100qES;
import X.C0QXP;
import X.C118300cf;
import X.C1537720q7O;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1C7U;
import X.C20472080g;
import X.C649300PdQ;
import X.C649470Pdh;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.lynx.tasm.TemplateData;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS3S0410000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = 0;
        final float fMeasureText = ((EditText) this.l0).getPaint().measureText(((SpannableStringBuilder) this.l1).toString()) + ((((C20472080g) this.l2).wordList != null ? r0.size() : 0) * (C0QXP.LIZJ + C0QXP.LIZLLL));
        final C118300cf c118300cf = new C118300cf();
        int measuredWidth = ((EditText) this.l0).getMeasuredWidth() - ((EditText) this.l0).getTotalPaddingLeft();
        c118300cf.element = measuredWidth;
        if (!this.z4) {
            ImageView imageView = (ImageView) this.l3;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.rightMargin;
                }
            }
            c118300cf.element = measuredWidth - i;
        }
        EditText editText = (EditText) this.l0;
        final ImageView imageView2 = (ImageView) this.l3;
        editText.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0QXp
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                TextView textView;
                if (view instanceof TextView) {
                    textView = (TextView) view;
                } else {
                    textView = null;
                }
                ImageView imageView3 = imageView2;
                if (textView != null) {
                    C0QXP.LIZ.getClass();
                    if (C0QXP.LIZIZ(textView)) {
                        if (i2 < (fMeasureText - c118300cf.element) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) {
                            ImageView imageView4 = imageView2;
                            if (imageView4 != null) {
                                C786410Ut5.LJZI(0, imageView4);
                                return;
                            }
                            return;
                        }
                        ImageView imageView5 = imageView2;
                        if (imageView5 == null) {
                            return;
                        }
                        C786410Ut5.LJZI(4, imageView5);
                        return;
                    }
                }
                if (imageView3 != null) {
                    C786410Ut5.LJZI(4, imageView3);
                }
            }
        });
    }

    public final void LIZ$1() {
        C1537910q7h c1537910q7h;
        InterfaceC1531560pxS interfaceC1531560pxS = ((C1537720q7O) this.l0).getHybridContext().hybridParams;
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJJ = null;
        }
        if (this.z4) {
            TemplateData templateData = (TemplateData) this.l1;
            if (templateData != null) {
                ((C1537720q7O) this.l0).updateData(templateData);
            }
        } else {
            ((C649300PdQ) this.l2).LJIIZILJ = (TemplateData) this.l1;
        }
        ((C1537720q7O) this.l0).startLynxRuntime();
        if (this.z4) {
            ((C1537720q7O) this.l0).processRender();
        }
        InterfaceC1541990qEH interfaceC1541990qEH = ((C649300PdQ) this.l2).LJIL;
        if (interfaceC1541990qEH != null && (interfaceC1541990qEH instanceof ViewGroup) && (interfaceC1541990qEH instanceof C1537720q7O)) {
            C649470Pdh.LIZ.getClass();
            C649470Pdh.LJJIIJZLJL((C1537720q7O) interfaceC1541990qEH, "fromCache");
        }
        ((AbstractC1542100qES) this.l3).LJLIIIL((C1537720q7O) this.l0);
    }

    public static final void run$0(ARunnableS3S0410000_10 aRunnableS3S0410000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchSpanHelper@d8fc.showCapsuleWords$1$1$2");
        try {
            aRunnableS3S0410000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchSpanHelper@d8fc.showCapsuleWords$1$1$2");
    }

    public static final void run$1(ARunnableS3S0410000_10 aRunnableS3S0410000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLoader@74bf.onPreLoadSucceedSparkLite$runnable$1");
        try {
            aRunnableS3S0410000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLoader@74bf.onPreLoadSucceedSparkLite$runnable$1");
    }

    public ARunnableS3S0410000_10(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z4 = z;
        this.l3 = obj4;
    }
}
