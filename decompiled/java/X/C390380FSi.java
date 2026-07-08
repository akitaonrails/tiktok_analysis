package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$addStickerInternal$2", f = "StickerManager.kt", l = {1126}, m = "invokeSuspend")
public final class C390380FSi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FFE<StickerModel> LLILLJJLI;
    public final /* synthetic */ C390390FSj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C390380FSi(C0FFE<? extends StickerModel> c0ffe, C390390FSj c390390FSj, InterfaceC1364105Vn<? super C390380FSi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ffe;
        this.LLILLL = c390390FSj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390380FSi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerManager@19f6.addStickerInternal$2");
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
            C0FFE<StickerModel> c0ffe = this.LLILLJJLI;
            this.LL = 1;
            obj = c0ffe.LJIJJ(false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerManager@19f6.addStickerInternal$2");
                return objLJFF;
            }
        }
        StickerModel stickerModel = (StickerModel) obj;
        List<C0FTB> list = this.LLILLL.LJIILIIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) list) {
            if (C13LQ.LJIILLIIL(stickerModel.getStickerType(), ((C0FTB) obj2).LJJIJIL())) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = C13LP.LLIIII(arrayList).iterator();
        while (it2.hasNext()) {
            ((C0FTB) it2.next()).f4(stickerModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerManager@19f6.addStickerInternal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
