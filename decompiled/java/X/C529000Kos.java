package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager$loadLiveRecordingsData$1", f = "LiveRecordingsDataManager.kt", l = {96, 112}, m = "invokeSuspend")
public final class C529000Kos extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC528570KoB LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LiveRecordingsDataManager LLILZIL;
    public final /* synthetic */ C533680KwQ LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ InterfaceC528570KoB LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529000Kos(LiveRecordingsDataManager liveRecordingsDataManager, C533680KwQ c533680KwQ, int i, boolean z, InterfaceC528570KoB interfaceC528570KoB, InterfaceC1364105Vn<? super C529000Kos> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveRecordingsDataManager;
        this.LLILZLL = c533680KwQ;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
        this.LLJ = interfaceC528570KoB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C529000Kos c529000Kos = new C529000Kos(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c529000Kos.LLILZ = obj;
        return c529000Kos;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529000Kos.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
