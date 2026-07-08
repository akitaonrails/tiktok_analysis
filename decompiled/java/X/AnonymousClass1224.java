package X;

import Y.AObserverS217S0100000_13;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1224, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1224 extends Scene {
    public FTCStickerHintTextViewModel LLJI;
    public AnonymousClass1225 LLJIJIL;
    public TextView LLJILJIL;

    public final void LLLII(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f;
            marginLayoutParams.setMarginStart((int) f);
            marginLayoutParams.topMargin = (int) f2;
        }
        TextView textView2 = this.LLJILJIL;
        if (textView2 != null) {
            C786410Ut5.g6(textView2, marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = null;
        this.LLJI = (FTCStickerHintTextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(FTCStickerHintTextViewModel.class);
        TextView textView = (TextView) findViewById(R.id.tv_sticker_hint);
        this.LLJILJIL = textView;
        this.LLJIJIL = new AnonymousClass1225(textView.getContext());
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel2 = this.LLJI;
        if (fTCStickerHintTextViewModel2 == null) {
            fTCStickerHintTextViewModel2 = null;
        }
        if (fTCStickerHintTextViewModel2.LL == null) {
            fTCStickerHintTextViewModel2.LL = new MutableLiveData<>();
        }
        fTCStickerHintTextViewModel2.LL.observe(this, new AObserverS217S0100000_13(this, 15));
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel3 = this.LLJI;
        if (fTCStickerHintTextViewModel3 != null) {
            fTCStickerHintTextViewModel = fTCStickerHintTextViewModel3;
        }
        if (fTCStickerHintTextViewModel.LLILLJJLI == null) {
            fTCStickerHintTextViewModel.LLILLJJLI = new MutableLiveData<>();
        }
        fTCStickerHintTextViewModel.LLILLJJLI.observe(this, new AObserverS231S0100000_29(this, 126));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eq4, viewGroup, false);
    }
}
