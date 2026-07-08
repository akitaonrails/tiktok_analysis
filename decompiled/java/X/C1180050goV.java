package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0goV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180050goV extends ConstraintLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;

    private final SmartImageView getImageView() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.r5w);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    private final TuxTextView getRatingTextView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.r5z);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setText(String str) {
        TuxTextView ratingTextView;
        if (C123100dR.LIZ(str) && str != null && (ratingTextView = getRatingTextView()) != null) {
            ratingTextView.setText(str);
        }
    }

    public final void setUrl(String str) {
        SmartImageView imageView;
        if (C123100dR.LIZ(str) && str != null && getContext() != null && (imageView = getImageView()) != null) {
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_reviews", "poi_nps_rating_image", null).LIZIZ(str);
            C1331670kl3 c1331670kl3 = c1189360h3WLIZIZ.LIZ;
            c1331670kl3.LIZLLL = true;
            c1331670kl3.LJIL = Bitmap.Config.ARGB_8888;
            c1189360h3WLIZIZ.LIZLLL(imageView);
            c1189360h3WLIZIZ.LIZ.LJIIL(new InterfaceC427850Gq7() { // from class: X.0hP7
                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    AnimatedDrawable2 animatedDrawable2;
                    if ((animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
                        animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.0hP8
                            @Override // X.InterfaceC1331000kjy
                            public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                                if (animatedDrawable22 != null) {
                                    animatedDrawable22.stop();
                                }
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                            }
                        });
                    }
                }
            });
        }
    }

    public C1180050goV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.e1v, C786410Ut5.ne(context), this);
    }
}
