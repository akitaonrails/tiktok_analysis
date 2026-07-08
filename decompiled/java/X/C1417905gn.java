package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.OperationCanceledException;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpFirstScreenAssetsSuspend$3$1$1", f = "MediaProvider.kt", l = {}, m = "invokeSuspend")
public final class C1417905gn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SocMediaResource LLILLL;
    public final /* synthetic */ Size LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417905gn(Context context, SocMediaResource socMediaResource, Size size, boolean z, InterfaceC1364105Vn<? super C1417905gn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = socMediaResource;
        this.LLILZ = size;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417905gn c1417905gn = new C1417905gn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1417905gn.LL = obj;
        return c1417905gn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LLILLJJLI;
        SocMediaResource socMediaResource = this.LLILLL;
        Size size = this.LLILZ;
        boolean z = this.LLILZIL;
        try {
            C23213097r c23213097r = C23212097q.LIZ;
            try {
                Bitmap bitmapLIZIZ = C23212097q.LIZIZ(context, socMediaResource.tiktokMediaModel, size);
                if (bitmapLIZIZ != null) {
                    C23213097r c23213097r2 = C23212097q.LIZ;
                    TikTokMediaModel tikTokMediaModel = socMediaResource.tiktokMediaModel;
                    if (!bitmapLIZIZ.isRecycled() && C23212097q.LIZJ(bitmapLIZIZ, size)) {
                        C23213097r c23213097r3 = C23212097q.LIZ;
                        synchronized (c23213097r3) {
                            try {
                                c23213097r3.put(C23212097q.LIZ(tikTokMediaModel, size), bitmapLIZIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    if (z) {
                        C0L21.LIZIZ(socMediaResource, bitmapLIZIZ);
                    }
                }
            } catch (OperationCanceledException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
