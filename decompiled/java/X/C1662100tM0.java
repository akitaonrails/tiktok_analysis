package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662100tM0 {
    public final EnumC1651790t5N LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final Integer LJFF;
    public final EnumC862650Xsl LJI;
    public final Function0<Boolean> LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final EnumC1662090tLz LJIIIZ;
    public final Function0<Unit> LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final String LJIIL;

    public C1662100tM0() {
        throw null;
    }

    public C1662100tM0(EnumC1651790t5N enumC1651790t5N, String str, String str2, boolean z, long j, Integer num, EnumC862650Xsl enumC862650Xsl, Function0 function0, Function0 function02, EnumC1662090tLz enumC1662090tLz, Function0 function03, Function0 function04, String str3, int i) {
        EnumC862650Xsl enumC862650Xsl2 = enumC862650Xsl;
        Function0 function05 = function0;
        Function0 function06 = function02;
        EnumC1662090tLz enumC1662090tLz2 = enumC1662090tLz;
        Function0 function07 = function03;
        Function0 function08 = function04;
        Integer num2 = (i & 32) != 0 ? null : num;
        enumC862650Xsl2 = (i & 64) != 0 ? EnumC862650Xsl.OVER_ICON : enumC862650Xsl2;
        function05 = (i & 128) != 0 ? null : function05;
        function06 = (i & 256) != 0 ? null : function06;
        enumC1662090tLz2 = (i & 512) != 0 ? EnumC1662090tLz.NEW_FEATURE : enumC1662090tLz2;
        function07 = (i & 1024) != 0 ? null : function07;
        function08 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function08;
        String str4 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str3 : null;
        this.LIZ = enumC1651790t5N;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = num2;
        this.LJI = enumC862650Xsl2;
        this.LJII = function05;
        this.LJIIIIZZ = function06;
        this.LJIIIZ = enumC1662090tLz2;
        this.LJIIJ = function07;
        this.LJIIJJI = function08;
        this.LJIIL = str4;
    }
}
