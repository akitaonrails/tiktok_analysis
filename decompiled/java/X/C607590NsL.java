package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobReadAndUnreadCountWhenRequest$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C607590NsL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC607620NsO LL;
    public final /* synthetic */ EnumC607600NsM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607590NsL(EnumC607620NsO enumC607620NsO, EnumC607600NsM enumC607600NsM, InterfaceC1364105Vn<? super C607590NsL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC607620NsO;
        this.LLILLJJLI = enumC607600NsM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607590NsL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        int size;
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobReadAndUnreadCountWhenRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC607620NsO enumC607620NsO = this.LL;
        EnumC607600NsM enumC607600NsM = this.LLILLJJLI;
        linkedHashMap.put("request_type", String.valueOf(enumC607620NsO.getValue()));
        linkedHashMap.put(Scene.SCENE_SERVICE, enumC607600NsM.getScene());
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService == null || (string = C2286608xc.LJ(iFollowReadService.getCount()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("recent_read_gid_count", string);
        if (enumC607600NsM == EnumC607600NsM.HOMEPAGE_FOLLOW) {
            C607520NsE c607520NsE = C607520NsE.LIZ;
            EnumC607570NsJ enumC607570NsJ = EnumC607570NsJ.GLOBAL;
            c607520NsE.getClass();
            Set set = (Set) C607520NsE.LIZIZ().get(enumC607570NsJ);
            if (set != null) {
                size = set.size();
            } else {
                size = 0;
            }
            linkedHashMap.put("recent_unread_gid_count", String.valueOf(size));
        }
        C20684815ws.LJIILLIIL("follow_feed_request_gid", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobReadAndUnreadCountWhenRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
