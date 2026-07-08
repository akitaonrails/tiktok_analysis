package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$doReeditRequestV2$1", f = "ReplaceMusicServiceImpl.kt", l = {354, 363, 365, 370}, m = "invokeSuspend")
public final class C19220410Hi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ StripMusicRequest LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ ReplaceMusicServiceImpl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19220410Hi(StripMusicRequest stripMusicRequest, Context context, ReplaceMusicServiceImpl replaceMusicServiceImpl, InterfaceC1364105Vn<? super C19220410Hi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stripMusicRequest;
        this.LLILZ = context;
        this.LLILZIL = replaceMusicServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19220410Hi(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19220410Hi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
