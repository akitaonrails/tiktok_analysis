package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class CallableC20554515br<V> implements Callable {
    public final /* synthetic */ CellAdaptionComponent LL;
    public final /* synthetic */ List<Rect> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    public CallableC20554515br(CellAdaptionComponent cellAdaptionComponent, List<Rect> list, boolean z) {
        this.LL = cellAdaptionComponent;
        this.LLILLJJLI = list;
        this.LLILLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0FEz, android.view.View] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FrameLayout frameLayout;
        C1C7U.LIZ("CellAdaptionComponent@341f.showOcclusionArea$1");
        C20556015c6.LIZ.getClass();
        if (C20556015c6.LIZLLL && (frameLayout = this.LL.LLLIIIIL) != 0) {
            final Context context = this.LL.getContext();
            final List<Rect> list = this.LLILLJJLI;
            final boolean z = this.LL.LLJZIJLIL;
            final boolean z2 = this.LL.LLL;
            final boolean z3 = this.LL.LLLF;
            final boolean z4 = this.LLILLL;
            final Rect rect = this.LL.LLJLLIL;
            final Rect rect2 = this.LL.LLJLLL;
            final Rect rect3 = this.LL.LLJZ;
            ?? r3 = new View(context, list, z, z2, z3, z4, rect, rect2, rect3) { // from class: X.0FEz
                public final List<Rect> LL;
                public final boolean LLILLJJLI;
                public final boolean LLILLL;
                public final boolean LLILZ;
                public final boolean LLILZIL;
                public final Rect LLILZLL;
                public final Rect LLIZ;
                public final Rect LLIZLLLIL;

                private final void setRectLeft(Rect rect4) {
                }

                private final void setRectLeftUp(Rect rect4) {
                }

                private final void setRectRight(Rect rect4) {
                }

                private final void setRectTop(Rect rect4) {
                }

                private final Rect getRectLeft() {
                    return (Rect) ListProtector.get(this.LL, 3);
                }

                private final Rect getRectLeftUp() {
                    return (Rect) ListProtector.get(this.LL, 2);
                }

                private final Rect getRectRight() {
                    return (Rect) ListProtector.get(this.LL, 1);
                }

                private final Rect getRectTop() {
                    return (Rect) ListProtector.get(this.LL, 0);
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int i;
                    Paint paint;
                    Paint paint2;
                    Paint paint3;
                    super.onDraw(canvas);
                    Paint paint4 = new Paint();
                    paint4.setColor(-16776961);
                    if (this.LLILZIL) {
                        i = 240;
                    } else {
                        i = 128;
                    }
                    paint4.setAlpha(i);
                    Paint paint5 = new Paint();
                    paint5.setColor(-16711936);
                    paint5.setAlpha(128);
                    Paint paint6 = new Paint();
                    paint6.setColor(-65536);
                    paint6.setAlpha(128);
                    canvas.drawRect(this.LLILZLL, paint6);
                    canvas.drawRect(this.LLIZ, paint6);
                    canvas.drawRect(this.LLIZLLLIL, paint6);
                    Rect rectTop = getRectTop();
                    if (this.LLILLJJLI) {
                        paint = paint4;
                    } else {
                        paint = paint5;
                    }
                    canvas.drawRect(rectTop, paint);
                    Rect rectRight = getRectRight();
                    if (this.LLILLL) {
                        paint2 = paint4;
                    } else {
                        paint2 = paint5;
                    }
                    canvas.drawRect(rectRight, paint2);
                    Rect rectLeftUp = getRectLeftUp();
                    if (this.LLILZ) {
                        paint3 = paint4;
                    } else {
                        paint3 = paint5;
                    }
                    canvas.drawRect(rectLeftUp, paint3);
                    Rect rectLeft = getRectLeft();
                    if (!this.LLILZ) {
                        paint4 = paint5;
                    }
                    canvas.drawRect(rectLeft, paint4);
                }

                {
                    this.LL = list;
                    this.LLILLJJLI = z;
                    this.LLILLL = z2;
                    this.LLILZ = z3;
                    this.LLILZIL = z4;
                    this.LLILZLL = rect;
                    this.LLIZ = rect2;
                    this.LLIZLLLIL = rect3;
                }
            };
            C386910FEz c386910FEz = this.LL.LLLJIL;
            if (c386910FEz != null) {
                C786410Ut5.LJJJZ(c386910FEz, frameLayout);
            }
            frameLayout.addView(r3);
            this.LL.LLLJIL = r3;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CellAdaptionComponent@341f.showOcclusionArea$1");
        return unit;
    }
}
