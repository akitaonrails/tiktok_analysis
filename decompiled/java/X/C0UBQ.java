package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEcEffectQueryCategory;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0UBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBQ implements C0UA9 {
    public static WeakReference<InterfaceC767730U9r> LIZJ;
    public static WeakReference<C0UA6> LIZLLL;
    public static final C0UBQ LIZ = new C0UBQ();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(249));
    public static final C0UA0 LJ = new C14E9() { // from class: X.0UA0
        @Override // X.C14E9
        public final void LLZLI(String str) {
        }

        @Override // X.C14E9
        public final void f(List<String> list) {
        }

        @Override // X.C14E9
        public final void LLLLLLLLL(String str, String str2, String str3) {
            InterfaceC767730U9r interfaceC767730U9r;
            WeakReference<InterfaceC767730U9r> weakReference = C0UBQ.LIZJ;
            if (weakReference != null && (interfaceC767730U9r = weakReference.get()) != null) {
                interfaceC767730U9r.LJIILLIIL(str, str2);
            }
        }
    };

    public static InterfaceC769000UEo LJIIJ() {
        return (InterfaceC769000UEo) LIZIZ.getValue();
    }

    @Override // X.InterfaceC1728700v5Q
    public final String LIZ() {
        String str = C0UD4.LIZIZ;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1728700v5Q
    public final boolean LIZLLL(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        C766720U5u c766720U5u = C766720U5u.LIZ;
        Effect effect = liveEffect.LIZJ;
        c766720U5u.getClass();
        return C766720U5u.LJIIZILJ(effect);
    }

    @Override // X.InterfaceC1728700v5Q
    public final LiveEffect LJI(String str) {
        List<LiveEffect> listQr = LJIIJ().qr(str);
        if (listQr != null) {
            return (LiveEffect) C13LP.LJJJLL(listQr);
        }
        return null;
    }

    @Override // X.InterfaceC1728700v5Q
    public final void LJIIIIZZ(LiveEffect liveEffect, final C0UBT c0ubt) {
        C0U45 c0u45 = new C0U45() { // from class: X.0UBS
            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect2) {
                c0ubt.onSuccess();
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect2) {
                c0ubt.onStart();
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect2, ExceptionResult exceptionResult) {
                c0ubt.onFail();
            }

            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect2, int i, long j) {
                c0ubt.LIZ();
            }
        };
        C766720U5u c766720U5u = C766720U5u.LIZ;
        Effect effect = liveEffect.LIZJ;
        c766720U5u.getClass();
        if (C766720U5u.LJIIZILJ(effect)) {
            c0u45.LIZ(liveEffect);
        } else {
            C766720U5u.LJ(liveEffect, (C0U45) C2032107xf.LIZ(c0u45));
        }
    }

    public static final boolean LJIIL(LiveEffect liveEffect, Context context, Long l) {
        String defaultClickUrl;
        String strLIZLLL;
        LiveEffect.CommerceExtra commerceExtra;
        try {
            long jLongValue = 0;
            if (C500260Jjc.LJJIIZ(liveEffect.LJJIL())) {
                C495520Jby c495520Jby = new C495520Jby(liveEffect.LJJIL());
                if (l != null) {
                    jLongValue = l.longValue();
                }
                c495520Jby.LIZIZ(jLongValue, "room_id");
                strLIZLLL = c495520Jby.LIZLLL();
            } else {
                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
                if (stickerSDKExtraLJLJLLL != null && (commerceExtra = stickerSDKExtraLJLJLLL.commerceExtra) != null) {
                    defaultClickUrl = commerceExtra.getDefaultClickUrl();
                } else {
                    defaultClickUrl = null;
                }
                C495520Jby c495520Jby2 = new C495520Jby(defaultClickUrl);
                c495520Jby2.LIZIZ(UserService.getInstance().user().getCurrentUserId(), "author_id");
                if (l != null) {
                    jLongValue = l.longValue();
                }
                c495520Jby2.LIZIZ(jLongValue, "room_id");
                strLIZLLL = c495520Jby2.LIZLLL();
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(strLIZLLL));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("ECBillBroadEffect", e);
            return false;
        }
    }

    @Override // X.InterfaceC1728700v5Q
    public final void LIZJ(String str, String str2, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query sticker effect resourceId=");
        sbLIZ.append(str);
        sbLIZ.append(" categoryId=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModelLIZ), null, null, new C403001hU(stickerEffectViewModelLIZ, str2, function1, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1728700v5Q
    public final void LJIIIZ(String str, String str2, AwS640S0100000_26 awS640S0100000_26) {
        T tNQ2;
        T tNQ22;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query sticker effect templateResourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", photoResourceId=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        C259800zU c259800zU = new C259800zU();
        if (str != null) {
            tNQ2 = stickerEffectViewModelLIZ.NQ2(str);
        } else {
            tNQ2 = 0;
        }
        c259800zU.element = tNQ2;
        C259800zU c259800zU2 = new C259800zU();
        if (str2 != null) {
            tNQ22 = stickerEffectViewModelLIZ.NQ2(str2);
        } else {
            tNQ22 = 0;
        }
        c259800zU2.element = tNQ22;
        if (c259800zU.element == 0 && tNQ22 == 0) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModelLIZ), null, null, new C403401hY(stickerEffectViewModelLIZ, c259800zU, c259800zU2, awS640S0100000_26, str, str2, null), 3);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("from cache, query sticker effect resule: templateTarget: ");
        sbLIZ2.append(c259800zU.element);
        sbLIZ2.append(", photoTarget: ");
        sbLIZ2.append(c259800zU2.element);
        C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ2));
        LiveEffect liveEffect = (LiveEffect) c259800zU.element;
        if (liveEffect != null) {
            liveEffect.LLJLIL(LiveEcEffectQueryCategory.getValue());
        }
        LiveEffect liveEffect2 = (LiveEffect) c259800zU2.element;
        if (liveEffect2 != null) {
            liveEffect2.LJIIJJI(LiveEcEffectQueryCategory.getValue());
        }
        awS640S0100000_26.invoke(c259800zU.element, c259800zU2.element);
    }

    public static final boolean LJIIJJI(LiveEffect liveEffect, Context context, String str, Long l) {
        String strLIZLLL;
        LiveEffect.CommerceExtra commerceExtra;
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
        String defaultClickUrl = null;
        if (stickerSDKExtraLJLJLLL != null && stickerSDKExtraLJLJLLL.commerceExtra != null) {
            try {
                new p();
                if (p.LIZJ(str).LJIILIIL().LJJIIZ("resourceId").LJIL().equals(liveEffect.getResourceId())) {
                    long jLongValue = 0;
                    if (C500260Jjc.LJJIIZ(liveEffect.LJJIL())) {
                        C495520Jby c495520Jby = new C495520Jby(liveEffect.LJJIL());
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        c495520Jby.LIZIZ(jLongValue, "room_id");
                        strLIZLLL = c495520Jby.LIZLLL();
                    } else {
                        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = liveEffect.LJLJLLL();
                        if (stickerSDKExtraLJLJLLL2 != null && (commerceExtra = stickerSDKExtraLJLJLLL2.commerceExtra) != null) {
                            defaultClickUrl = commerceExtra.getDefaultClickUrl();
                        }
                        C495520Jby c495520Jby2 = new C495520Jby(defaultClickUrl);
                        c495520Jby2.LIZIZ(UserService.getInstance().user().getCurrentUserId(), "author_id");
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        c495520Jby2.LIZIZ(jLongValue, "room_id");
                        strLIZLLL = c495520Jby2.LIZLLL();
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(strLIZLLL));
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("ECBillBroadEffect", e);
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1728700v5Q
    public final Object LJFF(String str, String str2, String str3, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn) {
        return C0U8T.LIZ.LJIIL(str2, str, str3, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r4
      0x0049: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:9:0x0047, B:7:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r4
      0x004f: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:9:0x0047, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1728700v5Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r12, com.bytedance.android.livesdkapi.depend.model.LiveEffect r13, java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17) {
        /*
            r11 = this;
            r9 = r17
            r8 = r14
            r6 = r15
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setEffectAutoRestore "
            r1.append(r0)
            r7 = r12
            r1.append(r7)
            r0 = 32
            r1.append(r0)
            r1.append(r13)
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r3 = r16
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveEcEffectHelper"
            X.C20441214yg.LIZIZ(r0, r1)
            X.14i1<com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig> r2 = X.InterfaceC766480U4w.LJJIZ
            java.lang.Object r0 = r2.LIZIZ()
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r0 = (com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig) r0
            if (r3 == 0) goto L69
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r3 = new com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig
            java.lang.String r10 = ""
            if (r13 == 0) goto L46
            java.lang.String r4 = r13.getResourceId()
            if (r4 != 0) goto L49
        L46:
            r4 = r10
            if (r13 == 0) goto L4f
        L49:
            java.lang.String r5 = r13.LJLL()
            if (r5 != 0) goto L50
        L4f:
            r5 = r10
        L50:
            if (r6 != 0) goto L53
            r6 = r10
        L53:
            if (r8 != 0) goto L56
            r8 = r10
        L56:
            if (r9 != 0) goto L59
            r9 = r10
        L59:
            if (r13 == 0) goto L62
            java.lang.String r0 = r13.LLJI()
            if (r0 == 0) goto L62
            r10 = r0
        L62:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.LJFF(r3)
        L68:
            return
        L69:
            java.lang.String r1 = r0.resourceId
            if (r13 == 0) goto L88
            java.lang.String r0 = r13.getResourceId()
        L71:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L68
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r3 = new com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig
            java.lang.String r4 = ""
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.LJFF(r3)
            return
        L88:
            r0 = 0
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UBQ.LIZIZ(java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (((com.bytedance.android.livesdkapi.host.IHostCreativeTool) X.C1161920gLG.LIZJ(com.bytedance.android.livesdkapi.host.IHostCreativeTool.class)).isGalleryModuleInitialized() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    @Override // X.InterfaceC1728700v5Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(java.lang.String r14, com.bytedance.android.livesdkapi.depend.model.LiveEffect r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UBQ.LJII(java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    @Override // X.InterfaceC1728700v5Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.bytedance.android.livesdkapi.depend.model.LiveEffect r19, java.lang.String r20, boolean r21, java.lang.String r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UBQ.LJ(java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
