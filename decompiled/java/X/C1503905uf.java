package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.data.TypingStatusReceiverTimerV2$onGetNewTypingEvent$1", f = "TypingStatusReceiverTimerV2.kt", l = {47}, m = "invokeSuspend")
public final class C1503905uf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ C0YM0 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503905uf(String str, Long l, Long l2, int i, Long l3, C0YM0 c0ym0, InterfaceC1364105Vn<? super C1503905uf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = l2;
        this.LLILZIL = i;
        this.LLILZLL = l3;
        this.LLIZ = c0ym0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503905uf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1504205ui enumC1504205ui;
        C1C7U.LIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
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
            if (this.LLILLJJLI == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
                return unit;
            }
            Long l = this.LLILLL;
            if (l != null) {
                l.longValue();
                Long l2 = this.LLILZ;
                if (l2 != null) {
                    l2.longValue();
                    IMContactApi.LIZ.getClass();
                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(this.LLILZ.toString(), null, "im_local_db");
                    if (iMUserLJIIL != null && (iMUserLJIIL.isBlock() || iMUserLJIIL.isBlocked())) {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
                        return unit2;
                    }
                    C1504105uh c1504105uh = EnumC1504205ui.Companion;
                    int i2 = this.LLILZIL;
                    c1504105uh.getClass();
                    if (i2 != 1) {
                        if (i2 != 2) {
                            enumC1504205ui = EnumC1504205ui.UNKNOWN;
                        } else {
                            enumC1504205ui = EnumC1504205ui.GROUP;
                        }
                    } else {
                        enumC1504205ui = EnumC1504205ui.SINGLE;
                    }
                    C1504005ug c1504005ug = C1504005ug.LL;
                    String str = this.LLILLJJLI;
                    c1504005ug.getClass();
                    InterfaceC1502705uT interfaceC1502705uTLIZIZ = C1504005ug.LIZIZ(str, enumC1504205ui);
                    String string = this.LLILZ.toString();
                    long jLongValue = this.LLILLL.longValue();
                    Long l3 = this.LLILZLL;
                    if (l3 != null) {
                        l3.longValue();
                    }
                    C1504405uk c1504405uk = new C1504405uk(string, jLongValue, this.LLIZ);
                    this.LL = 1;
                    if (interfaceC1502705uTLIZIZ.LJ(c1504405uk, this) == objLJFF) {
                        C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
                    return unit3;
                }
            } else {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
                return unit4;
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetNewTypingEvent$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
