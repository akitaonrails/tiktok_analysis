package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.duet.RecordVideoStreamLoadComponent$triggerAigcInfoGenerate$1", f = "RecordVideoStreamLoadComponent.kt", l = {321, 322}, m = "invokeSuspend")
public final class C2401709b5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1655220tAu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401709b5(String str, C1655220tAu c1655220tAu, InterfaceC1364105Vn<? super C2401709b5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1655220tAu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2401709b5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MediaModel mediaModel = new MediaModel((String) null);
            String str = this.LLILLJJLI;
            mediaModel.type = 4;
            mediaModel.relativePath = str;
            C140D c140d = C140D.LIZ;
            this.LL = 1;
            c140d.getClass();
            obj = c140d.LJIILJJIL(mediaModel, null, C140D.LJIIZILJ(), null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2401809b6 c2401809b6 = new C2401809b6(this.LLILLL, (AIGCInfo) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2401809b6) == objLJFF) {
            C1C7U.LIZIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
