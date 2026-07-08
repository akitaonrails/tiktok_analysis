package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.user.UserExtra;

/* JADX INFO: renamed from: X.0Jcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAnchor$asyncRequest$userDeferred$1", f = "LiveProfileRepositoryForAnchor.kt", l = {85}, m = "invokeSuspend")
public final class C496010Jcl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<User, UserExtra>>, Object> {
    public int LL;
    public final /* synthetic */ C496060Jcq LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496010Jcl(C496060Jcq c496060Jcq, boolean z, InterfaceC1364105Vn<? super C496010Jcl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c496060Jcq;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496010Jcl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        C1C7U.LIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$userDeferred$1");
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
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C495920Jcc c495920Jcc = this.LLILLJJLI.LIZ;
            long j = c495920Jcc.LJII;
            Room room = c495920Jcc.LJFF;
            Map<Long, Integer> mapLIZIZ = c495920Jcc.LIZIZ();
            boolean z = this.LLILLL;
            boolean zIsCanRecognizeEnigma = this.LLILLJJLI.LIZ.LJIIIIZZ.isCanRecognizeEnigma();
            HashMap map = new HashMap();
            map.put("target_uid", String.valueOf(j));
            map.put("sec_target_uid", UserService.getInstance().user().LJIJ(j));
            map.put("packed_level", "2");
            map.put("current_room_id", String.valueOf(room.getId()));
            map.put("request_from", "profile_card_v2");
            if (room.getOwner() != null) {
                strValueOf = String.valueOf(room.getOwner().getId());
            } else {
                strValueOf = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_id", strValueOf);
            map.put("sec_anchor_id", UserService.getInstance().user().LJIJ(room.getOwnerUserId()));
            map.put("user_role", C2348809Ig.LJIIIIZZ(mapLIZIZ));
            map.put("request_from_scene", "1");
            map.put("need_block_status", "true");
            map.put("need_preload_room", String.valueOf(z));
            map.put("can_recognize_enigma_role", String.valueOf(zIsCanRecognizeEnigma));
            AbstractC19484711Kz abstractC19484711KzLJIL = interfaceC500940JkiUser.LJIL(map);
            this.LL = 1;
            obj = C500260Jjc.LJJJJLI(abstractC19484711KzLJIL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$userDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$userDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<User, UserExtra>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
