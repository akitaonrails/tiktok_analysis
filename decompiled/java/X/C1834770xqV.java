package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834770xqV implements InterfaceC1891350zJl {
    public final EnumC1834820xqa LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final Function1<Integer, Unit> LLIZ;
    public final Function1<Integer, Unit> LLIZLLLIL;
    public final EnumC1834800xqY LLJ;
    public final long LLJI;
    public final Integer LLJIJIL;
    public final Function1<String, Unit> LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834770xqV)) {
            return false;
        }
        C1834770xqV c1834770xqV = (C1834770xqV) obj;
        return this.LL == c1834770xqV.LL && this.LLILLJJLI == c1834770xqV.LLILLJJLI && this.LLILLL == c1834770xqV.LLILLL && this.LLILZ == c1834770xqV.LLILZ && this.LLILZIL == c1834770xqV.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1834770xqV.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1834770xqV.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1834770xqV.LLIZLLLIL) && this.LLJ == c1834770xqV.LLJ && this.LLJI == c1834770xqV.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1834770xqV.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1834770xqV.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        Function1<Integer, Unit> function1 = this.LLIZLLLIL;
        int iHashCode2 = (((((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Y2(this.LLJI)) * 31;
        Integer num = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Function1<String, Unit> function12 = this.LLJILJIL;
        return iHashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "LiveHighlightSideBarItem(type=" + this.LL + ", enable=" + this.LLILLJJLI + ", icon=" + this.LLILLL + ", showRedDot=" + this.LLILZ + ", showBubble=" + this.LLILZIL + ", bubbleText=" + this.LLILZLL + ", method=" + this.LLIZ + ", disableMethod=" + this.LLIZLLLIL + ", status=" + this.LLJ + ", fragmentId=" + this.LLJI + ", loadingClickToast=" + this.LLJIJIL + ", clickMethod=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834770xqV c1834770xqV;
        C1834770xqV c1834770xqV2;
        C1834770xqV c1834770xqV3;
        C1834770xqV c1834770xqV4;
        C1834770xqV c1834770xqV5;
        boolean z = interfaceC1891350zJl instanceof C1834770xqV;
        EnumC1834800xqY enumC1834800xqY = null;
        if (z && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null && this.LLILLJJLI == c1834770xqV.LLILLJJLI && z && (c1834770xqV2 = (C1834770xqV) interfaceC1891350zJl) != null && this.LLILZ == c1834770xqV2.LLILZ && z && (c1834770xqV3 = (C1834770xqV) interfaceC1891350zJl) != null && this.LLILZIL == c1834770xqV3.LLILZIL) {
            EnumC1834800xqY enumC1834800xqY2 = this.LLJ;
            if (z && (c1834770xqV5 = (C1834770xqV) interfaceC1891350zJl) != null) {
                enumC1834800xqY = c1834770xqV5.LLJ;
            }
            if (enumC1834800xqY2 == enumC1834800xqY && z && (c1834770xqV4 = (C1834770xqV) interfaceC1891350zJl) != null && this.LLJI == c1834770xqV4.LLJI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834770xqV c1834770xqV;
        EnumC1834820xqa enumC1834820xqa = this.LL;
        EnumC1834820xqa enumC1834820xqa2 = null;
        if ((interfaceC1891350zJl instanceof C1834770xqV) && (c1834770xqV = (C1834770xqV) interfaceC1891350zJl) != null) {
            enumC1834820xqa2 = c1834770xqV.LL;
        }
        if (enumC1834820xqa == enumC1834820xqa2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (interfaceC1891350zJl instanceof C1834770xqV) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z5 = true;
            C1834770xqV c1834770xqV = (C1834770xqV) interfaceC1891350zJl;
            if (this.LLILLJJLI != c1834770xqV.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap.put(1, Boolean.valueOf(z));
            if (this.LLILZ != c1834770xqV.LLILZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            linkedHashMap.put(2, Boolean.valueOf(z2));
            if (this.LLILZIL != c1834770xqV.LLILZIL) {
                z3 = true;
            } else {
                z3 = false;
            }
            linkedHashMap.put(3, Boolean.valueOf(z3));
            if (this.LLJ != c1834770xqV.LLJ) {
                z4 = true;
            } else {
                z4 = false;
            }
            linkedHashMap.put(4, Boolean.valueOf(z4));
            if (this.LLJI == c1834770xqV.LLJI) {
                z5 = false;
            }
            linkedHashMap.put(5, Boolean.valueOf(z5));
            return linkedHashMap;
        }
        return null;
    }

    public static C1834770xqV LIZ(C1834770xqV c1834770xqV, boolean z, boolean z2, String str, EnumC1834800xqY enumC1834800xqY, long j, int i) {
        EnumC1834820xqa enumC1834820xqa;
        int i2;
        boolean z3;
        Function1<Integer, Unit> function1;
        Function1<Integer, Unit> function12;
        Integer num;
        EnumC1834800xqY enumC1834800xqY2 = enumC1834800xqY;
        long j2 = j;
        String str2 = str;
        boolean z4 = z2;
        boolean z5 = z;
        Function1<String, Unit> function13 = null;
        if ((i & 1) != 0) {
            enumC1834820xqa = c1834770xqV.LL;
        } else {
            enumC1834820xqa = null;
        }
        if ((i & 2) != 0) {
            z5 = c1834770xqV.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            i2 = c1834770xqV.LLILLL;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            z3 = c1834770xqV.LLILZ;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = c1834770xqV.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c1834770xqV.LLILZLL;
        }
        if ((i & 64) != 0) {
            function1 = c1834770xqV.LLIZ;
        } else {
            function1 = null;
        }
        if ((i & 128) != 0) {
            function12 = c1834770xqV.LLIZLLLIL;
        } else {
            function12 = null;
        }
        if ((i & 256) != 0) {
            enumC1834800xqY2 = c1834770xqV.LLJ;
        }
        if ((i & 512) != 0) {
            j2 = c1834770xqV.LLJI;
        }
        if ((i & 1024) != 0) {
            num = c1834770xqV.LLJIJIL;
        } else {
            num = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function13 = c1834770xqV.LLJILJIL;
        }
        c1834770xqV.getClass();
        return new C1834770xqV(enumC1834820xqa, z5, i2, z3, z4, str2, function1, function12, enumC1834800xqY2, j2, num, function13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1834770xqV(EnumC1834820xqa enumC1834820xqa, boolean z, int i, boolean z2, Function1 function1, Function1 function12, EnumC1834800xqY enumC1834800xqY, Integer num, AwS583S0100000_4 awS583S0100000_4, int i2) {
        String str;
        Integer num2 = num;
        EnumC1834800xqY enumC1834800xqY2 = enumC1834800xqY;
        Function1 function13 = function12;
        boolean z3 = z2;
        boolean z4 = (i2 & 2) != 0 ? false : z;
        z3 = (i2 & 8) != 0 ? false : z3;
        if ((i2 & 32) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(enumC1834820xqa, z4, i, z3, false, str, function1, (i2 & 128) != 0 ? null : function13, (i2 & 256) != 0 ? EnumC1834800xqY.NORMAL : enumC1834800xqY2, 0L, (i2 & 1024) != 0 ? null : num2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? awS583S0100000_4 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1834770xqV(EnumC1834820xqa enumC1834820xqa, boolean z, int i, boolean z2, boolean z3, String str, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, EnumC1834800xqY enumC1834800xqY, long j, Integer num, Function1<? super String, Unit> function13) {
        this.LL = enumC1834820xqa;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = str;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        this.LLJ = enumC1834800xqY;
        this.LLJI = j;
        this.LLJIJIL = num;
        this.LLJILJIL = function13;
    }
}
