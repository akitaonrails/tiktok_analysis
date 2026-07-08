package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641600PEo implements InterfaceC1015900cXk, C14NM {
    public final InterfaceC682670Qq9 LL;
    public final String LLILLJJLI;
    public final DynamicPatch LLILLL;
    public final Map<String, Object> LLILZ;
    public Float LLILZIL;
    public Float LLILZLL;
    public final Integer LLIZ;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C641600PEo) && Intrinsics.LJFF(this.LL, ((C641600PEo) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLynxListItem(fusionBlock=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        Integer num = this.LLIZ;
        if (num == null) {
            return EnumC311510CIz.TYPE_SPARK_LITE.getTypeValue();
        }
        num.intValue();
        return C649470Pdh.LJIJ(this.LLIZ.intValue()) ? EnumC311510CIz.TYPE_SPARK.getTypeValue() : EnumC311510CIz.TYPE_SPARK_LITE.getTypeValue();
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILZIL;
    }

    public C641600PEo(InterfaceC682670Qq9 interfaceC682670Qq9) {
        Integer numValueOf;
        String str;
        this.LL = interfaceC682670Qq9;
        DynamicPatch dynamicPatch = interfaceC682670Qq9.getDynamicPatch();
        this.LLILLJJLI = (dynamicPatch == null || (str = dynamicPatch.schema) == null) ? "" : str;
        DynamicPatch dynamicPatch2 = interfaceC682670Qq9.getDynamicPatch();
        if (dynamicPatch2 != null) {
            dynamicPatch2.getRawData();
        }
        DynamicPatch dynamicPatch3 = interfaceC682670Qq9.getDynamicPatch();
        this.LLILLL = dynamicPatch3;
        this.LLILZ = new LinkedHashMap();
        if (dynamicPatch3 != null) {
            int i = ViewOnAttachStateChangeListenerC648030PbN.LLJLILLLLZIIL;
            numValueOf = Integer.valueOf(C645690PUh.LIZIZ(dynamicPatch3));
        } else {
            numValueOf = null;
        }
        this.LLIZ = numValueOf;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILZLL = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILZIL = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C641600PEo) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C641600PEo) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
