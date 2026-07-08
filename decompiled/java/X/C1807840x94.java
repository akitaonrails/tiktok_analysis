package X;

import Y.AObjectS401S0100000_27;
import android.content.Context;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0x94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807840x94 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public final C1807680x8o LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 17));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 18));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 14));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 15));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 20));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 21));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 16));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 19));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 22));
    public volatile C1445050nhv LJIIJ;
    public volatile C1452180ntQ LJIIJJI;
    public volatile C1445020nhs LJIIL;
    public volatile C1807850x95 LJIILIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1807840x94.class, "eventTracker", "getEventTracker()Lcom/ss/android/ugc/aweme/im/creative/edit/api/metric/IMEditEventTracker;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1807840x94.class, "editor", "getEditor()Lcom/ss/android/ugc/aweme/im/creative/edit/api/editor/IMEditor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1807840x94.class, "editNavigator", "getEditNavigator()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/navigation/IMEditNavigator;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1807840x94.class, "featureActivationManager", "getFeatureActivationManager()Lcom/ss/android/ugc/aweme/im/creative/edit/api/activation/IMFeatureActivationManager;", 0);
        c09r3.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final IMCreativeEditModel LIZ() {
        IMCreativeEditModel iMCreativeEditModel = this.LIZ.LIZLLL;
        if (iMCreativeEditModel != null) {
            return iMCreativeEditModel;
        }
        throw new IllegalArgumentException("null edit model");
    }

    public final Context LIZIZ() {
        return (Context) this.LJ.getValue();
    }

    public final AbstractC1445310niL LIZJ() {
        C1445020nhs c1445020nhs = this.LJIIL;
        if (c1445020nhs == null) {
            synchronized (this) {
                c1445020nhs = this.LJIIL;
                if (c1445020nhs == null) {
                    C1445020nhs c1445020nhs2 = new C1445020nhs(C452501pT.LIZIZ(new AObjectS401S0100000_27(this, 0)), LIZ(), (C19EG) this.LIZIZ.getValue(), LJ());
                    this.LJIIL = c1445020nhs2;
                    return c1445020nhs2;
                }
            }
        }
        return c1445020nhs;
    }

    public final InterfaceC1660990tKD LIZLLL() {
        C1452180ntQ c1452180ntQ = this.LJIIJJI;
        if (c1452180ntQ == null) {
            synchronized (this) {
                c1452180ntQ = this.LJIIJJI;
                if (c1452180ntQ == null) {
                    C1452180ntQ c1452180ntQ2 = new C1452180ntQ(LIZ(), LIZIZ(), LJ(), new C1440750naz());
                    this.LJIIJJI = c1452180ntQ2;
                    return c1452180ntQ2;
                }
            }
        }
        return c1452180ntQ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0nhv, X.0niC] */
    public final InterfaceC1445220niC LJ() {
        C1445050nhv c1445050nhv = this.LJIIJ;
        if (c1445050nhv == null) {
            synchronized (this) {
                c1445050nhv = this.LJIIJ;
                if (c1445050nhv == null) {
                    final IMCreativeEditModel iMCreativeEditModelLIZ = LIZ();
                    ?? r0 = new InterfaceC1445220niC(iMCreativeEditModelLIZ) { // from class: X.0nhv
                        public final IMCreativeEditModel LIZ;
                        public final HashMap<String, Long> LIZIZ = new HashMap<>();

                        /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C2344009Gk LIZIZ() {
                            /*
                                r5 = this;
                                X.09Gk r3 = new X.09Gk
                                r3.<init>()
                                java.lang.String r1 = "shoot_way"
                                java.lang.String r0 = "chat_shoot"
                                r3.LJIIIIZZ(r1, r0)
                                java.lang.String r1 = "enter_from"
                                java.lang.String r0 = "video_shoot_page"
                                r3.LJIIIIZZ(r1, r0)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror r0 = r0.dmCameraModelMirror
                                if (r0 == 0) goto L1d
                                java.lang.String r1 = r0.enterDM
                                if (r1 != 0) goto L1f
                            L1d:
                                java.lang.String r1 = "default"
                            L1f:
                                java.lang.String r0 = "enter_dm"
                                r3.LJIIIIZZ(r0, r1)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror r0 = r0.dmCameraModelMirror
                                java.lang.String r2 = ""
                                if (r0 == 0) goto L30
                                java.lang.String r1 = r0.enterDMWay
                                if (r1 != 0) goto L31
                            L30:
                                r1 = r2
                            L31:
                                java.lang.String r0 = "enter_dm_way"
                                r3.LJIIIIZZ(r0, r1)
                                java.lang.String r1 = "shoot_enter_from"
                                java.lang.String r0 = "chat"
                                r3.LJIIIIZZ(r1, r0)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror r0 = r0.dmCameraModelMirror
                                if (r0 == 0) goto L47
                                java.lang.String r1 = r0.enterMethodType
                                if (r1 != 0) goto L48
                            L47:
                                r1 = r2
                            L48:
                                java.lang.String r0 = "enter_dm_type"
                                r3.LJIIIIZZ(r0, r1)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                java.lang.String r1 = r0.creationId
                                if (r1 != 0) goto L54
                                r1 = r2
                            L54:
                                java.lang.String r0 = "creation_id"
                                r3.LJIIIIZZ(r0, r1)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror r4 = r0.dmCameraModelMirror
                                if (r4 == 0) goto L99
                                int r1 = r4.chatType
                                r0 = 3
                                if (r1 != r0) goto L8e
                                java.lang.String r1 = "group"
                            L66:
                                java.lang.String r0 = "chat_type"
                                r3.LJIIIIZZ(r0, r1)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                if (r0 == 0) goto L77
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror r0 = r0.dmCameraModelMirror
                                if (r0 == 0) goto L77
                                java.lang.String r1 = r0.sessionID
                                if (r1 != 0) goto L78
                            L77:
                                r1 = r2
                            L78:
                                java.lang.String r0 = "conversation_id"
                                r3.LJIIIIZZ(r0, r1)
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r0 = r5.LIZ
                                com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel r0 = r0.effectModel
                                if (r0 == 0) goto L88
                                java.lang.String r0 = r0.stickerID
                                if (r0 == 0) goto L88
                                r2 = r0
                            L88:
                                java.lang.String r0 = "prop_id"
                                r3.LJIIIIZZ(r0, r2)
                                return r3
                            L8e:
                                int r0 = r4.chatType
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                if (r0 == 0) goto L99
                                java.lang.String r1 = "private"
                                goto L66
                            L99:
                                r1 = r2
                                goto L66
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1445050nhv.LIZIZ():X.09Gk");
                        }

                        public final void LIZJ() {
                            String str;
                            String str2;
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("shoot_way", "chat_shoot");
                            c2344009Gk.LJIIIIZZ("enter_dm", "group_shot");
                            DMCameraModelMirror dMCameraModelMirror = this.LIZ.dmCameraModelMirror;
                            if (dMCameraModelMirror == null || (str = dMCameraModelMirror.enterDMWay) == null) {
                                str = "";
                            }
                            c2344009Gk.LJIIIIZZ("enter_dm_way", str);
                            c2344009Gk.LJIIIIZZ("shoot_enter_from", "chat");
                            DMCameraModelMirror dMCameraModelMirror2 = this.LIZ.dmCameraModelMirror;
                            if (dMCameraModelMirror2 == null || (str2 = dMCameraModelMirror2.enterMethodType) == null) {
                                str2 = "";
                            }
                            c2344009Gk.LJIIIIZZ("enter_dm_type", str2);
                            String str3 = this.LIZ.creationId;
                            c2344009Gk.LJIIIIZZ("creation_id", str3 != null ? str3 : "");
                            C20684815ws.LJIILLIIL("enter_video_shoot_page", c2344009Gk.LIZ);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
                        /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZLLL() {
                            /*
                                Method dump skipped, instruction units count: 328
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1445050nhv.LIZLLL():void");
                        }

                        {
                            this.LIZ = iMCreativeEditModelLIZ;
                        }

                        public final long LIZ(String str) {
                            Long l = this.LIZIZ.get(str);
                            Long l2 = this.LIZIZ.get("EDIT_FIRST_FRAME");
                            if (l != null && l2 != null) {
                                return Math.abs(l.longValue() - l2.longValue());
                            }
                            return -1L;
                        }

                        @Override // X.InterfaceC1445220niC
                        public synchronized void onEvent(AbstractC1445140ni4 abstractC1445140ni4) {
                            this.LIZIZ.put(abstractC1445140ni4.LIZ.name(), Long.valueOf(System.currentTimeMillis()));
                            if (abstractC1445140ni4 instanceof C1445070nhx) {
                                C1445070nhx c1445070nhx = (C1445070nhx) abstractC1445140ni4;
                                Long l = c1445070nhx.LIZIZ;
                                if (l != null) {
                                    this.LIZIZ.put("TRANSIT_TO_EDIT_PAGE", Long.valueOf(l.longValue()));
                                }
                                if (c1445070nhx.LIZJ) {
                                    C20684815ws.LJIILLIIL("enter_video_edit_page", LIZIZ().LIZ);
                                }
                            } else if (abstractC1445140ni4 instanceof C1445180ni8) {
                                C2344009Gk c2344009GkLIZIZ = LIZIZ();
                                long jLIZ = LIZ("TRANSIT_TO_EDIT_PAGE");
                                if (jLIZ < 0) {
                                    jLIZ = LIZ("EDIT_PAGE_INITIATE");
                                }
                                c2344009GkLIZIZ.LIZLLL(jLIZ, "first_frame_duration");
                                C20684815ws.LJIILLIIL("tool_performance_edit_first_frame", c2344009GkLIZIZ.LIZ);
                            } else if (abstractC1445140ni4 instanceof C1445150ni5) {
                                LIZJ();
                            } else if (abstractC1445140ni4 instanceof C1445160ni6) {
                                LIZLLL();
                            } else if (abstractC1445140ni4 instanceof C1445190ni9) {
                                if (this.LIZ.LIZIZ()) {
                                    C20684815ws.LJIILLIIL("shoot_exit", LIZIZ().LIZ);
                                }
                            } else if (abstractC1445140ni4 instanceof C1445200niA) {
                                if (this.LIZ.LIZIZ()) {
                                    C20684815ws.LJIILLIIL("ttsocial_click_reshoot", LIZIZ().LIZ);
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        }
                    };
                    this.LJIIJ = r0;
                    return r0;
                }
            }
        }
        return c1445050nhv;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0x95, X.0x97] */
    public final InterfaceC1807870x97 LJFF() {
        C1807850x95 c1807850x95 = this.LJIILIIL;
        if (c1807850x95 == null) {
            synchronized (this) {
                c1807850x95 = this.LJIILIIL;
                if (c1807850x95 == null) {
                    ?? r0 = new InterfaceC1807870x97() { // from class: X.0x95
                        public final List<InterfaceC1807860x96> LIZ = new ArrayList();

                        @Override // X.InterfaceC1807870x97
                        public final synchronized void LIZ(InterfaceC1807860x96 interfaceC1807860x96) {
                            ((ArrayList) this.LIZ).add(interfaceC1807860x96);
                        }

                        @Override // X.InterfaceC1807870x97
                        public final synchronized void LIZIZ(EnumC1404400meM enumC1404400meM) {
                            Iterator it2 = ((ArrayList) this.LIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC1807860x96) it2.next()).E5(enumC1404400meM);
                            }
                        }
                    };
                    this.LJIILIIL = r0;
                    return r0;
                }
            }
        }
        return c1807850x95;
    }

    public C1807840x94(C1807680x8o c1807680x8o) {
        this.LIZ = c1807680x8o;
    }
}
