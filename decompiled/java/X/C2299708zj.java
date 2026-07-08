package X;

import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerScene$onActivityCreated$5$1", f = "EditInfoStickerScene.kt", l = {}, m = "invokeSuspend")
public final class C2299708zj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C196864120o LL;
    public final /* synthetic */ List<Pair<C348460DlM, Effect>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2299708zj(C196864120o c196864120o, List<? extends Pair<C348460DlM, ? extends Effect>> list, InterfaceC1364105Vn<? super C2299708zj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c196864120o;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2299708zj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditInfoStickerScene@1c43.onActivityCreated$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ChangeAvatarModel changeAvatarModel = this.LL.LLLLIIIILLL().creativeModel.changeAvatarModel;
        List<Pair<C348460DlM, Effect>> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Pair<C348460DlM, Effect>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSecond().getEffectId());
        }
        changeAvatarModel.stickerIds = C13LP.LLIIII(arrayList);
        List<Pair<C348460DlM, Effect>> list2 = this.LLILLJJLI;
        C196864120o c196864120o = this.LL;
        for (Pair<C348460DlM, Effect> pair : list2) {
            c196864120o.LLLIL().sJ0(pair.getFirst(), null, pair.getSecond().getEffectType());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditInfoStickerScene@1c43.onActivityCreated$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
