package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929420aIG extends C1117360fBO {
    public final C2172981A2m<Object> LLILLL = new C2172981A2m<>(this, new AbstractC339510DSr<Object>() { // from class: X.0aIH
        @Override // X.AbstractC339510DSr
        public final Object LIZJ(Object obj, Object obj2) {
            return null;
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZ(Object obj, Object obj2) {
            if (obj instanceof LinkPlayerInfo) {
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
                if (linkPlayerInfo2.mUser.getId() != linkPlayerInfo.mUser.getId() || linkPlayerInfo2.LIZIZ != linkPlayerInfo.LIZIZ || linkPlayerInfo2.mUser.getFollowInfo().getFollowStatus() != linkPlayerInfo.mUser.getFollowInfo().getFollowStatus() || linkPlayerInfo2.mRoleType != linkPlayerInfo.mRoleType || !Intrinsics.LJFF(linkPlayerInfo2.tagMap, linkPlayerInfo.tagMap)) {
                    return false;
                }
            } else {
                if (obj instanceof C930130aJP) {
                    return false;
                }
                if (!(obj instanceof C929360aIA)) {
                    return Intrinsics.LJFF(obj, obj2);
                }
            }
            return true;
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(Object obj, Object obj2) {
            if (obj.getClass() != obj2.getClass()) {
                return false;
            }
            if (obj instanceof C929360aIA) {
                return true;
            }
            return Intrinsics.LJFF(obj, obj2);
        }
    });

    @Override // X.C1117360fBO
    public final void LLLII(List<?> list) {
        this.LLILLL.LIZIZ(C13LP.LLIIII(list), new ARunnableS115S0100000_15(this, 208));
    }
}
