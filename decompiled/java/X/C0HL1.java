package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HL1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM$uploadImageAndGenerateSocialAvatarImpl$4", f = "BaseSocialAvatarCreationVM.kt", l = {361}, m = "invokeSuspend")
public final class C0HL1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseSocialAvatarCreationVM LLILLJJLI;
    public final /* synthetic */ EnumC439310HKn LLILLL;
    public final /* synthetic */ Boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL1(BaseSocialAvatarCreationVM baseSocialAvatarCreationVM, EnumC439310HKn enumC439310HKn, Boolean bool, InterfaceC1364105Vn<? super C0HL1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseSocialAvatarCreationVM;
        this.LLILLL = enumC439310HKn;
        this.LLILZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HL1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long jLongValue;
        Object value;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        C1C7U.LIZ("BaseSocialAvatarCreationVM@d207.uploadImageAndGenerateSocialAvatarImpl$4");
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
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class);
            this.LL = 1;
            obj = iSocialAvatarService.LJI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.uploadImageAndGenerateSocialAvatarImpl$4");
                return objLJFF;
            }
        }
        SocialAvatarQueueStatusResult socialAvatarQueueStatusResult = (SocialAvatarQueueStatusResult) obj;
        long jLongValue2 = 0;
        if (socialAvatarQueueStatusResult != null && (l5 = socialAvatarQueueStatusResult.queueWaitTime) != null && l5.longValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        BaseSocialAvatarCreationVM baseSocialAvatarCreationVM = this.LLILLJJLI;
        if (socialAvatarQueueStatusResult != null && (l4 = socialAvatarQueueStatusResult.queueWaitTime) != null) {
            jLongValue = l4.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue * 1000;
        if (socialAvatarQueueStatusResult != null && (l3 = socialAvatarQueueStatusResult.avgTaskTime) != null) {
            jLongValue2 = l3.longValue();
        }
        Long.signum(jLongValue2);
        baseSocialAvatarCreationVM.LLJJL = j + (jLongValue2 * 1000);
        BaseSocialAvatarCreationVM baseSocialAvatarCreationVM2 = this.LLILLJJLI;
        baseSocialAvatarCreationVM2.LLJL.invoke(new C438960HJe(false, z, baseSocialAvatarCreationVM2.LLJJL));
        BaseSocialAvatarCreationVM baseSocialAvatarCreationVM3 = this.LLILLJJLI;
        C2252321DDq c2252321DDq = baseSocialAvatarCreationVM3.LLJIJIL;
        do {
            value = c2252321DDq.getValue();
            l = null;
        } while (!c2252321DDq.compareAndSet(value, C0HL5.LIZ((C0HL5) value, null, baseSocialAvatarCreationVM3.LLJJL, 1)));
        if (this.LLILLL != null) {
            C439470HLd c439470HLd = C439470HLd.LIZ;
            String str = this.LLILLJJLI.vQ2().LIZIZ;
            String str2 = this.LLILLJJLI.vQ2().LIZ;
            EnumC439310HKn enumC439310HKn = this.LLILLL;
            Boolean bool = this.LLILZ;
            if (socialAvatarQueueStatusResult != null) {
                l2 = socialAvatarQueueStatusResult.queueWaitTime;
                l = socialAvatarQueueStatusResult.avgTaskTime;
            } else {
                l2 = null;
            }
            c439470HLd.getClass();
            C439470HLd.LIZIZ(str, str2, enumC439310HKn, bool, l2, l);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.uploadImageAndGenerateSocialAvatarImpl$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
