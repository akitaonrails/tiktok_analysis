package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1CuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankImpl$submitReRankTask$1", f = "AdReRankImpl.kt", l = {}, m = "invokeSuspend")
public final class C2245271CuL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC2245291CuN LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C2245331CuR LLILLL;
    public final /* synthetic */ List<Aweme> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2245271CuL(EnumC2245291CuN enumC2245291CuN, int i, C2245331CuR c2245331CuR, List<? extends Aweme> list, InterfaceC1364105Vn<? super C2245271CuL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC2245291CuN;
        this.LLILLJJLI = i;
        this.LLILLL = c2245331CuR;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2245271CuL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03bb A[LOOP:2: B:100:0x03b5->B:102:0x03bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f9 A[Catch: all -> 0x0704, TryCatch #0 {, blocks: (B:120:0x0471, B:121:0x0480, B:123:0x0486, B:127:0x04a2, B:126:0x049e, B:128:0x04b5, B:130:0x04c5, B:131:0x04c9, B:133:0x04cd, B:135:0x04d3, B:137:0x04dd, B:140:0x04e4, B:146:0x04f3, B:148:0x04f9, B:150:0x0503, B:152:0x0507, B:153:0x050a, B:155:0x051c, B:156:0x0524, B:145:0x04f0, B:142:0x04eb), top: B:195:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x051c A[Catch: all -> 0x0704, TryCatch #0 {, blocks: (B:120:0x0471, B:121:0x0480, B:123:0x0486, B:127:0x04a2, B:126:0x049e, B:128:0x04b5, B:130:0x04c5, B:131:0x04c9, B:133:0x04cd, B:135:0x04d3, B:137:0x04dd, B:140:0x04e4, B:146:0x04f3, B:148:0x04f9, B:150:0x0503, B:152:0x0507, B:153:0x050a, B:155:0x051c, B:156:0x0524, B:145:0x04f0, B:142:0x04eb), top: B:195:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0471 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2245271CuL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
