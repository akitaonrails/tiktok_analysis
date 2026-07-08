package X;

import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10Hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$doReeditRequest$1$3$1", f = "ReplaceMusicServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C19220610Hk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ReplaceMusicServiceImpl LL;
    public final /* synthetic */ StripMusicRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19220610Hk(ReplaceMusicServiceImpl replaceMusicServiceImpl, StripMusicRequest stripMusicRequest, InterfaceC1364105Vn<? super C19220610Hk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = replaceMusicServiceImpl;
        this.LLILLJJLI = stripMusicRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19220610Hk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.doReeditRequest$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.showMusicStripResult(false, this.LLILLJJLI, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doReeditRequest$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
