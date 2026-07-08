package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HL0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2$requestCreateSocialAvatar$5", f = "SocialAvatarCreationViewModelV2.kt", l = {327, 339}, m = "invokeSuspend")
public final class C0HL0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILLJJLI;
    public final /* synthetic */ List<DMUploadImageResult> LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL0(SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, List<DMUploadImageResult> list, float f, InterfaceC1364105Vn<? super C0HL0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarCreationViewModelV2;
        this.LLILLL = list;
        this.LLILZ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HL0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objLIZ = obj;
        C1C7U.LIZ("SocialAvatarCreationViewModelV2@c606.requestCreateSocialAvatar$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LLJLIL.invoke(EnumC439270HKj.FAILURE_INTERNET);
            this.LLILLJJLI.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_INTERNET);
        } catch (C0HKQ e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLJJLI.LLJLIL.invoke(e2.getFailureState());
            this.LLILLJJLI.LLJJLIIIJLLLLLLLZ.invoke(e2.getCreationProcess());
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLILLJJLI.LLJLIL.invoke(EnumC439270HKj.FAILURE_IMAGE_INTERNAL_ERROR);
            this.LLILLJJLI.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_IMAGE_INTERNAL_ERROR);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
                C054G c054g = C1956107lP.LIZ;
                C1956107lP.LIZIZ(this.LLILLJJLI.wQ2(), true);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.requestCreateSocialAvatar$5");
                return unit;
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = this.LLILLJJLI;
            C0HLI c0hli = socialAvatarCreationViewModelV2.LLILLL;
            List<DMUploadImageResult> list = this.LLILLL;
            EnumC439310HKn enumC439310HKn = EnumC439310HKn.METHOD_UPLOAD;
            String strWQ2 = socialAvatarCreationViewModelV2.wQ2();
            this.LL = 1;
            objLIZ = c0hli.LIZ(list, enumC439310HKn, strWQ2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.requestCreateSocialAvatar$5");
                return objLJFF;
            }
        }
        List<DMUploadImageResult> list2 = (List) objLIZ;
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJIJIL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C0HL5.LIZ((C0HL5) value, EnumC439280HKk.WAIT_QUEUE, 0L, 2)));
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV22 = this.LLILLJJLI;
        C0HLI c0hli2 = socialAvatarCreationViewModelV22.LLILLL;
        C0HL8 c0hl8 = socialAvatarCreationViewModelV22.LLJLLL;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(socialAvatarCreationViewModelV22);
        double d = this.LLILZ;
        String strWQ22 = this.LLILLJJLI.wQ2();
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV23 = this.LLILLJJLI;
        AwS620S0100000_6 awS620S0100000_6 = socialAvatarCreationViewModelV23.LLJLL;
        AwS585S0100000_6 awS585S0100000_6 = socialAvatarCreationViewModelV23.LLJJLIIIJLLLLLLLZ;
        AwS585S0100000_6 awS585S0100000_62 = socialAvatarCreationViewModelV23.LLJLILLLLZIIL;
        this.LL = 2;
        if (c0hli2.LJFF(c0hl8, viewModelScope, list2, d, "", strWQ22, false, 6, awS620S0100000_6, awS585S0100000_6, awS585S0100000_62, this) == objLJFF) {
            C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.requestCreateSocialAvatar$5");
            return objLJFF;
        }
        C054G c054g2 = C1956107lP.LIZ;
        C1956107lP.LIZIZ(this.LLILLJJLI.wQ2(), true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.requestCreateSocialAvatar$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
