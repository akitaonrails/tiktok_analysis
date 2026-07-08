package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel$createAigcWallpaper$1", f = "BaseAigcWallpaperViewModel.kt", l = {141, 144, 154, 164, 172, 185}, m = "invokeSuspend")
public final class C943080aeI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ BaseAigcWallpaperViewModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943080aeI(BaseAigcWallpaperViewModel baseAigcWallpaperViewModel, String str, String str2, long j, InterfaceC1364105Vn<? super C943080aeI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = baseAigcWallpaperViewModel;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C943080aeI(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #3 {all -> 0x01ec, blocks: (B:45:0x00ff, B:47:0x010e, B:41:0x00e7), top: B:99:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:52:0x0125, B:48:0x0113, B:53:0x012c, B:70:0x01ac), top: B:96:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943080aeI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
