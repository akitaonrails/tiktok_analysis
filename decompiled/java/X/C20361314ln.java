package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20361314ln {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final List<String> LJ;
    public final C20365714mV LJFF;
    public final int LJI;
    public final EnumC1779270wOz LJII;
    public final boolean LJIIIIZZ;
    public final Function2<C20361214lm, Context, View> LJIIIZ;
    public final List<String> LJIIJ;
    public final List<String> LJIIJJI;

    public C20361314ln() {
        this(null, null, 0, 0, null, null, 0, null, false, null, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20361314ln)) {
            return false;
        }
        C20361314ln c20361314ln = (C20361314ln) obj;
        return Intrinsics.LJFF(this.LIZ, c20361314ln.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20361314ln.LIZIZ) && this.LIZJ == c20361314ln.LIZJ && this.LIZLLL == c20361314ln.LIZLLL && Intrinsics.LJFF(this.LJ, c20361314ln.LJ) && Intrinsics.LJFF(this.LJFF, c20361314ln.LJFF) && this.LJI == c20361314ln.LJI && this.LJII == c20361314ln.LJII && this.LJIIIIZZ == c20361314ln.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c20361314ln.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c20361314ln.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c20361314ln.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        C20365714mV c20365714mV = this.LJFF;
        int iHashCode3 = (((((((iHashCode2 + (c20365714mV == null ? 0 : c20365714mV.hashCode())) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Function2<C20361214lm, Context, View> function2 = this.LJIIIZ;
        return ((((iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "PlayEntityUIConfig(name=" + this.LIZ + ", nameInEditor=" + this.LIZIZ + ", icon=" + this.LIZJ + ", iconInEditor=" + this.LIZLLL + ", paramStrList=" + this.LJ + ", customIconImage=" + this.LJFF + ", enable=" + this.LJI + ", iconResourceType=" + this.LJII + ", canReadyToStart=" + this.LJIIIIZZ + ", customView=" + this.LJIIIZ + ", conditionTitle=" + this.LJIIJ + ", conditionDescription=" + this.LJIIJJI + ')';
    }

    public C20361314ln(String str, String str2, int i, int i2, List list, C20365714mV c20365714mV, int i3, EnumC1779270wOz enumC1779270wOz, boolean z, Function2 function2, int i4) {
        C13BV c13bv;
        str = (i4 & 1) != 0 ? "" : str;
        str2 = (i4 & 2) != 0 ? null : str2;
        i = (i4 & 4) != 0 ? 0 : i;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        list = (i4 & 16) != 0 ? C13BV.INSTANCE : list;
        c20365714mV = (i4 & 32) != 0 ? null : c20365714mV;
        i3 = (i4 & 64) != 0 ? 0 : i3;
        enumC1779270wOz = (i4 & 128) != 0 ? EnumC1779270wOz.ATTR : enumC1779270wOz;
        if ((i4 & 256) != 0) {
            if (!C500260Jjc.LJJIL() && PlayEntityUtilKt.LJIIIZ()) {
                z = true;
            } else {
                z = false;
            }
        }
        function2 = (i4 & 512) != 0 ? null : function2;
        if ((i4 & 1024) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        C13BV c13bv2 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = list;
        this.LJFF = c20365714mV;
        this.LJI = i3;
        this.LJII = enumC1779270wOz;
        this.LJIIIIZZ = z;
        this.LJIIIZ = function2;
        this.LJIIJ = c13bv;
        this.LJIIJJI = c13bv2;
    }
}
