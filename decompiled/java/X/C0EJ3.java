package X;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0EJ3 extends C05YF {
    void BO0(NLETrackSlot nLETrackSlot, boolean z);

    void ED2(TextStickerModel textStickerModel, boolean z);

    void GT();

    void Gu0(TextStickerModel textStickerModel);

    ArrayList<TextStickerData> IP();

    void J2();

    void Kx2(ArrayList<Pair<String, String>> arrayList, boolean z);

    void LA0(NLETrackSlot nLETrackSlot);

    C0FF8 LJIIJ();

    String LLIILZL();

    void LLJJL(C364440EQo c364440EQo);

    void LLLLZIL(String str);

    C364440EQo LLLZIL();

    void OZ0(List<TextStickerModel> list, boolean z);

    List<TextStickerModel> Oo1();

    void RF(TextStickerModel textStickerModel, boolean z);

    void Rc();

    List<TextStickerModel> Sb();

    String U41();

    void Y61(NLETrackSlot nLETrackSlot);

    TextStickerModel YC(String str);

    void bR(String str);

    void cf0(String str);

    List<NLETrack> iO2();

    void k1();

    void q(C364440EQo c364440EQo);

    String t20(String str, TextFontModel textFontModel, TextPaint textPaint, Context context);

    void to0();

    C364440EQo u4();

    void xQ1(TextStickerModel textStickerModel, boolean z);
}
