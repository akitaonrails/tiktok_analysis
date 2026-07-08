package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicPanelComponent$hanleBeforeCloseMagicPanel$2$2$1", f = "MagicPanelComponent.kt", l = {933}, m = "invokeSuspend")
public final class C2486909op extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486909op(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C2486909op> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2486909op(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MagicPanelComponent@546d.hanleBeforeCloseMagicPanel$2$2$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2486809oo c2486809oo = new C2486809oo(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2486809oo);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MagicPanelComponent@546d.hanleBeforeCloseMagicPanel$2$2$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            C559380Lwm c559380Lwm = C559380Lwm.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key: ");
            sbLIZ.append(str);
            sbLIZ.append(", value: ");
            sbLIZ.append(str2);
            C201955140j.LIZLLL(c559380Lwm, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.creativeModel.editorProAIGCInfoModel.magicI2IInfoModelMap.put(str, new MagicI2InfoModel(str2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MagicPanelComponent@546d.hanleBeforeCloseMagicPanel$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
