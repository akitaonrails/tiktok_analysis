package X;

import Y.AfS171S0100000_2;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.exp.InboxMixSearchOptimizationExp;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240910iOf implements InterfaceC1242030iQT {
    public static final C01GW<C1240910iOf> LJIIIIZZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(619));
    public final Function2<List<String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> LIZ;
    public final Function1<String, String> LIZIZ;
    public final Function1<String, C0Y8T> LIZJ;
    public final Function1<List<String>, List<C0Y8T>> LIZLLL;
    public final Function1<Boolean, C1240470iNx> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C1231704rr LJII;

    @Override // X.InterfaceC1242030iQT
    public final boolean LIZIZ() {
        return ((InboxMixSearchOptimizationExp.Config) InboxMixSearchOptimizationExp.LIZIZ.getValue()).enableNewRanking;
    }

    @Override // X.InterfaceC1242030iQT
    public final boolean LIZJ() {
        return ((InboxMixSearchOptimizationExp.Config) InboxMixSearchOptimizationExp.LIZIZ.getValue()).enableRemoteSearch;
    }

    @Override // X.InterfaceC1242030iQT
    public final long LIZLLL() {
        return ((InboxMixSearchOptimizationExp.Config) InboxMixSearchOptimizationExp.LIZIZ.getValue()).remoteSearchDebounceMs;
    }

    public C1240910iOf(Object obj) {
        C05L6 c05l6 = new C05L6(null);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(605);
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(133);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(378);
        AFwS257S0000000_19 aFwS257S0000000_192 = AFwS257S0000000_19.get$arr$(606);
        this.LIZ = c05l6;
        this.LIZIZ = aFwS257S0000000_19;
        this.LIZJ = aFwS231S0000000_3;
        this.LIZLLL = aFwS248S0000000_14;
        this.LJ = aFwS257S0000000_192;
        this.LJFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2838));
        this.LJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2837));
        this.LJII = new C1231704rr("InboxMixSearchService", null, 6);
    }

    public static C099F LJIIJ(C11NZ c11nz) {
        C099F c099fLIZIZ = C090F.LIZIZ();
        c099fLIZIZ.LJII(new AwS598S0100000_19((C11JI) new C11IE(c11nz).LJIJ(new C516201zk(c099fLIZIZ, 146), new AfS171S0100000_2(c099fLIZIZ, 30), new C346430Di5(c099fLIZIZ, 2)), 571));
        return c099fLIZIZ;
    }

    public final List<C0Y8T> LJIIIIZZ(List<String> list) {
        List<C0Y8T> listInvoke;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8tInvoke = this.LIZJ.invoke((String) it2.next());
            if (c0y8tInvoke != null) {
                arrayList2.add(c0y8tInvoke);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C0Y8T) it3.next()).getConversationId());
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setLLIIJI.contains(obj)) {
                arrayList4.add(obj);
            }
        }
        if (arrayList4.isEmpty()) {
            listInvoke = C13BV.INSTANCE;
        } else {
            listInvoke = this.LIZLLL.invoke(arrayList4);
        }
        return C13LP.LJLIL(listInvoke, arrayList2);
    }

    @Override // X.InterfaceC1242030iQT
    public final List<C1240530iO3> LIZ(C1916007ew c1916007ew, C1916207ey c1916207ey) {
        List listLJIJJLI;
        List list = (List) C13LP.LJJJLL(c1916007ew.LIZ);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (c1916007ew.LIZ.size() > 1) {
            listLJIJJLI = C15438062q.LJIJJLI(C13LP.LJJJJIZL(c1916007ew.LIZ, 1));
        } else {
            listLJIJJLI = C13BV.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LJII((C1240530iO3) it2.next(), linkedHashSet, linkedHashSet2, arrayList);
        }
        Iterator<C1240530iO3> it3 = c1916207ey.LIZ.iterator();
        while (it3.hasNext()) {
            LJII(it3.next(), linkedHashSet, linkedHashSet2, arrayList);
        }
        Iterator it4 = listLJIJJLI.iterator();
        while (it4.hasNext()) {
            LJII((C1240530iO3) it4.next(), linkedHashSet, linkedHashSet2, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127 A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, LOOP:0: B:56:0x0121->B:58:0x0127, LOOP_END, TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, LOOP:1: B:60:0x0145->B:62:0x014b, LOOP_END, TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166 A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190 A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf A[Catch: Exception -> 0x0203, CancellationException -> 0x0212, PHI: r11
      0x01bf: PHI (r11v3 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) = 
      (r11v2 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
      (r11v5 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
     binds: [B:79:0x01a2, B:85:0x01b9] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0212, Exception -> 0x0203, blocks: (B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:52:0x0108, B:55:0x0118, B:56:0x0121, B:58:0x0127, B:59:0x0136, B:60:0x0145, B:62:0x014b, B:63:0x0157, B:64:0x0160, B:66:0x0166, B:72:0x0179, B:73:0x017d, B:74:0x018a, B:76:0x0190, B:78:0x019c, B:80:0x01a4, B:83:0x01b0, B:89:0x01bf, B:90:0x01c3, B:92:0x01c9, B:94:0x01e0, B:96:0x01f2, B:98:0x01f9, B:99:0x01fd, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:35:0x00c6, B:37:0x00cc, B:39:0x00cf, B:40:0x00d8, B:42:0x00de, B:44:0x00ea, B:45:0x00ee, B:24:0x006e, B:26:0x0079, B:28:0x00a5), top: B:107:0x0023 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1242030iQT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r18, X.InterfaceC1364105Vn<? super X.C1916207ey> r19) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240910iOf.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1242030iQT
    public final List<C1240530iO3> LJFF(C1916007ew c1916007ew, C1916207ey c1916207ey) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(c1916007ew.LIZ)).iterator();
        while (it2.hasNext()) {
            LJII((C1240530iO3) it2.next(), linkedHashSet, linkedHashSet2, arrayList);
        }
        Iterator<C1240530iO3> it3 = c1916207ey.LIZ.iterator();
        while (it3.hasNext()) {
            LJII(it3.next(), linkedHashSet, linkedHashSet2, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: Exception -> 0x00e7, CancellationException -> 0x00f9, TryCatch #0 {Exception -> 0x00e7, blocks: (B:25:0x0067, B:26:0x006a, B:28:0x006e, B:30:0x007a, B:32:0x0088, B:34:0x008e, B:35:0x0092, B:37:0x0098, B:38:0x00a3, B:40:0x00ad, B:42:0x00bd, B:43:0x00c6, B:44:0x00d5, B:45:0x00df), top: B:55:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: Exception -> 0x00e7, CancellationException -> 0x00f9, TryCatch #0 {Exception -> 0x00e7, blocks: (B:25:0x0067, B:26:0x006a, B:28:0x006e, B:30:0x007a, B:32:0x0088, B:34:0x008e, B:35:0x0092, B:37:0x0098, B:38:0x00a3, B:40:0x00ad, B:42:0x00bd, B:43:0x00c6, B:44:0x00d5, B:45:0x00df), top: B:55:0x0067 }] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0iOE] */
    @Override // X.InterfaceC1242030iQT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r11, boolean r12, X.InterfaceC1364105Vn<? super X.C1916007ew> r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240910iOf.LJI(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    public static void LJII(C1240530iO3 c1240530iO3, Set set, Set set2, List list) {
        String uid;
        C1240210iNX c1240210iNX;
        C0Y8T c0y8t;
        C1240220iNY c1240220iNY;
        IMUser iMUser;
        InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO3.LL;
        String conversationId = null;
        if ((interfaceC1240540iO4 instanceof C1240220iNY) && (c1240220iNY = (C1240220iNY) interfaceC1240540iO4) != null && (iMUser = c1240220iNY.LIZ) != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        InterfaceC1240540iO4 interfaceC1240540iO42 = c1240530iO3.LL;
        if ((interfaceC1240540iO42 instanceof C1240210iNX) && (c1240210iNX = (C1240210iNX) interfaceC1240540iO42) != null && (c0y8t = c1240210iNX.LIZ) != null) {
            conversationId = c0y8t.getConversationId();
        }
        if (uid != null) {
            if (set.add(uid)) {
                ((ArrayList) list).add(c1240530iO3);
            }
        } else {
            if (conversationId != null) {
                if (!set2.add(conversationId)) {
                    return;
                }
                ((ArrayList) list).add(c1240530iO3);
                return;
            }
            ((ArrayList) list).add(c1240530iO3);
        }
    }

    public static void LJIIIZ(String str, float f, float f2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "inbox");
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        c2344009Gk.LIZJ(-1, "candidates_count");
        c2344009Gk.LJ(Boolean.valueOf(z), "finished");
        c2344009Gk.LIZIZ(f, "matching_duration");
        c2344009Gk.LIZIZ(f2, "ranking_duration");
        C20684815ws.LJIILLIIL("social_search_client_performance", c2344009Gk.LIZ);
    }
}
