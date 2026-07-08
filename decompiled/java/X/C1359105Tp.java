package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngineKt$ZoomableContainer$1$1$1", f = "MediaEngine.kt", l = {404, 412}, m = "invokeSuspend")
public final class C1359105Tp extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ float LLJI;
    public final /* synthetic */ InterfaceC497601wk LLJIJIL;
    public final /* synthetic */ C05P0<Float> LLJILJIL;
    public final /* synthetic */ C05P0<Float> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359105Tp(C1677480tko<Float, C1677280tkU> c1677480tko, float f, float f2, InterfaceC497601wk interfaceC497601wk, C05P0<Float> c05p0, C05P0<Float> c05p02, InterfaceC1364105Vn<? super C1359105Tp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c1677480tko;
        this.LLJ = f;
        this.LLJI = f2;
        this.LLJIJIL = interfaceC497601wk;
        this.LLJILJIL = c05p0;
        this.LLJILJILJ = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1359105Tp c1359105Tp = new C1359105Tp(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1359105Tp.LLIZ = obj;
        return c1359105Tp;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0184 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359105Tp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
