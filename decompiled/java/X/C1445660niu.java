package X;

import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0niu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResource$1$1$1", f = "DownloadEditPostPhotoManager.kt", l = {93}, m = "invokeSuspend")
public final class C1445660niu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SrcImageInfo>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public InterfaceC1445690nix LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ PhotoModeImageUrlModel LLIZ;
    public final /* synthetic */ C118300cf LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ InterfaceC1445690nix LLJI;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LLJIJIL;
    public final /* synthetic */ C1445720nj0 LLJILJIL;
    public final /* synthetic */ C118300cf LLJILJILJ;
    public final /* synthetic */ C259800zU<String> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445660niu(PhotoModeImageUrlModel photoModeImageUrlModel, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1445690nix interfaceC1445690nix, List<PhotoModeImageUrlModel> list, C1445720nj0 c1445720nj0, C118300cf c118300cf3, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C1445660niu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = photoModeImageUrlModel;
        this.LLIZLLLIL = c118300cf;
        this.LLJ = c118300cf2;
        this.LLJI = interfaceC1445690nix;
        this.LLJIJIL = list;
        this.LLJILJIL = c1445720nj0;
        this.LLJILJILJ = c118300cf3;
        this.LLJILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1445660niu(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445660niu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SrcImageInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
