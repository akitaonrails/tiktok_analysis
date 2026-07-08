package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Hn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451430Hn3 extends C443910Hav {
    public final C451440Hn4 LIZIZ = C451450Hn5.LIZ();
    public int LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC444050Hb9
    public final int LIZJ() {
        return 5;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int LIZLLL() {
        return -1;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String LJ() {
        return String.valueOf(5);
    }

    @Override // X.C443910Hav
    public final int LJIIL() {
        return 20;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int Al() {
        if (this.LIZJ == 0) {
            C451440Hn4 c451440Hn4 = this.LIZIZ;
            int i = this.LIZLLL;
            c451440Hn4.getClass();
            C451560HnG.LIZ.LIZIZ(i);
            List list = (List) ((LinkedHashMap) C451560HnG.LJ).get(Integer.valueOf(i));
            this.LIZJ = list != null ? list.size() : 0;
        }
        int i2 = this.LIZJ;
        if (i2 != 0) {
            return 1 + ((i2 - 1) / 20);
        }
        return 1;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZ() {
        ArrayList arrayList = new ArrayList();
        C451440Hn4 c451440Hn4 = this.LIZIZ;
        int i = this.LIZLLL;
        c451440Hn4.getClass();
        List<ImSysEmojiModel> listLIZIZ = C451440Hn4.LIZIZ(i);
        if (listLIZIZ == null) {
            return arrayList;
        }
        for (ImSysEmojiModel imSysEmojiModel : listLIZIZ) {
            C451030HmP c451030HmP = new C451030HmP();
            c451030HmP.LIZIZ = imSysEmojiModel.getPreviewEmoji();
            c451030HmP.LIZJ = imSysEmojiModel;
            if (this.LIZLLL == 2) {
                c451030HmP.LJII = new CommentPersonalizedEmoji(imSysEmojiModel.getPreviewEmoji(), 0, "", "emoji_board");
            }
            arrayList.add(c451030HmP);
        }
        return arrayList;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String LJIIIZ() {
        String previewEmoji;
        C451440Hn4 c451440Hn4 = this.LIZIZ;
        int i = this.LIZLLL;
        c451440Hn4.getClass();
        C451560HnG.LIZ.LIZIZ(i);
        List list = (List) ((LinkedHashMap) C451560HnG.LJ).get(Integer.valueOf(i));
        return (list == null || list.size() <= 0 || (previewEmoji = ((ImSysEmojiModel) ListProtector.get(list, 0)).getPreviewEmoji()) == null) ? "😃" : previewEmoji;
    }

    public C451430Hn3(int i) {
        this.LIZLLL = i;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZIZ(int i) {
        ArrayList arrayList = new ArrayList();
        C451440Hn4 c451440Hn4 = this.LIZIZ;
        int i2 = this.LIZLLL;
        int i3 = i * 20;
        c451440Hn4.getClass();
        if (!C451440Hn4.LIZ(i2)) {
            return arrayList;
        }
        List<ImSysEmojiModel> listLIZIZ = C451560HnG.LIZ.LIZIZ(i2);
        ArrayList<ImSysEmojiModel> arrayList2 = new ArrayList();
        if (i3 < listLIZIZ.size()) {
            int i4 = 0;
            for (ImSysEmojiModel imSysEmojiModel : listLIZIZ) {
                if (i4 >= i3 && i4 < i3 + 20) {
                    arrayList2.add(imSysEmojiModel);
                }
                i4++;
                if (i4 >= i3 + 20) {
                    break;
                }
            }
            int size = 20 - arrayList2.size();
            if (size > 0) {
                int i5 = 0;
                do {
                    arrayList2.add(new ImSysEmojiModel());
                    i5++;
                } while (i5 < size);
            }
        }
        for (ImSysEmojiModel imSysEmojiModel2 : arrayList2) {
            C451030HmP c451030HmP = new C451030HmP();
            c451030HmP.LIZIZ = imSysEmojiModel2.getPreviewEmoji();
            c451030HmP.LIZJ = imSysEmojiModel2;
            if (this.LIZLLL == 2) {
                c451030HmP.LJII = new CommentPersonalizedEmoji(imSysEmojiModel2.getPreviewEmoji(), 0, "", "emoji_board");
            }
            arrayList.add(c451030HmP);
        }
        C451030HmP c451030HmP2 = new C451030HmP();
        c451030HmP2.LIZ = R.drawable.bq1;
        arrayList.add(c451030HmP2);
        return arrayList;
    }
}
