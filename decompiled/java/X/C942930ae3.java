package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ae3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel$applyAigcWallpaper$1", f = "BaseAigcWallpaperViewModel.kt", l = {308, 311, 322, 343, 355, 365, 371}, m = "invokeSuspend")
public final class C942930ae3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public C238400w2 LLILLL;
    public int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ BaseAigcWallpaperViewModel LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C942930ae3(boolean z, BaseAigcWallpaperViewModel baseAigcWallpaperViewModel, Function0<Unit> function0, String str, Function0<Unit> function02, boolean z2, String str2, int i, String str3, String str4, InterfaceC1364105Vn<? super C942930ae3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = baseAigcWallpaperViewModel;
        this.LLIZ = function0;
        this.LLIZLLLIL = str;
        this.LLJ = function02;
        this.LLJI = z2;
        this.LLJIJIL = str2;
        this.LLJILJIL = i;
        this.LLJILJILJ = str3;
        this.LLJILLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C942930ae3(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150 A[PHI: r5 r11
      0x0150: PHI (r5v10 X.00w2) = (r5v18 X.00w2), (r5v19 X.00w2), (r5v20 X.00w2) binds: [B:59:0x010b, B:61:0x0115, B:68:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r11v2 X.0aE4) = (r11v0 X.0aE4), (r11v0 X.0aE4), (r11v4 X.0aE4) binds: [B:59:0x010b, B:61:0x0115, B:68:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152 A[Catch: all -> 0x01e0, TRY_ENTER, TryCatch #0 {all -> 0x01e0, blocks: (B:68:0x0149, B:72:0x0152, B:74:0x0158, B:64:0x012d), top: B:159:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942930ae3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
