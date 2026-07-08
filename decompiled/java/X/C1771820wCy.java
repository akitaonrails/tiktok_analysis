package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771820wCy extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1515820pY4<C1515870pY9<ECMixMallPageDTO>> LLILLL;
    public final /* synthetic */ C1494600ozq<?> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771820wCy(boolean z, boolean z2, C1515820pY4<C1515870pY9<ECMixMallPageDTO>> c1515820pY4, C1494600ozq<?> c1494600ozq) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c1515820pY4;
        this.LLILZ = c1494600ozq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PAGE_STREAM_META hitPreload=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" hitPreread=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" streamId=");
        sbLIZ.append(System.identityHashCode(this.LLILLL));
        sbLIZ.append(" reqInfoNull=");
        sbLIZ.append(this.LLILZ == null);
        sbLIZ.append(" urlPresent=");
        C1494600ozq<?> c1494600ozq = this.LLILZ;
        sbLIZ.append((c1494600ozq == null || c1494600ozq.LJIIZILJ == null) ? false : true);
        sbLIZ.append(" reqLogLen=");
        C1494600ozq<?> c1494600ozq2 = this.LLILZ;
        sbLIZ.append((c1494600ozq2 == null || (str = c1494600ozq2.LJJIIJ) == null) ? -1 : str.length());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
