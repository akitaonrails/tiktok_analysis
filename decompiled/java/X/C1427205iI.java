package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$fetchLyricStickerEffectList$1", f = "LyricStickerEffectDataLogicComponent.kt", l = {597}, m = "invokeSuspend")
public final class C1427205iI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EQZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1427205iI(C0EQZ c0eqz, InterfaceC1364105Vn<? super C1427205iI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0eqz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1427205iI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objO4;
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.fetchLyricStickerEffectList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objO4 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0EQZ c0eqz = this.LLILLJJLI;
            this.LL = 1;
            objO4 = c0eqz.O4(this);
            if (objO4 == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.fetchLyricStickerEffectList$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJJIII.postValue(C189200o6.m1boximpl(objO4));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.fetchLyricStickerEffectList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
