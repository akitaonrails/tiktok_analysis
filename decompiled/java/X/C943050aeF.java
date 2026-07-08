package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel$replyInvite$1", f = "AigcWallpaperGuestViewModel.kt", l = {282, 286, 293, 302, 305, 315}, m = "invokeSuspend")
public final class C943050aeF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ AigcWallpaperGuestViewModel LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943050aeF(AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel, int i, InterfaceC1364105Vn<? super C943050aeF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = aigcWallpaperGuestViewModel;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C943050aeF(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #1 {all -> 0x012e, blocks: (B:6:0x001a, B:38:0x00c7, B:43:0x00e8, B:45:0x00f2, B:49:0x010f, B:42:0x00e5), top: B:69:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:6:0x001a, B:38:0x00c7, B:43:0x00e8, B:45:0x00f2, B:49:0x010f, B:42:0x00e5), top: B:69:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #1 {all -> 0x012e, blocks: (B:6:0x001a, B:38:0x00c7, B:43:0x00e8, B:45:0x00f2, B:49:0x010f, B:42:0x00e5), top: B:69:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943050aeF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
