package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0Iuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481820Iuy {
    public static final C481820Iuy LIZ = new C481820Iuy();

    public static int LIZIZ(ToplivePageItem toplivePageItem) {
        List<ToplivePageItem> list;
        if (TextUtils.equals(toplivePageItem.itemId, "top")) {
            C482300Ivk.LIZ.getClass();
            ToplivePageItem toplivePageItem2 = C482300Ivk.LIZIZ;
            if (toplivePageItem2 != null && (list = toplivePageItem2.subItems) != null && list.size() > 0) {
                if (toplivePageItem.subItems.size() > 2) {
                    return 2;
                }
                return toplivePageItem.subItems.size();
            }
            if (toplivePageItem.subItems.size() >= 4) {
                return 4;
            }
            return toplivePageItem.subItems.size();
        }
        return toplivePageItem.subItems.size();
    }

    public static int LIZ(ToplivePageItem toplivePageItem, ToplivePageItem toplivePageItem2) {
        Iterator<ToplivePageItem> it2 = toplivePageItem.subItems.iterator();
        int i = -1;
        while (it2.hasNext()) {
            Iterator<ToplivePageItem> it3 = it2.next().subItems.iterator();
            while (it3.hasNext()) {
                i++;
                if (Intrinsics.LJFF(it3.next(), toplivePageItem2)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void LJ(Room room, String str, String str2) {
        Long lValueOf;
        Long lValueOf2;
        User owner;
        FollowInfo followInfo;
        User owner2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", "live_merge");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        Long lValueOf3 = null;
        if (room != null && (owner2 = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner2.getId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "anchor_id");
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJ(lValueOf2, "room_id");
        c2344009Gk.LJIIIIZZ("request_id", str2);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf3 = Long.valueOf(followInfo.getFollowStatus());
        }
        c2344009Gk.LJIIIIZZ("follow_status", String.valueOf(lValueOf3));
        C486660J6q.LJIIJ(c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(webcast.api.feed.ToplivePageItem r15, webcast.api.feed.ToplivePageItem r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481820Iuy.LIZLLL(webcast.api.feed.ToplivePageItem, webcast.api.feed.ToplivePageItem, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(webcast.api.feed.ToplivePageItem r14, webcast.api.feed.ToplivePageItem r15, java.lang.String r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481820Iuy.LIZJ(webcast.api.feed.ToplivePageItem, webcast.api.feed.ToplivePageItem, java.lang.String, int, java.lang.String):void");
    }
}
