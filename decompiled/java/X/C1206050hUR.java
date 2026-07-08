package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel$load$3", f = "TemplateSelectionViewModel.kt", l = {119}, m = "invokeSuspend")
public final class C1206050hUR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMAiGroupShotConfig.TemplateConfig.Selecting LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ TemplateSelectionViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206050hUR(IMAiGroupShotConfig.TemplateConfig.Selecting selecting, Context context, TemplateSelectionViewModel templateSelectionViewModel, InterfaceC1364105Vn<? super C1206050hUR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selecting;
        this.LLILLL = context;
        this.LLILZ = templateSelectionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1206050hUR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC911560ZpS enumC911560ZpS;
        Object value;
        String effectId;
        Object next;
        Effect effect;
        Effect effect2;
        String effectId2;
        C1C7U.LIZ("TemplateSelectionViewModel@653c.load$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.mode == EnumC1206810hVf.GROUP) {
                enumC911560ZpS = EnumC911560ZpS.GROUP_CHAT;
            } else {
                enumC911560ZpS = EnumC911560ZpS.PRIVATE_CHAT;
            }
            InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
            Context context = this.LLILLL;
            this.LL = 1;
            obj = interfaceC911530ZpPLJJIFFI.LJ(context, enumC911560ZpS, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateSelectionViewModel@653c.load$3");
                return objLJFF;
            }
        }
        List list = (List) obj;
        TemplateSelectionViewModel templateSelectionViewModel = this.LLILZ;
        C2252321DDq c2252321DDq = templateSelectionViewModel.LLILZIL;
        IMAiGroupShotConfig.TemplateConfig.Selecting selecting = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
            Iterator it2 = list.iterator();
            while (true) {
                effectId = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    C1698606ky c1698606ky = (C1698606ky) next;
                    if (Intrinsics.LJFF(c1698606ky.LIZIZ.getEffectId(), selecting.preSelectedEffectTemplateId) || Intrinsics.LJFF(c1698606ky.LIZIZ.getResourceId(), selecting.preselectedTemplateResId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1698606ky c1698606ky2 = (C1698606ky) next;
            if (c1698606ky2 != null && (effect2 = c1698606ky2.LIZIZ) != null && (effectId2 = effect2.getEffectId()) != null) {
                effectId = effectId2;
            } else {
                C1698606ky c1698606ky3 = (C1698606ky) C13LP.LJJJLL(list);
                if (c1698606ky3 != null && (effect = c1698606ky3.LIZIZ) != null) {
                    effectId = effect.getEffectId();
                }
            }
            C2252321DDq c2252321DDq2 = templateSelectionViewModel.LL;
            while (!c2252321DDq2.compareAndSet(c2252321DDq2.getValue(), effectId)) {
            }
        } while (!c2252321DDq.compareAndSet(value, effectId));
        C2252321DDq c2252321DDq3 = this.LLILZ.LLILZ;
        while (!c2252321DDq3.compareAndSet(c2252321DDq3.getValue(), list)) {
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSelectionViewModel@653c.load$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
