package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0ryd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609170ryd extends FrameLayout implements InterfaceC1609330ryt {
    public final C01GW LL;
    public C1609250ryl LLILLJJLI;
    public AvatarComponentView LLILLL;

    private final float getOutlineWidth() {
        Function1<Integer, Float> function1;
        C1608740rxw c1608740rxwLIZ = C1609280ryo.LIZ(this.LLILLL);
        C1609250ryl c1609250ryl = this.LLILLJJLI;
        if (c1609250ryl == null || (function1 = c1609250ryl.LJIIIIZZ) == null) {
            return 0.0f;
        }
        return function1.invoke(Integer.valueOf(c1608740rxwLIZ.LIZ)).floatValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LL.getValue();
    }

    public final C1609250ryl getUiData() {
        return this.LLILLJJLI;
    }

    public C1609170ryd(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(403));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1609250ryl c1609250ryl = this.LLILLJJLI;
        if (c1609250ryl != null && c1609250ryl.LJII && c1609250ryl.LJI) {
            View viewLIZ = C460180I2u.LIZ(0, this);
            float outlineWidth = getOutlineWidth();
            canvas.drawArc(new RectF(viewLIZ.getLeft() - outlineWidth, viewLIZ.getTop() - outlineWidth, viewLIZ.getRight() + outlineWidth, viewLIZ.getBottom() + outlineWidth), -90.0f, 360.0f, false, getPaint());
        }
        super.dispatchDraw(canvas);
    }

    @Override // X.InterfaceC1609330ryt
    public void setContainerView(AvatarComponentView avatarComponentView) {
        this.LLILLL = avatarComponentView;
    }

    @Override // X.InterfaceC1609330ryt
    public void setUIConfig(C1609000ryM c1609000ryM) {
        C1609250ryl c1609250ryl;
        InterfaceC1609020ryO interfaceC1609020ryOLIZ = c1609000ryM.LIZJ.LIZ().LIZ();
        if (interfaceC1609020ryOLIZ instanceof C1609250ryl) {
            c1609250ryl = (C1609250ryl) interfaceC1609020ryOLIZ;
        } else {
            c1609250ryl = null;
        }
        this.LLILLJJLI = c1609250ryl;
    }
}
