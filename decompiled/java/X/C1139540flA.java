package X;

import Y.ARunnableS50S0300000_17;
import Y.AfS36S1000000_17;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.MinuteGameRespondInviteParams;
import com.bytedance.android.livesdk.sticker.game.IMinuteGameApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0flA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139540flA extends AbstractC1139430fkz {
    public static final Map<Integer, String> LLJILJILJ = C2097608Jq.LJIIIIZZ(new Pair(200, "ARENA_ACCEPTED"), new Pair(201, "ARENA_REJECTED"), new Pair(202, "ARENA_SCORE_UPDATE"), new Pair(203, "ARENA_GAME_END"), new Pair(204, "ARENA_ALL_FINISHED"));
    public final List<C1136560fgM> LLJ = new LinkedList();
    public AssetsModel LLJI;
    public InterfaceC1138060fim LLJIJIL;
    public final C1139550flB LLJILJIL;

    @Override // X.AbstractC1139430fkz
    public final String LIZJ() {
        return "gift_game__ttlive_gift_render";
    }

    @Override // X.AbstractC1139430fkz
    public final void LJ() {
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIIIZZ() {
        this.LLJILJIL.LIZIZ();
    }

    public final void LJIIZILJ() {
        if (this.LLILLL || LJFF() || this.LLJ.isEmpty()) {
            return;
        }
        C1136560fgM c1136560fgM = (C1136560fgM) ListProtector.remove(this.LLJ, 0);
        c1136560fgM.LIZJ().LJIIJJI();
        LJIILJJIL();
        this.LLILZIL = c1136560fgM;
        LJIIL(c1136560fgM);
    }

    public C1139540flA() {
        InterfaceC1140600fms interfaceC1140600fms = new InterfaceC1140600fms() { // from class: X.0flF
            /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[PHI: r7
              0x0019: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1140600fms
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.EnumC1139760flW r15, X.EnumC1139760flW r16, X.C1136560fgM r17) throws org.json.JSONException {
                /*
                    r14 = this;
                    java.lang.String r8 = r15.getStateName()
                    java.lang.String r2 = r16.getStateName()
                    r0 = r17
                    if (r0 == 0) goto La4
                    long r3 = r0.LJIIL
                Le:
                    java.lang.String r6 = ""
                    if (r0 == 0) goto L16
                    java.lang.String r7 = r0.LIZIZ
                    if (r7 != 0) goto L19
                L16:
                    r7 = r6
                    if (r0 == 0) goto L1e
                L19:
                    java.lang.String r0 = r0.LIZJ
                    if (r0 == 0) goto L1e
                    r6 = r0
                L1e:
                    r0 = 3
                    kotlin.Pair[] r5 = new kotlin.Pair[r0]
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "fromStatus"
                    r1.<init>(r0, r8)
                    r0 = 0
                    r5[r0] = r1
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "toStatus"
                    r1.<init>(r0, r2)
                    r0 = 1
                    r5[r0] = r1
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.lang.String r0 = "giftId"
                    r2.put(r0, r3)
                    java.lang.String r0 = "name"
                    r2.put(r0, r7)
                    java.lang.String r0 = "iconUrl"
                    r2.put(r0, r6)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "gift"
                    r1.<init>(r0, r2)
                    r0 = 2
                    r5[r0] = r1
                    java.lang.String r0 = "onInteractGameplayStatusChange"
                    X.C389001fE.LIZJ(r0, r5)
                    boolean r0 = r16.isInGaming()
                    if (r0 == 0) goto Lab
                    X.0flA r4 = r14.LIZ
                    boolean r0 = r4.LLILLL
                    if (r0 != 0) goto Lab
                    java.util.List<X.0fgM> r0 = r4.LLJ
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Lab
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.List<X.0fgM> r0 = r4.LLJ
                    r3.addAll(r0)
                    java.util.List<X.0fgM> r0 = r4.LLJ
                    java.util.LinkedList r0 = (java.util.LinkedList) r0
                    r0.clear()
                    java.util.Iterator r2 = r3.iterator()
                L81:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto La8
                    java.lang.Object r1 = r2.next()
                    X.0fgM r1 = (X.C1136560fgM) r1
                    long r5 = r1.LJJJJ
                    long r7 = r1.LJ
                    com.bytedance.android.live.base.model.user.User r0 = r1.LJIIJJI
                    if (r0 == 0) goto La1
                    long r9 = r0.getId()
                L99:
                    long r11 = r1.LJIIL
                    java.lang.String r13 = "tryRejectGameOnStartGaming"
                    r4.LJIJ(r5, r7, r9, r11, r13)
                    goto L81
                La1:
                    r9 = 0
                    goto L99
                La4:
                    r3 = 0
                    goto Le
                La8:
                    r3.clear()
                Lab:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1139590flF.LIZ(X.0flW, X.0flW, X.0fgM):void");
            }
        };
        C1139550flB c1139550flB = new C1139550flB();
        if (!((ArrayList) c1139550flB.LJIIJ).contains(interfaceC1140600fms)) {
            ((ArrayList) c1139550flB.LJIIJ).add(interfaceC1140600fms);
        }
        this.LLJILJIL = c1139550flB;
    }

    @Override // X.AbstractC1139430fkz
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRenderEnd, currentPlayingMessage.msgId=");
        C1136560fgM c1136560fgM = this.LLILZIL;
        sbLIZ.append(c1136560fgM != null ? Long.valueOf(c1136560fgM.LJ) : null);
        sbLIZ.append(", currentCall=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isStopped=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", queueSize=");
        sbLIZ.append(((LinkedList) this.LLJ).size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1136560fgM c1136560fgM2 = this.LLILZIL;
        if (c1136560fgM2 != null) {
            c1136560fgM2.LIZJ().onPlayEnd();
        }
        InterfaceC1138060fim interfaceC1138060fim = this.LLJIJIL;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        this.LLJIJIL = null;
        this.LLJI = null;
        LJIILJJIL();
        C1139550flB c1139550flB = this.LLJILJIL;
        c1139550flB.LJIIIIZZ.removeCallbacks(c1139550flB.LJIIIZ);
        EnumC1139760flW enumC1139760flW = c1139550flB.LIZIZ;
        EnumC1139760flW enumC1139760flW2 = EnumC1139760flW.IDLE;
        if (enumC1139760flW != enumC1139760flW2) {
            c1139550flB.LJII(enumC1139760flW2, "reset", c1139550flB.LIZJ);
        }
        c1139550flB.LJI();
        if (enumC1139760flW == EnumC1139760flW.ACTIVE || enumC1139760flW == EnumC1139760flW.SETTLING) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reset() from ");
            sbLIZ2.append(enumC1139760flW);
            sbLIZ2.append(" -- firing sendFinish(GAMEPLAY_TIMEOUT_FINISH)");
            C1139550flB.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            c1139550flB.LJ(4);
        }
        ((LinkedHashMap) c1139550flB.LJFF).clear();
        c1139550flB.LJI.clear();
        c1139550flB.LIZJ = null;
        c1139550flB.LJ = 0L;
        LJIIZILJ();
    }

    @Override // X.AbstractC1139430fkz
    public final InterfaceC1141260fnw LIZIZ() {
        return C1140650fmx.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC1139430fkz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.EnumC1138990fkH r21, android.os.Message r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1139540flA.LJII(X.0fkH, android.os.Message):void");
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIIZ(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        this.LLJI = assetsModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlayDelay: ");
        sbLIZ.append(1000L);
        C20441214yg.LJIIIZ("gift_game__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.postDelayed(new ARunnableS50S0300000_17(this, c1136560fgM, assetsModel, 25), 1000L);
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        LJIILIIL(c1136560fgM, assetsModel);
    }

    public final void LJIJ(long j, long j2, long j3, long j4, String str) {
        long id;
        Object c098200Yq;
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (id == 0) {
            C20441214yg.LJ("gift_game__ttlive_gift_render", "respond_invite skipped: roomId == 0, response=reject");
            return;
        }
        C145900h7.LIZ(3, id, j4, "decline");
        MinuteGameRespondInviteParams minuteGameRespondInviteParams = new MinuteGameRespondInviteParams();
        minuteGameRespondInviteParams.roomId = id;
        minuteGameRespondInviteParams.gameplayId = j;
        minuteGameRespondInviteParams.response = 2;
        minuteGameRespondInviteParams.rejectReason = 3;
        MinuteGameRespondInviteParams.GiftRecord giftRecord = new MinuteGameRespondInviteParams.GiftRecord();
        giftRecord.msgId = j2;
        giftRecord.senderId = j3;
        giftRecord.giftId = j4;
        minuteGameRespondInviteParams.triggerGiftRecord = giftRecord;
        try {
            C480460Ism.LIZ().getClass();
            c098200Yq = ((IMinuteGameApi) C480460Ism.LIZLLL(IMinuteGameApi.class)).respondInvite(minuteGameRespondInviteParams).LJIILIIL(new C0UO0()).LJJLL(new AfS36S1000000_17(str, 3), new AfS36S1000000_17(str, 4));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("respond_invite dispatch threw, , source=");
            sbLIZ.append(str);
            C20441214yg.LJFF("gift_game__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }
}
