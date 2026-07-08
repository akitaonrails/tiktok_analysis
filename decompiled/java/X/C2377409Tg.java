package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$realFetchVoiceEffect$1", f = "TTSFragment.kt", l = {511, 520, 559}, m = "invokeSuspend")
public final class C2377409Tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377409Tg(TTSFragment tTSFragment, InterfaceC1364105Vn<? super C2377409Tg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377409Tg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.realFetchVoiceEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2377509Th c2377509Th = new C2377509Th(this.LLILLJJLI, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c2377509Th) == objLJFF) {
                C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2247008rE c2247008rELIZ = C2377309Tf.LIZ((InterfaceC1635390sev) this.LLILLJJLI.LLLI.getValue());
            AFwS231S0000000_3 aFwS231S0000000_3 = this.LLILLJJLI.LLLLL;
            this.LL = 1;
            obj = c2247008rELIZ.LIZIZ(this, aFwS231S0000000_3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (this.LLILLJJLI.getActivity() != null) {
            C19EG activity = this.LLILLJJLI.getActivity();
            if (activity == null || !activity.isFinishing()) {
                z = false;
            }
            if (!z) {
                C2377309Tf.LIZ((InterfaceC1635390sev) this.LLILLJJLI.LLLI.getValue());
                List<ReadTextEffectBean> listLIZ = C2247008rE.LIZ(list);
                Iterator it2 = ((ArrayList) listLIZ).iterator();
                while (it2.hasNext()) {
                    ((ReadTextEffectBean) it2.next()).category = new TTSCategory("", "default", "all", 8);
                }
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C2377609Ti c2377609Ti = new C2377609Ti(this.LLILLJJLI, listLIZ, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c2377609Ti) == objLJFF) {
                    C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
                    return objLJFF;
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
