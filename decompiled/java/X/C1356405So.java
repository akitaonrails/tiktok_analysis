package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.ThoughtLikeUiKt$DiggButtonLottie$1$1", f = "ThoughtLikeUi.kt", l = {286, 288, 294, 296, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C1356405So extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1294720jnS LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ C05P0<Boolean> LLIZLLLIL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356405So(C1294720jnS c1294720jnS, boolean z, C1677480tko<Float, C1677280tkU> c1677480tko, float f, C05P0<Boolean> c05p0, C1677480tko<Float, C1677280tkU> c1677480tko2, InterfaceC1364105Vn<? super C1356405So> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1294720jnS;
        this.LLILZIL = z;
        this.LLILZLL = c1677480tko;
        this.LLIZ = f;
        this.LLIZLLLIL = c05p0;
        this.LLJ = c1677480tko2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1356405So c1356405So = new C1356405So(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1356405So.LLILLL = obj;
        return c1356405So;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356405So.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
