package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460620o72 {
    public static final List<Integer> LJIILIIL;
    public static final List<Integer> LJIILJJIL;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final Function1<C1459730o5b, Unit> LJFF;
    public final boolean LJI;
    public final int LJII;
    public final EnumC1462540oA8 LJIIIIZZ;
    public final C1659490tHn LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public final int LJIIL;

    static {
        List listLJIIJJI = C1697810uHb.LJIIJJI(15, 21, 2, 20);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it2.next()).intValue() | 8192));
        }
        LJIILIIL = arrayList;
        C323580CmK c323580CmK = new C323580CmK(36);
        c323580CmK.LIZ(1);
        c323580CmK.LIZ(2);
        c323580CmK.LIZ(3);
        c323580CmK.LIZ(4);
        c323580CmK.LIZ(5);
        c323580CmK.LIZ(1700);
        c323580CmK.LIZ(6);
        c323580CmK.LIZ(7);
        c323580CmK.LIZ(8);
        c323580CmK.LIZ(9);
        c323580CmK.LIZ(10);
        c323580CmK.LIZ(11);
        c323580CmK.LIZ(14);
        c323580CmK.LIZ(16);
        c323580CmK.LIZ(15);
        c323580CmK.LIZ(17);
        c323580CmK.LIZ(1102);
        c323580CmK.LIZ(20);
        c323580CmK.LIZ(21);
        c323580CmK.LIZ(22);
        c323580CmK.LIZ(23);
        c323580CmK.LIZ(24);
        c323580CmK.LIZ(25);
        c323580CmK.LIZ(1101);
        c323580CmK.LIZ(1100);
        c323580CmK.LIZ(26);
        c323580CmK.LIZ(1200);
        c323580CmK.LIZ(1300);
        c323580CmK.LIZ(1104);
        c323580CmK.LIZ(1800);
        c323580CmK.LIZIZ(arrayList.toArray(new Integer[0]));
        c323580CmK.LIZ(1105);
        c323580CmK.LIZ(1900);
        c323580CmK.LIZ(8000);
        c323580CmK.LIZ(8001);
        c323580CmK.LIZ(31);
        LJIILJJIL = C1697810uHb.LJIIJJI(c323580CmK.LIZLLL(new Integer[c323580CmK.LIZJ()]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1460620o72)) {
            return false;
        }
        C1460620o72 c1460620o72 = (C1460620o72) obj;
        return this.LIZ == c1460620o72.LIZ && this.LIZIZ == c1460620o72.LIZIZ && this.LIZJ == c1460620o72.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1460620o72.LIZLLL) && this.LJ == c1460620o72.LJ && Intrinsics.LJFF(this.LJFF, c1460620o72.LJFF) && this.LJI == c1460620o72.LJI && this.LJII == c1460620o72.LJII && this.LJIIIIZZ == c1460620o72.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1460620o72.LJIIIZ) && this.LJIIJ == c1460620o72.LJIIJ && this.LJIIJJI == c1460620o72.LJIIJJI && this.LJIIL == c1460620o72.LJIIL;
    }

    public static C1460620o72 LIZ(C1460620o72 c1460620o72, int i, boolean z, int i2) {
        int i3;
        int i4;
        String str;
        int i5;
        Function1<C1459730o5b, Unit> function1;
        boolean z2;
        int i6;
        EnumC1462540oA8 enumC1462540oA8;
        boolean z3;
        int i7;
        boolean z4 = z;
        int i8 = i;
        if ((i2 & 1) != 0) {
            i8 = c1460620o72.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1460620o72.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i4 = c1460620o72.LIZJ;
        } else {
            i4 = 0;
        }
        C1659490tHn c1659490tHn = null;
        if ((i2 & 8) != 0) {
            str = c1460620o72.LIZLLL;
        } else {
            str = null;
        }
        if ((i2 & 16) != 0) {
            i5 = c1460620o72.LJ;
        } else {
            i5 = 0;
        }
        if ((i2 & 32) != 0) {
            function1 = c1460620o72.LJFF;
        } else {
            function1 = null;
        }
        if ((i2 & 64) != 0) {
            z2 = c1460620o72.LJI;
        } else {
            z2 = false;
        }
        if ((i2 & 128) != 0) {
            i6 = c1460620o72.LJII;
        } else {
            i6 = 0;
        }
        if ((i2 & 256) != 0) {
            enumC1462540oA8 = c1460620o72.LJIIIIZZ;
        } else {
            enumC1462540oA8 = null;
        }
        if ((i2 & 512) != 0) {
            c1659490tHn = c1460620o72.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            z3 = c1460620o72.LJIIJ;
        } else {
            z3 = false;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = c1460620o72.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i7 = c1460620o72.LJIIL;
        } else {
            i7 = 0;
        }
        return new C1460620o72(i8, i3, i4, str, i5, function1, z2, i6, enumC1462540oA8, c1659490tHn, z3, z4, i7);
    }

    public /* synthetic */ C1460620o72(int i, int i2, int i3, String str, int i4, Function1 function1, boolean z, int i5, EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z2, int i6, int i7) {
        this(i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? -1 : i3, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? -1 : i4, (Function1<? super C1459730o5b, Unit>) ((i7 & 32) != 0 ? null : function1), (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? null : enumC1462540oA8, (i7 & 512) == 0 ? c1659490tHn : null, (i7 & 1024) != 0 ? false : z2, false, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1460620o72(int i, int i2, int i3, String str, int i4, Function1<? super C1459730o5b, Unit> function1, boolean z, int i5, EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z2, boolean z3, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = str;
        this.LJ = i4;
        this.LJFF = function1;
        this.LJI = z;
        this.LJII = i5;
        this.LJIIIIZZ = enumC1462540oA8;
        this.LJIIIZ = c1659490tHn;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = i6;
    }
}
