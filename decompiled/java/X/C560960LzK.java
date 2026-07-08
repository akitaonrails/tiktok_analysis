package X;

import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560960LzK extends AbstractC1664490tPr<C1895807bg, C07UH> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 71));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 69));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 70));

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(getSceneContext());
        View viewFindViewById = findViewById(R.id.y3u);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, statusBarHeight, 0, 0);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08r1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895807bg) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 42));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08r2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895807bg) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 43));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.08qy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1895807bg) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 44));
        C786410Ut5.a9((TuxIconView) this.LLJJJJ.getValue(), new ACListenerS143S0100000_8(this, 13));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f859o0, viewGroup, false);
    }
}
