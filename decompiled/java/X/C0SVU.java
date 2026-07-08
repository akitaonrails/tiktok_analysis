package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SVU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVU extends ConstraintLayout implements InterfaceC722460SVo<C0SVS> {
    public final View LL;

    @Override // X.InterfaceC722460SVo
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void LLLLZLLLI(C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        Integer num;
        C0SVT c0svt = c0svs.LIZJ;
        if (c0svt != null && (num = c0svt.LIZJ) != null) {
            setBackgroundColor(num.intValue());
        }
        TuxIconView tuxIconView = (TuxIconView) this.LL.findViewById(R.id.bry);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(c0svs.LIZ.LIZIZ);
            Integer num2 = c0svs.LIZ.LIZJ;
            if (num2 != null) {
                tuxIconView.setTintColor(num2.intValue());
            }
        }
        TextView textView = (TextView) this.LL.findViewById(R.id.bsc);
        if (textView != null) {
            textView.setMovementMethod(C431260Gvc.LIZ);
            textView.setText(c0svs.LIZIZ);
        }
    }

    public C0SVU(Context context, C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        super(context, null);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        this.LL = ViewGroup.inflate(context, R.layout.i3c, this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        LLLLZLLLI(c0svs, interfaceC722440SVm);
    }
}
