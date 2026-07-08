package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.AsyncPhotoSaver$saveBitmap$1$task$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
public final class C579150MnZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ NowsShootModel LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C579150MnZ(Bitmap bitmap, String str, boolean z, NowsShootModel nowsShootModel, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C579150MnZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = nowsShootModel;
        this.LLILZIL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C579150MnZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("AsyncPhotoSaver@c9cc.saveBitmap$1$task$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2477909nN.LJFF(this.LL, this.LLILLJJLI, Bitmap.CompressFormat.JPEG, 90);
        if (C579140MnY.LIZ.get()) {
            C1C7U.LIZIZ("AsyncPhotoSaver@c9cc.saveBitmap$1$task$1");
            return null;
        }
        if (this.LLILLL) {
            this.LLILZ.backImagePath = this.LLILLJJLI;
            str = "outer.jpg";
        } else {
            this.LLILZ.frontImagePath = this.LLILLJJLI;
            str = "inner.jpg";
        }
        String path = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZ(this.LLILZIL, C0MI0.NOW_SHARE_CACHE, "", true).getPath(), str).getPath();
        C2286708xd.LJFF(this.LLILLJJLI, path);
        if (this.LLILLL) {
            this.LLILZ.backImageSharePath = path;
        } else {
            this.LLILZ.frontImageSharePath = path;
        }
        String str2 = this.LLILLJJLI;
        C1C7U.LIZIZ("AsyncPhotoSaver@c9cc.saveBitmap$1$task$1");
        return str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
