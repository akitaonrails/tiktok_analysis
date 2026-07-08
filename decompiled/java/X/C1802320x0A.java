package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0x0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802320x0A implements InterfaceC1850580yG0 {
    public final SystemShareViewModel LIZ;
    public final List<Uri> LIZIZ;

    @Override // X.InterfaceC1850580yG0
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1850580yG0
    public final void LIZ() {
        C19EG c19eg;
        int i = C2187451AjH.LIZ;
        C1850540yFw.LIZ.getClass();
        C1850540yFw.LIZIZ("click_video");
        List<Uri> list = this.LIZIZ;
        if (list == null || list.size() <= 35) {
            LJ(this.LIZ.vQ2(), false);
            return;
        }
        C1B4F c1b4f = C1B4F.LJJIII;
        WeakReference<C19EG> weakReferenceVQ2 = this.LIZ.vQ2();
        if (weakReferenceVQ2 != null && (c19eg = weakReferenceVQ2.get()) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(c19eg.getString(2131824832));
            c1397580mTM.LIZIZ(C786410Ut5.j4(c19eg.getString(2131824828), Arrays.copyOf(new Object[]{"35"}, 1)));
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(c19eg, 181));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        C1850540yFw.LIZ(c1b4f);
    }

    @Override // X.InterfaceC1850580yG0
    public final void LIZIZ() {
        C19EG c19eg;
        C1850540yFw.LIZ.getClass();
        C1850540yFw.LIZIZ("click_message");
        List<Uri> list = this.LIZIZ;
        if ((list != null ? list.size() : 0) <= 9) {
            LJ(this.LIZ.vQ2(), true);
            return;
        }
        C1B4F c1b4f = C1B4F.LJJIIJ;
        WeakReference<C19EG> weakReferenceVQ2 = this.LIZ.vQ2();
        if (weakReferenceVQ2 != null && (c19eg = weakReferenceVQ2.get()) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(c19eg.getString(2131824832));
            c1397580mTM.LIZIZ(C786410Ut5.j4(c19eg.getString(2131824829), Arrays.copyOf(new Object[]{"9"}, 1)));
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(c19eg, 179));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        C1850540yFw.LIZ(c1b4f);
    }

    @Override // X.InterfaceC1850580yG0
    public final void LIZJ() {
        C19EG c19eg;
        C1850540yFw.LIZ.getClass();
        C1850540yFw.LIZIZ("click_photo");
        List<Uri> list = this.LIZIZ;
        if (list == null || list.size() <= 35) {
            this.LIZ.wQ2();
            return;
        }
        C1B4F c1b4f = C1B4F.LJJIII;
        WeakReference<C19EG> weakReferenceVQ2 = this.LIZ.vQ2();
        if (weakReferenceVQ2 != null && (c19eg = weakReferenceVQ2.get()) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(c19eg.getString(2131824832));
            c1397580mTM.LIZIZ(C786410Ut5.j4(c19eg.getString(2131824828), Arrays.copyOf(new Object[]{"35"}, 1)));
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(c19eg, 180));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        C1850540yFw.LIZ(c1b4f);
    }

    public C1802320x0A(SystemShareViewModel systemShareViewModel, List list) {
        this.LIZ = systemShareViewModel;
        this.LIZIZ = list;
    }

    public final void LJ(WeakReference<C19EG> weakReference, boolean z) {
        C19EG c19eg = weakReference.get();
        if (c19eg != null) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(c19eg, "system_share", true)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1802310x09(this, c19eg, z, weakReference, null), 3);
                return;
            }
            C1850540yFw c1850540yFw = C1850540yFw.LIZ;
            C1B4F c1b4f = C1B4F.LJJIFFI;
            c1850540yFw.getClass();
            C1850540yFw.LIZ(c1b4f);
        }
    }
}
