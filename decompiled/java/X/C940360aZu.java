package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940360aZu {
    public final /* synthetic */ C940470aa5 LIZ;
    public final /* synthetic */ C945320ahu LIZIZ;

    public static final boolean LIZ(InterfaceC940430aa1 interfaceC940430aa1) {
        if (interfaceC940430aa1.version() != 16) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(C945320ahu c945320ahu) {
        SeiAppData seiAppData;
        String str;
        LinkMicSei linkMicSei = null;
        try {
            Gson gson = C19748512Ol.LIZIZ;
            if (c945320ahu != null) {
                str = c945320ahu.LIZIZ;
            } else {
                str = null;
            }
            linkMicSei = (LinkMicSei) gson.LJII(str, LinkMicSei.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC940380aZw interfaceC940380aZw = this.LIZ.LL;
        if (interfaceC940380aZw != null) {
            interfaceC940380aZw.LJJZZIII(linkMicSei);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C940470aa5 c940470aa5 = this.LIZ;
        if (jCurrentTimeMillis - c940470aa5.LLJIJIL > Mp4ScreenVideoLoadTimeout.CONTROL) {
            if (c940470aa5.LIZIZ() == 4 || ((seiAppData = c940470aa5.LLJILJIL) != null && seiAppData.LJIILL())) {
                c940470aa5.LIZ();
            }
            C914240Ztm.LIZ.getClass();
            C914240Ztm.LIZLLL();
            InterfaceC940230aZh interfaceC940230aZh = this.LIZ.LLJJJIL;
            if (interfaceC940230aZh != null) {
                interfaceC940230aZh.LIZ();
            }
        }
        C914830Zuj.LIZ.getClass();
    }

    public final void LIZJ(InterfaceC940430aa1 interfaceC940430aa1) {
        int i;
        Long lValueOf;
        if (LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable()) {
            this.LIZ.LLJJI = C969340bKe.LJFF(this.LIZIZ);
            C940490aa7 c940490aa7 = this.LIZ.LLILZLL;
            if (c940490aa7 != null) {
                lValueOf = Long.valueOf(c940490aa7.LIZ);
            } else {
                lValueOf = null;
            }
            C945320ahu c945320ahu = this.LIZIZ;
            if (lValueOf != null && lValueOf.longValue() != 0 && c945320ahu != null) {
                DataChannelGlobal.LLILZ.JQ2(C940460aa4.class, new Pair(lValueOf, c945320ahu));
            }
        }
        Map<String, Map<String, String>> mapLJFF = interfaceC940430aa1.LJFF();
        if (mapLJFF != null) {
            C939550aYb.LJ(interfaceC940430aa1.LIZIZ(), mapLJFF);
        }
        C940470aa5 c940470aa5 = this.LIZ;
        SeiDsl seiDslLJII = interfaceC940430aa1.LJII();
        if (seiDslLJII != null) {
            i = seiDslLJII.scene;
        } else {
            i = 0;
        }
        InterfaceC940380aZw interfaceC940380aZwLJIIJJI = c940470aa5.LJIIJJI(i, this.LIZ.LLILZ);
        if (interfaceC940380aZwLJIIJJI != null) {
            C940470aa5 c940470aa52 = this.LIZ;
            interfaceC940380aZwLJIIJJI.LLLLJI(interfaceC940430aa1);
            FrameLayout frameLayout = c940470aa52.LLIZLLLIL;
            if (frameLayout != null) {
                interfaceC940380aZwLJIIJJI.LLIIJI(frameLayout, c940470aa52.LLJJIJIL);
            }
        }
        C914240Ztm.LIZ.getClass();
        if (C914240Ztm.LJFF <= 0) {
            C914240Ztm.LJFF = System.currentTimeMillis();
        }
        InterfaceC940230aZh interfaceC940230aZh = this.LIZ.LLJJJIL;
        if (interfaceC940230aZh != null) {
            interfaceC940230aZh.LIZJ();
        }
        SeiAppData seiAppData = this.LIZ.LLJILJIL;
        if (seiAppData != null && seiAppData.LJIILLIIL()) {
            C914830Zuj c914830Zuj = C914830Zuj.LIZ;
            C940470aa5 c940470aa53 = this.LIZ;
            InterfaceC937900aVw interfaceC937900aVw = c940470aa53.LLIZ;
            C940490aa7 c940490aa72 = c940470aa53.LLILZLL;
            String strLIZIZ = interfaceC940430aa1.LIZIZ();
            c914830Zuj.getClass();
            C914830Zuj.LIZ(interfaceC937900aVw, c940490aa72, strLIZIZ, "live_voice");
        }
    }

    public final void LIZLLL(InterfaceC940430aa1 interfaceC940430aa1) {
        boolean z;
        boolean z2;
        boolean z3;
        SeiDsl seiDslLJII;
        SeiDsl seiDslLJII2;
        this.LIZ.LLJIJIL = System.currentTimeMillis();
        SeiAppData seiAppData = this.LIZ.LLJILJIL;
        boolean z4 = true;
        if (seiAppData != null && seiAppData.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (seiDslLJII2 = interfaceC940430aa1.LJII()) != null && seiDslLJII2.scene == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        SeiAppData seiAppData2 = this.LIZ.LLJILJIL;
        if (seiAppData2 != null && seiAppData2.LJIILL()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || (seiDslLJII = interfaceC940430aa1.LJII()) == null || seiDslLJII.scene != 4) {
            z4 = false;
        }
        if (z2 | z4) {
            InterfaceC940380aZw interfaceC940380aZw = this.LIZ.LL;
            if (interfaceC940380aZw != null) {
                interfaceC940380aZw.release();
            }
            this.LIZ.LL = null;
        }
        this.LIZ.LLJILJIL = interfaceC940430aa1.LIZ();
        if (interfaceC940430aa1.version() == 2) {
            C940470aa5 c940470aa5 = this.LIZ;
            if (c940470aa5.LIZIZ() == 4) {
                c940470aa5.LIZ();
                if (LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable()) {
                    c940470aa5.LLJJI = -1;
                }
            }
        }
    }

    public C940360aZu(C940470aa5 c940470aa5, C945320ahu c945320ahu) {
        this.LIZ = c940470aa5;
        this.LIZIZ = c945320ahu;
    }
}
