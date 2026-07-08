package X;

import com.bytedance.scene.Scene;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;

/* JADX INFO: renamed from: X.0l8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1346190l8T {
    @InterfaceC1501240pAY("/aweme/v1/contents/translation/")
    @InterfaceC1485505rh
    ListenableFuture<MultiTranslationResult> LIZ(@InterfaceC1501100pAK("trg_lang") String str, @InterfaceC1501100pAK("translation_info") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);
}
