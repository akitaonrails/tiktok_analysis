package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.longpress.TakoLongPressUtil$buildVideoSaveConfig$1$2$1", f = "TakoLongPressUtil.kt", l = {1088}, m = "invokeSuspend")
public final class C1856670yPp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public Object LLILLL;
    public TakoInteractionConfig LLILZ;
    public int LLILZIL;
    public final /* synthetic */ WeakReference<View> LLILZLL;
    public final /* synthetic */ List<BaseVideo> LLIZ;
    public final /* synthetic */ Message LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ InterfaceC665370Q7z LLJI;
    public final /* synthetic */ WeakReference<InterfaceC665370Q7z> LLJIJIL;
    public final /* synthetic */ TakoInteractionConfig LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856670yPp(WeakReference<View> weakReference, List<BaseVideo> list, Message message, String str, InterfaceC665370Q7z interfaceC665370Q7z, WeakReference<InterfaceC665370Q7z> weakReference2, TakoInteractionConfig takoInteractionConfig, InterfaceC1364105Vn<? super C1856670yPp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = weakReference;
        this.LLIZ = list;
        this.LLIZLLLIL = message;
        this.LLJ = str;
        this.LLJI = interfaceC665370Q7z;
        this.LLJIJIL = weakReference2;
        this.LLJILJIL = takoInteractionConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1856670yPp(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        Reference reference;
        TakoInteractionConfig takoInteractionConfig;
        C13LC<C1863850ybP> c13lcT71;
        C1C7U.LIZ("TakoLongPressUtil@966e.buildVideoSaveConfig$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                takoInteractionConfig = this.LLILZ;
                reference = (Reference) this.LLILLL;
                interfaceC665370Q7z = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            View view = this.LLILZLL.get();
            if (view != null) {
                C0DQF.LJII(C0DQF.LIZ, view, 2131849901, null, null, 28);
            }
            BaseVideo baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, this.LLIZ);
            if (baseVideo == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoSaveConfig$1$2$1");
                return unit;
            }
            View view2 = this.LLILZLL.get();
            if (view2 != null) {
                Message message = this.LLIZLLLIL;
                String str = this.LLJ;
                interfaceC665370Q7z = this.LLJI;
                reference = this.LLJIJIL;
                takoInteractionConfig = this.LLJILJIL;
                C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
                C1863850ybP c1863850ybP = null;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
                    c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
                }
                this.LL = view2;
                this.LLILLJJLI = interfaceC665370Q7z;
                this.LLILLL = reference;
                this.LLILZ = takoInteractionConfig;
                this.LLILZIL = 1;
                if (c1857420yR2.LJJII(baseVideo, message, str, view2, c1863850ybP, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoSaveConfig$1$2$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoSaveConfig$1$2$1");
            return unit2;
        }
        if (reference.get() != null && takoInteractionConfig != null) {
            C1858720yT8.LIZ(takoInteractionConfig, false, interfaceC665370Q7z);
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoSaveConfig$1$2$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
