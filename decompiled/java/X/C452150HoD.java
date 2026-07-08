package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452150HoD implements InterfaceC1891350zJl {
    public final StickerItem LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Function2<StickerItem, Integer, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452150HoD)) {
            return false;
        }
        C452150HoD c452150HoD = (C452150HoD) obj;
        return Intrinsics.LJFF(this.LL, c452150HoD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c452150HoD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c452150HoD.LLILLL) && Intrinsics.LJFF(this.LLILZ, c452150HoD.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c452150HoD.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypingStickerPowerItem(sticker=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C452150HoD) && Intrinsics.LJFF(this.LL, ((C452150HoD) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long l;
        if (interfaceC1891350zJl instanceof C452150HoD) {
            StickerBase stickerBase = this.LL.stickerBase;
            Long l2 = null;
            if (stickerBase != null) {
                l = stickerBase.id;
            } else {
                l = null;
            }
            StickerBase stickerBase2 = ((C452150HoD) interfaceC1891350zJl).LL.stickerBase;
            if (stickerBase2 != null) {
                l2 = stickerBase2.id;
            }
            if (Intrinsics.LJFF(l, l2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C452150HoD(StickerItem stickerItem, Aweme aweme, String str, String str2, AwS620S0100000_6 awS620S0100000_6) {
        this.LL = stickerItem;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = awS620S0100000_6;
    }
}
