package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0nIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429090nIB {
    public static boolean LJ(InterfaceC1429080nIA interfaceC1429080nIA) {
        if ((interfaceC1429080nIA.scene() == TemplateScene.UGC || interfaceC1429080nIA.scene() == TemplateScene.PUGC) && ((Boolean) C04Q2.LIZ.getValue()).booleanValue()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                C844470XAv.LIZ.getClass();
                if (!creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static Pair<String, String> LJI(InterfaceC1429080nIA interfaceC1429080nIA) {
        List<String> listLIZJ;
        String json;
        if (C2535409we.LIZ()) {
            listLIZJ = C13BV.INSTANCE;
        } else {
            listLIZJ = interfaceC1429080nIA.LIZJ();
        }
        List<Long> listLJFF = LJFF(interfaceC1429080nIA, listLIZJ);
        if (C2535409we.LIZ()) {
            json = C311170CHr.LIZ();
        } else {
            Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
            TemplateScene templateSceneScene = interfaceC1429080nIA.scene();
            List listLIZJ2 = C311170CHr.LIZJ(templateSceneScene, false);
            if (templateSceneScene == TemplateScene.TEMPLATE_TAB) {
                json = C13LP.LJJLIIIJ(listLIZJ2, null, null, null, 0, null, null, 63);
            } else {
                Gson gson = C0CHQ.LIZ().getGson();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
                Iterator it2 = listLIZJ2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it2.next()).intValue()));
                }
                json = GsonProtectorUtils.toJson(gson, arrayList);
            }
        }
        if (interfaceC1429080nIA.scene() == TemplateScene.TEMPLATE_TAB) {
            return new Pair<>(C13LP.LJJLIIIJ(listLJFF, null, null, null, 0, null, null, 63), json);
        }
        Gson gson2 = C0CHQ.LIZ().getGson();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator<Long> it3 = listLJFF.iterator();
        while (it3.hasNext()) {
            arrayList2.add(String.valueOf(it3.next().longValue()));
        }
        return new Pair<>(GsonProtectorUtils.toJson(gson2, arrayList2), json);
    }

    public static List<Long> LJFF(InterfaceC1429080nIA interfaceC1429080nIA, List<String> list) {
        boolean zLJ = LJ(interfaceC1429080nIA);
        int i = C1395040mPG.LIZ[interfaceC1429080nIA.scene().ordinal()];
        if (i != 1 && i != 2) {
            return C13LP.LLIIII(C1432220nNE.LIZ.LIZIZ(list, zLJ));
        }
        return C13LP.LLIIII(C1432220nNE.LIZ.LIZJ(list, zLJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Integer> LIZJ(X.InterfaceC1429080nIA r4, java.util.List<java.lang.Integer> r5, X.C1429030nI5 r6) {
        /*
            java.util.List<java.lang.Object> r0 = r6.LIZ
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L57
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C1429040nI6
            if (r0 == 0) goto L6
        L15:
            boolean r0 = r1 instanceof X.C1429040nI6
            if (r0 == 0) goto L1a
            r2 = r1
        L1a:
            X.0nI6 r2 = (X.C1429040nI6) r2
            if (r2 == 0) goto L55
            boolean r0 = r2.LIZ
            r1 = 1
            if (r0 != r1) goto L55
        L23:
            java.util.Map<X.0CIJ, X.0CHu> r0 = X.C311170CHr.LIZ
            com.ss.android.ugc.aweme.services.external.TemplateScene r0 = r4.scene()
            java.util.List r4 = X.C311170CHr.LIZJ(r0, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L36
            r3.add(r1)
            goto L36
        L55:
            r1 = 0
            goto L23
        L57:
            r1 = r2
            goto L15
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429090nIB.LIZJ(X.0nIA, java.util.List, X.0nI5):java.util.List");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean LIZ(InterfaceC1429080nIA interfaceC1429080nIA, List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
        Object obj;
        Object next;
        boolean z;
        List listLIZLLL;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (C2535409we.LIZ()) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(LJFF(interfaceC1429080nIA, C13BV.INSTANCE));
        boolean zLJ = LJ(interfaceC1429080nIA);
        C1432220nNE c1432220nNE = C1432220nNE.LIZ;
        if (!c1432220nNE.LIZ(arrayList2, arrayList, zLJ)) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(LJFF(interfaceC1429080nIA, interfaceC1429080nIA.LJFF(c1429030nI5)));
        if (!c1432220nNE.LIZ(arrayList3, arrayList, zLJ)) {
            return false;
        }
        if (list2.isEmpty()) {
            return true;
        }
        Iterator<Object> it2 = c1429030nI5.LIZ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1429040nI6) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C1429040nI6) {
            obj = next;
        }
        C1429040nI6 c1429040nI6 = (C1429040nI6) obj;
        if (c1429040nI6 != null && c1429040nI6.LIZ) {
            z = true;
        } else {
            z = false;
        }
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        TemplateScene templateSceneScene = interfaceC1429080nIA.scene();
        if (z) {
            listLIZLLL = C311170CHr.LIZIZ();
        } else {
            int i = C1395030mPF.LIZ[templateSceneScene.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        listLIZLLL = C311170CHr.LIZIZ();
                    } else {
                        listLIZLLL = C311170CHr.LIZLLL(C0CI4.TEMPLATE_TAB);
                    }
                } else {
                    listLIZLLL = C311170CHr.LIZLLL(C0CI4.AUTOCUT_LIST);
                }
            } else {
                listLIZLLL = C311170CHr.LIZLLL(C0CI4.TEMPLATE_ANCHOR);
            }
        }
        if (list2.isEmpty()) {
            return true;
        }
        Iterator<Integer> it3 = list2.iterator();
        while (it3.hasNext()) {
            if (!listLIZLLL.contains(Integer.valueOf(it3.next().intValue()))) {
                return false;
            }
        }
        return true;
    }

    public static Pair<Integer, Integer> LIZIZ(InterfaceC1429080nIA interfaceC1429080nIA, List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
        List<String> listLJFF;
        int i;
        List listLIZJ;
        ArrayList arrayList = new ArrayList();
        if (C2535409we.LIZ()) {
            listLJFF = C13BV.INSTANCE;
        } else {
            listLJFF = interfaceC1429080nIA.LJFF(c1429030nI5);
        }
        arrayList.addAll(LJFF(interfaceC1429080nIA, listLJFF));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list);
        C1432220nNE c1432220nNE = C1432220nNE.LIZ;
        boolean zLJ = LJ(interfaceC1429080nIA);
        c1432220nNE.getClass();
        int i2 = 32;
        int i3 = 0;
        if (zLJ) {
            int i4 = 0;
            loop0: do {
                long jLIZIZ = C00RV.LIZIZ(i4, arrayList, arrayList2);
                if (jLIZIZ != 0) {
                    int i5 = 0;
                    while (((jLIZIZ >>> i5) & 1) != 1) {
                        i5++;
                        if (i5 < 32) {
                        }
                    }
                    i = (i4 * 32) + i5;
                    break loop0;
                }
                i4++;
            } while (i4 < 3);
            i = -1;
            break;
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        if (arrayList2.size() > jSONArray.length()) {
            int length = jSONArray.length();
            int iLongValue = (int) ((Number) ListProtector.get(arrayList2, length)).longValue();
            while ((iLongValue >>> i3) % 2 != 1) {
                i3++;
                if (i3 >= 32) {
                    i = -1;
                    break;
                }
            }
            i = (length * 32) + i3;
        } else {
            int size = arrayList2.size();
            i = -1;
            int i6 = 0;
            while (i6 < size) {
                long jLongValue = ((Number) ListProtector.get(arrayList2, i6)).longValue();
                int i7 = JSONArrayProtectorUtils.getInt(jSONArray, i6);
                int i8 = 0;
                while (true) {
                    if (i8 < i2) {
                        int i9 = i7 >>> i8;
                        if (((int) (jLongValue >>> i8)) % 2 == 1 && i9 % 2 == 0) {
                            i = (i6 * 32) + i8;
                            if (i != -1) {
                                break;
                            }
                        } else {
                            i8++;
                            i2 = 32;
                        }
                    }
                }
                i6++;
                i2 = 32;
            }
        }
        if (C2535409we.LIZ()) {
            listLIZJ = C13BV.INSTANCE;
        } else {
            listLIZJ = LIZJ(interfaceC1429080nIA, list2, c1429030nI5);
        }
        if (listLIZJ.isEmpty()) {
            return new Pair<>(Integer.valueOf(i), -1);
        }
        return new Pair<>(Integer.valueOf(i), C13LP.LJJJJZI(listLIZJ));
    }

    public static List<Integer> LIZLLL(InterfaceC1429080nIA interfaceC1429080nIA, List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
        List<String> listLJFF;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        if (C2535409we.LIZ()) {
            listLJFF = C13BV.INSTANCE;
        } else {
            listLJFF = interfaceC1429080nIA.LJFF(c1429030nI5);
        }
        arrayList3.addAll(LJFF(interfaceC1429080nIA, listLJFF));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list);
        C1432220nNE c1432220nNE = C1432220nNE.LIZ;
        boolean zLJ = LJ(interfaceC1429080nIA);
        c1432220nNE.getClass();
        if (zLJ) {
            arrayList2 = new ArrayList();
            int i = 0;
            do {
                long jLIZIZ = C00RV.LIZIZ(i, arrayList3, arrayList4);
                if (jLIZIZ != 0) {
                    int i2 = 0;
                    do {
                        if (((jLIZIZ >>> i2) & 1) == 1) {
                            arrayList2.add(Integer.valueOf((i * 32) + i2));
                        }
                        i2++;
                    } while (i2 < 32);
                }
                i++;
            } while (i < 3);
        } else {
            arrayList2 = new ArrayList();
            JSONArray jSONArray = new JSONArray((Collection) arrayList3);
            if (arrayList4.size() > jSONArray.length()) {
                int size = arrayList4.size();
                for (int length = jSONArray.length(); length < size; length++) {
                    int iLongValue = (int) ((Number) ListProtector.get(arrayList4, length)).longValue();
                    int i3 = 0;
                    do {
                        if ((iLongValue >>> i3) % 2 == 1) {
                            arrayList2.add(Integer.valueOf((length * 32) + i3));
                        }
                        i3++;
                    } while (i3 < 32);
                }
            } else {
                int size2 = arrayList4.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    long jLongValue = ((Number) ListProtector.get(arrayList4, i4)).longValue();
                    int i5 = JSONArrayProtectorUtils.getInt(jSONArray, i4);
                    int i6 = 0;
                    do {
                        int i7 = i5 >>> i6;
                        if (((int) (jLongValue >>> i6)) % 2 == 1 && i7 % 2 == 0) {
                            arrayList2.add(Integer.valueOf((i4 * 32) + i6));
                        }
                        i6++;
                    } while (i6 < 32);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList2);
        if (!C2535409we.LIZ()) {
            arrayList5.addAll(LIZJ(interfaceC1429080nIA, arrayList, c1429030nI5));
        }
        return arrayList5;
    }
}
