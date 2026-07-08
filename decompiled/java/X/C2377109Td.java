package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.text.logic.EditorProTextEventListener$downloadTTSResourceAndStartTTS$2", f = "EditorProTextEventListener.kt", l = {599, 617, 652}, m = "invokeSuspend")
public final class C2377109Td extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1635410sex LL;
    public int LLILLJJLI;
    public final /* synthetic */ EditorProTTSHelper LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ NLETrackSlot LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377109Td(EditorProTTSHelper editorProTTSHelper, Function0<Unit> function0, String str, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C2377109Td> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = editorProTTSHelper;
        this.LLILZ = function0;
        this.LLILZIL = str;
        this.LLILZLL = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377109Td(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        Object objLIZIZ = obj;
        C1C7U.LIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2377209Te c2377209Te = new C2377209Te(this.LLILLL, this.LLILZ, null);
            this.LL = null;
            this.LLILLJJLI = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c2377209Te) == objLJFF) {
                C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(objLIZIZ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
                return unit2;
            }
            interfaceC1635410sexLIZ = this.LL;
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C2247008rE c2247008rELIZ = C2377309Tf.LIZ(interfaceC1635410sexLIZ);
            AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(159);
            this.LL = interfaceC1635410sexLIZ;
            this.LLILLJJLI = 1;
            objLIZIZ = c2247008rELIZ.LIZIZ(this, aFwS231S0000000_3);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
                return objLJFF;
            }
        }
        C2377309Tf.LIZ(interfaceC1635410sexLIZ);
        List<ReadTextEffectBean> listLIZ = C2247008rE.LIZ((List) objLIZIZ);
        Iterator it2 = ((ArrayList) listLIZ).iterator();
        while (it2.hasNext()) {
            ((ReadTextEffectBean) it2.next()).category = new TTSCategory("", "default", "all", 8);
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C2377709Tj c2377709Tj = new C2377709Tj(listLIZ, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        objLIZIZ = C23250099c.LJI(this, abstractC2238408pq2, c2377709Tj);
        if (objLIZIZ == objLJFF) {
            C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
