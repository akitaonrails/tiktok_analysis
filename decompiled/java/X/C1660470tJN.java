package X;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660470tJN extends AbstractC1664490tPr<C1660440tJK, C1660460tJM> {
    public AppCompatImageView LLJJJIL;
    public C1695920uEY LLJJJJ;

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        AppCompatImageView appCompatImageView = this.LLJJJIL;
        if (appCompatImageView != null) {
            C786410Ut5.LJZI(8, appCompatImageView);
        }
        C1695920uEY c1695920uEY = this.LLJJJJ;
        if (c1695920uEY != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1695920uEY);
            c1695920uEY.setScaleX(1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1695920uEY);
            c1695920uEY.setScaleY(1.0f);
            int visibility = c1695920uEY.getVisibility();
            c1695920uEY.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1695920uEY);
        }
        super.onStop();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tJQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1660440tJK) obj).LIZ;
            }
        }, new AwS391S0200000_25(this, view, 87));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tJR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1660440tJK) obj).LIZIZ;
            }
        }, new AwS604S0100000_25(this, 256));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AppCompatImageView appCompatImageView = new AppCompatImageView(requireSceneContext());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.LLILIL(appCompatImageView, 8);
        C786410Ut5.h6(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
        this.LLJJJIL = appCompatImageView;
        frameLayout.addView(appCompatImageView);
        C1695920uEY c1695920uEY = new C1695920uEY(requireSceneContext());
        c1695920uEY.setScaleType(ImageView.ScaleType.FIT_XY);
        int visibility = c1695920uEY.getVisibility();
        c1695920uEY.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1695920uEY);
        Paint paint = new Paint();
        paint.setColor(Color.argb(51, 255, 255, 255));
        paint.setStrokeWidth(C418440Gaw.LIZIZ(2));
        c1695920uEY.setBorder(paint);
        this.LLJJJJ = c1695920uEY;
        frameLayout.addView(c1695920uEY);
        return frameLayout;
    }
}
