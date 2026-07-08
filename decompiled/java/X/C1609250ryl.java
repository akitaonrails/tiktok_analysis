package X;

import android.content.Context;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ryl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609250ryl implements InterfaceC1609020ryO {
    public final InterfaceC1609270ryn LIZ;
    public final C1608470rxV LIZIZ;
    public final C1608470rxV LIZJ;
    public final Function1<Context, View> LIZLLL;
    public final Function1<C1606310ru1, Unit> LJ;
    public final Function1<C1606310ru1, Unit> LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Function1<Integer, Float> LJIIIIZZ;
    public final String LJIIIZ;

    public C1609250ryl() {
        throw null;
    }

    @Override // X.InterfaceC1609020ryO
    public final InterfaceC1609270ryn getPosition() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1609020ryO
    public final C1608470rxV getSize() {
        return this.LIZIZ;
    }

    public C1609250ryl(InterfaceC1609270ryn interfaceC1609270ryn, C1608470rxV c1608470rxV, C1608470rxV c1608470rxV2, Function1 function1, Function1 function12, Function1 function13, boolean z, boolean z2, Function1 function14, String str, int i) {
        c1608470rxV2 = (i & 4) != 0 ? null : c1608470rxV2;
        function13 = (i & 64) != 0 ? null : function13;
        z = (i & 128) != 0 ? false : z;
        z2 = (i & 256) != 0 ? false : z2;
        function14 = (i & 512) != 0 ? null : function14;
        str = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str;
        this.LIZ = interfaceC1609270ryn;
        this.LIZIZ = c1608470rxV;
        this.LIZJ = c1608470rxV2;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJFF = function13;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = function14;
        this.LJIIIZ = str;
    }
}
