package X;

import Y.AgS203S0200000_14;
import Y.AgS295S0100000_14;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.EditToolbarAutoCutHandler$5", f = "AutoCut.kt", l = {199, 204}, m = "invokeSuspend")
public final class C861350Xqf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1459980o60 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861350Xqf(C1459980o60 c1459980o60, InterfaceC1364105Vn<? super C861350Xqf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1459980o60;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861350Xqf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<C1464760oDi> c05ydHt2;
        C05YD<C1464760oDi> c05ydHt22;
        C1C7U.LIZ("EditToolbarAutoCutHandler@4f8f.<init>$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
            throw new C2197108jB();
        }
        C155000ia.LIZIZ(obj);
        if (((Boolean) C0BOE.LIZ.getValue()).booleanValue()) {
            C1459980o60 c1459980o60 = this.LLILLJJLI;
            InterfaceC1464740oDg interfaceC1464740oDg = (InterfaceC1464740oDg) c1459980o60.LLJI.getValue(c1459980o60, C1459980o60.LLJILJIL[7]);
            if (interfaceC1464740oDg != null && (c05ydHt22 = interfaceC1464740oDg.ht2()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 73);
                this.LL = 1;
                if (c05ydHt22.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$5");
                    return objLJFF;
                }
                throw new C2197108jB();
            }
        } else {
            C013C c013c = new C013C();
            c013c.element = this.LLILLJJLI.LJFF().getAILivePhotoModel().LJII();
            C1459980o60 c1459980o602 = this.LLILLJJLI;
            InterfaceC1464740oDg interfaceC1464740oDg2 = (InterfaceC1464740oDg) c1459980o602.LLJI.getValue(c1459980o602, C1459980o60.LLJILJIL[7]);
            if (interfaceC1464740oDg2 != null && (c05ydHt2 = interfaceC1464740oDg2.ht2()) != null) {
                AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(c013c, this.LLILLJJLI, 10);
                this.LL = 2;
                if (c05ydHt2.collect(agS203S0200000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$5");
                    return objLJFF;
                }
                throw new C2197108jB();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
