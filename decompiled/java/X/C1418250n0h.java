package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418250n0h {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF;
    public String LJI;
    public final String LJII;
    public final EnumC1417520mzW LJIIIIZZ;
    public final List<AutoCutMediaModel> LJIIIZ;
    public final Set<String> LJIIJ;
    public final InterfaceC1418120n0U LJIIJJI;
    public final CreativeInfo LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final InterfaceC1418410n0x LJIILLIIL;
    public final boolean LJIIZILJ;
    public final C1418100n0S LJIJ;
    public final Function1<Asset, Unit> LJIJI;
    public final AutoCutThemeData LJIJJ;

    public C1418250n0h(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, EnumC1417520mzW enumC1417520mzW, List list, Set set, InterfaceC1418120n0U interfaceC1418120n0U, CreativeInfo creativeInfo, boolean z, boolean z2, boolean z3, InterfaceC1418410n0x interfaceC1418410n0x, boolean z4, C1418100n0S c1418100n0S, Function1 function1, AutoCutThemeData autoCutThemeData, int i2) {
        InterfaceC1418120n0U interfaceC1418120n0U2 = interfaceC1418120n0U;
        Function1 function12 = function1;
        boolean z5 = z4;
        Set set2 = (i2 & 1024) != 0 ? null : set;
        interfaceC1418120n0U2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : interfaceC1418120n0U2;
        z5 = (131072 & i2) != 0 ? false : z5;
        function12 = (524288 & i2) != 0 ? null : function12;
        AutoCutThemeData autoCutThemeData2 = (i2 & 1048576) == 0 ? autoCutThemeData : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = i;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = enumC1417520mzW;
        this.LJIIIZ = list;
        this.LJIIJ = set2;
        this.LJIIJJI = interfaceC1418120n0U2;
        this.LJIIL = creativeInfo;
        this.LJIILIIL = z;
        this.LJIILJJIL = z2;
        this.LJIILL = z3;
        this.LJIILLIIL = interfaceC1418410n0x;
        this.LJIIZILJ = z5;
        this.LJIJ = c1418100n0S;
        this.LJIJI = function12;
        this.LJIJJ = autoCutThemeData2;
    }
}
