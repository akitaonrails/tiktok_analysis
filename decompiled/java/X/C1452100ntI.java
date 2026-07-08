package X;

import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEPreviewMusicParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ntI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.preview.BaseTTEditPreviewComponent$changeMusic$1", f = "TiktokEditPreviewComponent.kt", l = {2124}, m = "invokeSuspend")
public final class C1452100ntI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VEPreviewMusicParams LLILLJJLI;
    public final /* synthetic */ C1452090ntH<T> LLILLL;
    public final /* synthetic */ List<VEPreviewMusicParams> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1452100ntI(C1452090ntH c1452090ntH, VEPreviewMusicParams vEPreviewMusicParams, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vEPreviewMusicParams;
        this.LLILLL = c1452090ntH;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1452100ntI(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.changeMusic$1");
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
            VEUtils.getAudioFileInfo(this.LLILLJJLI.mPath);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1452110ntJ c1452110ntJ = new C1452110ntJ(this.LLILLL, this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1452110ntJ) == objLJFF) {
                C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.changeMusic$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.changeMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
