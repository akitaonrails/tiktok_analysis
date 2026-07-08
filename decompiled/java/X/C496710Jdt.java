package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader.PcsServiceInfoHeaderVM;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0Jdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496710Jdt extends C09AY implements Function1<C496720Jdu, C496720Jdu> {
    public final /* synthetic */ PcsServiceInfoHeaderVM LL;
    public final /* synthetic */ SMBPreviewResponse.ResponseData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496710Jdt(PcsServiceInfoHeaderVM pcsServiceInfoHeaderVM, SMBPreviewResponse.ResponseData responseData) {
        super(1);
        this.LL = pcsServiceInfoHeaderVM;
        this.LLILLJJLI = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C496720Jdu invoke(C496720Jdu c496720Jdu) {
        C496700Jds c496700Jds = this.LL.getState().LL;
        SMBPreviewResponse.ResponseData responseData = this.LLILLJJLI;
        C496700Jds c496700Jds2 = new C496700Jds(responseData, c496700Jds.LIZIZ, c496700Jds.LIZJ, c496700Jds.LIZLLL, c496700Jds.LJ, c496700Jds.LJFF, C1822100xW4.LIZ(responseData), C1822100xW4.LIZIZ(this.LLILLJJLI), c496700Jds.LJIIIIZZ, c496700Jds.LJIIIZ, c496700Jds.LJIIJ);
        c496720Jdu.getClass();
        return new C496720Jdu(c496700Jds2);
    }
}
