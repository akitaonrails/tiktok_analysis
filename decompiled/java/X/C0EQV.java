package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS122S0300000_5;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EQV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQV extends Scene {
    public final InterfaceC361710EGb LLJI;
    public final LiveData<Integer> LLJIJIL;
    public final Function0<Unit> LLJILJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) findViewById(R.id.b7e);
        if (textView != null) {
            textView.setText(view.getContext().getString(2131836943));
        }
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.b7b);
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_aiprogress_oral_large);
        }
        this.LLJIJIL.observe(this, new AObserverS122S0300000_5((TuxTextView) view.findViewById(R.id.b7d), this, c1295960jpS, 1));
        InterfaceC361710EGb interfaceC361710EGb = this.LLJI;
        if (interfaceC361710EGb != null && (canvasSize = interfaceC361710EGb.getCanvasSize()) != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
            C372570Ej9.LIZJ(sizeLIZJ.getWidth(), sizeLIZJ.getHeight(), view);
        }
        if (C297330Bl5.LIZ() == 0 || C297330Bl5.LIZ() == 1 || !C357540E0a.LJIILLIIL(requireSceneContext())) {
            C426750GoL.LJIIIZ(view, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(requireSceneContext())), null, null, false, 29);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b7a);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS140S0100000_5(this, 78));
        }
    }

    public C0EQV(InterfaceC361710EGb interfaceC361710EGb, MutableLiveData mutableLiveData, AwS549S0100000_5 awS549S0100000_5) {
        this.LLJI = interfaceC361710EGb;
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = awS549S0100000_5;
        disableSceneRestore();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.f885c1b, viewGroup, false);
    }
}
