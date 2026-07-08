package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListEffectsPreloadObserver$enterChatList$1", f = "ChatListEffectsPreloadObserver.kt", l = {45}, m = "invokeSuspend")
public final class C2444109hv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C2444309hx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444109hv(Context context, C2444309hx c2444309hx, InterfaceC1364105Vn<? super C2444109hv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c2444309hx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2444109hv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListEffectsPreloadObserver@b4ff.enterChatList$1");
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
            InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
            Context context = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC911530ZpPLJJIFFI.LJI(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListEffectsPreloadObserver@b4ff.enterChatList$1");
                return objLJFF;
            }
        }
        this.LLILLL.LL = ((Boolean) obj).booleanValue();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEffectsPreloadObserver@b4ff.enterChatList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
