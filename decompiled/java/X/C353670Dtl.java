package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.transition.ui.AITransitionTabContentScene$loadFirstLastFrames$1", f = "AITransitionTabContentScene.kt", l = {384, 393, 400, 409}, m = "invokeSuspend")
public final class C353670Dtl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public NLETrackSlot LL;
    public Object LLILLJJLI;
    public C378420Esa LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C378420Esa LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353670Dtl(C378420Esa c378420Esa, InterfaceC1364105Vn<? super C353670Dtl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c378420Esa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353670Dtl c353670Dtl = new C353670Dtl(this.LLIZ, interfaceC1364105Vn);
        c353670Dtl.LLILZLL = obj;
        return c353670Dtl;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:75:0x01a1, B:76:0x01a4, B:77:0x01ad, B:79:0x01b5, B:83:0x01bc, B:91:0x01cf, B:93:0x01dd, B:99:0x01e7, B:101:0x01f1, B:105:0x01fe, B:108:0x0205, B:64:0x016f, B:65:0x0172, B:67:0x017e, B:69:0x0184, B:71:0x018c, B:50:0x0120, B:51:0x0123, B:52:0x012c, B:54:0x0136, B:56:0x013c, B:58:0x0146, B:59:0x014a, B:39:0x00e9, B:40:0x00ec, B:42:0x00f8, B:44:0x00fe, B:46:0x0106, B:15:0x005b, B:17:0x006b, B:19:0x0077, B:21:0x007f, B:23:0x0085, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:31:0x009f, B:33:0x00c3, B:34:0x00c7, B:109:0x0215, B:111:0x021b), top: B:117:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:75:0x01a1, B:76:0x01a4, B:77:0x01ad, B:79:0x01b5, B:83:0x01bc, B:91:0x01cf, B:93:0x01dd, B:99:0x01e7, B:101:0x01f1, B:105:0x01fe, B:108:0x0205, B:64:0x016f, B:65:0x0172, B:67:0x017e, B:69:0x0184, B:71:0x018c, B:50:0x0120, B:51:0x0123, B:52:0x012c, B:54:0x0136, B:56:0x013c, B:58:0x0146, B:59:0x014a, B:39:0x00e9, B:40:0x00ec, B:42:0x00f8, B:44:0x00fe, B:46:0x0106, B:15:0x005b, B:17:0x006b, B:19:0x0077, B:21:0x007f, B:23:0x0085, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:31:0x009f, B:33:0x00c3, B:34:0x00c7, B:109:0x0215, B:111:0x021b), top: B:117:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:75:0x01a1, B:76:0x01a4, B:77:0x01ad, B:79:0x01b5, B:83:0x01bc, B:91:0x01cf, B:93:0x01dd, B:99:0x01e7, B:101:0x01f1, B:105:0x01fe, B:108:0x0205, B:64:0x016f, B:65:0x0172, B:67:0x017e, B:69:0x0184, B:71:0x018c, B:50:0x0120, B:51:0x0123, B:52:0x012c, B:54:0x0136, B:56:0x013c, B:58:0x0146, B:59:0x014a, B:39:0x00e9, B:40:0x00ec, B:42:0x00f8, B:44:0x00fe, B:46:0x0106, B:15:0x005b, B:17:0x006b, B:19:0x0077, B:21:0x007f, B:23:0x0085, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:31:0x009f, B:33:0x00c3, B:34:0x00c7, B:109:0x0215, B:111:0x021b), top: B:117:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:75:0x01a1, B:76:0x01a4, B:77:0x01ad, B:79:0x01b5, B:83:0x01bc, B:91:0x01cf, B:93:0x01dd, B:99:0x01e7, B:101:0x01f1, B:105:0x01fe, B:108:0x0205, B:64:0x016f, B:65:0x0172, B:67:0x017e, B:69:0x0184, B:71:0x018c, B:50:0x0120, B:51:0x0123, B:52:0x012c, B:54:0x0136, B:56:0x013c, B:58:0x0146, B:59:0x014a, B:39:0x00e9, B:40:0x00ec, B:42:0x00f8, B:44:0x00fe, B:46:0x0106, B:15:0x005b, B:17:0x006b, B:19:0x0077, B:21:0x007f, B:23:0x0085, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:31:0x009f, B:33:0x00c3, B:34:0x00c7, B:109:0x0215, B:111:0x021b), top: B:117:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353670Dtl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
