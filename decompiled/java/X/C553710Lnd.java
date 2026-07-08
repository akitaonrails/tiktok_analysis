package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Lnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder$bindDraftCover$1$1$callback$1$onGetVideoCoverSuccess$1", f = "DraftItemBaseBgViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C553710Lnd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ DraftItemBaseBgViewHolder LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ C0M0P LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553710Lnd(Bitmap bitmap, DraftItemBaseBgViewHolder draftItemBaseBgViewHolder, AwemeDraft awemeDraft, C0M0P c0m0p, int i, InterfaceC1364105Vn<? super C553710Lnd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = draftItemBaseBgViewHolder;
        this.LLILLL = awemeDraft;
        this.LLILZ = c0m0p;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553710Lnd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C1C7U.LIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1$1$callback$1$onGetVideoCoverSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isRecycled() && this.LLILLJJLI.P5().getTag() != null && Intrinsics.LJFF(this.LLILLJJLI.P5().getTag(), this.LLILLL.LIZJ())) {
            DraftItemBaseBgViewHolder draftItemBaseBgViewHolder = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILZ;
            C376370EpH c376370EpHP5 = draftItemBaseBgViewHolder.P5();
            Bitmap bitmap = this.LL;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    c376370EpHP5.setImageBitmap(bitmap);
                    Object tag = c376370EpHP5.getTag(R.id.g5r);
                    if (tag instanceof Boolean) {
                        bool = (Boolean) tag;
                    } else {
                        bool = null;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    if (!Intrinsics.LJFF(bool, bool2)) {
                        c376370EpHP5.setTag(R.id.g5r, bool2);
                        InterfaceC497601wk interfaceC497601wkU5 = draftItemBaseBgViewHolder.U5();
                        if (interfaceC497601wkU5 != null) {
                            C23250099c.LIZLLL(interfaceC497601wkU5, C0PEM.LIZJ, null, new C477001tQ(c376370EpHP5, bitmap, c0m0p, draftItemBaseBgViewHolder, null), 2);
                        }
                    }
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                } catch (RuntimeException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                    C2344809Gs.LIZ(e2);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1$1$callback$1$onGetVideoCoverSuccess$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.bindDraftCover$1$1$callback$1$onGetVideoCoverSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
