package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Khp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524630Khp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ C1DRG LLILZIL;
    public final /* synthetic */ int LLILZLL = 11;
    public final /* synthetic */ long LLIZ = 0;
    public final /* synthetic */ long LLIZLLLIL = 0;
    public final /* synthetic */ int LLJ = 1;
    public final /* synthetic */ int LLJI = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C524630Khp(long j, C19EG c19eg, boolean z, Intent intent, C1DRG c1drg) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = intent;
        this.LLILZIL = c1drg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).trackReadMetaDataDuration(this.LL);
        C524640Khq.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        return Unit.LIZ;
    }
}
