package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YI6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YI6 implements InterfaceC864330XvT {
    public final C0YEM LL;
    public final C0YIE LLILLJJLI;
    public final C0YI7 LLILLL;
    public final C0YIU LLILZ;
    public final AbstractC2252651DEx LLILZIL;
    public final InterfaceC871850YId LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC864330XvT
    public final void clear() {
        this.LLILLJJLI.clear();
    }

    public final boolean LJ(Response response) {
        long jLongValue;
        String string;
        Long l = response.expected_user_id;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            return true;
        }
        long uid = this.LL.getUid();
        if (jLongValue == uid) {
            return true;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response uid mismatch: response.expected_user_id=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(", currentUid=");
        sbLIZ.append(uid);
        sbLIZ.append(", cmd=");
        sbLIZ.append(response.cmd);
        sbLIZ.append(", logId=");
        sbLIZ.append(response.log_id);
        c868780Y6iLIZLLL.LJIIIIZZ("RemoteFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
        C0YEK c0yek = (C0YEK) this.LLIZ.getValue();
        String strValueOf = String.valueOf(jLongValue);
        String strValueOf2 = String.valueOf(uid);
        Integer num = response.cmd;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c0yek.LIZ("response_body", strValueOf, strValueOf2, string);
        return !this.LL.LJIILL().LIZ.LIZ.invoke().enableResponseUidValidation;
    }

    @Override // X.InterfaceC864330XvT
    public final boolean LJIIZILJ(long j) {
        this.LLILZLL.reset();
        C05XL<Response> c05xl = this.LLILLJJLI.get(j);
        if (c05xl == null) {
            return false;
        }
        c05xl.LJJJJJ(new C0Y8K(-1035, "error ack received, most likely request timeout", null));
        return true;
    }

    /* JADX WARN: Path cross not found for [B:30:0x0100, B:61:0x01c6], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:33:0x0106, B:60:0x01b8], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:60:0x01b8, B:33:0x0106], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1 A[PHI: r1
      0x01e1: PHI (r1v16 int) = (r1v15 int), (r1v14 int), (r1v17 int) binds: [B:69:0x01dd, B:65:0x01cd, B:31:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0239  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x018b -> B:93:0x018f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x01a7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0YCX r14, X.InterfaceC1364105Vn<? super X.C864760XwA> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YI6.LIZ(X.0YCX, X.05Vn):java.lang.Object");
    }

    public final void LIZJ(Response response, boolean z) {
        int iIntValue;
        Integer num = response.status_code;
        int i = C0YIF.LIZJ;
        if (num == null || num.intValue() != i) {
            int i2 = C0YIF.LIZIZ;
            if (num == null || num.intValue() != i2) {
                int i3 = C0YIF.LIZLLL;
                if (num == null || num.intValue() != i3) {
                    return;
                }
            }
        }
        C871360YGg c871360YGg = this.LL.LJIIZILJ().getDomain().LIZLLL;
        Integer num2 = response.cmd;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        int iIntValue2 = num.intValue();
        c871360YGg.getClass();
        c871360YGg.LJ(InterfaceC871310YGb.LJ, new C0YLT(iIntValue, iIntValue2, z));
    }

    @Override // X.InterfaceC864330XvT
    public final Object LJJLIIIJ(Response response, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C05XL<Response> c05xl;
        this.LLILZLL.reset();
        if (LJ(response) && (c05xl = this.LLILLJJLI.get(response.sequence_id.longValue())) != null) {
            if (C0Y81.LIZLLL(response)) {
                c05xl.LJIIZILJ(response);
            } else {
                LIZJ(response, true);
                C0Y8K.Companion.getClass();
                c05xl.LJJJJJ(C0Y8L.LIZ(response));
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C0YCX r7, X.C0YIS r8, X.InterfaceC1364105Vn<? super X.C864760XwA> r9) throws X.C0Y8K {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YI6.LIZLLL(X.0YCX, X.0YIS, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC864330XvT
    public final Object LJJJLIIL(String str, byte[] bArr, InterfaceC1364105Vn<? super C189200o6<Response>> interfaceC1364105Vn) {
        try {
            Response responseLIZ = this.LLILZ.LIZ(str, bArr);
            C189200o6.m2constructorimpl(responseLIZ);
            return responseLIZ;
        } catch (C0YIJ e) {
            TryCatchGuardChecker.doCheck(e);
            C0YI7 c0yi7 = this.LLILLL;
            c0yi7.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("RemoteFetcherLogger decode", e);
            C0YJ9 c0yj9 = new C0YJ9(c0yi7.LIZ);
            c0yj9.LIZJ("imsdk_network_request");
            c0yj9.LIZ("-1", "imsdk_cmd");
            c0yj9.LIZ("unknown", "url_path");
            c0yj9.LIZ(0, "imsdk_result");
            c0yj9.LIZ("-1", "seq_id");
            c0yj9.LIZ("-1", "duration");
            String message = e.getMessage();
            if (message == null) {
                message = "decode failed";
            }
            c0yj9.LIZ(message, "error_msg");
            c0yj9.LIZ(Integer.valueOf(e.getErrorCode()), "error_code");
            c0yi7.LIZ.LJIIZILJ().LJFF().getEventTracker().getClass();
            c0yj9.LIZ(C0YLL.LIZIZ(e), "error_stack");
            c0yi7.LIZ.LJIIZILJ().LJFF().getEventTracker().getClass();
            c0yj9.LIZ(C0YLL.LIZ(e), "error_name");
            c0yj9.LIZ("ws", "net_type");
            c0yj9.LIZLLL();
            C098200Yq c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0406: IGET (r0 I:java.lang.Long) = (r4 I:com.bytedance.im.core.proto.Request) (LINE:50332678) com.bytedance.im.core.proto.Request.sequence_id java.lang.Long, block:B:185:0x0404 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c3 A[Catch: 0Y8K -> 0x02e4, 0YIJ -> 0x0378, all -> 0x03c8, TryCatch #5 {all -> 0x03c8, blocks: (B:110:0x0295, B:121:0x02bd, B:123:0x02c3, B:125:0x02c9, B:126:0x02ca, B:127:0x02cd, B:134:0x02e5, B:136:0x0302, B:141:0x0320, B:144:0x033c, B:146:0x0340, B:148:0x0344, B:149:0x0349, B:150:0x034a, B:152:0x0358, B:155:0x0372, B:156:0x0377, B:158:0x0379, B:160:0x0384, B:163:0x039e, B:164:0x03c7), top: B:187:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0302 A[Catch: all -> 0x03c8, TryCatch #5 {all -> 0x03c8, blocks: (B:110:0x0295, B:121:0x02bd, B:123:0x02c3, B:125:0x02c9, B:126:0x02ca, B:127:0x02cd, B:134:0x02e5, B:136:0x0302, B:141:0x0320, B:144:0x033c, B:146:0x0340, B:148:0x0344, B:149:0x0349, B:150:0x034a, B:152:0x0358, B:155:0x0372, B:156:0x0377, B:158:0x0379, B:160:0x0384, B:163:0x039e, B:164:0x03c7), top: B:187:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0384 A[Catch: all -> 0x03c8, TryCatch #5 {all -> 0x03c8, blocks: (B:110:0x0295, B:121:0x02bd, B:123:0x02c3, B:125:0x02c9, B:126:0x02ca, B:127:0x02cd, B:134:0x02e5, B:136:0x0302, B:141:0x0320, B:144:0x033c, B:146:0x0340, B:148:0x0344, B:149:0x0349, B:150:0x034a, B:152:0x0358, B:155:0x0372, B:156:0x0377, B:158:0x0379, B:160:0x0384, B:163:0x039e, B:164:0x03c7), top: B:187:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039e A[Catch: all -> 0x03c8, TryCatch #5 {all -> 0x03c8, blocks: (B:110:0x0295, B:121:0x02bd, B:123:0x02c3, B:125:0x02c9, B:126:0x02ca, B:127:0x02cd, B:134:0x02e5, B:136:0x0302, B:141:0x0320, B:144:0x033c, B:146:0x0340, B:148:0x0344, B:149:0x0349, B:150:0x034a, B:152:0x0358, B:155:0x0372, B:156:0x0377, B:158:0x0379, B:160:0x0384, B:163:0x039e, B:164:0x03c7), top: B:187:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263 A[Catch: 0Y8K -> 0x0281, 0YIJ -> 0x0283, all -> 0x02a8, TryCatch #6 {all -> 0x02a8, blocks: (B:97:0x025b, B:99:0x0263, B:101:0x0269, B:96:0x0258, B:109:0x0292), top: B:187:0x001e }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.bytedance.im.core.proto.Request] */
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
    @Override // X.InterfaceC864330XvT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLIILIL(X.C0YCX r13, boolean r14, X.InterfaceC1364105Vn<? super X.C864760XwA> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YI6.LLLIILIL(X.0YCX, boolean, X.05Vn):java.lang.Object");
    }

    public C0YI6(C0YEM c0yem, C0YE2 c0ye2, C0YI7 c0yi7, C0YLJ c0ylj) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C0YIP c0yip = new C0YIP(c0yem);
        this.LL = c0yem;
        this.LLILLJJLI = c0ye2;
        this.LLILLL = c0yi7;
        this.LLILZ = c0ylj;
        this.LLILZIL = c1dfb;
        this.LLILZLL = c0yip;
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1504));
        this.LLIZLLLIL = C452501pT.LIZIZ(new C0YII(this));
        this.LLJ = C452501pT.LIZIZ(new C0YIH(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r0 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r5 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015a, code lost:
    
        if (r0 < 0) goto L46;
     */
    /* JADX WARN: Path cross not found for [B:27:0x00af, B:47:0x016a], limit reached: 59 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C099F r18, X.C0YCX r19, X.C871820YIa r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YI6.LIZIZ(X.099F, X.0YCX, X.0YIa, X.05Vn):java.lang.Object");
    }
}
