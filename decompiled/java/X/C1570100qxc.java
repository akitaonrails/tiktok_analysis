package X;

import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570100qxc extends C09AY implements Function0<InterfaceC1570900qyu> {
    public final /* synthetic */ MFFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570100qxc(MFFeedAssem mFFeedAssem) {
        super(0);
        this.LL = mFFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1570900qyu invoke() {
        HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LL.LLJ.getValue();
        if (homepageIconServiceApi != null) {
            return homepageIconServiceApi.LIZ((InterfaceC1617760sCU) this.LL.LLJIJIL.getValue());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
