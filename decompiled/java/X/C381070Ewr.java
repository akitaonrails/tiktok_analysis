package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ewr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateI2IPreTask$execute$2", f = "TemplateI2IPreTask.kt", l = {112, 116, 126}, m = "invokeSuspend")
public final class C381070Ewr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C381170Ex1 LL;
    public CreativeInfo LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<NLETrackSlot> LLILZLL;
    public final /* synthetic */ C381170Ex1 LLIZ;
    public final /* synthetic */ CreativeInfo LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C0FQS LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381070Ewr(List<NLETrackSlot> list, C381170Ex1 c381170Ex1, CreativeInfo creativeInfo, String str, C0FQS c0fqs, InterfaceC1364105Vn<? super C381070Ewr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c381170Ex1;
        this.LLIZLLLIL = creativeInfo;
        this.LLJ = str;
        this.LLJI = c0fqs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381070Ewr(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0162 -> B:54:0x0177). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381070Ewr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
