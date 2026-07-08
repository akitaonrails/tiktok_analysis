package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS134S1200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0h3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189590h3t extends FrameLayout {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;

    public final void LIZ(int i) {
        this.LLILLL.setTuxFont(i);
    }

    public final void setMinTextSize(float f) {
        this.LLILLL.setMinTextSize(f);
    }

    public C1189590h3t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7a, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (SmartImageView) viewLJLLJ.findViewById(R.id.rbj);
        this.LLILLL = (TuxTextView) viewLJLLJ.findViewById(R.id.rbl);
    }

    public final void LIZIZ(UrlModel urlModel, String str) {
        Object[] objArr = {urlModel, str};
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1996);
        if (((ArrayList) C13LQ.LJIJI(objArr)).size() == 0) {
            awS562S0100000_18.invoke();
        }
        Object[] objArr2 = {urlModel, str};
        AwS134S1200000_18 awS134S1200000_18 = new AwS134S1200000_18(this, urlModel, str, 1);
        if (((ArrayList) C13LQ.LJIJI(objArr2)).size() == 2) {
            awS134S1200000_18.invoke();
        }
    }
}
