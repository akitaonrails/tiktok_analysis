package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.model.AutoDubbingConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471980oPM extends C1469760oLm {
    public InterfaceC1472010oPP LLILLL;
    public InterfaceC1471920oPG LLILZ;
    public Map<String, Integer> LLILZIL;
    public boolean LLILZLL;
    public final int[] LLIZ;
    public String LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public final C1471990oPN LLJJIJIIJIL;
    public final C1471910oPF LLJJIJIL;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null) {
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oPO
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJI(e eVar) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                    this.LL.LLJILJIL = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIL() {
        try {
            this.LLJJIJI = this.LLILLJJLI.getSourceId();
            AutoDubbingConfig autoDubbingConfig = this.LLILLJJLI.ue().LJIIIIZZ;
            this.LLILZLL = autoDubbingConfig.enableOriginFallback;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrepareImmediately: mAutoDubbingConfig=");
                sbLIZ.append(autoDubbingConfig);
                sbLIZ.append(", mSourceId=");
                sbLIZ.append(this.LLJJIJI);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPrepareImmediately: exception thrown, msg=");
            sbLIZ2.append(th.getMessage());
            sbLIZ2.append(", mSourceId=");
            sbLIZ2.append(this.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oPN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0oPF] */
    public C1471980oPM(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
        this.LLIZ = new int[]{-1, -1};
        this.LLIZLLLIL = "un";
        this.LLJILLL = -1L;
        this.LLJJI = true;
        this.LLJJIJIIJIL = new C1468920oKQ() { // from class: X.0oPN
            @Override // X.C1468920oKQ
            public final String LJ() {
                if (this.LIZ.LLILLL == null) {
                    return "";
                }
                C1481110oe5.LIZIZ("TTPlayer", "getSubBehaviorMob");
                C1471980oPM c1471980oPM = this.LIZ;
                return c1471980oPM.LLILLL.LIZ(c1471980oPM.LLILLJJLI.getSourceId());
            }

            @Override // X.InterfaceC1468910oKP
            public final void LIZIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Enter onSubLoadFinished: success=");
                sbLIZ.append(i);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
            @Override // X.InterfaceC1468910oKP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r32, java.lang.String r33) {
                /*
                    Method dump skipped, instruction units count: 345
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1471990oPN.LIZ(int, java.lang.String):void");
            }

            @Override // X.C1468920oKQ, X.InterfaceC1468910oKP
            public final void LIZJ(int i, String str) {
                this.LIZ.LLJILJILJ = SystemClock.elapsedRealtime();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Enter onSubLoadFinished2, success=");
                sbLIZ.append(i);
                sbLIZ.append(", info=");
                sbLIZ.append(str);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LIZ.LLILLL != null) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSubLoadFinished2: success=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", info=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", mSourceId=");
                        sbLIZ2.append(this.LIZ.LLJJIJI);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            this.LIZ.LLJILLL = JSONObjectProtectorUtils.getInt(jSONObject, "first_pts");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1481110oe5.LIZLLL("TTPlayer", "onSubLoadFinished2: JSONException thrown");
                        }
                    }
                    C1471980oPM c1471980oPM = this.LIZ;
                    c1471980oPM.LLILLL.LIZLLL(i, c1471980oPM.LLILLJJLI.getSourceId(), str);
                    C1471980oPM c1471980oPM2 = this.LIZ;
                    c1471980oPM2.LIZLLL(213, (int) c1471980oPM2.LLJILLL);
                }
            }

            @Override // X.C1468920oKQ, X.InterfaceC1468910oKP
            public final void LIZLLL(int i, String str) {
                C1471980oPM c1471980oPM = this.LIZ;
                c1471980oPM.LLJIJIL = true;
                c1471980oPM.LLJILJILJ = SystemClock.elapsedRealtime();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Enter onSubSwitchCompleted, success=");
                sbLIZ.append(i);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LIZ.LLILLL != null) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSubSwitchCompleted: success=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", info=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", mSourceId=");
                        sbLIZ2.append(this.LIZ.LLJJIJI);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            this.LIZ.LLJILLL = JSONObjectProtectorUtils.getInt(jSONObject, "first_pts");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1481110oe5.LIZLLL("TTPlayer", "onSubSwitchCompleted: JSONException thrown");
                        }
                    }
                    C1471980oPM c1471980oPM2 = this.LIZ;
                    c1471980oPM2.LLILLL.LIZIZ(i, c1471980oPM2.LLILLJJLI.getSourceId(), str);
                    C1471980oPM c1471980oPM3 = this.LIZ;
                    if (c1471980oPM3.LLJJIII) {
                        c1471980oPM3.LIZLLL(217, (int) c1471980oPM3.LLJILLL);
                    }
                }
            }
        };
        this.LLJJIJIL = new InterfaceC1469360oL8() { // from class: X.0oPF
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJI(e eVar) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
            @Override // X.InterfaceC1469360oL8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIJ(int r14, int r15) {
                /*
                    Method dump skipped, instruction units count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1471910oPF.LJJIIJ(int, int):void");
            }
        };
    }

    public final void LIZLLL(int i, int i2) {
        C1472150oPd player;
        if (((Boolean) C1474810oTv.G.getValue()).booleanValue() && (player = this.LLILLJJLI.getPlayer()) != null) {
            player.LLII(i, i2);
        }
    }
}
