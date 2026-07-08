package X;

import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ht7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel$downloadSelectedAvatars$2$onFileFoundSuccessful$1$1", f = "ProfileAigcAvatarViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1221350ht7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileAigcAvatarViewModel LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221350ht7(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, C19EG c19eg, String str, String str2, C118300cf c118300cf, C118300cf c118300cf2, List<String> list, InterfaceC1364105Vn<? super C1221350ht7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileAigcAvatarViewModel;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c118300cf;
        this.LLILZLL = c118300cf2;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1221350ht7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.downloadSelectedAvatars$2$onFileFoundSuccessful$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IAIGCAvatarService iAIGCAvatarService = (IAIGCAvatarService) this.LL.LLILLL.getValue();
        C19EG c19eg = this.LLILLJJLI;
        List listSingletonList = Collections.singletonList(this.LLILLL);
        C118300cf c118300cf = this.LLILZIL;
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LL;
        C118300cf c118300cf2 = this.LLILZLL;
        iAIGCAvatarService.ir(c19eg, new C1221410htD(profileAigcAvatarViewModel, this.LLILZ, this.LLIZ, c118300cf, c118300cf2), listSingletonList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.downloadSelectedAvatars$2$onFileFoundSuccessful$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
