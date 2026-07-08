package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1398240mUQ extends C1398250mUR {
    public InterfaceC661560PxC LLLFZ;

    public final void J6() {
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.qe7);
        C786410Ut5.LJJJJI(viewGroup);
        C786410Ut5.LJLZ(8, viewGroup);
        InterfaceC661560PxC interfaceC661560PxC = this.LLLFZ;
        if (interfaceC661560PxC != null) {
            interfaceC661560PxC.LIZJ();
        }
        InterfaceC661560PxC interfaceC661560PxC2 = this.LLLFZ;
        if (interfaceC661560PxC2 != null) {
            interfaceC661560PxC2.onCleared();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @Override // X.InterfaceC1401180mZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLJZ
            r1 = 1
            if (r0 == 0) goto L7e
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r0)
            if (r0 != r1) goto L7e
            r0 = 1
        Lc:
            r2 = 0
            if (r0 == 0) goto L65
            X.0PxC r0 = r4.LLLFZ
            if (r0 == 0) goto L63
            int r0 = r0.getCurrentPosition()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L1b:
            java.lang.String r0 = X.C584710MwX.LIZJ
            int r0 = r0.length()
            if (r0 == 0) goto L33
            java.lang.String r1 = X.C584710MwX.LIZJ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.getAid()
        L2d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L44
        L33:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLJZ
            if (r0 == 0) goto L3d
            java.lang.String r1 = r0.getAid()
            if (r1 != 0) goto L3f
        L3d:
            java.lang.String r1 = ""
        L3f:
            java.lang.String r0 = "photo"
            X.C584710MwX.LIZIZ(r3, r1, r0)
        L44:
            X.0PxC r0 = r4.LLLFZ
            if (r0 == 0) goto L4b
            r0.LIZJ()
        L4b:
            android.view.View r0 = r4.itemView
            if (r0 == 0) goto L60
            X.0Q7z r1 = X.C1558360qeg.LJ(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility> r0 = com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility r0 = (com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility) r0
            if (r0 == 0) goto L60
            r0.CO1(r2)
        L60:
            return
        L61:
            r0 = r2
            goto L2d
        L63:
            r3 = r2
            goto L1b
        L65:
            r4.J6()
            android.view.View r0 = r4.itemView
            if (r0 == 0) goto L60
            X.0Q7z r1 = X.C1558360qeg.LJ(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility> r0 = com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility r0 = (com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility) r0
            if (r0 == 0) goto L60
            r0.CO1(r2)
            return
        L7e:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398240mUQ.onPause():void");
    }

    @Override // X.C1398250mUR, X.InterfaceC1401180mZA
    public void i2(int i) {
        View viewLJIILLIIL;
        Aweme aweme = this.LLJZ;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.qe7);
            C786410Ut5.LJLZ(0, viewGroup);
            InterfaceC661560PxC interfaceC661560PxC = this.LLLFZ;
            if (interfaceC661560PxC != null && (viewLJIILLIIL = interfaceC661560PxC.LJIILLIIL()) != null) {
                C786410Ut5.LJJJJI(viewGroup);
                viewGroup.addView(viewLJIILLIIL);
            }
            InterfaceC661560PxC interfaceC661560PxC2 = this.LLLFZ;
            if (interfaceC661560PxC2 != null) {
                interfaceC661560PxC2.LJIIIIZZ(Integer.valueOf(C584710MwX.LIZ(this.LL.getAid(), "photo")));
            }
            super.i2(i);
            return;
        }
        J6();
        super.i2(i);
    }

    @Override // X.C1398630mV3
    public final void q6(View view, InterfaceC1260110itd interfaceC1260110itd) {
        InterfaceC661560PxC interfaceC661560PxC = this.LLLFZ;
        if (interfaceC661560PxC != null) {
            C584710MwX.LIZIZ(Integer.valueOf(interfaceC661560PxC.getCurrentPosition()), this.LL.getAid(), "photo");
        }
        super.q6(view, interfaceC1260110itd);
    }

    public C1398240mUQ(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view, str, interfaceC1260110itd);
    }

    @Override // X.C1398250mUR
    public final void z6(Aweme aweme, int i, boolean z, Bundle bundle) {
        Aweme aweme2;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (aweme2 = this.LL) != null && aweme2.getAid() != null) {
            J6();
            super.z6(aweme, i, z, bundle);
            InterfaceC661560PxC interfaceC661560PxCLJIJJ = ((IPostModeService) ServiceManager.get().getService(IPostModeService.class)).LJIJJ((ViewGroup) this.itemView.findViewById(R.id.qe7), "single_song", EnumC671230QUn.BLACK, null, false, EnumC1781440wSU.NONE, null);
            this.LLLFZ = interfaceC661560PxCLJIJJ;
            if (interfaceC661560PxCLJIJJ != null) {
                interfaceC661560PxCLJIJJ.LJIIJJI(this.LL, null, null);
            }
            InterfaceC661560PxC interfaceC661560PxC = this.LLLFZ;
            if (interfaceC661560PxC != null) {
                interfaceC661560PxC.LJI(C584710MwX.LIZ(this.LL.getAid(), "photo"));
            }
            this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1402010maV(this, aweme, 2));
            return;
        }
        J6();
        super.z6(aweme, i, z, bundle);
    }
}
