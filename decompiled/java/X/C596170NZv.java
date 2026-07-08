package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getconversationinfo.GetConversationInfoListWithoutMsgUseCase$getAndSave$2$resultPair$1", f = "GetConversationInfoListWithoutMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C596170NZv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<C0Y8T, Boolean>>, Object> {
    public final /* synthetic */ C0Y1O LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ ConversationInfoV2 LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596170NZv(C0Y1O c0y1o, int i, long j, ConversationInfoV2 conversationInfoV2, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C596170NZv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y1o;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = conversationInfoV2;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596170NZv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$2$resultPair$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<C0Y8T, Boolean> pairInvoke = this.LL.LIZJ.invoke(C2286608xc.LJ(this.LLILLJJLI), C2286608xc.LJFF(this.LLILLL), this.LLILZ, this.LLILZIL.element);
        C1C7U.LIZIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$2$resultPair$1");
        return pairInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<C0Y8T, Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
