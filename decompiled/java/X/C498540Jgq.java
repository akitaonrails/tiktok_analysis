package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C498540Jgq extends FrameLayout {
    public final ImageView LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public void setAvatar(int i) {
        ImageView imageView = this.LL;
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C1324610kZf c1324610kZfLJIJ = C1819620xS4.LIZ().LJIJ(i);
            c1324610kZfLJIJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIJ.LJ = -1;
            c1324610kZfLJIJ.LJFF = -1;
            c1324610kZfLJIJ.LJJI(imageView);
            return;
        }
        if (imageView == null || !C0JSS.LIZIZ(imageView.getContext())) {
            return;
        }
        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
        c1322000kVSLJFF.LJ = new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
        c1322000kVSLJFF.LJ();
        c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
        c1322000kVSLJFF.LIZJ(imageView);
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            C786410Ut5.LJZI(0, this.LLILLJJLI);
            ImageView imageView = this.LLILLJJLI;
            int i = this.LLILZIL;
            C1121670fIL.LJFF(imageView, imageModel, i, i);
            return;
        }
        C786410Ut5.LJZI(8, this.LLILLJJLI);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            C786410Ut5.LJZI(0, this.LLILLL);
            ImageView imageView = this.LLILLL;
            int i = this.LLILZLL;
            C0JSS.LIZJ(i, i, -1, imageView, imageModel, null, false);
            return;
        }
        C786410Ut5.LJZI(4, this.LLILLL);
    }

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            ImageView imageView = this.LL;
            int i = this.LLILZ;
            C1121670fIL.LJIILIIL(imageView, imageModel, i, i, R.drawable.eze);
        }
    }

    public C498540Jgq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C498540Jgq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iLIZIZ = (int) C497740JfY.LIZIZ(100.0f);
        this.LLILZ = iLIZIZ;
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(42.0f);
        this.LLILZLL = iLIZIZ2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AvatarIconView);
            this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AvatarIconView_ttlive_avatar_size, iLIZIZ);
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AvatarIconView_ttlive_avatar_border_size, 0);
            this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AvatarIconView_ttlive_icon_size, iLIZIZ2);
            typedArrayObtainStyledAttributes.recycle();
        }
        ImageView imageView = new ImageView(context);
        this.LL = imageView;
        int i2 = this.LLILZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        C786410Ut5.c6(this.LL, layoutParams);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.LLILLJJLI = imageView2;
        int i3 = this.LLILZIL;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams2.gravity = 17;
        C786410Ut5.c6(this.LLILLJJLI, layoutParams2);
        addView(imageView2);
        ImageView imageView3 = new ImageView(context);
        this.LLILLL = imageView3;
        int i4 = this.LLILZLL;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i4, i4);
        layoutParams3.bottomMargin = (int) C497740JfY.LIZIZ(3.0f);
        layoutParams3.rightMargin = (int) C497740JfY.LIZIZ(2.0f);
        layoutParams3.gravity = 8388693;
        C786410Ut5.c6(this.LLILLL, layoutParams3);
        addView(imageView3);
        C786410Ut5.LJZI(4, imageView3);
    }
}
