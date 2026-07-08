package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$realAddOrRefresh$1", f = "PCSBoardEffectService.kt", l = {398}, m = "invokeSuspend")
public final class C391201fa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ InterfaceC395901gL LLILLL;
    public final /* synthetic */ C388501f9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391201fa(C394101g3 c394101g3, InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9, InterfaceC1364105Vn<? super C391201fa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = interfaceC395901gL;
        this.LLILZ = c388501f9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C391201fa(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.realAddOrRefresh$1");
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
            C394101g3 c394101g3 = this.LLILLJJLI;
            InterfaceC395901gL interfaceC395901gL = this.LLILLL;
            c394101g3.getClass();
            String str = interfaceC395901gL.getConfig().LJJIFFI;
            if (C500260Jjc.LJJIIZ(str)) {
                C0UA1.LIZ().LJJZ(C397401ga.LIZIZ(interfaceC395901gL), str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image btm set:");
                sbLIZ.append(C397401ga.LIZIZ(interfaceC395901gL));
                C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C394101g3 c394101g32 = this.LLILLJJLI;
            InterfaceC395901gL interfaceC395901gL2 = this.LLILLL;
            this.LL = 1;
            obj = c394101g32.LJIJJLI(interfaceC395901gL2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.realAddOrRefresh$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (C500260Jjc.LJJIIZ(str2)) {
            C0UA1.LIZ().LJJZ(C397401ga.LIZJ(this.LLILLL), str2);
            this.LLILLL.getConfig().LJJIFFI = str2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("image top set::");
            sbLIZ2.append(C397401ga.LIZJ(this.LLILLL));
            C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLILLL.getConfig().LIZLLL = this.LLILLJJLI.LJIILIIL;
        C394501g7 config = this.LLILLL.getConfig();
        C394101g3 c394101g33 = this.LLILLJJLI;
        config.LJ = c394101g33.LJIILJJIL;
        c394101g33.LJIILL(this.LLILLL, false);
        String strLIZ = C397401ga.LIZ(this.LLILLL, this.LLILZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("addOrRefresh:");
        sbLIZ3.append(strLIZ);
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        this.LLILLJJLI.getClass();
        C394101g3.LJIL(strLIZ);
        C394101g3 c394101g34 = this.LLILLJJLI;
        InterfaceC395901gL interfaceC395901gL3 = this.LLILLL;
        C388501f9 c388501f9 = this.LLILZ;
        c394101g34.getClass();
        C394101g3.LJIIZILJ(interfaceC395901gL3, c388501f9);
        InterfaceC392301fl statusCallback = this.LLILLL.getStatusCallback();
        if (statusCallback != null) {
            statusCallback.LIZJ();
        }
        this.LLILLJJLI.LJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.realAddOrRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
