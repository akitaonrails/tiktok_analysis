package X;

import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$applyLyricsEffect$4$1", f = "LyricStickerEffectDataLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C364300EQa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1426205i8 LL;
    public final /* synthetic */ C05WK LLILLJJLI;
    public final /* synthetic */ InterfaceC364330EQd LLILLL;
    public final /* synthetic */ List<LyricStickerModel> LLILZ;
    public final /* synthetic */ C0EQZ LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364300EQa(C1426205i8 c1426205i8, C05WK c05wk, InterfaceC364330EQd interfaceC364330EQd, List<LyricStickerModel> list, C0EQZ c0eqz, boolean z, InterfaceC1364105Vn<? super C364300EQa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1426205i8;
        this.LLILLJJLI = c05wk;
        this.LLILLL = interfaceC364330EQd;
        this.LLILZ = list;
        this.LLILZIL = c0eqz;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C364300EQa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.applyLyricsEffect$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1426205i8 c1426205i8 = this.LL;
        if (c1426205i8 != null) {
            c1426205i8.LIZIZ(0.0f, EnumC1426605iC.APPLY_EFFECT);
        }
        InterfaceC364330EQd interfaceC364330EQd = this.LLILLL;
        List<LyricStickerModel> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        Iterator<LyricStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            String musicId = it2.next().getMusicId();
            if (musicId != null) {
                arrayList.add(musicId);
            }
        }
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.COMMIT;
        interfaceC364330EQd.M0(arrayList, enumC356070Dxd);
        this.LLILLL.M(this.LLILZ, enumC356070Dxd);
        boolean zO2 = this.LLILZIL.o2(this.LLILZLL);
        C1426205i8 c1426205i82 = this.LL;
        if (c1426205i82 != null) {
            c1426205i82.LIZIZ(1.0f, EnumC1426605iC.APPLY_EFFECT);
        }
        if (zO2) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.applyLyricsEffect$4$1");
            return unit;
        }
        throw new Exception("apply music failed loop state change failed");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
