package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot.NoticeMaker$setPromptNotice$1", f = "NoticeReusedSkeletonUIContent.kt", l = {498}, m = "invokeSuspend")
public final class C1678306hh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1678406hi LLILLJJLI;
    public final /* synthetic */ C1678506hj LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678306hh(C1678406hi c1678406hi, C1678506hj c1678506hj, Function0<Unit> function0, InterfaceC1364105Vn<? super C1678306hh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1678406hi;
        this.LLILLL = c1678506hj;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1678306hh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeMaker@3009.setPromptNotice$1");
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
            IPromptUnifiedFrequencyController.LIZ.getClass();
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
            C1678406hi c1678406hi = this.LLILLJJLI;
            String str = c1678406hi.LIZIZ;
            InterfaceC1677406hY interfaceC1677406hY = c1678406hi.LIZ;
            Long lLJFF = C2286608xc.LJFF(c1678406hi.LIZLLL);
            long j = this.LLILLJJLI.LJFF;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyControllerLIZ.LJII(str, interfaceC1677406hY, lLJFF, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NoticeMaker@3009.setPromptNotice$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C1674906h9 c1674906h9LIZ = this.LLILLL.LIZ();
            C1678406hi c1678406hi2 = this.LLILLJJLI;
            InterfaceC1677406hY interfaceC1677406hY2 = c1678406hi2.LIZ;
            String str2 = c1678406hi2.LIZJ;
            String str3 = c1678406hi2.LJ;
            c1674906h9LIZ.getClass();
            if (interfaceC1677406hY2 == EnumC1670906gV.SA_RECEIVE_INLINE_MESSAGE) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    Keva keva = c1674906h9LIZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sa_creation_inline_shown_");
                    sbLIZ.append(str2);
                    keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jLongValue);
                }
            } else {
                Keva keva2 = c1674906h9LIZ.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(interfaceC1677406hY2.getPromptId());
                sbLIZ2.append("_inline_shown_");
                sbLIZ2.append(str2);
                keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), str3);
            }
            this.LLILZ.invoke();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NoticeMaker@3009.setPromptNotice$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NoticeMaker@3009.setPromptNotice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
