package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment$refreshVideoCover$1$bitmap$1", f = "FTCVideoPublishFragment.kt", l = {}, m = "invokeSuspend")
public final class C468401s2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468401s2(String str, InterfaceC1364105Vn<? super C468401s2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468401s2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FTCVideoPublishFragment@5dbf.refreshVideoCover$1$bitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LL);
        C1C7U.LIZIZ("FTCVideoPublishFragment@5dbf.refreshVideoCover$1$bitmap$1");
        return bitmapDecodeFile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
