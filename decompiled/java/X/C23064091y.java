package X;

import com.ss.android.ugc.effectmanager.common.model.ApiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import wuk.f;

/* JADX INFO: renamed from: X.091y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerRepository$horizontalFlow$1", f = "DefaultStickerRepository.kt", l = {}, m = "invokeSuspend")
public final class C23064091y extends C09AX implements InterfaceC1631620sYq<ApiState<? extends C23065091z>, Integer, InterfaceC1364105Vn<? super ApiState<? extends C23065091z>>, Object> {
    public /* synthetic */ ApiState LL;
    public final /* synthetic */ f LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23064091y(f fVar, InterfaceC1364105Vn<? super C23064091y> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1C7U.LIZ("DefaultStickerRepository@bad7.horizontalFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ApiState success = this.LL;
        if (success instanceof ApiState.Success) {
            f fVar = this.LLILLJJLI;
            ApiState.Success success2 = (ApiState.Success) success;
            HorizontalEffectsModel horizontalEffectsModel = ((C23065091z) success2.data).LIZ;
            InterfaceC23045091f value = fVar.LJIIJ.getValue();
            ArrayList arrayList3 = new ArrayList(horizontalEffectsModel.trending_effects);
            value.LIZ("", arrayList3);
            List<? extends Effect> list = horizontalEffectsModel.favorite_effects;
            ArrayList arrayList4 = null;
            if (list != null) {
                arrayList = new ArrayList(list);
                value.LIZ("", arrayList);
            } else {
                arrayList = null;
            }
            List<? extends Effect> list2 = horizontalEffectsModel.recent_effects;
            if (list2 != null) {
                arrayList2 = new ArrayList(list2);
                value.LIZ("", arrayList2);
            } else {
                arrayList2 = null;
            }
            List<? extends Effect> list3 = horizontalEffectsModel.insert_effects;
            if (list3 != null) {
                arrayList4 = new ArrayList(list3);
                value.LIZ("", arrayList4);
            }
            success = new ApiState.Success(new C23065091z(horizontalEffectsModel.copy(arrayList3, arrayList, arrayList2, arrayList4, horizontalEffectsModel.left_trending_effects, horizontalEffectsModel.url_prefix, horizontalEffectsModel.from_cache, horizontalEffectsModel.logId), ((C23065091z) success2.data).LIZIZ));
        }
        C1C7U.LIZIZ("DefaultStickerRepository@bad7.horizontalFlow$1");
        return success;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(ApiState<? extends C23065091z> apiState, Integer num, InterfaceC1364105Vn<? super ApiState<? extends C23065091z>> interfaceC1364105Vn) {
        num.intValue();
        C23064091y c23064091y = new C23064091y(this.LLILLJJLI, interfaceC1364105Vn);
        c23064091y.LL = apiState;
        return c23064091y.invokeSuspend(Unit.LIZ);
    }
}
