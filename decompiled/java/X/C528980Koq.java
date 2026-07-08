package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Koq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager$loadLiveRecordingsData$1$1$2", f = "LiveRecordingsDataManager.kt", l = {}, m = "invokeSuspend")
public final class C528980Koq extends C09AX implements Function2<InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveRecordingsDataManager LLILLJJLI;
    public final /* synthetic */ InterfaceC528570KoB LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528980Koq(boolean z, LiveRecordingsDataManager liveRecordingsDataManager, InterfaceC528570KoB interfaceC528570KoB, InterfaceC1364105Vn<? super C528980Koq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = liveRecordingsDataManager;
        this.LLILLL = interfaceC528570KoB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C528980Koq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LIZLLL(C533770KwZ.LIZIZ, "LiveRecordingsDataManager", "loadLiveRecordingsData: onEmpty");
        if (this.LL) {
            this.LLILLJJLI.LLJI = C13BV.INSTANCE;
        }
        this.LLILLL.LIZ(C13BV.INSTANCE, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
