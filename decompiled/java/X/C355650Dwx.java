package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask$loadBitmapsSafely$2", f = "FaceDetectTask.kt", l = {}, m = "invokeSuspend")
public final class C355650Dwx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C0LLP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355650Dwx(List<String> list, C0LLP c0llp, InterfaceC1364105Vn<? super C355650Dwx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0llp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355650Dwx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.loadBitmapsSafely$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = null;
        try {
            List<String> list = this.LL;
            C0LLP c0llp = this.LLILLJJLI;
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                Bitmap bitmapLJJJZ = c0llp.LJJJZ(it2.next());
                if (bitmapLJJJZ != null) {
                    arrayList2.add(bitmapLJJJZ);
                }
            }
            if (arrayList2.isEmpty()) {
                this.LLILLJJLI.LJJJJJ("FaceDetectTask: No bitmaps were loaded successfully");
            } else {
                C0LLP c0llp2 = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FaceDetectTask: Successfully loaded ");
                sbLIZ.append(arrayList2.size());
                sbLIZ.append(" bitmaps");
                c0llp2.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
                arrayList = arrayList2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0LLP c0llp3 = this.LLILLJJLI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FaceDetectTask: Failed to load bitmaps: ");
            sbLIZ2.append(e.getMessage());
            c0llp3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("FaceDetectTask@fd4c.loadBitmapsSafely$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
