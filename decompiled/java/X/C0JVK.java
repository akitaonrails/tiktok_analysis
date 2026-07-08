package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JVK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel$submitEmote$1$1", f = "SuggestEmotePageViewModel.kt", l = {398}, m = "invokeSuspend")
public final class C0JVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C492830JUj LLILZ;
    public final /* synthetic */ SuggestEmotePageViewModel LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JVK(C492830JUj c492830JUj, SuggestEmotePageViewModel suggestEmotePageViewModel, Context context, InterfaceC1364105Vn<? super C0JVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c492830JUj;
        this.LLILZIL = suggestEmotePageViewModel;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JVK c0jvk = new C0JVK(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0jvk.LLILLL = obj;
        return c0jvk;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:21:0x0084, B:23:0x008a, B:31:0x00a9), top: B:47:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:26:0x009d, B:28:0x00a1), top: B:45:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:21:0x0084, B:23:0x008a, B:31:0x00a9), top: B:47:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:45:0x009d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JVK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
