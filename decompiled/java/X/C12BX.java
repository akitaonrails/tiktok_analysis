package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS490S0200000_29;

/* JADX INFO: renamed from: X.12BX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BX extends RoundedFrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final ImageView LLILLL;
    public final C415640GRm LLILZ;
    public Function1<? super Integer, Unit> LLILZIL;

    public C12BX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final Function1<Integer, Unit> getOnFetchSwitchColorListener() {
        return this.LLILZIL;
    }

    public final void setOnFetchSwitchColorListener(Function1<? super Integer, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void LIZJ(C415650GRn c415650GRn, Bitmap bitmap) {
        if (c415650GRn == null) {
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
        } else {
            this.LLILZ.setGradientData(c415650GRn);
            C786410Ut5.LJLLLLLL(0, this.LLILZ);
        }
        if (bitmap == null) {
            C786410Ut5.LJLLLLLL(8, this.LLILLL);
        } else {
            this.LLILLL.setImageBitmap(bitmap);
            C786410Ut5.LJLLLLLL(0, this.LLILLL);
        }
    }

    public C12BX(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        this.LLILLL = imageView;
        C415640GRm c415640GRm = new C415640GRm(context);
        addView(c415640GRm, -1, -1);
        this.LLILZ = c415640GRm;
    }

    public final void LIZIZ(User user, BackgroundModel backgroundModel, Function0<Unit> function0) {
        C11GZ c11gz = C11GZ.LIZ;
        AwS490S0200000_29 awS490S0200000_29 = new AwS490S0200000_29(this, (C12BX) function0, (Function0<Unit>) 0);
        c11gz.getClass();
        C11GZ.LIZIZ(user, backgroundModel, awS490S0200000_29);
    }
}
