package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532640Kuk extends C09AY implements InterfaceC1631630sYr<String, Integer, String, String, Unit> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532640Kuk(Integer num, Long l, String str, boolean z) {
        super(4);
        this.LL = l;
        this.LLILLJJLI = num;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Integer num, String str2, String str3) {
        long jLongValue;
        int iIntValue;
        String str4 = str;
        Integer num2 = num;
        String str5 = str2;
        String str6 = str3;
        ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        if (iTemplateMobService != null) {
            Long l = this.LL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Integer num3 = this.LLILLJJLI;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            iTemplateMobService.LJ(str4, num2, str5, str6, "download_music", jLongValue, this.LLILLL, iIntValue, false, this.LLILZ, null, null, null, null, false, new LinkedHashMap());
        }
        return Unit.LIZ;
    }
}
