package X;

import Y.ACListenerS120S0200000_17;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentDrawableEmojiSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115390f8D extends AbstractC1115470f8L<C1115490f8N> {
    public final LifecycleOwner LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public InterfaceC1115480f8M<C1115490f8N> LLILZ;

    @Override // X.AbstractC1115470f8L
    public final void L5(C1115340f88 c1115340f88) {
        this.LLILZ = c1115340f88;
    }

    public C1115390f8D(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = view;
        this.LLILLL = (ImageView) view.findViewById(R.id.gzv);
    }

    @Override // X.AbstractC1115470f8L
    public final void I5(C1115500f8O c1115500f8O, int i) {
        final C1115490f8N c1115490f8N = (C1115490f8N) c1115500f8O;
        Bitmap bitmap = c1115490f8N.LL;
        if (bitmap != null) {
            this.LLILLL.setImageDrawable(new BitmapDrawable(this.LLILLJJLI.getResources(), bitmap));
            C786410Ut5.I7(new ACListenerS120S0200000_17(c1115490f8N, this, 27), this.LLILLJJLI);
            return;
        }
        LifecycleOwner lifecycleOwner = this.LL;
        Resources resources = this.LLILLL.getResources();
        String str = c1115490f8N.LLILLJJLI;
        InterfaceC314870CVx interfaceC314870CVx = new InterfaceC314870CVx() { // from class: X.0f8I
            @Override // X.InterfaceC314870CVx
            public final void onDrawableLoaded(Drawable drawable) {
                BitmapDrawable bitmapDrawable;
                if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                    C1115390f8D c1115390f8D = this.LIZ;
                    C1115490f8N c1115490f8N2 = c1115490f8N;
                    c1115390f8D.LLILLL.setImageDrawable(drawable);
                    C786410Ut5.I7(new ACListenerS120S0200000_17(c1115490f8N2, c1115390f8D, 28), c1115390f8D.LLILLJJLI);
                    c1115490f8N2.LL = bitmapDrawable.getBitmap();
                }
            }
        };
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        if (!LiveCommentDrawableEmojiSetting.INSTANCE.getValue()) {
            interfaceC314870CVx.onDrawableLoaded(null);
        } else {
            C1115360f8A.LIZJ().LIZIZ(resources, lifecycleOwner, interfaceC314870CVx, str);
        }
    }
}
