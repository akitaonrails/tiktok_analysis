package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileItemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS223S0300000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileItemViewModel$tryGetRelationLabel$2", f = "ProfileItemViewModel.kt", l = {198}, m = "invokeSuspend")
public final class C895880ZCo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMRelationLabelService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ProfileItemViewModel LLILZ;
    public final /* synthetic */ IMUser LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C895880ZCo(IMRelationLabelService iMRelationLabelService, String str, ProfileItemViewModel profileItemViewModel, IMUser iMUser, InterfaceC1364105Vn<? super C895880ZCo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMRelationLabelService;
        this.LLILLL = str;
        this.LLILZ = profileItemViewModel;
        this.LLILZIL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C895880ZCo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileItemViewModel@636f.tryGetRelationLabel$2");
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
            IMRelationLabelService iMRelationLabelService = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = iMRelationLabelService.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileItemViewModel@636f.tryGetRelationLabel$2");
                return objLJFF;
            }
        }
        IMRelationLabelInfo iMRelationLabelInfo = (IMRelationLabelInfo) obj;
        ProfileItemViewModel profileItemViewModel = this.LLILZ;
        profileItemViewModel.LLILZIL = iMRelationLabelInfo;
        profileItemViewModel.LLILZLL = true;
        profileItemViewModel.setState(new AwS223S0300000_14(this.LLILZIL, iMRelationLabelInfo, profileItemViewModel, 22));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileItemViewModel@636f.tryGetRelationLabel$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
