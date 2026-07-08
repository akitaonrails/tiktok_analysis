package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder$bindDraftCover$1", f = "DraftItemBaseBgViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C553690Lnb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftItemBaseBgViewHolder LL;
    public final /* synthetic */ C0M0P LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553690Lnb(DraftItemBaseBgViewHolder draftItemBaseBgViewHolder, C0M0P c0m0p, int i, InterfaceC1364105Vn<? super C553690Lnb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftItemBaseBgViewHolder;
        this.LLILLJJLI = c0m0p;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553690Lnb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final AwemeDraft awemeDraftLJ;
        C1C7U.LIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final DraftItemBaseBgViewHolder draftItemBaseBgViewHolder = this.LL;
        final C0M0P c0m0p = this.LLILLJJLI;
        final int i = this.LLILLL;
        try {
            awemeDraftLJ = draftItemBaseBgViewHolder.R5().LJ(c0m0p.LJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (awemeDraftLJ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1");
            return unit;
        }
        C0MZ9.LJIIIIZZ(awemeDraftLJ, (VideoCoverConfig) draftItemBaseBgViewHolder.LLJIJIL.getValue(), new IEffectService.OnVideoCoverCallback() { // from class: X.0Lnc
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                InterfaceC497601wk interfaceC497601wkU5 = draftItemBaseBgViewHolder.U5();
                if (interfaceC497601wkU5 != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wkU5, C2107308Nj.LIZ, null, new C553710Lnd(bitmap, draftItemBaseBgViewHolder, awemeDraftLJ, c0m0p, i, null), 2);
                }
            }
        });
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
