package X;

import android.util.Log;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager$loadLiveRecordingsData$1$1$1", f = "LiveRecordingsDataManager.kt", l = {}, m = "invokeSuspend")
public final class C529010Kot extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC528570KoB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529010Kot(InterfaceC528570KoB interfaceC528570KoB, InterfaceC1364105Vn<? super C529010Kot> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC528570KoB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C533770KwZ c533770KwZ = C533770KwZ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadLiveRecordingsData: catch: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C537680L6w.LIZ(c533770KwZ, "LiveRecordingsDataManager", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLILLJJLI.onError(th);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C529010Kot c529010Kot = new C529010Kot(this.LLILLJJLI, interfaceC1364105Vn);
        c529010Kot.LL = th;
        return c529010Kot.invokeSuspend(Unit.LIZ);
    }
}
