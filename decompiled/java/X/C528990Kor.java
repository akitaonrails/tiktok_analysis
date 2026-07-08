package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager$loadLiveRecordingsData$1$1$3", f = "LiveRecordingsDataManager.kt", l = {}, m = "invokeSuspend")
public final class C528990Kor extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public C528990Kor(InterfaceC1364105Vn<? super C528990Kor> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LIZLLL(C533770KwZ.LIZIZ, "LiveRecordingsDataManager", "loadLiveRecordingsData: onCompletion");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDataManager@a824.loadLiveRecordingsData$1$1$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C528990Kor(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
