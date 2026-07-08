package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcHelperUtil$deleteAIGCTempFilesInBackground$1", f = "ProfileAigcHelperUtil.kt", l = {}, m = "invokeSuspend")
public final class C1324405Gg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324405Gg(Context context, InterfaceC1364105Vn<? super C1324405Gg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1324405Gg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileAigcHelperUtil@82e2.deleteAIGCTempFilesInBackground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C20012913Sd c20012913Sd = C20012913Sd.LIZ;
            Context context = this.LL;
            c20012913Sd.getClass();
            C20012913Sd.LIZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAigcHelperUtil@82e2.deleteAIGCTempFilesInBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
