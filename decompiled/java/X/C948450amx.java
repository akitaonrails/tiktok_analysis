package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLinkInjectorFallbackSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLinkInjectorScopeOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0amx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948450amx extends C948480an0 {
    public static final C948450amx LIZIZ = new C948450amx();

    public static Long LJIIJ() {
        if (C500260Jjc.LJJIL()) {
            return 0L;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return Long.valueOf(room.getId());
        }
        return null;
    }

    @Override // X.C948480an0
    public final int LJII() {
        if (!LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            return super.LJII();
        }
        Long lLJIIJ = LJIIJ();
        if (lLJIIJ == null) {
            C20441214yg.LIZIZ("LinkInjector", "size failed, roomId is null");
            return 0;
        }
        C948460amy c948460amyLIZ = C948470amz.LIZ(Long.valueOf(lLJIIJ.longValue()));
        if (c948460amyLIZ != null) {
            return c948460amyLIZ.LJII();
        }
        return 0;
    }

    @Override // X.C948480an0
    public final void LIZJ(Object obj) throws Exception {
        C948460amy c948460amyLIZ;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null) {
                try {
                    c948460amyLIZ.LIZJ(obj);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (LinkMicLinkInjectorFallbackSetting.isEnable()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("scopedInjector inject ");
                        sbLIZ.append(obj);
                        sbLIZ.append(" in scope ");
                        sbLIZ.append(lLJIIJ);
                        sbLIZ.append(" failed, try fallback to global. error: ");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        throw e;
                    }
                }
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scopedInjector inject ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" failed, roomId or scopeInjector is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("scopedInjector inject ");
        sbLIZ3.append(obj);
        sbLIZ3.append(" failed, roomId or scopeInjector is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ3));
        super.LIZJ(obj);
    }

    @Override // X.C948480an0
    public final void LIZLLL(Object obj) throws IllegalAccessException {
        C948460amy c948460amyLIZ;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null) {
                c948460amyLIZ.LIZLLL(obj);
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ScopedInjector lazyInject ");
                sbLIZ.append(obj);
                sbLIZ.append(" failed, roomId or scopeInjector is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ScopedInjector lazyInject ");
        sbLIZ2.append(obj);
        sbLIZ2.append(" failed, roomId or scopeInjector is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
        super.LIZLLL(obj);
    }

    @Override // X.C948480an0
    public final void LJI(String str) {
        Long lLJIIJ;
        C948460amy c948460amyLIZ;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable() && (lLJIIJ = LJIIJ()) != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null) {
            c948460amyLIZ.LJI(str);
        }
        super.LJI(str);
    }

    public final Object LJIIIZ(String str) {
        C948460amy c948460amyLIZ;
        Object obj;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null && (obj = c948460amyLIZ.LIZIZ().get(str)) != null) {
                return obj;
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scopedInjector get ");
                sbLIZ.append(str);
                sbLIZ.append(" failed, roomId or scopeInjector is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scopedInjector get ");
        sbLIZ2.append(str);
        sbLIZ2.append(" failed, roomId or scopeInjector is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
        return LIZIZ().get(str);
    }

    public final <T> T LJIIJJI(String str) {
        C948460amy c948460amyLIZ;
        T t;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null && (t = (T) c948460amyLIZ.LIZIZ().get(str)) != null) {
                return t;
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scopedInjector getInstance ");
                sbLIZ.append(str);
                sbLIZ.append(" failed, roomId or scopeInjector is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scopedInjector getInstance ");
        sbLIZ2.append(str);
        sbLIZ2.append(" failed, roomId or scopeInjector is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
        T t2 = (T) LIZIZ().get(str);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @Override // X.C948480an0
    public final void LIZ(Long l, String str) {
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            if (l != null) {
                l.longValue();
                C948460amy c948460amyRemove = C948460amy.LIZIZ.remove(l);
                if (c948460amyRemove != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scope removed: ");
                    sbLIZ.append(l);
                    c948460amyRemove.LIZ(l, C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Scope removed and cleaned: ");
                    sbLIZ2.append(l);
                    C20441214yg.LJIIIZ("ScopedInjector", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("scopedInjector cleanup ");
                sbLIZ3.append(str);
                sbLIZ3.append(" failed, roomId is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        super.LIZ(l, str);
    }

    @Override // X.C948480an0
    public final void LJFF(Object obj, String str) {
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null) {
                C948460amy c948460amyLIZ = C948470amz.LIZ(lLJIIJ);
                if (c948460amyLIZ == null) {
                    lLJIIJ.longValue();
                    lLJIIJ.longValue();
                    c948460amyLIZ = new C948460amy();
                    C948460amy.LIZIZ.put(lLJIIJ, c948460amyLIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scope created: ");
                    sbLIZ.append(lLJIIJ);
                    C20441214yg.LJIIIZ("ScopedInjector", C2188811AlT.LIZIZ(sbLIZ));
                }
                c948460amyLIZ.LJFF(obj, str);
                return;
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scopeInjector provide ");
                sbLIZ2.append(str);
                sbLIZ2.append(" failed, roomId is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("scopeInjector provide ");
        sbLIZ3.append(str);
        sbLIZ3.append(" failed, roomId is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ3));
        super.LJFF(obj, str);
    }

    public final void LJIIIIZZ(HashSet<String> hashSet, Long l) {
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            if (l != null) {
                C948460amy c948460amyLIZ = C948470amz.LIZ(l);
                if (c948460amyLIZ != null) {
                    c948460amyLIZ.LIZIZ().keySet().retainAll(hashSet);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scopedInjector cleanupByFilter ");
                sbLIZ.append(hashSet);
                sbLIZ.append(" failed, roomId is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LIZIZ().keySet().retainAll(hashSet);
    }

    public final <T> void LJIIL(C304201Fw<T> c304201Fw, String str) {
        C948460amy c948460amyLIZ;
        T t = null;
        if (LinkMicLinkInjectorScopeOptimizeSetting.isEnable()) {
            Long lLJIIJ = LJIIJ();
            if (lLJIIJ != null && (c948460amyLIZ = C948470amz.LIZ(lLJIIJ)) != null && c948460amyLIZ.LIZIZ().get(str) != null) {
                Object obj = c948460amyLIZ.LIZIZ().get(str);
                if (obj != null) {
                    t = (T) obj;
                }
                c304201Fw.LIZIZ = t;
                return;
            }
            if (!LinkMicLinkInjectorFallbackSetting.isEnable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scopedInjector singleLazyInject ");
                sbLIZ.append(str);
                sbLIZ.append(" failed, roomId or scopeInjector is null");
                C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scopedInjector singleLazyInject ");
        sbLIZ2.append(str);
        sbLIZ2.append(" failed, roomId or scopeInjector is null, so fallback to global");
        C20441214yg.LIZIZ("LinkInjector", C2188811AlT.LIZIZ(sbLIZ2));
        Object obj2 = LIZIZ().get(str);
        if (obj2 != null) {
            t = (T) obj2;
        }
        c304201Fw.LIZIZ = t;
    }
}
