package X;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0IwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482640IwI {
    public static final int LJI = C497740JfY.LJIIZILJ();
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375));
    public final ViewGroup LIZ;
    public ConstraintLayout LIZIZ;
    public C1324720kZq LIZJ;
    public C21569819bE LIZLLL;
    public C16F5 LJ;
    public ToplivePageItem LJFF;

    public C482640IwI(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public final void LIZ(ToplivePageItem toplivePageItem) {
        User owner;
        User owner2;
        ImageModel avatarThumb;
        if (toplivePageItem != null) {
            this.LJFF = toplivePageItem;
            Room room = toplivePageItem.room;
            if (room != null && (owner2 = room.getOwner()) != null && (avatarThumb = owner2.getAvatarThumb()) != null) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(avatarThumb);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                c1324610kZfLJIIIZ.LJI = iLIZIZ;
                c1324610kZfLJIIIZ.LJII = iLIZIZ2;
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJJI(this.LIZJ);
            }
            C16F5 c16f5 = this.LJ;
            if (c16f5 != null) {
                Room room2 = toplivePageItem.room;
                if (room2 != null) {
                    owner = room2.getOwner();
                } else {
                    owner = null;
                }
                c16f5.setText(C0KVU.LIZ(owner));
            }
            C21569819bE c21569819bE = this.LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LJFF();
            }
        }
    }
}
