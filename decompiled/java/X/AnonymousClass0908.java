package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0908, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0908 implements ICheckChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC1635390sev LIZIZ;
    public final /* synthetic */ boolean LIZJ = false;
    public final /* synthetic */ IFetchEffectChannelListener LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        final InterfaceC1635390sev interfaceC1635390sev = this.LIZIZ;
        final String str = this.LIZ;
        final boolean z = this.LIZJ;
        final IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZLLL;
        interfaceC1635390sev.LJJJJI(str, true, z, new IFetchEffectChannelListener() { // from class: X.0909
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult2) {
                interfaceC1635390sev.LJJJJI(str, false, z, iFetchEffectChannelListener);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
                    interfaceC1635390sev.LJJJJI(str, false, z, iFetchEffectChannelListener);
                } else {
                    iFetchEffectChannelListener.onSuccess(effectChannelResponse2);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (Intrinsics.LJFF(this.LIZ, "infostickerv2")) {
            C090A.LIZ = true;
        }
        if (z) {
            this.LIZIZ.LJJJJI(this.LIZ, false, this.LIZJ, this.LIZLLL);
            return;
        }
        final InterfaceC1635390sev interfaceC1635390sev = this.LIZIZ;
        final String str = this.LIZ;
        final boolean z2 = this.LIZJ;
        final IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZLLL;
        interfaceC1635390sev.LJJJJI(str, true, z2, new IFetchEffectChannelListener() { // from class: X.0905
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                interfaceC1635390sev.LJJJJI(str, false, z2, iFetchEffectChannelListener);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                final EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C11O8 c11o8LJJJLZIJ = C11NZ.LJIJJLI(new C1769906wT(effectChannelResponse2, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final InterfaceC1635390sev interfaceC1635390sev2 = interfaceC1635390sev;
                final String str2 = str;
                final boolean z3 = z2;
                final IFetchEffectChannelListener iFetchEffectChannelListener2 = iFetchEffectChannelListener;
                c11o8LJJJLZIJ.LJJLJLI(new C09JN() { // from class: X.0906
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EffectPlatformFunctionsKt@9d78.combineFetchList$1$checkChannelSuccess$1$onSuccess$2");
                        if (((Boolean) obj).booleanValue()) {
                            interfaceC1635390sev2.LJJJJI(str2, false, z3, iFetchEffectChannelListener2);
                        } else {
                            iFetchEffectChannelListener2.onSuccess(effectChannelResponse2);
                        }
                        C1C7U.LIZIZ("EffectPlatformFunctionsKt@9d78.combineFetchList$1$checkChannelSuccess$1$onSuccess$2");
                    }
                });
            }
        });
    }

    public AnonymousClass0908(IFetchEffectChannelListener iFetchEffectChannelListener, InterfaceC1635390sev interfaceC1635390sev, String str) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZLLL = iFetchEffectChannelListener;
    }
}
