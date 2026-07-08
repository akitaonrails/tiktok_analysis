package X;

import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384100F4e {
    public final Function0<C1DRG> LIZ;
    public final Function0<Scene> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1322));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1317));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1319));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1321));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1318));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1320));
    public Dialog LJIIIZ;
    public EnumC384110F4f LJIIJ;

    public final void LIZ() {
        NLEModel nLEModelLLZ;
        VideoPublishEditModel videoPublishEditModelLIZIZ;
        String value;
        InterfaceC1455610nyx interfaceC1455610nyx;
        C0EYP c0eyp;
        LiveData<Boolean> liveDataHB;
        C1653260t7k.LIZ("click_edit_filter_entrance");
        InterfaceC1446740nke interfaceC1446740nkeLIZJ = LIZJ();
        if (interfaceC1446740nkeLIZJ == null || (nLEModelLLZ = interfaceC1446740nkeLIZJ.LLZ()) == null || (videoPublishEditModelLIZIZ = LIZIZ()) == null) {
            return;
        }
        boolean z = false;
        if (!C351220Dpo.LLL(nLEModelLLZ)) {
            LJFF();
        } else if (videoPublishEditModelLIZIZ.getAILivePhotoModel().LJII()) {
            C564860MDk.LJ((Context) this.LJ.getValue(), "filter", new AwS406S0200000_5(this, videoPublishEditModelLIZIZ, 142));
        } else {
            InterfaceC1446740nke interfaceC1446740nkeLIZJ2 = LIZJ();
            if ((interfaceC1446740nkeLIZJ2 == null || !C0EYU.LIZJ(interfaceC1446740nkeLIZJ2.g().getValue(), videoPublishEditModelLIZIZ)) && u4.LJLJJI(videoPublishEditModelLIZIZ) && C349760DnS.LIZ(videoPublishEditModelLIZIZ, nLEModelLLZ) && ((interfaceC1455610nyx = (InterfaceC1455610nyx) this.LJIIIIZZ.getValue()) == null || (liveDataHB = interfaceC1455610nyx.hB(15)) == null || !Intrinsics.LJFF(liveDataHB.getValue(), Boolean.FALSE))) {
                EnumC359990E9l enumC359990E9l = EnumC359990E9l.OPEN_FILTER_PANEL_FROM_FILTER_ICON;
                value = enumC359990E9l.getValue();
                Function0<Unit> function0 = this.LIZJ;
                if (function0 != null) {
                    function0.invoke();
                }
                Scene sceneInvoke = this.LIZIZ.invoke();
                if (sceneInvoke != null && (c0eyp = (C0EYP) this.LJI.getValue()) != null) {
                    c0eyp.Dy0(sceneInvoke, new C0EZH(null, false, false, false, false, true, false, false, enumC359990E9l, false, false, false, null, false, false, 64991));
                }
                z = true;
                C1402610mbT.LJJII(videoPublishEditModelLIZIZ, value, z, 2);
            }
            LJ();
        }
        value = "edit_page";
        C1402610mbT.LJJII(videoPublishEditModelLIZIZ, value, z, 2);
    }

    public final InterfaceC1446740nke LIZJ() {
        return (InterfaceC1446740nke) this.LJFF.getValue();
    }

    public final C1DRG LIZLLL() {
        return (C1DRG) this.LIZLLL.getValue();
    }

    public final void LJ() {
        VideoPublishEditModel videoPublishEditModelLIZIZ;
        Context context = (Context) this.LJ.getValue();
        if (context == null || (videoPublishEditModelLIZIZ = LIZIZ()) == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131833338);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, videoPublishEditModelLIZIZ, 282));
        new C1397510mTF(c1397580mTM).LJ();
        C362710EJx.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C362710EJx.LIZLLL(videoPublishEditModelLIZIZ, linkedHashMap);
        C20684815ws.LJIILLIIL("ep_filter_remove_window_show", linkedHashMap);
    }

    public final void LJFF() {
        InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) this.LJII.getValue();
        if (interfaceC1453430nvR != null) {
            interfaceC1453430nvR.dr2(true, false);
        }
        InterfaceC1446740nke interfaceC1446740nkeLIZJ = LIZJ();
        if (interfaceC1446740nkeLIZJ != null) {
            C1456140nzo.LIZIZ(interfaceC1446740nkeLIZJ, false, false, false, false, 12);
        }
    }

    public final VideoPublishEditModel LIZIZ() {
        C1DRG c1drgLIZLLL = LIZLLL();
        if (c1drgLIZLLL != null) {
            return (VideoPublishEditModel) c1drgLIZLLL.LJIIL(null, VideoPublishEditModel.class);
        }
        return null;
    }

    public C384100F4e(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = awS549S0100000_52;
        this.LIZJ = awS549S0100000_53;
    }
}
