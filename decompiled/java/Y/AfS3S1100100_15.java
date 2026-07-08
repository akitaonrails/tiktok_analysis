package Y;

import X.AbstractC922600a7G;
import X.C01EX;
import X.C09JN;
import X.C19487111Lx;
import X.C1C7U;
import X.C20441214yg;
import X.C501540Jlg;
import X.C916750Zxp;
import X.C917840Zza;
import X.C921520a5W;
import X.C924630aAX;
import X.C930540aK4;
import X.C938120aWI;
import X.C939000aXi;
import X.C946850akN;
import X.C953100auS;
import X.C953230auf;
import X.C953770avX;
import X.C963140bAe;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.EnumC953330aup;
import X.InterfaceC2280191EMv;
import X.InterfaceC919320a1y;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public class AfS3S1100100_15 implements C09JN {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S1100100_15 afS3S1100100_15, Object obj) {
        EnumC953330aup enumC953330aup;
        int i;
        EnumC953330aup enumC953330aup2;
        boolean z;
        C1C7U.LIZ("TemplateManager@b4e9.useTemplate$3");
        C953770avX c953770avX = (C953770avX) obj;
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", "useTemplate doOnSuccess");
        C953100auS c953100auS = (C953100auS) afS3S1100100_15.l1;
        if (c953100auS != null) {
            long j = afS3S1100100_15.j2;
            String str = afS3S1100100_15.s0;
            InterfaceC2280191EMv<String, String, EnumC937290aUx, EnumC953330aup, String, C917840Zza, EnumC952890au7, String, C916750Zxp, Unit> interfaceC2280191EMv = c953100auS.LJFF;
            String str2 = c953770avX.LJ;
            String str3 = c953770avX.LJII;
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = c953100auS.LIZJ;
            multiCanvasUtils.getClass();
            EnumC937290aUx enumC937290aUxLJIIJJI = MultiCanvasUtils.LJIIJJI(enumC952890au7);
            if (c953770avX.LJFF) {
                enumC953330aup = EnumC953330aup.COLOR;
            } else {
                enumC953330aup = EnumC953330aup.PHOTO;
            }
            String str4 = c953770avX.LJIIIZ;
            EnumC952890au7 enumC952890au72 = c953100auS.LIZJ;
            String strLIZIZ = c953770avX.LIZIZ();
            C953230auf.LIZ.getClass();
            if (C953230auf.LJIIJJI()) {
                i = 0;
            } else {
                i = 2;
            }
            interfaceC2280191EMv.os(str2, str3, enumC937290aUxLJIIJJI, enumC953330aup, str4, null, enumC952890au72, strLIZIZ, new C916750Zxp(i, j, c953770avX.LJII));
            EnumC937290aUx enumC937290aUxLJIIJJI2 = MultiCanvasUtils.LJIIJJI(c953100auS.LIZJ);
            if (c953770avX.LJFF) {
                enumC953330aup2 = EnumC953330aup.COLOR;
            } else {
                enumC953330aup2 = EnumC953330aup.PHOTO;
            }
            if (c953770avX.LJIIIZ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            C946850akN.LIZLLL(enumC937290aUxLJIIJJI2, enumC953330aup2, z, true, String.valueOf(j), str, "in_spots", "", "", "");
        }
        C1C7U.LIZIZ("TemplateManager@b4e9.useTemplate$3");
    }

    public static final void accept$1(AfS3S1100100_15 afS3S1100100_15, Object obj) {
        Context context;
        C1C7U.LIZ("MultiGuestV3AnchorPresenter@b85a.updateAnchorPanelSettings$3");
        Throwable th = (Throwable) obj;
        C01EX.LIZIZ(th, "update_setting", afS3S1100100_15.s0, C963140bAe.LIZIZ() - afS3S1100100_15.j2);
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) ((C921520a5W) afS3S1100100_15.l1).mView;
        if (interfaceC919320a1y != null) {
            context = interfaceC919320a1y.getContext();
        } else {
            context = null;
        }
        C501540Jlg.LIZLLL(context, th, 2131851936);
        C1C7U.LIZIZ("MultiGuestV3AnchorPresenter@b85a.updateAnchorPanelSettings$3");
    }

    public static final void accept$2(AfS3S1100100_15 afS3S1100100_15, Object obj) {
        C1C7U.LIZ("AbsBusinessUserManager@e649.fetchUserList$disposable$3");
        Throwable th = (Throwable) obj;
        C01EX.LIZIZ(th, "list_by_type", null, C963140bAe.LIZIZ() - afS3S1100100_15.j2);
        ((AbstractC922600a7G) afS3S1100100_15.l1).LJJJJ(th);
        C924630aAX.LJJIJIL(th, C930540aK4.LIZJ());
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) afS3S1100100_15.l1;
        abstractC922600a7G.LLILZIL = null;
        abstractC922600a7G.LLILZLL.remove(afS3S1100100_15.s0);
        C1C7U.LIZIZ("AbsBusinessUserManager@e649.fetchUserList$disposable$3");
    }

    public static final void accept$3(AfS3S1100100_15 afS3S1100100_15, Object obj) {
        C1C7U.LIZ("MultiGuestAigcWallpaperUtil@bee3.startAigcPlayCountDown$1");
        Long l = (Long) obj;
        String str = afS3S1100100_15.s0;
        if (str != null) {
            ((DataChannel) afS3S1100100_15.l1).LC0(AigcWallpaperCountDownEvent.class, new C938120aWI(300L, afS3S1100100_15.j2 - l.longValue(), str));
        }
        long j = afS3S1100100_15.j2;
        if (l != null && l.longValue() == j) {
            C939000aXi.LIZ.getClass();
            C19487111Lx c19487111Lx = C939000aXi.LIZJ;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            C939000aXi.LIZJ = null;
        }
        C1C7U.LIZIZ("MultiGuestAigcWallpaperUtil@bee3.startAigcPlayCountDown$1");
    }

    public AfS3S1100100_15(long j, Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.l1 = obj;
    }
}
