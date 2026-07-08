package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.text.logic.EditorProTextEventListener$downloadTTSResourceAndStartTTS$2$2", f = "EditorProTextEventListener.kt", l = {}, m = "invokeSuspend")
public final class C2377709Tj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ReadTextEffectBean> LL;
    public final /* synthetic */ EditorProTTSHelper LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ NLETrackSlot LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377709Tj(List<ReadTextEffectBean> list, EditorProTTSHelper editorProTTSHelper, Function0<Unit> function0, String str, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C2377709Tj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = editorProTTSHelper;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377709Tj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            EditorProTTSHelper.LIZJ(this.LLILLJJLI, new AwS582S0100000_3(this.LLILLL, (Function0<Unit>) 107));
            unit = Unit.LIZ;
        } else {
            boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
            Iterator<ReadTextEffectBean> it2 = this.LL.iterator();
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
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) C13LP.LJJJLL(this.LL);
            if (readTextEffectBean != null) {
                EditorProTTSHelper.LIZLLL(this.LLILLJJLI, false, this.LLILZ, this.LLILZIL, readTextEffectBean.mSpeaker.speakreID, new AwS582S0100000_3(this.LLILLL, (Function0<Unit>) 108), 64);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        }
        C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
