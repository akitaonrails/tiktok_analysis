package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017960cb4 extends C09AY implements Function1<InterfaceC1022150chp, Unit> {
    public final /* synthetic */ C1022120chm LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeRawAd LLILLL;
    public final /* synthetic */ Bundle LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017960cb4(C1022120chm c1022120chm, String str, AwemeRawAd awemeRawAd, Bundle bundle, Aweme aweme, Context context, int i) {
        super(1);
        this.LL = c1022120chm;
        this.LLILLJJLI = str;
        this.LLILLL = awemeRawAd;
        this.LLILZ = bundle;
        this.LLILZIL = aweme;
        this.LLILZLL = context;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1022150chp interfaceC1022150chp) {
        InterfaceC1022150chp interfaceC1022150chp2 = interfaceC1022150chp;
        if (interfaceC1022150chp2 != null) {
            Object obj = ((ConcurrentHashMap) this.LL.LJFF).get(this.LLILLJJLI);
            EnumC1017980cb6 enumC1017980cb6 = EnumC1017980cb6.DOWNLOAD_WAITING;
            if (obj != enumC1017980cb6 && obj != EnumC1017980cb6.DOWNLOAD_STARTED) {
                this.LL.LJIJI(this.LLILLJJLI).onNext(new C1017880caw(enumC1017980cb6, this.LLILLJJLI));
                ((ConcurrentHashMap) this.LL.LJFF).put(this.LLILLJJLI, enumC1017980cb6);
                try {
                    interfaceC1022150chp2.d0(this.LLILZ, new C1ASW((C1ASX) this.LL.LJIIJ.getValue(), this.LLILZIL, this.LL));
                    this.LL.LJIIIIZZ(this.LLILLL).LJIJJLI(1, 1, null, null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("real startDownload : ");
                    sbLIZ.append(this.LLILLJJLI);
                    C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startDownload Throwable : ");
                    sbLIZ2.append(this.LLILLJJLI);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(th.getMessage());
                    C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LL.LJIIIIZZ(this.LLILLL).LJIJJLI(0, null, 1002, null);
                    this.LL.LJIIL(this.LLILZLL, this.LLILZIL, this.LLIZ);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("real startDownload ongoing: ");
                sbLIZ3.append(this.LLILLJJLI);
                C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                this.LL.LJIIIIZZ(this.LLILLL).LJIJJLI(0, null, 1009, null);
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("real startDownload but service is null: ");
            sbLIZ4.append(this.LLILLJJLI);
            C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
            this.LL.LJIIIIZZ(this.LLILLL).LJIJJLI(0, null, 1002, null);
            this.LL.LJIIL(this.LLILZLL, this.LLILZIL, this.LLIZ);
        }
        return Unit.LIZ;
    }
}
