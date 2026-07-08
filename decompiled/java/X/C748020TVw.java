package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0TVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748020TVw {
    public static final /* synthetic */ int LIZ = 0;

    public static C0TWA LIZ(final IMultiHostService iMultiHostService, final Context context, final IHybridStorageService iHybridStorageService) {
        if (context == null) {
            C20441214yg.LJ("TTSSettingsPanelModule", "context is null");
            return new C0TWA() { // from class: X.0TVx
                @Override // X.C0TWA
                public final long LIZIZ(long j) {
                    return j;
                }

                @Override // X.C0TWA
                public final List<C954460awe> LIZ() {
                    return C13BV.INSTANCE;
                }
            };
        }
        if (iHybridStorageService == null) {
            C20441214yg.LJ("TTSSettingsPanelModule", "storageService is null");
            return new C0TWA() { // from class: X.0TVx
                @Override // X.C0TWA
                public final long LIZIZ(long j) {
                    return j;
                }

                @Override // X.C0TWA
                public final List<C954460awe> LIZ() {
                    return C13BV.INSTANCE;
                }
            };
        }
        return new C0TWA(iMultiHostService, context, iHybridStorageService) { // from class: X.0TW7
            public final InterfaceC954310awP LIZ = C0TW8.LIZ;
            public final InterfaceC950030apV LIZIZ;
            public final Context LIZJ;
            public final IHybridStorageService LIZLLL;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
            @Override // X.C0TWA
            public final List<C954460awe> LIZ() {
                String str;
                ?? arrayList;
                try {
                    str = (String) this.LIZLLL.Pp2(this.LIZJ, "tts_customized_performer_order", "webcast");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC954310awP interfaceC954310awP = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to get tts_customized_performer_order. e=");
                    sbLIZ.append(e);
                    interfaceC954310awP.e("TakeStagePerformerListFrontEndStorage", C2188811AlT.LIZIZ(sbLIZ));
                    str = null;
                }
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Long.valueOf(CastLongProtector.parseLong(JSONArrayProtectorUtils.getString(jSONArray, i))));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    this.LIZ.e("TakeStagePerformerListFrontEndStorage", "Failed to parse performer uid list:" + str + ". e=" + e2);
                    arrayList = C13BV.INSTANCE;
                }
                List<C954460awe> listLLILZLL = this.LIZIZ.LLILZLL(true);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLLILZLL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C954460awe c954460awe : listLLILZLL) {
                    linkedHashMap.put(Long.valueOf(c954460awe.LJ), c954460awe);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object obj = linkedHashMap.get(Long.valueOf(((Number) it2.next()).longValue()));
                    if (obj == null) {
                        InterfaceC954310awP interfaceC954310awP2 = this.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("User cannot be found in ");
                        sbLIZ2.append(linkedHashMap);
                        interfaceC954310awP2.e("TakeStagePerformerListFrontEndStorage", C2188811AlT.LIZIZ(sbLIZ2));
                        return C13BV.INSTANCE;
                    }
                    arrayList2.add(obj);
                }
                return arrayList2;
            }

            @Override // X.C0TWA
            public final long LIZIZ(long j) {
                Long lLJIILIIL;
                try {
                    String str = (String) this.LIZLLL.Pp2(this.LIZJ, "tts_customized_duration", "webcast");
                    if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                        return lLJIILIIL.longValue();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC954310awP interfaceC954310awP = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to get tts_customized_duration. e=");
                    sbLIZ.append(e);
                    interfaceC954310awP.e("TakeStagePerformerListFrontEndStorage", C2188811AlT.LIZIZ(sbLIZ));
                }
                return j;
            }

            {
                this.LIZIZ = iMultiHostService;
                this.LIZJ = context;
                this.LIZLLL = iHybridStorageService;
            }
        };
    }
}
