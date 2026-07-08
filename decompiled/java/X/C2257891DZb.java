package X;

import com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257891DZb {
    public static final C2257891DZb LIZ = new C2257891DZb();

    public static String LIZIZ(String str, boolean z) {
        String strLIZ;
        IIMAnalyticsHelper.LIZ.getClass();
        IIMAnalyticsHelper value = C897210ZHr.LIZIZ.getValue();
        if (value != null && (strLIZ = value.LIZ(str, z)) != null) {
            return strLIZ;
        }
        if (z) {
            return "group";
        }
        return "private";
    }

    public static String LIZJ(boolean z, InterfaceC2257971DZj interfaceC2257971DZj) {
        if (interfaceC2257971DZj instanceof C1619306Vr) {
            return ((C1619306Vr) interfaceC2257971DZj).LIZIZ;
        }
        if (Intrinsics.LJFF(interfaceC2257971DZj, C0Z1B.LIZ)) {
            if (z) {
                return "group_setting";
            }
            return "chat_detail";
        }
        return "chat";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, java.util.Map r8, X.InterfaceC1364105Vn r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1DZZ
            if (r0 == 0) goto L66
            r5 = r9
            X.1DZZ r5 = (X.C1DZZ) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L6c
            java.lang.Object r8 = r5.LL
            java.util.Map r8 = (java.util.Map) r8
            X.C155000ia.LIZIZ(r1)
        L26:
            if (r1 == 0) goto L2d
            java.lang.String r0 = "group_owner_account_type"
            r8.put(r0, r1)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0ZHr r0 = com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper> r2 = X.C897210ZHr.LIZIZ
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper r0 = (com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper) r0
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.LIZIZ(r7)
            if (r1 == 0) goto L53
            int r0 = r1.length()
            if (r0 <= 0) goto L53
            java.lang.String r0 = "group_type"
            r8.put(r0, r1)
        L53:
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper r0 = (com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper) r0
            if (r0 == 0) goto L2d
            r5.LL = r8
            r5.LLILZ = r3
            java.lang.Object r1 = r0.LIZJ(r7, r5)
            if (r1 != r4) goto L26
            return r4
        L66:
            X.1DZZ r5 = new X.1DZZ
            r5.<init>(r6, r9)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LIZLLL(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    public static Map LIZ(String str, boolean z, InterfaceC2257971DZj interfaceC2257971DZj, String str2) {
        return C2097608Jq.LJIIIIZZ(new Pair("conversation_id", str), new Pair("bubble_id", str2), new Pair("enter_from", LIZJ(z, interfaceC2257971DZj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, boolean r9, boolean r10, X.InterfaceC1493105sv r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C2257881DZa
            if (r0 == 0) goto L82
            r5 = r12
            X.1DZa r5 = (X.C2257881DZa) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r6 = 1
            if (r0 == 0) goto L31
            if (r0 != r6) goto L88
            java.lang.Object r1 = r5.LLILLJJLI
            java.util.Map r1 = (java.util.Map) r1
            X.05sv r11 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L28:
            java.lang.String r0 = "ttsocial_chat_bubbles_btn_show"
            r11.sendEvent(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r2)
            r0 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            X.0Z1B r0 = X.C0Z1B.LIZ
            java.lang.String r2 = LIZJ(r9, r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r8)
            r3[r6] = r1
            java.lang.String r2 = LIZIZ(r8, r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "chat_type"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            if (r10 == 0) goto L7f
            java.lang.String r2 = "1"
        L62:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_new_guide"
            r1.<init>(r0, r2)
            r0 = 3
            r3[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIJ(r3)
            if (r9 == 0) goto L28
            r5.LL = r11
            r5.LLILLJJLI = r1
            r5.LLILZIL = r6
            java.lang.Object r0 = r7.LIZLLL(r8, r1, r5)
            if (r0 != r4) goto L28
            return r4
        L7f:
            java.lang.String r2 = "0"
            goto L62
        L82:
            X.1DZa r5 = new X.1DZa
            r5.<init>(r7, r12)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJFF(java.lang.String, boolean, boolean, X.05sv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r8, boolean r9, X.InterfaceC2257971DZj r10, java.lang.String r11, X.InterfaceC1493105sv r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof X.C2257931DZf
            if (r0 == 0) goto L84
            r3 = r13
            X.1DZf r3 = (X.C2257931DZf) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L8a
            java.lang.Object r5 = r3.LLILLJJLI
            java.util.Map r5 = (java.util.Map) r5
            X.05sv r12 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            java.lang.String r0 = "ttsocial_chat_bubble_tab_subtitle_click"
            r12.sendEvent(r0, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            r0 = 3
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
            java.lang.String r5 = LIZJ(r9, r10)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r5)
            r0 = 0
            r6[r0] = r1
            java.lang.String r5 = r10.getEnterMethod()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r5)
            r6[r4] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "tab_name"
            r1.<init>(r0, r11)
            r0 = 2
            r6[r0] = r1
            java.util.Map r5 = X.C2097608Jq.LJIIJ(r6)
            int r0 = r8.length()
            if (r0 <= 0) goto L75
            java.lang.String r0 = "conversation_id"
            r5.put(r0, r8)
            java.lang.String r1 = LIZIZ(r8, r9)
            java.lang.String r0 = "chat_type"
            r5.put(r0, r1)
        L75:
            if (r9 == 0) goto L28
            r3.LL = r12
            r3.LLILLJJLI = r5
            r3.LLILZIL = r4
            java.lang.Object r0 = r7.LIZLLL(r8, r5, r3)
            if (r0 != r2) goto L28
            return r2
        L84:
            X.1DZf r3 = new X.1DZf
            r3.<init>(r7, r13)
            goto L12
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJIIIZ(java.lang.String, boolean, X.1DZj, java.lang.String, X.05sv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1493105sv r8, X.InterfaceC2257971DZj r9, java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12, boolean r13, boolean r14) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C2257951DZh
            if (r0 == 0) goto L94
            r3 = r12
            X.1DZh r3 = (X.C2257951DZh) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L9b
            java.lang.Object r5 = r3.LLILLJJLI
            java.util.Map r5 = (java.util.Map) r5
            X.05sv r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            java.lang.String r0 = "ttsocial_chat_bubble_settings_enter"
            r8.sendEvent(r0, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            r0 = 4
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            java.lang.String r6 = LIZJ(r13, r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r6)
            r0 = 0
            r5[r0] = r1
            java.lang.String r6 = r9.getEnterMethod()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r6)
            r5[r4] = r1
            if (r14 == 0) goto L91
            java.lang.String r6 = "1"
        L56:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_new_guide"
            r1.<init>(r0, r6)
            r0 = 2
            r5[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "default_tab_name"
            r1.<init>(r0, r11)
            r0 = 3
            r5[r0] = r1
            java.util.Map r5 = X.C2097608Jq.LJIIJ(r5)
            int r0 = r10.length()
            if (r0 <= 0) goto L82
            java.lang.String r0 = "conversation_id"
            r5.put(r0, r10)
            java.lang.String r1 = LIZIZ(r10, r13)
            java.lang.String r0 = "chat_type"
            r5.put(r0, r1)
        L82:
            if (r13 == 0) goto L28
            r3.LL = r8
            r3.LLILLJJLI = r5
            r3.LLILZIL = r4
            java.lang.Object r0 = r7.LIZLLL(r10, r5, r3)
            if (r0 != r2) goto L28
            return r2
        L91:
            java.lang.String r6 = "0"
            goto L56
        L94:
            X.1DZh r3 = new X.1DZh
            r3.<init>(r7, r12)
            goto L12
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJI(X.05sv, X.1DZj, java.lang.String, java.lang.String, X.05Vn, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1493105sv r8, X.InterfaceC2257971DZj r9, java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn r12, boolean r13, boolean r14) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C2257961DZi
            if (r0 == 0) goto L95
            r3 = r12
            X.1DZi r3 = (X.C2257961DZi) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L9c
            java.lang.Object r5 = r3.LLILLJJLI
            java.util.Map r5 = (java.util.Map) r5
            X.05sv r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            java.lang.String r0 = "ttsocial_chat_bubble_tab_subtitle_show"
            r8.sendEvent(r0, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            r0 = 4
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
            java.lang.String r5 = LIZJ(r13, r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r5)
            r0 = 0
            r6[r0] = r1
            java.lang.String r5 = r9.getEnterMethod()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r5)
            r6[r4] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "tab_name"
            r1.<init>(r0, r11)
            r0 = 2
            r6[r0] = r1
            if (r14 == 0) goto L92
            java.lang.String r5 = "1"
        L61:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_link"
            r1.<init>(r0, r5)
            r0 = 3
            r6[r0] = r1
            java.util.Map r5 = X.C2097608Jq.LJIIJ(r6)
            int r0 = r10.length()
            if (r0 <= 0) goto L83
            java.lang.String r0 = "conversation_id"
            r5.put(r0, r10)
            java.lang.String r1 = LIZIZ(r10, r13)
            java.lang.String r0 = "chat_type"
            r5.put(r0, r1)
        L83:
            if (r13 == 0) goto L28
            r3.LL = r8
            r3.LLILLJJLI = r5
            r3.LLILZIL = r4
            java.lang.Object r0 = r7.LIZLLL(r10, r5, r3)
            if (r0 != r2) goto L28
            return r2
        L92:
            java.lang.String r5 = "0"
            goto L61
        L95:
            X.1DZi r3 = new X.1DZi
            r3.<init>(r7, r12)
            goto L12
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJIIJ(X.05sv, X.1DZj, java.lang.String, java.lang.String, X.05Vn, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r18, boolean r19, X.InterfaceC2257971DZj r20, boolean r21, java.util.List<java.lang.String> r22, java.util.List<java.lang.String> r23, X.InterfaceC1493105sv r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJII(java.lang.String, boolean, X.1DZj, boolean, java.util.List, java.util.List, X.05sv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r8, boolean r9, X.InterfaceC2257971DZj r10, boolean r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1493105sv r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r7 = this;
            boolean r0 = r15 instanceof X.C2257941DZg
            if (r0 == 0) goto La0
            r3 = r15
            X.1DZg r3 = (X.C2257941DZg) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto La7
            java.lang.Object r5 = r3.LLILLJJLI
            java.util.Map r5 = (java.util.Map) r5
            X.05sv r14 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            java.lang.String r0 = "ttsocial_chat_bubble_tab_switch"
            r14.sendEvent(r0, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            r0 = 5
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            java.lang.String r6 = LIZJ(r9, r10)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r6)
            r0 = 0
            r5[r0] = r1
            java.lang.String r6 = r10.getEnterMethod()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r6)
            r5[r4] = r1
            if (r11 == 0) goto L9c
            java.lang.String r6 = "click"
        L56:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "change_type"
            r1.<init>(r0, r6)
            r0 = 2
            r5[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "tab_name"
            r1.<init>(r0, r12)
            r0 = 3
            r5[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pre_tab_name"
            r1.<init>(r0, r13)
            r0 = 4
            r5[r0] = r1
            java.util.Map r5 = X.C2097608Jq.LJIIJ(r5)
            int r0 = r8.length()
            if (r0 <= 0) goto L8d
            java.lang.String r0 = "conversation_id"
            r5.put(r0, r8)
            java.lang.String r1 = LIZIZ(r8, r9)
            java.lang.String r0 = "chat_type"
            r5.put(r0, r1)
        L8d:
            if (r9 == 0) goto L28
            r3.LL = r14
            r3.LLILLJJLI = r5
            r3.LLILZIL = r4
            java.lang.Object r0 = r7.LIZLLL(r8, r5, r3)
            if (r0 != r2) goto L28
            return r2
        L9c:
            java.lang.String r6 = "slide"
            goto L56
        La0:
            X.1DZg r3 = new X.1DZg
            r3.<init>(r7, r15)
            goto L12
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJIIJJI(java.lang.String, boolean, X.1DZj, boolean, java.lang.String, java.lang.String, X.05sv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r11, boolean r12, X.InterfaceC2257971DZj r13, com.ss.android.ugc.aweme.models.MessageBubbleStyle r14, java.lang.String r15, int r16, boolean r17, X.InterfaceC1493105sv r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJ(java.lang.String, boolean, X.1DZj, com.ss.android.ugc.aweme.models.MessageBubbleStyle, java.lang.String, int, boolean, X.05sv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r10, boolean r11, X.InterfaceC2257971DZj r12, com.ss.android.ugc.aweme.models.MessageBubbleStyle r13, java.lang.String r14, java.lang.String r15, int r16, boolean r17, X.InterfaceC1493105sv r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257891DZb.LJIIIIZZ(java.lang.String, boolean, X.1DZj, com.ss.android.ugc.aweme.models.MessageBubbleStyle, java.lang.String, java.lang.String, int, boolean, X.05sv, X.05Vn):java.lang.Object");
    }
}
