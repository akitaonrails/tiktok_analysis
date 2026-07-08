package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository$updateAddedStickerSets$1", f = "BasicStickerRepository.kt", l = {176}, m = "invokeSuspend")
public final class C450080Hks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<StickerSetInfo> LLILLL;
    public final /* synthetic */ C450100Hku LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450080Hks(List<StickerSetInfo> list, C450100Hku c450100Hku, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C450080Hks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c450100Hku;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C450080Hks c450080Hks = new C450080Hks(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c450080Hks.LLILLJJLI = obj;
        return c450080Hks;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLIZLLL = obj;
        C1C7U.LIZ("BasicStickerRepository@45d8.updateAddedStickerSets$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                List<StickerSetInfo> list = this.LLILLL;
                InterfaceC045100Ef interfaceC045100EfLIZ = C452670Hp3.LIZ();
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                ArrayList arrayList = new ArrayList();
                Iterator<StickerSetInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().setId;
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                sb.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                sb.append(']');
                String string = sb.toString();
                this.LL = 1;
                objLIZLLL = interfaceC045100EfLIZ.LIZLLL(string, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("BasicStickerRepository@45d8.updateAddedStickerSets$1");
                    return objLJFF;
                }
            }
            c098200Yq = (BaseResponse) objLIZLLL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C450100Hku c450100Hku = this.LLILZ;
        List<StickerSetInfo> list2 = this.LLILLL;
        Function0<Unit> function0 = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c450100Hku.LIZLLL.setValue(new C450040Hko(list2, false));
            ArrayList arrayList2 = new ArrayList();
            Iterator<StickerSetInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                Long l2 = it3.next().setId;
                if (l2 != null) {
                    arrayList2.add(l2);
                }
            }
            c450100Hku.refreshSetStickers(arrayList2, null);
            function0.invoke();
        }
        Function0<Unit> function02 = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            function02.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerRepository@45d8.updateAddedStickerSets$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
