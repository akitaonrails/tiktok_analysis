package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05HU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.voiceclone.EditorProVoiceClonePanelComponent$showDeleteDialog$1$1$1$result$1", f = "EditorProVoiceClonePanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C05HU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C05HU(InterfaceC1364105Vn<? super C05HU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProVoiceClonePanelComponent@dff1.showDeleteDialog$1$1$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C11VK.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", C11VK.LJFF);
        C11VK.LIZ(c0lab, C11VK.LJFF, C11VK.LJI);
        C20684815ws.LJIILLIIL("delete_voice", c0lab.LIZ);
        int iLJJIJIL = C05HM.LIZIZ.LJJIJIL();
        if (iLJJIJIL == 0) {
            C05HV.LIZ.clear();
        }
        Integer numLJ = C2286608xc.LJ(iLJJIJIL);
        C1C7U.LIZIZ("EditorProVoiceClonePanelComponent@dff1.showDeleteDialog$1$1$1$result$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C05HU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
