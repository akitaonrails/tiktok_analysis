package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2278308wH implements IFetchEffectChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC20236714Gf<Effect> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        String msg;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downLoadAlgorithm ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fail ");
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        C201955140j.LJIIIIZZ(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20236714Gf<Effect> interfaceC20236714Gf = this.LIZIZ;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList;
        EffectCategoryResponse next;
        List<Effect> totalEffects;
        Effect effect;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 != null && (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) != null) {
            String str = this.LIZ;
            Iterator<EffectCategoryResponse> it2 = categoryResponseList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getKey(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EffectCategoryResponse effectCategoryResponse = next;
            if (effectCategoryResponse != null && (totalEffects = effectCategoryResponse.getTotalEffects()) != null && (effect = (Effect) C13LP.LJJJLL(totalEffects)) != null) {
                C1634250sd5.LIZ().LJIIL(effect, new C2500109qx(this.LIZIZ, this, 3));
                return;
            }
        }
        onFail(null);
    }

    public C2278308wH(String str, C2252611DEt c2252611DEt) {
        this.LIZ = str;
        this.LIZIZ = c2252611DEt;
    }
}
