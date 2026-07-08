package X;

import kotlin.Unit;
import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0tGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.StoryShootButtonRenderer$uiStateProvider$2$1", f = "StoryShootButton.kt", l = {}, m = "invokeSuspend")
public final class C1658510tGD extends C09AX implements InterfaceC1631620sYq<EnumC579880Mok, EnumC1656620tDA, InterfaceC1364105Vn<? super C1665490tRT>, Object> {
    public /* synthetic */ EnumC579880Mok LL;
    public /* synthetic */ EnumC1656620tDA LLILLJJLI;
    public final /* synthetic */ C1665480tRS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658510tGD(C1665480tRS c1665480tRS, InterfaceC1364105Vn<? super C1658510tGD> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1665480tRS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StoryShootButtonRenderer@681b.uiStateProvider$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC579880Mok enumC579880Mok = this.LL;
        EnumC1656620tDA enumC1656620tDA = this.LLILLJJLI;
        if (enumC579880Mok != EnumC579880Mok.ON_UP) {
            z = true;
        } else {
            z = false;
        }
        C1658530tGF c1658530tGF = new C1658530tGF(this.LLILLL.LIZLLL());
        C1658540tGG c1658540tGG = new C1658540tGG(this.LLILLL.LIZLLL());
        C1658520tGE c1658520tGE = new C1658520tGE(this.LLILLL.LIZLLL());
        C1665490tRT c1665490tRT = new C1665490tRT(z, C1658350tFx.LIZ(enumC1656620tDA), c1658530tGF, c1658540tGG, AFwS311S0000000_25.get$arr$(23), c1658520tGE, this.LLILLL.LIZLLL().Oa0());
        C1C7U.LIZIZ("StoryShootButtonRenderer@681b.uiStateProvider$2$1");
        return c1665490tRT;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(EnumC579880Mok enumC579880Mok, EnumC1656620tDA enumC1656620tDA, InterfaceC1364105Vn<? super C1665490tRT> interfaceC1364105Vn) {
        C1658510tGD c1658510tGD = new C1658510tGD(this.LLILLL, interfaceC1364105Vn);
        c1658510tGD.LL = enumC579880Mok;
        c1658510tGD.LLILLJJLI = enumC1656620tDA;
        return c1658510tGD.invokeSuspend(Unit.LIZ);
    }
}
