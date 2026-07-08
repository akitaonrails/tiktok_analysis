package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteRecentStickerListViewModel$provideStickerPositionMapper$1$recordStickers$1", f = "FavoriteRecentStickerListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1368305Xd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Effect> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1368405Xe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1368305Xd(List<? extends Effect> list, int i, C1368405Xe c1368405Xe, InterfaceC1364105Vn<? super C1368305Xd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = c1368405Xe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1368305Xd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FavoriteRecentStickerListViewModel@1ea4.provideStickerPositionMapper$1$recordStickers$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Effect> list = this.LL;
        int i = this.LLILLJJLI;
        C1368405Xe c1368405Xe = this.LLILLL;
        int i2 = 0;
        for (Effect effect : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Effect effect2 = effect;
                if (effect2 != null) {
                    String effectId = effect2.getEffectId();
                    int i4 = i2 + i;
                    if (!TextUtils.isEmpty(effectId)) {
                        if (C1629100sUm.LJFF(effect2)) {
                            c1368405Xe.LIZ.put(effectId, C2286608xc.LJ(i4));
                        } else {
                            c1368405Xe.LIZIZ.put(effectId, C2286608xc.LJ(i4));
                        }
                    }
                    String resourceId = effect2.getResourceId();
                    if (!TextUtils.isEmpty(resourceId)) {
                        c1368405Xe.LIZJ.put(resourceId, C2286608xc.LJ(i4));
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FavoriteRecentStickerListViewModel@1ea4.provideStickerPositionMapper$1$recordStickers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
