package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VoiceChangeLogicComponent$applyVoiceChange$1", f = "VoiceChangeApiComponent.kt", l = {}, m = "invokeSuspend")
public final class C19541811cu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C19541711ct LLILLJJLI;
    public final /* synthetic */ C19536311c1 LLILLL;
    public final /* synthetic */ Function2<Effect, AudioEffectParam, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19541811cu(String str, C19541711ct c19541711ct, C19536311c1 c19536311c1, Function2<? super Effect, ? super AudioEffectParam, Unit> function2, InterfaceC1364105Vn<? super C19541811cu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c19541711ct;
        this.LLILLL = c19536311c1;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19541811cu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        C1C7U.LIZ("VoiceChangeLogicComponent@80a3.applyVoiceChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2286708xd.LIZJ(this.LL) && !C1664590tQ1.LJII(this.LLILLJJLI).isDestroyed()) {
            C19536311c1 c19536311c1 = this.LLILLL;
            c19536311c1.LJ = this.LL;
            C19541711ct c19541711ct = this.LLILLJJLI;
            if (!c19541711ct.LLJIJIL) {
                c19541711ct.o2().FZ1(this.LLILLL, this.LLILLJJLI.X1(), null);
                AbstractC1452680nuE abstractC1452680nuEGc = this.LLILLJJLI.X1().gc();
                if (abstractC1452680nuEGc != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                    Boolean.valueOf(nLEEditor.commit());
                }
                Function2<Effect, AudioEffectParam, Unit> function2 = this.LLILZ;
                if (function2 != null) {
                    function2.invoke(this.LLILLL.LIZJ, null);
                }
            } else {
                c19541711ct.LLJILJIL = c19536311c1;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChangeLogicComponent@80a3.applyVoiceChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
