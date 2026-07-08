package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0niz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResourceNew$1", f = "DownloadEditPostPhotoManager.kt", l = {165, 187}, m = "invokeSuspend")
public final class C1445710niz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1445720nj0 LLILZ;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ AtomicInteger LLIZ;
    public final /* synthetic */ AtomicInteger LLIZLLLIL;
    public final /* synthetic */ AtomicReference<String> LLJ;
    public final /* synthetic */ InterfaceC1445690nix LLJI;
    public final /* synthetic */ AtomicInteger LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445710niz(C1445720nj0 c1445720nj0, List<PhotoModeImageUrlModel> list, long j, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicReference<String> atomicReference, InterfaceC1445690nix interfaceC1445690nix, AtomicInteger atomicInteger3, InterfaceC1364105Vn<? super C1445710niz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1445720nj0;
        this.LLILZIL = list;
        this.LLILZLL = j;
        this.LLIZ = atomicInteger;
        this.LLIZLLLIL = atomicInteger2;
        this.LLJ = atomicReference;
        this.LLJI = interfaceC1445690nix;
        this.LLJIJIL = atomicInteger3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1445710niz(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(2:51|7)|45|25|(1:29)|19|(9:47|21|22|(3:24|30|31)|45|25|(0)|19|(3:32|43|44)(0))(0)|35|36|(1:38)|39|(1:41)|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ab, blocks: (B:19:0x0063, B:21:0x0069, B:27:0x0080, B:32:0x008e, B:29:0x0086), top: B:47:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: Exception -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ab, blocks: (B:19:0x0063, B:21:0x0069, B:27:0x0080, B:32:0x008e, B:29:0x0086), top: B:47:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:45:0x007c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445710niz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
