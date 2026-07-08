package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$loadGaussBg$1", f = "TTLiveBroadcastView.kt", l = {1220}, m = "invokeSuspend")
public final class C780090Uit extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;
    public final /* synthetic */ TTLiveBroadcastView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C780090Uit(TTLiveBroadcastView tTLiveBroadcastView, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = tTLiveBroadcastView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C780090Uit c780090Uit = new C780090Uit(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
        c780090Uit.LLILLJJLI = obj;
        return c780090Uit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTLiveBroadcastView@6190.loadGaussBg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Bitmap bitmap = C780100Uiu.LIZ;
            if (bitmap != null && C500260Jjc.LJJIFFI(Boolean.valueOf(bitmap.isRecycled()))) {
                C259800zU<Bitmap> c259800zU = this.LLILLL;
                Bitmap bitmapLIZ = C1100070ejV.LIZ(C780100Uiu.LIZ, 0.5f, 20.0f, false);
                T tCopy = bitmapLIZ;
                if (bitmapLIZ == null) {
                    Bitmap bitmap2 = C780100Uiu.LIZ;
                    if (bitmap2 != null) {
                        tCopy = bitmap2.copy(Bitmap.Config.RGB_565, false);
                    } else {
                        tCopy = 0;
                    }
                }
                c259800zU.element = tCopy;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C780070Uir c780070Uir = new C780070Uir(this.LLILZ, null, this.LLILLL);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c780070Uir) == objLJFF) {
                    C1C7U.LIZIZ("TTLiveBroadcastView@6190.loadGaussBg$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTLiveBroadcastView@6190.loadGaussBg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
