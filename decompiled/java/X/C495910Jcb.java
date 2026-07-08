package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.ComponentLayoutConfig;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAnchor$asyncRequest$layoutConfigDeferred$1", f = "LiveProfileRepositoryForAnchor.kt", l = {120}, m = "invokeSuspend")
public final class C495910Jcb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ComponentLayoutConfig>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<GetRoomProfileCardResponse> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495910Jcb(AnonymousClass0957<GetRoomProfileCardResponse> anonymousClass0957, InterfaceC1364105Vn<? super C495910Jcb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495910Jcb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ComponentLayoutConfig componentLayoutConfig;
        C1C7U.LIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$layoutConfigDeferred$1");
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
            AnonymousClass0957<GetRoomProfileCardResponse> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$layoutConfigDeferred$1");
                return objLJFF;
            }
        }
        GetRoomProfileCardResponse.ResponseData responseData = ((GetRoomProfileCardResponse) obj).data;
        if (responseData != null) {
            componentLayoutConfig = responseData.componentLayoutConfig;
        } else {
            componentLayoutConfig = null;
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$layoutConfigDeferred$1");
        return componentLayoutConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ComponentLayoutConfig> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
