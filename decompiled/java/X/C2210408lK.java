package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$stopDeferred$1", f = "MusicGiftPreviewPlayer.kt", l = {485}, m = "invokeSuspend")
public final class C2210408lK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2210408lK(InterfaceC1364105Vn<? super C2210408lK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2210408lK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftPreviewPlayer@5196.stopDeferred$1");
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
                C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.stopDeferred$1");
                return objLJFF;
            }
        }
        C1142070fpF.LJIIIIZZ = null;
        C1142070fpF.LIZ.getClass();
        C1142070fpF.LJJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.stopDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2210408lK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
