package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492890JUp extends AbstractC492880JUo {
    public final UserEmote LL;
    public final Bitmap LLILLJJLI;
    public final LiveSubMediaModel LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C492890JUp)) {
            return false;
        }
        C492890JUp c492890JUp = (C492890JUp) obj;
        return Intrinsics.LJFF(this.LL, c492890JUp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c492890JUp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c492890JUp.LLILLL) && this.LLILZ == c492890JUp.LLILZ && this.LLILZIL == c492890JUp.LLILZIL && this.LLILZLL == c492890JUp.LLILZLL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Bitmap bitmap = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        LiveSubMediaModel liveSubMediaModel = this.LLILLL;
        return ((((((iHashCode2 + (liveSubMediaModel != null ? liveSubMediaModel.hashCode() : 0)) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestEmoteListEmoteCellData(emote=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", curBitmap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", liveSubMediaModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", suggestEmoteDSAStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", emoteOperator=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", autoDeleteDaysLeft=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC492880JUo
    public final int getType() {
        return this.LLIZ;
    }

    @Override // X.AbstractC492880JUo, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C492890JUp) {
            UserEmote userEmote = this.LL;
            long j = userEmote.emoteId;
            C492890JUp c492890JUp = (C492890JUp) interfaceC1891350zJl;
            UserEmote userEmote2 = c492890JUp.LL;
            if (j == userEmote2.emoteId) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJFF = Intrinsics.LJFF(userEmote.image, userEmote2.image);
            boolean zLJFF2 = Intrinsics.LJFF(c492890JUp.LLILLJJLI, this.LLILLJJLI);
            if (z && zLJFF && zLJFF2) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.AbstractC492880JUo, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static C492890JUp LIZ(C492890JUp c492890JUp, UserEmote userEmote, Bitmap bitmap) {
        LiveSubMediaModel liveSubMediaModel = c492890JUp.LLILLL;
        int i = c492890JUp.LLILZ;
        int i2 = c492890JUp.LLILZIL;
        int i3 = c492890JUp.LLILZLL;
        c492890JUp.getClass();
        return new C492890JUp(userEmote, bitmap, liveSubMediaModel, i, i2, i3);
    }

    public /* synthetic */ C492890JUp(UserEmote userEmote, LiveSubMediaModel liveSubMediaModel, int i, int i2, int i3, int i4) {
        this(userEmote, (Bitmap) null, (i4 & 4) != 0 ? null : liveSubMediaModel, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? -1 : i3);
    }

    public C492890JUp(UserEmote userEmote, Bitmap bitmap, LiveSubMediaModel liveSubMediaModel, int i, int i2, int i3) {
        this.LL = userEmote;
        this.LLILLJJLI = bitmap;
        this.LLILLL = liveSubMediaModel;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = 2;
    }
}
