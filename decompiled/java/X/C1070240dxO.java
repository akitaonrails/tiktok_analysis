package X;

import Y.AfS3S0211000_16;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS56S1300000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.helper.SocialRecFriendsDialogHelper$startAuthPipeline$1$1", f = "SocialRecFriendsDialogHelper.kt", l = {485}, m = "invokeSuspend")
public final class C1070240dxO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1072730e1P LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070240dxO(C1072730e1P c1072730e1P, int i, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1364105Vn<? super C1070240dxO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1072730e1P;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = function0;
        this.LLIZ = function02;
        this.LLIZLLLIL = function03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070240dxO c1070240dxO = new C1070240dxO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1070240dxO.LLILLJJLI = obj;
        return c1070240dxO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("SocialRecFriendsDialogHelper@6ca4.startAuthPipeline$1$1");
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
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1072730e1P c1072730e1P = this.LLILLL;
            int i2 = this.LLILZ;
            c1072730e1P.getClass();
            EnumC1070340dxY enumC1070340dxYLIZIZ = C1072730e1P.LIZIZ(i2);
            String str = this.LLILZIL;
            EnumC1073320e2M enumC1073320e2M = EnumC1073320e2M.FYP;
            Fragment fragment = c1072730e1P.LIZ;
            AwS56S1300000_16 awS56S1300000_16 = new AwS56S1300000_16(c1072730e1P, enumC1073320e2M, enumC1070340dxYLIZIZ, str, 6);
            C1071110dyn c1071110dyn = new C1071110dyn(fragment.requireContext());
            awS56S1300000_16.invoke(c1071110dyn);
            C095D c095dLIZ = ((C1071200dyw) c1071110dyn.LIZ()).LIZ();
            final C1072730e1P c1072730e1P2 = this.LLILLL;
            final int i3 = this.LLILZ;
            final Function0<Unit> function0 = this.LLILZLL;
            final Function0<Unit> function02 = this.LLIZ;
            final Function0<Unit> function03 = this.LLIZLLLIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0dxQ
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C1071240dz0 c1071240dz0 = (C1071240dz0) obj2;
                    int i4 = C1070230dxN.LIZ[c1071240dz0.LIZIZ.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                c1072730e1P2.getClass();
                                C1072730e1P.LJ();
                            }
                        } else if (c1071240dz0.LIZ.LIZJ) {
                            Function0<Unit> function04 = function02;
                            if (function04 != null) {
                                function04.invoke();
                            } else {
                                C1072730e1P c1072730e1P3 = c1072730e1P2;
                                int i5 = i3;
                                c1072730e1P3.getClass();
                                C1072640e1G c1072640e1G = C1072640e1G.LIZ;
                                List listSingletonList = Collections.singletonList(Integer.valueOf(i5));
                                c1072640e1G.getClass();
                                c1072730e1P3.LIZJ.LIZ(C1072640e1G.LJI(listSingletonList, true).LJJLL(new AfS3S0211000_16(i5, null, c1072730e1P3, 1), new AfS3S0211000_16(i5, null, c1072730e1P3, 0)));
                            }
                        } else {
                            Function0<Unit> function05 = function03;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        }
                    } else {
                        C1071260dz2 c1071260dz2 = c1071240dz0.LIZ;
                        if (c1071260dz2.LIZJ) {
                            C1072730e1P c1072730e1P4 = c1072730e1P2;
                            int i6 = i3;
                            c1072730e1P4.getClass();
                            C1076010e6h.LIZJ.LJFF().LIZIZ();
                            C1620050sGB c1620050sGB = (C1620050sGB) c1072730e1P4.LIZLLL.getValue();
                            if (c1620050sGB != null) {
                                c1620050sGB.LJIIJJI("permission_dialog", false, null);
                            }
                            C1072640e1G c1072640e1G2 = C1072640e1G.LIZ;
                            int iLJI = C1072730e1P.LJI(i6);
                            int value = EnumC1072920e1i.CONSENT.getValue();
                            c1072640e1G2.getClass();
                            C1072640e1G.LJ(iLJI, value);
                        } else {
                            if (c1071260dz2.LIZLLL) {
                                return Unit.LIZ;
                            }
                            Function0<Unit> function06 = function0;
                            if (function06 != null) {
                                function06.invoke();
                            } else {
                                c1072730e1P2.LIZJ(i3);
                                C1072730e1P.LJ();
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095dLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.startAuthPipeline$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.startAuthPipeline$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
