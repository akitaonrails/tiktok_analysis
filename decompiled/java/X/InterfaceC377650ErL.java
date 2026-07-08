package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ErL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC377650ErL extends C05YF {
    C385670FAf<C040900Cp> Da2();

    C385670FAf<C377660ErM> F21();

    void GP0(AIGCGenerationParam aIGCGenerationParam, String str, String str2, boolean z, String str3, Function0<Unit> function0);

    void KJ0();

    boolean LP(String str);

    List<EditorProAIGCMediaItemModel> Ow2(String str, AIGCGenerationParamType aIGCGenerationParamType);

    void PI2(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str, boolean z, String str2);

    C385670FAf<C377750ErV> Ql0();

    void Ug0(String str, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, String str2);

    void VC0(String str, AIGCGenerationParamType aIGCGenerationParamType);

    void bJ0(AIGCGenerationParam aIGCGenerationParam, C377660ErM c377660ErM, String str, EditorProAIGCTemplateModel editorProAIGCTemplateModel, String str2, boolean z, String str3);

    void et1(String str, C377390Eqv c377390Eqv);

    void fL1(AIGCGenerationParamType aIGCGenerationParamType, AIGCGenerationSubType aIGCGenerationSubType, C377660ErM c377660ErM);

    boolean fO0(String str);

    List<EditorProAIGCMediaItemModel> fb0(String str, AIGCGenerationParamType aIGCGenerationParamType, List<? extends EditorProAIGCMediaItemModelStatus> list);

    void h72(String str);

    boolean iY(String str, AIGCGenerationParam aIGCGenerationParam);

    void kq0(String str);

    String md0(String str, AIGCGenerationParamType aIGCGenerationParamType);

    boolean p12(String str);

    C385670FAf<C377660ErM> pS1();

    C385670FAf<C377660ErM> pd2();

    void rX0(String str, AIGCGenerationParamType aIGCGenerationParamType, C377390Eqv c377390Eqv);

    boolean sm2();
}
