package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.music.EditMusicStickerComponent$addSticker$2$1$1$1", f = "EditMusicStickerComponent.kt", l = {274}, m = "invokeSuspend")
public final class C1663030tNV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC391240FVq LLILLJJLI;
    public final /* synthetic */ C19621111ph LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1663030tNV(InterfaceC391240FVq interfaceC391240FVq, C19621111ph c19621111ph, InterfaceC1364105Vn<? super C1663030tNV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC391240FVq;
        this.LLILLL = c19621111ph;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1663030tNV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int id;
        C1C7U.LIZ("EditMusicStickerComponent@6f9.addSticker$2$1$1$1");
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
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("EditMusicStickerComponent@6f9.addSticker$2$1$1$1");
                return objLJFF;
            }
        }
        InterfaceC391240FVq interfaceC391240FVq = this.LLILLJJLI;
        String string = C1664590tQ1.LJIIIZ(this.LLILLL).getString(2131837724);
        StickerModel stickerModelPX1 = this.LLILLL.pX1();
        if (stickerModelPX1 != null) {
            id = stickerModelPX1.getId();
        } else {
            id = 0;
        }
        interfaceC391240FVq.LLILII(true, string, id, C0FSX.BOTTOM, C2286608xc.LJ(52), C2286608xc.LJ(R.attr.ee), null, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditMusicStickerComponent@6f9.addSticker$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
