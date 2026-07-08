package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19QK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QK extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public String LLILZ;
    public String LLILZIL;

    private final TextView getLtNameTextView() {
        return (TextView) this.LLILLJJLI.getValue();
    }

    private final TextView getLtTipTextView() {
        return (TextView) this.LL.getValue();
    }

    public final C21411718qp getSwitch() {
        return (C21411718qp) this.LLILLL.getValue();
    }

    public final String getName() {
        return this.LLILZ;
    }

    public final String getTip() {
        return this.LLILZIL;
    }

    public final void setName(String str) {
        this.LLILZ = str;
        getLtNameTextView().setText(str);
    }

    public final void setTip(String str) {
        this.LLILZIL = str;
        if (str != null && str.length() != 0) {
            C500260Jjc.LLFFF(getLtTipTextView());
            getLtTipTextView().setText(str);
        } else {
            C500260Jjc.LJIILIIL(getLtTipTextView());
        }
    }

    public C19QK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19QK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C292401Bi.LIZ(new AwS577S0100000_33(this, 326));
        this.LLILLJJLI = C292401Bi.LIZ(new AwS577S0100000_33(this, 325));
        this.LLILLL = C292401Bi.LIZ(new AwS577S0100000_33(this, 327));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ModeratorPermissionItemView);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.ModeratorPermissionItemView_is_tux, false)) {
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gs0, this, true);
            } else {
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.grz, this, true);
            }
            setName(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ModeratorPermissionItemView_name));
            setTip(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ModeratorPermissionItemView_tip));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
