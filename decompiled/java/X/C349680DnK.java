package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.Word;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349680DnK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLETrackSlot nLETrackSlot) {
        if (!C349550Dn7.LJFF(nLETrackSlot)) {
            return;
        }
        TextStickerData textStickerDataLIZ = C0EJ1.LIZ(nLETrackSlot.getExtra("text_sticker_data"));
        textStickerDataLIZ.setCacheWords(C13BV.INSTANCE);
        Pair pairLIZ = C349660DnI.LIZ(nLETrackSlot);
        textStickerDataLIZ.setClipStart(((Number) pairLIZ.getFirst()).longValue());
        textStickerDataLIZ.setClipEnd(((Number) pairLIZ.getSecond()).longValue());
        nLETrackSlot.setExtra("text_sticker_data", C0EJ1.LIZIZ(textStickerDataLIZ));
    }

    public static String LIZIZ(long j) {
        long j2 = C538540LAe.LLJJJIL;
        return C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf((j % j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))}, 2));
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Word(r1.LIZJ, r1.LIZIZ, ((C349800DnW) it2.next()).LIZ, "", false, false));
        }
        return arrayList;
    }
}
