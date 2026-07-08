package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733620vDM extends FrameLayout {
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TextView LLILZ;
    public final boolean LLILZIL;

    public final Function0<Unit> getOnWaterMarkClicked() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnWaterMarkShown() {
        return this.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733620vDM(Context context) {
        boolean z;
        super(context, null, 0);
        TextView textView = null;
        try {
            C786410Ut5.Sd(R.layout.bxy, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
            SmartImageView smartImageView = (SmartImageView) findViewById(R.id.ghv);
            this.LLILLL = smartImageView;
            TextView textView2 = (TextView) findViewById(R.id.ghw);
            if (textView2 != null) {
                textView2.setShadowLayer(C12ES.LIZJ(1.5f, context), 0.0f, C12ES.LIZJ(1.0f, context), 1711276032);
                textView = textView2;
            }
            this.LLILZ = textView;
            if (smartImageView != null && textView != null) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZIL = z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECWatcherWaterMarkInflate failed: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        boolean z;
        super.setAlpha(f);
        if (f >= 0.999f) {
            z = true;
        } else {
            z = false;
        }
        setEnabled(z);
        setClickable(z);
    }

    public final void setOnWaterMarkClicked(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnWaterMarkShown(Function0<Unit> function0) {
        this.LL = function0;
    }
}
