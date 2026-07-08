package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeamlessAnchor;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.19iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21614919iV extends FrameLayout {
    public final InterfaceC21615019iW LL;
    public final C21614619iS LLILLJJLI;
    public final Path LLILLL;
    public final Paint LLILZ;
    public boolean LLILZIL;

    public final boolean getEnableRoundCornerRadius() {
        return this.LLILZIL;
    }

    public final void LIZ(Canvas canvas) {
        FrameLayout.LayoutParams layoutParams;
        int iIntValue;
        Integer num;
        C1AZU c1azuLJIIIZ = this.LL.LJIIIZ();
        if (c1azuLJIIIZ == C1AZU.Unknown) {
            return;
        }
        this.LLILLL.rewind();
        List<View> listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(this), new C21615119iX()));
        if (listLJJII.isEmpty()) {
            return;
        }
        this.LLILLL.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CCW);
        Path path = this.LLILLL;
        path.setFillType(Path.FillType.EVEN_ODD);
        for (View view : listLJJII) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            Object tag = view.getTag(R.id.ysc);
            if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (layoutParams != null) {
                Path path2 = new Path();
                float f = iIntValue;
                path2.addRoundRect(layoutParams.leftMargin, layoutParams.topMargin, r4 + layoutParams.width, r3 + layoutParams.height, f, f, Path.Direction.CW);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        if (!this.LLILLL.isEmpty()) {
            if (c1azuLJIIIZ == C1AZU.Inner) {
                this.LLILZ.setColor(-16777216);
            } else {
                this.LLILZ.setColor(-14873558);
            }
            canvas.drawPath(this.LLILLL, this.LLILZ);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1AZU c1azuLJIIIZ = this.LL.LJIIIZ();
        if (c1azuLJIIIZ == C1AZU.Unknown) {
            return;
        }
        if (LinkMicSeamlessAnchor.INSTANCE.enable() && c1azuLJIIIZ == C1AZU.Inner) {
            if (this.LLILZIL && !this.LLILLJJLI.LIZ) {
                LIZ(canvas);
            }
            super.onDraw(canvas);
            return;
        }
        if (this.LLILLJJLI.LIZ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C2181741Aa4> it2 = this.LL.LIZIZ().iterator();
            while (true) {
                boolean z = false;
                if (it2.hasNext()) {
                    C2181741Aa4 next = it2.next();
                    C21614719iT c21614719iTLJIIJ = this.LL.LJIIJ(next.LIZLLL.LIZ);
                    if (c21614719iTLJIIJ != null) {
                        if (next.LJIIIIZZ.LIZ == EnumC1283210jUt.EmptySlot) {
                            z = true;
                        }
                        linkedHashMap.put(c21614719iTLJIIJ, Boolean.valueOf(z));
                    }
                } else {
                    C21614619iS c21614619iS = this.LLILLJJLI;
                    boolean z2 = this.LLILZIL;
                    c21614619iS.getClass();
                    Rect rect = new Rect();
                    rect.left = 0;
                    rect.top = 0;
                    rect.right = getWidth();
                    rect.bottom = getHeight();
                    c21614619iS.LIZ(canvas, rect, linkedHashMap, z2);
                    super.onDraw(canvas);
                    return;
                }
            }
        } else {
            LIZ(canvas);
            super.onDraw(canvas);
        }
    }

    public final void setDividerType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDividerType:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        if (i == EnumC938840aXS.DIVIDER_TYPE_SHARED_BG.type) {
            C21614619iS c21614619iS = this.LLILLJJLI;
            c21614619iS.LIZ = true;
            c21614619iS.LIZIZ(i);
        } else {
            this.LLILLJJLI.LIZ = false;
        }
        postInvalidate();
    }

    public final void setEnableRoundCornerRadius(boolean z) {
        this.LLILZIL = z;
    }

    public C21614919iV(InterfaceC21615019iW interfaceC21615019iW, Context context) {
        super(context, null, 0);
        this.LL = interfaceC21615019iW;
        this.LLILLJJLI = new C21614619iS();
        this.LLILLL = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLILZ = paint;
    }
}
