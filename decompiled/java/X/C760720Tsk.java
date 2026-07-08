package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerHelper$realGetLiveEffect$2$1$1$onSuccess$4$2$1", f = "MultiGuestStickerHelper.kt", l = {88}, m = "invokeSuspend")
public final class C760720Tsk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1364105Vn LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<LiveEffect> LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C760720Tsk(InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn, LiveEffect liveEffect, List<String> list, String str, InterfaceC1364105Vn<? super C760720Tsk> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = liveEffect;
        this.LLILZIL = list;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760720Tsk(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn<LiveEffect> interfaceC1364105Vn;
        C1C7U.LIZ("MultiGuestStickerHelper@da8a.realGetLiveEffect$2$1$1$onSuccess$4$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1364105Vn = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC1364105Vn = this.LLILLL;
            C760740Tsm c760740Tsm = C760740Tsm.LIZ;
            final LiveEffect liveEffect = this.LLILZ;
            List<String> list = this.LLILZIL;
            String str = this.LLILZLL;
            this.LL = interfaceC1364105Vn;
            this.LLILLJJLI = 1;
            c760740Tsm.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel", str);
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ().fetchEffectList(list, false, (Map<String, String>) linkedHashMap, new IFetchEffectListListener() { // from class: X.0Tsl
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<LiveEffect> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list2) {
                    List<Effect> list3 = list2;
                    if (list3 != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        Iterator<Effect> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C0UEO.LIZLLL(it2.next()));
                        }
                        LiveEffect liveEffect2 = liveEffect;
                        InterfaceC1364105Vn<LiveEffect> interfaceC1364105Vn2 = c23260099m;
                        liveEffect2.LLD(arrayList);
                        C189200o6.m2constructorimpl(liveEffect2);
                        interfaceC1364105Vn2.resumeWith(liveEffect2);
                        return;
                    }
                    InterfaceC1364105Vn<LiveEffect> interfaceC1364105Vn3 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn3.resumeWith(null);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiGuestStickerHelper@da8a.realGetLiveEffect$2$1$1$onSuccess$4$2$1");
                return objLJFF;
            }
        }
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestStickerHelper@da8a.realGetLiveEffect$2$1$1$onSuccess$4$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
