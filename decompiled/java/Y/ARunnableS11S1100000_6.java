package Y;

import X.C0P0T;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1391600mJi;
import X.C1592950rYT;
import X.C1720880uso;
import X.C1C7U;
import X.C259800zU;
import X.C418440Gaw;
import X.C427020Gom;
import X.C438710HIf;
import X.C450720Hlu;
import X.C459990I2b;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishBottomTabViewFactory;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUGuideListCard;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS91S1000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS11S1100000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (Intrinsics.LJFF(TextUtils.ellipsize(((TuxTextView) this.l1).getText(), ((TuxTextView) this.l1).getPaint(), (((TuxTextView) this.l1).getWidth() - ((TuxTextView) this.l1).getPaddingStart()) - ((TuxTextView) this.l1).getPaddingEnd(), TextUtils.TruncateAt.END).toString(), this.s0)) {
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) this.l1;
        tuxTextView.setTextSize(0, tuxTextView.getTextSize() - C814420VxA.LIZIZ(C418440Gaw.LJ(1)));
    }

    public final void LIZ$1() {
        PublishBottomTabViewFactory publishBottomTabViewFactory = (PublishBottomTabViewFactory) this.l1;
        C1592950rYT c1592950rYT = publishBottomTabViewFactory.LLILLJJLI;
        if (c1592950rYT == null) {
            c1592950rYT = null;
        }
        String str = this.s0;
        publishBottomTabViewFactory.getClass();
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C450720Hlu c450720Hlu = new C450720Hlu(c1592950rYT.getContext());
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = c1592950rYT;
        c450720Hlu.LLILZ = str;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391600mJi.LJIJJ = false;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        publishBottomTabViewFactory.LLILZLL = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, android.text.Layout] */
    public final void LIZ$2() {
        C259800zU c259800zU = new C259800zU();
        ?? layout = ((TextView) ((MixFeedCell) this.l1).itemView.findViewById(R.id.ohp)).getLayout();
        c259800zU.element = layout;
        if (layout == 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
            C786410Ut5.LLLLZLL((TuxTextView) ((MixFeedCell) this.l1).itemView.findViewById(R.id.ohp), 0);
        } else {
            ((TuxTextView) ((MixFeedCell) this.l1).itemView.findViewById(R.id.ohp)).LJJJJI(10.0f);
            HandlerHook.viewPost(((MixFeedCell) this.l1).itemView.findViewById(R.id.ohp), new ARunnableS11S1200000_6((MixFeedCell) this.l1, c259800zU, this.s0, 2));
        }
    }

    public final void LIZ$3() {
        TuxIconView tuxIconView;
        Context context;
        TuxIconView tuxIconView2 = ((C459990I2b) this.l1).LIZ;
        if (tuxIconView2 == null || tuxIconView2.getParent() == null || (tuxIconView = ((C459990I2b) this.l1).LIZ) == null || (context = tuxIconView.getContext()) == null) {
            return;
        }
        C459990I2b c459990I2b = (C459990I2b) this.l1;
        String str = this.s0;
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        TuxIconView tuxIconView3 = c459990I2b.LIZ;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = tuxIconView3;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LJIIJ(2131848907);
        c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c450720Hlu.LJ(new AwS91S1000000_6(str, 1));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c459990I2b.LIZJ = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
    }

    public static final void run$0(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PriceView@4a5f.updateAmount$1");
        try {
            TuxTextView tuxTextView = ((C1720880uso) aRunnableS11S1100000_6.l1).LL;
            if (tuxTextView != null) {
                tuxTextView.setText(aRunnableS11S1100000_6.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PriceView@4a5f.updateAmount$1");
    }

    public static final void run$1(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorUIUtils@8157.reduceFontSize$1");
        try {
            aRunnableS11S1100000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorUIUtils@8157.reduceFontSize$1");
    }

    public static final void run$2(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaDNUGuideListCard@9063.bind$1$1");
        try {
            SmartImageView smartImageView = ((MiniDramaDNUGuideListCard) aRunnableS11S1100000_6.l1).LLJI;
            if (smartImageView != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(aRunnableS11S1100000_6.s0));
                int width = smartImageView.getWidth();
                int height = smartImageView.getHeight();
                c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
                c1331670kl3LJIIIIZZ.LJIIIZ = height;
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaDNUGuideListCard@9063.bind$1$1");
    }

    public static final void run$3(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PublishBottomTabViewFactory@2e1c.showTabSpecialPlusGuidePop$1");
        try {
            aRunnableS11S1100000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishBottomTabViewFactory@2e1c.showTabSpecialPlusGuidePop$1");
    }

    public static final void run$4(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MixFeedCell@a78e.onBindItemView$3");
        try {
            aRunnableS11S1100000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixFeedCell@a78e.onBindItemView$3");
    }

    public static final void run$5(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("CommentStickerHelper@4015.tryShowStickerTip$1");
        try {
            aRunnableS11S1100000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentStickerHelper@4015.tryShowStickerTip$1");
    }

    public static final void run$6(ARunnableS11S1100000_6 aRunnableS11S1100000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleCountDownManager@957f.innerStart$1$2$action$1");
        try {
            ((C427020Gom) aRunnableS11S1100000_6.l1).LIZIZ.invoke(aRunnableS11S1100000_6.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleCountDownManager@957f.innerStart$1$2$action$1");
    }

    public ARunnableS11S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ARunnableS11S1100000_6(PublishBottomTabViewFactory publishBottomTabViewFactory, String str, Long l, int i) {
        this.$t = i;
        this.l1 = publishBottomTabViewFactory;
        this.s0 = str;
    }
}
