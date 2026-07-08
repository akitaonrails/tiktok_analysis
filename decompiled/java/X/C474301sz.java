package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadBitmapAndSaveToFile$2$1$onCompleted$1", f = "SearchThumbImageLoadUtil.kt", l = {}, m = "invokeSuspend")
public final class C474301sz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<File> LLILLL;
    public final /* synthetic */ Bitmap LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C474301sz(File file, InterfaceC20236714Gf<? super File> interfaceC20236714Gf, Bitmap bitmap, InterfaceC1364105Vn<? super C474301sz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
        this.LLILLL = interfaceC20236714Gf;
        this.LLILZ = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C474301sz c474301sz = new C474301sz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c474301sz.LL = obj;
        return c474301sz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchThumbImageLoadUtil@484c.loadBitmapAndSaveToFile$2$1$onCompleted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File file = this.LLILLJJLI;
        InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LLILLL;
        Bitmap bitmap = this.LLILZ;
        try {
            file.deleteOnExit();
            file.createNewFile();
            C0VSV c0vsv = new C0VSV(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                C2107108Nh.LIZ(c0vsv, null);
                C189200o6.m2constructorimpl(file);
                interfaceC20236714Gf.resumeWith(file);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            InterfaceC20236714Gf<File> interfaceC20236714Gf2 = this.LLILLL;
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(this.LLILLJJLI.delete()));
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                C189200o6.m2constructorimpl(new C098200Yq(th5));
            }
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf2.resumeWith(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadBitmapAndSaveToFile$2$1$onCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
