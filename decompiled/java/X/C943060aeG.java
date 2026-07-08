package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel$leaveWallpaper$1", f = "AigcWallpaperGuestViewModel.kt", l = {425, 429, 436, 444, 448, 453}, m = "invokeSuspend")
public final class C943060aeG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ AigcWallpaperGuestViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943060aeG(AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel, InterfaceC1364105Vn<? super C943060aeG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = aigcWallpaperGuestViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C943060aeG(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[Catch: all -> 0x0122, TRY_ENTER, TryCatch #0 {all -> 0x0122, blocks: (B:6:0x0018, B:38:0x00bb, B:43:0x00da, B:45:0x00e4, B:50:0x00ff, B:51:0x0105, B:42:0x00d7, B:49:0x00fc), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:6:0x0018, B:38:0x00bb, B:43:0x00da, B:45:0x00e4, B:50:0x00ff, B:51:0x0105, B:42:0x00d7, B:49:0x00fc), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:6:0x0018, B:38:0x00bb, B:43:0x00da, B:45:0x00e4, B:50:0x00ff, B:51:0x0105, B:42:0x00d7, B:49:0x00fc), top: B:69:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943060aeG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
