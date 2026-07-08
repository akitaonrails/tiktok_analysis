package X;

import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelEffectCountSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1$1$result$1", f = "StickerShortCutWidget.kt", l = {}, m = "invokeSuspend")
public final class C0U9Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StickerShortCutWidget LL;
    public final /* synthetic */ AbstractC401801hI<LiveEffect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0U9Z(StickerShortCutWidget stickerShortCutWidget, AbstractC401801hI<? extends LiveEffect> abstractC401801hI, InterfaceC1364105Vn<? super C0U9Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = stickerShortCutWidget;
        this.LLILLJJLI = abstractC401801hI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U9Z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        LiveEffect liveEffect;
        C1C7U.LIZ("StickerShortCutWidget@5ed5.observeViewModel$1$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StickerShortCutWidget stickerShortCutWidget = this.LL;
        ArrayList arrayList = new ArrayList(((C402101hL) this.LLILLJJLI).LIZ);
        stickerShortCutWidget.getClass();
        LiveEffect liveEffect2 = C767750U9t.LJ;
        if (liveEffect2 != null) {
            arrayList.remove(liveEffect2);
            ListProtector.add(arrayList, 0, liveEffect2);
        }
        C767640U9i c767640U9iP71 = C767630U9h.LL.p71("");
        if (c767640U9iP71 != null && (liveEffect = c767640U9iP71.LIZ) != null) {
            liveEffect.getLogParams().LIZ = true;
            arrayList.remove(liveEffect);
            ListProtector.add(arrayList, 0, liveEffect);
        }
        LiveEffect liveEffectLIZ = C0UAS.LIZ(arrayList);
        if (liveEffectLIZ != null) {
            arrayList.remove(liveEffectLIZ);
            ListProtector.add(arrayList, 0, liveEffectLIZ);
        }
        List<LiveEffect> listLJI = C767630U9h.LJI("");
        arrayList.removeAll(listLJI);
        arrayList.addAll(0, listLJI);
        LiveEffect liveEffectLIZ2 = C0U9D.LIZ(arrayList, true);
        if (liveEffectLIZ2 != null && C0U9D.LIZ != null) {
            arrayList.remove(liveEffectLIZ2);
            ListProtector.add(arrayList, 0, liveEffectLIZ2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            LiveEffect liveEffect3 = (LiveEffect) obj2;
            C767780U9w c767780U9w = C767780U9w.LIZ;
            if (!C767780U9w.LIZIZ(liveEffect3) && ((stickerSDKExtraLJLJLLL = liveEffect3.LJLJLLL()) == null || stickerSDKExtraLJLJLLL.commerceExtra == null)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List<LiveEffect> listSubList = arrayList3.subList(0, Math.min(LiveEffectShortcutPanelEffectCountSetting.INSTANCE.getValue(), arrayList3.size()));
        StickerShortCutWidget stickerShortCutWidget2 = this.LL;
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        liveEffectOld.LJJLJ = C0U9E.NONE;
        ListProtector.add(listSubList, 0, liveEffectOld);
        LiveEffect liveEffect4 = stickerShortCutWidget2.LLIZLLLIL;
        if (liveEffect4 != null && (!C13LP.LJJJJ(liveEffect4, listSubList))) {
            Boolean.valueOf(listSubList.add(liveEffect4));
        } else {
            LiveEffect liveEffect5 = stickerShortCutWidget2.LLJJI;
            if (liveEffect5 != null && (true ^ listSubList.contains(liveEffect5))) {
                Boolean.valueOf(listSubList.add(liveEffect5));
            }
        }
        stickerShortCutWidget2.LLIZ = listSubList;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerShortCutWidget@5ed5.observeViewModel$1$1$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
