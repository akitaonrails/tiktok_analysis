package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Drj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$resizeMedias$1", f = "ResizeMediasManager.kt", l = {104}, m = "invokeSuspend")
public final class C352410Drj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<NLETrackSlot> LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ EnumC20228014Cw LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C352410Drj(List<? extends NLETrackSlot> list, VideoPublishEditModel videoPublishEditModel, EnumC20228014Cw enumC20228014Cw, Context context, InterfaceC1364105Vn<? super C352410Drj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = enumC20228014Cw;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352410Drj(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJJLIIIJ;
        Context context;
        Iterator it2;
        String resourceFile;
        C1C7U.LIZ("ResizeMediasManager@4d3.resizeMedias$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                context = (Context) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C352470Drp c352470Drp = C352470Drp.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resizeMedias slots: ");
            List<NLETrackSlot> list = this.LLILZ;
            if (list != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS234S0000000_5.get$arr$(467), 31);
            } else {
                strLJJLIIIJ = null;
            }
            sbLIZ.append(strLJJLIIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c352470Drp.getClass();
            C352470Drp.LIZLLL(strLIZIZ);
            if (this.LLILZ != null) {
                ArrayList<Pair> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (NLETrackSlot nLETrackSlot : this.LLILZ) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        String absolutePath = C2298208zU.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LLILZIL.getCreativeInfo(), this.LLILZLL, nLETrackSlot.getUUID(), false, 8).getAbsolutePath();
                        NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                        if (aVFile != null) {
                            resourceFile = aVFile.getResourceFile();
                        } else {
                            resourceFile = null;
                        }
                        if (C123100dR.LIZ(resourceFile)) {
                            if (Intrinsics.LJFF(C0CHQ.LIZ().LJIILL().getMediaTypeCache(nLESegmentVideoDynamicCast.getAVFile().getResourceFile()), true)) {
                                arrayList.add(new Pair(nLETrackSlot, absolutePath));
                            } else {
                                arrayList2.add(new Pair(nLETrackSlot, absolutePath));
                            }
                        }
                    }
                }
                Context context2 = this.LLIZ;
                for (Pair pair : arrayList) {
                    C2473609mg c2473609mgLIZ = C0E3A.LIZ();
                    C352470Drp c352470Drp2 = C352470Drp.LIZ;
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pair.getFirst();
                    String str = (String) pair.getSecond();
                    c352470Drp2.getClass();
                    C352470Drp.LJ(context2, nLETrackSlot2, str, true, c2473609mgLIZ);
                }
                context = this.LLIZ;
                it2 = arrayList2.iterator();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ResizeMediasManager@4d3.resizeMedias$1");
            return unit;
        }
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            C352470Drp c352470Drp3 = C352470Drp.LIZ;
            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) pair2.getFirst();
            String str2 = (String) pair2.getSecond();
            c352470Drp3.getClass();
            C099G c099gLJ = C352470Drp.LJ(context, nLETrackSlot3, str2, false, null);
            if (c099gLJ != null) {
                this.LL = context;
                this.LLILLJJLI = it2;
                this.LLILLL = 1;
                if (c099gLJ.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("ResizeMediasManager@4d3.resizeMedias$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ResizeMediasManager@4d3.resizeMedias$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
