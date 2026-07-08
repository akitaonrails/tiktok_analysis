package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05z2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.lyriceffect.LyricEffectAnchorAlbumComponent$runWaitForGate$ok$1", f = "LyricEffectAnchorAlbumComponent.kt", l = {391}, m = "invokeSuspend")
public final class C1531005z2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Pair[] LL;
    public C540660LIi LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ Pair<Integer, Function1<InterfaceC1364105Vn<? super Boolean>, Object>>[] LLILZLL;
    public final /* synthetic */ C540660LIi LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1531005z2(Pair<Integer, ? extends Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>>[] pairArr, C540660LIi c540660LIi, InterfaceC1364105Vn<? super C1531005z2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = pairArr;
        this.LLIZ = c540660LIi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1531005z2(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004a -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "LyricEffectAnchorAlbumComponent@3409.runWaitForGate$ok$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L50
            if (r0 != r7) goto L63
            int r6 = r11.LLILZ
            int r3 = r11.LLILLL
            X.0LIi r5 = r11.LLILLJJLI
            kotlin.Pair[] r4 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L1c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L5b
            int r3 = r3 + 1
        L26:
            if (r3 >= r6) goto L5a
            r2 = r4[r3]
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.getSecond()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r5.LLJIJIL = r1
            r11.LL = r4
            r11.LLILLJJLI = r5
            r11.LLILLL = r3
            r11.LLILZ = r6
            r11.LLILZIL = r7
            java.lang.Object r12 = r0.invoke(r11)
            if (r12 != r9) goto L1c
            X.C1C7U.LIZIZ(r10)
            return r9
        L50:
            X.C155000ia.LIZIZ(r12)
            kotlin.Pair<java.lang.Integer, kotlin.jvm.functions.Function1<X.05Vn<? super java.lang.Boolean>, java.lang.Object>>[] r4 = r11.LLILZLL
            X.0LIi r5 = r11.LLIZ
            int r6 = r4.length
            r3 = 0
            goto L26
        L5a:
            r8 = 1
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            X.C1C7U.LIZIZ(r10)
            return r0
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531005z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
