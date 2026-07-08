package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResource$1", f = "DownloadEditPostPhotoManager.kt", l = {131}, m = "invokeSuspend")
public final class C1445650nit extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ InterfaceC1445690nix LLIZLLLIL;
    public final /* synthetic */ C1445720nj0 LLJ;
    public final /* synthetic */ C118300cf LLJI;
    public final /* synthetic */ C259800zU<String> LLJIJIL;
    public final /* synthetic */ long LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445650nit(List<PhotoModeImageUrlModel> list, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1445690nix interfaceC1445690nix, C1445720nj0 c1445720nj0, C118300cf c118300cf3, C259800zU<String> c259800zU, long j, InterfaceC1364105Vn<? super C1445650nit> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = interfaceC1445690nix;
        this.LLJ = c1445720nj0;
        this.LLJI = c118300cf3;
        this.LLJIJIL = c259800zU;
        this.LLJILJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1445650nit c1445650nit = new C1445650nit(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1445650nit.LLILZ = obj;
        return c1445650nit;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445650nit.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
