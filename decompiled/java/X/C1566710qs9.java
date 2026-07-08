package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qs9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566710qs9 extends AbstractC1566470qrl<C1566620qs0> {
    public InterfaceC830890Wid LLILLJJLI;
    public final C1566750qsD LLILLL = new InterfaceC829930Wh5() { // from class: X.0qsD
        @Override // X.InterfaceC829930Wh5
        public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
            if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                final C1566710qs9 c1566710qs9 = this.LIZ;
                if (c1566710qs9.LLILLJJLI == null) {
                    c1566710qs9.getClass();
                    TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("feed_auto_refresh", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.0qsC
                        /* JADX WARN: Type inference failed for: r0v10, types: [X.0qsB] */
                        @Override // X.AbstractC830880Wic
                        public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                            Map map;
                            String str;
                            final long jLongValue;
                            Long l;
                            if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_feed_auto_refresh_psp", false, false) && interfaceC805220ViK.LIZIZ() == EnumC1910390zoT.CelResult) {
                                Object objLIZJ = interfaceC805220ViK.LIZJ();
                                if ((objLIZJ instanceof Map) && (map = (Map) objLIZJ) != null) {
                                    Object obj = map.get("reason");
                                    if ((obj instanceof String) && (str = (String) obj) != null) {
                                        ArrayList arrayList = new ArrayList();
                                        Object obj2 = map.get("gid_list");
                                        if (obj2 instanceof List) {
                                            for (Object obj3 : (Iterable) obj2) {
                                                if ((obj3 instanceof String) && C123100dR.LIZ((String) obj3)) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                        }
                                        Object obj4 = map.get("index");
                                        if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = 1;
                                        }
                                        c1566710qs9.LIZJ(new C1566620qs0(str, arrayList, new InterfaceC1566600qry() { // from class: X.0qsB
                                            @Override // X.InterfaceC1566600qry
                                            public final void LIZ() {
                                            }

                                            @Override // X.InterfaceC1566600qry
                                            public final void LIZIZ(List<? extends Aweme> list) {
                                            }

                                            @Override // X.InterfaceC1566600qry
                                            public final void LIZLLL() {
                                            }

                                            @Override // X.InterfaceC1566600qry
                                            public final C1566660qs4 LIZJ() {
                                                return new C1566660qs4((int) jLongValue);
                                            }
                                        }));
                                    }
                                }
                            }
                        }

                        @Override // X.AbstractC830880Wic
                        public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                            if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                C1566710qs9 c1566710qs92 = c1566710qs9;
                                synchronized (this) {
                                    try {
                                        if (c1566710qs92.LLILLJJLI != null) {
                                            TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                        } else {
                                            c1566710qs92.LLILLJJLI = interfaceC830890Wid;
                                            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1566710qs92.LLILLL);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (enumC829940Wh6 != EnumC829940Wh6.TTMStateSceneDataUpdateFinish) {
                return;
            }
            final C1566710qs9 c1566710qs92 = this.LIZ;
            if (c1566710qs92.LLILLJJLI != null) {
                return;
            }
            c1566710qs92.getClass();
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("feed_auto_refresh", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.0qsC
                /* JADX WARN: Type inference failed for: r0v10, types: [X.0qsB] */
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    Map map;
                    String str;
                    final long jLongValue;
                    Long l;
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_feed_auto_refresh_psp", false, false) && interfaceC805220ViK.LIZIZ() == EnumC1910390zoT.CelResult) {
                        Object objLIZJ = interfaceC805220ViK.LIZJ();
                        if ((objLIZJ instanceof Map) && (map = (Map) objLIZJ) != null) {
                            Object obj = map.get("reason");
                            if ((obj instanceof String) && (str = (String) obj) != null) {
                                ArrayList arrayList = new ArrayList();
                                Object obj2 = map.get("gid_list");
                                if (obj2 instanceof List) {
                                    for (Object obj3 : (Iterable) obj2) {
                                        if ((obj3 instanceof String) && C123100dR.LIZ((String) obj3)) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                }
                                Object obj4 = map.get("index");
                                if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 1;
                                }
                                c1566710qs92.LIZJ(new C1566620qs0(str, arrayList, new InterfaceC1566600qry() { // from class: X.0qsB
                                    @Override // X.InterfaceC1566600qry
                                    public final void LIZ() {
                                    }

                                    @Override // X.InterfaceC1566600qry
                                    public final void LIZIZ(List<? extends Aweme> list) {
                                    }

                                    @Override // X.InterfaceC1566600qry
                                    public final void LIZLLL() {
                                    }

                                    @Override // X.InterfaceC1566600qry
                                    public final C1566660qs4 LIZJ() {
                                        return new C1566660qs4((int) jLongValue);
                                    }
                                }));
                            }
                        }
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                        C1566710qs9 c1566710qs922 = c1566710qs92;
                        synchronized (this) {
                            try {
                                if (c1566710qs922.LLILLJJLI != null) {
                                    TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                } else {
                                    c1566710qs922.LLILLJJLI = interfaceC830890Wid;
                                    TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1566710qs922.LLILLL);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            });
        }
    };

    @Override // X.InterfaceC1566430qrh
    public final void LIZ() {
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(this.LLILLL);
    }

    @Override // X.InterfaceC1566430qrh
    public final void destroy() {
        this.LL.clear();
        TTMStrategyCenterManager.deregisterSceneWithScene(this.LLILLJJLI);
        this.LLILLJJLI = null;
        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this.LLILLL);
    }
}
