package X;

import j27.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0DY4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DY4 implements C0DRX {
    public final /* synthetic */ List<C0DQP> LIZ;
    public final /* synthetic */ s LIZIZ;
    public final /* synthetic */ Map<String, String> LIZJ;
    public final /* synthetic */ C054000Hq LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r7 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r1 = X.C0DYC.LIZ(r7, "*_search_lynx_context_token_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if ((r1 instanceof java.lang.String) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r1 = (java.lang.String) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (X.C293270BeX.LIZ(r1) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r1 = X.C651640PhC.LIZIZ;
        r0 = r9.LJII;
        r1.getClass();
        X.C651640PhC.LIZLLL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (X.C301260BrQ.LIZ() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        X.C0QAQ.LIZ(r8, r6, r5, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r0 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r0.LJI != true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        r1 = null;
     */
    @Override // X.C0DRX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            r15 = this;
            java.util.List<X.0DQP> r0 = r15.LIZ
            j27.s r7 = r15.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r6 = r15.LIZJ
            X.00Hq r5 = r15.LIZLLL
            X.13DV r4 = X.C1697820uHc.LIZIZ()
            java.util.Iterator r14 = r0.iterator()
        L10:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r9 = r14.next()
            X.0DQP r9 = (X.C0DQP) r9
            java.util.List r8 = r9.LIZ()
            java.util.Iterator r13 = r8.iterator()
            r11 = 0
        L25:
            boolean r0 = r13.hasNext()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L5e
            java.lang.Object r10 = r13.next()
            int r12 = r11 + 1
            if (r11 < 0) goto L99
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = (com.ss.android.ugc.aweme.feed.model.Aweme) r10
            r4.add(r10)
            X.0PhC r2 = X.C651640PhC.LIZIZ
            if (r11 != 0) goto L5c
            java.lang.String r1 = r9.LIZIZ
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5c
            r1 = 1
        L49:
            int r0 = r8.size()
            int r0 = r0 - r3
            if (r11 == r0) goto L51
            r3 = 0
        L51:
            r2.getClass()
            X.C651640PhC.LIZ(r10, r9, r1, r3)
            X.C651640PhC.LIZJ(r10, r9)
            r11 = r12
            goto L25
        L5c:
            r1 = 0
            goto L49
        L5e:
            if (r7 == 0) goto L97
            java.lang.String r0 = "*_search_lynx_context_token_type"
            java.lang.Object r1 = X.C0DYC.LIZ(r7, r0)
        L66:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L6e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L70
        L6e:
            java.lang.String r1 = ""
        L70:
            boolean r0 = X.C293270BeX.LIZ(r1)
            if (r0 == 0) goto L80
            X.0PhC r1 = X.C651640PhC.LIZIZ
            java.util.ArrayList<java.lang.String> r0 = r9.LJII
            r1.getClass()
            X.C651640PhC.LIZLLL(r0)
        L80:
            boolean r0 = X.C301260BrQ.LIZ()
            if (r0 == 0) goto L8a
            r0 = 0
            X.C0QAQ.LIZ(r8, r6, r5, r2, r0)
        L8a:
            X.0DQN r0 = r9.LJI
            if (r0 == 0) goto L10
            boolean r0 = r0.LJI
            if (r0 != r3) goto L10
        L92:
            java.util.List r0 = X.C1697820uHc.LIZ(r4)
            return r0
        L97:
            r1 = r2
            goto L66
        L99:
            X.C1697810uHb.LJIJI()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DY4.getAwemeList():java.util.List");
    }

    @Override // X.C0DRX
    public final boolean getHasMore() {
        List<C0DQP> list = this.LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C0DQP> it2 = list.iterator();
            while (it2.hasNext()) {
                C0DQN c0dqn = it2.next().LJI;
                if (c0dqn != null && c0dqn.LJI) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:40:0x009f, B:41:0x00a2, B:47:0x00ae, B:48:0x00b4, B:50:0x00b8, B:54:0x00c0, B:56:0x00c6, B:57:0x00d0, B:58:0x00d4, B:60:0x00da, B:62:0x00e6, B:67:0x00ef, B:71:0x0106, B:72:0x0113, B:74:0x0119, B:75:0x0127, B:77:0x012e, B:78:0x0133, B:79:0x0137, B:80:0x0141, B:15:0x0047, B:16:0x004b, B:18:0x0051, B:20:0x005c, B:27:0x0067, B:31:0x0077, B:32:0x0079, B:34:0x0086, B:36:0x008a), top: B:89:0x001d }] */
    @Override // X.C0DRX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>> r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DY4.LIZ(X.05Vn):java.lang.Object");
    }

    public C0DY4(List<C0DQP> list, s sVar, Map<String, String> map, C054000Hq c054000Hq) {
        this.LIZ = list;
        this.LIZIZ = sVar;
        this.LIZJ = map;
        this.LIZLLL = c054000Hq;
    }
}
