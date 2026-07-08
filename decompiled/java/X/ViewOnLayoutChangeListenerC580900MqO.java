package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.0MqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewOnLayoutChangeListenerC580900MqO implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC580900MqO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C557410Ltb) viewOnLayoutChangeListenerC580900MqO.l0).LLLLILI();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View backgroundView;
        C0MJC c0mjc = (C0MJC) viewOnLayoutChangeListenerC580900MqO.l0;
        InterfaceC566190MIn interfaceC566190MInLJJIIJZLJL = c0mjc.LJJIIJZLJL();
        if (interfaceC566190MInLJJIIJZLJL != null) {
            backgroundView = interfaceC566190MInLJJIIJZLJL.getBackgroundView();
        } else {
            backgroundView = null;
        }
        c0mjc.LJJIJ(backgroundView);
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580900MqO);
        int height = view.getHeight();
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) viewOnLayoutChangeListenerC580900MqO.l0;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = mvChoosePhotoScene.behavior;
        if (viewPagerBottomSheetBehavior != null) {
            viewPagerBottomSheetBehavior.setPeekHeight(height - (((100 - mvChoosePhotoScene.peekHeight) * height) / 100));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            ((PreviewVideoScene) viewOnLayoutChangeListenerC580900MqO.l0).LLLLLL();
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C0M3K) viewOnLayoutChangeListenerC580900MqO.l0).LJII();
    }
}
