package X;

import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse;

/* JADX INFO: renamed from: X.0mqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1411770mqF {
    @InterfaceC1501240pAY("/tiktok/v1/aigc/photo_text_description/label")
    C11NZ<RequestLabelResponse> LIZ(@C040I RequestLabelRequestBody requestLabelRequestBody);

    @InterfaceC1501240pAY("/tiktok/v1/aigc/photo_text_description/generate")
    C11NZ<RecommendDescResponse> LIZIZ(@C040I RecommendDescRequestBody recommendDescRequestBody);
}
