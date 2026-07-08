package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.aikit.api.common.AIResourceService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0LhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549920LhW extends AbstractC1664490tPr<C549910LhV, C07U8> {
    public ViewGroup LLJJJIL;
    public SmartImageView LLJJJJ;
    public SmartImageView LLJJJJJIL;
    public ComposeView LLJJJJLIIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        super.onActivityCreated(bundle);
        ViewGroup viewGroup = this.LLJJJIL;
        ComposeView composeView = null;
        if (viewGroup != null) {
            smartImageView = (SmartImageView) viewGroup.findViewById(R.id.bo6);
        } else {
            smartImageView = null;
        }
        this.LLJJJJJIL = smartImageView;
        ViewGroup viewGroup2 = this.LLJJJIL;
        if (viewGroup2 != null) {
            smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.mmk);
        } else {
            smartImageView2 = null;
        }
        this.LLJJJJ = smartImageView2;
        ViewGroup viewGroup3 = this.LLJJJIL;
        if (viewGroup3 != null) {
            composeView = (ComposeView) viewGroup3.findViewById(R.id.eoa);
        }
        this.LLJJJJLIIL = composeView;
        if (composeView != null) {
            composeView.setContent(C549950LhZ.LIZ);
        }
        String str = LLLLILI().LIZ.LIZ;
        if (str != null && str.length() != 0) {
            SmartImageView smartImageView3 = this.LLJJJJ;
            if (smartImageView3 != null) {
                C337180DJs.LIZ(smartImageView3);
            }
            SmartImageView smartImageView4 = this.LLJJJJJIL;
            if (smartImageView4 != null) {
                C337180DJs.LIZJ(smartImageView4);
            }
            SmartImageView smartImageView5 = this.LLJJJJJIL;
            if (smartImageView5 != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJIIIZ.LJJ(smartImageView5);
                c1331670kl3LJIIIZ.LJIIL(new InterfaceC427850Gq7() { // from class: X.0LhX
                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        String str2 = C545870Laz.LIZIZ.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AIPortraitBackgroundScene -> Load failed throwable: ");
                        sbLIZ.append(th);
                        sbLIZ.append("; ");
                        C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        C549920LhW c549920LhW;
                        ViewGroup viewGroup4;
                        SmartImageView smartImageView6;
                        ComposeView composeView2;
                        C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "AIPortraitBackgroundScene -> Load complete!");
                        if (c428600GrK != null) {
                            int i = c428600GrK.LIZ;
                            int i2 = c428600GrK.LIZIZ;
                            if (i > 0 && i2 > 0 && (viewGroup4 = (c549920LhW = this.LL).LLJJJIL) != null && (smartImageView6 = c549920LhW.LLJJJJJIL) != null && (composeView2 = c549920LhW.LLJJJJLIIL) != null) {
                                C1597306Nf c1597306Nf = new C1597306Nf(viewGroup4, i, i2, smartImageView6, composeView2);
                                if (viewGroup4.getWidth() > 0 && viewGroup4.getHeight() > 0) {
                                    c1597306Nf.invoke();
                                } else {
                                    C786410Ut5.x3(viewGroup4.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581020Mqa(viewGroup4, c1597306Nf, 1));
                                }
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        SmartImageView smartImageView6 = this.LLJJJJJIL;
        if (smartImageView6 != null) {
            C337180DJs.LIZ(smartImageView6);
        }
        SmartImageView smartImageView7 = this.LLJJJJ;
        if (smartImageView7 == null) {
            return;
        }
        C337180DJs.LIZJ(smartImageView7);
        C547860LeC.LIZ.getClass();
        AIResourceService aIResourceServiceLJI = C547860LeC.LJI();
        C530500KrI c530500KrI = C529730Kq3.LIZIZ;
        String strLIZ = aIResourceServiceLJI.LIZ(c530500KrI);
        if (strLIZ != null && strLIZ.length() != 0) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLIZ));
            c1331670kl3LJII.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJII.LJJ(smartImageView7);
            C786410Ut5.h3(c1331670kl3LJII);
            return;
        }
        String str2 = C545870Laz.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitBackgroundScene -> default bg gecko not ready: ");
        sbLIZ.append(c530500KrI);
        C201955140j.LJIJ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.n3, viewGroup, false);
        this.LLJJJIL = viewGroup2;
        return viewGroup2;
    }
}
