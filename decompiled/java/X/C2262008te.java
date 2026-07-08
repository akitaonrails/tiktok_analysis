package X;

import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getAllFeatureExtraction$2", f = "MixEditingFeatureExtractionTask.kt", l = {348}, m = "invokeSuspend")
public final class C2262008te extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeatureExtraction, ? extends Integer>>, Object> {
    public C118300cf LL;
    public C2277408w8 LLILLJJLI;
    public C2263508tt LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Pair LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ Set<String> LLJIJIL;
    public final /* synthetic */ C2277408w8 LLJILJIL;
    public final /* synthetic */ C2263508tt LLJILJILJ;
    public final /* synthetic */ InterfaceC1337805Lk LLJILLL;
    public final /* synthetic */ InterfaceC1337805Lk LLJJ;
    public final /* synthetic */ C118300cf LLJJI;
    public final /* synthetic */ String LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262008te(Set<String> set, C2277408w8 c2277408w8, C2263508tt c2263508tt, InterfaceC1337805Lk interfaceC1337805Lk, InterfaceC1337805Lk interfaceC1337805Lk2, C118300cf c118300cf, String str, InterfaceC1364105Vn<? super C2262008te> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = set;
        this.LLJILJIL = c2277408w8;
        this.LLJILJILJ = c2263508tt;
        this.LLJILLL = interfaceC1337805Lk;
        this.LLJJ = interfaceC1337805Lk2;
        this.LLJJI = c118300cf;
        this.LLJJIII = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2262008te c2262008te = new C2262008te(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c2262008te.LLJI = obj;
        return c2262008te;
    }

    /* JADX WARN: Path cross not found for [B:12:0x0063, B:23:0x0092], limit reached: 76 */
    /* JADX WARN: Path cross not found for [B:23:0x0092, B:12:0x0063], limit reached: 76 */
    /* JADX WARN: Path cross not found for [B:23:0x0092, B:16:0x0073], limit reached: 76 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01b5 -> B:6:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01b8 -> B:7:0x0039). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2262008te.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeatureExtraction, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
