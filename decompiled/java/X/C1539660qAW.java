package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539660qAW extends C09AY implements Function2<byte[], String, Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ C1539810qAl LLILLJJLI;
    public final /* synthetic */ Function1<C1539910qAv, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1539660qAW(C1539580qAO c1539580qAO, C1539810qAl c1539810qAl, Function1<? super C1539910qAv, Unit> function1) {
        super(2);
        this.LL = c1539580qAO;
        this.LLILLJJLI = c1539810qAl;
        this.LLILLL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(byte[] bArr, String str) {
        Integer numValueOf;
        byte[] bArr2 = bArr;
        String str2 = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hydrationCallback, bytes size: ");
        if (bArr2 != null) {
            numValueOf = Integer.valueOf(bArr2.length);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1530570pvr.LIZJ(this.LL.LIZ, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_END}, null);
        if (bArr2 != null) {
            C1539580qAO c1539580qAO = this.LL;
            C1539810qAl c1539810qAl = this.LLILLJJLI;
            C1530570pvr.LIZJ(c1539580qAO.LIZ, new EnumC1537220q6a[]{EnumC1537220q6a.SLSR_FETCH_TEMPLATE_END}, null);
            c1539580qAO.LIZIZ(bArr2, c1539810qAl.LIZLLL, c1539810qAl.LIZ);
        } else {
            C1539580qAO c1539580qAO2 = this.LL;
            Function1<C1539910qAv, Unit> function1 = this.LLILLL;
            C1537480q70 c1537480q70 = c1539580qAO2.LIZ;
            EnumC1537220q6a enumC1537220q6a = EnumC1537220q6a.SLSR_FETCH_TEMPLATE_END;
            C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{enumC1537220q6a}, null);
            if (str2 == null) {
                C1530570pvr.LIZJ(c1539580qAO2.LIZ, new EnumC1537220q6a[]{enumC1537220q6a}, null);
                c1539580qAO2.LJI(EnumC1539690qAZ.HYDRATION_FAILED, 226, "Response is failed when hydration.");
            } else {
                c1539580qAO2.LJI(EnumC1539690qAZ.HYDRATION_FAILED, 225, str2);
            }
            function1.invoke(new C1539910qAv(EnumC1539700qAa.HYDRATE_FAILED, "Response is failed when hydration"));
        }
        return Unit.LIZ;
    }
}
