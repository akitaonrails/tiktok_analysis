package X;

import android.view.View;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879000yzq implements InterfaceC1891350zJl {
    public final int LL;
    public final float LLILLJJLI;
    public final String LLILLL;
    public final C0R09 LLILZ;
    public final Pair<Integer, Integer> LLILZIL;
    public final Integer LLILZLL;
    public final Function2<Integer, View, Unit> LLIZ;
    public final Function2<Integer, View, Unit> LLIZLLLIL;
    public final EnumC1987707qV LLJ;
    public final boolean LLJI;
    public final Map<String, Object> LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879000yzq)) {
            return false;
        }
        C1879000yzq c1879000yzq = (C1879000yzq) obj;
        return this.LL == c1879000yzq.LL && Float.compare(this.LLILLJJLI, c1879000yzq.LLILLJJLI) == 0 && Intrinsics.LJFF(this.LLILLL, c1879000yzq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1879000yzq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1879000yzq.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1879000yzq.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1879000yzq.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1879000yzq.LLIZLLLIL) && this.LLJ == c1879000yzq.LLJ && this.LLJI == c1879000yzq.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1879000yzq.LLJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        return "NimbleImageItem(index=" + this.LL + ", radiusDp=" + this.LLILLJJLI + ", imageUrl=" + this.LLILLL + ", imageConfig=" + this.LLILZ + ", imageViewSize=" + this.LLILZIL + ", remainItems=" + this.LLILZLL + ", onItemShow=" + this.LLIZ + ", onItemClick=" + this.LLIZLLLIL + ", areItemTheSameStrategy=" + this.LLJ + ", setPlaceholderIntermediately=" + this.LLJI + ", dataMap=" + this.LLJIJIL + ')';
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.LL * 31) + Float.floatToIntBits(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        C0R09 c0r09 = this.LLILZ;
        int iHashCode = (iFloatToIntBits + (c0r09 == null ? 0 : c0r09.hashCode())) * 31;
        Pair<Integer, Integer> pair = this.LLILZIL;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Function2<Integer, View, Unit> function2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<Integer, View, Unit> function22 = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (function22 == null ? 0 : function22.hashCode())) * 31;
        EnumC1987707qV enumC1987707qV = this.LLJ;
        int iHashCode6 = (((iHashCode5 + (enumC1987707qV == null ? 0 : enumC1987707qV.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        Map<String, Object> map = this.LLJIJIL;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (this.LLJ == EnumC1987707qV.BY_ITEM_TYPE) {
            return Intrinsics.LJFF(C1879000yzq.class, interfaceC1891350zJl.getClass());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1879000yzq(int i, float f, String str, C0R09 c0r09, Pair<Integer, Integer> pair, Integer num, Function2<? super Integer, ? super View, Unit> function2, Function2<? super Integer, ? super View, Unit> function22, EnumC1987707qV enumC1987707qV, boolean z, Map<String, ? extends Object> map) {
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = str;
        this.LLILZ = c0r09;
        this.LLILZIL = pair;
        this.LLILZLL = num;
        this.LLIZ = function2;
        this.LLIZLLLIL = function22;
        this.LLJ = enumC1987707qV;
        this.LLJI = z;
        this.LLJIJIL = map;
    }
}
