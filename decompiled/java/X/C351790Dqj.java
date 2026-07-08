package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.core.editor.impl.VideoCutEditor$freezeFrame$3$4$1", f = "VideoCutEditor.kt", l = {}, m = "invokeSuspend")
public final class C351790Dqj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C351560DqM LLILLJJLI;
    public final /* synthetic */ List<EditMedia> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<NLETrackSlot, Unit> LLIZ;
    public final /* synthetic */ C238400w2 LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;
    public final /* synthetic */ C259800zU<Function0<NLETrack>> LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJILJIL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJJ;
    public final /* synthetic */ Function2<NLETrackSlot, Long, Unit> LLJJI;
    public final /* synthetic */ long LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C351790Dqj(boolean z, C351560DqM c351560DqM, List<EditMedia> list, int i, C013C c013c, boolean z2, Function1<? super NLETrackSlot, Unit> function1, C238400w2 c238400w2, C013C c013c2, C259800zU<Function0<NLETrack>> c259800zU, boolean z3, C259800zU<NLETrackSlot> c259800zU2, C259800zU<NLETrackSlot> c259800zU3, boolean z4, C259800zU<NLETrackSlot> c259800zU4, Function2<? super NLETrackSlot, ? super Long, Unit> function2, long j, InterfaceC1364105Vn<? super C351790Dqj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c351560DqM;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = c013c;
        this.LLILZLL = z2;
        this.LLIZ = function1;
        this.LLIZLLLIL = c238400w2;
        this.LLJ = c013c2;
        this.LLJI = c259800zU;
        this.LLJIJIL = z3;
        this.LLJILJIL = c259800zU2;
        this.LLJILJILJ = c259800zU3;
        this.LLJILLL = z4;
        this.LLJJ = c259800zU4;
        this.LLJJI = function2;
        this.LLJJIII = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351790Dqj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351790Dqj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
