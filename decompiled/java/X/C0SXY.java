package X;

import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SXY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXY extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ EarphonePlayerControlComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SXY(EarphonePlayerControlComponent earphonePlayerControlComponent) {
        super(1);
        this.LL = earphonePlayerControlComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ((IEarphonePlayerControlService) this.LL.LLILLJJLI.getValue()).LIZJ("common_feed", false);
        return Unit.LIZ;
    }
}
