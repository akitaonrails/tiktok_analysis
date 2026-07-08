package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerExtensionKt$createBackgroundVideoHandler$7$1", f = "RecordStickerExtension.kt", l = {124, 125}, m = "invokeSuspend")
public final class C064G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064G(MediaModel mediaModel, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C064G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
        this.LLILLL = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL.creativeInfo;
            this.LL = 1;
            c140d.getClass();
            obj = c140d.LJIILJJIL(mediaModel, creativeInfo, C140D.LJIIZILJ(), null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C064H c064h = new C064H(this.LLILLL, (AIGCInfo) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c064h) == objLJFF) {
            C1C7U.LIZIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerExtensionKt@6df8.createBackgroundVideoHandler$7$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
