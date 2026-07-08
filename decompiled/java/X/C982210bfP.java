package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV2FixEndTimeSetting;

/* JADX INFO: renamed from: X.0bfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982210bfP {
    public static final /* synthetic */ int LIZJ = 0;
    public long LIZ;
    public C11JF LIZIZ;

    public static void LIZ(InterfaceC983620bhg interfaceC983620bhg, C981480beE c981480beE, AbstractC982800bgM abstractC982800bgM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleAudienceMsg");
        sbLIZ.append(", message = ");
        sbLIZ.append(abstractC982800bgM);
        C20441214yg.LJIIIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (C973910bS1.LIZIZ(C950220apo.LIZLLL(), abstractC982800bgM.LIZJ.LIZJ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onHandleAudienceMsg");
            sbLIZ2.append(", return by checkRoomFinishCompetitionId = true, competitionId=");
            sbLIZ2.append(abstractC982800bgM.LIZJ.LIZJ);
            C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC983620bhg.LIZJ(EnumC982970bgd.SCENE_MSG, EnumC982990bgf.FAIL_REASON_HIT_FINISH_CACHE);
            return;
        }
        if (abstractC982800bgM instanceof C982470bfp) {
            EnumC982970bgd enumC982970bgd = EnumC982970bgd.SCENE_MSG;
            interfaceC983620bhg.LIZIZ(enumC982970bgd, null);
            if (C982220bfQ.LIZIZ(c981480beE, C915980Zwa.LJI().LIZJ().LLF())) {
                interfaceC983620bhg.LIZ(enumC982970bgd);
                return;
            } else {
                interfaceC983620bhg.LIZJ(enumC982970bgd, EnumC982990bgf.FAIL_REASON_ID_INVALID);
                return;
            }
        }
        if (abstractC982800bgM instanceof C982670bg9) {
            if (!LiveCoHostTakeTheStageV2FixEndTimeSetting.INSTANCE.getValue()) {
                return;
            }
            EnumC982970bgd enumC982970bgd2 = EnumC982970bgd.SCENE_MSG;
            interfaceC983620bhg.LIZIZ(enumC982970bgd2, null);
            if (C982220bfQ.LIZIZ(c981480beE, C915980Zwa.LJI().LIZJ().LLF())) {
                interfaceC983620bhg.LIZ(enumC982970bgd2);
                return;
            } else {
                interfaceC983620bhg.LIZJ(enumC982970bgd2, EnumC982990bgf.FAIL_REASON_ID_INVALID);
                return;
            }
        }
        if (abstractC982800bgM instanceof C982490bfr) {
            EnumC982970bgd enumC982970bgd3 = EnumC982970bgd.SCENE_MSG;
            interfaceC983620bhg.LIZIZ(enumC982970bgd3, null);
            if (C982220bfQ.LIZIZ(c981480beE, C915980Zwa.LJI().LIZJ().LLF())) {
                interfaceC983620bhg.LIZ(enumC982970bgd3);
                return;
            } else {
                interfaceC983620bhg.LIZJ(enumC982970bgd3, EnumC982990bgf.FAIL_REASON_ID_INVALID);
                return;
            }
        }
        interfaceC983620bhg.LIZJ(EnumC982970bgd.SCENE_MSG, EnumC982990bgf.FAIL_REASON_STATUS_INVALID);
    }
}
