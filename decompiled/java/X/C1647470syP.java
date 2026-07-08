package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$onCreate$1$6$1$1", f = "RecordAddYoursStickerComponent.kt", l = {233}, m = "invokeSuspend")
public final class C1647470syP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ C1647720syo LLILLL;
    public final /* synthetic */ InterfaceC1647520syU LLILZ;
    public final /* synthetic */ C0FTJ<StickerModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1647470syP(C0FTJ<? extends StickerModel> c0ftj, C1647720syo c1647720syo, InterfaceC1647520syU interfaceC1647520syU, C0FTJ<? extends StickerModel> c0ftj2, InterfaceC1364105Vn<? super C1647470syP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = c1647720syo;
        this.LLILZ = interfaceC1647520syU;
        this.LLILZIL = c0ftj2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647470syP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordAddYoursStickerComponent@8021.onCreate$1$6$1$1");
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
            C0FTJ<StickerModel> c0ftj = this.LLILLJJLI;
            this.LL = 1;
            if (c0ftj.LJIJJ(false, this) == objLJFF) {
                C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.onCreate$1$6$1$1");
                return objLJFF;
            }
        }
        String string = C1664590tQ1.LJIIIZ(this.LLILLL).getString(2131825071);
        if (!C1443960ngA.LJI(this.LLILLL.getShortVideoContext()) || C573130Mdr.LIZ()) {
            this.LLILZ.LJ0(true, string, this.LLILZIL, null, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.onCreate$1$6$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
