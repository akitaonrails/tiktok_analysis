package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.voiceclone.EditorProVoiceClonePanelComponent$showRecreateCheckDialog$1$1$1$result$1", f = "EditorProVoiceClonePanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C19513711Wd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ C19519311Yh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19513711Wd(C19519311Yh c19519311Yh, InterfaceC1364105Vn<? super C19513711Wd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19519311Yh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19513711Wd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EditorProVoiceClonePanelComponent@dff1.showRecreateCheckDialog$1$1$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C11VK c11vk = C11VK.LIZ;
        if (this.LL.LLJLLIL == EnumC361800EGk.TTS_PANEL) {
            str = "editor_pro_tts";
        } else {
            str = "editor_pro_sound";
        }
        c11vk.getClass();
        C11VK.LJIIIZ(str);
        C05HM c05hm = C05HM.LIZIZ;
        int iLJJIJIL = c05hm.LJJIJIL();
        if (iLJJIJIL == 0) {
            C05HV.LIZ.clear();
            c05hm.LJJJ();
        }
        Integer numLJ = C2286608xc.LJ(iLJJIJIL);
        C1C7U.LIZIZ("EditorProVoiceClonePanelComponent@dff1.showRecreateCheckDialog$1$1$1$result$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
