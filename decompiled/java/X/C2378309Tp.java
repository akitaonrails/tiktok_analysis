package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09Tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceListByOnlyCategory$2$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C2378309Tp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<List<ReadTextEffectBean>> LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378309Tp(List<List<ReadTextEffectBean>> list, C11Y7 c11y7, Map<String, String> map, InterfaceC1364105Vn<? super C2378309Tp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c11y7;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2378309Tp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Unit unit;
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.fetchVoiceListByOnlyCategory$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            this.LLILLJJLI.LLLIZZ.LIZ(900);
            this.LLILLJJLI.LLLIZZ.LIZIZ(C786410Ut5.J3(C2347509Ht.LIZ(this.LLILLL)));
            unit = Unit.LIZ;
        } else {
            C11Y7 c11y7 = this.LLILLJJLI;
            c11y7.LLJZ = this.LL;
            InterfaceC1635390sev interfaceC1635390sevL6 = c11y7.L6();
            if (interfaceC1635390sevL6 != null) {
                List<List<ReadTextEffectBean>> list = this.LL;
                C11Y7 c11y72 = this.LLILLJJLI;
                C2377309Tf.LIZ(interfaceC1635390sevL6);
                List<ReadTextEffectBean> listLIZ = C2247008rE.LIZ(list);
                if (c11y72.I7().JX()) {
                    c11y72.I7().NC0(listLIZ);
                }
                c11y72.LLL = c11y72.FY1(listLIZ);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        }
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceListByOnlyCategory$2$1");
        return unit;
    }
}
