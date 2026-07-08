package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.keva.Keva;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class EnumC1551280qTG {
    public static final EnumC1551280qTG FIFO;
    public static final /* synthetic */ EnumC1551280qTG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1551280qTG SPECIFIC_TIME;

    public EnumC1551280qTG() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1551280qTG> getEntries() {
        return LLILLJJLI;
    }

    public abstract void onUpdateFinished(Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, C1551290qTH c1551290qTH, File file);

    static {
        EnumC1551280qTG enumC1551280qTG = new EnumC1551280qTG() { // from class: X.0qTE
            /* JADX WARN: Removed duplicated region for block: B:131:0x0206 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x00a1 A[SYNTHETIC] */
            @Override // X.EnumC1551280qTG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onUpdateFinished(java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel>> r25, X.C1551290qTH r26, java.io.File r27) {
                /*
                    Method dump skipped, instruction units count: 713
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1551260qTE.onUpdateFinished(java.util.Map, X.0qTH, java.io.File):void");
            }
        };
        FIFO = enumC1551280qTG;
        EnumC1551280qTG enumC1551280qTG2 = new EnumC1551280qTG() { // from class: X.0qTF
            @Override // X.EnumC1551280qTG
            public final void onUpdateFinished(Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, C1551290qTH c1551290qTH, File file) {
                C1551240qTC.LIZ.getClass();
                if (map != null) {
                    for (Map.Entry<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Iterator<T> it2 = entry.getValue().iterator();
                        while (it2.hasNext()) {
                            String str = ((CheckRequestBodyModel.TargetChannel) it2.next()).channelName;
                            if (C1550600qSA.LIZ(key, str)) {
                                Long l = c1551290qTH.LJ;
                                if (l != null) {
                                    C1551240qTC.LIZ.getClass();
                                    Keva keva = (Keva) C1551240qTC.LIZJ.getValue();
                                    if (keva != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(key);
                                        sbLIZ.append('-');
                                        sbLIZ.append(str);
                                        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), l.longValue());
                                    }
                                } else {
                                    C1553130qWF.LIZLLL("SpecificTimeClean", "Used SpecificTimeClean strategy, but no expire time specified");
                                }
                            }
                        }
                    }
                }
            }
        };
        SPECIFIC_TIME = enumC1551280qTG2;
        EnumC1551280qTG[] enumC1551280qTGArr = {enumC1551280qTG, enumC1551280qTG2};
        LL = enumC1551280qTGArr;
        LLILLJJLI = new C2254308sP(enumC1551280qTGArr);
    }

    public static EnumC1551280qTG[] values() {
        return (EnumC1551280qTG[]) LL.clone();
    }

    public static EnumC1551280qTG valueOf(String str) {
        return (EnumC1551280qTG) C08FF.LIZ(EnumC1551280qTG.class, str);
    }

    public EnumC1551280qTG(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0qTG] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.geckox.model.CheckRequestBodyModel$TargetChannel>>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final void postUpdate(Map<String, ? extends List<? extends CheckRequestBodyModel.TargetChannel>> map, Map<String, ? extends CheckRequestParamModel> map2, C1551290qTH c1551290qTH, File file) {
        if (this == FIFO) {
            onUpdateFinished(map, c1551290qTH, file);
            return;
        }
        if (map == 0) {
            if (map2 == null) {
                return;
            }
            map = new LinkedHashMap<>(C2097908Jt.LIZIZ(map2.size()));
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                map.put(entry.getKey(), ((CheckRequestParamModel) entry.getValue()).getTargetChannels());
            }
        }
        onUpdateFinished(map, c1551290qTH, file);
    }
}
