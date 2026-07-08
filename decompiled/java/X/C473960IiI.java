package X;

import Y.AfS176S0100000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0IiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473960IiI extends ConstraintLayout {
    public DataChannel LL;
    public final C11NJ LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public final C16F5 getCountDownContentView() {
        return (C16F5) this.LLILZ.getValue();
    }

    public final TextView getCountDownTextView() {
        return (TextView) this.LLILLL.getValue();
    }

    public C473960IiI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C473960IiI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11NJ c11nj = new C11NJ();
        this.LLILLJJLI = c11nj;
        this.LLILLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 8));
        this.LLILZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 7));
        ViewGroup.inflate(getContext(), R.layout.hrj, this);
        c11nj.LIZ(C11NZ.LJJJJZ("ttlive_ic_live_float_window_msg_icon_go.png").LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IiH
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_game_demand_1", (String) obj);
                if (drawableLIZ != null) {
                    drawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    return drawableLIZ;
                }
                return null;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(this, 20)));
    }
}
