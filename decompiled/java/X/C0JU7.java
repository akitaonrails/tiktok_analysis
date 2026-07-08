package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JU7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$submitEmote$1$1", f = "SubWaveEmotePageViewModel.kt", l = {446}, m = "invokeSuspend")
public final class C0JU7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0JUV LLILZIL;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU7(C0JUV c0juv, SubWaveEmotePageViewModel subWaveEmotePageViewModel, Context context, InterfaceC1364105Vn<? super C0JU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0juv;
        this.LLILZLL = subWaveEmotePageViewModel;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JU7 c0ju7 = new C0JU7(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0ju7.LLILZ = obj;
        return c0ju7;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:21:0x0088, B:23:0x008e, B:30:0x00ad), top: B:42:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:21:0x0088, B:23:0x008e, B:30:0x00ad), top: B:42:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a3 -> B:45:0x00a4). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JU7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
