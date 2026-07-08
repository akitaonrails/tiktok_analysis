package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ino, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl$preloadFriendInteractionSettings$1", f = "FriendInteractionSettingsServiceImpl.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1256500ino extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FriendInteractionSettingsServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256500ino(FriendInteractionSettingsServiceImpl friendInteractionSettingsServiceImpl, InterfaceC1364105Vn<? super C1256500ino> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = friendInteractionSettingsServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1256500ino(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:19:0x004e, B:20:0x0051, B:21:0x0053, B:23:0x005a, B:25:0x005e, B:26:0x0079, B:28:0x0090, B:29:0x0094, B:9:0x001c, B:11:0x002a, B:14:0x003d, B:15:0x0040), top: B:34:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: Exception -> 0x009c, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:19:0x004e, B:20:0x0051, B:21:0x0053, B:23:0x005a, B:25:0x005e, B:26:0x0079, B:28:0x0090, B:29:0x0094, B:9:0x001c, B:11:0x002a, B:14:0x003d, B:15:0x0040), top: B:34:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FriendInteractionSettingsServiceImpl@8bc9.preloadFriendInteractionSettings$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            goto L4e
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r7)
            X.01GW r0 = X.C292880Bdu.LIZ     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L9c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto L40
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L9c
            java.lang.Class<com.ss.android.ugc.aweme.story.note.prompt.SocialConfigValue> r2 = com.ss.android.ugc.aweme.story.note.prompt.SocialConfigValue.class
            com.ss.android.ugc.aweme.story.note.prompt.SocialConfigValue r1 = X.C1256510inp.LIZ     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "social_config"
            java.lang.Object r0 = r4.LJIIIIZZ(r0, r2, r1)     // Catch: java.lang.Exception -> L9c
            com.ss.android.ugc.aweme.story.note.prompt.SocialConfigValue r0 = (com.ss.android.ugc.aweme.story.note.prompt.SocialConfigValue) r0     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto L3d
            r1 = r0
        L3d:
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettings r7 = r1.thoughtsConfig     // Catch: java.lang.Exception -> L9c
            goto L53
        L40:
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl r0 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L9c
            r6.LL = r3     // Catch: java.lang.Exception -> L9c
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettings r7 = com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl.LJII(r0)     // Catch: java.lang.Exception -> L9c
            if (r7 != r1) goto L51
            X.C1C7U.LIZIZ(r5)
            return r1
        L4e:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L9c
        L51:
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettings r7 = (com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettings) r7     // Catch: java.lang.Exception -> L9c
        L53:
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl r1 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L9c
            r1.getClass()     // Catch: java.lang.Exception -> L9c
            if (r7 == 0) goto L79
            int r0 = r7.status_code     // Catch: java.lang.Exception -> L9c
            if (r0 != 0) goto L79
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C05N6.LIZ()     // Catch: java.lang.Exception -> L9c
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r7)     // Catch: java.lang.Exception -> L9c
            X.01GW r0 = r1.LIZIZ     // Catch: java.lang.Exception -> L9c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L9c
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl.LJI()     // Catch: java.lang.Exception -> L9c
            r1.storeString(r0, r2)     // Catch: java.lang.Exception -> L9c
        L79:
            com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl r0 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L9c
            r0.LIZJ = r3     // Catch: java.lang.Exception -> L9c
            X.0inl r0 = X.C1256470inl.LL     // Catch: java.lang.Exception -> L9c
            r0.getClass()     // Catch: java.lang.Exception -> L9c
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Exception -> L9c
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L9c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto L94
            X.C1256470inl.LIZIZ()     // Catch: java.lang.Exception -> L9c
            goto La0
        L94:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = X.C1256470inl.LLILZ     // Catch: java.lang.Exception -> L9c
            X.0inm r0 = new java.lang.Runnable() { // from class: X.0inm
                static {
                    /*
                        X.0inm r0 = new X.0inm
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0inm) X.0inm.LL X.0inm
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1256480inm.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1256480inm.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.String r2 = "StoryThoughtPromptHelper@8051.refreshPrompt$1"
                        X.C1C7U.LIZ(r2)
                        X.0inl r0 = X.C1256470inl.LL     // Catch: java.lang.Throwable -> Le
                        r0.getClass()     // Catch: java.lang.Throwable -> Le
                        X.C1256470inl.LIZIZ()     // Catch: java.lang.Throwable -> Le
                        goto L19
                    Le:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        boolean r0 = X.C2179971ATj.LIZ(r1)
                        if (r0 != 0) goto L19
                        throw r1
                    L19:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1256480inm.run():void");
                }
            }     // Catch: java.lang.Exception -> L9c
            X.C786410Ut5.LJJZZIII(r1, r0)     // Catch: java.lang.Exception -> L9c
            goto La0
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1256500ino.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
