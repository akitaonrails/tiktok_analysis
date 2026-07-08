package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173281A3q extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C2173271A3p LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173281A3q(boolean z, C2173271A3p c2173271A3p, C118300cf c118300cf) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c2173271A3p;
        this.LLILLL = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (C1655910tC1.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_discard_opt", true) != 1 || this.LL) {
            ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            if (iSpecActService != null) {
                iSpecActService.LJLIIIL();
            }
            this.LLILLJJLI.LJIIJJI(this.LLILLL.element, false);
            this.LLILLJJLI.closeRecording();
        } else {
            this.LLILLJJLI.LJ.LIZ();
            this.LLILLJJLI.LJIIJJI(this.LLILLL.element, true);
        }
        return Boolean.TRUE;
    }
}
