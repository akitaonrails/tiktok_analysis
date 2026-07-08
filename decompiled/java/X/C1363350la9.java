package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;

/* JADX INFO: renamed from: X.0la9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363350la9 {
    public static SharePanelViewModel LIZ(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, List list, boolean z, boolean z2, boolean z3, InterfaceC1363370laB interfaceC1363370laB, LifecycleOwner lifecycleOwner, C1362230lYL c1362230lYL, boolean z4, boolean z5, InterfaceC1363760lao interfaceC1363760lao, C1371590lnR c1371590lnR, EnumC1364450lbv enumC1364450lbv, int i) {
        EnumC1364450lbv enumC1364450lbv2 = enumC1364450lbv;
        C1371590lnR c1371590lnR2 = c1371590lnR;
        InterfaceC1363760lao interfaceC1363760lao2 = interfaceC1363760lao;
        boolean z6 = z5;
        boolean z7 = z4;
        InterfaceC1363370laB interfaceC1363370laB2 = interfaceC1363370laB;
        boolean z8 = z3;
        boolean z9 = z2;
        C1362230lYL c1362230lYL2 = c1362230lYL;
        boolean z10 = z;
        boolean z11 = false;
        if ((i & 8) != 0) {
            z10 = false;
        }
        if ((i & 16) != 0) {
            z9 = false;
        }
        if ((i & 32) != 0) {
            z8 = false;
        }
        Lifecycle lifecycle = null;
        if ((i & 64) != 0) {
            interfaceC1363370laB2 = null;
        }
        if ((i & 128) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 256) != 0) {
            c1362230lYL2 = null;
        }
        if ((i & 512) != 0) {
            z7 = true;
        }
        if ((i & 1024) != 0) {
            z6 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            interfaceC1363760lao2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1371590lnR2 = null;
        }
        if ((i & 8192) != 0) {
            enumC1364450lbv2 = null;
        }
        if (!C15504065e.LIZ()) {
            if (sharePackage != null && C1250860iei.LIZ(sharePackage) && C902900ZbU.LIZ(sharePackage)) {
                z11 = true;
            }
            C1364980lcm.LIZ(sharePackage, z10, z9, z8, z6, z11);
        }
        if (lifecycleOwner != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        }
        return new SharePanelViewModel(sharePackage, interfaceC1356390lOv, list, interfaceC1363370laB2, lifecycle, c1362230lYL2, z7, interfaceC1363760lao2, c1371590lnR2, enumC1364450lbv2);
    }
}
