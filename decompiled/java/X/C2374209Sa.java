package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiRepository$makeVoiceClonePreHeat$1", f = "VoiceCloneComponent.kt", l = {}, m = "invokeSuspend")
public final class C2374209Sa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374209Sa(String str, String str2, boolean z, InterfaceC1364105Vn<? super C2374209Sa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2374209Sa(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceCloneLokiRepository@d132.makeVoiceClonePreHeat$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C09SZ.LIZ(C2286608xc.LJ(1), this.LL, this.LLILLJJLI, C09SZ.LIZIZ(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceCloneLokiRepository@d132.makeVoiceClonePreHeat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
