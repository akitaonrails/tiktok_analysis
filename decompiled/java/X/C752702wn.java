package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonNotice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonSkuMainOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonUIConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C752702wn extends AbstractC756202xM {
    public final List<C719102rN> LLILZLL;
    public final Map<String, Boolean> LLIZ;
    public final String LLIZLLLIL;
    public final Integer LLJ;
    public final AddonNotice LLJI;
    public final List<String> LLJIJIL;
    public final String LLJILJIL;
    public final ECRichText LLJILJILJ;
    public final Map<String, AddonSkuMainOrder> LLJILLL;
    public final Integer LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final AddonUIConfig LLJJIJI;
    public final AddonOrderButton LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ = "addon_order";
    public final String LLJJJIL = "addon_order_item";
    public boolean LLJJJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C752702wn)) {
            return false;
        }
        C752702wn c752702wn = (C752702wn) obj;
        return Intrinsics.LJFF(this.LLILZLL, c752702wn.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c752702wn.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c752702wn.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c752702wn.LLJ) && Intrinsics.LJFF(this.LLJI, c752702wn.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c752702wn.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c752702wn.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c752702wn.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c752702wn.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c752702wn.LLJJ) && Intrinsics.LJFF(this.LLJJI, c752702wn.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c752702wn.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c752702wn.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c752702wn.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c752702wn.LLJJIJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        Map<String, Boolean> map = this.LLIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLJ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        AddonNotice addonNotice = this.LLJI;
        int iHashCode5 = (iHashCode4 + (addonNotice == null ? 0 : addonNotice.hashCode())) * 31;
        List<String> list = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ECRichText eCRichText = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Map<String, AddonSkuMainOrder> map2 = this.LLJILLL;
        int iHashCode9 = (iHashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num2 = this.LLJJ;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJIII;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddonUIConfig addonUIConfig = this.LLJJIJI;
        int iHashCode13 = (iHashCode12 + (addonUIConfig == null ? 0 : addonUIConfig.hashCode())) * 31;
        AddonOrderButton addonOrderButton = this.LLJJIJIIJIL;
        int iHashCode14 = (iHashCode13 + (addonOrderButton == null ? 0 : addonOrderButton.hashCode())) * 31;
        String str5 = this.LLJJIJIL;
        return iHashCode14 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "AddonOrderVO(skuInfos=" + this.LLILZLL + ", isSelected=" + this.LLIZ + ", addonTitle=" + this.LLIZLLLIL + ", type=" + this.LLJ + ", addOnNotice=" + this.LLJI + ", filterSku=" + this.LLJIJIL + ", daInfo=" + this.LLJILJIL + ", addonOrderTitle=" + this.LLJILJILJ + ", addonSkuToMainOrder=" + this.LLJILLL + ", addonScene=" + this.LLJJ + ", recommendScene=" + this.LLJJI + ", recommentSessionId=" + this.LLJJIII + ", addonUIConfig=" + this.LLJJIJI + ", addonOrderButton=" + this.LLJJIJIIJIL + ", addonDisplayProductId=" + this.LLJJIJIL + ')';
    }

    public final List<String> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        Map<String, Boolean> map = this.LLIZ;
        if (map != null) {
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public final boolean LJ() {
        Map<String, Boolean> map = this.LLIZ;
        return map != null && (map.isEmpty() ^ true) && this.LLIZ.containsValue(Boolean.TRUE);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C752702wn) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public static C752702wn LIZIZ(C752702wn c752702wn, List list, Map map, List list2, int i) {
        String str;
        Integer num;
        AddonNotice addonNotice;
        String str2;
        ECRichText eCRichText;
        Map<String, AddonSkuMainOrder> map2;
        Integer num2;
        String str3;
        String str4;
        AddonUIConfig addonUIConfig;
        AddonOrderButton addonOrderButton;
        List list3 = list2;
        Map map3 = map;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c752702wn.LLILZLL;
        }
        if ((i & 2) != 0) {
            map3 = c752702wn.LLIZ;
        }
        String str5 = null;
        if ((i & 4) != 0) {
            str = c752702wn.LLIZLLLIL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            num = c752702wn.LLJ;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            addonNotice = c752702wn.LLJI;
        } else {
            addonNotice = null;
        }
        if ((i & 32) != 0) {
            list3 = c752702wn.LLJIJIL;
        }
        if ((i & 64) != 0) {
            str2 = c752702wn.LLJILJIL;
        } else {
            str2 = null;
        }
        if ((i & 128) != 0) {
            eCRichText = c752702wn.LLJILJILJ;
        } else {
            eCRichText = null;
        }
        if ((i & 256) != 0) {
            map2 = c752702wn.LLJILLL;
        } else {
            map2 = null;
        }
        if ((i & 512) != 0) {
            num2 = c752702wn.LLJJ;
        } else {
            num2 = null;
        }
        if ((i & 1024) != 0) {
            str3 = c752702wn.LLJJI;
        } else {
            str3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str4 = c752702wn.LLJJIII;
        } else {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            addonUIConfig = c752702wn.LLJJIJI;
        } else {
            addonUIConfig = null;
        }
        if ((i & 8192) != 0) {
            addonOrderButton = c752702wn.LLJJIJIIJIL;
        } else {
            addonOrderButton = null;
        }
        if ((i & 16384) != 0) {
            str5 = c752702wn.LLJJIJIL;
        }
        return new C752702wn(list4, map3, str, num, addonNotice, list3, str2, eCRichText, map2, num2, str3, str4, addonUIConfig, addonOrderButton, str5);
    }

    public C752702wn(List<C719102rN> list, Map<String, Boolean> map, String str, Integer num, AddonNotice addonNotice, List<String> list2, String str2, ECRichText eCRichText, Map<String, AddonSkuMainOrder> map2, Integer num2, String str3, String str4, AddonUIConfig addonUIConfig, AddonOrderButton addonOrderButton, String str5) {
        this.LLILZLL = list;
        this.LLIZ = map;
        this.LLIZLLLIL = str;
        this.LLJ = num;
        this.LLJI = addonNotice;
        this.LLJIJIL = list2;
        this.LLJILJIL = str2;
        this.LLJILJILJ = eCRichText;
        this.LLJILLL = map2;
        this.LLJJ = num2;
        this.LLJJI = str3;
        this.LLJJIII = str4;
        this.LLJJIJI = addonUIConfig;
        this.LLJJIJIIJIL = addonOrderButton;
        this.LLJJIJIL = str5;
    }
}
