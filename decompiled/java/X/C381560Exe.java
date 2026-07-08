package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Exe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.MattingTask$execute$job$1", f = "MattingTask.kt", l = {55}, m = "invokeSuspend")
public final class C381560Exe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0FQS LLILLL;
    public final /* synthetic */ C259800zU<NLETemplateModel> LLILZ;
    public final /* synthetic */ C381570Exf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381560Exe(C0FQS c0fqs, C259800zU<NLETemplateModel> c259800zU, C381570Exf c381570Exf, InterfaceC1364105Vn<? super C381560Exe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0fqs;
        this.LLILZ = c259800zU;
        this.LLILZIL = c381570Exf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381560Exe(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        int iIntValue;
        C1C7U.LIZ("MattingTask@7f40.execute$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            CreativeInfo creativeInfoLIZ = C0F1Q.LIZ(this.LLILLL.LIZIZ);
            C0FQS c0fqs = this.LLILLL;
            String str = c0fqs.LJ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Integer num = c0fqs.LJII;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJ = C2286608xc.LJ(iIntValue);
            String str3 = this.LLILLL.LJIIL;
            if (str3 != null) {
                str2 = str3;
            }
            C354610DvH c354610DvH = new C354610DvH(creativeInfoLIZ, str, numLJ, "", str2, false, 64);
            NLETemplateModel nLETemplateModel = this.LLILZ.element;
            AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(525);
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            if (c354610DvH.LJJIJIIJIL(nLETemplateModel, aFwS234S0000000_5, this) == objLJFF) {
                C1C7U.LIZIZ("MattingTask@7f40.execute$job$1");
                return objLJFF;
            }
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Consume: UpdateProgress magic total cost=");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LIZLLL(c1398350mUb, "MattingTask", C2188811AlT.LIZIZ(sbLIZ));
        C354270Duj.LIZJ(0L, new AwS406S0200000_5(this.LLILZIL, this.LLILLL, 150));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MattingTask@7f40.execute$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
