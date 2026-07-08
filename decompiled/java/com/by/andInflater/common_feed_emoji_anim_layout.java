package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_emoji_anim_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        EmojiAnimPlayground emojiAnimPlayground = new EmojiAnimPlayground(context);
        C786410Ut5.LJLLLLLL(4, emojiAnimPlayground);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        a.LIZ(emojiAnimPlayground);
        C786410Ut5.W5(emojiAnimPlayground, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(emojiAnimPlayground);
        }
        return emojiAnimPlayground;
    }
}
