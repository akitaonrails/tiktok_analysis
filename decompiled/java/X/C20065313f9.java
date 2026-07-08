package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
public final class C20065313f9 extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20066813fO LLILLJJLI;
    public EnumC20065813fE LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C20065513fB LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20065313f9(C20065513fB c20065513fB, InterfaceC1364105Vn<? super C20065313f9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c20065513fB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20065313f9 c20065313f9 = new C20065313f9(this.LLILZLL, interfaceC1364105Vn);
        c20065313f9.LLILZIL = obj;
        return c20065313f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e A[PHI: r3
      0x023e: PHI (r3v9 X.13Aw) = (r3v8 X.13Aw), (r3v8 X.13Aw), (r3v11 X.13Aw) binds: [B:122:0x020f, B:124:0x0213, B:139:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[LOOP:6: B:116:0x01f8->B:189:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d6 -> B:50:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0176 -> B:8:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20065313f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
