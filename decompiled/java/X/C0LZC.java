package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.helper.ClickDraftHelper$clickShootingI2v$3", f = "ClickDraftHelper.kt", l = {146, 175, 167}, m = "invokeSuspend")
public final class C0LZC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>>, Object> {
    public AIGCOfflineModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C0LZB LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0M0P LLIZLLLIL;
    public final /* synthetic */ C561130Lzb LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZC(C561130Lzb c561130Lzb, C0M0P c0m0p, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0m0p;
        this.LLJ = c561130Lzb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LZC c0lzc = new C0LZC(this.LLJ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0lzc.LLIZ = obj;
        return c0lzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a A[Catch: all -> 0x01de, TryCatch #0 {all -> 0x01de, blocks: (B:110:0x01cd, B:111:0x01d0, B:76:0x0133, B:77:0x0136, B:79:0x013a, B:80:0x013e, B:82:0x0144, B:87:0x0152, B:93:0x015d, B:96:0x0195, B:101:0x019e, B:103:0x01a2, B:105:0x01a6, B:106:0x01a8, B:64:0x00ff, B:66:0x010b, B:68:0x010f, B:70:0x0113, B:72:0x0119), top: B:116:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c A[PHI: r1 r2 r3 r8 r10 r15
      0x015c: PHI (r1v11 java.lang.String) = (r1v7 java.lang.String), (r1v14 java.lang.String), (r1v14 java.lang.String), (r1v14 java.lang.String) binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r2v17 java.lang.String) = (r2v10 java.lang.String), (r2v20 java.lang.String), (r2v20 java.lang.String), (r2v20 java.lang.String) binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r3v4 X.0LZB) = (r3v1 X.0LZB), (r3v7 X.0LZB), (r3v7 X.0LZB), (r3v7 X.0LZB) binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r8v2 com.ss.android.ugc.aweme.draft.model.AwemeDraft) = 
      (r8v0 com.ss.android.ugc.aweme.draft.model.AwemeDraft)
      (r8v8 com.ss.android.ugc.aweme.draft.model.AwemeDraft)
      (r8v8 com.ss.android.ugc.aweme.draft.model.AwemeDraft)
      (r8v8 com.ss.android.ugc.aweme.draft.model.AwemeDraft)
     binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v3 int), (r10v3 int) binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r15v1 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel) = 
      (r15v0 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r15v4 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r15v4 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r15v4 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
     binds: [B:71:0x0117, B:78:0x0138, B:86:0x0150, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195 A[Catch: all -> 0x01de, TryCatch #0 {all -> 0x01de, blocks: (B:110:0x01cd, B:111:0x01d0, B:76:0x0133, B:77:0x0136, B:79:0x013a, B:80:0x013e, B:82:0x0144, B:87:0x0152, B:93:0x015d, B:96:0x0195, B:101:0x019e, B:103:0x01a2, B:105:0x01a6, B:106:0x01a8, B:64:0x00ff, B:66:0x010b, B:68:0x010f, B:70:0x0113, B:72:0x0119), top: B:116:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LZC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
