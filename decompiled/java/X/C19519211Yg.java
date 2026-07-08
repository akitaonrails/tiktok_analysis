package X;

import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import njp.a;

/* JADX INFO: renamed from: X.11Yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.voiceclone.EditorProVoiceClonePanelComponent$sceneActions$1$7$1", f = "EditorProVoiceClonePanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C19519211Yg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19519311Yh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19519211Yg(C19519311Yh c19519311Yh, InterfaceC1364105Vn<? super C19519211Yg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19519311Yh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19519211Yg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProVoiceClonePanelComponent@dff1.sceneActions$1$7$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19519311Yh c19519311Yh = this.LL;
        EnumC361800EGk enumC361800EGk = c19519311Yh.LLJLLIL;
        String str = null;
        c19519311Yh.aI2(false, null);
        if (this.LL.LLJLL.LIZJ() != null) {
            C383980F3s.LIZ(100L, new AwS430S0200000_29(this.LL, enumC361800EGk, 65));
        } else if (this.LL.LLJLILLLLZIIL.LIZJ() != null) {
            TTSSpeakerInfo tTSSpeakerInfoLIZJ = this.LL.LLJLILLLLZIIL.LIZJ();
            if (tTSSpeakerInfoLIZJ != null) {
                str = tTSSpeakerInfoLIZJ.speakerId;
            }
            C19519311Yh c19519311Yh2 = this.LL;
            c19519311Yh2.N5(str, str, new AwS395S0200000_29(c19519311Yh2, enumC361800EGk, 47));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProVoiceClonePanelComponent@dff1.sceneActions$1$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
