package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.FaceDetectionManagerImpl$savePhoto$2", f = "FaceDetectionManager.kt", l = {}, m = "invokeSuspend")
public final class C2478409nS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C1684860twi LLILLJJLI;
    public final /* synthetic */ C1684810twd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2478409nS(Bitmap bitmap, C1684860twi c1684860twi, C1684810twd c1684810twd, InterfaceC1364105Vn<? super C2478409nS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c1684860twi;
        this.LLILLL = c1684810twd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2478409nS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String path;
        C1C7U.LIZ("FaceDetectionManagerImpl@fed.savePhoto$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI.LJ);
            sbLIZ.append('_');
            sbLIZ.append(this.LLILLJJLI.LIZ.name());
            sbLIZ.append('_');
            sbLIZ.append(curUserId);
            sbLIZ.append(".jpg");
            path = new C0VSJ(this.LLILLL.LIZJ, C2188811AlT.LIZIZ(sbLIZ)).getPath();
            C2477909nN.LJI(this.LL, path, Bitmap.CompressFormat.JPEG, 0, 4);
        } else {
            path = "";
        }
        C1C7U.LIZIZ("FaceDetectionManagerImpl@fed.savePhoto$2");
        return path;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
