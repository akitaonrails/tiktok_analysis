package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918410a0V implements InterfaceC918330a0N {
    public final EnumC918870a1F LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final Function1<Boolean, Unit> LJIIJJI;
    public final Function1<Long, Unit> LJIIL;
    public final Function2<Long, Throwable, Unit> LJIILIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C918410a0V() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this(0, (String) null, (String) (0 == true ? 1 : 0), (int) objArr, (String) (0 == true ? 1 : 0), (boolean) objArr2, (int) objArr3, (String) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (AwS594S0100000_15) (0 == true ? 1 : 0), (AwS594S0100000_15) (0 == true ? 1 : 0), (AwS629S0100000_15) (0 == true ? 1 : 0), 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918410a0V)) {
            return false;
        }
        C918410a0V c918410a0V = (C918410a0V) obj;
        return this.LIZ == c918410a0V.LIZ && this.LIZIZ == c918410a0V.LIZIZ && Intrinsics.LJFF(this.LIZJ, c918410a0V.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c918410a0V.LIZLLL) && this.LJ == c918410a0V.LJ && Intrinsics.LJFF(this.LJFF, c918410a0V.LJFF) && this.LJI == c918410a0V.LJI && this.LJII == c918410a0V.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c918410a0V.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c918410a0V.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c918410a0V.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c918410a0V.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c918410a0V.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c918410a0V.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        Map<String, String> map = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Function1<Boolean, Unit> function1 = this.LJIIJJI;
        int iHashCode5 = (iHashCode4 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Long, Unit> function12 = this.LJIIL;
        int iHashCode6 = (iHashCode5 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<Long, Throwable, Unit> function2 = this.LJIILIIL;
        return iHashCode6 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "InviteInRoom(entryType=" + this.LIZ + ", rank=" + this.LIZIZ + ", shareIntent=" + this.LIZJ + ", inviteSource=" + this.LIZLLL + ", inviteSourceCode=" + this.LJ + ", popUpScene=" + this.LJFF + ", noticeConfirmed=" + this.LJI + ", invitationMicIdx=" + this.LJII + ", trigger=" + this.LJIIIIZZ + ", extraEventParams=" + this.LJIIIZ + ", extraMap=" + this.LJIIJ + ", inviteCallback=" + this.LJIIJJI + ", onReservationInviteSuccess=" + this.LJIIL + ", onReservationInviteFailed=" + this.LJIILIIL + ')';
    }

    @Override // X.InterfaceC918330a0N
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC918290a0J
    public final EnumC918870a1F LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C918410a0V(int i, String str, String str2, int i2, String str3, boolean z, int i3, String str4, Map map, Map map2, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS629S0100000_15 awS629S0100000_15, int i4) {
        EnumC918870a1F enumC918870a1F;
        AwS594S0100000_15 awS594S0100000_153 = awS594S0100000_152;
        int i5 = i3;
        Map map3 = map2;
        String str5 = str3;
        Map map4 = map;
        int i6 = i2;
        String str6 = str4;
        String str7 = str;
        AwS594S0100000_15 awS594S0100000_154 = awS594S0100000_15;
        boolean z2 = z;
        int i7 = i;
        if ((i4 & 1) != 0) {
            enumC918870a1F = EnumC918870a1F.IN_ROOM;
        } else {
            enumC918870a1F = null;
        }
        this(enumC918870a1F, (i4 & 2) != 0 ? -1 : i7, (i4 & 4) != 0 ? "" : str7, (i4 & 8) == 0 ? str2 : "", (i4 & 16) != 0 ? 0 : i6, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? -1 : i5, (i4 & 256) != 0 ? "normal_invite" : str6, (Map<String, String>) ((i4 & 512) != 0 ? null : map4), (Map<String, String>) ((i4 & 1024) != 0 ? null : map3), (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : awS594S0100000_154, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : awS594S0100000_153, (i4 & 8192) == 0 ? awS629S0100000_15 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918410a0V(EnumC918870a1F enumC918870a1F, int i, String str, String str2, int i2, String str3, boolean z, int i3, String str4, Map<String, String> map, Map<String, String> map2, Function1<? super Boolean, Unit> function1, Function1<? super Long, Unit> function12, Function2<? super Long, ? super Throwable, Unit> function2) {
        this.LIZ = enumC918870a1F;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i2;
        this.LJFF = str3;
        this.LJI = z;
        this.LJII = i3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = map;
        this.LJIIJ = map2;
        this.LJIIJJI = function1;
        this.LJIIL = function12;
        this.LJIILIIL = function2;
    }
}
