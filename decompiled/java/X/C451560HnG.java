package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.Emoji;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiStruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;

/* JADX INFO: renamed from: X.0HnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451560HnG {
    public static final C451560HnG LIZ = new C451560HnG();
    public static final Map<Integer, Boolean> LIZIZ = new LinkedHashMap();
    public static final List<ImSysEmojiModel> LIZJ = new ArrayList();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(406));
    public static final Map<Integer, List<ImSysEmojiModel>> LJ = new LinkedHashMap();

    public final synchronized void LIZ() {
        C01GW c01gw = LIZLLL;
        if (((List) c01gw.getValue()).isEmpty()) {
            ((List) c01gw.getValue()).addAll(LIZJ());
        }
    }

    public static List LIZJ() throws IOException {
        C0I0B.LJFF.LIZJ();
        InputStream inputStreamOpen = C894660Z7w.LIZ().getAssets().open("I18N_sys_emoji.json");
        InterfaceC2138008Ze.LIZ.getClass();
        ImSysEmojiStruct imSysEmojiStruct = (ImSysEmojiStruct) C08JS.LIZ(C2106108Mx.LIZLLL(inputStreamOpen, "UTF-8"), ImSysEmojiStruct.class);
        ArrayList arrayList = new ArrayList();
        List<Emoji> d = imSysEmojiStruct.getD();
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(d, 10));
            for (Emoji emoji : d) {
                Emoji emoji2 = null;
                if (Build.VERSION.SDK_INT >= CastIntegerProtector.parseInt(emoji.getAnd())) {
                    ImSysEmojiModel imSysEmojiModel = new ImSysEmojiModel();
                    imSysEmojiModel.setBusinessType(emoji.getBusiness());
                    List<String> emoji3 = emoji.getEmoji();
                    imSysEmojiModel.setPreviewEmoji(emoji3 != null ? (String) ListProtector.get(emoji3, 0) : null);
                    imSysEmojiModel.setSupportSkinBusinessType(1);
                    imSysEmojiModel.setEmojiList(emoji.getEmoji());
                    imSysEmojiModel.setMiniSupportSysVersion(emoji.getAnd());
                    arrayList.add(imSysEmojiModel);
                    emoji2 = emoji;
                }
                arrayList2.add(emoji2);
            }
        }
        return arrayList;
    }

    public final synchronized List<ImSysEmojiModel> LIZIZ(int i) {
        String str;
        boolean z;
        Map<Integer, List<ImSysEmojiModel>> map = LJ;
        boolean z2 = true;
        if (((LinkedHashMap) map).get(Integer.valueOf(i)) != null) {
            if (((List) ((LinkedHashMap) map).get(Integer.valueOf(i))) == null || !(!r0.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                List<ImSysEmojiModel> arrayList = (List) ((LinkedHashMap) map).get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                return arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<ImSysEmojiModel> list = LIZJ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            arrayList2.addAll(list);
        } else {
            LIZ();
            arrayList2.addAll((List) LIZLLL.getValue());
        }
        ArrayList arrayList3 = new ArrayList();
        C08QT c08qt = new C08QT(C09RB.LJIIIZ(C09RB.LJIIJJI(new C1939607ik(arrayList2)), new AwS21S0001000_6(i, 11)));
        while (c08qt.hasNext()) {
            ImSysEmojiModel imSysEmojiModel = (ImSysEmojiModel) c08qt.next();
            if (imSysEmojiModel.getSupportSkinBusinessType() != i) {
                List<String> emojiList = imSysEmojiModel.getEmojiList();
                if (emojiList == null || (str = (String) ListProtector.get(emojiList, 0)) == null) {
                    str = "";
                }
                imSysEmojiModel.setPreviewEmoji(str);
            }
            arrayList3.add(imSysEmojiModel);
        }
        LJ.put(Integer.valueOf(i), arrayList3);
        return arrayList3;
    }
}
