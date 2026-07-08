package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129150fUP {
    public final EnumC1129590fV7 LIZ;
    public final List<GiftPage> LIZIZ;
    public final int LIZJ;
    public final Gift LIZLLL;
    public final C1091480eVe LJ;
    public final C157100iv LJFF;
    public final boolean LJI;
    public final int LJII;
    public final EnumC1129600fV8 LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;

    public C1129150fUP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129150fUP)) {
            return false;
        }
        C1129150fUP c1129150fUP = (C1129150fUP) obj;
        return this.LIZ == c1129150fUP.LIZ && Intrinsics.LJFF(this.LIZIZ, c1129150fUP.LIZIZ) && this.LIZJ == c1129150fUP.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1129150fUP.LIZLLL) && Intrinsics.LJFF(this.LJ, c1129150fUP.LJ) && Intrinsics.LJFF(this.LJFF, c1129150fUP.LJFF) && this.LJI == c1129150fUP.LJI && this.LJII == c1129150fUP.LJII && this.LJIIIIZZ == c1129150fUP.LJIIIIZZ && this.LJIIIZ == c1129150fUP.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1129150fUP.LJIIJ) && this.LJIIJJI == c1129150fUP.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Gift gift = this.LIZLLL;
        int iHashCode2 = (iHashCode + (gift == null ? 0 : gift.hashCode())) * 31;
        C1091480eVe c1091480eVe = this.LJ;
        int iHashCode3 = (iHashCode2 + (c1091480eVe == null ? 0 : c1091480eVe.hashCode())) * 31;
        C157100iv c157100iv = this.LJFF;
        int iHashCode4 = (((((((((iHashCode3 + (c157100iv == null ? 0 : c157100iv.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31;
        String str = this.LJIIJ;
        return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIJJI);
    }

    public final String toString() {
        return "PanelUiState(phase=" + this.LIZ + ", giftPages=" + this.LIZIZ + ", selectedTabType=" + this.LIZJ + ", selectedGift=" + this.LIZLLL + ", panelSnapshot=" + this.LJ + ", sourceTagIndex=" + this.LJFF + ", fromCache=" + this.LJI + ", selectedGiftIndex=" + this.LJII + ", source=" + this.LJIIIIZZ + ", errorCode=" + this.LJIIIZ + ", errorMessage=" + this.LJIIJ + ", stateVersion=" + this.LJIIJJI + ')';
    }

    public C1129150fUP(int i) {
        this(EnumC1129590fV7.IDLE, C13BV.INSTANCE, 0, null, null, null, false, -1, EnumC1129600fV8.INITIAL, 0, null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1129150fUP(EnumC1129590fV7 enumC1129590fV7, List<? extends GiftPage> list, int i, Gift gift, C1091480eVe c1091480eVe, C157100iv c157100iv, boolean z, int i2, EnumC1129600fV8 enumC1129600fV8, int i3, String str, long j) {
        this.LIZ = enumC1129590fV7;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = gift;
        this.LJ = c1091480eVe;
        this.LJFF = c157100iv;
        this.LJI = z;
        this.LJII = i2;
        this.LJIIIIZZ = enumC1129600fV8;
        this.LJIIIZ = i3;
        this.LJIIJ = str;
        this.LJIIJJI = j;
    }

    public static C1129150fUP LIZ(C1129150fUP c1129150fUP, EnumC1129590fV7 enumC1129590fV7, List list, int i, Gift gift, C1091480eVe c1091480eVe, C157100iv c157100iv, boolean z, int i2, EnumC1129600fV8 enumC1129600fV8, int i3, String str, long j, int i4) {
        long j2 = j;
        String str2 = str;
        int i5 = i3;
        EnumC1129600fV8 enumC1129600fV82 = enumC1129600fV8;
        int i6 = i2;
        boolean z2 = z;
        C157100iv c157100iv2 = c157100iv;
        C1091480eVe c1091480eVe2 = c1091480eVe;
        Gift gift2 = gift;
        int i7 = i;
        List list2 = list;
        EnumC1129590fV7 enumC1129590fV72 = enumC1129590fV7;
        if ((i4 & 1) != 0) {
            enumC1129590fV72 = c1129150fUP.LIZ;
        }
        if ((i4 & 2) != 0) {
            list2 = c1129150fUP.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i7 = c1129150fUP.LIZJ;
        }
        if ((i4 & 8) != 0) {
            gift2 = c1129150fUP.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            c1091480eVe2 = c1129150fUP.LJ;
        }
        if ((i4 & 32) != 0) {
            c157100iv2 = c1129150fUP.LJFF;
        }
        if ((i4 & 64) != 0) {
            z2 = c1129150fUP.LJI;
        }
        if ((i4 & 128) != 0) {
            i6 = c1129150fUP.LJII;
        }
        if ((i4 & 256) != 0) {
            enumC1129600fV82 = c1129150fUP.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            i5 = c1129150fUP.LJIIIZ;
        }
        if ((i4 & 1024) != 0) {
            str2 = c1129150fUP.LJIIJ;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j2 = c1129150fUP.LJIIJJI;
        }
        c1129150fUP.getClass();
        return new C1129150fUP(enumC1129590fV72, list2, i7, gift2, c1091480eVe2, c157100iv2, z2, i6, enumC1129600fV82, i5, str2, j2);
    }
}
