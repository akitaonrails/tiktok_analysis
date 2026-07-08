package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214150hhV extends FrameLayout {
    public TuxIconView LL;
    public final View LLILLJJLI;

    public final TuxIconView getEmptyImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h2q);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void setEmptyImageFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setOnClickNotNowListener(Function1<? super View, Unit> function1) {
        ACListenerS154S0100000_19 aCListenerS154S0100000_19;
        C197039127h c197039127h = (C197039127h) this.LLILLJJLI.findViewById(R.id.csi);
        if (function1 != null) {
            aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(function1, (Function1<? super View, Unit>) 147);
        } else {
            aCListenerS154S0100000_19 = null;
        }
        C786410Ut5.U8(c197039127h, aCListenerS154S0100000_19);
    }

    public final void setOnClickTurnOnListener(Function1<? super View, Unit> function1) {
        ACListenerS154S0100000_19 aCListenerS154S0100000_19;
        C197039127h c197039127h = (C197039127h) this.LLILLJJLI.findViewById(R.id.cwc);
        if (function1 != null) {
            aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(function1, (Function1<? super View, Unit>) 147);
        } else {
            aCListenerS154S0100000_19 = null;
        }
        C786410Ut5.U8(c197039127h, aCListenerS154S0100000_19);
    }

    public C1214150hhV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ee1, this, true);
        if (C19GT.LLILLJJLI == 2) {
            getEmptyImageFromXml().setIconRes(R.drawable.d0s);
        } else {
            getEmptyImageFromXml().setIconRes(R.drawable.d0t);
        }
    }
}
