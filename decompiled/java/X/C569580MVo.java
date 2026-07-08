package X;

import Y.ACListenerS143S0100000_8;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS217S0300000_8;

/* JADX INFO: renamed from: X.0MVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569580MVo extends C0FC9<C569470MVd, C569540MVk> {
    public final Uri LLJJJJJIL;
    public final Function1<String, Unit> LLJJJJLIIL;

    public C569580MVo(C1DRG c1drg, Uri uri, AwS217S0300000_8 awS217S0300000_8) {
        super(c1drg);
        this.LLJJJJJIL = uri;
        this.LLJJJJLIIL = awS217S0300000_8;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epl, viewGroup, false);
        SmartImageView smartImageView = (SmartImageView) viewGroup2.findViewById(R.id.lee);
        if (this.LLJJJJJIL == null) {
            C786410Ut5.LLFF(8, smartImageView);
        } else {
            C786410Ut5.LLFF(0, smartImageView);
            smartImageView.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (C1415610mwR.LIZIZ() * 0.45641026f);
                C786410Ut5.W5(smartImageView, layoutParams);
                smartImageView.setImageURI(this.LLJJJJJIL.toString());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.tv_title);
        C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new C0FX0(tuxTextView, 0));
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.e2u);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS143S0100000_8(this, 14));
        }
        TuxTextView tuxTextView2 = (TuxTextView) viewGroup2.findViewById(R.id.cqt);
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS143S0100000_8(this, 15));
        }
        return viewGroup2;
    }
}
