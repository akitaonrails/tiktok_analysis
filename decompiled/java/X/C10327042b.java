package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10327042b implements InterfaceC746802vq {
    public final int LL;
    public final SaleProp LLILLJJLI;
    public final boolean LLILLL;
    public final List<String> LLILZ;
    public final List<C042Y> LLILZIL;
    public final SizeGuide LLILZLL;
    public final String LLIZ;
    public final List<InterfaceC1065804Eu> LLIZLLLIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuTextPropItem(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", expand=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectIdList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", itemInfoList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", sizeGuide=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C10327042b.class.hashCode();
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C10327042b)) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(interfaceC1891350zJl, this));
    }

    public C10327042b(int i, SaleProp saleProp, boolean z, List<String> list, List<C042Y> list2, SizeGuide sizeGuide) {
        InterfaceC1065804Eu c2172351A0b;
        EnumC21715119yf enumC21715119yf;
        Float fValueOf;
        this.LL = i;
        this.LLILLJJLI = saleProp;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = sizeGuide;
        this.LLIZ = saleProp.propName;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C042Y c042y : (ArrayList) list2) {
            C042W c042w = c042y.LLJIJIL;
            boolean z2 = true;
            if (c042w != C042W.NOT_EXPANDABLE) {
                String str = c042y.LLILLJJLI;
                if (c042y.LLILZIL) {
                    enumC21715119yf = EnumC21715119yf.BLOCK;
                } else if (c042y.LIZIZ()) {
                    enumC21715119yf = EnumC21715119yf.LARGE;
                } else {
                    enumC21715119yf = EnumC21715119yf.SMALL;
                }
                Image image = c042y.LLILZ;
                if (image != null) {
                    fValueOf = Float.valueOf(image.getRadio());
                } else {
                    fValueOf = null;
                }
                if (c042y.LLILLL == null && !c042y.LLJILJIL) {
                    z2 = false;
                }
                c2172351A0b = new C1A0W(str, c042w, enumC21715119yf, fValueOf, z2);
            } else {
                c2172351A0b = new C2172351A0b(c042y.LLILLJJLI, c042y.LLILLL, c042y.LLIZLLLIL, c042y.LLJI, c042y.LLILZLL, c042y.LLJJ, c042y.LLIZ);
            }
            arrayList.add(c2172351A0b);
        }
        this.LLIZLLLIL = arrayList;
    }
}
