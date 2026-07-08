package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10326042a implements InterfaceC746802vq {
    public final int LL;
    public final SaleProp LLILLJJLI;
    public final List<String> LLILLL;
    public final List<C042Y> LLILZ;
    public final SizeGuide LLILZIL;
    public final String LLILZLL;
    public final List<C2172401A0g> LLIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuImageWithTextPropItem(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectIdList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", itemInfoList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sizeGuide=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C10326042a.class.hashCode();
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return this.LLILZLL;
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
        if (!(interfaceC1891350zJl instanceof C10326042a)) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(interfaceC1891350zJl, this));
    }

    public C10326042a(int i, SaleProp saleProp, List<String> list, List<C042Y> list2, SizeGuide sizeGuide) {
        this.LL = i;
        this.LLILLJJLI = saleProp;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = sizeGuide;
        this.LLILZLL = saleProp.propName;
        ArrayList arrayList = new ArrayList();
        for (C042Y c042y : (ArrayList) list2) {
            Image image = c042y.LLILZ;
            if (image != null) {
                arrayList.add(new C2172401A0g(image, c042y.LLILLJJLI, c042y.LLILLL, c042y.LLIZLLLIL, c042y.LLJI, c042y.LLILZLL));
            }
        }
        this.LLIZ = arrayList;
    }
}
