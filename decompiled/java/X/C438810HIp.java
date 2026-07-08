package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.socialavatar.data.IMSocialAvatarStatusManager$refreshStickerSet$1", f = "IMSocialAvatarStatusManager.kt", l = {284}, m = "invokeSuspend")
public final class C438810HIp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C439110HJt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438810HIp(C439110HJt c439110HJt, InterfaceC1364105Vn<? super C438810HIp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439110HJt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438810HIp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        List<StickerItem> list;
        C1C7U.LIZ("IMSocialAvatarStatusManager@4f1f.refreshStickerSet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C439110HJt c439110HJt = this.LLILLJJLI;
                this.LL = 1;
                obj = c439110HJt.LIZIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.refreshStickerSet$1");
                    return objLJFF;
                }
            }
            C439120HJu c439120HJu = (C439120HJu) obj;
            this.LLILLJJLI.LJI.setValue(c439120HJu);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sticker set refreshed: ");
            if (c439120HJu == null || (list = c439120HJu.LIZ) == null) {
                numLJ = null;
            } else {
                numLJ = C2286608xc.LJ(list.size());
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(" stickers");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.refreshStickerSet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
