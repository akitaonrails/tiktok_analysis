package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424560Gko extends SmartImageView {
    public InterfaceC424570Gkp LLIZLLLIL;

    @Override // com.bytedance.lighten.loader.SmartImageView
    public void LIZJ() {
        setCornerRadius(C12ES.LIZJ(2.0f, getContext()));
        getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
    }

    public C424560Gko(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        InterfaceC424570Gkp interfaceC424570Gkp = this.LLIZLLLIL;
        if (interfaceC424570Gkp != null) {
            interfaceC424570Gkp.LIZ();
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setConfigurationChangedListener(InterfaceC424570Gkp interfaceC424570Gkp) {
        this.LLIZLLLIL = interfaceC424570Gkp;
    }

    public void setCornerRadius(float f) {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(f);
        getHierarchy().LJJIII(c1331100kk8);
    }

    public C424560Gko(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C424560Gko(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
