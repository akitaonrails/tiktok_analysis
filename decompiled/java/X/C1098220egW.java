package X;

import com.bytedance.android.livesdk.chatroom.network.MiddleTouchApi;
import kotlin.jvm.functions.Function0;
import webcast.api.room.UnifyBaseBusinessResponse;

/* JADX INFO: renamed from: X.0egW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098220egW extends C09AY implements Function0<C11NZ<C470590Icr<UnifyBaseBusinessResponse.Data>>> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098220egW(long j, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<C470590Icr<UnifyBaseBusinessResponse.Data>> invoke() {
        C480460Ism.LIZ().getClass();
        return ((MiddleTouchApi) C480460Ism.LIZLLL(MiddleTouchApi.class)).getMiddleTouchDataV2(this.LL, this.LLILLJJLI, 3);
    }
}
