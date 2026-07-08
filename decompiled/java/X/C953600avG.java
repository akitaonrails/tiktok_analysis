package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0avG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953600avG {
    public final String LIZ;
    public String LIZIZ;
    public final EnumC937290aUx LIZJ;
    public final EnumC953330aup LIZLLL;
    public final String LJ;
    public final WeakReference<InterfaceC917550Zz7> LJFF;
    public final C917840Zza LJI;
    public final EnumC952890au7 LJII;
    public final Long LJIIIIZZ;
    public final String LJIIIZ;
    public final C334801Rq LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public Function1<? super Boolean, Unit> LJIILIIL;

    public C953600avG(String str, String str2, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str3, WeakReference weakReference, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, Long l, String str4, C334801Rq c334801Rq, int i, String str5, AwS594S0100000_15 awS594S0100000_15, int i2) {
        String str6 = str5;
        int i3 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i;
        str6 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str6;
        AwS594S0100000_15 awS594S0100000_152 = (i2 & 8192) == 0 ? awS594S0100000_15 : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC937290aUx;
        this.LIZLLL = enumC953330aup;
        this.LJ = str3;
        this.LJFF = weakReference;
        this.LJI = c917840Zza;
        this.LJII = enumC952890au7;
        this.LJIIIIZZ = l;
        this.LJIIIZ = str4;
        this.LJIIJ = c334801Rq;
        this.LJIIJJI = i3;
        this.LJIIL = str6;
        this.LJIILIIL = awS594S0100000_152;
    }
}
