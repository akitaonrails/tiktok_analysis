package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388420FKu extends AbstractC1664490tPr<C388440FKw, C0FL1> {
    public final FrameLayout LLJJJIL;
    public final FrameLayout LLJJJJ;
    public final C0FKI LLJJJJJIL;
    public C388170FJv LLJJJJLIIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C388170FJv c388170FJv = this.LLJJJJLIIL;
        if (c388170FJv != null) {
            c388170FJv.setStickerEditListener(new C0FSC() { // from class: X.0FKv
                @Override // X.C0FSC
                public final void LIZJ() {
                }

                @Override // X.C0FSC
                public final void LJFF() {
                }

                @Override // X.C0FSC
                public final void LJ() {
                    this.LIZ.LLLLIL().LIZJ.invoke();
                    C0FSC c0fsc = this.LIZ.LLLLILI().LIZ.LIZLLL;
                    if (c0fsc != null) {
                        c0fsc.LJ();
                    }
                }

                @Override // X.C0FSC
                public final void LIZIZ(StickerModel stickerModel) {
                    C0FSC c0fsc = this.LIZ.LLLLILI().LIZ.LIZLLL;
                    if (c0fsc != null) {
                        c0fsc.LIZIZ(stickerModel);
                    }
                }

                @Override // X.C0FSC
                public final void LIZLLL(boolean z) {
                    this.LIZ.LLLLIL().LIZIZ.invoke();
                    C0FSC c0fsc = this.LIZ.LLLLILI().LIZ.LIZLLL;
                    if (c0fsc != null) {
                        c0fsc.LIZLLL(z);
                    }
                }

                @Override // X.C0FSC
                public final void LIZ(StickerModel stickerModel, boolean z) {
                    C0FSC c0fsc = this.LIZ.LLLLILI().LIZ.LIZLLL;
                    if (c0fsc != null) {
                        c0fsc.LIZ(stickerModel, z);
                    }
                }
            });
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FL2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C388440FKw) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 925));
        C388170FJv c388170FJv2 = this.LLJJJJLIIL;
        if (c388170FJv2 != null) {
            c388170FJv2.setVisibilityChangeListener(new InterfaceC388330FKl() { // from class: X.0FL0
                @Override // X.InterfaceC388330FKl
                public final void LJIIJJI(int i, int i2) {
                    if (i == i2) {
                        return;
                    }
                    this.LIZ.LLLLIL().LIZ.invoke(Integer.valueOf(i2));
                }
            });
        }
    }

    public C388420FKu(FrameLayout frameLayout, FrameLayout frameLayout2, C0FKI c0fki) {
        this.LLJJJIL = frameLayout;
        this.LLJJJJ = frameLayout2;
        this.LLJJJJJIL = c0fki;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout == null) {
            frameLayout = this.LLJJJJ;
        }
        C388170FJv c388170FJv = new C388170FJv(requireSceneContext(), LLLLILI().LIZ.LIZIZ, this.LLJJJJ, frameLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388170FJv);
        c388170FJv.setLayoutParams(layoutParams);
        C786410Ut5.k2(c388170FJv, 8);
        c388170FJv.LJIJJLI(LLLLILI().LIZ.LIZ, this.LLJJJJJIL, this);
        c388170FJv.LJJIJIIJI(frameLayout.getLeft(), this.LLJJJJ.getRight() - frameLayout.getRight());
        this.LLJJJJLIIL = c388170FJv;
        return c388170FJv;
    }
}
