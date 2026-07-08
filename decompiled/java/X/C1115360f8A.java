package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comment.emoji.LiveCommentDefaultEmojiInfoSetting;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0f8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115360f8A {
    public static C1115360f8A LIZJ;
    public final C1115540f8S LIZ = new C1115540f8S();
    public final C1114790f7F LIZIZ = new Object() { // from class: X.0f7F
    };

    public static C1115360f8A LIZJ() {
        if (LIZJ == null) {
            LIZJ = new C1115360f8A();
        }
        return LIZJ;
    }

    public final Bitmap LIZ(String str) {
        Bitmap bitmapLIZJ = this.LIZ.LIZ.LJFF.LIZJ(str);
        if (bitmapLIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getEmojiFromCache ");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("OnlineSmallEmojiResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        return bitmapLIZJ;
    }

    public final boolean LIZLLL(String str) {
        if (!this.LIZ.LIZ.LIZJ.containsKey(str) && !LiveCommentDefaultEmojiInfoSetting.INSTANCE.getValue().containsKey(str)) {
            return false;
        }
        return true;
    }

    public static List LJ(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (C0IKQ.LIZ(list)) {
            return arrayList;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (LIZJ().LIZLLL(str)) {
                C1115490f8N c1115490f8N = new C1115490f8N(LIZJ().LIZ(str), str);
                c1115490f8N.recentlyUsed = z;
                c1115490f8N.previewEmoji = str;
                arrayList.add(c1115490f8N);
            } else if (!str.startsWith(e3.e)) {
                C1115500f8O c1115500f8O = new C1115500f8O();
                c1115500f8O.type = 0;
                c1115500f8O.previewEmoji = str;
                c1115500f8O.recentlyUsed = z;
                arrayList.add(c1115500f8O);
            }
        }
        return arrayList;
    }

    public final void LIZIZ(Resources resources, LifecycleOwner lifecycleOwner, InterfaceC314870CVx interfaceC314870CVx, String str) {
        OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = this.LIZ.LIZ;
        onlineDrawableEmojiResourceManager.getClass();
        C500260Jjc.LJJJJJ(lifecycleOwner, null, new C314860CVw(onlineDrawableEmojiResourceManager, str, interfaceC314870CVx, resources, null), 3);
    }
}
