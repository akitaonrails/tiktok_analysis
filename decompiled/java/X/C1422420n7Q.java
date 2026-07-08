package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422420n7Q extends AbstractC2255721DQs<InterfaceC1422310n7F> implements InterfaceC1422310n7F, InterfaceC379610EuV {
    public static final C1422470n7V LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final ShortVideoContext LLILLJJLI;
    public final C1422410n7P LLILLL;
    public int LLIZLLLIL;
    public C1422450n7T LLJ;
    public final InterfaceC1422310n7F LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1422440n7S.class, null);
    public final Set<C1422430n7R> LLILZLL = new LinkedHashSet();
    public final Set<C1422430n7R> LLIZ = new LinkedHashSet();
    public Pair<Long, Integer> LLJI = new Pair<>(0L, 0);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0n7V] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1422420n7Q.class, "coreApi", "getCoreApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/search/datasource/TemplateSearchCoreApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0n7V
        };
        LLJILJILJ = 8;
    }

    private final InterfaceC1422440n7S X1() {
        return (InterfaceC1422440n7S) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    public final void T2() {
        this.LLILZLL.clear();
        this.LLIZ.clear();
        this.LLIZLLLIL = 0;
        this.LLJ = null;
        this.LLJI = new Pair<>(0L, 0);
    }

    public InterfaceC1422310n7F W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0n7T, java.lang.Object] */
    @Override // X.InterfaceC1422310n7F
    public void F1(final C1422540n7c c1422540n7c) {
        InterfaceC1422440n7S interfaceC1422440n7SX1 = X1();
        if (interfaceC1422440n7SX1 == null) {
            return;
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "TemplateSearchMonitorComponent", c1422540n7c.toString());
        if (C1422460n7U.LIZ(c1422540n7c.LIZLLL)) {
            int i = c1422540n7c.LJI;
            Pair<String, String> pairXY1 = interfaceC1422440n7SX1.XY1();
            final String first = pairXY1.getFirst();
            final String second = pairXY1.getSecond();
            int i2 = c1422540n7c.LIZ;
            String str = "video_play";
            if (i2 != 0) {
                boolean z = true;
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            o2(this, c1422540n7c, second, interfaceC1422440n7SX1, first, i, false);
                            final C1422410n7P c1422410n7PMC1 = interfaceC1422440n7SX1.MC1();
                            ?? r3 = new Object(c1422410n7PMC1, second, first, c1422540n7c) { // from class: X.0n7T
                                public final C1422410n7P LIZ;
                                public final String LIZIZ;
                                public final String LIZJ;
                                public final C1422540n7c LIZLLL;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C1422450n7T)) {
                                        return false;
                                    }
                                    C1422450n7T c1422450n7T = (C1422450n7T) obj;
                                    return Intrinsics.LJFF(this.LIZ, c1422450n7T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1422450n7T.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1422450n7T.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1422450n7T.LIZLLL);
                                }

                                {
                                    this.LIZ = c1422410n7PMC1;
                                    this.LIZIZ = second;
                                    this.LIZJ = first;
                                    this.LIZLLL = c1422540n7c;
                                }
                            };
                            if (Intrinsics.LJFF(this.LLJ, r3)) {
                                if (c1422540n7c.LJI != 1) {
                                    return;
                                }
                            } else {
                                z = false;
                            }
                            this.LLJ = r3;
                            C1422480n7W c1422480n7W = C1422480n7W.LIZ;
                            C1422410n7P c1422410n7PMC12 = interfaceC1422440n7SX1.MC1();
                            C1419590n2r c1419590n2r = c1422540n7c.LJII;
                            int i3 = c1422540n7c.LIZJ;
                            c1422480n7W.getClass();
                            Map<String, String> map = C1422480n7W.LIZ(second, c1422410n7PMC12, first, c1419590n2r, i, i3).LIZ;
                            if (!z) {
                                str = "video_play_finish";
                            }
                            C20684815ws.LJIILLIIL(str, map);
                            return;
                        }
                        return;
                    }
                    o2(this, c1422540n7c, second, interfaceC1422440n7SX1, first, i, false);
                    return;
                }
                o2(this, c1422540n7c, second, interfaceC1422440n7SX1, first, i, true);
                return;
            }
            o2(this, c1422540n7c, second, interfaceC1422440n7SX1, first, i, true);
            C1422480n7W c1422480n7W2 = C1422480n7W.LIZ;
            C1422410n7P c1422410n7PMC13 = interfaceC1422440n7SX1.MC1();
            C1419590n2r c1419590n2r2 = c1422540n7c.LJII;
            int i4 = c1422540n7c.LIZJ;
            c1422480n7W2.getClass();
            C20684815ws.LJIILLIIL("video_play", C1422480n7W.LIZ(second, c1422410n7PMC13, first, c1419590n2r2, i, i4).LIZ);
        }
    }

    private final void G2(int i, C1422430n7R c1422430n7R) {
        if (i != 1 || C1422460n7U.LIZIZ(c1422430n7R.LIZ)) {
            return;
        }
        Z1(i, c1422430n7R, true);
    }

    public final void H2(List<C1422430n7R> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (C1422430n7R c1422430n7R : list) {
            C1422430n7R c1422430n7R2 = c1422430n7R;
            Set<C1422430n7R> set = this.LLIZ;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((C1422430n7R) it2.next()).LIZ(c1422430n7R2)) {
                        break;
                    }
                }
            }
            arrayList.add(c1422430n7R);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Z1(0, (C1422430n7R) it3.next(), true);
        }
        this.LLIZ.clear();
        C19719612Di.LJJI(list, this.LLIZ);
        this.LLIZLLLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0011, B:9:0x0019, B:10:0x001e, B:11:0x002e, B:12:0x0032, B:13:0x0036, B:15:0x003c), top: B:23:0x0001 }] */
    @Override // X.InterfaceC1422310n7F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void cr2(int r7, X.C1422430n7R r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Set<X.0n7R> r1 = r6.LLILZLL     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L4b
            r2 = r7
            if (r0 == 0) goto L32
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L32
        L11:
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r0 = r8.LIZ     // Catch: java.lang.Throwable -> L4b
            boolean r0 = X.C1422460n7U.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L1e
            java.util.Set<X.0n7R> r0 = r6.LLILZLL     // Catch: java.lang.Throwable -> L4b
            r0.add(r8)     // Catch: java.lang.Throwable -> L4b
        L1e:
            X.0n2q r0 = X.C1419580n2q.LIZ     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L4b
            int r3 = r8.LIZJ     // Catch: java.lang.Throwable -> L4b
            X.0n2r r4 = r8.LIZIZ     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r5 = r8.LIZ     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            X.C1419580n2q.LJIIIIZZ(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4b
        L2e:
            r6.G2(r2, r8)     // Catch: java.lang.Throwable -> L4b
            goto L49
        L32:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
        L36:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4b
            X.0n7R r0 = (X.C1422430n7R) r0     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.LIZ(r8)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L36
            goto L2e
        L49:
            monitor-exit(r6)
            return
        L4b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422420n7Q.cr2(int, X.0n7R):void");
    }

    public final void w2(C1419590n2r c1419590n2r, int i) {
        boolean z;
        if (i < this.LLIZLLLIL) {
            z = true;
        } else {
            z = false;
        }
        Z1(0, new C1422430n7R(i, c1419590n2r, null, z), false);
    }

    public C1422420n7Q(C1DRG c1drg, ShortVideoContext shortVideoContext, C1422410n7P c1422410n7P) {
        this.LL = c1drg;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = c1422410n7P;
    }

    private final void Z1(int i, C1422430n7R c1422430n7R, boolean z) {
        Pair<String, String> pairXY1;
        String str;
        InterfaceC1422440n7S interfaceC1422440n7SX1 = X1();
        if (interfaceC1422440n7SX1 != null && (pairXY1 = interfaceC1422440n7SX1.XY1()) != null) {
            String first = pairXY1.getFirst();
            String second = pairXY1.getSecond();
            C1422480n7W c1422480n7W = C1422480n7W.LIZ;
            C1422410n7P c1422410n7P = this.LLILLL;
            String str2 = c1422410n7P.LIZIZ;
            C1419590n2r c1419590n2r = c1422430n7R.LIZIZ;
            boolean z2 = c1422430n7R.LIZLLL;
            int i2 = c1422430n7R.LIZJ;
            boolean z3 = c1422410n7P.LIZLLL;
            c1422480n7W.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("search_id", second);
            c0lab.LJ("enter_from", str2);
            c0lab.LJ("search_type", "create_tab_search_general");
            c0lab.LIZ(z3 ? 1 : 0, "is_quick_search");
            c0lab.LJ("search_keyword", first);
            c0lab.LJ("search_result_id", c1419590n2r.LIZ.getAsset_id());
            c0lab.LJ("tt_template_type", C1422480n7W.LIZIZ(c1419590n2r));
            c0lab.LJ("token_type", "template");
            c0lab.LIZ(z2 ? 1 : 0, "is_first_screen");
            c0lab.LIZ(i2, "universal_rank");
            int i3 = 1;
            if (i != 1) {
                i3 = 0;
            }
            c0lab.LIZ(i3, "is_inner");
            c0lab.LJ("creator_search_info", c1419590n2r.LIZ.getCreatorSearchInfo());
            Map<String, String> map = c0lab.LIZ;
            if (z) {
                str = "search_result_show";
            } else {
                str = "search_result_click";
            }
            C20684815ws.LJIILLIIL(str, map);
        }
    }

    @Override // X.InterfaceC1422310n7F
    public void d91(C0LAB c0lab, TemplateCategoryData templateCategoryData, Integer num, C1419590n2r c1419590n2r, String str) {
        String first;
        Pair<String, String> pairXY1;
        Pair<String, String> pairXY12;
        boolean zLIZ = C1422460n7U.LIZ(templateCategoryData);
        boolean zLIZIZ = C1422460n7U.LIZIZ(templateCategoryData);
        if (!zLIZ) {
            if (!zLIZIZ) {
                return;
            }
        } else if (!zLIZIZ) {
            InterfaceC1422440n7S interfaceC1422440n7SX1 = X1();
            String second = null;
            if (interfaceC1422440n7SX1 != null && (pairXY12 = interfaceC1422440n7SX1.XY1()) != null) {
                first = pairXY12.getFirst();
            } else {
                first = null;
            }
            c0lab.LJ("search_keyword", first);
            InterfaceC1422440n7S interfaceC1422440n7SX12 = X1();
            if (interfaceC1422440n7SX12 != null && (pairXY1 = interfaceC1422440n7SX12.XY1()) != null) {
                second = pairXY1.getSecond();
            }
            c0lab.LJ("search_id", second);
            c0lab.LJ("search_type", "create_tab_search_general");
            c0lab.LJ("search_result_id", c1419590n2r.LIZ.getAsset_id());
            c0lab.LIZLLL(num, "search_universal_rank");
        }
        c0lab.LJ("template_search_enter_from", this.LLILLL.LIZIZ);
        c0lab.LJ("creator_search_info", c1419590n2r.LIZ.getCreatorSearchInfo());
        int iHashCode = str.hashCode();
        if (iHashCode != -1715975220) {
            if (iHashCode != 455806592) {
                if (iHashCode != 1423157203 || !str.equals("mv_show")) {
                    return;
                }
            } else if (!str.equals("click_try_this_template")) {
                return;
            }
        } else if (!str.equals("select_mv")) {
            return;
        }
        c0lab.LIZ(this.LLILLL.LIZJ, "create_tab_search_location");
        c0lab.LJ("tab_search_enter_method", this.LLILLL.LJFF);
        c0lab.LIZ(this.LLILLL.LIZLLL ? 1 : 0, "is_quick_search");
        c0lab.LIZLLL(this.LLILLL.LJI, "words_position");
    }

    public static final void o2(C1422420n7Q c1422420n7Q, C1422540n7c c1422540n7c, String str, InterfaceC1422440n7S interfaceC1422440n7S, String str2, int i, boolean z) {
        int i2;
        int i3;
        long j;
        if (z) {
            c1422420n7Q.LLJI = new Pair<>(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(c1422540n7c.LJI));
            return;
        }
        Pair<Long, Integer> pair = new Pair<>(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(c1422540n7c.LJI));
        long jLongValue = pair.getFirst().longValue() - c1422420n7Q.LLJI.getFirst().longValue();
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        C1422410n7P c1422410n7PMC1 = interfaceC1422440n7S.MC1();
        C1419590n2r c1419590n2r = c1422540n7c.LJII;
        int i4 = c1422540n7c.LIZJ;
        long j2 = c1422540n7c.LJFF;
        if (c1422420n7Q.LLJI.getSecond().intValue() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (pair.getSecond().intValue() == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (j2 <= 0) {
            c1422480n7W.getClass();
        } else {
            c1422480n7W.getClass();
            C0LAB c0labLIZ = C1422480n7W.LIZ(str, c1422410n7PMC1, str2, c1419590n2r, i, i4);
            c0labLIZ.LIZIZ(jLongValue, "duration");
            c0labLIZ.LIZIZ(j2, "video_duration");
            if (i == 1) {
                j = jLongValue;
            } else {
                j = 0;
            }
            c0labLIZ.LIZIZ(j, "search_duration_inner");
            if (i != 0) {
                jLongValue = 0;
            }
            c0labLIZ.LIZIZ(jLongValue, "search_duration_outer");
            c0labLIZ.LIZ(i2, "search_is_fullscreen_begin");
            c0labLIZ.LIZ(i3, "search_is_fullscreen_end");
            C20684815ws.LJIILLIIL("play_time", c0labLIZ.LIZ);
        }
        c1422420n7Q.LLJI = pair;
    }
}
