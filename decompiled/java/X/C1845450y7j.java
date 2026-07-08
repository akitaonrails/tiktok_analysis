package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateTag;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845450y7j implements InterfaceC1845470y7l {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final List<CreativeTemplateTag> LLILZIL;
    public final String LLILZLL;
    public final List<CreativeTemplateAsset> LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final List<BaseVideo> LLJ;
    public final Map<String, String> LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845450y7j)) {
            return false;
        }
        C1845450y7j c1845450y7j = (C1845450y7j) obj;
        return Intrinsics.LJFF(this.LL, c1845450y7j.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1845450y7j.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1845450y7j.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1845450y7j.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1845450y7j.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1845450y7j.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1845450y7j.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1845450y7j.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1845450y7j.LLJ) && Intrinsics.LJFF(this.LLJI, c1845450y7j.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1845450y7j.LLJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Integer num = this.LLILZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<CreativeTemplateTag> list = this.LLILZIL;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        List<CreativeTemplateAsset> list2 = this.LLIZ;
        int iHashCode4 = (((((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        Map<String, String> map = this.LLJI;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLJIJIL;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TakoCreateVideoTemplateItem(id=" + this.LL + ", picUrl=" + this.LLILLJJLI + ", prompt=" + this.LLILLL + ", type=" + this.LLILZ + ", tags=" + this.LLILZIL + ", nameText=" + this.LLILZLL + ", assets=" + this.LLIZ + ", onClick=" + this.LLIZLLLIL + ", videos=" + this.LLJ + ", mobParams=" + this.LLJI + ", skillInfo=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1845470y7l
    public final List<CreativeTemplateAsset> LJIIJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1845470y7l
    public final Function0<Unit> LJIILJJIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1845470y7l
    public final String LLJLILLLLZIIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1845470y7l
    public final String getId() {
        return this.LL;
    }

    @Override // X.InterfaceC1845470y7l
    public final String getPicUrl() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1845470y7l
    public final List<CreativeTemplateTag> getTags() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1845470y7l
    public final Integer getType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1845450y7j) && Intrinsics.LJFF(((C1845450y7j) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1845450y7j) && Intrinsics.LJFF(((C1845450y7j) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    public C1845450y7j(String str, String str2, String str3, Integer num, List<CreativeTemplateTag> list, String str4, List<CreativeTemplateAsset> list2, Function0<Unit> function0, List<BaseVideo> list3, Map<String, String> map, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = list;
        this.LLILZLL = str4;
        this.LLIZ = list2;
        this.LLIZLLLIL = function0;
        this.LLJ = list3;
        this.LLJI = map;
        this.LLJIJIL = str5;
    }
}
