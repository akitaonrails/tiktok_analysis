package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146080fvi implements C050G {
    public final long LL;
    public final ImageModel LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final ImageModel LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final List<String> LLIZLLLIL;
    public final long LLJ;
    public final long LLJI;
    public final long LLJIJIL;
    public final String LLJILJIL;
    public final User.EnigmaInfo LLJILJILJ;
    public final Long LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146080fvi)) {
            return false;
        }
        C1146080fvi c1146080fvi = (C1146080fvi) obj;
        return this.LL == c1146080fvi.LL && Intrinsics.LJFF(this.LLILLJJLI, c1146080fvi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1146080fvi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1146080fvi.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1146080fvi.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1146080fvi.LLILZLL) && this.LLIZ == c1146080fvi.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1146080fvi.LLIZLLLIL) && this.LLJ == c1146080fvi.LLJ && this.LLJI == c1146080fvi.LLJI && this.LLJIJIL == c1146080fvi.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1146080fvi.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1146080fvi.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1146080fvi.LLJILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        ImageModel imageModel = this.LLILLJJLI;
        int iHashCode = (((((iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        ImageModel imageModel2 = this.LLILZIL;
        int iHashCode2 = (((((((((((((((iHashCode + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJ)) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + C786410Ut5.Y2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31;
        User.EnigmaInfo enigmaInfo = this.LLJILJILJ;
        int iHashCode3 = (iHashCode2 + (enigmaInfo == null ? 0 : enigmaInfo.hashCode())) * 31;
        Long l = this.LLJILLL;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorRecordUiItem(senderId=" + this.LL + ", senderAvatar=" + this.LLILLJJLI + ", senderName=" + this.LLILLL + ", displayTime=" + this.LLILZ + ", giftIcon=" + this.LLILZIL + ", giftName=" + this.LLILZLL + ", giftComboCount=" + this.LLIZ + ", tags=" + this.LLIZLLLIL + ", recordMsgCreateTime=" + this.LLJ + ", recordMsgId=" + this.LLJI + ", recordGroupId=" + this.LLJIJIL + ", giftEnterFrom=" + this.LLJILJIL + ", enigmaInfo=" + this.LLJILJILJ + ", diamonds=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1146080fvi) {
            C1146080fvi c1146080fvi = (C1146080fvi) interfaceC1891350zJl;
            if (c1146080fvi.LLIZ == this.LLIZ && c1146080fvi.LLJ == this.LLJ && c1146080fvi.LLJI == this.LLJI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1146080fvi(long j, ImageModel imageModel, String str, String str2, ImageModel imageModel2, String str3, int i, List<String> list, long j2, long j3, long j4, String str4, User.EnigmaInfo enigmaInfo, Long l) {
        this.LL = j;
        this.LLILLJJLI = imageModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = imageModel2;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = list;
        this.LLJ = j2;
        this.LLJI = j3;
        this.LLJIJIL = j4;
        this.LLJILJIL = str4;
        this.LLJILJILJ = enigmaInfo;
        this.LLJILLL = l;
    }
}
