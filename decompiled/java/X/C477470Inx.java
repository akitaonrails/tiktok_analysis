package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Inx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477470Inx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MultiTopLiveDistributeAssem LL;
    public final /* synthetic */ RecommendItem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C477750IoP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477470Inx(MultiTopLiveDistributeAssem multiTopLiveDistributeAssem, RecommendItem recommendItem, int i, long j, C477750IoP c477750IoP) {
        super(0);
        this.LL = multiTopLiveDistributeAssem;
        this.LLILLJJLI = recommendItem;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = c477750IoP;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.sp().vQ2(this.LLILLJJLI, this.LLILLL, "hangout_banner", EnumC477480Iny.DIRECT_ACCEPT_ENTRY)) {
            this.LL.Fp();
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            long j = this.LLILZ;
            c477500Io0.getClass();
            if (j > 0) {
                ((Set) C477500Io0.LIZLLL.getValue()).add(Long.valueOf(j));
            }
            C500260Jjc.LJJJLL(this.LLILZIL);
            this.LL.ip();
            C477860Ioa.LIZJ(this.LLILZ, "toplive_cover_mg_invite", "click");
        }
        return Unit.LIZ;
    }
}
