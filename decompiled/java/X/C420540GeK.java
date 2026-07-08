package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420540GeK extends LinearLayout {
    public C420540GeK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.g0d, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_billboardTipView, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.ttlive_billboardTipView_ttlive_tipText)) {
            ((TextView) findViewById(R.id.xyu)).setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ttlive_billboardTipView_ttlive_tipText));
        }
    }
}
