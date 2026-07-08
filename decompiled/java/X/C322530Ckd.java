package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ckd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.AsyncPhotoSaver$saveBitmap$1$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
public final class C322530Ckd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>>, Object> {
    public final /* synthetic */ Bitmap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322530Ckd(Bitmap bitmap, InterfaceC1364105Vn<? super C322530Ckd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322530Ckd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair<Integer, Integer> pair;
        C1C7U.LIZ("AsyncPhotoSaver@c9cc.saveBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            pair = new C0H1X().LIZIZ(this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = new Pair<>(C2286608xc.LJ(-16777216), C2286608xc.LJ(-16777216));
        }
        C1C7U.LIZIZ("AsyncPhotoSaver@c9cc.saveBitmap$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
