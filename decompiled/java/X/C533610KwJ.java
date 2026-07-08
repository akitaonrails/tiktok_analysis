package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$release$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533610KwJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsDatabaseImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533610KwJ(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, InterfaceC1364105Vn<? super C533610KwJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsDatabaseImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533610KwJ c533610KwJ = new C533610KwJ(this.LLILLJJLI, interfaceC1364105Vn);
        c533610KwJ.LL = obj;
        return c533610KwJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.release$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C533630KwL(this.LLILLJJLI, null), 2);
        this.LLILLJJLI.LIZJ.clear();
        C2400609au.LIZLLL.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.release$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
