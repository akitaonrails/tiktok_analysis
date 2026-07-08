package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS24S0102000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0KhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524440KhW implements InterfaceC523400Kfq {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Function0<Unit> LJ;

    @Override // X.InterfaceC523400Kfq
    public final void hide() {
    }

    @Override // X.InterfaceC523400Kfq
    public final boolean isVisible() {
        return false;
    }

    @Override // X.InterfaceC523400Kfq
    public final void show() {
    }

    @Override // X.InterfaceC523400Kfq
    public final void LIZ(MvChoosePhotoScene mvChoosePhotoScene, ViewStub viewStub) {
        C524450KhX c524450KhX;
        viewStub.setLayoutResource(R.layout.bgd);
        C786410Ut5.LJLLLL(viewStub);
        C197039127h c197039127h = (C197039127h) mvChoosePhotoScene.findViewById(R.id.tbb);
        if ((mvChoosePhotoScene.requireActivity().getResources().getConfiguration().uiMode & 32) != 0) {
            if (c197039127h != null) {
                c197039127h.LJJJJL(new AwS581S0100000_2(mvChoosePhotoScene, 405));
            }
        } else if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS581S0100000_2(mvChoosePhotoScene, 406));
        }
        if (c197039127h != null) {
            c197039127h.setBackgroundRadius(200);
            C19EG c19eg = (C19EG) mvChoosePhotoScene.requireActivity();
            C540060LGa c540060LGa = C540060LGa.LIZ;
            int i = this.LIZJ;
            c540060LGa.getClass();
            C786410Ut5.U8(c197039127h, C523750KgP.LIZ(c19eg, C540060LGa.LJI(i), new AwS552S0100000_8(this, 830), 4));
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_change_settings_button_type", true);
        if (iLJIJ != 0) {
            if (iLJIJ != 1) {
                if (iLJIJ != 2) {
                    c524450KhX = new C524450KhX(R.attr.ej, R.attr.ee);
                } else {
                    c524450KhX = new C524450KhX(R.attr.a1r, R.attr.ee);
                }
            } else {
                c524450KhX = new C524450KhX(R.attr.ee, R.attr.a04);
            }
        } else {
            c524450KhX = new C524450KhX(R.attr.ej, R.attr.ee);
        }
        int i2 = c524450KhX.LIZ;
        int i3 = c524450KhX.LIZIZ;
        C197039127h c197039127h2 = (C197039127h) mvChoosePhotoScene.findViewById(R.id.taz);
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new AwS24S0102000_2(mvChoosePhotoScene, i2, i3, 1));
            c197039127h2.setBackgroundRadius(200);
            C786410Ut5.U8(c197039127h2, new ACListenerS112S0200000_8(mvChoosePhotoScene, this, 12));
        }
        TuxIconView tuxIconView = (TuxIconView) mvChoosePhotoScene.findViewById(R.id.e2k);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS143S0100000_8(viewStub, 113));
        }
        C523390Kfp c523390Kfp = C523390Kfp.LIZ;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZLLL;
        c523390Kfp.getClass();
        C523390Kfp.LIZLLL(str, str2, str3, true);
    }

    public C524440KhW(int i, String str, String str2, String str3, AwS157S1100000_8 awS157S1100000_8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = awS157S1100000_8;
    }
}
