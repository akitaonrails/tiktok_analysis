package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.092f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$loadUploadIconAnimation$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C23071092f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ h LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23071092f(Bitmap bitmap, h hVar, String str, InterfaceC1364105Vn<? super C23071092f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = hVar;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23071092f c23071092f = new C23071092f(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c23071092f.LL = obj;
        return c23071092f;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23071092f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
