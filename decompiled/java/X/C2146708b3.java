package X;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1$1", f = "TTSPanelUIComponent.kt", l = {1909}, m = "invokeSuspend")
public final class C2146708b3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2146708b3(AnonymousClass0957<Unit> anonymousClass0957, InterfaceC1364105Vn<? super C2146708b3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2146708b3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<Unit> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C11Y7.LLLLLZL.getClass();
        String str = C11Y7.LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchInstantCloneInfo end.instantCloneRe:");
        sbLIZ.append(unit);
        Integer numLJ = C2286608xc.LJ(Log.d(str, C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
