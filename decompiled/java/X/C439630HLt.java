package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM$startGenerationFlow$1", f = "BaseSocialAvatarCreationVM.kt", l = {208}, m = "invokeSuspend")
public final class C439630HLt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseSocialAvatarCreationVM LLILLJJLI;
    public final /* synthetic */ InterfaceC439810HMl LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0ZDN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439630HLt(BaseSocialAvatarCreationVM baseSocialAvatarCreationVM, InterfaceC439810HMl interfaceC439810HMl, boolean z, C0ZDN c0zdn, InterfaceC1364105Vn<? super C439630HLt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseSocialAvatarCreationVM;
        this.LLILLL = interfaceC439810HMl;
        this.LLILZ = z;
        this.LLILZIL = c0zdn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439630HLt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSocialAvatarCreationVM@d207.startGenerationFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u<C0HLC> interfaceC332260D0uXQ2 = this.LLILLJJLI.xQ2();
            final BaseSocialAvatarCreationVM baseSocialAvatarCreationVM = this.LLILLJJLI;
            final InterfaceC439810HMl interfaceC439810HMl = this.LLILLL;
            final boolean z = this.LLILZ;
            final C0ZDN c0zdn = this.LLILZIL;
            InterfaceC346701Wf<? super C0HLC> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0HLs
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object value;
                    C0HLC c0hlc = (C0HLC) obj2;
                    C0HL8 c0hl8VQ2 = baseSocialAvatarCreationVM.vQ2();
                    InterfaceC439650HLv interfaceC439650HLv = c0hlc.LIZIZ;
                    c0hl8VQ2.getClass();
                    c0hl8VQ2.LJIILJJIL = Integer.valueOf(interfaceC439650HLv.exitStep());
                    BaseSocialAvatarCreationVM baseSocialAvatarCreationVM2 = baseSocialAvatarCreationVM;
                    C439640HLu c439640HLuDetectConfig = c0hlc.LIZIZ.detectConfig();
                    BaseSocialAvatarCreationVM baseSocialAvatarCreationVM3 = baseSocialAvatarCreationVM;
                    InterfaceC439810HMl interfaceC439810HMl2 = interfaceC439810HMl;
                    boolean z2 = z;
                    C0ZDN c0zdn2 = c0zdn;
                    EnumC1684560twE enumC1684560twE = c439640HLuDetectConfig.LIZ;
                    boolean z3 = false;
                    if (enumC1684560twE != null) {
                        Rect rect = baseSocialAvatarCreationVM3.LLJJJJ;
                        final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(baseSocialAvatarCreationVM2, 198);
                        final AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6(baseSocialAvatarCreationVM2, baseSocialAvatarCreationVM3, c0hlc, 32);
                        final AwS585S0100000_6 awS585S0100000_62 = new AwS585S0100000_6(baseSocialAvatarCreationVM2, baseSocialAvatarCreationVM3, 199);
                        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aimoji_creation_flow_strategy", true) == 1) {
                            z3 = true;
                        }
                        interfaceC439810HMl2.LIZ(new C1684860twi(enumC1684560twE, z2, rect, !z3, "social_avatar"), new InterfaceC1684790twb() { // from class: X.0twI
                            @Override // X.InterfaceC1684790twb
                            public final boolean LIZLLL() {
                                return true;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
                            @Override // X.InterfaceC1684790twb
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean LIZIZ(X.C1684540twC r12) {
                                /*
                                    Method dump skipped, instruction units count: 239
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1684600twI.LIZIZ(X.0twC):boolean");
                            }

                            @Override // X.InterfaceC1684790twb
                            public final void LIZJ(C439610HLr c439610HLr) {
                                awS372S0200000_6.invoke(c439610HLr);
                            }

                            @Override // X.InterfaceC1684790twb
                            public final void LIZ(EnumC439820HMm enumC439820HMm, C1684540twC c1684540twC) {
                                awS585S0100000_62.invoke(c1684540twC);
                            }
                        });
                    } else {
                        if (c439640HLuDetectConfig.LIZJ && c0zdn2 != null) {
                            c0zdn2.LIZ(2);
                        }
                        if (c0hlc.LIZIZ.nextStage() == null) {
                            baseSocialAvatarCreationVM2.getClass();
                            C054G c054g = C1956107lP.LIZ;
                            C1956107lP.LIZIZ(baseSocialAvatarCreationVM2.wQ2(), true);
                            C2252321DDq c2252321DDq = baseSocialAvatarCreationVM2.LLJIJIL;
                            do {
                                value = c2252321DDq.getValue();
                            } while (!c2252321DDq.compareAndSet(value, C0HL5.LIZ((C0HL5) value, EnumC439280HKk.WAIT_QUEUE, 0L, 6)));
                        } else if (!c439640HLuDetectConfig.LIZIZ) {
                            ((SocialAvatarCreationViewModelV2) baseSocialAvatarCreationVM2).BQ2(c0hlc.LIZIZ, null, false);
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC332260D0uXQ2.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.startGenerationFlow$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
