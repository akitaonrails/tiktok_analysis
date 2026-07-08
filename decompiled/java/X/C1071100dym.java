package X;

import Y.AgS297S0100000_16;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.sdk.sug.SugAccountSubtitles$getSugToContactsSubtitle$newSyncContact$1", f = "SugAccountSubtitles.kt", l = {90}, m = "invokeSuspend")
public final class C1071100dym extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071100dym(Context context, Function0<Unit> function0, InterfaceC1364105Vn<? super C1071100dym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071100dym c1071100dym = new C1071100dym(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1071100dym.LLILLJJLI = obj;
        return c1071100dym;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SugAccountSubtitles@274f.getSugToContactsSubtitle$newSyncContact$1");
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
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(this.LLILLL, new AwS595S0100000_16((InterfaceC497601wk) this.LLILLJJLI, 383))).LIZ();
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILZ, 26);
            this.LL = 1;
            if (c095dLIZ.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("SugAccountSubtitles@274f.getSugToContactsSubtitle$newSyncContact$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugAccountSubtitles@274f.getSugToContactsSubtitle$newSyncContact$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
