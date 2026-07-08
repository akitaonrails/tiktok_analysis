package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MUK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUK {
    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeModel LJIIIIZZ() {
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        Object[] objArr86 = 0 == true ? 1 : 0;
        Object[] objArr87 = 0 == true ? 1 : 0;
        Object[] objArr88 = 0 == true ? 1 : 0;
        Object[] objArr89 = 0 == true ? 1 : 0;
        Object[] objArr90 = 0 == true ? 1 : 0;
        Object[] objArr91 = 0 == true ? 1 : 0;
        Object[] objArr92 = 0 == true ? 1 : 0;
        Object[] objArr93 = 0 == true ? 1 : 0;
        Object[] objArr94 = 0 == true ? 1 : 0;
        Object[] objArr95 = 0 == true ? 1 : 0;
        Object[] objArr96 = 0 == true ? 1 : 0;
        Object[] objArr97 = 0 == true ? 1 : 0;
        Object[] objArr98 = 0 == true ? 1 : 0;
        Object[] objArr99 = 0 == true ? 1 : 0;
        Object[] objArr100 = 0 == true ? 1 : 0;
        Object[] objArr101 = 0 == true ? 1 : 0;
        Object[] objArr102 = 0 == true ? 1 : 0;
        Object[] objArr103 = 0 == true ? 1 : 0;
        Object[] objArr104 = 0 == true ? 1 : 0;
        Object[] objArr105 = 0 == true ? 1 : 0;
        Object[] objArr106 = 0 == true ? 1 : 0;
        Object[] objArr107 = 0 == true ? 1 : 0;
        Object[] objArr108 = 0 == true ? 1 : 0;
        Object[] objArr109 = 0 == true ? 1 : 0;
        Object[] objArr110 = 0 == true ? 1 : 0;
        Object[] objArr111 = 0 == true ? 1 : 0;
        Object[] objArr112 = 0 == true ? 1 : 0;
        Object[] objArr113 = 0 == true ? 1 : 0;
        Object[] objArr114 = 0 == true ? 1 : 0;
        Object[] objArr115 = 0 == true ? 1 : 0;
        Object[] objArr116 = 0 == true ? 1 : 0;
        Object[] objArr117 = 0 == true ? 1 : 0;
        Object[] objArr118 = 0 == true ? 1 : 0;
        Object[] objArr119 = 0 == true ? 1 : 0;
        Object[] objArr120 = 0 == true ? 1 : 0;
        Object[] objArr121 = 0 == true ? 1 : 0;
        Object[] objArr122 = 0 == true ? 1 : 0;
        Object[] objArr123 = 0 == true ? 1 : 0;
        Object[] objArr124 = 0 == true ? 1 : 0;
        Object[] objArr125 = 0 == true ? 1 : 0;
        Object[] objArr126 = 0 == true ? 1 : 0;
        Object[] objArr127 = 0 == true ? 1 : 0;
        Object[] objArr128 = 0 == true ? 1 : 0;
        Object[] objArr129 = 0 == true ? 1 : 0;
        Object[] objArr130 = 0 == true ? 1 : 0;
        Object[] objArr131 = 0 == true ? 1 : 0;
        Object[] objArr132 = 0 == true ? 1 : 0;
        Object[] objArr133 = 0 == true ? 1 : 0;
        Object[] objArr134 = 0 == true ? 1 : 0;
        Object[] objArr135 = 0 == true ? 1 : 0;
        Object[] objArr136 = 0 == true ? 1 : 0;
        Object[] objArr137 = 0 == true ? 1 : 0;
        Object[] objArr138 = 0 == true ? 1 : 0;
        Object[] objArr139 = 0 == true ? 1 : 0;
        Object[] objArr140 = 0 == true ? 1 : 0;
        Object[] objArr141 = 0 == true ? 1 : 0;
        Object[] objArr142 = 0 == true ? 1 : 0;
        Object[] objArr143 = 0 == true ? 1 : 0;
        Object[] objArr144 = 0 == true ? 1 : 0;
        Object[] objArr145 = 0 == true ? 1 : 0;
        Object[] objArr146 = 0 == true ? 1 : 0;
        Object[] objArr147 = 0 == true ? 1 : 0;
        Object[] objArr148 = 0 == true ? 1 : 0;
        Object[] objArr149 = 0 == true ? 1 : 0;
        Object[] objArr150 = 0 == true ? 1 : 0;
        Object[] objArr151 = 0 == true ? 1 : 0;
        Object[] objArr152 = 0 == true ? 1 : 0;
        Object[] objArr153 = 0 == true ? 1 : 0;
        Object[] objArr154 = 0 == true ? 1 : 0;
        Object[] objArr155 = 0 == true ? 1 : 0;
        Object[] objArr156 = 0 == true ? 1 : 0;
        Object[] objArr157 = 0 == true ? 1 : 0;
        Object[] objArr158 = 0 == true ? 1 : 0;
        Object[] objArr159 = 0 == true ? 1 : 0;
        Object[] objArr160 = 0 == true ? 1 : 0;
        Object[] objArr161 = 0 == true ? 1 : 0;
        Object[] objArr162 = 0 == true ? 1 : 0;
        Object[] objArr163 = 0 == true ? 1 : 0;
        Object[] objArr164 = 0 == true ? 1 : 0;
        Object[] objArr165 = 0 == true ? 1 : 0;
        Object[] objArr166 = 0 == true ? 1 : 0;
        Object[] objArr167 = 0 == true ? 1 : 0;
        Object[] objArr168 = 0 == true ? 1 : 0;
        Object[] objArr169 = 0 == true ? 1 : 0;
        Object[] objArr170 = 0 == true ? 1 : 0;
        Object[] objArr171 = 0 == true ? 1 : 0;
        Object[] objArr172 = 0 == true ? 1 : 0;
        Object[] objArr173 = 0 == true ? 1 : 0;
        Object[] objArr174 = 0 == true ? 1 : 0;
        Object[] objArr175 = 0 == true ? 1 : 0;
        Object[] objArr176 = 0 == true ? 1 : 0;
        Object[] objArr177 = 0 == true ? 1 : 0;
        Object[] objArr178 = 0 == true ? 1 : 0;
        Object[] objArr179 = 0 == true ? 1 : 0;
        Object[] objArr180 = 0 == true ? 1 : 0;
        Object[] objArr181 = 0 == true ? 1 : 0;
        Object[] objArr182 = 0 == true ? 1 : 0;
        Object[] objArr183 = 0 == true ? 1 : 0;
        Object[] objArr184 = 0 == true ? 1 : 0;
        Object[] objArr185 = 0 == true ? 1 : 0;
        Object[] objArr186 = 0 == true ? 1 : 0;
        Object[] objArr187 = 0 == true ? 1 : 0;
        Object[] objArr188 = 0 == true ? 1 : 0;
        Object[] objArr189 = 0 == true ? 1 : 0;
        Object[] objArr190 = 0 == true ? 1 : 0;
        Object[] objArr191 = 0 == true ? 1 : 0;
        Object[] objArr192 = 0 == true ? 1 : 0;
        Object[] objArr193 = 0 == true ? 1 : 0;
        Object[] objArr194 = 0 == true ? 1 : 0;
        Object[] objArr195 = 0 == true ? 1 : 0;
        Object[] objArr196 = 0 == true ? 1 : 0;
        Object[] objArr197 = 0 == true ? 1 : 0;
        Object[] objArr198 = 0 == true ? 1 : 0;
        Object[] objArr199 = 0 == true ? 1 : 0;
        Object[] objArr200 = 0 == true ? 1 : 0;
        Object[] objArr201 = 0 == true ? 1 : 0;
        Object[] objArr202 = 0 == true ? 1 : 0;
        Object[] objArr203 = 0 == true ? 1 : 0;
        Object[] objArr204 = 0 == true ? 1 : 0;
        Object[] objArr205 = 0 == true ? 1 : 0;
        Object[] objArr206 = 0 == true ? 1 : 0;
        Object[] objArr207 = 0 == true ? 1 : 0;
        CreativeModel creativeModel = new CreativeModel(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, 0 == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr183, 0 == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
        creativeModel.isCopiedModel = true;
        return creativeModel;
    }

    public static final String LIZ(CreativeModel creativeModel) {
        AIGCGenerationParam aIGCGenerationParam;
        AIGenerationType aIGenerationType;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null || (aIGenerationType = aIGCGenerationParam.aiPlaygroundGenerateParams.aiPlaygroundGenerationType) == AIGenerationType.NONE) {
            return null;
        }
        return C380220EvU.LIZ(aIGenerationType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeModel LIZIZ(Intent intent) {
        CreativeModel creativeModel = (CreativeModel) intent.getParcelableExtra("creative_model");
        if (creativeModel == null) {
            int i = -1;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            Object[] objArr14 = 0 == true ? 1 : 0;
            Object[] objArr15 = 0 == true ? 1 : 0;
            Object[] objArr16 = 0 == true ? 1 : 0;
            Object[] objArr17 = 0 == true ? 1 : 0;
            Object[] objArr18 = 0 == true ? 1 : 0;
            Object[] objArr19 = 0 == true ? 1 : 0;
            Object[] objArr20 = 0 == true ? 1 : 0;
            Object[] objArr21 = 0 == true ? 1 : 0;
            Object[] objArr22 = 0 == true ? 1 : 0;
            Object[] objArr23 = 0 == true ? 1 : 0;
            Object[] objArr24 = 0 == true ? 1 : 0;
            Object[] objArr25 = 0 == true ? 1 : 0;
            Object[] objArr26 = 0 == true ? 1 : 0;
            Object[] objArr27 = 0 == true ? 1 : 0;
            Object[] objArr28 = 0 == true ? 1 : 0;
            Object[] objArr29 = 0 == true ? 1 : 0;
            Object[] objArr30 = 0 == true ? 1 : 0;
            Object[] objArr31 = 0 == true ? 1 : 0;
            Object[] objArr32 = 0 == true ? 1 : 0;
            Object[] objArr33 = 0 == true ? 1 : 0;
            Object[] objArr34 = 0 == true ? 1 : 0;
            Object[] objArr35 = 0 == true ? 1 : 0;
            Object[] objArr36 = 0 == true ? 1 : 0;
            Object[] objArr37 = 0 == true ? 1 : 0;
            Object[] objArr38 = 0 == true ? 1 : 0;
            Object[] objArr39 = 0 == true ? 1 : 0;
            Object[] objArr40 = 0 == true ? 1 : 0;
            Object[] objArr41 = 0 == true ? 1 : 0;
            Object[] objArr42 = 0 == true ? 1 : 0;
            Object[] objArr43 = 0 == true ? 1 : 0;
            Object[] objArr44 = 0 == true ? 1 : 0;
            Object[] objArr45 = 0 == true ? 1 : 0;
            Object[] objArr46 = 0 == true ? 1 : 0;
            Object[] objArr47 = 0 == true ? 1 : 0;
            Object[] objArr48 = 0 == true ? 1 : 0;
            Object[] objArr49 = 0 == true ? 1 : 0;
            Object[] objArr50 = 0 == true ? 1 : 0;
            Object[] objArr51 = 0 == true ? 1 : 0;
            Object[] objArr52 = 0 == true ? 1 : 0;
            Object[] objArr53 = 0 == true ? 1 : 0;
            Object[] objArr54 = 0 == true ? 1 : 0;
            Object[] objArr55 = 0 == true ? 1 : 0;
            Object[] objArr56 = 0 == true ? 1 : 0;
            Object[] objArr57 = 0 == true ? 1 : 0;
            Object[] objArr58 = 0 == true ? 1 : 0;
            Object[] objArr59 = 0 == true ? 1 : 0;
            Object[] objArr60 = 0 == true ? 1 : 0;
            Object[] objArr61 = 0 == true ? 1 : 0;
            Object[] objArr62 = 0 == true ? 1 : 0;
            Object[] objArr63 = 0 == true ? 1 : 0;
            Object[] objArr64 = 0 == true ? 1 : 0;
            Object[] objArr65 = 0 == true ? 1 : 0;
            Object[] objArr66 = 0 == true ? 1 : 0;
            Object[] objArr67 = 0 == true ? 1 : 0;
            Object[] objArr68 = 0 == true ? 1 : 0;
            Object[] objArr69 = 0 == true ? 1 : 0;
            Object[] objArr70 = 0 == true ? 1 : 0;
            Object[] objArr71 = 0 == true ? 1 : 0;
            Object[] objArr72 = 0 == true ? 1 : 0;
            Object[] objArr73 = 0 == true ? 1 : 0;
            Object[] objArr74 = 0 == true ? 1 : 0;
            Object[] objArr75 = 0 == true ? 1 : 0;
            Object[] objArr76 = 0 == true ? 1 : 0;
            Object[] objArr77 = 0 == true ? 1 : 0;
            Object[] objArr78 = 0 == true ? 1 : 0;
            Object[] objArr79 = 0 == true ? 1 : 0;
            Object[] objArr80 = 0 == true ? 1 : 0;
            Object[] objArr81 = 0 == true ? 1 : 0;
            Object[] objArr82 = 0 == true ? 1 : 0;
            Object[] objArr83 = 0 == true ? 1 : 0;
            Object[] objArr84 = 0 == true ? 1 : 0;
            Object[] objArr85 = 0 == true ? 1 : 0;
            Object[] objArr86 = 0 == true ? 1 : 0;
            Object[] objArr87 = 0 == true ? 1 : 0;
            Object[] objArr88 = 0 == true ? 1 : 0;
            Object[] objArr89 = 0 == true ? 1 : 0;
            Object[] objArr90 = 0 == true ? 1 : 0;
            Object[] objArr91 = 0 == true ? 1 : 0;
            Object[] objArr92 = 0 == true ? 1 : 0;
            Object[] objArr93 = 0 == true ? 1 : 0;
            Object[] objArr94 = 0 == true ? 1 : 0;
            Object[] objArr95 = 0 == true ? 1 : 0;
            Object[] objArr96 = 0 == true ? 1 : 0;
            Object[] objArr97 = 0 == true ? 1 : 0;
            Object[] objArr98 = 0 == true ? 1 : 0;
            Object[] objArr99 = 0 == true ? 1 : 0;
            Object[] objArr100 = 0 == true ? 1 : 0;
            Object[] objArr101 = 0 == true ? 1 : 0;
            Object[] objArr102 = 0 == true ? 1 : 0;
            Object[] objArr103 = 0 == true ? 1 : 0;
            Object[] objArr104 = 0 == true ? 1 : 0;
            Object[] objArr105 = 0 == true ? 1 : 0;
            Object[] objArr106 = 0 == true ? 1 : 0;
            Object[] objArr107 = 0 == true ? 1 : 0;
            Object[] objArr108 = 0 == true ? 1 : 0;
            Object[] objArr109 = 0 == true ? 1 : 0;
            Object[] objArr110 = 0 == true ? 1 : 0;
            Object[] objArr111 = 0 == true ? 1 : 0;
            Object[] objArr112 = 0 == true ? 1 : 0;
            Object[] objArr113 = 0 == true ? 1 : 0;
            Object[] objArr114 = 0 == true ? 1 : 0;
            Object[] objArr115 = 0 == true ? 1 : 0;
            Object[] objArr116 = 0 == true ? 1 : 0;
            Object[] objArr117 = 0 == true ? 1 : 0;
            Object[] objArr118 = 0 == true ? 1 : 0;
            Object[] objArr119 = 0 == true ? 1 : 0;
            Object[] objArr120 = 0 == true ? 1 : 0;
            Object[] objArr121 = 0 == true ? 1 : 0;
            Object[] objArr122 = 0 == true ? 1 : 0;
            Object[] objArr123 = 0 == true ? 1 : 0;
            Object[] objArr124 = 0 == true ? 1 : 0;
            Object[] objArr125 = 0 == true ? 1 : 0;
            Object[] objArr126 = 0 == true ? 1 : 0;
            Object[] objArr127 = 0 == true ? 1 : 0;
            Object[] objArr128 = 0 == true ? 1 : 0;
            Object[] objArr129 = 0 == true ? 1 : 0;
            Object[] objArr130 = 0 == true ? 1 : 0;
            Object[] objArr131 = 0 == true ? 1 : 0;
            Object[] objArr132 = 0 == true ? 1 : 0;
            Object[] objArr133 = 0 == true ? 1 : 0;
            Object[] objArr134 = 0 == true ? 1 : 0;
            Object[] objArr135 = 0 == true ? 1 : 0;
            Object[] objArr136 = 0 == true ? 1 : 0;
            Object[] objArr137 = 0 == true ? 1 : 0;
            Object[] objArr138 = 0 == true ? 1 : 0;
            Object[] objArr139 = 0 == true ? 1 : 0;
            Object[] objArr140 = 0 == true ? 1 : 0;
            Object[] objArr141 = 0 == true ? 1 : 0;
            Object[] objArr142 = 0 == true ? 1 : 0;
            Object[] objArr143 = 0 == true ? 1 : 0;
            Object[] objArr144 = 0 == true ? 1 : 0;
            Object[] objArr145 = 0 == true ? 1 : 0;
            Object[] objArr146 = 0 == true ? 1 : 0;
            Object[] objArr147 = 0 == true ? 1 : 0;
            Object[] objArr148 = 0 == true ? 1 : 0;
            Object[] objArr149 = 0 == true ? 1 : 0;
            Object[] objArr150 = 0 == true ? 1 : 0;
            Object[] objArr151 = 0 == true ? 1 : 0;
            Object[] objArr152 = 0 == true ? 1 : 0;
            Object[] objArr153 = 0 == true ? 1 : 0;
            Object[] objArr154 = 0 == true ? 1 : 0;
            Object[] objArr155 = 0 == true ? 1 : 0;
            Object[] objArr156 = 0 == true ? 1 : 0;
            Object[] objArr157 = 0 == true ? 1 : 0;
            Object[] objArr158 = 0 == true ? 1 : 0;
            Object[] objArr159 = 0 == true ? 1 : 0;
            Object[] objArr160 = 0 == true ? 1 : 0;
            Object[] objArr161 = 0 == true ? 1 : 0;
            Object[] objArr162 = 0 == true ? 1 : 0;
            Object[] objArr163 = 0 == true ? 1 : 0;
            Object[] objArr164 = 0 == true ? 1 : 0;
            Object[] objArr165 = 0 == true ? 1 : 0;
            Object[] objArr166 = 0 == true ? 1 : 0;
            Object[] objArr167 = 0 == true ? 1 : 0;
            Object[] objArr168 = 0 == true ? 1 : 0;
            Object[] objArr169 = 0 == true ? 1 : 0;
            Object[] objArr170 = 0 == true ? 1 : 0;
            Object[] objArr171 = 0 == true ? 1 : 0;
            Object[] objArr172 = 0 == true ? 1 : 0;
            Object[] objArr173 = 0 == true ? 1 : 0;
            Object[] objArr174 = 0 == true ? 1 : 0;
            Object[] objArr175 = 0 == true ? 1 : 0;
            Object[] objArr176 = 0 == true ? 1 : 0;
            Object[] objArr177 = 0 == true ? 1 : 0;
            Object[] objArr178 = 0 == true ? 1 : 0;
            Object[] objArr179 = 0 == true ? 1 : 0;
            Object[] objArr180 = 0 == true ? 1 : 0;
            Object[] objArr181 = 0 == true ? 1 : 0;
            Object[] objArr182 = 0 == true ? 1 : 0;
            Object[] objArr183 = 0 == true ? 1 : 0;
            Object[] objArr184 = 0 == true ? 1 : 0;
            Object[] objArr185 = 0 == true ? 1 : 0;
            Object[] objArr186 = 0 == true ? 1 : 0;
            Object[] objArr187 = 0 == true ? 1 : 0;
            Object[] objArr188 = 0 == true ? 1 : 0;
            Object[] objArr189 = 0 == true ? 1 : 0;
            Object[] objArr190 = 0 == true ? 1 : 0;
            Object[] objArr191 = 0 == true ? 1 : 0;
            Object[] objArr192 = 0 == true ? 1 : 0;
            Object[] objArr193 = 0 == true ? 1 : 0;
            Object[] objArr194 = 0 == true ? 1 : 0;
            Object[] objArr195 = 0 == true ? 1 : 0;
            Object[] objArr196 = 0 == true ? 1 : 0;
            Object[] objArr197 = 0 == true ? 1 : 0;
            Object[] objArr198 = 0 == true ? 1 : 0;
            Object[] objArr199 = 0 == true ? 1 : 0;
            Object[] objArr200 = 0 == true ? 1 : 0;
            Object[] objArr201 = 0 == true ? 1 : 0;
            Object[] objArr202 = 0 == true ? 1 : 0;
            Object[] objArr203 = 0 == true ? 1 : 0;
            Object[] objArr204 = 0 == true ? 1 : 0;
            Object[] objArr205 = 0 == true ? 1 : 0;
            Object[] objArr206 = 0 == true ? 1 : 0;
            Object[] objArr207 = 0 == true ? 1 : 0;
            creativeModel = new CreativeModel(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, 0 == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr183, 0 == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
        }
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) intent.getParcelableExtra("creative_initial_model");
        if (creativeInitialModel != null) {
            creativeModel.initialModel = creativeInitialModel;
        }
        if (creativeModel.initialModel.vqEvaluationConfig != null) {
            creativeModel.checkPointModel.enableCheckPoint = false;
        }
        return creativeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeModel LIZJ(Bundle bundle) {
        CreativeModel creativeModel = (CreativeModel) bundle.getParcelable("creative_model");
        if (creativeModel == null) {
            int i = -1;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            Object[] objArr14 = 0 == true ? 1 : 0;
            Object[] objArr15 = 0 == true ? 1 : 0;
            Object[] objArr16 = 0 == true ? 1 : 0;
            Object[] objArr17 = 0 == true ? 1 : 0;
            Object[] objArr18 = 0 == true ? 1 : 0;
            Object[] objArr19 = 0 == true ? 1 : 0;
            Object[] objArr20 = 0 == true ? 1 : 0;
            Object[] objArr21 = 0 == true ? 1 : 0;
            Object[] objArr22 = 0 == true ? 1 : 0;
            Object[] objArr23 = 0 == true ? 1 : 0;
            Object[] objArr24 = 0 == true ? 1 : 0;
            Object[] objArr25 = 0 == true ? 1 : 0;
            Object[] objArr26 = 0 == true ? 1 : 0;
            Object[] objArr27 = 0 == true ? 1 : 0;
            Object[] objArr28 = 0 == true ? 1 : 0;
            Object[] objArr29 = 0 == true ? 1 : 0;
            Object[] objArr30 = 0 == true ? 1 : 0;
            Object[] objArr31 = 0 == true ? 1 : 0;
            Object[] objArr32 = 0 == true ? 1 : 0;
            Object[] objArr33 = 0 == true ? 1 : 0;
            Object[] objArr34 = 0 == true ? 1 : 0;
            Object[] objArr35 = 0 == true ? 1 : 0;
            Object[] objArr36 = 0 == true ? 1 : 0;
            Object[] objArr37 = 0 == true ? 1 : 0;
            Object[] objArr38 = 0 == true ? 1 : 0;
            Object[] objArr39 = 0 == true ? 1 : 0;
            Object[] objArr40 = 0 == true ? 1 : 0;
            Object[] objArr41 = 0 == true ? 1 : 0;
            Object[] objArr42 = 0 == true ? 1 : 0;
            Object[] objArr43 = 0 == true ? 1 : 0;
            Object[] objArr44 = 0 == true ? 1 : 0;
            Object[] objArr45 = 0 == true ? 1 : 0;
            Object[] objArr46 = 0 == true ? 1 : 0;
            Object[] objArr47 = 0 == true ? 1 : 0;
            Object[] objArr48 = 0 == true ? 1 : 0;
            Object[] objArr49 = 0 == true ? 1 : 0;
            Object[] objArr50 = 0 == true ? 1 : 0;
            Object[] objArr51 = 0 == true ? 1 : 0;
            Object[] objArr52 = 0 == true ? 1 : 0;
            Object[] objArr53 = 0 == true ? 1 : 0;
            Object[] objArr54 = 0 == true ? 1 : 0;
            Object[] objArr55 = 0 == true ? 1 : 0;
            Object[] objArr56 = 0 == true ? 1 : 0;
            Object[] objArr57 = 0 == true ? 1 : 0;
            Object[] objArr58 = 0 == true ? 1 : 0;
            Object[] objArr59 = 0 == true ? 1 : 0;
            Object[] objArr60 = 0 == true ? 1 : 0;
            Object[] objArr61 = 0 == true ? 1 : 0;
            Object[] objArr62 = 0 == true ? 1 : 0;
            Object[] objArr63 = 0 == true ? 1 : 0;
            Object[] objArr64 = 0 == true ? 1 : 0;
            Object[] objArr65 = 0 == true ? 1 : 0;
            Object[] objArr66 = 0 == true ? 1 : 0;
            Object[] objArr67 = 0 == true ? 1 : 0;
            Object[] objArr68 = 0 == true ? 1 : 0;
            Object[] objArr69 = 0 == true ? 1 : 0;
            Object[] objArr70 = 0 == true ? 1 : 0;
            Object[] objArr71 = 0 == true ? 1 : 0;
            Object[] objArr72 = 0 == true ? 1 : 0;
            Object[] objArr73 = 0 == true ? 1 : 0;
            Object[] objArr74 = 0 == true ? 1 : 0;
            Object[] objArr75 = 0 == true ? 1 : 0;
            Object[] objArr76 = 0 == true ? 1 : 0;
            Object[] objArr77 = 0 == true ? 1 : 0;
            Object[] objArr78 = 0 == true ? 1 : 0;
            Object[] objArr79 = 0 == true ? 1 : 0;
            Object[] objArr80 = 0 == true ? 1 : 0;
            Object[] objArr81 = 0 == true ? 1 : 0;
            Object[] objArr82 = 0 == true ? 1 : 0;
            Object[] objArr83 = 0 == true ? 1 : 0;
            Object[] objArr84 = 0 == true ? 1 : 0;
            Object[] objArr85 = 0 == true ? 1 : 0;
            Object[] objArr86 = 0 == true ? 1 : 0;
            Object[] objArr87 = 0 == true ? 1 : 0;
            Object[] objArr88 = 0 == true ? 1 : 0;
            Object[] objArr89 = 0 == true ? 1 : 0;
            Object[] objArr90 = 0 == true ? 1 : 0;
            Object[] objArr91 = 0 == true ? 1 : 0;
            Object[] objArr92 = 0 == true ? 1 : 0;
            Object[] objArr93 = 0 == true ? 1 : 0;
            Object[] objArr94 = 0 == true ? 1 : 0;
            Object[] objArr95 = 0 == true ? 1 : 0;
            Object[] objArr96 = 0 == true ? 1 : 0;
            Object[] objArr97 = 0 == true ? 1 : 0;
            Object[] objArr98 = 0 == true ? 1 : 0;
            Object[] objArr99 = 0 == true ? 1 : 0;
            Object[] objArr100 = 0 == true ? 1 : 0;
            Object[] objArr101 = 0 == true ? 1 : 0;
            Object[] objArr102 = 0 == true ? 1 : 0;
            Object[] objArr103 = 0 == true ? 1 : 0;
            Object[] objArr104 = 0 == true ? 1 : 0;
            Object[] objArr105 = 0 == true ? 1 : 0;
            Object[] objArr106 = 0 == true ? 1 : 0;
            Object[] objArr107 = 0 == true ? 1 : 0;
            Object[] objArr108 = 0 == true ? 1 : 0;
            Object[] objArr109 = 0 == true ? 1 : 0;
            Object[] objArr110 = 0 == true ? 1 : 0;
            Object[] objArr111 = 0 == true ? 1 : 0;
            Object[] objArr112 = 0 == true ? 1 : 0;
            Object[] objArr113 = 0 == true ? 1 : 0;
            Object[] objArr114 = 0 == true ? 1 : 0;
            Object[] objArr115 = 0 == true ? 1 : 0;
            Object[] objArr116 = 0 == true ? 1 : 0;
            Object[] objArr117 = 0 == true ? 1 : 0;
            Object[] objArr118 = 0 == true ? 1 : 0;
            Object[] objArr119 = 0 == true ? 1 : 0;
            Object[] objArr120 = 0 == true ? 1 : 0;
            Object[] objArr121 = 0 == true ? 1 : 0;
            Object[] objArr122 = 0 == true ? 1 : 0;
            Object[] objArr123 = 0 == true ? 1 : 0;
            Object[] objArr124 = 0 == true ? 1 : 0;
            Object[] objArr125 = 0 == true ? 1 : 0;
            Object[] objArr126 = 0 == true ? 1 : 0;
            Object[] objArr127 = 0 == true ? 1 : 0;
            Object[] objArr128 = 0 == true ? 1 : 0;
            Object[] objArr129 = 0 == true ? 1 : 0;
            Object[] objArr130 = 0 == true ? 1 : 0;
            Object[] objArr131 = 0 == true ? 1 : 0;
            Object[] objArr132 = 0 == true ? 1 : 0;
            Object[] objArr133 = 0 == true ? 1 : 0;
            Object[] objArr134 = 0 == true ? 1 : 0;
            Object[] objArr135 = 0 == true ? 1 : 0;
            Object[] objArr136 = 0 == true ? 1 : 0;
            Object[] objArr137 = 0 == true ? 1 : 0;
            Object[] objArr138 = 0 == true ? 1 : 0;
            Object[] objArr139 = 0 == true ? 1 : 0;
            Object[] objArr140 = 0 == true ? 1 : 0;
            Object[] objArr141 = 0 == true ? 1 : 0;
            Object[] objArr142 = 0 == true ? 1 : 0;
            Object[] objArr143 = 0 == true ? 1 : 0;
            Object[] objArr144 = 0 == true ? 1 : 0;
            Object[] objArr145 = 0 == true ? 1 : 0;
            Object[] objArr146 = 0 == true ? 1 : 0;
            Object[] objArr147 = 0 == true ? 1 : 0;
            Object[] objArr148 = 0 == true ? 1 : 0;
            Object[] objArr149 = 0 == true ? 1 : 0;
            Object[] objArr150 = 0 == true ? 1 : 0;
            Object[] objArr151 = 0 == true ? 1 : 0;
            Object[] objArr152 = 0 == true ? 1 : 0;
            Object[] objArr153 = 0 == true ? 1 : 0;
            Object[] objArr154 = 0 == true ? 1 : 0;
            Object[] objArr155 = 0 == true ? 1 : 0;
            Object[] objArr156 = 0 == true ? 1 : 0;
            Object[] objArr157 = 0 == true ? 1 : 0;
            Object[] objArr158 = 0 == true ? 1 : 0;
            Object[] objArr159 = 0 == true ? 1 : 0;
            Object[] objArr160 = 0 == true ? 1 : 0;
            Object[] objArr161 = 0 == true ? 1 : 0;
            Object[] objArr162 = 0 == true ? 1 : 0;
            Object[] objArr163 = 0 == true ? 1 : 0;
            Object[] objArr164 = 0 == true ? 1 : 0;
            Object[] objArr165 = 0 == true ? 1 : 0;
            Object[] objArr166 = 0 == true ? 1 : 0;
            Object[] objArr167 = 0 == true ? 1 : 0;
            Object[] objArr168 = 0 == true ? 1 : 0;
            Object[] objArr169 = 0 == true ? 1 : 0;
            Object[] objArr170 = 0 == true ? 1 : 0;
            Object[] objArr171 = 0 == true ? 1 : 0;
            Object[] objArr172 = 0 == true ? 1 : 0;
            Object[] objArr173 = 0 == true ? 1 : 0;
            Object[] objArr174 = 0 == true ? 1 : 0;
            Object[] objArr175 = 0 == true ? 1 : 0;
            Object[] objArr176 = 0 == true ? 1 : 0;
            Object[] objArr177 = 0 == true ? 1 : 0;
            Object[] objArr178 = 0 == true ? 1 : 0;
            Object[] objArr179 = 0 == true ? 1 : 0;
            Object[] objArr180 = 0 == true ? 1 : 0;
            Object[] objArr181 = 0 == true ? 1 : 0;
            Object[] objArr182 = 0 == true ? 1 : 0;
            Object[] objArr183 = 0 == true ? 1 : 0;
            Object[] objArr184 = 0 == true ? 1 : 0;
            Object[] objArr185 = 0 == true ? 1 : 0;
            Object[] objArr186 = 0 == true ? 1 : 0;
            Object[] objArr187 = 0 == true ? 1 : 0;
            Object[] objArr188 = 0 == true ? 1 : 0;
            Object[] objArr189 = 0 == true ? 1 : 0;
            Object[] objArr190 = 0 == true ? 1 : 0;
            Object[] objArr191 = 0 == true ? 1 : 0;
            Object[] objArr192 = 0 == true ? 1 : 0;
            Object[] objArr193 = 0 == true ? 1 : 0;
            Object[] objArr194 = 0 == true ? 1 : 0;
            Object[] objArr195 = 0 == true ? 1 : 0;
            Object[] objArr196 = 0 == true ? 1 : 0;
            Object[] objArr197 = 0 == true ? 1 : 0;
            Object[] objArr198 = 0 == true ? 1 : 0;
            Object[] objArr199 = 0 == true ? 1 : 0;
            Object[] objArr200 = 0 == true ? 1 : 0;
            Object[] objArr201 = 0 == true ? 1 : 0;
            Object[] objArr202 = 0 == true ? 1 : 0;
            Object[] objArr203 = 0 == true ? 1 : 0;
            Object[] objArr204 = 0 == true ? 1 : 0;
            Object[] objArr205 = 0 == true ? 1 : 0;
            Object[] objArr206 = 0 == true ? 1 : 0;
            Object[] objArr207 = 0 == true ? 1 : 0;
            creativeModel = new CreativeModel(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, 0 == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr183, 0 == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
        }
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) bundle.getParcelable("creative_initial_model");
        if (creativeInitialModel != null) {
            creativeModel.initialModel = creativeInitialModel;
        }
        if (creativeModel.initialModel.vqEvaluationConfig != null) {
            creativeModel.checkPointModel.enableCheckPoint = false;
        }
        return creativeModel;
    }

    public static final boolean LIZLLL(CreativeModel creativeModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                int i2 = i + 1;
                LivePhotoPreviewMode livePhotoPreviewMode = null;
                if (i >= 0) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LOOP, LivePhotoPreviewMode.LIVE_PHOTO);
                    SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
                    if (srcLiveInfo != null) {
                        livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                    }
                    if (C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI)) {
                        return true;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean LJ(AwemeDraft awemeDraft) {
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel2 = creativeFlowData.getEditorProModel()) != null && editorProModel2.isAdvancedEdit()) {
            return false;
        }
        CreativeFlowData creativeFlowData2 = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null && editorProModel.isAdvancedEdit()) {
            return false;
        }
        return awemeDraft.LIZ.aiLivePhotoModel.LIZ();
    }

    public static final boolean LJFF(CreativeModel creativeModel) {
        if (creativeModel.initialModel.articlePostModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(CreativeModel creativeModel) {
        boolean z;
        String str;
        String str2 = creativeModel.templateConsumeData.dispatchType;
        if (str2 != null && a0.LJJIIZI(str2, "autocut", false) && (str = creativeModel.templateConsumeData.dispatchType) != null && a0.LJJIIZI(str, "anchor", false) && Intrinsics.LJFF(creativeModel.templateConsumeData.templateType, C1412630mrd.LIZLLL(EnumC1412640mre.PUGC_TEMPLATE))) {
            z = true;
        } else {
            z = false;
        }
        if (creativeModel.ugcTemplateData.isPUGCTemplateFromAutoCutAnchor || z) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(CreativeModel creativeModel) {
        boolean z;
        String str;
        String str2 = creativeModel.templateConsumeData.dispatchType;
        if (str2 != null && a0.LJJIIZI(str2, "mv", false) && (str = creativeModel.templateConsumeData.dispatchType) != null && a0.LJJIIZI(str, "anchor", false) && Intrinsics.LJFF(creativeModel.templateConsumeData.templateType, C1412630mrd.LIZLLL(EnumC1412640mre.PUGC_TEMPLATE))) {
            z = true;
        } else {
            z = false;
        }
        if (creativeModel.ugcTemplateData.isPUGCTemplateFromMVAnchor || z) {
            return true;
        }
        return false;
    }

    public static final void LJIIIZ(Intent intent, CreativeModel creativeModel) {
        if (!creativeModel.isCopiedModel) {
            creativeModel = creativeModel.LIZ();
            creativeModel.isCopiedModel = true;
        }
        intent.putExtra("creative_model", creativeModel);
    }

    public static final void LJIIJ(Bundle bundle, CreativeModel creativeModel) {
        if (!creativeModel.isCopiedModel) {
            creativeModel = creativeModel.LIZ();
            creativeModel.isCopiedModel = true;
        }
        C786410Ut5.LJJIJL(bundle, "creative_model", creativeModel);
    }
}
