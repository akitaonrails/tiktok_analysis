package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559060LwG {
    public final NLEModel LIZ;
    public final AutoCutThemeData LIZIZ;
    public final String LIZJ;
    public C559050LwF LIZLLL;
    public C0FQS LJ;
    public C0FQS LJFF;
    public boolean LJI;
    public boolean LJII;
    public NLEModel LJIIIIZZ;
    public Function1<? super String, Unit> LJIIIZ;
    public Function2<? super String, ? super String, Unit> LJIIJ;
    public String LJIIJJI;
    public Function1<? super C559080LwI, Unit> LJIIL;
    public Function1<? super C0233005v, Unit> LJIILIIL;
    public Integer LJIILJJIL;
    public final C558860Lvw LJIILL;

    public C559060LwG(String str, boolean z, boolean z2, NLEModel nLEModel, AutoCutThemeData autoCutThemeData, String str2) {
        this.LIZ = nLEModel;
        this.LIZIZ = autoCutThemeData;
        this.LIZJ = str2;
        EnumC558870Lvx enumC558870Lvx = EnumC558870Lvx.IDLE;
        this.LIZLLL = new C559050LwF(str, enumC558870Lvx, enumC558870Lvx, z, z2, 0);
        this.LJIILL = new C558860Lvw();
    }
}
