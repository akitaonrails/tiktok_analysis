package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10Hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$doReeditRequest$1", f = "ReplaceMusicServiceImpl.kt", l = {325, 336, 339, 344}, m = "invokeSuspend")
public final class C19220510Hj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ StripMusicRequest LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ ReplaceMusicServiceImpl LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19220510Hj(StripMusicRequest stripMusicRequest, boolean z, Context context, ReplaceMusicServiceImpl replaceMusicServiceImpl, InterfaceC1364105Vn<? super C19220510Hj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = stripMusicRequest;
        this.LLILZIL = z;
        this.LLILZLL = context;
        this.LLIZ = replaceMusicServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19220510Hj(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:42:0x00bc, B:43:0x00bf, B:44:0x00c1, B:16:0x0048, B:17:0x004b, B:19:0x004f, B:22:0x005b, B:25:0x006c, B:30:0x0074, B:32:0x0082, B:33:0x0086, B:35:0x0098, B:39:0x00a3, B:13:0x0035), top: B:66:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:42:0x00bc, B:43:0x00bf, B:44:0x00c1, B:16:0x0048, B:17:0x004b, B:19:0x004f, B:22:0x005b, B:25:0x006c, B:30:0x0074, B:32:0x0082, B:33:0x0086, B:35:0x0098, B:39:0x00a3, B:13:0x0035), top: B:66:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19220510Hj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
