package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.RecordMusicStickerComponent$onCreate$1$3$1$1", f = "RecordMusicStickerComponent.kt", l = {197, 200}, m = "invokeSuspend")
public final class C1647480syQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1647520syU LL;
    public C1647800syw LLILLJJLI;
    public C0FTJ LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0FTJ<StickerModel> LLILZIL;
    public final /* synthetic */ C1647800syw LLILZLL;
    public final /* synthetic */ InterfaceC1647520syU LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1647480syQ(C0FTJ<? extends StickerModel> c0ftj, C1647800syw c1647800syw, InterfaceC1647520syU interfaceC1647520syU, InterfaceC1364105Vn<? super C1647480syQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0ftj;
        this.LLILZLL = c1647800syw;
        this.LLIZ = interfaceC1647520syU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647480syQ(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0FTJ<StickerModel> c0ftj;
        InterfaceC1647520syU interfaceC1647520syU;
        C1647800syw c1647800syw;
        C1C7U.LIZ("RecordMusicStickerComponent@c17e.onCreate$1$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c0ftj = this.LLILLL;
                    c1647800syw = this.LLILLJJLI;
                    interfaceC1647520syU = this.LL;
                    C155000ia.LIZIZ(obj);
                    interfaceC1647520syU.LJ0(c1647800syw.LLIZ, C1664590tQ1.LJII(c1647800syw).getResources().getString(2131837724), c0ftj, null, null, null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordMusicStickerComponent@c17e.onCreate$1$3$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0FTJ<StickerModel> c0ftj2 = this.LLILZIL;
            if (c0ftj2 != null) {
                this.LLILZ = 1;
                if (c0ftj2.LJIJJ(false, this) == objLJFF) {
                    C1C7U.LIZIZ("RecordMusicStickerComponent@c17e.onCreate$1$3$1$1");
                    return objLJFF;
                }
            }
        }
        C1647800syw c1647800syw2 = this.LLILZLL;
        c1647800syw2.Bu(c1647800syw2.LLIZ);
        c0ftj = this.LLILZIL;
        if (c0ftj != null) {
            interfaceC1647520syU = this.LLIZ;
            c1647800syw = this.LLILZLL;
            this.LL = interfaceC1647520syU;
            this.LLILLJJLI = c1647800syw;
            this.LLILLL = c0ftj;
            this.LLILZ = 2;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("RecordMusicStickerComponent@c17e.onCreate$1$3$1$1");
                return objLJFF;
            }
            interfaceC1647520syU.LJ0(c1647800syw.LLIZ, C1664590tQ1.LJII(c1647800syw).getResources().getString(2131837724), c0ftj, null, null, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordMusicStickerComponent@c17e.onCreate$1$3$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
