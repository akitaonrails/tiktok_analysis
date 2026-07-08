package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202170hOB extends C09AY implements Function2<Integer, String, Unit> {
    public final /* synthetic */ LocationServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Cert LLILZ;
    public final /* synthetic */ Cert LLILZIL;
    public final /* synthetic */ InterfaceC687820QyS LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202170hOB(Cert cert, Cert cert2, LocationServiceImpl locationServiceImpl, InterfaceC687820QyS interfaceC687820QyS, Long l, String str, String str2) {
        super(2);
        this.LL = locationServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = cert;
        this.LLILZIL = cert2;
        this.LLILZLL = interfaceC687820QyS;
        this.LLIZ = l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String str2 = str;
        if (iIntValue == 0) {
            LocationServiceImpl locationServiceImpl = this.LL;
            String str3 = this.LLILLJJLI;
            String str4 = this.LLILLL;
            Cert cert = this.LLILZ;
            Cert cert2 = this.LLILZIL;
            InterfaceC687820QyS interfaceC687820QyS = this.LLILZLL;
            Long l = this.LLIZ;
            locationServiceImpl.getClass();
            LocationServiceImpl.LJJ(str3, str4, cert, cert2, interfaceC687820QyS, l);
        } else {
            InterfaceC687820QyS interfaceC687820QyS2 = this.LLILZLL;
            if (str2 == null) {
                str2 = "Location SDK init failed";
            }
            interfaceC687820QyS2.onError(iIntValue, str2);
        }
        return Unit.LIZ;
    }
}
