package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository$refreshAddedStickerSets$1", f = "BasicStickerRepository.kt", l = {151}, m = "invokeSuspend")
public final class C450070Hkr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C450100Hku LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450070Hkr(C450100Hku c450100Hku, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c450100Hku;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C450070Hkr c450070Hkr = new C450070Hkr(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c450070Hkr.LLILLJJLI = obj;
        return c450070Hkr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLIZJ = obj;
        C1C7U.LIZ("BasicStickerRepository@45d8.refreshAddedStickerSets$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                String str = this.LLILLL;
                InterfaceC045100Ef interfaceC045100EfLIZ = C452670Hp3.LIZ();
                int scene = EnumC439130HJv.ADDED_LIST.getScene();
                this.LL = 1;
                objLIZJ = interfaceC045100EfLIZ.LIZJ(null, 0L, 100L, scene, str, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshAddedStickerSets$1");
                    return objLJFF;
                }
            }
            c098200Yq = ((StickerSetListResponse) objLIZJ).getStickerSetInfoList();
            if (c098200Yq == null) {
                c098200Yq = C13BV.INSTANCE;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C450100Hku c450100Hku = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list = (List) c098200Yq;
            c450100Hku.LJIIJJI = true;
            c450100Hku.LIZLLL.setValue(new C450040Hko(list, false));
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Long l = ((StickerSetInfo) it2.next()).setId;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            c450100Hku.refreshSetStickers(arrayList, null);
        }
        C450100Hku c450100Hku2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c450100Hku2.LIZLLL.setValue(new C450050Hkp(thM5exceptionOrNullimpl));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshAddedStickerSets$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
