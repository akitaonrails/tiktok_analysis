package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750690vet implements InterfaceC1891350zJl {
    public final Long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Long LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final Long LLIZLLLIL;
    public final boolean LLJ;
    public final StoreSellingPoint LLJI;
    public final List<SellerMessage> LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final int LLJJ;
    public final boolean LLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1750690vet)) {
            return false;
        }
        C1750690vet c1750690vet = (C1750690vet) obj;
        return Intrinsics.LJFF(this.LL, c1750690vet.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1750690vet.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1750690vet.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1750690vet.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1750690vet.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1750690vet.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1750690vet.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1750690vet.LLIZLLLIL) && this.LLJ == c1750690vet.LLJ && Intrinsics.LJFF(this.LLJI, c1750690vet.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1750690vet.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1750690vet.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1750690vet.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1750690vet.LLJILLL) && this.LLJJ == c1750690vet.LLJJ && this.LLJJI == c1750690vet.LLJJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.LLIZLLLIL;
        int iHashCode8 = (((iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        StoreSellingPoint storeSellingPoint = this.LLJI;
        int iHashCode9 = (iHashCode8 + (storeSellingPoint == null ? 0 : storeSellingPoint.hashCode())) * 31;
        List<SellerMessage> list = this.LLJIJIL;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.LLJILJIL;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJILJILJ;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.LLJILLL;
        return ((((iHashCode12 + (map != null ? map.hashCode() : 0)) * 31) + this.LLJJ) * 31) + C786410Ut5.Z2(this.LLJJI);
    }

    public final String toString() {
        return "SellerConversationItem(id=" + this.LL + ", avatarUrl=" + this.LLILLJJLI + ", name=" + this.LLILLL + ", content=" + this.LLILZ + ", time=" + this.LLILZIL + ", unreadCount=" + this.LLILZLL + ", clickUrl=" + this.LLIZ + ", createTime=" + this.LLIZLLLIL + ", isCollaborator=" + this.LLJ + ", sellingPoint=" + this.LLJI + ", messages=" + this.LLJIJIL + ", officialIconType=" + this.LLJILJIL + ", officialIconUrl=" + this.LLJILJILJ + ", extTrackParams=" + this.LLJILLL + ", role=" + this.LLJJ + ", isUpdatedByPigeon=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long l;
        if ((interfaceC1891350zJl instanceof C1750690vet) && (l = this.LL) != null && Intrinsics.LJFF(l, ((C1750690vet) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    public static C1750690vet LIZ(C1750690vet c1750690vet, String str, Long l, Integer num, List list, boolean z, int i) {
        Long l2;
        String str2;
        String str3;
        String str4;
        Long l3;
        boolean z2;
        StoreSellingPoint storeSellingPoint;
        String str5;
        String str6;
        int i2;
        boolean z3 = z;
        List list2 = list;
        Integer num2 = num;
        Long l4 = l;
        String str7 = str;
        Map<String, String> map = null;
        if ((i & 1) != 0) {
            l2 = c1750690vet.LL;
        } else {
            l2 = null;
        }
        if ((i & 2) != 0) {
            str2 = c1750690vet.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c1750690vet.LLILLL;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str7 = c1750690vet.LLILZ;
        }
        if ((i & 16) != 0) {
            l4 = c1750690vet.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1750690vet.LLILZLL;
        }
        if ((i & 64) != 0) {
            str4 = c1750690vet.LLIZ;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            l3 = c1750690vet.LLIZLLLIL;
        } else {
            l3 = null;
        }
        if ((i & 256) != 0) {
            z2 = c1750690vet.LLJ;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            storeSellingPoint = c1750690vet.LLJI;
        } else {
            storeSellingPoint = null;
        }
        if ((i & 1024) != 0) {
            list2 = c1750690vet.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str5 = c1750690vet.LLJILJIL;
        } else {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = c1750690vet.LLJILJILJ;
        } else {
            str6 = null;
        }
        if ((i & 8192) != 0) {
            map = c1750690vet.LLJILLL;
        }
        if ((i & 16384) != 0) {
            i2 = c1750690vet.LLJJ;
        } else {
            i2 = 0;
        }
        if ((i & 32768) != 0) {
            z3 = c1750690vet.LLJJI;
        }
        return new C1750690vet(l2, str2, str3, str7, l4, num2, str4, l3, z2, storeSellingPoint, list2, str5, str6, map, i2, z3);
    }

    public C1750690vet(Long l, String str, String str2, String str3, Long l2, Integer num, String str4, Long l3, boolean z, StoreSellingPoint storeSellingPoint, List<SellerMessage> list, String str5, String str6, Map<String, String> map, int i, boolean z2) {
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = l2;
        this.LLILZLL = num;
        this.LLIZ = str4;
        this.LLIZLLLIL = l3;
        this.LLJ = z;
        this.LLJI = storeSellingPoint;
        this.LLJIJIL = list;
        this.LLJILJIL = str5;
        this.LLJILJILJ = str6;
        this.LLJILLL = map;
        this.LLJJ = i;
        this.LLJJI = z2;
    }
}
