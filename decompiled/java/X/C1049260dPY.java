package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS296S0000000_12;

/* JADX INFO: renamed from: X.0dPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049260dPY {
    public static final List<String> LJIIJJI = C1697810uHb.LJIIJJI("enable_pending_js_task", "enable_prefetch", "spark_perf_bid");
    public final String LIZ;
    public String LIZIZ;
    public final Bundle LIZJ;
    public final String LIZLLL;
    public final InterfaceC1020440cf4 LJ;
    public final Boolean LJFF;
    public final Function2<String, String, Boolean> LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final C1009380cNE LJIIIZ;
    public final n LJIIJ;

    public final void LIZ(String str, boolean z, boolean z2) {
        String str2;
        try {
            Uri.Builder builderBuildUpon = C416901jj.LIZJ(UriProtector.parse(str), LJIIJJI).buildUpon();
            String str3 = "1";
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enable_pending_js_task", str2).appendQueryParameter("spark_perf_bid", this.LIZ);
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            this.LIZIZ = builderAppendQueryParameter.appendQueryParameter("enable_prefetch", str3).build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ad spark lynx url is ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C1049260dPY(String str, String str2, Bundle bundle, String str3, InterfaceC1020440cf4 interfaceC1020440cf4, boolean z, AFwS296S0000000_12 aFwS296S0000000_12, boolean z2, Integer num, Integer num2, C1009380cNE c1009380cNE, n nVar, int i) {
        Boolean bool;
        Integer num3 = num;
        Integer num4 = num2;
        C1009380cNE c1009380cNE2 = c1009380cNE;
        str2 = (i & 2) != 0 ? null : str2;
        bundle = (i & 4) != 0 ? null : bundle;
        str3 = (i & 8) != 0 ? null : str3;
        if ((i & 64) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        z = (i & 128) != 0 ? false : z;
        aFwS296S0000000_12 = (i & 256) != 0 ? null : aFwS296S0000000_12;
        boolean z3 = (i & 512) == 0 ? z2 : false;
        num3 = (i & 1024) != 0 ? null : num3;
        num4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num4;
        c1009380cNE2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1009380cNE2;
        n nVar2 = (i & 8192) == 0 ? nVar : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bundle;
        this.LIZLLL = str3;
        this.LJ = interfaceC1020440cf4;
        this.LJFF = bool;
        this.LJI = aFwS296S0000000_12;
        this.LJII = num3;
        this.LJIIIIZZ = num4;
        this.LJIIIZ = c1009380cNE2;
        this.LJIIJ = nVar2;
        LIZ(str2, z3, z);
    }
}
