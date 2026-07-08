package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ewx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateI2VPreTask$execute$3", f = "TemplateI2VPreTask.kt", l = {107, 120, 129}, m = "invokeSuspend")
public final class C381130Ewx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C381160Ex0 LL;
    public CreativeInfo LLILLJJLI;
    public Object LLILLL;
    public INLEMediaSession LLILZ;
    public NLEEditor LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C0FQS LLIZLLLIL;
    public final /* synthetic */ C381160Ex0 LLJ;
    public final /* synthetic */ CreativeInfo LLJI;
    public final /* synthetic */ Set<String> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ INLEMediaSession LLJILJILJ;
    public final /* synthetic */ NLEEditor LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381130Ewx(C0FQS c0fqs, C381160Ex0 c381160Ex0, CreativeInfo creativeInfo, Set<String> set, String str, INLEMediaSession iNLEMediaSession, NLEEditor nLEEditor, InterfaceC1364105Vn<? super C381130Ewx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0fqs;
        this.LLJ = c381160Ex0;
        this.LLJI = creativeInfo;
        this.LLJIJIL = set;
        this.LLJILJIL = str;
        this.LLJILJILJ = iNLEMediaSession;
        this.LLJILLL = nLEEditor;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381130Ewx(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ff  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381130Ewx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
