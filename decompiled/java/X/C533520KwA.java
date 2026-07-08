package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl$release$1", f = "LiveRecordingsRepositoryImpl.kt", l = {232}, m = "invokeSuspend")
public final class C533520KwA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveRecordingsRepositoryImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533520KwA(LiveRecordingsRepositoryImpl liveRecordingsRepositoryImpl, InterfaceC1364105Vn<? super C533520KwA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsRepositoryImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533520KwA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsRepositoryImpl@495a.release$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl = this.LLILLJJLI.LIZLLL;
            this.LL = 1;
            liveRecordingsDatabaseImpl.getClass();
            Object objLIZIZ = C2296908zH.LIZIZ(new C533610KwJ(liveRecordingsDatabaseImpl, null), this);
            if (objLIZIZ != C099R.LJFF()) {
                objLIZIZ = Unit.LIZ;
            }
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("LiveRecordingsRepositoryImpl@495a.release$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsRepositoryImpl@495a.release$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
