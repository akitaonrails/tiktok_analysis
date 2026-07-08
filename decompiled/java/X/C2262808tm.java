package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getBitmap$2$1$1", f = "MixEditingFeatureExtractionTask.kt", l = {577}, m = "invokeSuspend")
public final class C2262808tm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C2277408w8 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262808tm(C2277408w8 c2277408w8, String str, InterfaceC1364105Vn<? super C2262808tm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2277408w8;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2262808tm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C2262908tn c2262908tn = new C2262908tn(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C099A.LIZIZ(2000L, c2262908tn, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2$1$1");
                    return objLJFF;
                }
            }
            obj2 = obj;
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            C2269208uo c2269208uo = C2269208uo.LIZ;
            int iLIZIZ = C2294208yq.LIZIZ();
            c2269208uo.getClass();
            C2269208uo.LIZ(iLIZIZ, "MixEditingFeatureExtractionTask#getBitmap", "image asset extraction timeout");
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2$1$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
