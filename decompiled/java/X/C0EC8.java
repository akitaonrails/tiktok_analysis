package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EC8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.music.ui.EditorProMultiMusicComponent$restoreMusicInfoFromOldDraft$1$1", f = "EditorProMultiMusicComponent.kt", l = {}, m = "invokeSuspend")
public final class C0EC8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0ECA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EC8(C0ECA c0eca, InterfaceC1364105Vn<? super C0EC8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0eca;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0EC8 c0ec8 = new C0EC8(this.LLILLJJLI, interfaceC1364105Vn);
        c0ec8.LL = obj;
        return c0ec8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0EGH c0eghK10;
        C1C7U.LIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1$1");
            return unit;
        }
        C0EC7 c0ec7W2 = this.LLILLJJLI.w2();
        if (c0ec7W2 != null && (c0eghK10 = c0ec7W2.K10()) != null) {
            ArrayList<C0FN1> arrayListLIZ = c0eghK10.LIZ(c0eghK10.LJIJ, c0eghK10.LJIJI);
            C0FN0 c0fn0LIZLLL = c0eghK10.LIZLLL();
            boolean z = c0eghK10.LJIJ;
            c0fn0LIZLLL.LJI(arrayListLIZ);
            c0fn0LIZLLL.LJIIIZ = z;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
