package X;

import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.1229, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1229 extends Scene {
    public final C1DRG LLJI;
    public StickerHintTextViewModel LLJIJIL;
    public AnonymousClass1225 LLJILJIL;
    public TextView LLJILLL;
    public TextView LLJJ;
    public final C391040FUw LLJILJILJ = C391040FUw.LIZ;
    public final float LLJJI = 8.0f;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1052));

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLJJIII.getValue() != null) {
            StickerHintTextViewModel stickerHintTextViewModel = this.LLJIJIL;
            if (stickerHintTextViewModel == null) {
                stickerHintTextViewModel = null;
            }
            stickerHintTextViewModel.wQ2().postValue(null);
        }
    }

    public AnonymousClass1229(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        StickerHintTextViewModel stickerHintTextViewModel;
        super.onViewCreated(view, bundle);
        StickerHintTextViewModel stickerHintTextViewModel2 = null;
        if (this.LLJJIII.getValue() != null) {
            ViewModelProvider viewModelProviderLJII = C1659630tI1.LJII(view, null, 6);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) this.LLJJIII.getValue());
            sbLIZ.append('-');
            sbLIZ.append(StickerHintTextViewModel.class.getCanonicalName());
            stickerHintTextViewModel = (StickerHintTextViewModel) viewModelProviderLJII.get(C2188811AlT.LIZIZ(sbLIZ), StickerHintTextViewModel.class);
        } else {
            stickerHintTextViewModel = (StickerHintTextViewModel) C1659630tI1.LJII(view, null, 6).get(StickerHintTextViewModel.class);
        }
        this.LLJIJIL = stickerHintTextViewModel;
        this.LLJILLL = (TextView) findViewById(R.id.tv_sticker_hint);
        this.LLJJ = (TextView) findViewById(R.id.tv_sticker_hint_guidance);
        this.LLJILJIL = new AnonymousClass1225(this.LLJILLL.getContext());
        StickerHintTextViewModel stickerHintTextViewModel3 = this.LLJIJIL;
        if (stickerHintTextViewModel3 == null) {
            stickerHintTextViewModel3 = null;
        }
        stickerHintTextViewModel3.vQ2().observe(this, new AObserverS231S0100000_29(this, 249));
        StickerHintTextViewModel stickerHintTextViewModel4 = this.LLJIJIL;
        if (stickerHintTextViewModel4 != null) {
            stickerHintTextViewModel2 = stickerHintTextViewModel4;
        }
        stickerHintTextViewModel2.wQ2().observe(this, new AObserverS231S0100000_29(this, 250));
    }

    public static void LLLII(TextView textView, float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
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
        if (textView != null) {
            C786410Ut5.g6(textView, marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.c57, viewGroup, false);
    }
}
