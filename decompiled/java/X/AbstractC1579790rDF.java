package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import b6g.o;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1579790rDF<BLOCK_INFO extends o> extends AbstractC1579820rDI<BLOCK_INFO> {
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public RemoteImageView LLILZIL;

    public Integer getIconRes() {
        return null;
    }

    public abstract String getMainTitle();

    public abstract String getSubTitle();

    public final TuxIconView getIconEnd() {
        return this.LLILZ;
    }

    public final RemoteImageView getImgCover() {
        return this.LLILZIL;
    }

    public final TuxTextView getTvSubTitle() {
        return this.LLILLL;
    }

    public final void setIconEnd(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setImgCover(RemoteImageView remoteImageView) {
        this.LLILZIL = remoteImageView;
    }

    public final void setTvSubTitle(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public AbstractC1579790rDF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.f5f, this);
        TextView textView = (TextView) findViewById(R.id.zwv);
        textView.setText(getMainTitle());
        textView.setTextColor(C1578770rBb.LIZ(context, R.attr.a1h));
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.tv_sub_title);
        tuxTextView.setText(getSubTitle());
        tuxTextView.setTextColor(C1578770rBb.LIZ(context, R.attr.a1k));
        this.LLILLL = tuxTextView;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k0c);
        tuxIconView.setTintColor(C1578770rBb.LIZ(context, R.attr.a1k));
        Integer iconRes = getIconRes();
        if (iconRes != null) {
            tuxIconView.setIconRes(iconRes.intValue());
        }
        this.LLILZ = tuxIconView;
        this.LLILZIL = (RemoteImageView) findViewById(R.id.ld7);
    }
}
