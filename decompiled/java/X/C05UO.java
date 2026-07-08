package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewImageContent$6$1$2$1$1", f = "TakoContentPreviewAssem.kt", l = {1113, 1121, 1134}, m = "invokeSuspend")
public final class C05UO extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20066813fO LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ C05UN LLJIJIL;
    public final /* synthetic */ InterfaceC1676320tiw LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UO(long j, int i, C05UN c05un, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C05UO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = j;
        this.LLJI = i;
        this.LLJIJIL = c05un;
        this.LLJILJIL = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05UO c05uo = new C05UO(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c05uo.LLIZLLLIL = obj;
        return c05uo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0323  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02f8 -> B:79:0x0305). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x035c -> B:8:0x0030). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05UO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
