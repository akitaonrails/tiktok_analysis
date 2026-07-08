package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$selectDeferred$1", f = "MusicGiftPreviewPlayer.kt", l = {385}, m = "invokeSuspend")
public final class C2210508lL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1136870fgr LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210508lL(C1136870fgr c1136870fgr, Context context, InterfaceC1364105Vn<? super C2210508lL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1136870fgr;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2210508lL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftPreviewPlayer@5196.selectDeferred$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(16L, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.selectDeferred$1");
                return objLJFF;
            }
        }
        C1142070fpF.LJIIIIZZ = null;
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        C1136870fgr c1136870fgr = this.LLILLJJLI;
        c1142070fpF.getClass();
        if (!C1142070fpF.LIZJ(c1136870fgr, "run deferred select")) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.selectDeferred$1");
            return unit;
        }
        C1142070fpF.LJIJJLI(this.LLILLJJLI, this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.selectDeferred$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
