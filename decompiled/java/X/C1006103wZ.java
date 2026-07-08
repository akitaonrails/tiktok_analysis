package X;

import Y.AsS0S0102000_1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1006103wZ extends ConstraintLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final RecyclerView LLILLL;
    public Function1<? super EnumC1005903wX, Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public final GridLayoutManager LLILZLL;

    private final void setUserRightRowCount(int i) {
        this.LLILZLL.LJIJ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserRight(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaProductSelectUserRightVOV3 r6) {
        /*
            r5 = this;
            X.03Eb r2 = X.C809103Eb.LIZ
            com.bytedance.lighten.loader.SmartImageView r1 = r5.LL
            r3 = 0
            if (r6 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r6.icon
        L9:
            r2.getClass()
            X.C809103Eb.LIZ(r1, r0)
            if (r6 == 0) goto L46
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaPdpRichText r0 = r6.titleContent
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r2 = r0.richText
            if (r2 == 0) goto L46
            com.bytedance.tux.input.TuxTextView r1 = r5.LLILLJJLI
            java.lang.String r0 = "sea_pdp_user_right_v3_title"
            X.C03C8.LIZJ(r1, r2, r0, r3)
        L20:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaPdpRichText> r4 = r6.tagsList
            if (r4 == 0) goto L4e
            androidx.recyclerview.widget.RecyclerView r3 = r5.LLILLL
            X.03wa r2 = new X.03wa
            kotlin.jvm.internal.AwS615S0100000_1 r1 = new kotlin.jvm.internal.AwS615S0100000_1
            r0 = 140(0x8c, float:1.96E-43)
            r1.<init>(r5, r0)
            r2.<init>(r4, r1)
            r3.setAdapter(r2)
        L35:
            java.lang.Integer r0 = r6.tagRowNum
            if (r0 == 0) goto L56
            int r1 = r0.intValue()
        L3d:
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            r5.setUserRightRowCount(r0)
            return
        L46:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLILLJJLI
            r0.setText(r3)
            if (r6 == 0) goto L4e
            goto L20
        L4e:
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            r0.setAdapter(r3)
            if (r6 == 0) goto L56
            goto L35
        L56:
            r1 = 2
            goto L3d
        L58:
            r0 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1006103wZ.setUserRight(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaProductSelectUserRightVOV3):void");
    }

    public final void setUserRightModuleClickListener$ecommerce_transaction_release(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setUserRightSlideListener$ecommerce_transaction_release(Function1<? super EnumC1005903wX, Unit> function1) {
        this.LLILZ = function1;
    }

    public C1006103wZ(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 0, context, false);
        this.LLILZLL = gridLayoutManager;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(View.generateViewId());
        C786410Ut5.G6(smartImageView, new C19ME(C0H9H.LIZIZ(16), C0H9H.LIZIZ(16)));
        this.LL = smartImageView;
        addView(smartImageView);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(View.generateViewId());
        C786410Ut5.M6(tuxIconView, new C19ME(C0H9H.LIZIZ(12), C0H9H.LIZIZ(12)));
        tuxIconView.setIconRes(R.raw.icon_chevron_right_offset_ltr);
        tuxIconView.setTintColorRes(R.attr.a1k);
        addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(View.generateViewId());
        tuxTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tuxTextView.setGravity(8388611);
        tuxTextView.setMaxLines(1);
        C786410Ut5.R6(tuxTextView, new C19ME(0, -2));
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setId(View.generateViewId());
        C786410Ut5.p6(recyclerView, new C19ME(0, -2));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.03wb
            public final int LL = (int) C0H9H.LIZ(16);
            public final int LLILLJJLI = (int) C0H9H.LIZ(4);
            public final int LLILLL = (int) C0H9H.LIZ(24);

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager2;
                int itemCount;
                super.LIZIZ(rect, view, recyclerView2, c21673919s1);
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
                    int i = gridLayoutManager2.LLILLJJLI;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition % i == 0) {
                        rect.bottom = this.LLILLJJLI / 2;
                    } else {
                        rect.top = this.LLILLJJLI / 2;
                    }
                    if (childAdapterPosition < i) {
                        rect.right = this.LL / 2;
                        rect.left = this.LLILLL;
                        return;
                    }
                    int i2 = itemCount % i;
                    if (i2 != 0) {
                        i = i2;
                    }
                    if (childAdapterPosition >= itemCount - i) {
                        rect.left = this.LL / 2;
                        return;
                    }
                    int i3 = this.LL / 2;
                    rect.left = i3;
                    rect.right = i3;
                }
            }
        });
        final AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1539);
        recyclerView.addOnItemTouchListener(new InterfaceC21676019sM(context, awS545S0100000_1) { // from class: X.03wc
            public final Function0<Unit> LL;
            public float LLILLJJLI;
            public float LLILLL;
            public final int LLILZ;
            public Object LLILZIL;

            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView2, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            {
                this.LL = awS545S0100000_1;
                this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop();
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            this.LLILZIL = null;
                            return false;
                        }
                        return false;
                    }
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float fAbs = Math.abs(x - this.LLILLJJLI);
                    float fAbs2 = Math.abs(y - this.LLILLL);
                    if (this.LLILZIL == null) {
                        float f = this.LLILZ;
                        if (fAbs < f && fAbs2 < f) {
                            this.LL.invoke();
                            return true;
                        }
                    }
                    this.LLILZIL = null;
                    return false;
                }
                this.LLILLJJLI = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.LLILLL = y2;
                this.LLILZIL = recyclerView2.findChildViewUnder(this.LLILLJJLI, y2);
                return false;
            }
        });
        recyclerView.addOnScrollListener(new AsS0S0102000_1(this, 0));
        recyclerView.setFadingEdgeLength(C0H9H.LIZIZ(16));
        recyclerView.setHorizontalFadingEdgeEnabled(true);
        this.LLILLL = recyclerView;
        addView(recyclerView);
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        c19mb.LJIIIZ(smartImageView.getId(), 6, 0, 6, C0H9H.LIZIZ(16));
        c19mb.LJIIIZ(smartImageView.getId(), 3, 0, 3, C0H9H.LIZIZ(12));
        c19mb.LJIIIIZZ(tuxIconView.getId(), 3, smartImageView.getId(), 3);
        c19mb.LJIIIZ(tuxIconView.getId(), 7, 0, 7, C0H9H.LIZIZ(16));
        c19mb.LJIIIIZZ(tuxIconView.getId(), 4, smartImageView.getId(), 4);
        c19mb.LJIIIZ(tuxTextView.getId(), 6, smartImageView.getId(), 7, C0H9H.LIZIZ(8));
        c19mb.LJIIIIZZ(tuxTextView.getId(), 3, smartImageView.getId(), 3);
        c19mb.LJIIIZ(tuxTextView.getId(), 7, tuxIconView.getId(), 6, C0H9H.LIZIZ(8));
        c19mb.LJIIIIZZ(tuxTextView.getId(), 4, smartImageView.getId(), 4);
        c19mb.LJIIIZ(recyclerView.getId(), 6, 0, 6, C0H9H.LIZIZ(16));
        c19mb.LJIIIZ(recyclerView.getId(), 3, smartImageView.getId(), 4, C0H9H.LIZIZ(8));
        c19mb.LJIIIZ(recyclerView.getId(), 7, 0, 7, C0H9H.LIZIZ(16));
        c19mb.LJIIIZ(recyclerView.getId(), 4, 0, 4, C0H9H.LIZIZ(12));
        c19mb.LIZIZ(this);
        C786410Ut5.I7(new AjS60S0100000_1(this, 60), this);
    }
}
