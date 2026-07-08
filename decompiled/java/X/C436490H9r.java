package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436490H9r extends AbstractC1664490tPr<C07WG, C436500H9s> {
    public TuxIconView LLJJJIL;

    public final void LLLLLJIL(int i) {
        LayerDrawable layerDrawableLJIILIIL;
        TuxIconView tuxIconView = this.LLJJJIL;
        if (tuxIconView != null) {
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LIZ = i;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(sceneContext);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
                c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(sceneContext));
            } else {
                layerDrawableLJIILIIL = null;
            }
            tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = (TuxIconView) this.mView.findViewById(R.id.rlm);
        LLLLLJIL(R.raw.icon_speaker_2_fill_ltr);
        TuxIconView tuxIconView = this.LLJJJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 56));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0H9t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C07WG) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 166));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.dus, viewGroup, false);
    }
}
