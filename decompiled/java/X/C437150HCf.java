package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal$ActiveArea;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437150HCf extends View {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final Rect getCurrentActiveArea() {
        return (Rect) this.LLILLJJLI.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LL.getValue();
    }

    public final void LIZ(ILynxSearchHorizontal$ActiveArea iLynxSearchHorizontal$ActiveArea) {
        getCurrentActiveArea().set(C0HCL.LIZ(iLynxSearchHorizontal$ActiveArea.getX(), getContext()), C0HCL.LIZ(iLynxSearchHorizontal$ActiveArea.getY(), getContext()), C0HCL.LIZ(iLynxSearchHorizontal$ActiveArea.getX() + iLynxSearchHorizontal$ActiveArea.getWidth(), getContext()), C0HCL.LIZ(iLynxSearchHorizontal$ActiveArea.getY() + iLynxSearchHorizontal$ActiveArea.getHeight(), getContext()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = C0HCL.LIZ(iLynxSearchHorizontal$ActiveArea.getY() + iLynxSearchHorizontal$ActiveArea.getHeight(), getContext());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setColor(-65536);
        getPaint().setAlpha(127);
        canvas.save();
        if (C444960Hcc.LIZJ(getContext())) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        canvas.drawRect(getCurrentActiveArea(), getPaint());
        canvas.restore();
    }

    public C437150HCf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(538));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(537));
    }
}
