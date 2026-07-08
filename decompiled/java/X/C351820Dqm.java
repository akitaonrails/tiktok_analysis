package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.core.editor.impl.VideoCutEditor$freezeFrame$3", f = "VideoCutEditor.kt", l = {1606, 1756}, m = "invokeSuspend")
public final class C351820Dqm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C351560DqM LLILZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C558340Lv6 LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ NLESegmentVideo LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJJIII;
    public final /* synthetic */ C259800zU<NLETrack> LLJJIJI;
    public final /* synthetic */ long LLJJIJIIJIL;
    public final /* synthetic */ boolean LLJJIJIL;
    public final /* synthetic */ int LLJJJ;
    public final /* synthetic */ C013C LLJJJIL;
    public final /* synthetic */ C238400w2 LLJJJJ;
    public final /* synthetic */ C013C LLJJJJJIL;
    public final /* synthetic */ boolean LLJJJJLIIL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJJL;
    public final /* synthetic */ boolean LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJL;
    public final /* synthetic */ Function2<NLETrackSlot, Long, Unit> LLJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C351820Dqm(boolean z, C351560DqM c351560DqM, C259800zU<NLETrackSlot> c259800zU, C118300cf c118300cf, C118300cf c118300cf2, boolean z2, C558340Lv6 c558340Lv6, Function0<Unit> function0, boolean z3, int i, boolean z4, long j, NLESegmentVideo nLESegmentVideo, String str, C259800zU<NLETrackSlot> c259800zU2, C259800zU<NLETrack> c259800zU3, long j2, boolean z5, int i2, C013C c013c, C238400w2 c238400w2, C013C c013c2, boolean z6, C259800zU<NLETrackSlot> c259800zU4, boolean z7, C259800zU<NLETrackSlot> c259800zU5, Function2<? super NLETrackSlot, ? super Long, Unit> function2, InterfaceC1364105Vn<? super C351820Dqm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c351560DqM;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = z2;
        this.LLJ = c558340Lv6;
        this.LLJI = function0;
        this.LLJIJIL = z3;
        this.LLJILJIL = i;
        this.LLJILJILJ = z4;
        this.LLJILLL = j;
        this.LLJJ = nLESegmentVideo;
        this.LLJJI = str;
        this.LLJJIII = c259800zU2;
        this.LLJJIJI = c259800zU3;
        this.LLJJIJIIJIL = j2;
        this.LLJJIJIL = z5;
        this.LLJJJ = i2;
        this.LLJJJIL = c013c;
        this.LLJJJJ = c238400w2;
        this.LLJJJJJIL = c013c2;
        this.LLJJJJLIIL = z6;
        this.LLJJL = c259800zU4;
        this.LLJJLIIIJLLLLLLLZ = z7;
        this.LLJL = c259800zU5;
        this.LLJLIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351820Dqm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, kotlin.jvm.internal.AwS18S0300100_5] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351820Dqm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
