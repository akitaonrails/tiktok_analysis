package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startDuet$splitCallback$1$onSuccess$aigcInfo$1", f = "RecordServiceBaseImpl.kt", l = {449}, m = "invokeSuspend")
public final class C064T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064T(MediaModel mediaModel, InterfaceC1364105Vn<? super C064T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064T(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$aigcInfo$1");
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
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = this.LLILLJJLI;
            this.LL = 1;
            c140d.getClass();
            obj = c140d.LJIILJJIL(mediaModel, null, C140D.LJIIZILJ(), null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$aigcInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$aigcInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
