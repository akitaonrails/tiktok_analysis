package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.AlgorithmConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Content;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredRequirements$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
public final class C370501cF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Boolean>>, Object> {
    public final /* synthetic */ Config LL;
    public final /* synthetic */ AlgorithmConfig LLILLJJLI;
    public final /* synthetic */ Content LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370501cF(Config config, AlgorithmConfig algorithmConfig, Content content, InterfaceC1364105Vn<? super C370501cF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = config;
        this.LLILLJJLI = algorithmConfig;
        this.LLILLL = content;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370501cF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        Map<String, Boolean> map;
        Set<Map.Entry<String, Boolean>> setEntrySet;
        List<Node> list;
        Effect effect;
        Map<String, Boolean> map2;
        Set<Map.Entry<String, Boolean>> setEntrySet2;
        C1C7U.LIZ("EffectParserKt@53dc.parseEffect$2$deferredRequirements$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Config config = this.LL;
        AlgorithmConfig algorithmConfig = this.LLILLJJLI;
        Content content = this.LLILLL;
        ArrayList<Pair> arrayList = new ArrayList();
        if (config != null && (effect = config.effect) != null && (map2 = effect.requirement) != null && (setEntrySet2 = map2.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet2.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        if (algorithmConfig != null && (list = algorithmConfig.nodes) != null) {
            Iterator<Node> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(new Pair(it3.next().type, Boolean.TRUE));
            }
        }
        if (content != null && (map = content.requirement) != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it4 = setEntrySet.iterator();
            while (it4.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Boolean bool = (Boolean) linkedHashMap.get(pair.getFirst());
            boolean z = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Object first = pair.getFirst();
            if (zBooleanValue || ((Boolean) pair.getSecond()).booleanValue()) {
                z = true;
            }
            linkedHashMap.put(first, Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredRequirements$1");
        return linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
