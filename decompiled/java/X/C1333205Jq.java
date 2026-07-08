package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333205Jq {
    public EnumC1333405Js LIZ;
    public final Map<EnumC1333405Js, Function2<EnumC1333405Js, EnumC1333405Js, EnumC1333405Js>> LIZIZ;
    public final Set<Function1<EnumC1333405Js, Unit>> LIZJ;

    public C1333205Jq() {
        EnumC1333405Js enumC1333405Js = EnumC1333405Js.INIT;
        this.LIZ = enumC1333405Js;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashSet();
        Function2<EnumC1333405Js, EnumC1333405Js, EnumC1333405Js> function2 = new Function2<EnumC1333405Js, EnumC1333405Js, EnumC1333405Js>() { // from class: X.05Jt
            @Override // kotlin.jvm.functions.Function2
            public final EnumC1333405Js invoke(EnumC1333405Js enumC1333405Js2, EnumC1333405Js enumC1333405Js3) {
                EnumC1333405Js enumC1333405Js4 = enumC1333405Js2;
                EnumC1333405Js enumC1333405Js5 = enumC1333405Js3;
                if (enumC1333405Js5 != EnumC1333405Js.DESTROY && enumC1333405Js5.ordinal() != enumC1333405Js4.ordinal() + 1) {
                    return null;
                }
                return enumC1333405Js5;
            }
        };
        linkedHashMap.put(enumC1333405Js, function2);
        linkedHashMap.put(EnumC1333405Js.IMMEDIATE_START, function2);
        linkedHashMap.put(EnumC1333405Js.IMMEDIATE_COMPLETE, function2);
        linkedHashMap.put(EnumC1333405Js.RENDER_FIRST_FRAME, function2);
        linkedHashMap.put(EnumC1333405Js.FIRST_FRAME_COMPLETE, function2);
    }

    public final void LIZ(EnumC1333405Js enumC1333405Js) {
        EnumC1333405Js enumC1333405Js2;
        Function2 function2 = (Function2) ((LinkedHashMap) this.LIZIZ).get(this.LIZ);
        if (function2 != null && (enumC1333405Js2 = (EnumC1333405Js) function2.invoke(this.LIZ, enumC1333405Js)) != null) {
            this.LIZ = enumC1333405Js2;
            Iterator<Function1<EnumC1333405Js, Unit>> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(enumC1333405Js);
            }
        }
    }
}
