package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.List;
import webcast.data.ReqSong;

/* JADX INFO: renamed from: X.005H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005H {
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0U22 LIZ(com.bytedance.android.livesdk.model.KaraokeSong r30, X.EnumC038300Bp r31) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005H.LIZ(com.bytedance.android.livesdk.model.KaraokeSong, X.00Bp):X.0U22");
    }

    public static final C0U22 LIZIZ(ReqSong reqSong, EnumC038300Bp enumC038300Bp) {
        KaraokeSong karaokeSong;
        C0U22 c0u22LIZ;
        List<User> listSubList;
        if (reqSong != null && (karaokeSong = reqSong.song) != null && (c0u22LIZ = LIZ(karaokeSong, enumC038300Bp)) != null) {
            c0u22LIZ.LJIILL = (int) reqSong.reqCount;
            int size = reqSong.userList.size();
            int i = c0u22LIZ.LJIILL;
            if (size > i) {
                listSubList = reqSong.userList.subList(0, i);
            } else if (size < i && size < 3) {
                int iMin = Math.min(i, 3);
                while (size < iMin) {
                    reqSong.userList.add(new User());
                    size++;
                }
                listSubList = reqSong.userList;
            } else {
                listSubList = reqSong.userList;
            }
            for (User user : listSubList) {
                List<ImageModel> listLJIIJ = c0u22LIZ.LJIIJ();
                ImageModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb == null) {
                    avatarThumb = new ImageModel();
                }
                listLJIIJ.add(avatarThumb);
            }
            return c0u22LIZ;
        }
        C0U22 c0u22 = C0U22.LJIJ;
        return C0U22.LJIJ;
    }
}
