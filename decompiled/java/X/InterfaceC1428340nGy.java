package X;

import android.util.Size;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;

/* JADX INFO: renamed from: X.0nGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1428340nGy {
    CreativeInfo LIZ();

    SingleImageData LJIL();

    void LLLZLL(int i);

    Size N2();

    Size cn();

    void dn(NLEModel nLEModel, NLETemplateModel nLETemplateModel, C5183020f c5183020f);

    ViewGroup.MarginLayoutParams ej();

    void en(int i, SingleImageData singleImageData, String str, NLEModel nLEModel);

    void fn(C346940Diu c346940Diu);

    InterfaceC1452170ntP g();

    int gn();

    int h7();

    void hn(int i, SingleImageData singleImageData, String str, NLEModel nLEModel);

    boolean in();

    boolean init();

    void jn(boolean z, boolean z2);

    List<TextStickerModel> kn();

    void ln(boolean z, boolean z2);

    boolean mn();

    boolean nn();

    void on(NLEModel nLEModel, String str, String str2);
}
