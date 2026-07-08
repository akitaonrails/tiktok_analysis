package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import tikcast.api.anchor_tool.EffectListResponse;

/* JADX INFO: renamed from: X.0U8I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U8I extends C0U5H implements InterfaceC510701yr {
    public final String LIZJ;
    public final boolean LIZLLL;
    public final C0UMC LJ = new C0UMC();
    public final CopyOnWriteArrayList<C0U74<LiveEffect>> LJFF = new CopyOnWriteArrayList<>();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(517));

    @Override // X.InterfaceC510701yr
    public final Object LIZLLL() {
        C770170UJb.LIZJ("SmallItemBeauty");
        C770170UJb.LIZLLL = "";
        List<C0U74<LiveEffect>> listLJIILLIIL = LJIILLIIL(this.LJ.LJIIJ(this.LIZJ).LIZIZ);
        new C766700U5s(this.LIZLLL).LJIIIZ(listLJIILLIIL);
        if (!((ArrayList) listLJIILLIIL).isEmpty()) {
            C20441214yg.LIZIZ("EffectMonitor#restore", "modify memory cache3");
            this.LJFF.clear();
            this.LJFF.addAll(listLJIILLIIL);
        }
        return listLJIILLIIL;
    }

    @Override // X.InterfaceC510701yr
    public final List<String> LJFF() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0U74<LiveEffect>> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZJ);
        }
        return arrayList;
    }

    @Override // X.InterfaceC510701yr
    public final List<C0U74<LiveEffect>> LIZJ() {
        return this.LJFF;
    }

    public static C0X76 LJIJ(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        C842540X3k c842540X3kLIZLLL = AbstractC842530X3j.LIZLLL(C0X0P.LIZJ("image/png"), byteArrayOutputStream.toByteArray());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("boar_preview.png");
        sbLIZ.append(System.currentTimeMillis());
        return C0X76.LIZIZ("file", C2188811AlT.LIZIZ(sbLIZ), c842540X3kLIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // X.InterfaceC510701yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0U8M
            if (r0 == 0) goto L7c
            r6 = r8
            X.0U8M r6 = (X.C0U8M) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            java.lang.String r4 = "SmallItemBeauty"
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L44
            if (r0 != r2) goto L82
            X.C155000ia.LIZIZ(r1)
        L25:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L3b
            X.C770170UJb.LIZJ(r4)
            java.lang.String r0 = "small beauty need update effect"
            X.C770170UJb.LIZIZ(r0)
            r3 = 1
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3b:
            X.C770170UJb.LIZJ(r4)
            java.lang.String r0 = "small beauty no need update effect"
            X.C770170UJb.LIZIZ(r0)
            goto L36
        L44:
            X.C155000ia.LIZIZ(r1)
            X.C497740JfY.LJII()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L51
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L51
            goto L56
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L56:
            if (r0 != 0) goto L6f
            X.C770170UJb.LIZJ(r4)
            java.lang.String r1 = "effect_log"
            java.lang.String r0 = "try to check need update small beauty."
            java.lang.String r0 = X.C770170UJb.LIZ(r0)
            X.C20441214yg.LIZIZ(r1, r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L6f:
            X.0UMC r1 = r7.LJ
            java.lang.String r0 = r7.LIZJ
            r6.LLILLL = r2
            java.lang.Object r1 = r1.LJFF(r0, r6)
            if (r1 != r5) goto L25
            return r5
        L7c:
            X.0U8M r6 = new X.0U8M
            r6.<init>(r7, r8)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8I.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC510701yr
    public final Object LIZIZ(InterfaceC1364105Vn<? super List<C0U74<LiveEffect>>> interfaceC1364105Vn) {
        return LJIIZILJ(interfaceC1364105Vn);
    }

    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        return new C0U8J(this.LIZLLL).LJI(effectChannelResponse);
    }

    @Override // X.InterfaceC510701yr
    public final Unit LJII(List list) {
        List<LiveEffect> listLL;
        C766700U5s c766700U5s = new C766700U5s(this.LIZLLL);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiveEffect liveEffect = (LiveEffect) it2.next();
            c766700U5s.LIZ(liveEffect, false);
            if (C0U7C.LJIILJJIL(liveEffect) && (listLL = liveEffect.LL()) != null) {
                Iterator<LiveEffect> it3 = listLL.iterator();
                while (it3.hasNext()) {
                    c766700U5s.LIZ(it3.next(), false);
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC510701yr
    public final LiveEffect LJIIJ(long j) {
        LiveEffect liveEffect;
        List<LiveEffect> list;
        Iterator<C0U74<LiveEffect>> it2 = this.LJFF.iterator();
        while (true) {
            liveEffect = null;
            if (!it2.hasNext()) {
                break;
            }
            C0U74<LiveEffect> next = it2.next();
            if (next != null && (list = next.LIZIZ) != null) {
                Iterator<LiveEffect> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    LiveEffect next2 = it3.next();
                    if (next2.getEffectId() == j) {
                        liveEffect = next2;
                        break;
                    }
                }
                liveEffect = liveEffect;
                if (liveEffect != null) {
                    break;
                }
            }
        }
        return liveEffect;
    }

    @Override // X.InterfaceC510701yr
    public final void LJIIJJI(LiveEffect liveEffect) {
        new C766700U5s(this.LIZLLL).LIZ(liveEffect, true);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> LJIILLIIL(tikcast.api.anchor_tool.EffectListResponse.Data r22) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8I.LJIILLIIL(tikcast.api.anchor_tool.EffectListResponse$Data):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.InterfaceC1364105Vn<? super java.util.List<X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C0U8K
            if (r0 == 0) goto L81
            r8 = r10
            X.0U8K r8 = (X.C0U8K) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r7 = r8.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r5 = 1
            if (r0 == 0) goto L5d
            if (r0 != r5) goto L8c
            long r3 = r8.LLILLJJLI
            X.0U8I r6 = r8.LL
            X.C155000ia.LIZIZ(r7)
        L26:
            X.0UMl r7 = (X.C771050UMl) r7
            r6.getClass()
            T r0 = r7.LIZIZ
            tikcast.api.anchor_tool.EffectListResponse$Data r0 = (tikcast.api.anchor_tool.EffectListResponse.Data) r0
            java.util.List r2 = r6.LJIILLIIL(r0)
            X.0U5s r1 = new X.0U5s
            boolean r0 = r6.LIZLLL
            r1.<init>(r0)
            r1.LJIIIZ(r2)
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L87
            java.lang.String r1 = "EffectMonitor#restore"
            java.lang.String r0 = "modify memory cache2"
            X.C20441214yg.LIZIZ(r1, r0)
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r6.LJFF
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r6.LJFF
            r0.addAll(r2)
            r6.LJIJI(r3, r5, r7)
            return r2
        L5d:
            X.C155000ia.LIZIZ(r7)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "SmallItemBeauty"
            X.C770170UJb.LIZJ(r0)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            X.0UMC r2 = r9.LJ
            java.lang.String r1 = r9.LIZJ
            r8.LL = r9
            r8.LLILLJJLI = r3
            r8.LLILZIL = r5
            r0 = 0
            java.lang.Object r7 = r2.LJIIIZ(r1, r0, r8)
            if (r7 != r6) goto L7f
            return r6
        L7f:
            r6 = r9
            goto L26
        L81:
            X.0U8K r8 = new X.0U8K
            r8.<init>(r9, r10)
            goto L12
        L87:
            r0 = 0
            r6.LJIJI(r3, r0, r7)
            return r2
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8I.LJIIZILJ(X.05Vn):java.lang.Object");
    }

    public C0U8I(String str, boolean z) {
        this.LIZJ = str;
        this.LIZLLL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC510701yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.graphics.Bitmap r6, X.InterfaceC1364105Vn<? super com.bytedance.android.live.base.model.user.CoverImageModel> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0U8L
            if (r0 == 0) goto L20
            r4 = r7
            X.0U8L r4 = (X.C0U8L) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L46
        L20:
            X.0U8L r4 = new X.0U8L
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            java.lang.Object r1 = X.C482260Ivg.LIZJ(r0)     // Catch: java.lang.Throwable -> L53
            com.bytedance.android.live.effect.api.EffectRelatedApi r1 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r1     // Catch: java.lang.Throwable -> L53
            X.0X76 r0 = LJIJ(r6)     // Catch: java.lang.Throwable -> L53
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.uploadImage(r0, r4)     // Catch: java.lang.Throwable -> L53
            if (r1 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L53
        L49:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L53
            T r1 = r1.data     // Catch: java.lang.Throwable -> L53
            com.bytedance.android.live.base.model.user.CoverImageModel r1 = (com.bytedance.android.live.base.model.user.CoverImageModel) r1     // Catch: java.lang.Throwable -> L53
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L53
            goto L5f
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5f:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L6f
            java.lang.String r1 = "AIBeauty"
            java.lang.String r0 = r0.getMessage()
            X.C20441214yg.LIZIZ(r1, r0)
            r1 = 0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8I.LJ(android.graphics.Bitmap, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(long j, boolean z, C771050UMl<Throwable, EffectListResponse.Data> c771050UMl) {
        String str = "done";
        if (this.LIZLLL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_panel_download");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
            if (!z) {
                str = "failed";
            }
            c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LJJII(Integer.valueOf(c771050UMl.LIZ()), "error_code");
            c474500IjALIZ.LJJII(c771050UMl.LIZIZ(), "error_description");
            c474500IjALIZ.LIZ();
            return;
        }
        C0UD7 c0ud7 = C0UD7.LIZ;
        int iLIZ = c771050UMl.LIZ();
        String strLIZIZ = c771050UMl.LIZIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_guest_connection_beauty_panel_download");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        if (!z) {
            str = "failed";
        }
        c474500IjALIZ2.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ2.LJJII(Integer.valueOf(iLIZ), "error_code");
        c474500IjALIZ2.LJJII(strLIZIZ, "error_description");
        c474500IjALIZ2.LJJIIZI(C0UD7.LJIIJJI);
        c474500IjALIZ2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.InterfaceC510701yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super X.C771050UMl<? extends java.lang.Throwable, ? extends webcast.api.anchor_tool.EffectBeautySuggestionResponse.ResponseData>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C0U8N
            if (r0 == 0) goto L21
            r9 = r15
            X.0U8N r9 = (X.C0U8N) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r4 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L47
        L21:
            X.0U8N r9 = new X.0U8N
            r9.<init>(r10, r15)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            java.lang.Object r4 = X.C482260Ivg.LIZJ(r0)     // Catch: java.lang.Throwable -> L57
            com.bytedance.android.live.effect.api.EffectRelatedApi r4 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r4     // Catch: java.lang.Throwable -> L57
            r9.LLILLL = r1     // Catch: java.lang.Throwable -> L57
            r8 = r14
            r7 = r13
            r6 = r12
            r5 = r11
            java.lang.Object r4 = r4.fetchAIBeauty(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L57
            if (r4 != r2) goto L4a
            return r2
        L47:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L57
        L4a:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Throwable -> L57
            T r0 = r4.data     // Catch: java.lang.Throwable -> L57
            X.0UMl r1 = new X.0UMl     // Catch: java.lang.Throwable -> L57
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L57
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L57
            goto L63
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L63:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r2 == 0) goto L77
            java.lang.String r1 = "AIBeauty#netErr"
            java.lang.String r0 = r2.getMessage()
            X.C20441214yg.LIZIZ(r1, r0)
            X.0UMl r1 = new X.0UMl
            r1.<init>(r2, r3)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8I.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
