package X;

import Y.ARunnableS108S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import fyo.e;
import java.util.Map;

/* JADX INFO: renamed from: X.0MRY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRY extends AbstractC1664490tPr<C549910LhV, C07U8> {
    public C568400MRa LLJJJIL;
    public TTVideoEngine LLJJJJ;
    public final C0MRZ LLJJJJJIL = new InterfaceC1469360oL8() { // from class: X.0MRZ
        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJI(e eVar) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJ(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJLI(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJII(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIIJ(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIJ(Map map) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJL(e eVar, String str) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJLIIIIJ(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJ(TTVideoEngine tTVideoEngine) {
            TextureView textureView;
            C0MRY c0mry = this.LL;
            C568400MRa c568400MRa = c0mry.LLJJJIL;
            if (c568400MRa != null && (textureView = c568400MRa.LLILZIL) != null) {
                HandlerHook.viewPost(textureView, new ARunnableS108S0100000_8(c0mry, 143));
            }
        }
    };

    public final void LLLLLJIL() {
        TTVideoEngine tTVideoEngine = new TTVideoEngine(requireSceneContext(), 2);
        tTVideoEngine.LLILZIL("VideoBackgroundScene");
        tTVideoEngine.setLooping(true);
        tTVideoEngine.LJ(true);
        tTVideoEngine.LIZJ(199, 1);
        tTVideoEngine.LIZJ(4, 2);
        tTVideoEngine.LLJILLL(this.LLJJJJJIL);
        this.LLJJJJ = tTVideoEngine;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C1295960jpS c1295960jpS;
        super.onDestroyView();
        C568400MRa c568400MRa = this.LLJJJIL;
        if (c568400MRa != null && (c1295960jpS = c568400MRa.LLILLL) != null) {
            c1295960jpS.cancelAnimation();
        }
        TTVideoEngine tTVideoEngine = this.LLJJJJ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJILLL(null);
        }
        TTVideoEngine tTVideoEngine2 = this.LLJJJJ;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.release();
        }
        this.LLJJJJ = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        TTVideoEngine tTVideoEngine = this.LLJJJJ;
        if (tTVideoEngine == null || tTVideoEngine.LJJLIIIJILLIZJL() != 1) {
            return;
        }
        tTVideoEngine.pause();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        TTVideoEngine tTVideoEngine;
        super.onResume();
        if (C123100dR.LIZ(LLLLILI().LIZ.LIZJ) && (tTVideoEngine = this.LLJJJJ) != null && tTVideoEngine.LJJZZIII() && tTVideoEngine.LJJLIIIJILLIZJL() == 2) {
            tTVideoEngine.play();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x005c A[EXC_TOP_SPLITTER, PHI: r1
      0x005c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:16:0x0049, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MRY.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.o9, viewGroup, false);
        int i = R.id.bo6;
        SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.bo6, viewTd);
        if (smartImageView != null) {
            i = R.id.pws;
            C1295960jpS c1295960jpS = (C1295960jpS) C1616006Uk.LIZ(R.id.pws, viewTd);
            if (c1295960jpS != null) {
                i = R.id.pwu;
                View viewLIZ = C1616006Uk.LIZ(R.id.pwu, viewTd);
                if (viewLIZ != null) {
                    i = R.id.video_background_layer;
                    TextureView textureView = (TextureView) C1616006Uk.LIZ(R.id.video_background_layer, viewTd);
                    if (textureView != null) {
                        CardView cardView = (CardView) viewTd;
                        this.LLJJJIL = new C568400MRa(cardView, smartImageView, c1295960jpS, viewLIZ, textureView);
                        return cardView;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
