package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0Z8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8Z implements InterfaceC909070ZlR {
    public boolean LIZ;
    public Integer LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public Boolean LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public Long LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public Integer LJIJJLI;
    public LightInteractionExitBean LJIL;
    public long LJJ;
    public long LJJI;
    public final String LJJIFFI;
    public Long LJJII;
    public Boolean LJJIII;
    public Boolean LJJIIJ;
    public Integer LJJIIJZLJL;
    public Boolean LJJIIZ;

    @Override // X.InterfaceC909070ZlR
    public final LightInteractionMetaData build() {
        C869590Y9l lastShowMessage;
        LightInteractionExitBean lightInteractionExitBeanCopy;
        Long lValueOf;
        Boolean boolValueOf = null;
        if (this.LJIL == null) {
            C603760NmA c603760NmA = C603760NmA.LL;
            String strLJ = this.LJIIZILJ;
            if (strLJ == null) {
                strLJ = C0YNP.LJ(this.LJIILLIIL);
            }
            LightInteractionExitBean lightInteractionExitBeanLJII = C603760NmA.LJII(strLJ, EnumC1696906kh.CONVERSATION);
            if (lightInteractionExitBeanLJII != null) {
                InterfaceC1513805wG interfaceC1513805wG = (InterfaceC1513805wG) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
                if (interfaceC1513805wG == null || !interfaceC1513805wG.LJJJLL()) {
                    lValueOf = this.LJJII;
                } else {
                    long j = this.LJJI;
                    Long l = this.LJJII;
                    lValueOf = Long.valueOf(this.LJJ - (j - (l != null ? l.longValue() : 0L)));
                }
                lightInteractionExitBeanCopy = lightInteractionExitBeanLJII.copy(lightInteractionExitBeanLJII.key, lightInteractionExitBeanLJII.updateTimingMs, lightInteractionExitBeanLJII.enterChatTimeSecond, lValueOf, lightInteractionExitBeanLJII.exitLabelMap);
            } else {
                lightInteractionExitBeanCopy = null;
            }
            this.LJIL = lightInteractionExitBeanCopy;
        }
        this.LJJIIJZLJL = Integer.valueOf(C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI());
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        String strLJ2 = this.LJIIZILJ;
        if (strLJ2 == null) {
            strLJ2 = C0YNP.LJ(this.LJIILLIIL);
        }
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(strLJ2);
        if (c0y8tLIZ != null && (lastShowMessage = c0y8tLIZ.getLastShowMessage()) != null) {
            boolValueOf = Boolean.valueOf(C1387310mCn.LJII(lastShowMessage.getCreatedAt()));
        }
        this.LJJIIZ = boolValueOf;
        return new LightInteractionMetaData(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, Boolean.FALSE, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, this.LJJIII, this.LJJIIJ, this.LJJIIJZLJL, this.LJJIIZ);
    }

    public C0Z8Z(int i) {
        long serverTime;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            serverTime = iMHostApiLIZ.getServerTime();
        } else {
            serverTime = 0;
        }
        String id = TimeZone.getDefault().getID();
        this.LIZ = false;
        this.LIZIZ = null;
        this.LIZJ = "not_define";
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = 0;
        this.LJIJI = false;
        this.LJIJJ = 0;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = jCurrentTimeMillis;
        this.LJJI = serverTime;
        this.LJJIFFI = id;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = null;
        this.LJJIIZ = null;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LIZ(Long l) {
        this.LJIILL = l;
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LIZIZ(IMUser iMUser) {
        boolean z;
        long jLIZIZ;
        MessageAfterFollowBackKeva messageAfterFollowBackKevaLIZ;
        this.LIZIZ = Integer.valueOf(iMUser.getFollowStatus());
        this.LJFF = Integer.valueOf(iMUser.getFollowerStatus());
        this.LJI = Boolean.valueOf(iMUser.isBlock());
        this.LJII = Boolean.valueOf(iMUser.isBlocked());
        this.LJIILLIIL = iMUser.getUid();
        if (iMUser.getShareStatus() != 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIII = Boolean.valueOf(z);
        String uid = iMUser.getUid();
        if (uid != null) {
            int iLJII = C1A1M.LIZIZ.LJII(uid);
            if (iLJII != -1) {
                this.LJIJJLI = Integer.valueOf(iLJII);
            }
            IIMLightInteractService iIMLightInteractService = (IIMLightInteractService) PluggableExtentionKt.pluggableSpiForReal(IIMLightInteractService.class);
            Long lValueOf = null;
            if (iIMLightInteractService != null && (messageAfterFollowBackKevaLIZ = iIMLightInteractService.LIZ()) != null) {
                lValueOf = Long.valueOf(messageAfterFollowBackKevaLIZ.LJ(null, uid));
            }
            this.LJIILL = lValueOf;
            LightInteractionBirthdayServiceImpl lightInteractionBirthdayServiceImpl = LightInteractionBirthdayServiceImpl.LL;
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                jLIZIZ = iMHostApiLIZ.LIZIZ();
            } else {
                jLIZIZ = 0;
            }
            this.LJJIIJ = Boolean.valueOf(lightInteractionBirthdayServiceImpl.LJFF(jLIZIZ, uid, curUserId));
        }
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LIZJ(C0Y8T c0y8t) {
        Long lValueOf;
        this.LIZLLL = Long.valueOf(c0y8t.getUnreadCount());
        this.LJIIJ = Integer.valueOf(c0y8t.getConversationType());
        this.LJIIIIZZ = Boolean.valueOf(c0y8t.isMute());
        this.LJIIIZ = Boolean.valueOf(c0y8t.isStranger());
        this.LJIIZILJ = c0y8t.getConversationId();
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage != null) {
            lValueOf = Long.valueOf(lastShowMessage.getCreatedAt());
        } else {
            lValueOf = null;
        }
        if (this.LJJII == null && lValueOf != null && lValueOf.longValue() != 0) {
            this.LJJII = Long.valueOf(lValueOf.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LIZLLL(long j) {
        this.LJJ = j;
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LJ(long j) {
        this.LJJI = j;
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LJFF(C869590Y9l c869590Y9l) {
        this.LJIIJJI = Integer.valueOf(c869590Y9l.getMsgType());
        this.LJIILIIL = LightInteractionManager.LLJILLL.LJI(c869590Y9l);
        this.LJIILJJIL = c869590Y9l.getExt().get("a:src");
        this.LJIIL = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9l));
        long createdAt = c869590Y9l.getCreatedAt();
        if (this.LJJII == null && createdAt != 0) {
            this.LJJII = Long.valueOf(createdAt / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        return this;
    }

    @Override // X.InterfaceC909070ZlR
    public final C0Z8Z LJI(String str) {
        this.LIZJ = str;
        return this;
    }

    public final C0Z8Z LJII(int i) {
        this.LJ = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Z8Z LJIIIIZZ(com.ss.android.ugc.aweme.profile.model.User r6) {
        /*
            r5 = this;
            int r0 = r6.getFollowStatus()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LIZIZ = r0
            int r0 = r6.getFollowerStatus()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LJFF = r0
            boolean r0 = r6.isBlock
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.LJI = r0
            boolean r0 = r6.isBlocked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.LJII = r0
            java.lang.String r0 = r6.getUid()
            r5.LJIILLIIL = r0
            java.util.List r1 = r6.getCanMessageFollowStatusList()
            if (r1 == 0) goto La6
            int r0 = r6.getFollowStatus()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto La6
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.LJJIII = r0
            java.lang.String r4 = r6.getUid()
            if (r4 == 0) goto La2
            X.1A1M r0 = X.C1A1M.LIZIZ
            int r1 = r0.LJII(r4)
            r0 = -1
            if (r1 == r0) goto L5c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.LJIJJLI = r0
        L5c:
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService> r0 = com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService r0 = (com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService) r0
            r1 = 0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva r0 = r0.LIZ()
            if (r0 == 0) goto L75
            long r0 = r0.LJ(r1, r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L75:
            r5.LJIILL = r1
            com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl r3 = com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl.LL
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r2 = r0.getCurUserId()
            if (r2 != 0) goto L89
            java.lang.String r2 = ""
        L89:
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto La3
            long r0 = r0.LIZIZ()
        L98:
            boolean r0 = r3.LJFF(r0, r4, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.LJJIIJ = r0
        La2:
            return r5
        La3:
            r0 = 0
            goto L98
        La6:
            r0 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z8Z.LJIIIIZZ(com.ss.android.ugc.aweme.profile.model.User):X.0Z8Z");
    }
}
