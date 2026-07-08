package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MU2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MU2 {
    public static final C0MU2 LIZ = new C0MU2();

    public static void LJI(IAITheaterCreationLauncher.EnterParams enterParams) {
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3C c1e3c = C1E3C.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParams);
        AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(enterParams, 745);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, awS587S0100000_8);
    }

    public static void LIZJ(Integer num, String str, String str2) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "chat");
        c0lab.LJ("chat_type", "private");
        c0lab.LJ("conversation_id", str);
        c0lab.LIZLLL(num, "is_sender");
        c0lab.LJ("card_key", str2);
        C2341909Fp.LIZ("im_card_click", c0lab.LIZ);
    }

    public static void LIZLLL(Integer num, String str, String str2) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "chat");
        c0lab.LJ("chat_type", "private");
        c0lab.LJ("conversation_id", str);
        c0lab.LIZLLL(num, "is_sender");
        c0lab.LJ("card_key", str2);
        C2341909Fp.LIZ("im_card_show", c0lab.LIZ);
    }

    public static void LJ(String str, String str2, String str3) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("message_id", str);
        c0lab.LJ("server_message_id", str2);
        c0lab.LJ("local_task_id", str3);
        C2341909Fp.LIZ("ai_theater_generating_delete_fail", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IAITheaterCreationLauncher.EnterParams LIZ(AIGCSocialModel aIGCSocialModel, boolean z, List list, boolean z2) {
        List<InputBlock> listSingletonList;
        CreativeInfo creativeInfo;
        String strLIZ;
        AIGCSocialModel aIGCSocialModelLIZ;
        List list2 = list;
        if (z || aIGCSocialModel == null || (listSingletonList = aIGCSocialModel.promptBlocks) == null) {
            InputBlock.Companion.getClass();
            listSingletonList = Collections.singletonList(C547680Ldu.LIZJ(""));
        }
        if (z2) {
            creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        } else {
            if (aIGCSocialModel == null || (strLIZ = aIGCSocialModel.creationId) == null) {
                strLIZ = C0DMI.LIZ();
            }
            creativeInfo = new CreativeInfo(strLIZ, 0, null, 6, null);
        }
        CreativeInitialModel creativeInitialModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        Object[] objArr77 = 0;
        Object[] objArr78 = 0;
        Object[] objArr79 = 0;
        Object[] objArr80 = 0;
        Object[] objArr81 = 0;
        Object[] objArr82 = 0;
        Object[] objArr83 = 0;
        Object[] objArr84 = 0;
        Object[] objArr85 = 0;
        Object[] objArr86 = 0;
        Object[] objArr87 = 0;
        Object[] objArr88 = 0;
        Object[] objArr89 = 0;
        Object[] objArr90 = 0;
        Object[] objArr91 = 0;
        Object[] objArr92 = 0;
        Object[] objArr93 = 0;
        Object[] objArr94 = 0;
        Object[] objArr95 = 0;
        Object[] objArr96 = 0;
        Object[] objArr97 = 0;
        Object[] objArr98 = 0;
        Object[] objArr99 = 0;
        Object[] objArr100 = 0;
        Object[] objArr101 = 0;
        Object[] objArr102 = 0;
        Object[] objArr103 = 0;
        Object[] objArr104 = 0;
        Object[] objArr105 = 0;
        Object[] objArr106 = 0;
        Object[] objArr107 = 0;
        Object[] objArr108 = 0;
        Object[] objArr109 = 0;
        Object[] objArr110 = 0;
        Object[] objArr111 = 0;
        Object[] objArr112 = 0;
        Object[] objArr113 = 0;
        Object[] objArr114 = 0;
        Object[] objArr115 = 0;
        Object[] objArr116 = 0;
        Object[] objArr117 = 0;
        Object[] objArr118 = 0;
        Object[] objArr119 = 0;
        Object[] objArr120 = 0;
        Object[] objArr121 = 0;
        Object[] objArr122 = 0;
        Object[] objArr123 = 0;
        Object[] objArr124 = 0;
        Object[] objArr125 = 0;
        Object[] objArr126 = 0;
        Object[] objArr127 = 0;
        Object[] objArr128 = 0;
        Object[] objArr129 = 0;
        Object[] objArr130 = 0;
        Object[] objArr131 = 0;
        Object[] objArr132 = 0;
        Object[] objArr133 = 0;
        Object[] objArr134 = 0;
        Object[] objArr135 = 0;
        Object[] objArr136 = 0;
        Object[] objArr137 = 0;
        Object[] objArr138 = 0;
        Object[] objArr139 = 0;
        Object[] objArr140 = 0;
        Object[] objArr141 = 0;
        Object[] objArr142 = 0;
        Object[] objArr143 = 0;
        Object[] objArr144 = 0;
        Object[] objArr145 = 0;
        Object[] objArr146 = 0;
        Object[] objArr147 = 0;
        Object[] objArr148 = 0;
        Object[] objArr149 = 0;
        Object[] objArr150 = 0;
        Object[] objArr151 = 0;
        Object[] objArr152 = 0;
        Object[] objArr153 = 0;
        Object[] objArr154 = 0;
        Object[] objArr155 = 0;
        Object[] objArr156 = 0;
        Object[] objArr157 = 0;
        Object[] objArr158 = 0;
        Object[] objArr159 = 0;
        Object[] objArr160 = 0;
        Object[] objArr161 = 0;
        Object[] objArr162 = 0;
        Object[] objArr163 = 0;
        Object[] objArr164 = 0;
        Object[] objArr165 = 0;
        Object[] objArr166 = 0;
        Object[] objArr167 = 0;
        Object[] objArr168 = 0;
        Object[] objArr169 = 0;
        Object[] objArr170 = 0;
        Object[] objArr171 = 0;
        Object[] objArr172 = 0;
        Object[] objArr173 = 0;
        Object[] objArr174 = 0;
        Object[] objArr175 = 0;
        Object[] objArr176 = 0;
        Object[] objArr177 = 0;
        Object[] objArr178 = 0;
        Object[] objArr179 = 0;
        Object[] objArr180 = 0;
        Object[] objArr181 = 0;
        Object[] objArr182 = 0;
        Object[] objArr183 = 0;
        Object[] objArr184 = 0;
        Object[] objArr185 = 0;
        Object[] objArr186 = 0;
        Object[] objArr187 = 0;
        Object[] objArr188 = 0;
        Object[] objArr189 = 0;
        Object[] objArr190 = 0;
        Object[] objArr191 = 0;
        Object[] objArr192 = 0;
        Object[] objArr193 = 0;
        Object[] objArr194 = 0;
        Object[] objArr195 = 0;
        Object[] objArr196 = 0;
        Object[] objArr197 = 0;
        Object[] objArr198 = 0;
        Object[] objArr199 = 0;
        Object[] objArr200 = 0;
        Object[] objArr201 = 0;
        Object[] objArr202 = 0;
        Object[] objArr203 = 0;
        Object[] objArr204 = 0;
        Object[] objArr205 = 0;
        AIGCEntranceInfo aIGCEntranceInfoLIZ = AIGCEntranceInfo.LIZ(C550740Liq.LIZ("chat_ai_theater", AIGC.AICreationSceneName.CHAT_AI_THEATER.INSTANCE, AIGC.RefPageName.Chat.INSTANCE, false), null, null, 0, null, null, false, false, false, null, null, "chat", null, AIGC.RecallWay.DM_CARD_GENERATE_FAILED.INSTANCE, null, false, false, 1038335);
        if (aIGCSocialModel != null) {
            aIGCSocialModelLIZ = AIGCSocialModel.LIZ(aIGCSocialModel, null, null, listSingletonList, null, creativeInfo.getCreationId(), 191);
        } else {
            aIGCSocialModelLIZ = null;
        }
        int i = 0;
        Object[] objArr206 = 0;
        Object[] objArr207 = 0;
        Object[] objArr208 = 0;
        Object[] objArr209 = 0;
        Object[] objArr210 = 0;
        AITheaterSessionModel aITheaterSessionModel = new AITheaterSessionModel(null, creativeInfo.getCreationId(), creativeInfo.getVersion(), null, 9, null);
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        int i2 = -1;
        return new IAITheaterCreationLauncher.EnterParams(creativeInfo, new CreativeModel(creativeInitialModel, objArr205 == true ? 1 : 0, objArr204 == true ? 1 : 0, objArr203 == true ? 1 : 0, objArr202 == true ? 1 : 0, objArr201 == true ? 1 : 0, objArr200 == true ? 1 : 0, objArr199 == true ? 1 : 0, objArr198 == true ? 1 : 0, objArr197 == true ? 1 : 0, objArr196 == true ? 1 : 0, objArr195 == true ? 1 : 0, objArr194 == true ? 1 : 0, objArr193 == true ? 1 : 0, objArr192 == true ? 1 : 0, objArr191 == true ? 1 : 0, objArr190 == true ? 1 : 0, objArr189 == true ? 1 : 0, objArr188 == true ? 1 : 0, objArr187 == true ? 1 : 0, objArr186 == true ? 1 : 0, objArr185 == true ? 1 : 0, objArr184 == true ? 1 : 0, objArr183 == true ? 1 : 0, objArr182 == true ? 1 : 0, objArr181 == true ? 1 : 0, objArr180 == true ? 1 : 0, objArr179 == true ? 1 : 0, objArr178 == true ? 1 : 0, objArr177 == true ? 1 : 0, objArr176 == true ? 1 : 0, objArr175 == true ? 1 : 0, objArr174 == true ? 1 : 0, objArr173 == true ? 1 : 0, objArr172 == true ? 1 : 0, objArr171 == true ? 1 : 0, objArr170 == true ? 1 : 0, objArr169 == true ? 1 : 0, objArr168 == true ? 1 : 0, objArr167 == true ? 1 : 0, i, objArr166 == true ? 1 : 0, objArr165 == true ? 1 : 0, objArr164 == true ? 1 : 0, objArr163 == true ? 1 : 0, objArr162 == true ? 1 : 0, objArr161 == true ? 1 : 0, objArr160 == true ? 1 : 0, objArr159 == true ? 1 : 0, objArr158 == true ? 1 : 0, objArr157 == true ? 1 : 0, objArr156 == true ? 1 : 0, objArr155 == true ? 1 : 0, objArr154 == true ? 1 : 0, objArr153 == true ? 1 : 0, objArr210 == true ? 1 : 0, objArr152 == true ? 1 : 0, objArr151 == true ? 1 : 0, objArr150 == true ? 1 : 0, objArr149 == true ? 1 : 0, objArr148 == true ? 1 : 0, objArr147 == true ? 1 : 0, objArr146 == true ? 1 : 0, objArr145 == true ? 1 : 0, objArr144 == true ? 1 : 0, objArr143 == true ? 1 : 0, objArr142 == true ? 1 : 0, objArr141 == true ? 1 : 0, objArr140 == true ? 1 : 0, objArr139 == true ? 1 : 0, objArr138 == true ? 1 : 0, objArr137 == true ? 1 : 0, objArr136 == true ? 1 : 0, objArr135 == true ? 1 : 0, objArr134 == true ? 1 : 0, objArr133 == true ? 1 : 0, objArr132 == true ? 1 : 0, objArr131 == true ? 1 : 0, objArr130 == true ? 1 : 0, objArr129 == true ? 1 : 0, objArr128 == true ? 1 : 0, objArr127 == true ? 1 : 0, objArr126 == true ? 1 : 0, objArr125 == true ? 1 : 0, objArr124 == true ? 1 : 0, objArr123 == true ? 1 : 0, objArr122 == true ? 1 : 0, objArr121 == true ? 1 : 0, objArr120 == true ? 1 : 0, objArr119 == true ? 1 : 0, objArr118 == true ? 1 : 0, objArr117 == true ? 1 : 0, objArr209 == true ? 1 : 0, objArr116 == true ? 1 : 0, objArr115 == true ? 1 : 0, objArr114 == true ? 1 : 0, objArr113 == true ? 1 : 0, objArr112 == true ? 1 : 0, objArr111 == true ? 1 : 0, objArr110 == true ? 1 : 0, objArr109 == true ? 1 : 0, objArr108 == true ? 1 : 0, objArr107 == true ? 1 : 0, objArr106 == true ? 1 : 0, objArr105 == true ? 1 : 0, objArr104 == true ? 1 : 0, objArr103 == true ? 1 : 0, objArr102 == true ? 1 : 0, objArr101 == true ? 1 : 0, objArr100 == true ? 1 : 0, objArr99 == true ? 1 : 0, objArr98 == true ? 1 : 0, objArr97 == true ? 1 : 0, objArr96 == true ? 1 : 0, objArr95 == true ? 1 : 0, objArr94 == true ? 1 : 0, objArr93 == true ? 1 : 0, objArr92 == true ? 1 : 0, objArr91 == true ? 1 : 0, objArr90 == true ? 1 : 0, objArr89 == true ? 1 : 0, objArr88 == true ? 1 : 0, objArr87 == true ? 1 : 0, objArr86 == true ? 1 : 0, objArr85 == true ? 1 : 0, objArr84 == true ? 1 : 0, objArr83 == true ? 1 : 0, objArr82 == true ? 1 : 0, objArr81 == true ? 1 : 0, objArr80 == true ? 1 : 0, objArr79 == true ? 1 : 0, objArr78 == true ? 1 : 0, objArr77 == true ? 1 : 0, objArr76 == true ? 1 : 0, objArr75 == true ? 1 : 0, objArr74 == true ? 1 : 0, objArr73 == true ? 1 : 0, objArr72 == true ? 1 : 0, objArr71 == true ? 1 : 0, objArr70 == true ? 1 : 0, objArr69 == true ? 1 : 0, objArr68 == true ? 1 : 0, objArr67 == true ? 1 : 0, objArr66 == true ? 1 : 0, objArr65 == true ? 1 : 0, creativeInfo, objArr64 == true ? 1 : 0, objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr56 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, objArr53 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr42 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr37 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr30 == true ? 1 : 0, objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr208 == true ? 1 : 0, objArr207 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr206 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, new AIGCBusinessModelSet(new AITheaterModel(new AITheaterCreationModel(aITheaterSessionModel, new WritableAITheaterGenerationModel(listSingletonList, null, list2, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194298, null)), null, null, null, 14, null), null, null, 6, null), objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i2, i2, i2, i2, -131073, i2, 2097149, objArr == true ? 1 : 0), null, aIGCSocialModelLIZ, aIGCEntranceInfoLIZ, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MU2.LJII(com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams, java.lang.String, java.lang.Long, java.lang.String):void");
    }

    public static void LJFF(Integer num, Integer num2, String str, String str2, String str3) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("message_id", str);
        c0lab.LJ("server_message_id", str2);
        c0lab.LJ("local_task_id", str3);
        c0lab.LIZLLL(num, "is_success");
        c0lab.LIZLLL(num2, "error_code");
        c0lab.LIZIZ(System.currentTimeMillis(), "time_stamp");
        C2341909Fp.LIZ("ai_theater_social_end", c0lab.LIZ);
    }
}
