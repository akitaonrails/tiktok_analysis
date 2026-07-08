package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0smn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640270smn implements InterfaceC1640280smo {
    public final InterfaceC1635390sev LIZ;
    public final InterfaceC1639870sm9 LIZIZ;

    public C1640270smn(InterfaceC1635390sev interfaceC1635390sev, InterfaceC1639870sm9 interfaceC1639870sm9) {
        this.LIZ = interfaceC1635390sev;
        this.LIZIZ = interfaceC1639870sm9;
    }

    @Override // X.InterfaceC1640280smo
    public final void LIZ(EffectCategoryResponse effectCategoryResponse, IUpdateTagListener iUpdateTagListener) {
        InterfaceC1635390sev interfaceC1635390sev = this.LIZ;
        String id = effectCategoryResponse.getId();
        String tagsUpdateTime = effectCategoryResponse.getTagsUpdateTime();
        if (iUpdateTagListener == null) {
            iUpdateTagListener = new IUpdateTagListener() { // from class: X.0smq
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
                public final void onFinally() {
                }
            };
        }
        interfaceC1635390sev.lg(id, tagsUpdateTime, iUpdateTagListener);
    }

    @Override // X.InterfaceC1640280smo
    public final void LIZIZ(EffectCategoryResponse effectCategoryResponse, C1640310smr c1640310smr) {
        this.LIZ.mg(effectCategoryResponse.getId(), effectCategoryResponse.getTags(), effectCategoryResponse.getTagsUpdateTime(), c1640310smr);
    }

    @Override // X.InterfaceC1640280smo
    public final void LIZJ(FilterBean filterBean, IUpdateTagListener iUpdateTagListener) {
        Map map;
        InterfaceC1640320sms interfaceC1640320smsLJJI = this.LIZIZ.LJJI();
        if (filterBean != null && (map = (Map) interfaceC1640320smsLJJI.LIZIZ().getValue()) != null) {
            Effect effect = (Effect) map.get(filterBean.getName());
            if (effect != null || (effect = (Effect) map.get(filterBean.getEnName())) != null) {
                InterfaceC1635390sev interfaceC1635390sev = this.LIZ;
                String id = effect.getId();
                String tagsUpdatedAt = effect.getTagsUpdatedAt();
                if (iUpdateTagListener == null) {
                    iUpdateTagListener = new IUpdateTagListener() { // from class: X.0smp
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
                        public final void onFinally() {
                        }
                    };
                }
                interfaceC1635390sev.lg(id, tagsUpdatedAt, iUpdateTagListener);
            }
        }
    }
}
