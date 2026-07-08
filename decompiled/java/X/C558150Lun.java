package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$config$2$1$onLoadMore$1$1$1", f = "Text2ImageListScene.kt", l = {452}, m = "invokeSuspend")
public final class C558150Lun extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C558180Luq LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLIZLLLIL;
    public final /* synthetic */ List<TextImageTaskInfo> LLJ;
    public final /* synthetic */ C558180Luq LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C558150Lun(int i, boolean z, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, List<TextImageTaskInfo> list, C558180Luq c558180Luq, InterfaceC1364105Vn<? super C558150Lun> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC1364105Vn;
        this.LLJ = list;
        this.LLJI = c558180Luq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C558150Lun(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0025, code lost:
    
        r14 = new X.C558200Lus(r15, "", r17, r18, 8);
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0057 -> B:6:0x0025). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558150Lun.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
