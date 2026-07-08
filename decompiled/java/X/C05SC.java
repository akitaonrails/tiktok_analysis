package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftHeaderLyricsKt$rememberLyricLineHighlightProgress$1$1", f = "MusicGiftHeaderLyrics.kt", l = {OppoPermissionPopupMaskDelayExp.DEFAULT, 706, 719}, m = "invokeSuspend")
public final class C05SC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Boolean> LLILZIL;
    public final /* synthetic */ Function0<Float> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SC(boolean z, C1677480tko<Float, C1677280tkU> c1677480tko, boolean z2, Function0<Boolean> function0, Function0<Float> function02, InterfaceC1364105Vn<? super C05SC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1677480tko;
        this.LLILZ = z2;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 3
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L9b
            if (r0 == r6) goto L6f
            if (r0 != r5) goto L93
            X.C155000ia.LIZIZ(r9)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILLJJLI
            r3 = 0
            if (r0 != 0) goto L39
            X.0tko<java.lang.Float, X.0tkU> r1 = r8.LLILLL
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r3)
            r8.LL = r2
            java.lang.Object r0 = r1.LJFF(r0, r8)
            if (r0 != r4) goto L9e
            X.C1C7U.LIZIZ(r7)
            return r4
        L39:
            X.0tko<java.lang.Float, X.0tkU> r2 = r8.LLILLL
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L5f
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r8.LLILZIL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5f
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r8.LLILZLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.C13LZ.LIZLLL(r1, r3, r0)
        L5f:
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r3)
            r8.LL = r6
            java.lang.Object r0 = r2.LJFF(r0, r8)
            if (r0 != r4) goto L72
            X.C1C7U.LIZIZ(r7)
            return r4
        L6f:
            X.C155000ia.LIZIZ(r9)
        L72:
            X.00jw r2 = new X.00jw
            kotlin.jvm.functions.Function0<java.lang.Float> r1 = r8.LLILZLL
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r8.LLILZIL
            r2.<init>(r1, r0)
            X.095D r3 = X.C20028913Yh.LJIIIZ(r2)
            X.05SI r2 = new X.05SI
            X.0tko<java.lang.Float, X.0tkU> r1 = r8.LLILLL
            r0 = 0
            r2.<init>(r1, r0)
            r8.LL = r5
            java.lang.Object r0 = X.C09IC.LJII(r3, r8, r2)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r7)
            return r4
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            X.C155000ia.LIZIZ(r9)
        L9e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05SC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
