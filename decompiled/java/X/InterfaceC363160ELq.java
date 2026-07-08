package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0ELq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC363160ELq extends C05YF {
    void Dc1(Integer num, Float f, Float f2);

    void P50(boolean z, boolean z2);

    NLETrackSlot Qa1(String str, C0ELT c0elt);

    NLETrackSlot dI2(String str, String str2, C0ELT c0elt, boolean z, EditorProAIGCTemplateModel editorProAIGCTemplateModel);

    void dd0(String str);

    void gb0(NLEModel nLEModel, Map<String, C0ELY> map);

    NLETrackSlot nD(NLEModel nLEModel, String str, C0ELT c0elt, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel);

    InterfaceC363020ELc xG2();

    void zo2(NLEModel nLEModel, Map<String, C0ELY> map);
}
