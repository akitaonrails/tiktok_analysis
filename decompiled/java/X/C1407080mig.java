package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel$translateTextV2$2", f = "GalleryViewerViewModel.kt", l = {317}, m = "invokeSuspend")
public final class C1407080mig extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public GalleryViewerViewModel LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public InterfaceC1761370vw7 LLILZ;
    public Object LLILZIL;
    public C259800zU LLILZLL;
    public int LLIZ;
    public final /* synthetic */ GalleryViewerViewModel LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C259800zU<EnumC1407150min> LLJI;
    public final /* synthetic */ InterfaceC1761370vw7 LLJIJIL;
    public final /* synthetic */ View LLJILJIL;
    public final /* synthetic */ C259800zU<EnumC1407150min> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407080mig(GalleryViewerViewModel galleryViewerViewModel, String str, C259800zU<EnumC1407150min> c259800zU, InterfaceC1761370vw7 interfaceC1761370vw7, View view, C259800zU<EnumC1407150min> c259800zU2, InterfaceC1364105Vn<? super C1407080mig> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = galleryViewerViewModel;
        this.LLJ = str;
        this.LLJI = c259800zU;
        this.LLJIJIL = interfaceC1761370vw7;
        this.LLJILJIL = view;
        this.LLJILJILJ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407080mig(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0100 A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:41:0x00ab, B:42:0x00ae, B:48:0x00ba, B:50:0x00be, B:56:0x00ca, B:58:0x00ea, B:60:0x00ee, B:62:0x00f8, B:63:0x00fd, B:82:0x0141, B:64:0x0100, B:80:0x0124, B:71:0x0111, B:73:0x0115, B:9:0x003f, B:16:0x0057, B:17:0x0059, B:19:0x0062, B:21:0x0066, B:27:0x0074, B:29:0x0078, B:31:0x007c, B:33:0x0080, B:81:0x012f, B:37:0x008c, B:14:0x0051, B:15:0x0054), top: B:90:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407080mig.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
