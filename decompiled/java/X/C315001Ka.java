package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import njp.a;

/* JADX INFO: renamed from: X.01Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$getOpenGlVersionFromFile$2", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
public final class C315001Ka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ File LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315001Ka(File file, InterfaceC1364105Vn<? super C315001Ka> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315001Ka(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectParserKt@53dc.getOpenGlVersionFromFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Regex regex = new Regex("#version\\s+([0-9]+)\\s+es");
        Iterator it2 = ((ArrayList) C09BH.LJFF(this.LL)).iterator();
        while (it2.hasNext()) {
            MatchResult matchResultFind$default = Regex.find$default(regex, (String) it2.next(), 0, 2, null);
            if (matchResultFind$default != null) {
                try {
                    if (matchResultFind$default.LIZ().size() == 2) {
                        Integer numLJ = C2286608xc.LJ(CastIntegerProtector.parseInt(matchResultFind$default.LIZ().get(1)));
                        C1C7U.LIZIZ("EffectParserKt@53dc.getOpenGlVersionFromFile$2");
                        return numLJ;
                    }
                    continue;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.getOpenGlVersionFromFile$2");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
