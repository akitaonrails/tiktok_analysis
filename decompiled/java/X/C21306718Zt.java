package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.gamora.editor.ailive.widget.VideoPlayerView;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21306718Zt extends Scene {
    public final C362390EIr LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 350));

    public C21306718Zt(C362390EIr c362390EIr) {
        this.LLJI = c362390EIr;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.jc4);
        if (textView != null) {
            textView.setText(getString(2131834200));
        }
        View viewFindViewById = view.findViewById(R.id.cp0);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 1), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.cov);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 0), viewFindViewById2);
        }
        VideoPlayerView videoPlayerView = (VideoPlayerView) this.LLJIJIL.getValue();
        C362390EIr c362390EIr = this.LLJI;
        videoPlayerView.LIZ(view, c362390EIr.LIZIZ, c362390EIr.LIZ);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.nn, viewGroup, false);
    }
}
