package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.vibefeed.feed.preload.VibeFeedPreload;

/* JADX INFO: renamed from: X.0P3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638830P3x {
    public static void LIZ(final C638810P3v c638810P3v, String str, String str2, int i, String str3, int i2, int i3) {
        final int i4 = i2;
        final int value = i;
        final String str4 = str2;
        final String str5 = str;
        final String str6 = "";
        if ((i3 & 2) != 0) {
            str5 = "";
        }
        if ((i3 & 4) != 0) {
            str4 = "";
        }
        if ((i3 & 8) != 0) {
            value = EnumC629350OmL.SCENE_DEFAULT.getValue();
        }
        if ((i3 & 16) == 0) {
            str6 = str3;
        }
        if ((i3 & 32) != 0) {
            i4 = 15;
        }
        C20153113tJ c20153113tJ = C20152913tH.LIZLLL;
        InterfaceC20153213tK interfaceC20153213tK = new InterfaceC20153213tK() { // from class: X.0P3w
            @Override // X.InterfaceC20153213tK
            public final void LIZ(C20152113t9 c20152113t9) {
                Bundle bundle = new Bundle();
                C638810P3v c638810P3v2 = c638810P3v;
                String str7 = str5;
                int i5 = value;
                String str8 = str4;
                String str9 = str6;
                int i6 = i4;
                C786410Ut5.LJJJI("to_user_id", c638810P3v2.LIZLLL, bundle);
                C786410Ut5.LJJJI("insert_item_ids", C13LP.LJJLIIIJ(c638810P3v2.LIZJ, ",", null, null, 0, null, null, 62), bundle);
                C786410Ut5.LJJJI("vibe_feed_id", str7, bundle);
                bundle.putInt(Scene.SCENE_SERVICE, i5);
                C786410Ut5.LJJJI("vibe_has_visited_ids", str8, bundle);
                C786410Ut5.LJJJI("conversation_id", c638810P3v2.LJFF, bundle);
                bundle.putInt("mutual_feed_scene", c638810P3v2.LIZ.getValue());
                C786410Ut5.LJJJI("next_cursor", str9, bundle);
                bundle.putInt("page_size", i6);
                c20152113t9.LIZ(bundle, VibeFeedPreload.class, new InterfaceC1726310v1Z() { // from class: X.0P3y
                    @Override // X.InterfaceC1726310v1Z
                    public final void LIZ(Exception exc) {
                    }

                    @Override // X.InterfaceC1726310v1Z
                    public final void onSuccess(Object obj) {
                    }
                }, Boolean.FALSE);
            }
        };
        c20153113tJ.getClass();
        C20153113tJ.LIZJ(interfaceC20153213tK);
    }
}
