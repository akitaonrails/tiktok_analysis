package X;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191841AqM {
    public final CopyOnWriteArrayList<C2191701Aq8> LIZ;
    public boolean LIZIZ;
    public Set<String> LIZJ;
    public Set<EnumC2191921AqU> LIZLLL;

    public C2191841AqM(CopyOnWriteArrayList<C2191701Aq8> copyOnWriteArrayList) {
        this.LIZ = copyOnWriteArrayList;
        if (!copyOnWriteArrayList.isEmpty()) {
            this.LIZJ = new LinkedHashSet();
            this.LIZLLL = new LinkedHashSet();
            for (C2191701Aq8 c2191701Aq8 : copyOnWriteArrayList) {
                for (String str : c2191701Aq8.LIZIZ.LJI) {
                    EnumC2191921AqU enumC2191921AqU = EnumC2191921AqU.V3;
                    if (Intrinsics.LJFF(str, enumC2191921AqU.getAlias())) {
                        Set<EnumC2191921AqU> set = this.LIZLLL;
                        if (set != null) {
                            set.add(enumC2191921AqU);
                        }
                        if (!this.LIZIZ) {
                            C1308600k9q c1308600k9q = c2191701Aq8.LIZIZ.LJFF;
                            if (c1308600k9q != null) {
                                Set<String> set2 = c1308600k9q.LIZ;
                                if (set2.contains("*")) {
                                    this.LIZIZ = true;
                                    Set<String> set3 = this.LIZJ;
                                    if (set3 != null) {
                                        set3.clear();
                                    }
                                } else {
                                    for (String str2 : set2) {
                                        Set<String> set4 = this.LIZJ;
                                        if (set4 != null) {
                                            set4.add(str2);
                                        }
                                    }
                                }
                                HashMap<String, List<List<String>>> map = c1308600k9q.LIZIZ;
                                if (map.containsKey("*")) {
                                    this.LIZIZ = true;
                                    Set<String> set5 = this.LIZJ;
                                    if (set5 != null) {
                                        set5.clear();
                                    }
                                } else {
                                    for (Object obj : map.keySet()) {
                                        Set<String> set6 = this.LIZJ;
                                        if (set6 != null) {
                                            set6.add((String) obj);
                                        }
                                    }
                                }
                                HashMap<String, List<HashMap<String, String>>> map2 = c1308600k9q.LIZJ;
                                if (map2.containsKey("*")) {
                                    this.LIZIZ = true;
                                    Set<String> set7 = this.LIZJ;
                                    if (set7 != null) {
                                        set7.clear();
                                    }
                                } else {
                                    for (Object obj2 : map2.keySet()) {
                                        Set<String> set8 = this.LIZJ;
                                        if (set8 != null) {
                                            set8.add((String) obj2);
                                        }
                                    }
                                }
                            } else {
                                this.LIZIZ = true;
                            }
                        }
                    } else {
                        Set<EnumC2191921AqU> set9 = this.LIZLLL;
                        if (set9 != null) {
                            EnumC2191921AqU.Companion.getClass();
                            set9.add(C2191891AqR.LIZIZ(str));
                        }
                    }
                }
            }
        }
    }
}
