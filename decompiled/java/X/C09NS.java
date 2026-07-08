package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09NS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.BotSharePostKt$postBotShareImage$1$savedBgPath$1", f = "BotSharePost.kt", l = {}, m = "invokeSuspend")
public final class C09NS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09NS(Context context, Bitmap bitmap, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09NS(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLIZLLL;
        C1C7U.LIZ("BotSharePostKt@d29e.postBotShareImage$1$savedBgPath$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null) {
            strLIZLLL = C09NP.LIZLLL(this.LLILLJJLI, bitmap, C09NP.LIZ(bitmap));
        } else {
            strLIZLLL = null;
        }
        C1C7U.LIZIZ("BotSharePostKt@d29e.postBotShareImage$1$savedBgPath$1");
        return strLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
