package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.03EX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EX extends FrameLayout {
    public final SmartImageView LL;
    public final ImageView LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon r11) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03EX.LIZ(com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon):void");
    }

    public C03EX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        SmartImageView smartImageView = new SmartImageView(context, attributeSet, 0);
        this.LL = smartImageView;
        ImageView imageView = new ImageView(context, attributeSet, 0);
        this.LLILLJJLI = imageView;
        addView(smartImageView, new ViewGroup.LayoutParams(-1, -1));
        addView(imageView, new ViewGroup.LayoutParams(-1, -1));
    }
}
