package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.PublishBottomPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11VI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VI {
    public final Fragment LIZ;
    public final Scene LIZIZ;
    public final C856850XjP LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;
    public final ViewGroup LJFF;
    public final ViewGroup LJII;
    public final C11VD LJIIIIZZ;
    public final PublishBottomPanelViewModel LJIIJ;
    public boolean LJIIJJI;
    public String LJI = "";
    public final ArrayList<Character> LJIIIZ = C1697810uHb.LJ('\n', ' ');

    public final void LIZ() {
        if (!C1366905Wp.LIZ()) {
            this.LJIIIIZZ.LIZJ(C12WG.LJ(this.LIZIZ), new AwS608S0100000_29(this, 227));
        }
        C856850XjP c856850XjP = this.LIZJ;
        if (c856850XjP == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C0ZI0 c0zi0 = c856850XjP.LIZIZ;
        c0zi0.setOnMentionInputListener(new InterfaceC857050Xjj() { // from class: X.11VJ
            @Override // X.InterfaceC857050Xjj
            public final void LIZ() {
                if (C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS608S0100000_29(this.LIZ, 226))) {
                    return;
                }
                this.LIZ.LIZIZ(true);
                this.LIZ.LJIIIIZZ.LIZ(true);
            }
        });
        c0zi0.addTextChangedListener(new C19773412Ya(this, 7));
    }

    public final void LIZIZ(boolean z) {
        int i;
        if (C1366905Wp.LIZ() && z && !this.LJIIJJI) {
            this.LJIIIIZZ.LIZJ(C12WG.LJ(this.LIZIZ), new AwS608S0100000_29(this, 227));
            this.LJIIJJI = true;
        }
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLZ(i, viewGroup);
        }
        PublishBottomPanelViewModel publishBottomPanelViewModel = this.LJIIJ;
        C890640Ywo c890640Ywo = new C890640Ywo(EnumC890650Ywp.MENTION_USER, z);
        publishBottomPanelViewModel.getClass();
        C01TT.LIZLLL(new AwS415S0200000_14(publishBottomPanelViewModel, c890640Ywo, 53));
    }

    public C11VI(Fragment fragment, C856850XjP c856850XjP, View view, Scene scene) {
        this.LIZ = fragment;
        this.LIZIZ = scene;
        PublishBottomPanelViewModel publishBottomPanelViewModel = (PublishBottomPanelViewModel) new ViewModelProvider(scene).get(PublishBottomPanelViewModel.class);
        this.LJIIJ = publishBottomPanelViewModel;
        this.LIZJ = c856850XjP;
        this.LIZLLL = (ViewGroup) view.findViewById(R.id.adj);
        this.LJ = (ViewGroup) view.findViewById(R.id.jh0);
        this.LJFF = (ViewGroup) view.findViewById(R.id.ccd);
        this.LJII = (ViewGroup) view.findViewById(R.id.o7j);
        this.LJIIIIZZ = publishBottomPanelViewModel.LLILLJJLI;
    }
}
