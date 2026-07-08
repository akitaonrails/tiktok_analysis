package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0Jhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499060Jhg extends ConstraintLayout {
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public final FrameLayout LLILZIL;

    public C499060Jhg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final FrameLayout getExtraBottomContainer() {
        return this.LLILZIL;
    }

    public final C1324720kZq getIcon() {
        return this.LL;
    }

    public final LiveIconView getIconArrow() {
        return this.LLILZ;
    }

    public final C16F5 getSubtitle() {
        return this.LLILLL;
    }

    public final C16F5 getTitle() {
        return this.LLILLJJLI;
    }

    public final void setUIData(final C499090Jhj c499090Jhj) {
        C19ME c19me;
        this.LLILLJJLI.setText(c499090Jhj.LIZJ);
        this.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
        if (c499090Jhj.LIZLLL.length() == 0) {
            C500260Jjc.LJIILIIL(this.LLILLL);
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            C19ME c19me2 = null;
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    c19me.bottomToBottom = R.id.jxe;
                }
            } else {
                c19me = null;
            }
            C786410Ut5.y6(this.LLILLJJLI, c19me);
            ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                c19me2.topToBottom = R.id.title;
            }
            C786410Ut5.a6(this.LLILZIL, c19me2);
        } else {
            C500260Jjc.LLFFF(this.LLILLL);
            this.LLILLL.setText(c499090Jhj.LIZLLL);
        }
        if (c499090Jhj instanceof C499080Jhi) {
            C1819620xS4.LIZ().LJIIIZ(((C499080Jhi) c499090Jhj).LJI).LJJI(this.LL);
        } else if (c499090Jhj instanceof C499110Jhl) {
            C499110Jhl c499110Jhl = (C499110Jhl) c499090Jhj;
            if (c499110Jhl.LJII.length() > 0) {
                C1143680frq.LIZLLL(this.LL, "tiktok_live_broadcast_demand_5", c499110Jhl.LJII);
            } else if (c499110Jhl.LIZ() != null) {
                C1819620xS4.LIZ().LJIIIZ(c499110Jhl.LIZ()).LJJI(this.LL);
            } else {
                C500260Jjc.LJIILIIL(this.LL);
                C16F5 c16f5 = this.LLILLJJLI;
                if (c16f5 != null) {
                    ViewGroup.LayoutParams layoutParams3 = c16f5.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams.setMarginStart(0);
                        C786410Ut5.W5(c16f5, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
        }
        if (c499090Jhj.LJ != null) {
            C500260Jjc.LLFFF(this.LLILZ);
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0Jhh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function0<Unit> function0 = c499090Jhj.LJ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZ);
    }

    public C499060Jhg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.his, this, true);
        this.LL = (C1324720kZq) findViewById(R.id.jxe);
        this.LLILLJJLI = (C16F5) findViewById(R.id.title);
        this.LLILLL = (C16F5) findViewById(R.id.wlq);
        this.LLILZ = (LiveIconView) findViewById(R.id.b8y);
        this.LLILZIL = (FrameLayout) findViewById(R.id.hil);
    }

    public /* synthetic */ C499060Jhg(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
