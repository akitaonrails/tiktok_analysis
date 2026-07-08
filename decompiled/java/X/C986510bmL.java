package X;

import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.GameModeHostRange;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGameModeHostCountSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: renamed from: X.0bmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986510bmL implements InterfaceC974370bSl {
    public final DataChannel LIZ;
    public final ILiveMatchService LIZIZ;
    public final ILiveCompetitionInternalService LIZJ;
    public final IMultiHostService LIZLLL;
    public int LJ;

    @Override // X.InterfaceC974370bSl
    public final int LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC974370bSl
    public final void LIZ(int i) {
        this.LJ = i;
    }

    @Override // X.InterfaceC974370bSl
    public final boolean LIZLLL(CohostContentGuideInfo cohostContentGuideInfo) {
        if (C978340bZA.LIZJ(true) != null) {
            return true;
        }
        if (cohostContentGuideInfo == null) {
            C20441214yg.LIZIZ("InteractGameRouter", "shouldShowGuideButton, guideInfo is null");
            return false;
        }
        int i = cohostContentGuideInfo.recommendedBattleType;
        if (LJI(i) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldShowGuideButton, targetGameType ");
            sbLIZ.append(i);
            sbLIZ.append(" not supported");
            C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (LJFF(i)) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("shouldShowGuideButton, canTransition failed for targetGameType ");
        sbLIZ2.append(i);
        C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public final boolean LJFF(int i) {
        int size;
        InterfaceC986560bmQ interfaceC986560bmQLJI = LJI(i);
        if (interfaceC986560bmQLJI == null) {
            return false;
        }
        int i2 = this.LJ;
        if (i == i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canTransition failed, nextGameType ");
            sbLIZ.append(i);
            sbLIZ.append(" is same as current");
            C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (!interfaceC986560bmQLJI.LIZLLL(i2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canTransition failed, not able to transition to ");
            sbLIZ2.append(i);
            sbLIZ2.append(" from ");
            sbLIZ2.append(this.LJ);
            C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        GameModeHostRange gameModeHostRange = LiveMatchGameModeHostCountSetting.INSTANCE.getValue().get(Integer.valueOf(i));
        if (gameModeHostRange != null && gameModeHostRange.lowerLimit <= (size = this.LIZLLL.LLILZLL(true).size()) && size <= gameModeHostRange.upperLimit) {
            if (!this.LIZLLL.LJJLIIIJJI()) {
                return true;
            }
            C20441214yg.LIZIZ("InteractGameRouter", "canTransition failed, not possible during CH x MG");
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("canTransition failed, host count not valid for game mode ");
        sbLIZ3.append(i);
        C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    public final InterfaceC986560bmQ LJI(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 51) {
                            if (i != 53) {
                                return null;
                            }
                            final ILiveCompetitionInternalService iLiveCompetitionInternalService = this.LIZJ;
                            return new InterfaceC986560bmQ(iLiveCompetitionInternalService) { // from class: X.0bmK
                                public final ILiveCompetitionInternalService LIZ;
                                public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(1, 51);

                                @Override // X.InterfaceC986560bmQ
                                public final void LIZ() {
                                    ILiveCompetitionInternalService iLiveCompetitionInternalService2 = this.LIZ;
                                    C973660bRc c973660bRc = C973660bRc.LIZ;
                                    iLiveCompetitionInternalService2.Cg(C973660bRc.LJJJJL);
                                }

                                @Override // X.InterfaceC986560bmQ
                                public final List<Integer> LJ() {
                                    return this.LIZIZ;
                                }

                                {
                                    this.LIZ = iLiveCompetitionInternalService;
                                }

                                @Override // X.InterfaceC986560bmQ
                                public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                                    this.LIZ.S6(awS55S0310000_15);
                                }

                                @Override // X.InterfaceC986560bmQ
                                public final boolean LIZLLL(int i2) {
                                    return C986490bmJ.LIZ(this, i2);
                                }

                                @Override // X.InterfaceC986560bmQ
                                public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                                    C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
                                }
                            };
                        }
                        final ILiveCompetitionInternalService iLiveCompetitionInternalService2 = this.LIZJ;
                        return new InterfaceC986560bmQ(iLiveCompetitionInternalService2) { // from class: X.0bmN
                            public final ILiveCompetitionInternalService LIZ;
                            public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(1, 4, 3, 2, 51, 53);

                            @Override // X.InterfaceC986560bmQ
                            public final void LIZ() {
                                ILiveCompetitionInternalService iLiveCompetitionInternalService3 = this.LIZ;
                                C973660bRc c973660bRc = C973660bRc.LIZ;
                                iLiveCompetitionInternalService3.Cg(C973660bRc.LJJJJL);
                            }

                            @Override // X.InterfaceC986560bmQ
                            public final List<Integer> LJ() {
                                return this.LIZIZ;
                            }

                            {
                                this.LIZ = iLiveCompetitionInternalService2;
                            }

                            @Override // X.InterfaceC986560bmQ
                            public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                                this.LIZ.S6(awS55S0310000_15);
                            }

                            @Override // X.InterfaceC986560bmQ
                            public final boolean LIZLLL(int i2) {
                                return C986490bmJ.LIZ(this, i2);
                            }

                            @Override // X.InterfaceC986560bmQ
                            public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                                C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
                            }
                        };
                    }
                    final ILiveMatchService iLiveMatchService = this.LIZIZ;
                    return new InterfaceC986560bmQ(iLiveMatchService) { // from class: X.0bmO
                        public final ILiveMatchService LIZ;
                        public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(3, 51, 4, 53, 1, 2);

                        @Override // X.InterfaceC986560bmQ
                        public final void LIZ() {
                            ILiveMatchService iLiveMatchService2 = this.LIZ;
                            C973660bRc c973660bRc = C973660bRc.LIZ;
                            iLiveMatchService2.Cg(C973660bRc.LJJJJL);
                        }

                        @Override // X.InterfaceC986560bmQ
                        public final List<Integer> LJ() {
                            return this.LIZIZ;
                        }

                        {
                            this.LIZ = iLiveMatchService;
                        }

                        @Override // X.InterfaceC986560bmQ
                        public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                            this.LIZ.S6(awS55S0310000_15);
                        }

                        @Override // X.InterfaceC986560bmQ
                        public final boolean LIZLLL(int i2) {
                            return C986490bmJ.LIZ(this, i2);
                        }

                        @Override // X.InterfaceC986560bmQ
                        public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                            C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
                        }
                    };
                }
                final ILiveMatchService iLiveMatchService2 = this.LIZIZ;
                return new InterfaceC986560bmQ(iLiveMatchService2) { // from class: X.0bmM
                    public final ILiveMatchService LIZ;
                    public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(4, 2, 51);

                    @Override // X.InterfaceC986560bmQ
                    public final void LIZ() {
                        ILiveMatchService iLiveMatchService3 = this.LIZ;
                        C973660bRc c973660bRc = C973660bRc.LIZ;
                        iLiveMatchService3.Cg(C973660bRc.LJJJJL);
                    }

                    @Override // X.InterfaceC986560bmQ
                    public final List<Integer> LJ() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = iLiveMatchService2;
                    }

                    @Override // X.InterfaceC986560bmQ
                    public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                        this.LIZ.S6(awS55S0310000_15);
                    }

                    @Override // X.InterfaceC986560bmQ
                    public final boolean LIZLLL(int i2) {
                        return C986490bmJ.LIZ(this, i2);
                    }

                    @Override // X.InterfaceC986560bmQ
                    public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                        C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
                    }
                };
            }
            final ILiveMatchService iLiveMatchService3 = this.LIZIZ;
            return new InterfaceC986560bmQ(iLiveMatchService3) { // from class: X.0bmO
                public final ILiveMatchService LIZ;
                public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(3, 51, 4, 53, 1, 2);

                @Override // X.InterfaceC986560bmQ
                public final void LIZ() {
                    ILiveMatchService iLiveMatchService22 = this.LIZ;
                    C973660bRc c973660bRc = C973660bRc.LIZ;
                    iLiveMatchService22.Cg(C973660bRc.LJJJJL);
                }

                @Override // X.InterfaceC986560bmQ
                public final List<Integer> LJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = iLiveMatchService3;
                }

                @Override // X.InterfaceC986560bmQ
                public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                    this.LIZ.S6(awS55S0310000_15);
                }

                @Override // X.InterfaceC986560bmQ
                public final boolean LIZLLL(int i2) {
                    return C986490bmJ.LIZ(this, i2);
                }

                @Override // X.InterfaceC986560bmQ
                public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                    C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
                }
            };
        }
        final ILiveMatchService iLiveMatchService4 = this.LIZIZ;
        return new InterfaceC986560bmQ(iLiveMatchService4) { // from class: X.0bmP
            public final ILiveMatchService LIZ;
            public final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(51, 53);

            @Override // X.InterfaceC986560bmQ
            public final void LIZ() {
                ILiveMatchService iLiveMatchService5 = this.LIZ;
                C973660bRc c973660bRc = C973660bRc.LIZ;
                iLiveMatchService5.Cg(C973660bRc.LJJJJL);
            }

            @Override // X.InterfaceC986560bmQ
            public final List<Integer> LJ() {
                return this.LIZIZ;
            }

            {
                this.LIZ = iLiveMatchService4;
            }

            @Override // X.InterfaceC986560bmQ
            public final void LIZIZ(AwS55S0310000_15 awS55S0310000_15) {
                this.LIZ.S6(awS55S0310000_15);
            }

            @Override // X.InterfaceC986560bmQ
            public final boolean LIZLLL(int i2) {
                return C986490bmJ.LIZ(this, i2);
            }

            @Override // X.InterfaceC986560bmQ
            public final void LIZJ(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
                C986490bmJ.LIZIZ(z, enumC919170a1j, z2, str, z3);
            }
        };
    }

    public C986510bmL(DataChannel dataChannel, ILiveMatchService iLiveMatchService, ILiveCompetitionInternalService iLiveCompetitionInternalService, IMultiHostService iMultiHostService) {
        this.LIZ = dataChannel;
        this.LIZIZ = iLiveMatchService;
        this.LIZJ = iLiveCompetitionInternalService;
        this.LIZLLL = iMultiHostService;
    }

    @Override // X.InterfaceC974370bSl
    public final boolean LIZJ(EnumC919170a1j enumC919170a1j, EnumC919170a1j enumC919170a1j2, boolean z, int i) {
        int size = this.LIZLLL.LLILZLL(true).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEndingRequired, nextMatchType:");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", currentMatchType:");
        sbLIZ.append(enumC919170a1j2);
        sbLIZ.append(", inviteType:");
        sbLIZ.append(i);
        sbLIZ.append(", coHostLinkedUserCount:");
        sbLIZ.append(size);
        C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_2V2 && size == 2 && (z || i == 2)) {
            return true;
        }
        if (i == 6 && enumC919170a1j.isMatch() != enumC919170a1j2.isMatch()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC974370bSl
    public final boolean LJ(int i, String str, boolean z, boolean z2, boolean z3) {
        InterfaceC986560bmQ interfaceC986560bmQLJI = LJI(this.LJ);
        InterfaceC986560bmQ interfaceC986560bmQLJI2 = LJI(i);
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(i));
        EnumC919170a1j enumC919170a1jLIZ2 = C918130a03.LIZ(Integer.valueOf(this.LJ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transition, currentGameType: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nextGameType: ");
        sbLIZ.append(i);
        sbLIZ.append(", shouldStartInvite: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("InteractGameRouter", C2188811AlT.LIZIZ(sbLIZ));
        boolean zCo0 = this.LIZIZ.co0();
        boolean zAl1 = C915980Zwa.LIZ().Al1();
        if (!zCo0 && !zAl1) {
            C20441214yg.LIZIZ("InteractGameRouter", "transition not required, directly start game mode");
            if (interfaceC986560bmQLJI2 != null) {
                interfaceC986560bmQLJI2.LIZJ(enumC919170a1jLIZ, str, z, z2, z3);
            }
            return false;
        }
        if (this.LJ == i) {
            if (interfaceC986560bmQLJI != null) {
                interfaceC986560bmQLJI.LIZ();
            }
            return true;
        }
        if (!LJFF(i)) {
            return false;
        }
        if (LIZJ(enumC919170a1jLIZ, enumC919170a1jLIZ2, true, 6)) {
            C20441214yg.LIZIZ("InteractGameRouter", "transition, ending current game mode first before starting");
            if (interfaceC986560bmQLJI != null) {
                interfaceC986560bmQLJI.LIZIZ(new AwS55S0310000_15(this, interfaceC986560bmQLJI2, enumC919170a1jLIZ, z2, 5));
            }
        } else {
            C20441214yg.LIZIZ("InteractGameRouter", "transition, directly starting next game mode");
            if (interfaceC986560bmQLJI2 != null) {
                C986490bmJ.LIZJ(interfaceC986560bmQLJI2, enumC919170a1jLIZ, z2);
                return true;
            }
        }
        return true;
    }
}
