package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDM {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC1635390sev LIZ;
    public final C0FGR LIZIZ;

    public static String LJIIIIZZ(String str) {
        if (Intrinsics.LJFF(str, "tiktok_ep_caption_template")) {
            return "caption_template_list_download";
        }
        return null;
    }

    public C0FDM(InterfaceC1635390sev interfaceC1635390sev, C0FGR c0fgr) {
        this.LIZ = interfaceC1635390sev;
        this.LIZIZ = c0fgr;
    }

    public static String LJIIIZ(CaptionTemplateData captionTemplateData, String str) {
        if (Intrinsics.LJFF(str, captionTemplateData.fontId)) {
            return "caption_template_font";
        }
        if (Intrinsics.LJFF(str, captionTemplateData.styleId)) {
            return "caption_template_style";
        }
        if (Intrinsics.LJFF(str, captionTemplateData.textAnimId)) {
            return "caption_template_animation";
        }
        if (Intrinsics.LJFF(str, captionTemplateData.captionAnimId)) {
            return "caption_template_caption_animation";
        }
        return "caption_template";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r8, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0FDR
            if (r0 == 0) goto L59
            r6 = r9
            X.0FDR r6 = (X.C0FDR) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L5f
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            r6.LL = r8
            r6.LLILZ = r0
            X.099m r4 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r4.<init>(r0)
            X.0sev r3 = r7.LIZ
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            X.0FX9 r1 = new X.0FX9
            r0 = 1
            r1.<init>(r4, r0)
            r3.og(r2, r1)
            java.lang.Object r2 = r4.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L56
            X.C099Q.LIZJ(r6)
        L56:
            if (r2 != r5) goto L22
            return r5
        L59:
            X.0FDR r6 = new X.0FDR
            r6.<init>(r7, r9)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData r6, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends kotlin.Pair<java.lang.String, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0FDQ
            if (r0 == 0) goto L3b
            r4 = r8
            X.0FDQ r4 = (X.C0FDQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0FCG r1 = new X.0FCG
            r0 = 0
            r1.<init>(r6, r7, r5, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L3b:
            X.0FDQ r4 = new X.0FDQ
            r4.<init>(r5, r8)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LIZ(com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r6, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0FDP
            if (r0 == 0) goto L56
            r4 = r8
            X.0FDP r4 = (X.C0FDP) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L5c
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            r4.getClass()
            r4.LL = r7
            r4.LLILZ = r0
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r0)
            X.0sev r1 = r5.LIZ
            X.0FCL r0 = new X.0FCL
            r0.<init>()
            r1.LJIIL(r6, r0)
            java.lang.Object r2 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L53
            X.C099Q.LIZJ(r4)
        L53:
            if (r2 != r3) goto L22
            return r3
        L56:
            X.0FDP r4 = new X.0FDP
            r4.<init>(r5, r8)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, boolean r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0FDT
            if (r0 == 0) goto L35
            r4 = r8
            X.0FDT r4 = (X.C0FDT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3b
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r0 = r5.LJII(r6, r0, r7, r4)
            if (r0 != r2) goto L28
            return r2
        L35:
            X.0FDT r4 = new X.0FDT
            r4.<init>(r5, r8)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LJFF(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, boolean r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0FDU
            if (r0 == 0) goto L36
            r4 = r8
            X.0FDU r4 = (X.C0FDU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3c
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            r0 = 0
            java.lang.Object r0 = r5.LJII(r6, r0, r7, r4)
            if (r0 != r2) goto L28
            return r2
        L36:
            X.0FDU r4 = new X.0FDU
            r4.<init>(r5, r8)
            goto L12
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LJI(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(final java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn r11, final X.InterfaceC1631620sYq r12) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0FDO
            if (r0 == 0) goto La5
            r4 = r11
            X.0FDO r4 = (X.C0FDO) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r1 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r7 = 1
            if (r0 == 0) goto L29
            if (r0 != r7) goto Lac
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            r4.LL = r9
            r4.LLILLJJLI = r10
            r4.LLILLL = r12
            r4.LLILZLL = r7
            X.1DEt r6 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r6.<init>(r7, r0)
            r6.LJIJJ()
            if (r10 != 0) goto L44
            java.lang.String r10 = "editor_pro_font_panel"
        L44:
            int r0 = r10.length()
            if (r0 == 0) goto L82
            int r0 = r9.length()
            if (r0 == 0) goto L82
            X.0sev r3 = r8.LIZ
            java.util.List r2 = java.util.Collections.singletonList(r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "panel"
            r1.<init>(r0, r10)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r1)
            X.05cM r0 = new X.05cM
            r0.<init>()
            r3.LJJIJIIJI(r2, r7, r1, r0)
            r0 = 455(0x1c7, float:6.38E-43)
            kotlin.jvm.internal.AFwS234S0000000_5 r0 = kotlin.jvm.internal.AFwS234S0000000_5.get$arr$(r0)
            r6.LJJII(r0)
        L72:
            java.lang.Object r1 = r6.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L7f
            X.C099Q.LIZJ(r4)
        L7f:
            if (r1 != r5) goto L22
            return r5
        L82:
            java.lang.String r2 = "panel or res id error"
            if (r12 == 0) goto L8d
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            r12.invoke(r9, r0, r2)
        L8d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r2)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C189200o6.m2constructorimpl(r0)
            r6.resumeWith(r0)
            goto L72
        La5:
            X.0FDO r4 = new X.0FDO
            r4.<init>(r8, r11)
            goto L12
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LJ(java.lang.String, java.lang.String, X.05Vn, X.0sYq):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(final java.lang.String r13, final boolean r14, boolean r15, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse>> r16) {
        /*
            r12 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C0FDS
            r7 = r12
            if (r0 == 0) goto La7
            r0 = r4
            X.0FDS r0 = (X.C0FDS) r0
            int r3 = r0.LLILZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto La7
            int r3 = r3 - r2
            r0.LLILZ = r3
        L15:
            java.lang.Object r4 = r0.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r0.LLILZ
            r2 = 1
            if (r3 == 0) goto L2c
            if (r3 != r2) goto Lae
            X.C155000ia.LIZIZ(r4)
        L25:
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            r8 = r13
            r0.LL = r8
            r0.LLILZ = r2
            X.099m r11 = new X.099m
            X.05Vn r2 = X.C099M.LIZLLL(r0)
            r11.<init>(r2)
            long r9 = java.lang.System.currentTimeMillis()
            X.0sev r3 = r7.LIZ     // Catch: java.lang.Throwable -> L57
            if (r15 == 0) goto L47
            r2 = 1
            goto L48
        L47:
            r2 = 0
        L48:
            X.0FCM r5 = new X.0FCM     // Catch: java.lang.Throwable -> L57
            r6 = r14
            r5.<init>()     // Catch: java.lang.Throwable -> L59
            r3.LJI(r8, r2, r5)     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L59
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L59
            goto L65
        L57:
            r3 = move-exception
            goto L5a
        L59:
            r3 = move-exception
        L5a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r3)
            X.C189200o6.m2constructorimpl(r2)
        L65:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r2 == 0) goto L97
            X.0FGR r3 = r7.LIZIZ
            if (r3 == 0) goto L85
            java.lang.String r8 = LJIIIIZZ(r8)
            r4 = 1
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r9
            r10 = 0
            java.lang.Integer r7 = X.C2286608xc.LJ(r4)
            java.lang.String r9 = r2.getMessage()
            r3.LJIJI(r4, r5, r7, r8, r9, r10)
        L85:
            X.00Yq r3 = new X.00Yq
            r3.<init>(r2)
            X.C189200o6.m2constructorimpl(r3)
            X.00o6 r2 = X.C189200o6.m1boximpl(r3)
            X.C189200o6.m2constructorimpl(r2)
            r11.resumeWith(r2)
        L97:
            java.lang.Object r4 = r11.LIZ()
            java.lang.Object r2 = X.C099R.LJFF()
            if (r4 != r2) goto La4
            X.C099Q.LIZJ(r0)
        La4:
            if (r4 != r1) goto L25
            return r1
        La7:
            X.0FDS r0 = new X.0FDS
            r0.<init>(r7, r4)
            goto L15
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LJII(java.lang.String, boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(final com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData r17, final java.lang.String r18, final X.C2642010m r19, final kotlin.jvm.internal.AwS53S0200100_5 r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDM.LIZJ(com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData, java.lang.String, X.010m, kotlin.jvm.internal.AwS53S0200100_5, X.05Vn):java.lang.Object");
    }
}
