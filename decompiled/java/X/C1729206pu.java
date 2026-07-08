package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1729206pu implements InterfaceC0148002o {
    public final EnumC877490Ybb LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<String> LLILZLL;
    public final C291001Au<IMUser> LLIZ;
    public final C291001Au<List<C1462005nu>> LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final boolean LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729206pu)) {
            return false;
        }
        C1729206pu c1729206pu = (C1729206pu) obj;
        return this.LL == c1729206pu.LL && this.LLILLJJLI == c1729206pu.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1729206pu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1729206pu.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1729206pu.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1729206pu.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1729206pu.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1729206pu.LLIZLLLIL) && this.LLJ == c1729206pu.LLJ && this.LLJI == c1729206pu.LLJI && this.LLJIJIL == c1729206pu.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1729206pu.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1729206pu.LLJILJILJ) && this.LLJILLL == c1729206pu.LLJILLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        return ((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILLL);
    }

    public final String toString() {
        return "GroupDetailState(notifyState=" + this.LL + ", pinned=" + this.LLILLJJLI + ", groupAvatar=" + this.LLILLL + ", quitChatPage=" + this.LLILZ + ", quitDetailPage=" + this.LLILZIL + ", removeToast=" + this.LLILZLL + ", memberContactUpdated=" + this.LLIZ + ", memberList=" + this.LLIZLLLIL + ", groupRole=" + this.LLJ + ", newRequestCount=" + this.LLJI + ", adminSize=" + this.LLJIJIL + ", groupDesc=" + this.LLJILJIL + ", groupName=" + this.LLJILJILJ + ", showOnProfile=" + this.LLJILLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1729206pu(EnumC877490Ybb enumC877490Ybb, boolean z, String str, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<String> c291001Au3, C291001Au<? extends IMUser> c291001Au4, C291001Au<? extends List<C1462005nu>> c291001Au5, int i, int i2, int i3, String str2, String str3, boolean z2) {
        this.LL = enumC877490Ybb;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
        this.LLIZ = c291001Au4;
        this.LLIZLLLIL = c291001Au5;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = z2;
    }

    public static C1729206pu LIZ(C1729206pu c1729206pu, EnumC877490Ybb enumC877490Ybb, boolean z, String str, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, int i, int i2, int i3, String str2, String str3, boolean z2, int i4) {
        boolean z3 = z2;
        String str4 = str3;
        String str5 = str2;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        String str6 = str;
        boolean z4 = z;
        EnumC877490Ybb enumC877490Ybb2 = enumC877490Ybb;
        if ((i4 & 1) != 0) {
            enumC877490Ybb2 = c1729206pu.LL;
        }
        if ((i4 & 2) != 0) {
            z4 = c1729206pu.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            str6 = c1729206pu.LLILLL;
        }
        if ((i4 & 8) != 0) {
            c291001Au10 = c1729206pu.LLILZ;
        }
        if ((i4 & 16) != 0) {
            c291001Au9 = c1729206pu.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            c291001Au8 = c1729206pu.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            c291001Au7 = c1729206pu.LLIZ;
        }
        if ((i4 & 128) != 0) {
            c291001Au6 = c1729206pu.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            i7 = c1729206pu.LLJ;
        }
        if ((i4 & 512) != 0) {
            i6 = c1729206pu.LLJI;
        }
        if ((i4 & 1024) != 0) {
            i5 = c1729206pu.LLJIJIL;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str5 = c1729206pu.LLJILJIL;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = c1729206pu.LLJILJILJ;
        }
        if ((i4 & 8192) != 0) {
            z3 = c1729206pu.LLJILLL;
        }
        c1729206pu.getClass();
        return new C1729206pu(enumC877490Ybb2, z4, str6, c291001Au10, c291001Au9, c291001Au8, c291001Au7, c291001Au6, i7, i6, i5, str5, str4, z3);
    }
}
