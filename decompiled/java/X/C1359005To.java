package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.widget.HighlightsCoverCropperKt$HighlightsCoverCropper$touchAlphaModifier$1$1$1", f = "HighlightsCoverCropper.kt", l = {148, 162}, m = "invokeSuspend")
public final class C1359005To extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C05P0<C09AE> LLILZ;
    public final /* synthetic */ C05P0<C09AE> LLILZIL;
    public final /* synthetic */ C1377105aD LLILZLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLIZ;
    public final /* synthetic */ C1677480tko<C1378605aS, C1677270tkT> LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359005To(C05P0<C09AE> c05p0, C05P0<C09AE> c05p02, C1377105aD c1377105aD, C1677480tko<Float, C1677280tkU> c1677480tko, C1677480tko<C1378605aS, C1677270tkT> c1677480tko2, InterfaceC497601wk interfaceC497601wk, C1677480tko<Float, C1677280tkU> c1677480tko3, InterfaceC1364105Vn<? super C1359005To> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c1377105aD;
        this.LLIZ = c1677480tko;
        this.LLIZLLLIL = c1677480tko2;
        this.LLJ = interfaceC497601wk;
        this.LLJI = c1677480tko3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1359005To c1359005To = new C1359005To(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1359005To.LLILLL = obj;
        return c1359005To;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010e -> B:7:0x001e). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359005To.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
