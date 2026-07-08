package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingRootScene$onCompleteTrim$1", f = "StitchTrimmingRootScene.kt", l = {445, 446}, m = "invokeSuspend")
public final class C574420Mfw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;
    public final /* synthetic */ C19768712Wf LLILLL;
    public final /* synthetic */ StitchParams LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574420Mfw(MediaModel mediaModel, C19768712Wf c19768712Wf, StitchParams stitchParams, InterfaceC1364105Vn<? super C574420Mfw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
        this.LLILLL = c19768712Wf;
        this.LLILZ = stitchParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574420Mfw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL.LLJJIJIIJIL;
            this.LL = 1;
            c140d.getClass();
            obj = c140d.LJIILJJIL(mediaModel, creativeInfo, C140D.LJIIZILJ(), null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C574430Mfx c574430Mfx = new C574430Mfx(this.LLILZ, (AIGCInfo) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c574430Mfx) == objLJFF) {
            C1C7U.LIZIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
