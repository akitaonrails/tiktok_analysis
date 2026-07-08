package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetectorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122480fJe extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122480fJe(HighIntentCommentDetector highIntentCommentDetector) {
        super(1);
        this.LL = highIntentCommentDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String strLIZIZ;
        String str2 = str;
        if (this.LL.LLJ) {
            C20441214yg.LIZIZ("DM_guidance", "checkCommentForHighIntent isServiceIconShow=true");
            HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModelY1 = this.LL.y1();
            C1122780fK8 c1122780fK8 = new C1122780fK8(this.LL, str2);
            highIntentCommentDetectorViewModelY1.getClass();
            String string = a0.LJLIIIL(str2).toString();
            AbstractC1122920fKM abstractC1122920fKM = highIntentCommentDetectorViewModelY1.LLIZLLLIL;
            if (abstractC1122920fKM instanceof C1122740fK4) {
                highIntentCommentDetectorViewModelY1.LLILLJJLI.ok1(new C09GH(string, new C1122280fJK(System.currentTimeMillis(), highIntentCommentDetectorViewModelY1, string, c1122780fK8)));
            } else {
                if (highIntentCommentDetectorViewModelY1.LLIZ) {
                    if (abstractC1122920fKM == null) {
                        strLIZIZ = "Model download incomplete";
                    } else if (abstractC1122920fKM instanceof C1122740fK4) {
                        strLIZIZ = null;
                    } else if (abstractC1122920fKM instanceof C1122720fK2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Model download failed, ");
                        sbLIZ.append(((C1122720fK2) abstractC1122920fKM).LIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        throw new C1954807lC();
                    }
                    HighIntentCommentDetectorViewModel.xQ2(highIntentCommentDetectorViewModelY1, -1, 0.0d, 0.0f, strLIZIZ, 6);
                }
                highIntentCommentDetectorViewModelY1.yQ2(string, c1122780fK8);
            }
        } else {
            C20441214yg.LIZIZ("DM_guidance", "skip checkCommentForHighIntent, isServiceIconShow=false");
        }
        return Unit.LIZ;
    }
}
