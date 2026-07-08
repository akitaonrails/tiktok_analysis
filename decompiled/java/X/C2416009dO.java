package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger.ColorConfig;
import ge.i;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2416009dO extends i<InterfaceC2416209dQ, Object, C2416109dP, C2415809dM> implements InterfaceC2416209dQ {
    public static final int LLJJIJIL = 8;
    public final INLEMediaSession LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C19A3 LLJJ;
    public final INLEPlayer LLJJI;
    public boolean LLJJIII;
    public final Function0<C2416109dP> LLJJIJI;
    public final Function0<C2415809dM> LLJJIJIIJIL;

    @Override // X.InterfaceC2416209dQ
    public void Lw() {
        C0FGC.LIZ(2);
        show();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    public final void O4() {
        if (this.LLJJIII) {
            this.LLJJIII = false;
            i3(AFwS231S0000000_3.get$arr$(146));
            return;
        }
        INLEPlayer iNLEPlayer = this.LLJJI;
        String strHandleEffectDebugCmd = iNLEPlayer != null ? iNLEPlayer.handleEffectDebugCmd("{\"functionName\":\"getUIColor\"}", "") : null;
        INLEPlayer iNLEPlayer2 = this.LLJJI;
        String effectDebugPageUIData = iNLEPlayer2 != null ? iNLEPlayer2.getEffectDebugPageUIData() : null;
        Gson gson = C7740030o.LIZ().getGson();
        C259800zU c259800zU = new C259800zU();
        if (!Intrinsics.LJFF(effectDebugPageUIData, "")) {
            GsonProtectorUtils.fromJson(gson, effectDebugPageUIData, C2416309dR.class).getClass();
            c259800zU.element = null;
        }
        C259800zU c259800zU2 = new C259800zU();
        if (!Intrinsics.LJFF(strHandleEffectDebugCmd, "")) {
            c259800zU2.element = GsonProtectorUtils.fromJson(gson, strHandleEffectDebugCmd, ColorConfig.class);
        }
        this.LLJJIII = true;
        i3(new AwS369S0200000_3(c259800zU, (C259800zU<List<C2415509dJ>>) c259800zU2, (C259800zU<ColorConfig>) 14));
    }

    public final INLEPlayer F4() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C2416109dP> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C2415809dM> w2() {
        return this.LLJJIJIIJIL;
    }

    public final void H4(C2415509dJ c2415509dJ) {
        String absolutePath;
        String absolutePath2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        File externalFilesDir = C0CHQ.LIZ.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        sbLIZ.append(absolutePath);
        sbLIZ.append("/aweme/tmp/EffectDebugData");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            throw new IllegalStateException("Check failed.");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        File externalFilesDir2 = C0CHQ.LIZ.getExternalFilesDir(null);
        if (externalFilesDir2 != null) {
            absolutePath2 = externalFilesDir2.getAbsolutePath();
        } else {
            absolutePath2 = null;
        }
        sbLIZ2.append(absolutePath2);
        sbLIZ2.append("/aweme/tmp/EffectDebugData/");
        c2415509dJ.getClass();
        sbLIZ2.append((String) null);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJJ), null, null, new C2415309dH(c2415509dJ, new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)), this, null), 3);
    }

    public final void K4(String str) {
        String absolutePath;
        String absolutePath2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        File externalFilesDir = C0CHQ.LIZ.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        sbLIZ.append(absolutePath);
        sbLIZ.append("/aweme/tmp/EffectDebugData");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            throw new IllegalStateException("Check failed.");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        File externalFilesDir2 = C0CHQ.LIZ.getExternalFilesDir(null);
        if (externalFilesDir2 != null) {
            absolutePath2 = externalFilesDir2.getAbsolutePath();
        } else {
            absolutePath2 = null;
        }
        sbLIZ2.append(absolutePath2);
        sbLIZ2.append("/aweme/tmp/EffectDebugData/CMD");
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!c0vsj2.exists()) {
            if (!c0vsj2.mkdirs()) {
                throw new IllegalStateException("Check failed.");
            }
        } else {
            File[] fileArrListFiles = c0vsj2.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    C08QA.LJIIZILJ(file);
                }
            }
        }
        INLEPlayer iNLEPlayer = this.LLJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.handleEffectDebugCmd(str, c0vsj2.getAbsolutePath());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJJ), null, null, new C2415209dG(c0vsj2, this, null), 3);
    }

    public C2416009dO(INLEMediaSession iNLEMediaSession, C1DRG c1drg, C19A3 c19a3) {
        INLEPlayer playerApi;
        super(c19a3);
        this.LLJILJILJ = iNLEMediaSession;
        this.LLJILLL = c1drg;
        this.LLJJ = c19a3;
        if (iNLEMediaSession != null) {
            playerApi = iNLEMediaSession.getPlayerApi();
        } else {
            playerApi = null;
        }
        this.LLJJI = playerApi;
        this.LLJJIJI = AFwS189S0000000_3.get$arr$(993);
        this.LLJJIJIIJIL = new AwS547S0100000_3(this, 107);
    }
}
