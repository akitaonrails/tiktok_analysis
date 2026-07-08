package com.bytedance.android.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class QuickEmojiConfig_OptTypeAdapter extends TypeAdapter<QuickEmojiConfig> {
    public final Gson LIZ;

    public QuickEmojiConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final QuickEmojiConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        QuickEmojiConfig quickEmojiConfig = new QuickEmojiConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1952584093) {
                    if (iHashCode != -1168946796) {
                        if (iHashCode == 805414983 && strLJJJJ.equals("quick_comment_forbidden")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                quickEmojiConfig.setForbidQuickComment(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("quick_emoji_position")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            quickEmojiConfig.setQuickEmojiPosition(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("show_emoji_send")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        quickEmojiConfig.setShowEmojiSend(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return quickEmojiConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, QuickEmojiConfig quickEmojiConfig) throws IOException {
        QuickEmojiConfig quickEmojiConfig2 = quickEmojiConfig;
        if (quickEmojiConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("quick_comment_forbidden");
        c09dl.LJJJJJL(quickEmojiConfig2.isForbidQuickComment());
        c09dl.LJIILLIIL("show_emoji_send");
        c09dl.LJJJJJL(quickEmojiConfig2.isShowEmojiSend());
        c09dl.LJIILLIIL("quick_emoji_position");
        c09dl.LJJJJ(Integer.valueOf(quickEmojiConfig2.getQuickEmojiPosition()));
        c09dl.LJII();
    }
}
