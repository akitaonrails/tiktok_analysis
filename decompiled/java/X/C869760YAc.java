package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0YAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869760YAc extends C09AY implements Function0<C0Y1X> {
    public final /* synthetic */ C0YBI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869760YAc(C0YBI c0ybi) {
        super(0);
        this.LL = c0ybi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Y1X invoke() {
        if (this.LL.LIZ.LJIIIZ().LJJLIIIIJ.LJIIZILJ) {
            final C0YEM c0yem = this.LL.LIZ;
            return new C0Y1X(c0yem) { // from class: X.0YAC
                public final C0YEM LIZIZ;
                public final InterfaceC864790XwD LIZJ;
                public final C0Y5R LIZLLL;

                @Override // X.C0Y1X
                public final List<C0YAE> LIZLLL() throws Throwable {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    try {
                        Throwable th = null;
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI("SELECT * FROM participant", "getAllMemberList", null);
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                try {
                                    arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                                } catch (Throwable th2) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th2;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    try {
                                                        break;
                                                    } catch (Throwable th5) {
                                                        TryCatchGuardChecker.doCheck(th5);
                                                        if (th != null) {
                                                            C13SZ.LIZ(th, th5);
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getAllMemberList failed", e);
                                                    this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                    return arrayList;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        }
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th7) {
                                TryCatchGuardChecker.doCheck(th7);
                            }
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getAllMemberList");
                        return arrayList;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getAllMemberList failed", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        return arrayList;
                    }
                }

                {
                    this.LIZIZ = c0yem;
                    InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
                    this.LIZJ = interfaceC864790XwDLJIIZILJ;
                    this.LIZLLL = interfaceC864790XwDLJIIZILJ.LIZIZ();
                }

                public static C0YAE LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
                    C0YAE c0yae = new C0YAE();
                    c0yae.setAlias(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ALIAS.key)));
                    c0yae.setConversationId(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_CONVERSATION_ID.key)));
                    c0yae.setRole(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ROLE.key)));
                    c0yae.setSortOrder(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SORT_ORDER.key)));
                    c0yae.setUid(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_USER_ID.key)));
                    c0yae.setSecUid(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SEC_UID.key)));
                    c0yae.setSilent(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT.key)));
                    c0yae.setSilentTime(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT_TIME.key)));
                    return c0yae;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r5v3, types: [X.0YAC] */
                @Override // X.C0Y1X
                public final Map<String, List<C0YAE>> LJ(List<String> list) throws Throwable {
                    List listLJJJJLI = C13LP.LJJJJLI(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                    while (true) {
                        boolean z = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((String) next).length() > 0) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return C2097608Jq.LJ();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(383), 31);
                    C0YAC c0yacLIZ = C2188811AlT.LIZ();
                    c0yacLIZ.append("\n            SELECT * FROM participant\n            WHERE ");
                    C0YAD c0yad = C0YAD.COLUMN_CONVERSATION_ID;
                    c0yacLIZ.append(c0yad.key);
                    c0yacLIZ.append(" IN (");
                    c0yacLIZ.append(strLJJLIIIJ);
                    c0yacLIZ.append(")\n            ORDER BY ");
                    c0yacLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                    c0yacLIZ.append("\n        ");
                    String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(c0yacLIZ));
                    try {
                        c0yacLIZ = this;
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = c0yacLIZ.LIZLLL.getProxy().LJIIJJI(strLIZJ, "getMembersMap", (String[]) arrayList.toArray(new String[0]));
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key);
                                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                    String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                                    Object arrayList2 = linkedHashMap.get(string);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        linkedHashMap.put(string, arrayList2);
                                    }
                                    ((List) arrayList2).add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    try {
                                                        break;
                                                    } catch (Throwable th3) {
                                                        TryCatchGuardChecker.doCheck(th3);
                                                        if (th != null) {
                                                            C13SZ.LIZ(th, th3);
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c0yacLIZ.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMembersMap failed", e);
                                                    c0yacLIZ.LIZJ.LJFF().getEventTracker().LJ(e);
                                                    return linkedHashMap;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        c0yacLIZ.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = null;
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                c0yacLIZ.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                            }
                        }
                        c0yacLIZ.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMembersMap");
                        return linkedHashMap;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        c0yacLIZ.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMembersMap failed", e);
                        c0yacLIZ.LIZJ.LJFF().getEventTracker().LJ(e);
                        return linkedHashMap;
                    }
                }

                @Override // X.C0Y1X
                public final List<C0YAE> LJFF(String str) throws Throwable {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return C13BV.INSTANCE;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(Integer.valueOf(C0Z9N.OWNER.getValue()), Integer.valueOf(C0Z9N.ADMIN.getValue())), null, null, null, 0, null, null, 63);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n            SELECT * FROM participant\n            WHERE ");
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ?\n            AND ");
                    sbLIZ.append(C0YAD.COLUMN_ROLE.key);
                    sbLIZ.append(" IN (");
                    sbLIZ.append(strLJJLIIIJ);
                    sbLIZ.append(")\n            ORDER BY ");
                    sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                    sbLIZ.append("\n        ");
                    try {
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "getGroupManagerList", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                try {
                                    arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            while (true) {
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    try {
                                                        try {
                                                            break;
                                                        } catch (Throwable th3) {
                                                            TryCatchGuardChecker.doCheck(th3);
                                                            if (th != null) {
                                                                C13SZ.LIZ(th, th3);
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        TryCatchGuardChecker.doCheck(e);
                                                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getGroupManagerList failed", e);
                                                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                        return arrayList;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = null;
                                    }
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                            }
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getGroupManagerList");
                        return arrayList;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getGroupManagerList failed", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        return arrayList;
                    }
                }

                @Override // X.C0Y1X
                public final List<Long> LJI(String str) throws Throwable {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return C13BV.INSTANCE;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n            SELECT ");
                    C0YAD c0yad = C0YAD.COLUMN_USER_ID;
                    sbLIZ.append(c0yad.key);
                    sbLIZ.append(" FROM participant\n            WHERE ");
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ?\n            ORDER BY ");
                    sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                    sbLIZ.append("\n        ");
                    try {
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "getMemberId", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key);
                                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                    arrayList.add(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex)));
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = null;
                                }
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                try {
                                                    break;
                                                } catch (Throwable th4) {
                                                    TryCatchGuardChecker.doCheck(th4);
                                                    if (th != null) {
                                                        C13SZ.LIZ(th, th4);
                                                    }
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                TryCatchGuardChecker.doCheck(e);
                                                this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberId failed", e);
                                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                return arrayList;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    throw th;
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                            }
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberId");
                        return arrayList;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }

                @Override // X.C0Y1X
                public final List<C0YAE> LJIIIIZZ(String str) throws Throwable {
                    boolean z;
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return C13BV.INSTANCE;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n            SELECT * FROM participant\n            WHERE ");
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ?\n            ORDER BY ");
                    sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                    sbLIZ.append("\n        ");
                    try {
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "getMemberList", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                try {
                                    arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            while (true) {
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    try {
                                                        try {
                                                            break;
                                                        } catch (Throwable th3) {
                                                            TryCatchGuardChecker.doCheck(th3);
                                                            if (th != null) {
                                                                C13SZ.LIZ(th, th3);
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        TryCatchGuardChecker.doCheck(e);
                                                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberList failed", e);
                                                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                        return arrayList;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = null;
                                    }
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                            }
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberList");
                        return arrayList;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberList failed", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        return arrayList;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r5v3, types: [X.0YAC] */
                @Override // X.C0Y1X
                public final Map<String, List<Long>> LJIIIZ(List<String> list) throws Throwable {
                    List listLJJJJLI = C13LP.LJJJJLI(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                    while (true) {
                        boolean z = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((String) next).length() > 0) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return C2097608Jq.LJ();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(382), 31);
                    C0YAC c0yacLIZ = C2188811AlT.LIZ();
                    c0yacLIZ.append("\n            SELECT ");
                    C0YAD c0yad = C0YAD.COLUMN_CONVERSATION_ID;
                    c0yacLIZ.append(c0yad.key);
                    c0yacLIZ.append(", ");
                    C0YAD c0yad2 = C0YAD.COLUMN_USER_ID;
                    c0yacLIZ.append(c0yad2.key);
                    c0yacLIZ.append("\n            FROM participant\n            WHERE ");
                    c0yacLIZ.append(c0yad.key);
                    c0yacLIZ.append(" IN (");
                    c0yacLIZ.append(strLJJLIIIJ);
                    c0yacLIZ.append(")\n            ORDER BY ");
                    c0yacLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                    c0yacLIZ.append("\n        ");
                    String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(c0yacLIZ));
                    try {
                        c0yacLIZ = this;
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = c0yacLIZ.LIZLLL.getProxy().LJIIJJI(strLIZJ, "getMemberIdMap", (String[]) arrayList.toArray(new String[0]));
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key);
                                int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad2.key);
                                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                    String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                                    long j = interfaceC869470Y8zLJIIJJI.getLong(columnIndex2);
                                    Object arrayList2 = linkedHashMap.get(string);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        linkedHashMap.put(string, arrayList2);
                                    }
                                    ((List) arrayList2).add(Long.valueOf(j));
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    try {
                                                        break;
                                                    } catch (Throwable th3) {
                                                        TryCatchGuardChecker.doCheck(th3);
                                                        if (th != null) {
                                                            C13SZ.LIZ(th, th3);
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c0yacLIZ.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberIdMap failed", e);
                                                    c0yacLIZ.LIZJ.LJFF().getEventTracker().LJ(e);
                                                    return linkedHashMap;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        c0yacLIZ.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = null;
                                }
                            }
                        }
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                c0yacLIZ.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                            }
                        }
                        c0yacLIZ.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberIdMap");
                        return linkedHashMap;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        c0yacLIZ.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberIdMap failed", e);
                        c0yacLIZ.LIZJ.LJFF().getEventTracker().LJ(e);
                        return linkedHashMap;
                    }
                }

                @Override // X.C0Y1X
                public final boolean LJIILIIL(String str) {
                    if (str.length() == 0) {
                        return false;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ?");
                    return this.LIZLLL.getProxy().LIZIZ("participant", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
                }

                @Override // X.C0Y1X
                public final long LJJZZIII(String str) throws Throwable {
                    boolean z;
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j = 0;
                    if (z) {
                        return 0L;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n            SELECT ");
                    C0YAD c0yad = C0YAD.COLUMN_SORT_ORDER;
                    sbLIZ.append(c0yad.key);
                    sbLIZ.append(" FROM participant\n            WHERE ");
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ?\n            ORDER BY ");
                    sbLIZ.append(c0yad.key);
                    sbLIZ.append(" DESC LIMIT 1\n        ");
                    try {
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "getLargestOrder", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                                    j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key));
                                }
                                try {
                                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    return j;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    return j;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        while (true) {
                                            try {
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    try {
                                                        break;
                                                    } catch (Throwable th4) {
                                                        TryCatchGuardChecker.doCheck(th4);
                                                        if (th != null) {
                                                            C13SZ.LIZ(th, th4);
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                TryCatchGuardChecker.doCheck(e);
                                                this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getLargestOrder failed", e);
                                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                return j;
                                            }
                                        }
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = null;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    return j;
                }

                public static void LIZ(InterfaceC869960YAw interfaceC869960YAw, List list) {
                    int i = 0;
                    for (Object obj : (ArrayList) list) {
                        int i2 = i + 1;
                        Class<?> cls = null;
                        if (i >= 0) {
                            if (obj instanceof Double) {
                                interfaceC869960YAw.LJJI(((Number) obj).doubleValue(), i2);
                            } else if (obj instanceof Long) {
                                interfaceC869960YAw.LJIJ(i2, ((Number) obj).longValue());
                            } else if (obj instanceof Integer) {
                                interfaceC869960YAw.LJIJ(i2, ((Number) obj).intValue());
                            } else if (obj instanceof String) {
                                interfaceC869960YAw.LJIILIIL(i2, (String) obj);
                            } else if (obj instanceof byte[]) {
                                interfaceC869960YAw.LJJIIJZLJL(i2, (byte[]) obj);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Cannot bind argument of type ");
                                if (obj != null) {
                                    cls = obj.getClass();
                                }
                                sbLIZ.append(cls);
                                sbLIZ.append(" to statement");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }

                @Override // X.C0Y1X
                public final C0YAE LJIIJ(String str, String str2) throws Throwable {
                    boolean z;
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C0YAE c0yaeLIZIZ = null;
                    Throwable th = null;
                    c0yaeLIZIZ = null;
                    c0yaeLIZIZ = null;
                    c0yaeLIZIZ = null;
                    c0yaeLIZIZ = null;
                    if (!z && str2.length() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("\n            SELECT * FROM participant\n            WHERE ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append(" = ?\n            AND ");
                        sbLIZ.append(C0YAD.COLUMN_USER_ID.key);
                        sbLIZ.append(" = ?\n        ");
                        try {
                            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "queryMember", new String[]{str, str2});
                            if (interfaceC869470Y8zLJIIJJI != null) {
                                try {
                                    if (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                        c0yaeLIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                                    }
                                    try {
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th3);
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th3;
                                            while (true) {
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    try {
                                                        try {
                                                            break;
                                                        } catch (Throwable th5) {
                                                            TryCatchGuardChecker.doCheck(th5);
                                                            if (th != null) {
                                                                C13SZ.LIZ(th, th5);
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        c0yaeLIZIZ = null;
                                                        TryCatchGuardChecker.doCheck(e);
                                                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "queryMember failed", e);
                                                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                        return c0yaeLIZIZ;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                }
                                            }
                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                }
                            }
                            this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "queryMember");
                            return c0yaeLIZIZ;
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "queryMember failed", e);
                            this.LIZJ.LJFF().getEventTracker().LJ(e);
                            return c0yaeLIZIZ;
                        }
                    }
                    return c0yaeLIZIZ;
                }

                @Override // X.C0Y1X
                public final int LJIIJJI(String str, List<Long> list) {
                    int iLJIILL = 0;
                    if (str != null && str.length() != 0 && list != null && !list.isEmpty()) {
                        try {
                            iLJIILL = LJIILL(str, list);
                            return iLJIILL;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "removeMemberNoTrans failed", e);
                            this.LIZJ.LJFF().getEventTracker().LJ(e);
                        }
                    }
                    return iLJIILL;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
                @Override // X.C0Y1X
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int LJIIL(java.lang.String r9, java.util.List<java.lang.Long> r10) {
                    /*
                        r8 = this;
                        r1 = 1
                        r7 = 0
                        if (r9 == 0) goto L78
                        int r0 = r9.length()
                        if (r0 == 0) goto L78
                        r0 = r10
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        boolean r0 = r0.isEmpty()
                        if (r0 != 0) goto L78
                        X.0Y5R r0 = r8.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        boolean r0 = r0.LJIIIZ()
                        r0 = r0 ^ 1
                        java.lang.String r6 = "IMConversationMemberDao.removeMember"
                        if (r0 == 0) goto L3a
                        X.0Y5R r0 = r8.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        r0.LJIILIIL(r6)
                        X.0Y5R r0 = r8.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        boolean r0 = r0.LJIIIZ()
                        if (r0 == 0) goto L3a
                        r5 = 1
                        goto L3b
                    L3a:
                        r5 = 0
                    L3b:
                        int r4 = r8.LJIILL(r9, r10)     // Catch: java.lang.Exception -> L4b
                        if (r5 == 0) goto L77
                        X.0Y5R r0 = r8.LIZLLL     // Catch: java.lang.Exception -> L4e
                        X.0YCr r0 = r0.getProxy()     // Catch: java.lang.Exception -> L4e
                        r0.LIZJ(r6, r1)     // Catch: java.lang.Exception -> L4e
                        return r4
                    L4b:
                        r3 = move-exception
                        r4 = 0
                        goto L4f
                    L4e:
                        r3 = move-exception
                    L4f:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
                        X.0YEM r0 = r8.LIZIZ
                        X.0Y6i r2 = r0.LIZLLL()
                        java.lang.String r1 = "IMConversationMemberDao "
                        java.lang.String r0 = "removeMember failed"
                        r2.LJIIIIZZ(r1, r0, r3)
                        if (r5 == 0) goto L6a
                        X.0Y5R r0 = r8.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        r0.LIZJ(r6, r7)
                    L6a:
                        X.0XwD r0 = r8.LIZJ
                        X.0Y8y r0 = r0.LJFF()
                        X.0YLL r0 = r0.getEventTracker()
                        r0.LJ(r3)
                    L77:
                        return r4
                    L78:
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0YAC.LJIIL(java.lang.String, java.util.List):int");
                }

                public final int LJIILL(String str, List<Long> list) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append(" = ? AND ");
                    sbLIZ.append(C0YAD.COLUMN_USER_ID.key);
                    sbLIZ.append(" IN (");
                    sbLIZ.append(strLJJLIIIJ);
                    sbLIZ.append(')');
                    if (!this.LIZLLL.getProxy().LIZIZ("participant", C2188811AlT.LIZIZ(sbLIZ), new String[]{str})) {
                        return 0;
                    }
                    return list.size();
                }

                @Override // X.C0Y1X
                public final List<C0YAE> LJJZ(String str, List<Long> list) throws Throwable {
                    List listLJJJJLI;
                    boolean z;
                    boolean z2;
                    Throwable th = null;
                    if (list != null) {
                        listLJJJJLI = C13LP.LJJJJLI(list);
                    } else {
                        listLJJJJLI = null;
                    }
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (listLJJJJLI != null && !listLJJJJLI.isEmpty()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            ArrayList arrayList = new ArrayList();
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(listLJJJJLI, ",", null, null, 0, null, null, 62);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("\n            SELECT * FROM participant\n            WHERE ");
                            sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                            sbLIZ.append(" = ?\n            AND ");
                            sbLIZ.append(C0YAD.COLUMN_USER_ID.key);
                            sbLIZ.append(" IN (");
                            sbLIZ.append(strLJJLIIIJ);
                            sbLIZ.append(")\n            ORDER BY ");
                            sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                            sbLIZ.append("\n        ");
                            try {
                                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "getMemberList_byIds", new String[]{str});
                                if (interfaceC869470Y8zLJIIJJI != null) {
                                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                        try {
                                            arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                                        } catch (Throwable th2) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th2);
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = th2;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                TryCatchGuardChecker.doCheck(th);
                                                                try {
                                                                    break;
                                                                } catch (Throwable th4) {
                                                                    TryCatchGuardChecker.doCheck(th4);
                                                                    if (th != null) {
                                                                        C13SZ.LIZ(th, th4);
                                                                    }
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            TryCatchGuardChecker.doCheck(e);
                                                            this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberList by ids failed", e);
                                                            this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                            return arrayList;
                                                        }
                                                    }
                                                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        }
                                    }
                                }
                                if (interfaceC869470Y8zLJIIJJI != null) {
                                    try {
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        return arrayList;
                                    } catch (Throwable th7) {
                                        TryCatchGuardChecker.doCheck(th7);
                                        return arrayList;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getMemberList by ids failed", e);
                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                                return arrayList;
                            }
                            return arrayList;
                        }
                    }
                    return C13BV.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
                @Override // X.C0Y1X
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZJ(int r8, java.lang.String r9, java.util.List r10) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        if (r10 == 0) goto L3d
                        java.util.List r2 = X.C13LP.LJJJJLI(r10)
                    L6:
                        int r0 = r9.length()
                        r1 = 1
                        r6 = 0
                        if (r0 == 0) goto L86
                        if (r2 == 0) goto L86
                        boolean r0 = r2.isEmpty()
                        if (r0 != 0) goto L86
                        X.0Y5R r0 = r7.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        boolean r0 = r0.LJIIIZ()
                        r0 = r0 ^ 1
                        java.lang.String r5 = "IMConversationMemberDao.insertOrUpdateMember"
                        if (r0 == 0) goto L3f
                        X.0Y5R r0 = r7.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        r0.LJIILIIL(r5)
                        X.0Y5R r0 = r7.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        boolean r0 = r0.LJIIIZ()
                        if (r0 == 0) goto L3f
                        r4 = 1
                        goto L40
                    L3d:
                        r2 = 0
                        goto L6
                    L3f:
                        r4 = 0
                    L40:
                        r7.LJIILJJIL(r8, r9, r2)     // Catch: java.lang.Exception -> L4f
                        if (r4 == 0) goto L7a
                        X.0Y5R r0 = r7.LIZLLL     // Catch: java.lang.Exception -> L4f
                        X.0YCr r0 = r0.getProxy()     // Catch: java.lang.Exception -> L4f
                        r0.LIZJ(r5, r1)     // Catch: java.lang.Exception -> L4f
                        goto L7a
                    L4f:
                        r3 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
                        X.0YEM r0 = r7.LIZIZ
                        X.0Y6i r2 = r0.LIZLLL()
                        java.lang.String r1 = "IMConversationMemberDao "
                        java.lang.String r0 = "insertOrUpdateMember failed"
                        r2.LJIIIIZZ(r1, r0, r3)
                        if (r4 == 0) goto L6b
                        X.0Y5R r0 = r7.LIZLLL
                        X.0YCr r0 = r0.getProxy()
                        r0.LIZJ(r5, r6)
                    L6b:
                        X.0XwD r0 = r7.LIZJ
                        X.0Y8y r0 = r0.LJFF()
                        X.0YLL r0 = r0.getEventTracker()
                        r0.LJ(r3)
                        r1 = 0
                        return r1
                    L7a:
                        X.0XwD r0 = r7.LIZJ
                        X.0Y52 r0 = r0.getDomain()
                        X.0Y4c r0 = r0.LIZ
                        r0.LJJ(r2)
                        return r1
                    L86:
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0YAC.LIZJ(int, java.lang.String, java.util.List):boolean");
                }

                @Override // X.C0Y1X
                public final boolean LJII(int i, String str, List list) throws Throwable {
                    List<C0YAE> listLJJJJLI;
                    if (list != null) {
                        listLJJJJLI = C13LP.LJJJJLI(list);
                    } else {
                        listLJJJJLI = null;
                    }
                    if (str.length() == 0 || listLJJJJLI == null || listLJJJJLI.isEmpty()) {
                        return false;
                    }
                    try {
                        LJIILJJIL(i, str, listLJJJJLI);
                        this.LIZJ.getDomain().LIZ.LJJ(listLJJJJLI);
                        return true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "insertOrUpdateMemberNoTrans failed", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        return false;
                    }
                }

                /* JADX WARN: Finally extract failed */
                public final void LJIILJJIL(int i, String str, List list) throws Throwable {
                    Set set;
                    char c;
                    char c2;
                    char c3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(((C0YAE) it2.next()).getUid()));
                    }
                    if (arrayList.isEmpty()) {
                        set = C08CX.INSTANCE;
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("\n            SELECT ");
                        C0YAD c0yad = C0YAD.COLUMN_USER_ID;
                        sbLIZ.append(c0yad.key);
                        sbLIZ.append(" FROM participant\n            WHERE ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append(" = ?\n            AND ");
                        sbLIZ.append(c0yad.key);
                        sbLIZ.append(" IN (");
                        sbLIZ.append(strLJJLIIIJ);
                        sbLIZ.append(")\n        ");
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "queryExistingUids", new String[]{str});
                        set = linkedHashSet;
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key);
                                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                    linkedHashSet.add(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex)));
                                }
                                try {
                                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    set = linkedHashSet;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    set = linkedHashSet;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                            throw th;
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                            if (th != null) {
                                                C13SZ.LIZ(th, th4);
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (set.contains(Long.valueOf(((C0YAE) obj).getUid()))) {
                            arrayList2.add(obj);
                        } else {
                            arrayList3.add(obj);
                        }
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    List<C0YAE> list2 = (List) pair.getFirst();
                    List<C0YAE> list3 = (List) pair.getSecond();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((C0YAE) it3.next()).setConversationType(i);
                    }
                    if (!list2.isEmpty()) {
                        C0YAD[] c0yadArr = {C0YAD.COLUMN_SORT_ORDER, C0YAD.COLUMN_ROLE, C0YAD.COLUMN_ALIAS, C0YAD.COLUMN_SEC_UID, C0YAD.COLUMN_SILENT, C0YAD.COLUMN_SILENT_TIME};
                        StringBuilder sb = new StringBuilder("UPDATE participant SET ");
                        ArrayList arrayList4 = new ArrayList();
                        int i2 = 0;
                        int i3 = 0;
                        do {
                            C0YAD c0yad2 = c0yadArr[i2];
                            int i4 = i3 + 1;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c0yad2.key);
                            sbLIZ2.append(" = CASE ");
                            sbLIZ2.append(C0YAD.COLUMN_USER_ID.key);
                            sbLIZ2.append(' ');
                            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                            for (C0YAE c0yae : list2) {
                                sb.append("WHEN ? THEN ? ");
                                arrayList4.add(Long.valueOf(c0yae.getUid()));
                                switch (C0YAM.LIZ[c0yad2.ordinal()]) {
                                    case 1:
                                        arrayList4.add(Long.valueOf(c0yae.getSortOrder()));
                                        break;
                                    case 2:
                                        arrayList4.add(Long.valueOf(c0yae.getRole()));
                                        break;
                                    case 3:
                                        String alias = c0yae.getAlias();
                                        if (alias == null) {
                                            alias = "";
                                        }
                                        arrayList4.add(alias);
                                        break;
                                    case 4:
                                        String secUid = c0yae.getSecUid();
                                        if (secUid == null) {
                                            secUid = "";
                                        }
                                        arrayList4.add(secUid);
                                        break;
                                    case 5:
                                        arrayList4.add(Long.valueOf(c0yae.getSilent()));
                                        break;
                                    case 6:
                                        arrayList4.add(Long.valueOf(c0yae.getSilentTime()));
                                        break;
                                }
                            }
                            sb.append("END");
                            if (i3 < 5) {
                                sb.append(", ");
                            }
                            i2++;
                            i3 = i4;
                        } while (i2 < 6);
                        c = 5;
                        c2 = 6;
                        c3 = ')';
                        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS248S0000000_14.get$arr$(386), 30);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(" WHERE ");
                        sbLIZ3.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ3.append(" = ?");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(" AND ");
                        sbLIZ4.append(C0YAD.COLUMN_USER_ID.key);
                        sbLIZ4.append(" IN (");
                        sbLIZ4.append(strLJJLIIIJ2);
                        sbLIZ4.append(')');
                        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                        arrayList4.add(str);
                        InterfaceC869960YAw interfaceC869960YAwLIZ = this.LIZLLL.getProxy().LIZ(sb.toString());
                        if (interfaceC869960YAwLIZ != null) {
                            try {
                                LIZ(interfaceC869960YAwLIZ, arrayList4);
                                interfaceC869960YAwLIZ.LJIIL();
                                try {
                                    interfaceC869960YAwLIZ.close();
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                try {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            interfaceC869960YAwLIZ.close();
                                            throw th;
                                        } catch (Throwable th9) {
                                            TryCatchGuardChecker.doCheck(th9);
                                            if (th != null) {
                                                C13SZ.LIZ(th, th9);
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            }
                        }
                    } else {
                        c = 5;
                        c2 = 6;
                        c3 = ')';
                    }
                    if (!list3.isEmpty()) {
                        C0YAD[] c0yadArr2 = new C0YAD[8];
                        c0yadArr2[0] = C0YAD.COLUMN_USER_ID;
                        c0yadArr2[1] = C0YAD.COLUMN_SORT_ORDER;
                        c0yadArr2[2] = C0YAD.COLUMN_ROLE;
                        c0yadArr2[3] = C0YAD.COLUMN_CONVERSATION_ID;
                        c0yadArr2[4] = C0YAD.COLUMN_ALIAS;
                        c0yadArr2[c] = C0YAD.COLUMN_SEC_UID;
                        c0yadArr2[c2] = C0YAD.COLUMN_SILENT;
                        c0yadArr2[7] = C0YAD.COLUMN_SILENT_TIME;
                        String strLJJJ = C13LQ.LJJJ(c0yadArr2, null, null, null, AFwS248S0000000_14.get$arr$(384), 31);
                        String strLJJJ2 = C13LQ.LJJJ(c0yadArr2, null, null, null, AFwS248S0000000_14.get$arr$(385), 31);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("INSERT INTO participant (");
                        sbLIZ5.append(strLJJJ);
                        sbLIZ5.append(") VALUES (");
                        sbLIZ5.append(strLJJJ2);
                        sbLIZ5.append(c3);
                        InterfaceC869960YAw interfaceC869960YAwLIZ2 = this.LIZLLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                        if (interfaceC869960YAwLIZ2 != null) {
                            try {
                                for (C0YAE c0yae2 : list3) {
                                    interfaceC869960YAwLIZ2.LJJIIZ();
                                    interfaceC869960YAwLIZ2.LJIJ(C0YAD.COLUMN_USER_ID.ordinal() + 1, c0yae2.getUid());
                                    int iOrdinal = C0YAD.COLUMN_ALIAS.ordinal() + 1;
                                    String alias2 = c0yae2.getAlias();
                                    if (alias2 == null) {
                                        alias2 = "";
                                    }
                                    interfaceC869960YAwLIZ2.LJIILIIL(iOrdinal, alias2);
                                    int iOrdinal2 = C0YAD.COLUMN_CONVERSATION_ID.ordinal() + 1;
                                    String conversationId = c0yae2.getConversationId();
                                    if (conversationId == null) {
                                        conversationId = "";
                                    }
                                    interfaceC869960YAwLIZ2.LJIILIIL(iOrdinal2, conversationId);
                                    interfaceC869960YAwLIZ2.LJIJ(C0YAD.COLUMN_ROLE.ordinal() + 1, c0yae2.getRole());
                                    interfaceC869960YAwLIZ2.LJIJ(C0YAD.COLUMN_SORT_ORDER.ordinal() + 1, c0yae2.getSortOrder());
                                    int iOrdinal3 = C0YAD.COLUMN_SEC_UID.ordinal() + 1;
                                    String secUid2 = c0yae2.getSecUid();
                                    if (secUid2 == null) {
                                        secUid2 = "";
                                    }
                                    interfaceC869960YAwLIZ2.LJIILIIL(iOrdinal3, secUid2);
                                    interfaceC869960YAwLIZ2.LJIJ(C0YAD.COLUMN_SILENT.ordinal() + 1, c0yae2.getSilent());
                                    interfaceC869960YAwLIZ2.LJIJ(C0YAD.COLUMN_SILENT_TIME.ordinal() + 1, c0yae2.getSilentTime());
                                    interfaceC869960YAwLIZ2.LJIL();
                                }
                                try {
                                    interfaceC869960YAwLIZ2.close();
                                } catch (Throwable th11) {
                                    TryCatchGuardChecker.doCheck(th11);
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                try {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            interfaceC869960YAwLIZ2.close();
                                            throw th;
                                        } catch (Throwable th14) {
                                            TryCatchGuardChecker.doCheck(th14);
                                            if (th != null) {
                                                C13SZ.LIZ(th, th14);
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                }
                            }
                        }
                    }
                    this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "insertOrUpdateMemberInternal");
                }
            };
        }
        final C0YEM c0yem2 = this.LL.LIZ;
        return new C0Y1X(c0yem2) { // from class: X.0YAB
            public final C0YEM LIZIZ;
            public final InterfaceC864790XwD LIZJ;
            public final C0Y5R LIZLLL;

            @Override // X.C0Y1X
            public final List<C0YAE> LIZLLL() {
                ArrayList arrayList = new ArrayList();
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI("select * from participant", "getAllMemberList", new String[0]);
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                            }
                            this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getAllMemberList");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMConversationMemberDao ", "getAllMemberList", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            {
                this.LIZIZ = c0yem2;
                this.LIZJ = c0yem2.LJIIZILJ();
                this.LIZLLL = c0yem2.LJIIZILJ().LIZIZ();
            }

            public static ContentValues LIZ(C0YAE c0yae) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0YAD.COLUMN_USER_ID.key, Long.valueOf(c0yae.getUid()));
                contentValues.put(C0YAD.COLUMN_ALIAS.key, c0yae.getAlias());
                contentValues.put(C0YAD.COLUMN_CONVERSATION_ID.key, c0yae.getConversationId());
                contentValues.put(C0YAD.COLUMN_ROLE.key, Integer.valueOf(c0yae.getRole()));
                contentValues.put(C0YAD.COLUMN_SORT_ORDER.key, Long.valueOf(c0yae.getSortOrder()));
                contentValues.put(C0YAD.COLUMN_SEC_UID.key, c0yae.getSecUid());
                contentValues.put(C0YAD.COLUMN_SILENT.key, Integer.valueOf(c0yae.getSilent()));
                contentValues.put(C0YAD.COLUMN_SILENT_TIME.key, Long.valueOf(c0yae.getSilentTime()));
                return contentValues;
            }

            public static C0YAE LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
                C0YAE c0yae = new C0YAE();
                c0yae.setAlias(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ALIAS.key)));
                c0yae.setConversationId(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_CONVERSATION_ID.key)));
                c0yae.setRole(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ROLE.key)));
                c0yae.setSortOrder(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SORT_ORDER.key)));
                c0yae.setUid(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_USER_ID.key)));
                c0yae.setSecUid(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SEC_UID.key)));
                c0yae.setSilent(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT.key)));
                c0yae.setSilentTime(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT_TIME.key)));
                return c0yae;
            }

            @Override // X.C0Y1X
            public final Map<String, List<C0YAE>> LJ(List<String> list) {
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.size() <= 0) {
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = new HashMap();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from participant where ");
                sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append(" in (");
                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i == arrayList.size() - 1) {
                        sb.append("'");
                        sb.append((String) ListProtector.get(list, i));
                        sb.append("') order by ");
                        sb.append(C0YAD.COLUMN_SORT_ORDER.key);
                        try {
                            try {
                                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(sb.toString(), "getMembersMap", null);
                                LJIILJJIL(interfaceC869470Y8zLJIIJJI, map);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getMembersMap", e);
                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                            }
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            throw th;
                        }
                    } else {
                        sb.append("'");
                        sb.append((String) ListProtector.get(list, i));
                        sb.append("',");
                    }
                }
                this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMembersMap");
                return map;
            }

            @Override // X.C0Y1X
            public final List<C0YAE> LJFF(String str) {
                if (TextUtils.isEmpty(str)) {
                    return Collections.emptyList();
                }
                this.LIZIZ.LIZLLL().LJFF("IMConversationMemberDao getGroupManagerList");
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select * from participant where ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append("=? and ");
                        sbLIZ.append(C0YAD.COLUMN_ROLE.key);
                        sbLIZ.append(" in (");
                        sbLIZ.append(C0Z9N.OWNER.getValue());
                        sbLIZ.append(",");
                        sbLIZ.append(C0Z9N.ADMIN.getValue());
                        sbLIZ.append(") order by ");
                        sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                        interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getGroupManagerList", new String[]{str});
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getGroupManagerList");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getGroupManagerList", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            @Override // X.C0Y1X
            public final List<Long> LJI(String str) {
                if (TextUtils.isEmpty(str)) {
                    return new ArrayList();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select * from participant where ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append("=? order by ");
                        sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                        interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMemberId", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            ArrayList arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                            int columnIndex = -1;
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                if (columnIndex < 0) {
                                    columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAD.COLUMN_USER_ID.key);
                                }
                                arrayList.add(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex)));
                            }
                            this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberId");
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return arrayList;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getMemberId", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return new ArrayList();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            @Override // X.C0Y1X
            public final List<C0YAE> LJIIIIZZ(String str) {
                if (TextUtils.isEmpty(str)) {
                    return Collections.emptyList();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select * from participant where ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append("=? order by ");
                        sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                        interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMemberList", new String[]{str});
                        while (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberList");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getMemberList", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            @Override // X.C0Y1X
            public final Map<String, List<Long>> LJIIIZ(List<String> list) {
                HashMap map = new HashMap();
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.size() <= 0) {
                    return map;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from participant where ");
                sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append(" in (");
                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i == arrayList.size() - 1) {
                        sb.append("'");
                        sb.append((String) ListProtector.get(list, i));
                        sb.append("') order by ");
                        sb.append(C0YAD.COLUMN_SORT_ORDER.key);
                        try {
                            try {
                                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(sb.toString(), "getMemberIdMap", null);
                                if (interfaceC869470Y8zLJIIJJI != null) {
                                    int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAD.COLUMN_CONVERSATION_ID.key);
                                    int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAD.COLUMN_USER_ID.key);
                                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                        String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                                        List arrayList2 = (List) map.get(string);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            map.put(string, arrayList2);
                                        }
                                        arrayList2.add(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex2)));
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getMemberIdMap", e);
                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                            }
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            throw th;
                        }
                    } else {
                        sb.append("'");
                        sb.append((String) ListProtector.get(list, i));
                        sb.append("',");
                    }
                }
                this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMemberIdMap");
                return map;
            }

            @Override // X.C0Y1X
            public final boolean LJIILIIL(String str) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMConversationMemberDao deleteConversation, cid:");
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                sbLIZ2.append("=?");
                return proxy.LIZIZ("participant", C2188811AlT.LIZIZ(sbLIZ2), new String[]{str});
            }

            @Override // X.C0Y1X
            public final long LJJZZIII(String str) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMConversationMemberDao getLargestOrder, cid:");
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select * from participant where ");
                sbLIZ2.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                sbLIZ2.append("=? order by ");
                C0YAD c0yad = C0YAD.COLUMN_SORT_ORDER;
                sbLIZ2.append(c0yad.key);
                sbLIZ2.append(" desc limit 1");
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "getLargestOrder", new String[]{str});
                        if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            long j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(c0yad.key));
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return j;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getLargestOrder", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return 0L;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            public static final void LJIILJJIL(InterfaceC869470Y8z interfaceC869470Y8z, Map<String, List<C0YAE>> map) {
                if (interfaceC869470Y8z == null) {
                    return;
                }
                int columnIndex = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ALIAS.key);
                int columnIndex2 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_CONVERSATION_ID.key);
                int columnIndex3 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_ROLE.key);
                int columnIndex4 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SORT_ORDER.key);
                int columnIndex5 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_USER_ID.key);
                int columnIndex6 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SEC_UID.key);
                int columnIndex7 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT.key);
                int columnIndex8 = interfaceC869470Y8z.getColumnIndex(C0YAD.COLUMN_SILENT_TIME.key);
                while (interfaceC869470Y8z.moveToNext()) {
                    C0YAE c0yae = new C0YAE();
                    String string = interfaceC869470Y8z.getString(columnIndex2);
                    c0yae.setAlias(interfaceC869470Y8z.getString(columnIndex));
                    c0yae.setConversationId(string);
                    c0yae.setRole(interfaceC869470Y8z.getInt(columnIndex3));
                    c0yae.setSortOrder(interfaceC869470Y8z.getInt(columnIndex4));
                    c0yae.setUid(interfaceC869470Y8z.getLong(columnIndex5));
                    c0yae.setSecUid(interfaceC869470Y8z.getString(columnIndex6));
                    c0yae.setSilent(interfaceC869470Y8z.getInt(columnIndex7));
                    c0yae.setSilentTime(interfaceC869470Y8z.getLong(columnIndex8));
                    HashMap map2 = (HashMap) map;
                    List arrayList = (List) map2.get(string);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map2.put(string, arrayList);
                    }
                    arrayList.add(c0yae);
                }
            }

            @Override // X.C0Y1X
            public final C0YAE LJIIJ(String str, String str2) throws Throwable {
                C0YAE c0yae;
                InterfaceC869470Y8z interfaceC869470Y8z = null;
                c0yaeLIZIZ = null;
                C0YAE c0yaeLIZIZ = null;
                interfaceC869470Y8z = null;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return null;
                }
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMConversationMemberDao queryMember, cid:");
                sbLIZ.append(str);
                sbLIZ.append(", uid:");
                sbLIZ.append(str2);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("select * from participant where ");
                        sbLIZ2.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ2.append("=?  and ");
                        sbLIZ2.append(C0YAD.COLUMN_USER_ID.key);
                        sbLIZ2.append("=?");
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "queryMember", new String[]{str, str2});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                try {
                                    c0yaeLIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                                } catch (Exception e) {
                                    e = e;
                                    c0yae = c0yaeLIZIZ;
                                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                                    TryCatchGuardChecker.doCheck(e);
                                    this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao queryMember", e);
                                    this.LIZJ.LJFF().getEventTracker().LJ(e);
                                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                                    return c0yae;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                        }
                        this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "queryMember");
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return c0yaeLIZIZ;
                    } catch (Exception e2) {
                        e = e2;
                        c0yae = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            @Override // X.C0Y1X
            public final int LJIIJJI(String str, List<Long> list) {
                if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
                    return 0;
                }
                int i = 0;
                for (Long l : list) {
                    C870430YCr proxy = this.LIZLLL.getProxy();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                    sbLIZ.append("=? AND ");
                    sbLIZ.append(C0YAD.COLUMN_USER_ID.key);
                    sbLIZ.append("=?");
                    if (proxy.LIZIZ("participant", C2188811AlT.LIZIZ(sbLIZ), new String[]{str, String.valueOf(l)})) {
                        i++;
                    }
                }
                return i;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
            @Override // X.C0Y1X
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJIIL(java.lang.String r13, java.util.List<java.lang.Long> r14) {
                /*
                    r12 = this;
                    boolean r0 = android.text.TextUtils.isEmpty(r13)
                    r4 = 0
                    if (r0 != 0) goto Laf
                    java.util.ArrayList r14 = (java.util.ArrayList) r14
                    boolean r0 = r14.isEmpty()
                    if (r0 != 0) goto Laf
                    X.0Y5R r0 = r12.LIZLLL
                    X.0YCr r0 = r0.getProxy()
                    boolean r0 = r0.LJIIIZ()
                    r5 = 1
                    r0 = r0 ^ 1
                    java.lang.String r3 = "IMConversationMemberDao.removeMember(String,List)"
                    if (r0 == 0) goto L37
                    X.0Y5R r0 = r12.LIZLLL
                    X.0YCr r0 = r0.getProxy()
                    r0.LJIILIIL(r3)
                    X.0Y5R r0 = r12.LIZLLL
                    X.0YCr r0 = r0.getProxy()
                    boolean r0 = r0.LJIIIZ()
                    if (r0 == 0) goto L37
                    r11 = 1
                    goto L38
                L37:
                    r11 = 0
                L38:
                    java.util.Iterator r10 = r14.iterator()     // Catch: java.lang.Exception -> L91
                    r9 = 0
                L3d:
                    boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> L94
                    if (r0 == 0) goto L85
                    java.lang.Object r8 = r10.next()     // Catch: java.lang.Exception -> L94
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Exception -> L94
                    X.0Y5R r0 = r12.LIZLLL     // Catch: java.lang.Exception -> L94
                    X.0YCr r7 = r0.getProxy()     // Catch: java.lang.Exception -> L94
                    java.lang.String r6 = "participant"
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L94
                    X.0YAD r0 = X.C0YAD.COLUMN_CONVERSATION_ID     // Catch: java.lang.Exception -> L94
                    java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> L94
                    r1.append(r0)     // Catch: java.lang.Exception -> L94
                    java.lang.String r0 = "=? AND "
                    r1.append(r0)     // Catch: java.lang.Exception -> L94
                    X.0YAD r0 = X.C0YAD.COLUMN_USER_ID     // Catch: java.lang.Exception -> L94
                    java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> L94
                    r1.append(r0)     // Catch: java.lang.Exception -> L94
                    java.lang.String r0 = "=?"
                    r1.append(r0)     // Catch: java.lang.Exception -> L94
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L94
                    r0 = 2
                    java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L94
                    r1[r4] = r13     // Catch: java.lang.Exception -> L94
                    java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L94
                    r1[r5] = r0     // Catch: java.lang.Exception -> L94
                    boolean r0 = r7.LIZIZ(r6, r2, r1)     // Catch: java.lang.Exception -> L94
                    if (r0 == 0) goto L3d
                    int r9 = r9 + 1
                    goto L3d
                L85:
                    if (r11 == 0) goto Lae
                    X.0Y5R r0 = r12.LIZLLL     // Catch: java.lang.Exception -> L94
                    X.0YCr r0 = r0.getProxy()     // Catch: java.lang.Exception -> L94
                    r0.LIZJ(r3, r5)     // Catch: java.lang.Exception -> L94
                    return r9
                L91:
                    r2 = move-exception
                    r9 = 0
                    goto L95
                L94:
                    r2 = move-exception
                L95:
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                    X.0YEM r0 = r12.LIZIZ
                    X.0Y6i r1 = r0.LIZLLL()
                    java.lang.String r0 = "IMConversationMemberDao removeMember"
                    r1.LJIIIZ(r0, r2)
                    if (r11 == 0) goto Lae
                    X.0Y5R r0 = r12.LIZLLL
                    X.0YCr r0 = r0.getProxy()
                    r0.LIZJ(r3, r4)
                Lae:
                    return r9
                Laf:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YAB.LJIIL(java.lang.String, java.util.List):int");
            }

            @Override // X.C0Y1X
            public final List<C0YAE> LJJZ(String str, List<Long> list) {
                if (TextUtils.isEmpty(str)) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select * from participant where ");
                        sbLIZ.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ.append("=? and ");
                        sbLIZ.append(C0YAD.COLUMN_USER_ID.key);
                        sbLIZ.append(" in (");
                        sbLIZ.append(C870740YDw.LJIIIIZZ(",", list));
                        sbLIZ.append(") order by ");
                        sbLIZ.append(C0YAD.COLUMN_SORT_ORDER.key);
                        interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMemberList", new String[]{str});
                        while (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                        }
                        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("IMConversationMemberDao getMemberList by ids, result:");
                        sbLIZ2.append(arrayList.size());
                        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationMemberDao getMemberList", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            @Override // X.C0Y1X
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZJ(int r20, java.lang.String r21, java.util.List r22) {
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YAB.LIZJ(int, java.lang.String, java.util.List):boolean");
            }

            @Override // X.C0Y1X
            public final boolean LJII(int i, String str, List list) {
                if (TextUtils.isEmpty(str) || list == null) {
                    return false;
                }
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMConversationMemberDao insertOrUpdateMemberNoTrans, cid:");
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                for (C0YAE c0yae : (ArrayList) list) {
                    if (c0yae != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(C0YAD.COLUMN_SORT_ORDER.key, Long.valueOf(c0yae.getSortOrder()));
                        contentValues.put(C0YAD.COLUMN_ROLE.key, Integer.valueOf(c0yae.getRole()));
                        contentValues.put(C0YAD.COLUMN_ALIAS.key, c0yae.getAlias());
                        contentValues.put(C0YAD.COLUMN_SEC_UID.key, c0yae.getSecUid());
                        contentValues.put(C0YAD.COLUMN_SILENT.key, Integer.valueOf(c0yae.getSilent()));
                        contentValues.put(C0YAD.COLUMN_SILENT_TIME.key, Long.valueOf(c0yae.getSilentTime()));
                        C870430YCr proxy = this.LIZLLL.getProxy();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(C0YAD.COLUMN_USER_ID.key);
                        sbLIZ2.append("=? AND ");
                        sbLIZ2.append(C0YAD.COLUMN_CONVERSATION_ID.key);
                        sbLIZ2.append("=?");
                        if (proxy.LJIILJJIL("participant", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{String.valueOf(c0yae.getUid()), str}) <= 0) {
                            c0yae.setConversationType(i);
                            arrayList.add(c0yae);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.LIZLLL.getProxy().LJI("participant", LIZ((C0YAE) it2.next()));
                }
                this.LIZJ.LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "insertOrUpdateMemberNoTrans");
                this.LIZJ.getDomain().LIZ.LJJ(list);
                return true;
            }
        };
    }
}
