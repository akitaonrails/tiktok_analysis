package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06ON, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ON {
    public final C06NH LIZ;
    public final AbstractC2252651DEx LIZIZ;
    public C06OO LIZJ;
    public boolean LJI;
    public C1599406Oa LJII;
    public boolean LIZLLL = true;
    public List<? extends C06OO> LJ = C13BV.INSTANCE;
    public final Map<EnumC1596306Mv, AnonymousClass0684<C06OO>> LJFF = new LinkedHashMap();
    public final ConcurrentHashMap<EnumC1596306Mv, Function0<C06O6<C06OO>>> LJIIIIZZ = new ConcurrentHashMap<>();
    public final C823170WQx<EnumC1596306Mv> LJIIIZ = new C823170WQx<>();

    public final synchronized AnonymousClass0684<C06OO> LIZJ(EnumC1596306Mv enumC1596306Mv) {
        AnonymousClass0684<C06OO> anonymousClass0684 = (AnonymousClass0684) ((LinkedHashMap) this.LJFF).get(enumC1596306Mv);
        if (anonymousClass0684 != null) {
            return anonymousClass0684;
        }
        if (this.LJIIIZ.contains(enumC1596306Mv)) {
            return null;
        }
        Function0<C06O6<C06OO>> function0Remove = this.LJIIIIZZ.remove(enumC1596306Mv);
        if (function0Remove == null) {
            return null;
        }
        try {
            C06O6<C06OO> c06o6Invoke = function0Remove.invoke();
            if (c06o6Invoke != null && c06o6Invoke.LIZLLL() && c06o6Invoke.LJII().contains(c06o6Invoke.LL.LIZIZ)) {
                this.LJFF.put(enumC1596306Mv, c06o6Invoke);
                return c06o6Invoke;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJIIIZ.add(enumC1596306Mv);
        return null;
    }

    public C06ON(C06NH c06nh, AbstractC2252651DEx abstractC2252651DEx) {
        this.LIZ = c06nh;
        this.LIZIZ = abstractC2252651DEx;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine r11, X.InterfaceC1364105Vn r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C06OU
            if (r0 == 0) goto L70
            r8 = r12
            X.06OU r8 = (X.C06OU) r8
            int r2 = r8.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r8.LLIZ = r2
        L12:
            java.lang.Object r1 = r8.LLILZIL
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLIZ
            r7 = 1
            if (r0 == 0) goto L61
            if (r0 != r7) goto L9d
            java.lang.Object r4 = r8.LLILZ
            java.lang.Object r6 = r8.LLILLL
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r8.LLILLJJLI
            java.util.Collection r5 = (java.util.Collection) r5
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r11 = r8.LL
            X.C155000ia.LIZIZ(r1)
        L2e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3b
            r5.add(r4)
        L3b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.06OO r3 = (X.C06OO) r3
            r8.LL = r11
            r8.LLILLJJLI = r5
            r8.LLILLL = r6
            r8.LLILZ = r4
            r8.LLIZ = r7
            X.1DEx r2 = r10.LIZIZ
            X.06OG r1 = new X.06OG
            r0 = 0
            r1.<init>(r10, r3, r11, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r8, r2, r1)
            if (r1 != r9) goto L2e
            return r9
        L61:
            X.C155000ia.LIZIZ(r1)
            java.util.List<? extends X.06OO> r0 = r10.LJ
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
            goto L3b
        L70:
            X.06OU r8 = new X.06OU
            r8.<init>(r10, r12)
            goto L12
        L76:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r2 = r5.iterator()
        L7c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r2.next()
            X.06OO r1 = (X.C06OO) r1
            java.lang.String r0 = "RemoveInvalidTask: Removed from queue"
            r1.LIZIZ(r0, r11)
            goto L7c
        L8e:
            java.util.List<? extends X.06OO> r1 = r10.LJ
            java.util.Set r0 = X.C13LP.LLIIJI(r5)
            java.util.List r0 = X.C13LP.LJLI(r1, r0)
            r10.LJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06ON.LIZIZ(com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C06OO r9, com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06ON.LIZ(X.06OO, com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine, X.05Vn):java.lang.Object");
    }
}
