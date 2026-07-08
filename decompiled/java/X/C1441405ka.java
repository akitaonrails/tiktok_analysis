package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.preview.PublicGroupPreviewUtil$isPreviewConversation$$inlined$blockingResult$1", f = "PublicGroupPreviewUtil.kt", l = {131}, m = "invokeSuspend")
public final class C1441405ka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<String>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC865850Xxv LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441405ka(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC865850Xxv interfaceC865850Xxv, String str) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC865850Xxv;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1441405ka(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupPreviewUtil@67c3.isPreviewConversation$$inlined$blockingResult$1");
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
            InterfaceC865850Xxv interfaceC865850Xxv = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC865850Xxv.LJ(str, "public_group_preview_conversation", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PublicGroupPreviewUtil@67c3.isPreviewConversation$$inlined$blockingResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PublicGroupPreviewUtil@67c3.isPreviewConversation$$inlined$blockingResult$1");
        return obj;
    }
}
