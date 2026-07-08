package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$2", f = "PlaySubtitleConfigController.kt", l = {60}, m = "invokeSuspend")
public final class C710790RuP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C710790RuP(InterfaceC1364105Vn<? super C710790RuP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710790RuP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaySubtitleConfigController@5709.<init>$2");
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
            final C05YD<C710770RuN> c05ydLJJLJ = C161N.LIZIZ.LJJLJ();
            InterfaceC346201Wa<C710770RuN> interfaceC346201Wa = new InterfaceC346201Wa<C710770RuN>() { // from class: X.0RuR
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C710770RuN> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c05ydLJJLJ.collect(new C710820RuS(interfaceC346701Wf), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            InterfaceC346701Wf<? super C710770RuN> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0RuQ
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C20702615zk.LIZIZ.LJ(((C710770RuN) obj2).LIZIZ);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PlaySubtitleConfigController@5709.<init>$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.<init>$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C710790RuP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
