package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.nlehelper.NLEDebugToolHelper$dumpEffect$1$1", f = "NLEDebugToolHelper.kt", l = {471}, m = "invokeSuspend")
public final class C2417209da extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20576115fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2417209da(C20576115fL c20576115fL, InterfaceC1364105Vn<? super C2417209da> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20576115fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2417209da(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String absolutePath;
        INLEMediaSession iNLEMediaSessionInvoke;
        INLEPlayer playerApi;
        String strDumpSwingEffectData;
        String absolutePath2;
        C1C7U.LIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                File externalFilesDir = C0CHQ.LIZ.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    absolutePath = externalFilesDir.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                sbLIZ.append(absolutePath);
                sbLIZ.append("/aweme/tmp/EffectDumpData");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    throw new IllegalStateException("Check failed.");
                }
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        C08QA.LJIIZILJ(file);
                    }
                }
                Function0<? extends INLEMediaSession> function0 = this.LLILLJJLI.LIZIZ;
                if (function0 != null) {
                    iNLEMediaSessionInvoke = function0.invoke();
                } else {
                    iNLEMediaSessionInvoke = null;
                }
                Function0<? extends NLEModel> function02 = this.LLILLJJLI.LIZJ;
                if (function02 != null) {
                    function02.invoke();
                }
                if (iNLEMediaSessionInvoke == null) {
                    playerApi = null;
                } else {
                    playerApi = iNLEMediaSessionInvoke.getPlayerApi();
                }
                if (!(playerApi instanceof C389960FQs)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1");
                    return unit;
                }
                String absolutePath3 = c0vsj.getAbsolutePath();
                NLEPlayer nLEPlayerLJFF = ((C389960FQs) playerApi).LJFF();
                if (nLEPlayerLJFF != null) {
                    strDumpSwingEffectData = nLEPlayerLJFF.dumpSwingEffectData(absolutePath3);
                } else {
                    strDumpSwingEffectData = null;
                }
                if (strDumpSwingEffectData == null) {
                    strDumpSwingEffectData = "";
                }
                C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(this.LLILLJJLI.LIZ.getContext(), "clipboard"), ClipData.newPlainText("Effect_debug", strDumpSwingEffectData), null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                File externalFilesDir2 = C0CHQ.LIZ.getExternalFilesDir(null);
                if (externalFilesDir2 != null) {
                    absolutePath2 = externalFilesDir2.getAbsolutePath();
                } else {
                    absolutePath2 = null;
                }
                sbLIZ2.append(absolutePath2);
                sbLIZ2.append("/aweme/tmp/");
                String strLJFF = C08SA.LJFF(C2188811AlT.LIZIZ(sbLIZ2), "EffectDumpData.zip", Collections.singletonList(c0vsj.getAbsolutePath()));
                if (strLJFF == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1");
                    return unit2;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C2417009dY c2417009dY = new C2417009dY(this.LLILLJJLI, strLJFF, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c2417009dY) == objLJFF) {
                    C1C7U.LIZIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1");
        return unit3;
    }
}
