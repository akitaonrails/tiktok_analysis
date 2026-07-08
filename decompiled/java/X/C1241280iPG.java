package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241280iPG {
    public static String LIZIZ;
    public static final C1241280iPG LIZ = new C1241280iPG();
    public static final List<InterfaceC1891350zJl> LIZJ = new ArrayList();
    public static final C1DEV LIZLLL = C2191201ApK.LIZ();

    public static C1241300iPI LIZ() {
        if (!Intrinsics.LJFF(LIZIZ, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZJ);
        return new C1241300iPI(EnumC1241180iP6.SUCCESS, arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:159|(1:(1:(1:(1:(9:13|161|87|88|(5:91|(5:93|(2:94|(3:96|98|(1:177)(1:179))(2:178|97))|100|(3:102|(2:103|(2:105|(1:181)(1:182))(2:180|108))|107)|(1:110)(1:121))(1:(4:112|(2:113|(2:115|(1:184)(1:185))(2:183|120))|117|(1:119)(0))(0))|(3:173|123|176)(1:175)|174|89)|172|124|141|(3:143|144|145)(3:146|147|148))(2:15|16))(13:17|160|18|170|68|(2:157|70)|71|(4:74|(2:76|187)(1:188)|77|72)|186|82|168|83|(1:85)(7:86|88|(1:89)|172|124|141|(0)(0))))(29:21|164|30|31|(1:33)|34|(5:37|(1:39)(1:40)|(3:190|42|193)(1:192)|191|35)|189|43|(5:46|(1:48)(1:49)|(3:194|51|198)(1:197)|196|44)|195|52|(1:54)(4:56|57|58|(1:60)(1:61))|55|62|63|64|65|(1:67)|170|68|(0)|71|(1:72)|186|82|168|83|(0)(0)))(1:22))(2:23|(1:25))|155|26|163|27|(1:29)|31|(0)|34|(1:35)|189|43|(1:44)|195|52|(0)(0)|55|62|63|64|65|(0)|170|68|(0)|71|(1:72)|186|82|168|83|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:0|2|(2:4|(1:6)(1:14))(0)|7|159|(1:(1:(1:(1:(9:13|161|87|88|(5:91|(5:93|(2:94|(3:96|98|(1:177)(1:179))(2:178|97))|100|(3:102|(2:103|(2:105|(1:181)(1:182))(2:180|108))|107)|(1:110)(1:121))(1:(4:112|(2:113|(2:115|(1:184)(1:185))(2:183|120))|117|(1:119)(0))(0))|(3:173|123|176)(1:175)|174|89)|172|124|141|(3:143|144|145)(3:146|147|148))(2:15|16))(13:17|160|18|170|68|(2:157|70)|71|(4:74|(2:76|187)(1:188)|77|72)|186|82|168|83|(1:85)(7:86|88|(1:89)|172|124|141|(0)(0))))(29:21|164|30|31|(1:33)|34|(5:37|(1:39)(1:40)|(3:190|42|193)(1:192)|191|35)|189|43|(5:46|(1:48)(1:49)|(3:194|51|198)(1:197)|196|44)|195|52|(1:54)(4:56|57|58|(1:60)(1:61))|55|62|63|64|65|(1:67)|170|68|(0)|71|(1:72)|186|82|168|83|(0)(0)))(1:22))(2:23|(1:25))|155|26|163|27|(1:29)|31|(0)|34|(1:35)|189|43|(1:44)|195|52|(0)(0)|55|62|63|64|65|(0)|170|68|(0)|71|(1:72)|186|82|168|83|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0273, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0275, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0277, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0279, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027f, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c7 A[Catch: all -> 0x02e6, TRY_LEAVE, TryCatch #2 {all -> 0x02e6, blocks: (B:98:0x01fa, B:100:0x0206, B:102:0x020a, B:103:0x020e, B:105:0x0214, B:107:0x0227, B:110:0x022e, B:123:0x0268, B:112:0x023a, B:113:0x023e, B:115:0x0244, B:117:0x0257, B:119:0x025b, B:124:0x026d, B:141:0x0283, B:143:0x02c7, B:146:0x02d5, B:140:0x0280, B:150:0x02e2, B:62:0x0140, B:64:0x014b, B:57:0x0112), top: B:159:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5 A[Catch: all -> 0x02e6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02e6, blocks: (B:98:0x01fa, B:100:0x0206, B:102:0x020a, B:103:0x020e, B:105:0x0214, B:107:0x0227, B:110:0x022e, B:123:0x0268, B:112:0x023a, B:113:0x023e, B:115:0x0244, B:117:0x0257, B:119:0x025b, B:124:0x026d, B:141:0x0283, B:143:0x02c7, B:146:0x02d5, B:140:0x0280, B:150:0x02e2, B:62:0x0140, B:64:0x014b, B:57:0x0112), top: B:159:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: all -> 0x027b, Exception -> 0x027d, TryCatch #7 {Exception -> 0x027d, blocks: (B:30:0x00ac, B:31:0x00af, B:33:0x00b7, B:34:0x00b9, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:51:0x00fb, B:52:0x00ff, B:54:0x0105, B:55:0x0107, B:62:0x0140, B:63:0x0147, B:64:0x014b, B:65:0x014d, B:56:0x010a, B:57:0x0112, B:58:0x0121, B:60:0x0136, B:61:0x013d), top: B:164:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: all -> 0x027b, Exception -> 0x027d, TryCatch #7 {Exception -> 0x027d, blocks: (B:30:0x00ac, B:31:0x00af, B:33:0x00b7, B:34:0x00b9, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:51:0x00fb, B:52:0x00ff, B:54:0x0105, B:55:0x0107, B:62:0x0140, B:63:0x0147, B:64:0x014b, B:65:0x014d, B:56:0x010a, B:57:0x0112, B:58:0x0121, B:60:0x0136, B:61:0x013d), top: B:164:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[Catch: all -> 0x027b, Exception -> 0x027d, TryCatch #7 {Exception -> 0x027d, blocks: (B:30:0x00ac, B:31:0x00af, B:33:0x00b7, B:34:0x00b9, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:51:0x00fb, B:52:0x00ff, B:54:0x0105, B:55:0x0107, B:62:0x0140, B:63:0x0147, B:64:0x014b, B:65:0x014d, B:56:0x010a, B:57:0x0112, B:58:0x0121, B:60:0x0136, B:61:0x013d), top: B:164:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105 A[Catch: all -> 0x027b, Exception -> 0x027d, TryCatch #7 {Exception -> 0x027d, blocks: (B:30:0x00ac, B:31:0x00af, B:33:0x00b7, B:34:0x00b9, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:51:0x00fb, B:52:0x00ff, B:54:0x0105, B:55:0x0107, B:62:0x0140, B:63:0x0147, B:64:0x014b, B:65:0x014d, B:56:0x010a, B:57:0x0112, B:58:0x0121, B:60:0x0136, B:61:0x013d), top: B:164:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a A[Catch: all -> 0x027b, Exception -> 0x027d, TRY_LEAVE, TryCatch #7 {Exception -> 0x027d, blocks: (B:30:0x00ac, B:31:0x00af, B:33:0x00b7, B:34:0x00b9, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:42:0x00d8, B:43:0x00dc, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:51:0x00fb, B:52:0x00ff, B:54:0x0105, B:55:0x0107, B:62:0x0140, B:63:0x0147, B:64:0x014b, B:65:0x014d, B:56:0x010a, B:57:0x0112, B:58:0x0121, B:60:0x0136, B:61:0x013d), top: B:164:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177 A[Catch: all -> 0x0189, Exception -> 0x018c, TRY_ENTER, TryCatch #1 {Exception -> 0x018c, blocks: (B:70:0x0162, B:74:0x0177, B:77:0x0185), top: B:157:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db A[Catch: Exception -> 0x0271, all -> 0x027b, TryCatch #5 {Exception -> 0x0271, blocks: (B:87:0x01c7, B:88:0x01ca, B:89:0x01d5, B:91:0x01db, B:93:0x01e6, B:94:0x01ea, B:96:0x01f0, B:98:0x01fa, B:100:0x0206, B:102:0x020a, B:103:0x020e, B:105:0x0214, B:107:0x0227, B:110:0x022e, B:123:0x0268, B:112:0x023a, B:113:0x023e, B:115:0x0244, B:117:0x0257, B:119:0x025b, B:124:0x026d), top: B:161:0x01c7 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C1241300iPI> r21) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1241280iPG.LIZIZ(X.05Vn):java.lang.Object");
    }
}
