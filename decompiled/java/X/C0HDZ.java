package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$updateSocialAvatar$2$1$1", f = "SocialAvatarServiceImpl.kt", l = {482}, m = "invokeSuspend")
public final class C0HDZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAvatarPublishStoryService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDZ(IAvatarPublishStoryService iAvatarPublishStoryService, String str, Map<String, String> map, String str2, InterfaceC1364105Vn<? super C0HDZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iAvatarPublishStoryService;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.updateSocialAvatar$2$1$1");
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
            IAvatarPublishStoryService iAvatarPublishStoryService = this.LLILLJJLI;
            String str = this.LLILLL;
            List<C2259691DcV> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C2259691DcV("source", CardStruct.IStatusCode.DEFAULT));
            this.LL = 1;
            obj = iAvatarPublishStoryService.requestUpdateAvatar(str, listLJIILJJIL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.updateSocialAvatar$2$1$1");
                return objLJFF;
            }
        }
        this.LLILZ.put(this.LLILZIL, ((AvatarUri) obj).uri);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.updateSocialAvatar$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
