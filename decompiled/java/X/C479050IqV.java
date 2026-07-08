package X;

import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: renamed from: X.0IqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479050IqV extends C485900J3s {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final int LLILZIL;
    public final /* synthetic */ C479040IqU LLILZLL;

    public final ConstraintLayout I5() {
        return (ConstraintLayout) this.LL.getValue();
    }

    public final void L5(MGModuleInteraction mGModuleInteraction) {
        Object c098200Yq;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = this.LLILZIL;
        C786410Ut5.W5(this.itemView, layoutParams);
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(mGModuleInteraction.backgroundColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            I5().setBackgroundColor(num.intValue());
        }
        if (!I5().getClipToOutline()) {
            final int i = 0;
            I5().setOutlineProvider(new ViewOutlineProvider(i) { // from class: X.0Kcs
                public final int $t;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    switch (this.$t) {
                        case 0:
                            getOutline$0(this, view, outline);
                            break;
                        case 1:
                            getOutline$1(this, view, outline);
                            break;
                        default:
                            super.getOutline(view, outline);
                            break;
                    }
                }

                {
                    this.$t = i;
                }

                public static final void getOutline$0(C521560Kcs c521560Kcs, View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C497740JfY.LIZIZ(20.0f));
                }

                public static final void getOutline$1(C521560Kcs c521560Kcs, View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C497740JfY.LIZIZ(20.0f));
                }
            });
            I5().setClipToOutline(true);
        } else {
            final int i2 = 1;
            I5().setOutlineProvider(new ViewOutlineProvider(i2) { // from class: X.0Kcs
                public final int $t;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    switch (this.$t) {
                        case 0:
                            getOutline$0(this, view, outline);
                            break;
                        case 1:
                            getOutline$1(this, view, outline);
                            break;
                        default:
                            super.getOutline(view, outline);
                            break;
                    }
                }

                {
                    this.$t = i2;
                }

                public static final void getOutline$0(C521560Kcs c521560Kcs, View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C497740JfY.LIZIZ(20.0f));
                }

                public static final void getOutline$1(C521560Kcs c521560Kcs, View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C497740JfY.LIZIZ(20.0f));
                }
            });
            I5().setClipToOutline(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479050IqV(C479040IqU c479040IqU, ViewGroup viewGroup) {
        super(R.layout.dio, viewGroup);
        this.LLILZLL = c479040IqU;
        this.LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 588));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 587));
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 586));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 584));
        this.LLILZIL = ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(32.0f))) - ((int) C497740JfY.LIZIZ(8.0f))) / 2;
    }
}
