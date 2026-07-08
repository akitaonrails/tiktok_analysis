package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.video.urlselector.ReuseCreationMusicUrlHook$process$1", f = "ReuseCreationMusicUrlHook.kt", l = {}, m = "invokeSuspend")
public final class C336901Sl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C336901Sl(InterfaceC1364105Vn<? super C336901Sl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C336901Sl(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReuseCreationMusicUrlHook@1cf4.process$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService != null) {
            iMusicService.initCreationMusicCache();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReuseCreationMusicUrlHook@1cf4.process$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C336901Sl(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
