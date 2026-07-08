package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DKV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoDetailActivity$onCreate$1$videoData$1", f = "TakoVideoDetailActivity.kt", l = {}, m = "invokeSuspend")
public final class C0DKV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1845270y7R>, Object> {
    public final /* synthetic */ TakoVideoDetailActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DKV(TakoVideoDetailActivity takoVideoDetailActivity, InterfaceC1364105Vn<? super C0DKV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoVideoDetailActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DKV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1845270y7R c1845270y7R;
        C1C7U.LIZ("TakoVideoDetailActivity@7eec.onCreate$1$videoData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Gson gsonLIZ = C597040NbK.LIZ();
            String str = (String) this.LL.LL.getValue();
            if (str == null) {
                str = "";
            }
            c1845270y7R = (C1845270y7R) gsonLIZ.LJII(str, C1845270y7R.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1845270y7R = null;
        }
        C1C7U.LIZIZ("TakoVideoDetailActivity@7eec.onCreate$1$videoData$1");
        return c1845270y7R;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1845270y7R> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
