package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS584S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FTL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerHelpBox$scheduleHelpBoxHide$2", f = "StickerHelpBox.kt", l = {188}, m = "invokeSuspend")
public final class C0FTL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0FTK LLILLL;
    public final /* synthetic */ EnumC1466150oFx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FTL(long j, C0FTK c0ftk, EnumC1466150oFx enumC1466150oFx, InterfaceC1364105Vn<? super C0FTL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c0ftk;
        this.LLILZ = enumC1466150oFx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FTL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerHelpBox@c89a.scheduleHelpBoxHide$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("StickerHelpBox@c89a.scheduleHelpBoxHide$2");
                return objLJFF;
            }
        }
        this.LLILLL.getClass();
        C0FTK c0ftk = this.LLILLL;
        c0ftk.LLJILJIL = null;
        C388890FMp c388890FMp = (C388890FMp) c0ftk.LLJIJIL.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
        this.LLILLL.LJJIJL().LIZLLL(new AwS584S0100000_5(this.LLILZ, 841), true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerHelpBox@c89a.scheduleHelpBoxHide$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
