package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Link;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import njp.a;

/* JADX INFO: renamed from: X.01cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredFeatures$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
public final class C370801cI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public final /* synthetic */ Config LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370801cI(Config config, InterfaceC1364105Vn<? super C370801cI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = config;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370801cI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        List<Link> list2;
        C1C7U.LIZ("EffectParserKt@53dc.parseEffect$2$deferredFeatures$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Config config = this.LL;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Effect effect = config.effect;
        if (effect != null && (list2 = effect.links) != null) {
            for (Link link : list2) {
                String str = link.type;
                if (str != null) {
                    linkedHashSet.add(str);
                }
                if (link.rawType != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OLD_ENGINE_");
                    sbLIZ.append(link.rawType);
                    linkedHashSet.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        Effect effect2 = config.effect;
        if (effect2 != null) {
            list = effect2.bgms;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            linkedHashSet.add("bgm");
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (new Regex("^AR(V\\d+)?$").containsMatchIn((String) it2.next())) {
                    linkedHashSet.add("AR");
                    break;
                }
            }
        }
        List listLLIIII = C13LP.LLIIII(linkedHashSet);
        C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredFeatures$1");
        return listLLIIII;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
