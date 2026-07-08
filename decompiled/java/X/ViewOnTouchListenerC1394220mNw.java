package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnTouchListenerC1394220mNw implements View.OnTouchListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ImageView LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;

    public ViewOnTouchListenerC1394220mNw(ConstraintLayout constraintLayout, SmartAvatarImageView smartAvatarImageView, SmartAvatarImageView smartAvatarImageView2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = smartAvatarImageView;
        this.LLILLL = smartAvatarImageView2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.LLILLJJLI.clearColorFilter();
            this.LLILLL.clearColorFilter();
            return false;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, this.LL.getContext());
        if (numLIZJ == null) {
            return false;
        }
        ImageView imageView = this.LLILLJJLI;
        ImageView imageView2 = this.LLILLL;
        int iIntValue = numLIZJ.intValue();
        imageView.setColorFilter(iIntValue);
        imageView2.setColorFilter(iIntValue);
        return false;
    }
}
