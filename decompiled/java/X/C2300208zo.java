package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sharedar.message.handler.EffectReadyMessageHandler$loadCurrentUserAvatarAndSendToEffect$1$result$1", f = "EffectReadyMessageHandler.kt", l = {}, m = "invokeSuspend")
public final class C2300208zo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ File LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300208zo(Bitmap bitmap, File file, InterfaceC1364105Vn<? super C2300208zo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2300208zo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectReadyMessageHandler@492e.loadCurrentUserAvatarAndSendToEffect$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C2475009mu.LJFF(80, Bitmap.CompressFormat.JPEG, this.LL, this.LLILLJJLI));
        C1C7U.LIZIZ("EffectReadyMessageHandler@492e.loadCurrentUserAvatarAndSendToEffect$1$result$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
