package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.AutoCutAlbumHelper$createMultiEditStatusRecordData$videoSegments$1$1", f = "AutoCutAlbumHelper.kt", l = {}, m = "invokeSuspend")
public final class C09LI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Intent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LI(Intent intent, InterfaceC1364105Vn<? super C09LI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAlbumHelper@9720.createMultiEditStatusRecordData$videoSegments$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2355609Kw.INSTANCE.recheckCache(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutAlbumHelper@9720.createMultiEditStatusRecordData$videoSegments$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
