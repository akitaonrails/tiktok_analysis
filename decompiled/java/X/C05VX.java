package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05VX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$ChatList$2$1$1", f = "TakoAIVideoInputAssem.kt", l = {500}, m = "invokeSuspend")
public final class C05VX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAIVideoInputAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC1690500u5o LLILLL;
    public final /* synthetic */ C1677480tko<C1668650tWZ, C1677280tkU> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VX(TakoAIVideoInputAssem takoAIVideoInputAssem, InterfaceC1690500u5o interfaceC1690500u5o, C1677480tko<C1668650tWZ, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05VX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoInputAssem;
        this.LLILLL = interfaceC1690500u5o;
        this.LLILZ = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1");
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
            TakoAIVideoInputAssem takoAIVideoInputAssem = this.LLILLJJLI;
            C05VZ c05vz = takoAIVideoInputAssem.LLJILLL;
            if (c05vz == null) {
                synchronized (takoAIVideoInputAssem) {
                    c05vz = takoAIVideoInputAssem.LLJILLL;
                    if (c05vz == null) {
                        C0QSJ c0qsjSo = takoAIVideoInputAssem.So();
                        if (c0qsjSo != null) {
                            c05vz = (C05VZ) c0qsjSo.getAbility(C05VZ.class);
                            C687700QyG.LJ(c05vz, C05VZ.class);
                        } else {
                            c05vz = null;
                        }
                        takoAIVideoInputAssem.LLJILLL = c05vz;
                    }
                }
            }
            C1768706wH c1768706wH = new C1768706wH(this.LLILLL, c05vz.getBottomHeight(), 0);
            C05U6 c05u6 = new C05U6(this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJII(c1768706wH, this, c05u6) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
