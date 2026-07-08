package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audio.copyrightdetect.NLEAudioUtils$extractAudioList$2", f = "NLEAudioUtils.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C351970Dr1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351970Dr1(NLEModel nLEModel, InterfaceC1364105Vn<? super C351970Dr1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C351970Dr1 c351970Dr1 = new C351970Dr1(this.LLILLL, interfaceC1364105Vn);
        c351970Dr1.LLILLJJLI = obj;
        return c351970Dr1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        long timeClipStart;
        long timeClipEnd;
        Object objLIZ = obj;
        C1C7U.LIZ("NLEAudioUtils@9f2b.extractAudioList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C352190DrN c352190DrN = C352190DrN.LIZ;
            NLEModel nLEModel = this.LLILLL;
            c352190DrN.getClass();
            ArrayList arrayList = new ArrayList();
            if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (!slots.isEmpty())) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    C352190DrN.LIZ.getClass();
                    if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            if (C352190DrN.LIZJ(nLESegmentVideoDynamicCast)) {
                                arrayList.add(new C351990Dr3(resourceFile, -1L, -1L));
                            } else {
                                timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                                timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
                            }
                        } else {
                            timeClipStart = -1;
                            timeClipEnd = -1;
                        }
                        arrayList.add(new C351990Dr3(resourceFile, timeClipStart, timeClipEnd));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                C13BV c13bv = C13BV.INSTANCE;
                C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractAudioList$2");
                return c13bv;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C351980Dr2((C351990Dr3) it2.next(), null), 3));
            }
            this.LL = 1;
            objLIZ = C1D9F.LIZ(arrayList2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractAudioList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractAudioList$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
