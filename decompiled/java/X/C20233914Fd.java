package X;

import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20233914Fd extends C09AY implements Function1<TakoInteractGuideData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233914Fd(String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoInteractGuideData takoInteractGuideData) {
        TakoInteractGuideData takoInteractGuideData2 = takoInteractGuideData;
        takoInteractGuideData2.setFirstRoundSugSource(this.LL);
        takoInteractGuideData2.setVoiceTalkDirectly(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
