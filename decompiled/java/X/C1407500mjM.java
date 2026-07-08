package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.publish.PublishAudioMixReuseComponent$registerObservers$1$1$1", f = "PublishAudioMixReuseComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407500mjM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1408300mke LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC1452170ntP LLILLL;
    public final /* synthetic */ Pair<String, Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407500mjM(C1408300mke c1408300mke, boolean z, InterfaceC1452170ntP interfaceC1452170ntP, Pair<String, Boolean> pair, InterfaceC1364105Vn<? super C1407500mjM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1408300mke;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1452170ntP;
        this.LLILZ = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407500mjM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModelLIZ;
        C1C7U.LIZ("PublishAudioMixReuseComponent@9abc.registerObservers$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.W1(EnumC1407490mjL.REMIX_ANOTHER_MUSIC);
        if (this.LLILLJJLI) {
            this.LL.W1(EnumC1407490mjL.MUSIC_PANEL_RESET_ORIGIN_SOUND);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PublishAudioMixReuseComponent@9abc.registerObservers$1$1$1");
            return unit;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILLL;
        if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null) {
            if (this.LL.Z1(nLEModelLIZ, this.LLILZ)) {
                C1408300mke c1408300mke = this.LL;
                if (!c1408300mke.LLIZLLLIL) {
                    c1408300mke.LLIZLLLIL = true;
                    c1408300mke.B3(nLEModelLIZ);
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1407480mjK(this.LL, null), 2);
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PublishAudioMixReuseComponent@9abc.registerObservers$1$1$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PublishAudioMixReuseComponent@9abc.registerObservers$1$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
