package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v7.o;

/* JADX INFO: renamed from: X.0tBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1655450tBH implements Function0 {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;
    public final /* synthetic */ o LLIZ;

    public /* synthetic */ C1655450tBH(int i, Context context, Bundle bundle, o oVar, String str, boolean z, boolean z2) {
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = str;
        this.LLILZLL = bundle;
        this.LLIZ = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        final ProgressDialogC1399790mWv progressDialogC1399790mWvLIZ;
        Context context = this.LL;
        boolean z = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z2 = this.LLILZ;
        final String str = this.LLILZIL;
        final Bundle bundle = this.LLILZLL;
        final o oVar = this.LLIZ;
        final InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(context, null);
        if (z) {
            progressDialogC1399790mWvLIZ = C576210Mip.LIZ(context, EnumC1399820mWy.VISIBLE_AFTER_5S, new InterfaceC1399800mWw() { // from class: X.0tBh
                @Override // X.InterfaceC1399800mWw
                public final void LIZ() {
                }
            });
            progressDialogC1399790mWvLIZ.setMessage(context.getString(i));
            progressDialogC1399790mWvLIZ.setCancelable(false);
            progressDialogC1399790mWvLIZ.setIndeterminate(true);
            C786410Ut5.O4(progressDialogC1399790mWvLIZ);
            C1688680u2s.LJIIL(true, 1502);
        } else {
            progressDialogC1399790mWvLIZ = null;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_flip_shoot_icon_effect_opti", true, false) || !z2) {
            C1626140sQ0.LIZ(interfaceC1635410sexLIZ).LIZ(str, "", new IFetchEffectListener() { // from class: X.0tBP
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    C1688680u2s.LJIIIIZZ(effect, progressDialogC1399790mWvLIZ, bundle, oVar);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    C1688680u2s.LJII(progressDialogC1399790mWvLIZ, exceptionResult, oVar);
                }
            });
            return Unit.LIZ;
        }
        EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
        if (effectListResponseLIZ != null && !effectListResponseLIZ.getData().isEmpty()) {
            C1688680u2s.LJIIJ(interfaceC1635410sexLIZ, progressDialogC1399790mWvLIZ, str, bundle, oVar, effectListResponseLIZ);
            return Unit.LIZ;
        }
        final ProgressDialogC1399790mWv progressDialogC1399790mWv = progressDialogC1399790mWvLIZ;
        interfaceC1635410sexLIZ.LIZ(Collections.singletonList(str), null, new IFetchEffectListByIdsListener() { // from class: X.0tBL
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1688680u2s.LJII(progressDialogC1399790mWv, exceptionResult, oVar);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                EffectListResponse effectListResponse2 = effectListResponse;
                if (effectListResponse2 != null && !effectListResponse2.getData().isEmpty()) {
                    C1688680u2s.LJIIJ(interfaceC1635410sexLIZ, progressDialogC1399790mWv, str, bundle, oVar, effectListResponse2);
                } else {
                    C1688680u2s.LJII(progressDialogC1399790mWv, null, oVar);
                }
            }
        });
        return Unit.LIZ;
    }
}
