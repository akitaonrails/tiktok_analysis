package X;

import android.content.Context;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiRepository$fetchVoiceCloneInfoWithLokiInfo$1$onCallback$1", f = "VoiceCloneComponent.kt", l = {224, 229}, m = "invokeSuspend")
public final class C2376909Tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSSpeakerInfo LLILLJJLI;
    public final /* synthetic */ InterfaceC2376809Ta LLILLL;
    public final /* synthetic */ InterfaceC1635390sev LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376909Tb(TTSSpeakerInfo tTSSpeakerInfo, InterfaceC2376809Ta interfaceC2376809Ta, InterfaceC1635390sev interfaceC1635390sev, int i, String str, Context context, InterfaceC1364105Vn<? super C2376909Tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSSpeakerInfo;
        this.LLILLL = interfaceC2376809Ta;
        this.LLILZ = interfaceC1635390sev;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2376909Tb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[Catch: Exception -> 0x00cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:25:0x0073, B:26:0x0076, B:28:0x0080, B:30:0x008c, B:31:0x00b9, B:14:0x0030, B:15:0x0033, B:19:0x0044, B:21:0x005f, B:10:0x0020), top: B:36:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2376909Tb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
