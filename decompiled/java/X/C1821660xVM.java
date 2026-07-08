package X;

import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;

/* JADX INFO: renamed from: X.0xVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821660xVM extends C09AY implements Function1<C1821680xVO, C1821680xVO> {
    public final /* synthetic */ SMBThirdPartyLinkGetBySkuResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821660xVM(SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1821680xVO invoke(C1821680xVO c1821680xVO) {
        return C1821680xVO.LIZ(c1821680xVO, this.LL, EnumC1821690xVP.SUCCESS, false, false, 12);
    }
}
