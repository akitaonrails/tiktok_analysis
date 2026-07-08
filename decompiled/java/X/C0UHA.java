package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFixUpdateLiveStreamErrorABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFixUpdateLiveStreamErrorVABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorStreamJankABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FixCameraCaptureLeakABSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UHA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHA extends C0UH4 implements C0UHF, InterfaceC775290Ub9, InterfaceC1272600jDm, C0UHL, C0UHD, C0UHH {
    public C0UGO LLILZIL;
    public C0UHL LLILZLL;
    public InterfaceC769940UIe LLIZ;
    public View LLIZLLLIL;
    public InterfaceC1268640j7O LLJ;
    public boolean LLJI;
    public C769570UGt LLJILJIL;
    public C0UX8 LLJILJILJ;
    public boolean LLJILLL;
    public C443120HZe<Integer, Integer, String> LLJJ;
    public int LLJIJIL = 1;
    public boolean LLJJI = true;
    public boolean LLJJIII = true;

    @Override // X.InterfaceC1266820j4S
    public final /* synthetic */ void LIZJ(Map map) {
    }

    @Override // X.InterfaceC1266820j4S
    public final /* synthetic */ void onInfo(int i, int i2, String str) {
    }

    @Override // X.InterfaceC770050UIp
    public final void LIZ() {
        C20441214yg.LIZIZ("CameraCapture3", "startVideoCapture");
        this.LLIZ.z3(CertProviderManagerKt.findCert("bpea-355", 1476788233));
        C0UHC.LIZ("capture_video");
        this.LLJJIII = false;
    }

    @Override // X.C0UH4
    public final EffectImageInfo LJ() {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJ;
        if (interfaceC1268640j7O == null) {
            return null;
        }
        return interfaceC1268640j7O.getEffectCapturedImagewithKey("navi_capture");
    }

    public final void LJIIJJI() {
        int iLJJII;
        if (this.LLIZ.getLiveCore() == null || this.LLIZ.getLiveCore().LLD() == null || (iLJJII = this.LLIZ.getLiveCore().LLD().LJJII()) == 5) {
            return;
        }
        this.LLJIJIL = iLJJII;
    }

    @Override // X.InterfaceC770050UIp
    public final int LIZIZ(String str) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJ;
        if (interfaceC1268640j7O == null) {
            return 0;
        }
        return interfaceC1268640j7O.composerRemoveNodes(new String[]{str}, 1);
    }

    @Override // X.C0UH4
    public final synchronized void LJI(InterfaceC769170UFf interfaceC769170UFf) {
        InterfaceC769940UIe interfaceC769940UIe;
        super.LJI(interfaceC769170UFf);
        if (interfaceC769170UFf == null && (interfaceC769940UIe = this.LLIZ) != null) {
            interfaceC769940UIe.y3(this);
        }
    }

    public final void LJIIJ(Cert cert) {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        this.LLIZ.r3(cert);
    }

    @Override // X.InterfaceC770050UIp
    public final void LJIILLIIL(final AwS591S0100000_12 awS591S0100000_12) {
        LJI(new InterfaceC769170UFf() { // from class: X.0UHB
            public final /* synthetic */ boolean LIZJ = true;

            @Override // X.InterfaceC769170UFf
            public final void LIZ(int i, int i2) {
                C0UHA c0uha = this.LIZ;
                Function1 function1 = awS591S0100000_12;
                boolean z = this.LIZJ;
                c0uha.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setExternalFirstFrameListener: ");
                sbLIZ.append(c0uha.LLJJI);
                C20441214yg.LIZIZ("CameraCapture3:", C2188811AlT.LIZIZ(sbLIZ));
                if (c0uha.LLJJI) {
                    function1.invoke(Unit.LIZ);
                    c0uha.LLJJI = false;
                    if (z) {
                        c0uha.LJI(null);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC770050UIp
    public final void LJIIZILJ(Cert cert) {
        this.LLILLL = null;
        InterfaceC769940UIe interfaceC769940UIe = this.LLIZ;
        if (interfaceC769940UIe != null) {
            interfaceC769940UIe.Q3(cert);
        }
        C0UHC.LIZ("release_video");
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.LJJLJ(null);
            this.LLJ.LLIIIILZ(null);
        }
        if (FixCameraCaptureLeakABSetting.INSTANCE.enable()) {
            List<InterfaceC1272550jDh> list = this.LL;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            this.LLILZIL = null;
        }
        this.LLJJIII = true;
    }

    @Override // X.InterfaceC1272550jDh
    public final void onFaceDetectResultCallback(int i) {
        List<InterfaceC1272550jDh> list = this.LL;
        if (list == null) {
            return;
        }
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            ((InterfaceC1272550jDh) ListProtector.get(this.LL, size)).onFaceDetectResultCallback(i);
        }
    }

    @Override // X.InterfaceC770050UIp
    public final int setEffect(String str) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJ;
        if (interfaceC1268640j7O == null) {
            return 0;
        }
        return interfaceC1268640j7O.composerAppendNodes(new String[]{str}, 1);
    }

    public final void LJIIIIZZ(C0UGM c0ugm, boolean z) {
        C0UGO c0ugo;
        C0UGO c0ugo2;
        this.LLILZIL = c0ugm;
        Boolean bool = Boolean.TRUE;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if ((bool.equals(dataChannelGlobal.gg0(RestartLiveChannel.class)) || C776270Ucj.LJIIJJI) && (c0ugo = this.LLILZIL) != null) {
            c0ugo.onInfo(1, 0, 0, "");
            return;
        }
        if (z && dataChannelGlobal.gg0(C930610aKB.class) != null) {
            this.LLJJ = (C443120HZe) dataChannelGlobal.gg0(C930610aKB.class);
            dataChannelGlobal.IQ2(C930610aKB.class);
        }
        C443120HZe<Integer, Integer, String> c443120HZe = this.LLJJ;
        if (c443120HZe != null && z && (c0ugo2 = this.LLILZIL) != null) {
            c0ugo2.onInfo(1, c443120HZe.getFirst().intValue(), this.LLJJ.getSecond().intValue(), this.LLJJ.getThird());
        }
    }

    @Override // X.InterfaceC770050UIp
    public final void LJIILIIL(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchCamera: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("CameraCapture3", C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI();
        if (z) {
            if (LiveBroadcastHostUseTTLH.getEnable()) {
                this.LLIZ.z3(cert);
                return;
            } else {
                this.LLIZ.L3(this.LLJIJIL, cert);
                return;
            }
        }
        if (LiveBroadcastHostUseTTLH.getEnable()) {
            this.LLIZ.Q3(cert);
        } else {
            this.LLIZ.L3(5, cert);
        }
    }

    @Override // X.InterfaceC1266820j4S
    public final void LIZLLL(int i, int i2, int i3) {
        if (i == 5) {
            this.LLJI = false;
        }
        C0UHL c0uhl = this.LLILZLL;
        if (c0uhl != null) {
            c0uhl.LIZLLL(i, i2, i3);
        }
    }

    public final void LJII(View view, InterfaceC769940UIe interfaceC769940UIe, boolean z) {
        InterfaceC769940UIe interfaceC769940UIe2;
        this.LLJJI = true;
        this.LLIZLLLIL = view;
        this.LLIZ = interfaceC769940UIe;
        interfaceC769940UIe.setDisplayView(view);
        this.LLIZ.LJIJI(this);
        if (AnchorFixUpdateLiveStreamErrorABSetting.INSTANCE.enable()) {
            C557050Lt1 c557050Lt1 = C0UHK.LIZJ;
            if (c557050Lt1.LIZIZ()) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C786410Ut5.LJLLLLLL(8, view);
                } else if (AnchorFixUpdateLiveStreamErrorVABSetting.INSTANCE.enable()) {
                    HandlerHook.viewPost(view, new ARunnableS103S0100000_3(view, 13));
                }
                c557050Lt1.LIZJ(false);
            }
        }
        this.LLIZ.LJIILJJIL(this);
        this.LLIZ.LJFF(this);
        if (AnchorStreamJankABSetting.enableNormalRoom() && (interfaceC769940UIe2 = this.LLIZ) != null && interfaceC769940UIe2.getLiveCore() != null) {
            this.LLIZ.getLiveCore().LLLILZJ(this);
        }
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLIZ.LJIIL();
        this.LLJ = interfaceC1268640j7OLJIIL;
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.enable(true);
            this.LLJ.LJJLJ(this);
            this.LLJ.LLIIIILZ(this);
        }
        if (z) {
            LIZ();
        }
        if (InterfaceC772190UQv.c3.LIZ().intValue() == 0) {
            this.LLJIJIL = 2;
        } else {
            this.LLJIJIL = 1;
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC775300UbA
    public final void V3(int i, int i2, Exception exc) {
        C0UGO c0ugo = this.LLILZIL;
        if (c0ugo != null) {
            c0ugo.onError(i, i2);
        }
    }

    public C0UHA(SurfaceView surfaceView, InterfaceC769940UIe interfaceC769940UIe, boolean z, boolean z2) {
        LJII(surfaceView, interfaceC769940UIe, z);
    }

    @Override // X.C0UH4
    public final int LJFF(int i, int i2, int i3, String str) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJ;
        if (interfaceC1268640j7O != null) {
            return interfaceC1268640j7O.sendEffectMsg(i, i2, i3, str);
        }
        return 0;
    }

    @Override // X.C0UHL
    public final void LLLZ(String str, String str2, Map<String, Object> map, C0U8C c0u8c) {
        C774610Ua3.LL.LLLZ(str, str2, map, c0u8c);
    }

    @Override // X.InterfaceC1272540jDg
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 2139095041) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessageReceived MSG_TYPE_EFFECT_INITED ");
            sbLIZ.append(hashCode());
            C20441214yg.LIZIZ("CameraCapture3", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJJ = new C443120HZe<>(Integer.valueOf(i2), Integer.valueOf(i3), str);
            Boolean bool = Boolean.TRUE;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (bool.equals(dataChannelGlobal.gg0(C930850aKZ.class))) {
                dataChannelGlobal.JQ2(C930610aKB.class, this.LLJJ);
            }
        }
        if (this.LLJILJILJ == C0UX8.EVENT_PAGE_BROADCAST_PREVIEW && this.LLJILLL) {
            Iterator<C0UHE> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().onMessageReceived(i, i2, i3, str);
            }
            return;
        }
        if (i == 2139095041) {
            C0UGO c0ugo = this.LLILZIL;
            if (c0ugo != null) {
                c0ugo.onInfo(1, i2, i3, str);
                return;
            }
            return;
        }
        if (i == 32) {
            C0UGO c0ugo2 = this.LLILZIL;
            if (c0ugo2 == null) {
                return;
            }
            c0ugo2.onInfo(2, i2, i3, str);
            return;
        }
        if (i == 112) {
            LJFF(112, 2, 1, "");
            return;
        }
        Iterator<C0UHE> it3 = this.LLILLJJLI.iterator();
        while (it3.hasNext()) {
            it3.next().onMessageReceived(i, i2, i3, str);
        }
    }

    public C0UHA(SurfaceView surfaceView, InterfaceC769940UIe interfaceC769940UIe, boolean z, boolean z2, boolean z3) {
        this.LLJILLL = z3;
        LJII(surfaceView, interfaceC769940UIe, z);
    }

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        DataChannelGlobal.LLILZ.JQ2(C931410aLT.class, new Object() { // from class: X.0UHG
        });
        InterfaceC769170UFf interfaceC769170UFf = this.LLILLL;
        if (interfaceC769170UFf != null) {
            interfaceC769170UFf.LIZ(i2, i3);
        }
        C0UHD c0uhd = this.LLILZ;
        if (c0uhd != null) {
            c0uhd.u(eGLContext, i, z, i2, i3, j, fArr, objArr);
        }
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        u(eGLContext, i, z, i2, i3, j, fArr, objArr);
    }
}
