package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.EnablePrivateAlbumWithoutPermissionExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.LimitAlbumBannerIconUrlExperiment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS24S0102000_2;

/* JADX INFO: renamed from: X.0KhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524460KhY implements InterfaceC523400Kfq {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public ViewStub LJI;

    @Override // X.InterfaceC523400Kfq
    public final void hide() {
        ViewStub viewStub = this.LJI;
        if (viewStub != null) {
            C786410Ut5.LLIIIJ(viewStub, 8);
        }
    }

    @Override // X.InterfaceC523400Kfq
    public final boolean isVisible() {
        ViewStub viewStub = this.LJI;
        return viewStub != null && viewStub.getVisibility() == 0;
    }

    @Override // X.InterfaceC523400Kfq
    public final void show() {
        ViewStub viewStub = this.LJI;
        if (viewStub != null) {
            C786410Ut5.LLIIIJ(viewStub, 0);
        }
    }

    @Override // X.InterfaceC523400Kfq
    public final void LIZ(MvChoosePhotoScene mvChoosePhotoScene, ViewStub viewStub) {
        C524450KhX c524450KhX;
        String str;
        String str2;
        this.LJI = viewStub;
        boolean z = this.LIZJ;
        if (this.LIZLLL) {
            viewStub.setLayoutResource(R.layout.bge);
        } else {
            viewStub.setLayoutResource(R.layout.bgc);
        }
        C786410Ut5.LJLLLL(viewStub);
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, mvChoosePhotoScene.requireActivity());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                View viewFindViewById = mvChoosePhotoScene.findViewById(R.id.i8f);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundColor(iIntValue);
                }
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, mvChoosePhotoScene.requireActivity());
            if (numLIZJ2 != null) {
                numLIZJ2.intValue();
                TuxIconView tuxIconView = (TuxIconView) mvChoosePhotoScene.findViewById(R.id.mk3);
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.ee);
                }
                TuxTextView tuxTextView = (TuxTextView) mvChoosePhotoScene.findViewById(R.id.xzd);
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.ee);
                }
            }
        }
        if (this.LIZLLL) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(LimitAlbumBannerIconUrlExperiment.getValue());
            c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) mvChoosePhotoScene.findViewById(R.id.mk3));
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        LinearLayout linearLayout = (LinearLayout) mvChoosePhotoScene.findViewById(R.id.tb1);
        if (linearLayout != null) {
            if (z) {
                C384050F3z c384050F3z = new C384050F3z();
                float fLIZIZ = C418440Gaw.LIZIZ(12);
                c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
                c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
                c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
                c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                linearLayout.setBackground(c384050F3z.LIZ(mvChoosePhotoScene.requireActivity()));
            }
            C786410Ut5.R7(linearLayout, new ACListenerS112S0200000_8(mvChoosePhotoScene, this, 13));
        }
        if (this.LJFF) {
            if (z) {
                c524450KhX = new C524450KhX(R.attr.ee, R.attr.a1r);
            } else {
                c524450KhX = new C524450KhX(R.attr.ee, R.attr.a04);
            }
        } else {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_change_settings_button_type", true);
            if (iLJIJ != 0) {
                if (iLJIJ != 1) {
                    if (iLJIJ != 2) {
                        if (z) {
                            c524450KhX = new C524450KhX(R.attr.ee, R.attr.dy);
                        } else {
                            c524450KhX = new C524450KhX(R.attr.a1h, R.attr.c4);
                        }
                    } else if (z) {
                        c524450KhX = new C524450KhX(R.attr.a1r, R.attr.dy);
                    } else {
                        c524450KhX = new C524450KhX(R.attr.a1r, R.attr.c4);
                    }
                } else if (z) {
                    c524450KhX = new C524450KhX(R.attr.ee, R.attr.a1r);
                } else {
                    c524450KhX = new C524450KhX(R.attr.ee, R.attr.a04);
                }
            } else if (z) {
                c524450KhX = new C524450KhX(R.attr.ee, R.attr.dy);
            } else {
                c524450KhX = new C524450KhX(R.attr.a1h, R.attr.c4);
            }
        }
        int i = c524450KhX.LIZ;
        int i2 = c524450KhX.LIZIZ;
        C197039127h c197039127h = (C197039127h) mvChoosePhotoScene.findViewById(R.id.j3f);
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS24S0102000_2(mvChoosePhotoScene, i, i2, 2));
            C786410Ut5.U8(c197039127h, new ACListenerS112S0200000_8(mvChoosePhotoScene, this, 14));
        }
        TuxIconView tuxIconView2 = (TuxIconView) mvChoosePhotoScene.findViewById(R.id.e2k);
        if (tuxIconView2 != null) {
            if (z) {
                tuxIconView2.setTintColorRes(R.attr.eh);
            }
            C786410Ut5.a9(tuxIconView2, new ACListenerS143S0100000_8(viewStub, 114));
        }
        C197039127h c197039127h2 = (C197039127h) mvChoosePhotoScene.findViewById(R.id.axc);
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS112S0200000_8(mvChoosePhotoScene, this, 15));
        }
        C197039127h c197039127h3 = (C197039127h) mvChoosePhotoScene.findViewById(R.id.ruv);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LJ);
        c0lab.LJ("shoot_way", this.LIZ);
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (zIsLogin) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str2);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str3 = "1";
        }
        c0lab.LJ("has_microphone_permission", str3);
        C523280Kfe.LIZ.getClass();
        c0lab.LJ("has_upload_permission", C523280Kfe.LIZIZ());
        c0lab.LJ("is_private_access", "1");
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS112S0200000_8(mvChoosePhotoScene, c0lab, 16));
        }
        if (EnablePrivateAlbumWithoutPermissionExperiment.isEnabled()) {
            C0LGY.LIZ.getClass();
            if (!C0LGY.LJI()) {
                return;
            }
        }
        C523390Kfp c523390Kfp = C523390Kfp.LIZ;
        String str4 = this.LIZ;
        String str5 = this.LIZIZ;
        String str6 = this.LJ;
        c523390Kfp.getClass();
        C523390Kfp.LIZLLL(str4, str5, str6, false);
    }

    public C524460KhY(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str3;
        this.LJFF = z3;
    }
}
