package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.LinkBlock;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundArrivingTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712670ufZ implements InterfaceC1891350zJl {
    public final EnumC1709240ua2 LL;
    public final EnumC1711310udN LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final ArrayList<C1712720ufe> LLJ;
    public final String LLJI;
    public final ArrayList<C1712690ufb> LLJIJIL;
    public final LinkBlock LLJILJIL;
    public final Function1<Integer, Unit> LLJILJILJ;
    public final int LLJILLL;
    public final RefundArrivingTime LLJJ;

    public final String toString() {
        return "RefundOptionCellItem(theme=" + this.LL + ", uiMode=" + this.LLILLJJLI + ", refundRequestId=" + this.LLILLL + ", title=" + this.LLILZ + ", desc=" + this.LLILZIL + ", isValid=" + this.LLILZLL + ", isSelected=" + this.LLIZ + ", actionLink=" + this.LLIZLLLIL + ", refundOptionTags=" + this.LLJ + ", creditToken=" + this.LLJI + ", refundMethods=" + this.LLJIJIL + ", linkBlock=" + this.LLJILJIL + ", selectCallback=" + this.LLJILJILJ + ", optionRank=" + this.LLJILLL + ", refundArriveTime=" + this.LLJJ + ')';
    }

    public final boolean LIZIZ() {
        ArrayList<C1712690ufb> arrayList = this.LLJIJIL;
        if (arrayList == null) {
            return false;
        }
        Iterator<C1712690ufb> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LLILZLL, "refund_to_wallet")) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        StringBuilder sb = new StringBuilder();
        ArrayList<C1712690ufb> arrayList = this.LLJIJIL;
        if (arrayList != null) {
            for (C1712690ufb c1712690ufb : arrayList) {
                sb.append(c1712690ufb.LLILZLL);
                sb.append(c1712690ufb.LLIZ);
                sb.append(c1712690ufb.LLJ);
            }
        }
        return sb.toString().hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1712670ufZ)) {
            return false;
        }
        C1712670ufZ c1712670ufZ = (C1712670ufZ) interfaceC1891350zJl;
        if (this.LLIZ != c1712670ufZ.LLIZ || this.LLILZLL != c1712670ufZ.LLILZLL || !Intrinsics.LJFF(this.LLILZ, c1712670ufZ.LLILZ) || !Intrinsics.LJFF(this.LLILZIL, c1712670ufZ.LLILZIL) || !Intrinsics.LJFF(this.LLIZLLLIL, c1712670ufZ.LLIZLLLIL) || !Intrinsics.LJFF(this.LLJ, c1712670ufZ.LLJ) || !Intrinsics.LJFF(this.LLJIJIL, c1712670ufZ.LLJIJIL) || !Intrinsics.LJFF(this.LLJILJIL, c1712670ufZ.LLJILJIL) || this.LL != c1712670ufZ.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1712670ufZ) || hashCode() != ((C1712670ufZ) interfaceC1891350zJl).hashCode()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1712670ufZ) && hashCode() == ((C1712670ufZ) obj).hashCode()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        if (interfaceC1891350zJl instanceof C1712670ufZ) {
            C1712670ufZ c1712670ufZ = (C1712670ufZ) interfaceC1891350zJl;
            if (this.LLIZ != c1712670ufZ.LLIZ) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLILZLL != c1712670ufZ.LLILZLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = !Intrinsics.LJFF(this.LLILZ, c1712670ufZ.LLILZ);
            boolean z5 = !Intrinsics.LJFF(this.LLILZIL, c1712670ufZ.LLILZIL);
            Intrinsics.LJFF(this.LLIZLLLIL, c1712670ufZ.LLIZLLLIL);
            boolean z6 = !Intrinsics.LJFF(this.LLJ, c1712670ufZ.LLJ);
            boolean z7 = !Intrinsics.LJFF(this.LLJIJIL, c1712670ufZ.LLJIJIL);
            boolean z8 = !Intrinsics.LJFF(this.LLJILJIL, c1712670ufZ.LLJILJIL);
            if (this.LL != c1712670ufZ.LL) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new C1712760ufi(z, z2, z4, z5, z6, z7, z8, z3);
        }
        return null;
    }

    public static C1712670ufZ LIZ(C1712670ufZ c1712670ufZ, EnumC1709240ua2 enumC1709240ua2, boolean z, int i) {
        EnumC1711310udN enumC1711310udN;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        ArrayList<C1712720ufe> arrayList;
        String str5;
        ArrayList<C1712690ufb> arrayList2;
        LinkBlock linkBlock;
        Function1<Integer, Unit> function1;
        int i2;
        RefundArrivingTime refundArrivingTime;
        boolean z3 = z;
        EnumC1709240ua2 enumC1709240ua22 = enumC1709240ua2;
        if ((i & 1) != 0) {
            enumC1709240ua22 = c1712670ufZ.LL;
        }
        if ((i & 2) != 0) {
            enumC1711310udN = c1712670ufZ.LLILLJJLI;
        } else {
            enumC1711310udN = null;
        }
        if ((i & 4) != 0) {
            str = c1712670ufZ.LLILLL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = c1712670ufZ.LLILZ;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = c1712670ufZ.LLILZIL;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z2 = c1712670ufZ.LLILZLL;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c1712670ufZ.LLIZ;
        }
        if ((i & 128) != 0) {
            str4 = c1712670ufZ.LLIZLLLIL;
        } else {
            str4 = null;
        }
        if ((i & 256) != 0) {
            arrayList = c1712670ufZ.LLJ;
        } else {
            arrayList = null;
        }
        if ((i & 512) != 0) {
            str5 = c1712670ufZ.LLJI;
        } else {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            arrayList2 = c1712670ufZ.LLJIJIL;
        } else {
            arrayList2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            linkBlock = c1712670ufZ.LLJILJIL;
        } else {
            linkBlock = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function1 = c1712670ufZ.LLJILJILJ;
        } else {
            function1 = null;
        }
        if ((i & 8192) != 0) {
            i2 = c1712670ufZ.LLJILLL;
        } else {
            i2 = 0;
        }
        if ((i & 16384) != 0) {
            refundArrivingTime = c1712670ufZ.LLJJ;
        } else {
            refundArrivingTime = null;
        }
        c1712670ufZ.getClass();
        return new C1712670ufZ(enumC1709240ua22, enumC1711310udN, str, str2, str3, z2, z3, str4, arrayList, str5, arrayList2, linkBlock, function1, i2, refundArrivingTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1712670ufZ(EnumC1709240ua2 enumC1709240ua2, EnumC1711310udN enumC1711310udN, String str, String str2, String str3, boolean z, boolean z2, String str4, ArrayList<C1712720ufe> arrayList, String str5, ArrayList<C1712690ufb> arrayList2, LinkBlock linkBlock, Function1<? super Integer, Unit> function1, int i, RefundArrivingTime refundArrivingTime) {
        this.LL = enumC1709240ua2;
        this.LLILLJJLI = enumC1711310udN;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = str4;
        this.LLJ = arrayList;
        this.LLJI = str5;
        this.LLJIJIL = arrayList2;
        this.LLJILJIL = linkBlock;
        this.LLJILJILJ = function1;
        this.LLJILLL = i;
        this.LLJJ = refundArrivingTime;
    }
}
