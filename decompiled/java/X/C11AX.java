package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11AX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AX extends AbstractC1664490tPr<C1654870tAL, C19456311Ab> {
    public C11AP LLJJJIL;
    public C194304110c LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC19456211Aa interfaceC19456211Aa = new InterfaceC19456211Aa() { // from class: X.11AY
            @Override // X.InterfaceC19456211Aa
            public final void LIZ() {
                this.LIZ.LLLLIL().LIZ.invoke();
            }

            @Override // X.InterfaceC19456211Aa
            public final void LIZIZ() {
                this.LIZ.LLLLIL().LIZJ.invoke();
            }

            @Override // X.InterfaceC19456211Aa
            public final void LIZJ() {
                this.LIZ.LLLLIL().LIZIZ.invoke();
            }
        };
        Context contextRequireSceneContext = requireSceneContext();
        if (C539880LFi.LIZ == null) {
            C539880LFi.LIZ = new C194304110c(contextRequireSceneContext);
        }
        this.LLJJJJ = C539880LFi.LIZ;
        FrameLayout frameLayout = (FrameLayout) this.mView.findViewById(R.id.f01);
        C194304110c c194304110c = this.LLJJJJ;
        if (c194304110c != null) {
            C11AP c11ap = new C11AP(frameLayout, interfaceC19456211Aa, c194304110c);
            c11ap.LLIZLLLIL = false;
            this.LLJJJIL = c11ap;
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tAM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1654870tAL) obj).LIZ;
                }
            }, new AwS608S0100000_29(this, 225));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.acu, viewGroup, false);
    }
}
