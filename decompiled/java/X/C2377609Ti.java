package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$realFetchVoiceEffect$1$2", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2377609Ti extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TTSFragment LL;
    public final /* synthetic */ List<ReadTextEffectBean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377609Ti(TTSFragment tTSFragment, List<ReadTextEffectBean> list, InterfaceC1364105Vn<? super C2377609Ti> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTSFragment;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377609Ti(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.realFetchVoiceEffect$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1749280vcc c1749280vcc = this.LL.LLLL;
        if (c1749280vcc != null) {
            C786410Ut5.LJLLLLLL(8, c1749280vcc);
        }
        if (this.LLILLJJLI.isEmpty()) {
            this.LL.oT();
        } else {
            this.LL.LLLLII.clear();
            this.LL.LLLLII.addAll(this.LLILLJJLI);
            this.LL.jT();
            if (this.LL.LLLLII.isEmpty()) {
                this.LL.oT();
            } else {
                boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
                Iterator<ReadTextEffectBean> it2 = this.LL.LLLLII.iterator();
                while (it2.hasNext()) {
                    ReadTextEffectBean next = it2.next();
                    if (next.mSpeaker.lockEasterEgg == 1) {
                        it2.remove();
                    } else {
                        if (zYi2 && next.LIZJ()) {
                            it2.remove();
                        }
                        if (C1664460tPo.LJ(next.effect)) {
                            Effect effect = next.effect;
                            C1446130njf.LIZ.getClass();
                            if (!C1446130njf.LIZIZ(effect, "is_publich_for_voice_clone", false)) {
                                it2.remove();
                            }
                        }
                    }
                }
                C2377909Tl c2377909Tl = this.LL.LLLIIIIL;
                C2377909Tl c2377909Tl2 = null;
                if (c2377909Tl == null) {
                    c2377909Tl = null;
                }
                c2377909Tl.LIZ.clear();
                TTSFragment tTSFragment = this.LL;
                C2377909Tl c2377909Tl3 = tTSFragment.LLLIIIIL;
                if (c2377909Tl3 == null) {
                    c2377909Tl3 = null;
                }
                c2377909Tl3.LIZ.addAll(tTSFragment.LLLLII);
                C2377909Tl c2377909Tl4 = this.LL.LLLIIIIL;
                if (c2377909Tl4 != null) {
                    c2377909Tl2 = c2377909Tl4;
                }
                if (c2377909Tl2.LIZ.isEmpty()) {
                    this.LL.oT();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1$2");
                    return unit;
                }
                this.LL.DT(true);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
