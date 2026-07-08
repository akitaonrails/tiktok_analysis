package X;

import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.1CkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.ies.cutsame.source.TemplateSourceServiceImpl$startGamePlaySourceTask$1", f = "TemplateSourceService.kt", l = {205}, m = "invokeSuspend")
public final class C2239141CkS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public C2239171CkV LLILZIL;
    public C2239131CkR LLILZLL;
    public NLEModel LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ List<NLETrackSlot> LLJI;
    public final /* synthetic */ C2239171CkV LLJIJIL;
    public final /* synthetic */ C2239131CkR LLJILJIL;
    public final /* synthetic */ NLEModel LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2239141CkS(List<? extends NLETrackSlot> list, C2239171CkV c2239171CkV, C2239131CkR c2239131CkR, NLEModel nLEModel, InterfaceC1364105Vn<? super C2239141CkS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = list;
        this.LLJIJIL = c2239171CkV;
        this.LLJILJIL = c2239131CkR;
        this.LLJILJILJ = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2239141CkS(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.14iv, X.1CkQ, X.1CkR] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        final int size;
        C259800zU c259800zU;
        C259800zU c259800zU2;
        C259800zU c259800zU3;
        C2239171CkV c2239171CkV;
        C2239131CkR c2239131CkR;
        NLEModel nLEModel;
        Iterator<NLETrackSlot> it2;
        Object objLIZLLL;
        NLEResourceAV aVFile;
        String resourceFile;
        C1C7U.LIZ("TemplateSourceServiceImpl@4504.startGamePlaySourceTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLJ;
        if (i != 0) {
            if (i == 1) {
                size = this.LL;
                it2 = (Iterator) this.LLIZLLLIL;
                nLEModel = this.LLIZ;
                c2239131CkR = this.LLILZLL;
                c2239171CkV = this.LLILZIL;
                c259800zU3 = this.LLILZ;
                c259800zU2 = this.LLILLL;
                c259800zU = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            size = this.LLJI.size();
            c259800zU = new C259800zU();
            c259800zU.element = new AtomicInteger(0);
            c259800zU2 = new C259800zU();
            c259800zU2.element = new AtomicInteger(0);
            c259800zU3 = new C259800zU();
            c259800zU3.element = new AtomicBoolean(false);
            List<NLETrackSlot> list = this.LLJI;
            c2239171CkV = this.LLJIJIL;
            c2239131CkR = this.LLJILJIL;
            nLEModel = this.LLJILJILJ;
            it2 = list.iterator();
        }
        while (it2.hasNext()) {
            final NLETrackSlot next = it2.next();
            final String str = (String) C13LP.LJJJJZI(next.getProcessor());
            final C259800zU c259800zU4 = c259800zU2;
            C2239131CkR c2239131CkR2 = c2239131CkR;
            final C259800zU c259800zU5 = c259800zU;
            final C259800zU c259800zU6 = c259800zU3;
            final NLEModel nLEModel2 = nLEModel;
            final C2239131CkR c2239131CkR3 = c2239131CkR;
            final ?? r13 = new C2239131CkR() { // from class: X.1CkQ
                @Override // X.C2239131CkR, X.InterfaceC20343514iv
                public final void LIZ(NLETimeSpaceNode nLETimeSpaceNode) {
                    c259800zU4.element.getAndIncrement();
                    if (c259800zU4.element.get() >= size) {
                        c2239131CkR3.LIZ(nLEModel2);
                    }
                    c2239131CkR3.LIZIZ(0, str, "", true);
                }

                @Override // X.C2239131CkR, X.InterfaceC20343514iv
                public final void onProgress(int i2) {
                    if (!c259800zU6.element.get()) {
                        int iMin = Math.min(100, Math.max(i2, c259800zU5.element.get()));
                        c259800zU5.element.set(iMin);
                        c2239131CkR3.onProgress(iMin);
                    }
                }

                @Override // X.C2239131CkR, X.InterfaceC20343514iv
                public final void onError(int i2, String str2) {
                    if (!c259800zU6.element.get()) {
                        c2239131CkR3.onError(i2, str2);
                        c259800zU6.element.set(true);
                    }
                    c2239131CkR3.LIZIZ(i2, str, str2, false);
                }
            };
            this.LLILLJJLI = c259800zU;
            this.LLILLL = c259800zU4;
            this.LLILZ = c259800zU3;
            this.LLILZIL = c2239171CkV;
            this.LLILZLL = c2239131CkR;
            this.LLIZ = nLEModel;
            this.LLIZLLLIL = it2;
            this.LL = size;
            this.LLJ = 1;
            c2239171CkV.getClass();
            String str2 = (String) C13LP.LJJJJZI(next.getProcessor());
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) next.getMainSegment());
            if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && !a0.LJJJIL(resourceFile)) {
                final ProcessorConfig processorConfigLIZ = C20479080n.LIZ(str2);
                if (C2229261CMy.LIZ().LJI(resourceFile)) {
                    resourceFile = C2229261CMy.LIZ().LIZJ(resourceFile);
                }
                c2239171CkV.LJII = c2239171CkV.LJ(resourceFile, processorConfigLIZ);
                final long duration = next.getDuration();
                if (C2239171CkV.LIZJ(c2239171CkV.LJII)) {
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    nLETrackSlot.setMainSegment(C2239171CkV.LJFF("", c2239171CkV.LJII, processorConfigLIZ));
                    next.setEndTime(next.getStartTime() + duration);
                    next.setRenderProxy(nLETrackSlot);
                    r13.LIZ(next.getRenderProxy());
                    objLIZLLL = Unit.LIZ;
                } else {
                    final C2239171CkV c2239171CkV2 = c2239171CkV;
                    objLIZLLL = c2239171CkV.LIZLLL(resourceFile, c2239171CkV.LJII, processorConfigLIZ, r13, new Function1() { // from class: X.1CkT
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            NLETrackSlot nLETrackSlot2 = next;
                            InterfaceC20343514iv interfaceC20343514iv = r13;
                            C2239171CkV c2239171CkV3 = c2239171CkV2;
                            ProcessorConfig processorConfig = processorConfigLIZ;
                            long j = duration;
                            NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
                            String str3 = ((C2239221Cka) obj2).LIZLLL;
                            c2239171CkV3.getClass();
                            nLETrackSlot3.setMainSegment(C2239171CkV.LJFF("", str3, processorConfig));
                            nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + j);
                            nLETrackSlot2.setRenderProxy(nLETrackSlot3);
                            interfaceC20343514iv.LIZ(nLETrackSlot2.getRenderProxy());
                            return Unit.LIZ;
                        }
                    }, this);
                    if (objLIZLLL != C099R.LJFF()) {
                        objLIZLLL = Unit.LIZ;
                    }
                }
            } else {
                objLIZLLL = Unit.LIZ;
            }
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startGamePlaySourceTask$1");
                return objLJFF;
            }
            c259800zU2 = c259800zU4;
            c2239131CkR = c2239131CkR2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startGamePlaySourceTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
