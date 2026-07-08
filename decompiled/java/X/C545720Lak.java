package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveTaskHandler$startI2VTask$1", f = "AILiveTaskHandler.kt", l = {303, 305, 309, 310, 312}, m = "invokeSuspend")
public final class C545720Lak extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC539460LDs LL;
    public C0LSZ LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C558760Lvm LLILZIL;
    public final /* synthetic */ C558710Lvh LLILZLL;
    public final /* synthetic */ NLETrackSlot LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ INLEMediaSession LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545720Lak(C558760Lvm c558760Lvm, C558710Lvh c558710Lvh, NLETrackSlot nLETrackSlot, long j, INLEMediaSession iNLEMediaSession, String str, InterfaceC1364105Vn<? super C545720Lak> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c558760Lvm;
        this.LLILZLL = c558710Lvh;
        this.LLIZ = nLETrackSlot;
        this.LLIZLLLIL = j;
        this.LLJ = iNLEMediaSession;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C545720Lak c545720Lak = new C545720Lak(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c545720Lak.LLILZ = obj;
        return c545720Lak;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        if (r6 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545720Lak.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
