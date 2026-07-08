package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Cache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05NA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$writeCacheToKeva$1", f = "StoryArchiveV2ArchiveViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05NA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryArchiveV2Cache LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05NA(StoryArchiveV2Cache storyArchiveV2Cache, InterfaceC1364105Vn<? super C05NA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyArchiveV2Cache;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05NA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User currentUser;
        String uid;
        C1C7U.LIZ("StoryArchiveV2ArchiveViewModel@f333.writeCacheToKeva$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            String json = GsonProtectorUtils.toJson(C05N6.LIZ().getGson(), this.LL);
            Keva repo = Keva.getRepo("story_archive_v2");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache_");
            sbLIZ.append(uid);
            repo.storeString(C2188811AlT.LIZIZ(sbLIZ), json);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.writeCacheToKeva$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.writeCacheToKeva$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
