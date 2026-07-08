package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0593, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel$fakeWriteOfflineDigg$1", f = "CommentLikeViewModel.kt", l = {188}, m = "invokeSuspend")
public final class AnonymousClass0593 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0593(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0593 anonymousClass0593 = new AnonymousClass0593(this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        anonymousClass0593.LLILLJJLI = obj;
        return anonymousClass0593;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentLikeViewModel@72bd.fakeWriteOfflineDigg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Object obj2 = this.LLILLJJLI;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                int i2 = this.LLILZIL;
                C1396050mQt c1396050mQt = C1396050mQt.LIZ;
                this.LLILLJJLI = obj2;
                this.LL = 1;
                c1396050mQt.getClass();
                if (C1396050mQt.LJIIIIZZ(i2, str, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentLikeViewModel@72bd.fakeWriteOfflineDigg$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C05M3 c05m3 = C05M3.LIZ;
            C05M0 c05m0 = (C05M0) C05KA.LIZ.getValue();
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) C05KA.LIZIZ.getValue();
            c05m3.getClass();
            C05M3.LIZ(c05m0, interfaceC497601wk);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLikeViewModel@72bd.fakeWriteOfflineDigg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
