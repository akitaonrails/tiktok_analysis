package X;

import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FPN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.StickerInfoInit$createInfoSticker$2$1$1", f = "StickerInfoInit.kt", l = {}, m = "invokeSuspend")
public final class C0FPN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1465460oEq LL;
    public final /* synthetic */ List<Pair<C348460DlM, Effect>> LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<List<? extends TextStickerData.Pair<C348460DlM, ? extends StickerItemModel>>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FPN(C1465460oEq c1465460oEq, List<? extends Pair<C348460DlM, ? extends Effect>> list, InterfaceC1364105Vn<? super List<? extends TextStickerData.Pair<C348460DlM, ? extends StickerItemModel>>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C0FPN> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = c1465460oEq;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FPN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerInfoInit@7b1a.createInfoSticker$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ChangeAvatarModel changeAvatarModel = this.LL.LIZIZ.creativeModel.changeAvatarModel;
        List<Pair<C348460DlM, Effect>> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Pair<C348460DlM, Effect>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSecond().getEffectId());
        }
        changeAvatarModel.stickerIds = C13LP.LLIIII(arrayList);
        List<Pair<C348460DlM, Effect>> list2 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (Pair<C348460DlM, Effect> pair : list2) {
            C348460DlM first = pair.getFirst();
            StickerItemModel stickerItemModel = new StickerItemModel();
            stickerItemModel.initWidth = 0.0f;
            stickerItemModel.initHeight = 0.0f;
            stickerItemModel.path = pair.getFirst().LJIIL;
            stickerItemModel.stickerId = pair.getFirst().LJIILL;
            stickerItemModel.type = pair.getSecond().getEffectType();
            stickerItemModel.uuid = pair.getFirst().LIZIZ;
            stickerItemModel.startTime = 0;
            C577660MlA.LIZ.getClass();
            stickerItemModel.endTime = C577660MlA.LIZ().maxDuration;
            stickerItemModel.uiStartTime = 0;
            stickerItemModel.uiEndTime = C577660MlA.LIZ().maxDuration;
            stickerItemModel.currentOffsetX = pair.getFirst().LJFF;
            stickerItemModel.currentOffsetY = pair.getFirst().LJI;
            arrayList2.add(new TextStickerData.Pair(first, stickerItemModel));
        }
        List listLLIIII = C13LP.LLIIII(arrayList2);
        InterfaceC1364105Vn<List<? extends TextStickerData.Pair<C348460DlM, ? extends StickerItemModel>>> interfaceC1364105Vn = this.LLILLL;
        C189200o6.m2constructorimpl(listLLIIII);
        interfaceC1364105Vn.resumeWith(listLLIIII);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerInfoInit@7b1a.createInfoSticker$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
