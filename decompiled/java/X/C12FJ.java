package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.BotSharePostKt$postBotShareImage$1", f = "BotSharePost.kt", l = {39, 41, 48}, m = "invokeSuspend")
public final class C12FJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AIBotInfo LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ InterfaceC665370Q7z LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ Bitmap LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12FJ(InterfaceC665370Q7z interfaceC665370Q7z, View view, Context context, Bitmap bitmap, InterfaceC1364105Vn<? super C12FJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC665370Q7z;
        this.LLILZLL = view;
        this.LLIZ = context;
        this.LLIZLLLIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12FJ(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12FJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
