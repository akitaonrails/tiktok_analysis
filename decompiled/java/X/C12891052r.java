package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.052r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12891052r {
    public static final /* synthetic */ int LIZ = 0;

    public static C053I LIZ(final AnonymousClass0531 anonymousClass0531) {
        C053I c053i;
        Object obj = ((ConcurrentHashMap) C12895052v.LIZ.getValue()).get(anonymousClass0531);
        if (!(obj instanceof C053I) || (c053i = (C053I) obj) == null) {
            int i = C053Y.LIZ[anonymousClass0531.LIZLLL.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new AbstractC12894052u<List<? extends Long>>() { // from class: X.052s
                            @Override // X.C053I
                            public final /* bridge */ /* synthetic */ boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                                return false;
                            }

                            @Override // X.C053I
                            public final Pair<Boolean, List<Long>> getData(String str) {
                                return new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
                            }
                        };
                    }
                    return new AbstractC12885052l<List<? extends Long>>(anonymousClass0531) { // from class: X.052o
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C053I
                        public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                            return !((List) frequencyMarkRecord).isEmpty();
                        }

                        @Override // X.C053I
                        public final Pair<Boolean, List<Long>> getData(String str) {
                            List list;
                            Object obj2 = LIZ().get(str);
                            if (!C19719512Dh.LJI(obj2) || (list = (List) obj2) == null) {
                                list = C13BV.INSTANCE;
                            }
                            return new Pair<>(Boolean.valueOf(!list.isEmpty()), list);
                        }

                        @Override // X.C053I
                        public final void LJFF(Object obj2, String str) {
                            LIZ().put(str, new ArrayList((Collection) obj2));
                        }
                    };
                }
                return new AbstractC12885052l<List<? extends Long>>(anonymousClass0531) { // from class: X.052o
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C053I
                    public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                        return !((List) frequencyMarkRecord).isEmpty();
                    }

                    @Override // X.C053I
                    public final Pair<Boolean, List<Long>> getData(String str) {
                        List list;
                        Object obj2 = LIZ().get(str);
                        if (!C19719512Dh.LJI(obj2) || (list = (List) obj2) == null) {
                            list = C13BV.INSTANCE;
                        }
                        return new Pair<>(Boolean.valueOf(!list.isEmpty()), list);
                    }

                    @Override // X.C053I
                    public final void LJFF(Object obj2, String str) {
                        LIZ().put(str, new ArrayList((Collection) obj2));
                    }
                };
            }
            return new AbstractC12881052h<List<? extends Long>>(anonymousClass0531) { // from class: X.051d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C053I
                public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                    return !((List) frequencyMarkRecord).isEmpty();
                }

                @Override // X.C053I
                public final Pair<Boolean, List<Long>> getData(String str) {
                    String[] stringArray = LIZ().getStringArray(str, new String[0]);
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : stringArray) {
                        Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                        if (lLJIILIIL != null) {
                            arrayList.add(lLJIILIIL);
                        }
                    }
                    return new Pair<>(Boolean.valueOf(!arrayList.isEmpty()), arrayList);
                }

                @Override // X.C053I
                public final void LJFF(Object obj2, String str) {
                    List list = (List) obj2;
                    Keva kevaLIZ = LIZ();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
                    }
                    kevaLIZ.storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
                }
            };
        }
        return c053i;
    }

    public static C053I LIZIZ(final AnonymousClass0531 anonymousClass0531) {
        C053I c053i;
        Object obj = ((ConcurrentHashMap) C12895052v.LIZ.getValue()).get(anonymousClass0531);
        if (!(obj instanceof C053I) || (c053i = (C053I) obj) == null) {
            int i = C053Y.LIZ[anonymousClass0531.LIZLLL.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new AbstractC12894052u<Long>() { // from class: X.052t
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.C053I
                            public final /* bridge */ /* synthetic */ boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                                ((Number) frequencyMarkRecord).longValue();
                                return false;
                            }

                            @Override // X.C053I
                            public final Pair<Boolean, Long> getData(String str) {
                                return new Pair<>(Boolean.FALSE, -1L);
                            }
                        };
                    }
                    return new AbstractC12885052l<Long>(anonymousClass0531) { // from class: X.052n
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C053I
                        public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                            if (((Number) frequencyMarkRecord).longValue() != -1) {
                                return true;
                            }
                            return false;
                        }

                        @Override // X.C053I
                        public final Pair<Boolean, Long> getData(String str) {
                            Long l;
                            long jLongValue;
                            boolean z;
                            Object obj2 = LIZ().get(str);
                            if (obj2 instanceof Long) {
                                l = (Long) obj2;
                            } else {
                                l = null;
                            }
                            if (l != null) {
                                jLongValue = l.longValue();
                                if (jLongValue != -1) {
                                    z = true;
                                }
                                return new Pair<>(Boolean.valueOf(z), Long.valueOf(jLongValue));
                            }
                            jLongValue = -1;
                            z = false;
                            return new Pair<>(Boolean.valueOf(z), Long.valueOf(jLongValue));
                        }

                        @Override // X.C053I
                        public final void LJFF(Object obj2, String str) {
                            LIZ().put(str, Long.valueOf(((Number) obj2).longValue()));
                        }
                    };
                }
                return new AbstractC12885052l<Long>(anonymousClass0531) { // from class: X.052n
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C053I
                    public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                        if (((Number) frequencyMarkRecord).longValue() != -1) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.C053I
                    public final Pair<Boolean, Long> getData(String str) {
                        Long l;
                        long jLongValue;
                        boolean z;
                        Object obj2 = LIZ().get(str);
                        if (obj2 instanceof Long) {
                            l = (Long) obj2;
                        } else {
                            l = null;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                            if (jLongValue != -1) {
                                z = true;
                            }
                            return new Pair<>(Boolean.valueOf(z), Long.valueOf(jLongValue));
                        }
                        jLongValue = -1;
                        z = false;
                        return new Pair<>(Boolean.valueOf(z), Long.valueOf(jLongValue));
                    }

                    @Override // X.C053I
                    public final void LJFF(Object obj2, String str) {
                        LIZ().put(str, Long.valueOf(((Number) obj2).longValue()));
                    }
                };
            }
            return new AbstractC12881052h<Long>(anonymousClass0531) { // from class: X.051e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C053I
                public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
                    if (((Number) frequencyMarkRecord).longValue() != -1) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C053I
                public final Pair<Boolean, Long> getData(String str) {
                    boolean z;
                    long j = LIZ().getLong(str, -1L);
                    if (j != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new Pair<>(Boolean.valueOf(z), Long.valueOf(j));
                }

                @Override // X.C053I
                public final void LJFF(Object obj2, String str) {
                    LIZ().storeLong(str, ((Number) obj2).longValue());
                }
            };
        }
        return c053i;
    }
}
