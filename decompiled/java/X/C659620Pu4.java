package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659620Pu4 extends LinearLayout {
    public static final C659600Pu2 LLJILJILJ = new C659600Pu2();
    public final LinearLayout LL;
    public final ConstraintLayout LLILLJJLI;
    public final TextView LLILLL;
    public final TuxIconView LLILZ;
    public final SmartImageView LLILZIL;
    public final ImageView LLILZLL;
    public Product LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final TuxTextView LLJ;
    public final SmartImageView LLJI;
    public final TuxTextView LLJIJIL;
    public final LinearLayout LLJILJIL;

    public final void LIZ() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C661350Pwr.LIZJ(this);
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            TextView textView = this.LLILLL;
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
        } else {
            TextView textView2 = this.LLILLL;
            if (textView2 != null) {
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        TextView textView3 = this.LLILLL;
        if (textView3 != null) {
            textView3.setSelected(z);
        }
    }

    public C659620Pu4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.f3x, this);
        this.LL = (LinearLayout) findViewById(R.id.ghr);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.xlh);
        this.LLILLL = (TextView) findViewById(R.id.video_anchor_text);
        this.LLILZ = (TuxIconView) findViewById(R.id.rxr);
        this.LLILZIL = (SmartImageView) findViewById(R.id.rxs);
        this.LLILZLL = (ImageView) findViewById(R.id.video_anchor_arrow);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.wb6);
        this.LLJ = (TuxTextView) findViewById(R.id.wb8);
        this.LLJI = (SmartImageView) findViewById(R.id.wb4);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.wb7);
        this.LLJILJIL = (LinearLayout) findViewById(R.id.weak_container);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.feed.model.EnhancedProduct r12) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659620Pu4.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.EnhancedProduct):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r8, java.lang.String r9) {
        /*
            r6 = this;
            android.widget.ImageView r0 = r6.LLILZLL
            X.C661350Pwr.LIZJ(r0)
            r3 = 0
            if (r8 == 0) goto L96
            java.util.List<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = r8.productList
            if (r0 == 0) goto L96
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.search.ecom.data.Product r1 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r1
            if (r1 == 0) goto L96
            java.lang.String r0 = r1.LIZIZ()
            r5 = 1
            if (r0 == 0) goto L96
            int r0 = r0.length()
            if (r0 <= 0) goto L96
            r4 = 0
            if (r5 == 0) goto L96
            r6.LLIZ = r1
            boolean r0 = X.C123100dR.LIZ(r9)
            if (r0 == 0) goto L54
            java.util.List<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = r8.productList
            if (r0 == 0) goto L50
            java.util.Iterator r2 = r0.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.search.ecom.data.Product r0 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r0
            java.lang.String r0 = r0.LIZIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L34
            r4 = r1
        L4c:
            com.ss.android.ugc.aweme.search.ecom.data.Product r4 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r4
            if (r4 != 0) goto L52
        L50:
            com.ss.android.ugc.aweme.search.ecom.data.Product r4 = r6.LLIZ
        L52:
            r6.LLIZ = r4
        L54:
            X.0Pu2 r2 = X.C659620Pu4.LLJILJILJ
            com.ss.android.ugc.aweme.search.ecom.data.Product r1 = r6.LLIZ
            int r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getTotalProductAnchors(r7)
            r2.getClass()
            java.lang.String r2 = X.C659600Pu2.LIZIZ(r1, r0)
            if (r2 == 0) goto L92
            X.C661350Pwr.LJIIL(r6)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLILZ
            if (r0 == 0) goto L6f
            X.C786410Ut5.LLLLLLZZ(r0, r3)
        L6f:
            com.bytedance.lighten.loader.SmartImageView r0 = r6.LLILZIL
            r1 = 8
            if (r0 == 0) goto L78
            X.C786410Ut5.LLFF(r1, r0)
        L78:
            android.widget.LinearLayout r0 = r6.LLJILJIL
            if (r0 == 0) goto L7f
            X.C786410Ut5.LJZL(r3, r0)
        L7f:
            android.widget.FrameLayout r0 = r6.LLIZLLLIL
            if (r0 == 0) goto L86
            X.C786410Ut5.LJZ(r1, r0)
        L86:
            android.widget.TextView r0 = r6.LLILLL
            if (r0 == 0) goto L8d
            r0.setText(r2)
        L8d:
            r0 = 0
            X.C427690Gpr.LJ(r6, r0)
            return r5
        L92:
            r6.LIZ()
            return r3
        L96:
            X.C661350Pwr.LIZJ(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659620Pu4.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.search.ProductAnchor, java.lang.String):boolean");
    }
}
