package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableDynamicGLVersionSettings;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectAudioGraphSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDetailGLSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: X.0UJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770160UJa implements C0UG9 {
    public final InterfaceC1268640j7O LIZ;
    public final String LIZIZ;

    @Override // X.C0UG9
    public final void LJFF() {
        LJ("notifyKeyboardHide", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.notifyKeyboardHide(true);
        }
    }

    @Override // X.C0UG9
    public final String[] LJIIJ() {
        return null;
    }

    @Override // X.C0UG9
    public final void LJJLIIIJJI() {
    }

    @Override // X.C0UG9
    public final String LIZLLL() {
        if (this.LIZ != null && TTLHEnableDynamicGLVersionSettings.INSTANCE.value()) {
            try {
                if (LiveEffectDetailGLSwitch.INSTANCE.enable()) {
                    return String.valueOf(GLThreadManager.getDetailedGLVersion());
                }
                int[] eGLVersion = GLThreadManager.getEGLVersion();
                if (eGLVersion.length < 2) {
                    return "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(eGLVersion[0]);
                sbLIZ.append('.');
                sbLIZ.append(eGLVersion[1]);
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("StickerEffectAdaptiveManager", "wrong gl version");
            }
        }
        return "";
    }

    @Override // X.C0UG9
    public final C0UD1 createEffectTrack() {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            return interfaceC1268640j7O.createEffectTrack();
        }
        return null;
    }

    @Override // X.C0UG9
    public final void hide() {
        LJ("hide", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.setEffect(null, false);
        }
    }

    @Override // X.C0UG9
    public final String ok() {
        String strLLFZ;
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        return (interfaceC1268640j7O == null || (strLLFZ = interfaceC1268640j7O.LLFZ()) == null) ? "" : strLLFZ;
    }

    @Override // X.C0UG9
    public final void LIZ(C0UD1 c0ud1) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.LIZ(c0ud1);
        }
    }

    @Override // X.C0UG9
    public final void LJII(String[] strArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nodePaths: ");
        sbLIZ.append((String) C13LQ.LJJIFFI(strArr));
        LJ("composerRemoveNodes", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerRemoveNodes(strArr, strArr.length);
        }
    }

    @Override // X.C0UG9
    public final void LJIJI(String[] strArr) {
        LJ("composerSetNodes", strArr.toString());
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerSetNodes(strArr, strArr.length);
        }
    }

    @Override // X.C0UG9
    public final void enableMockFace(boolean z) {
        LJ("enableMockFace", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.enableMockFace(z);
        }
    }

    public C770160UJa(InterfaceC1268640j7O interfaceC1268640j7O, String str) {
        this.LIZ = interfaceC1268640j7O;
        this.LIZIZ = str;
    }

    @Override // X.C0UG9
    public final void LIZIZ(String str, boolean z) {
        LJ("show", null);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (new C0VSJ(str).exists()) {
                    InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
                    if (interfaceC1268640j7O != null) {
                        interfaceC1268640j7O.setEffect(str, z);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Filter file not exists:");
                sbLIZ.append(str);
                throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ));
            }
            throw new FileNotFoundException("Filter file is empty");
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI(this.LIZIZ, e);
        }
    }

    public final void LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("][");
        sbLIZ.append(str);
        sbLIZ.append("]: ");
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("composer_handler", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0UG9
    public final void LJIILIIL(String[] strArr, String[] strArr2) {
        LJ("composerAddNodesWithExtra", strArr.toString());
        C20441214yg.LIZIZ("composerAddNodesWithExtra", strArr.toString());
        for (String str : strArr) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LIZLLL(str);
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
        }
    }

    @Override // X.C0UG9
    public final void LJIILJJIL(String[] strArr, String[] strArr2) {
        LJ("composerSetNodesWithExtra(useOutput)", strArr.toString());
        if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Set: inMic: ");
            sbLIZ.append(true);
            sbLIZ.append(", inMusic: ");
            sbLIZ.append(false);
            sbLIZ.append(", output: ");
            sbLIZ.append(false);
            C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.setEffectAudioGraphCfg(true, false, false);
            }
            InterfaceC1268640j7O interfaceC1268640j7O2 = this.LIZ;
            if (interfaceC1268640j7O2 != null) {
                interfaceC1268640j7O2.composerSetNodesWithTags(strArr, strArr.length, strArr2);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O3 = this.LIZ;
        if (interfaceC1268640j7O3 == null) {
            return;
        }
        interfaceC1268640j7O3.mo48composerSetNodesWithTags(strArr, strArr.length, strArr2);
    }

    @Override // X.C0UG9
    public final void LJIJ(String[] strArr, String[] strArr2) {
        LJ("composerSetNodesWithExtra", strArr.toString());
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerSetNodesWithTags(strArr, strArr.length, strArr2);
        }
    }

    @Override // X.C0UG9
    public final boolean LJIJJLI(String[] strArr, String[] strArr2) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null && interfaceC1268640j7O.composerPreloadNodesWithTags(strArr, strArr.length, strArr2) >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0UG9
    public final int LJJZ(String str, String str2) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            return interfaceC1268640j7O.setCustomEffect(str, str2);
        }
        return 0;
    }

    @Override // X.C0UG9
    public final void setRenderCacheString(String str, String str2) {
        LJ("setRenderCacheString", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.setRenderCacheString(str, str2);
        }
    }

    @Override // X.C0UG9
    public final void LJI(String[] strArr, String[] strArr2, float[] fArr) {
        LJ("composerUpdateMultipleNodes", strArr.toString());
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerUpdateMultipleNodes(strArr.length, strArr, strArr2, fArr);
        }
    }

    @Override // X.C0UG9
    public final void LJIIZILJ(float f, String str, String str2) {
        LJ("composerUpdateNode", String.valueOf(str));
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerUpdateNode(str, str2, f);
        }
    }

    @Override // X.C0UG9
    public final void LJIJJ(String[] strArr, String[] strArr2, String[] strArr3) {
        LJ("composerReplaceNodesWithTags", strArr2.toString());
        C20441214yg.LIZIZ("composerReplaceNodesWithTags", strArr2.toString());
        for (String str : strArr2) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LIZLLL(str);
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerReplaceNodesWithTags(strArr, strArr.length, strArr2, strArr2.length, strArr3);
        }
    }

    @Override // X.C0UG9
    public final void composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        LJ("composerCheckNodeExclusion", str);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.composerCheckNodeExclusion(str, str2, iArr);
        }
    }

    @Override // X.C0UG9
    public final void LIZJ(int i, int i2, String str, String str2) {
        LJ("setInputText", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.setInputText(str, i, i2, str2);
        }
    }

    @Override // X.C0UG9
    public final void LJIILL(String[] strArr, boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nodePaths: ");
        sbLIZ.append((String) C13LQ.LJJIFFI(strArr));
        LJ("composerRemoveNodes", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Remove: inMic: ");
            sbLIZ2.append(z);
            sbLIZ2.append(", inMusic: ");
            sbLIZ2.append(z2);
            sbLIZ2.append(", output: ");
            sbLIZ2.append(z3);
            C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.setEffectAudioGraphCfg(z, z2, z3);
            }
            InterfaceC1268640j7O interfaceC1268640j7O2 = this.LIZ;
            if (interfaceC1268640j7O2 != null) {
                interfaceC1268640j7O2.composerRemoveNodes(strArr, strArr.length);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O3 = this.LIZ;
        if (interfaceC1268640j7O3 == null) {
            return;
        }
        interfaceC1268640j7O3.composerRemoveNodes(strArr, strArr.length);
    }

    @Override // X.C0UG9
    public final void sendEffectMsg(int i, int i2, int i3, String str) {
        LJ("sendEffectMsg", null);
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.sendEffectMsg(i, i2, i3, str);
        }
    }

    @Override // X.C0UG9
    public final void LJIIIIZZ(String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3) {
        LJ("composerAddNodesWithExtra(useOutput)", strArr.toString());
        C20441214yg.LIZIZ("composerAddNodesWithExtra(useOutput)", strArr.toString());
        for (String str : strArr) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LIZLLL(str);
        }
        if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Add: inMic: ");
            sbLIZ.append(z);
            sbLIZ.append(", inMusic: ");
            sbLIZ.append(z2);
            sbLIZ.append(", output: ");
            sbLIZ.append(z3);
            C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.setEffectAudioGraphCfg(z, z2, z3);
            }
            InterfaceC1268640j7O interfaceC1268640j7O2 = this.LIZ;
            if (interfaceC1268640j7O2 != null) {
                interfaceC1268640j7O2.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O3 = this.LIZ;
        if (interfaceC1268640j7O3 == null) {
            return;
        }
        interfaceC1268640j7O3.LJJJIL(strArr, strArr.length, strArr2, z, z2, z3);
    }

    @Override // X.C0UG9
    public final void LJIILLIIL(String[] strArr, String[] strArr2, String[] strArr3, boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oldNodePaths: ");
        sbLIZ.append((String) C13LQ.LJJIFFI(strArr));
        sbLIZ.append(", newNodePaths: ");
        sbLIZ.append((String) C13LQ.LJJIFFI(strArr2));
        sbLIZ.append(", newTags: ");
        sbLIZ.append((String) C13LQ.LJJIFFI(strArr3));
        LJ("composerReplaceNodesWithTags", C2188811AlT.LIZIZ(sbLIZ));
        for (String str : strArr2) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LIZLLL(str);
        }
        if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Replace: inMic: ");
            sbLIZ2.append(z);
            sbLIZ2.append(", inMusic: ");
            sbLIZ2.append(z2);
            sbLIZ2.append(", output: ");
            sbLIZ2.append(z3);
            C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.setEffectAudioGraphCfg(z, z2, z3);
            }
            InterfaceC1268640j7O interfaceC1268640j7O2 = this.LIZ;
            if (interfaceC1268640j7O2 != null) {
                interfaceC1268640j7O2.composerReplaceNodesWithTags(strArr, strArr.length, strArr2, strArr2.length, strArr3);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O3 = this.LIZ;
        if (interfaceC1268640j7O3 == null) {
            return;
        }
        interfaceC1268640j7O3.LJJJLZIJ(strArr, strArr.length, strArr2, strArr2.length, strArr3, z, z2, z3);
    }
}
