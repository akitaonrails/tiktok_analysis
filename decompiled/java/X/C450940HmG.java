package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450940HmG {
    public final C2091208He<String, C450960HmI> LIZIZ = new C2091208He<>(5);
    public final String LIZ = "%1$s-%2$s";

    public static void LIZ(C450960HmI c450960HmI, final List list, final C449800HkQ c449800HkQ, final C449450Hjr c449450Hjr, final int i) {
        C450950HmH c450950HmH = c450960HmI.LIZLLL;
        ((ArrayList) c450950HmH.LL).clear();
        ((ArrayList) c450950HmH.LL).addAll(list);
        c450960HmI.LIZLLL.notifyDataSetChanged();
        GridView gridView = c450960HmI.LIZJ;
        AdapterView.OnItemClickListener c1847850yBb = new AdapterView.OnItemClickListener(list, c449800HkQ, c449450Hjr, i) { // from class: X.0HmF
            public final /* synthetic */ List LL;
            public final /* synthetic */ InterfaceC450890HmB LLILLJJLI;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                String previewEmoji;
                List list2 = this.LL;
                InterfaceC450890HmB interfaceC450890HmB = this.LLILLJJLI;
                C451030HmP c451030HmP = (C451030HmP) ListProtector.get(list2, i2);
                if (c451030HmP != null) {
                    if (c451030HmP.LIZ == R.drawable.bq1) {
                        interfaceC450890HmB.LJ();
                        return;
                    }
                    if (c451030HmP.LIZLLL()) {
                        CommentPersonalizedEmoji commentPersonalizedEmoji = c451030HmP.LJII;
                        if (commentPersonalizedEmoji != null) {
                            interfaceC450890HmB.zm(commentPersonalizedEmoji);
                            return;
                        }
                        Emoji emoji = c451030HmP.LIZJ;
                        if (emoji instanceof ImSysEmojiModel) {
                            ImSysEmojiModel imSysEmojiModel = (ImSysEmojiModel) emoji;
                            if (imSysEmojiModel.getPreviewEmoji() == null) {
                                previewEmoji = "";
                            } else {
                                previewEmoji = imSysEmojiModel.getPreviewEmoji();
                            }
                            interfaceC450890HmB.LJI(previewEmoji);
                            return;
                        }
                        interfaceC450890HmB.LIZ(view.findViewById(R.id.gzy), c451030HmP);
                        return;
                    }
                    if (TextUtils.isEmpty(c451030HmP.LIZIZ)) {
                        return;
                    }
                    interfaceC450890HmB.LJI(c451030HmP.LIZIZ);
                }
            }
        };
        if (C1848410yCV.LIZ) {
            c1847850yBb = new C1847850yBb(c1847850yBb);
        }
        gridView.setOnItemClickListener(c1847850yBb);
    }
}
