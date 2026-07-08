package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.08c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.def.GeckoPbDefinitionsProvider$get$created$1", f = "GeckoPbDefinitionsProvider.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C2153408c8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1516780pZc>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153408c8(String str, boolean z, InterfaceC1364105Vn<? super C2153408c8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2153408c8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final BufferedReader bufferedReader;
        C1C7U.LIZ("GeckoPbDefinitionsProvider@7922.get$created$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        InterfaceC1516890pZn interfaceC1516890pZn = null;
        Throwable th = null;
        final boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1517130paB c1517130paB = C1517130paB.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            ConcurrentHashMap<String, AnonymousClass0957<File>> concurrentHashMap = C1517130paB.LIZLLL;
            AnonymousClass0957 anonymousClass0957 = concurrentHashMap.get(str);
            if (anonymousClass0957 != null) {
                obj = c1517130paB.LIZ(str, this, anonymousClass0957);
            } else {
                C099G c099gLIZIZ = C1517130paB.LIZIZ(str);
                AnonymousClass0957 anonymousClass0957PutIfAbsent = concurrentHashMap.putIfAbsent(str, c099gLIZIZ);
                if (anonymousClass0957PutIfAbsent == null) {
                    anonymousClass0957PutIfAbsent = c099gLIZIZ;
                }
                if (anonymousClass0957PutIfAbsent == c099gLIZIZ) {
                    Boolean.valueOf(c099gLIZIZ.start());
                } else {
                    c099gLIZIZ.LIZIZ(null);
                }
                obj = c1517130paB.LIZ(str, this, anonymousClass0957PutIfAbsent);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GeckoPbDefinitionsProvider@7922.get$created$1");
                return objLJFF;
            }
        }
        File file = (File) obj;
        if (file != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(file), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                if (!this.LLILLL) {
                    z = false;
                }
                InterfaceC1516890pZn interfaceC1516890pZn2 = new InterfaceC1516890pZn(bufferedReader, z) { // from class: X.0pZc
                    public static final C1516880pZm LIZIZ = new Object() { // from class: X.0pZm
                    };
                    public final HashMap<String, C1516850pZj> LIZ;

                    @Override // X.InterfaceC1516890pZn
                    public final C1516850pZj get(String str2) {
                        return this.LIZ.get(str2);
                    }

                    {
                        Object obj2;
                        String string;
                        n nVarLJIILIIL;
                        new p();
                        n nVarLJIILIIL2 = p.LIZIZ(bufferedReader).LJIILIIL();
                        LIZIZ.getClass();
                        try {
                            HashMap map = new HashMap();
                            for (Map.Entry<String, k> entry : nVarLJIILIIL2.entrySet()) {
                                String key = entry.getKey();
                                k value = entry.getValue();
                                if ((value instanceof n) && (nVarLJIILIIL = value.LJIILIIL()) != null) {
                                    C1516850pZj.LIZJ.getClass();
                                    Object objLIZ = C1516830pZh.LIZ(nVarLJIILIIL, key, z);
                                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
                                    if (thM5exceptionOrNullimpl == null) {
                                        map.put(key, (C1516850pZj) objLIZ);
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Failed to parse message '");
                                        sbLIZ.append(key);
                                        sbLIZ.append("': ");
                                        sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                                    }
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Top-level entry '");
                                    sbLIZ2.append(key);
                                    sbLIZ2.append("' is not a JSON object: ");
                                    sbLIZ2.append((value == null || (string = value.toString()) == null) ? "null" : string);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    strLIZIZ.toString();
                                    throw new IllegalStateException(strLIZIZ);
                                }
                            }
                            C189200o6.m2constructorimpl(map);
                            obj2 = map;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C098200Yq c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj2 = c098200Yq;
                        }
                        C155000ia.LIZIZ(obj2);
                        HashMap<String, C1516850pZj> map2 = (HashMap) obj2;
                        this.LIZ = map2;
                        for (C1516850pZj c1516850pZj : map2.values()) {
                            int size = c1516850pZj.LIZ.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                C1516820pZg c1516820pZgValueAt = c1516850pZj.LIZ.valueAt(i2);
                                int i3 = c1516820pZgValueAt.LIZJ;
                                if (i3 != 20) {
                                    if (i3 == 21) {
                                        Pair<C1516860pZk, C1516870pZl> pair = c1516820pZgValueAt.LJFF;
                                        if (pair != null) {
                                            C1516860pZk first = pair.getFirst();
                                            C1516870pZl second = pair.getSecond();
                                            String str2 = first.LJ;
                                            if (str2 != null) {
                                                first.LJI = this.LIZ.get(str2);
                                            }
                                            String str3 = second.LJ;
                                            if (str3 != null) {
                                                second.LJI = this.LIZ.get(str3);
                                            }
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("mapInfo is null for field '");
                                            sbLIZ3.append(c1516820pZgValueAt.LIZ);
                                            sbLIZ3.append('\'');
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                            strLIZIZ2.toString();
                                            throw new IllegalStateException(strLIZIZ2);
                                        }
                                    }
                                } else {
                                    String str4 = c1516820pZgValueAt.LJ;
                                    if (str4 != null) {
                                        C1516850pZj c1516850pZj2 = this.LIZ.get(str4);
                                        if (c1516850pZj2 != null) {
                                            c1516820pZgValueAt.LJI = c1516850pZj2;
                                        } else {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("message '");
                                            sbLIZ4.append(c1516820pZgValueAt.LJ);
                                            sbLIZ4.append("' not found for field '");
                                            sbLIZ4.append(c1516820pZgValueAt.LIZ);
                                            sbLIZ4.append('\'');
                                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                                            strLIZIZ3.toString();
                                            throw new IllegalStateException(strLIZIZ3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                };
                C2107108Nh.LIZ(bufferedReader, null);
                interfaceC1516890pZn = interfaceC1516890pZn2;
            } finally {
                try {
                    try {
                    } catch (Throwable th2) {
                        while (true) {
                        }
                    }
                } catch (Throwable th3) {
                }
            }
        }
        C1C7U.LIZIZ("GeckoPbDefinitionsProvider@7922.get$created$1");
        return interfaceC1516890pZn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1516780pZc> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
