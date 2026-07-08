package X;

import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.RecordUploadFrameTask$resizePicturesForAIWithFrameNew$2", f = "RecordUploadFrameTask.kt", l = {187}, m = "invokeSuspend")
public final class C2265208uA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2265508uD LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<FrameItem> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265208uA(C2265508uD c2265508uD, String str, List<FrameItem> list, InterfaceC1364105Vn<? super C2265208uA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2265508uD;
        this.LLILZ = str;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2265208uA c2265208uA = new C2265208uA(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2265208uA.LLILLJJLI = obj;
        return c2265208uA;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.ss.android.vesdk.VEUtils$VEVideoFileInfo] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ?? videoFileInfo;
        Object objLIZ = obj;
        C1C7U.LIZ("RecordUploadFrameTask@26a7.resizePicturesForAIWithFrameNew$2");
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
            C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = this.LLILLL.LIZIZ;
            C817403Hg c817403Hg2 = new C817403Hg();
            c817403Hg2.element = this.LLILLL.LIZIZ;
            C259800zU c259800zU = new C259800zU();
            if (C2264708u5.LIZ() && (str = this.LLILZ) != null && str.length() != 0 && (videoFileInfo = VEUtils.getVideoFileInfo(this.LLILZ)) != 0) {
                c259800zU.element = videoFileInfo;
                Pair pairLIZIZ = C2275108vl.LIZIZ(videoFileInfo, C2264908u7.LIZ());
                c817403Hg.element = ((Number) pairLIZIZ.getFirst()).intValue();
                c817403Hg2.element = ((Number) pairLIZIZ.getSecond()).intValue();
            }
            List<FrameItem> list = this.LLILZIL;
            C2265508uD c2265508uD = this.LLILLL;
            String str2 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (FrameItem frameItem : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str3 = str2;
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2265308uB(c2265508uD, frameItem, c817403Hg, c817403Hg2, str3, c259800zU, i2, null), 3));
                    i2 = i3;
                    str2 = str3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL = 1;
            objLIZ = C1D9F.LIZ(arrayList, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("RecordUploadFrameTask@26a7.resizePicturesForAIWithFrameNew$2");
                return objLJFF;
            }
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJJJJLI((Iterable) objLIZ));
        C1C7U.LIZIZ("RecordUploadFrameTask@26a7.resizePicturesForAIWithFrameNew$2");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
