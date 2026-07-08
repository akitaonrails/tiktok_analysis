package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import b6g.o;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1579810rDH<BLOCK_INFO extends o> extends AbstractC1579820rDI<BLOCK_INFO> {
    public abstract int getIconRes();

    public abstract String getLinkText();

    public AbstractC1579810rDH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.f5h, this);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k1g);
        tuxIconView.setIconRes(getIconRes());
        tuxIconView.setTintColor(C1578770rBb.LIZ(context, R.attr.a1h));
        TextView textView = (TextView) findViewById(R.id.tv_text);
        textView.setText(getLinkText());
        textView.setTextColor(C1578770rBb.LIZ(context, R.attr.a1h));
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.k3k);
        tuxIconView2.setTintColor(C1578770rBb.LIZ(context, R.attr.a1k));
        if (C426750GoL.LIZLLL(context)) {
            tuxIconView2.setIconRes(EnumC1578890rBn.ICON_CHEVRON_LEFT_SLIM_THIN_LTR.id());
        } else {
            tuxIconView2.setIconRes(EnumC1578890rBn.ICON_CHEVRON_RIGHT_SLIM_THIN_LTR.id());
        }
    }
}
