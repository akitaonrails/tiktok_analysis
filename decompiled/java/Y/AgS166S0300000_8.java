package Y;

import X.C0MKE;
import X.C0MKH;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes9.dex */
public class AgS166S0300000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C0MKH r56, X.InterfaceC1364105Vn<? super kotlin.Unit> r57) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.LIZ$0(X.0MKH, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0124 A[PHI: r4
      0x0124: PHI (r4v2 com.ss.android.ugc.aweme.comment.model.CommentVideoModel) = 
      (r4v1 com.ss.android.ugc.aweme.comment.model.CommentVideoModel)
      (r4v4 com.ss.android.ugc.aweme.comment.model.CommentVideoModel)
     binds: [B:33:0x00aa, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(X.C0MKE r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.LIZ$1(X.0MKE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7 A[PHI: r17
      0x01a7: PHI (r17v1 com.ss.android.ugc.aweme.comment.model.CommentVideoModel) = 
      (r17v0 com.ss.android.ugc.aweme.comment.model.CommentVideoModel)
      (r17v3 com.ss.android.ugc.aweme.comment.model.CommentVideoModel)
     binds: [B:15:0x0176, B:19:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$2(X.C0MKE r129, X.InterfaceC1364105Vn<? super kotlin.Unit> r130) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.LIZ$2(X.0MKE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS166S0300000_8 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0MKW
            if (r0 == 0) goto L4a
            r6 = r9
            X.0MKW r6 = (X.C0MKW) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L50
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.String r8 = (java.lang.String) r8
            X.0MKJ r2 = X.C0MKJ.LIZ
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader$DownloadConfig r0 = (com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadConfig) r0
            java.lang.String r1 = r0.fileName
            java.lang.Object r0 = r7.l2
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = (com.ss.android.ugc.aweme.creative.model.CreativeInfo) r0
            r2.getClass()
            java.lang.String r0 = X.C0MKJ.LJFF(r0, r8, r1)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L4a:
            X.0MKW r6 = new X.0MKW
            r6.<init>(r7, r9)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.emit$0(Y.AgS166S0300000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS166S0300000_8 agS166S0300000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS166S0300000_8.LIZ$0((C0MKH) obj, interfaceC1364105Vn);
    }

    public static final /* bridge */ /* synthetic */ Object emit$2(AgS166S0300000_8 agS166S0300000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS166S0300000_8.LIZ$1((C0MKE) obj, interfaceC1364105Vn);
    }

    public static final /* bridge */ /* synthetic */ Object emit$3(AgS166S0300000_8 agS166S0300000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS166S0300000_8.LIZ$2((C0MKE) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS166S0300000_8 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C545890Lb1
            if (r0 == 0) goto L5d
            r6 = r9
            X.0Lb1 r6 = (X.C545890Lb1) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L4c
            if (r0 != r4) goto L63
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r7.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = (com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager) r0
            X.0LCT r1 = r0.LJIILIIL()
            java.lang.Object r0 = r7.l2
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r0
            java.lang.String r0 = r0.LIZ()
            r6.LLILLL = r2
            r6.LLILLJJLI = r3
            java.lang.Object r1 = r1.LIZ(r0, r8, r6)
            if (r1 != r5) goto L51
            return r5
        L4c:
            X.01Wf r2 = r6.LLILLL
            X.C155000ia.LIZIZ(r1)
        L51:
            r0 = 0
            r6.LLILLL = r0
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L25
            return r5
        L5d:
            X.0Lb1 r6 = new X.0Lb1
            r6.<init>(r7, r9)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.emit$4(Y.AgS166S0300000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS166S0300000_8 r11, java.lang.Object r12, X.InterfaceC1364105Vn r13) {
        /*
            boolean r0 = r13 instanceof X.C553370Ln5
            if (r0 == 0) goto Lb4
            r7 = r13
            X.0Ln5 r7 = (X.C553370Ln5) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r8 = 4
            r5 = 3
            r10 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L2f
            if (r0 == r9) goto L51
            if (r0 == r10) goto L85
            if (r0 == r5) goto La4
            if (r0 != r8) goto Lbb
            X.C155000ia.LIZIZ(r1)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r11.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.05Ou r12 = (X.C1346605Ou) r12
            java.lang.Object r2 = r11.l1
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = (com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi) r2
            java.lang.Object r0 = r11.l2
            X.0LmO r0 = (X.C552940LmO) r0
            java.lang.String r1 = r0.LIZ
            X.0Lm5 r0 = X.C552750Lm5.INSTANCE
            r7.LLILLL = r3
            r7.LLILZIL = r12
            r7.LLILLJJLI = r9
            java.lang.Object r1 = r2.LJIILL(r1, r0, r7)
            if (r1 != r6) goto L58
            return r6
        L51:
            X.05Ou r12 = r7.LLILZIL
            X.01Wf r3 = r7.LLILLL
            X.C155000ia.LIZIZ(r1)
        L58:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            java.lang.Object r9 = X.C550520LiU.LIZ(r1)
            X.05et r9 = (X.InterfaceC1406105et) r9
            if (r9 == 0) goto L83
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0Ln6 r0 = new X.0Ln6
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LLILLL = r3
            r7.LLILZIL = r12
            r7.LLILLJJLI = r10
            java.lang.Object r1 = r1.LIZIZ(r9, r0, r7)
            if (r1 != r6) goto L8c
            return r6
        L83:
            r1 = r4
            goto L93
        L85:
            X.05Ou r12 = r7.LLILZIL
            X.01Wf r3 = r7.LLILLL
            X.C155000ia.LIZIZ(r1)
        L8c:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L91
            r1 = r4
        L91:
            java.lang.String r1 = (java.lang.String) r1
        L93:
            java.lang.Object r0 = r11.l2
            X.0LmO r0 = (X.C552940LmO) r0
            r7.LLILLL = r3
            r7.LLILZIL = r4
            r7.LLILLJJLI = r5
            java.lang.Object r1 = X.C553330Ln1.LIZJ(r12, r1, r0, r7)
            if (r1 != r6) goto La9
            return r6
        La4:
            X.01Wf r3 = r7.LLILLL
            X.C155000ia.LIZIZ(r1)
        La9:
            r7.LLILLL = r4
            r7.LLILLJJLI = r8
            java.lang.Object r0 = r3.emit(r1, r7)
            if (r0 != r6) goto L2c
            return r6
        Lb4:
            X.0Ln5 r7 = new X.0Ln5
            r7.<init>(r11, r13)
            goto L12
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS166S0300000_8.emit$5(Y.AgS166S0300000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public AgS166S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
