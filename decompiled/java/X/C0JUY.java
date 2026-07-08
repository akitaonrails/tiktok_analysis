package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JUY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUY extends C0JUN {
    public final EmoteModel LL;
    public final Bitmap LLILLJJLI;
    public final LiveSubMediaModel LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JUY)) {
            return false;
        }
        C0JUY c0juy = (C0JUY) obj;
        return Intrinsics.LJFF(this.LL, c0juy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0juy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0juy.LLILLL) && this.LLILZ == c0juy.LLILZ && this.LLILZIL == c0juy.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Bitmap bitmap = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        LiveSubMediaModel liveSubMediaModel = this.LLILLL;
        return ((((iHashCode2 + (liveSubMediaModel != null ? liveSubMediaModel.hashCode() : 0)) * 31) + this.LLILZ) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubWaveEmoteListEmoteCellData(emote=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", curBitmap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", liveSubMediaModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subWaveEmoteDSAStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", emoteOperator=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0JUN
    public final int getType() {
        return this.LLILZLL;
    }

    @Override // X.C0JUN, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0JUY) {
            C0JUY c0juy = (C0JUY) interfaceC1891350zJl;
            boolean zLJFF = Intrinsics.LJFF(this.LL.emoteId, c0juy.LL.emoteId);
            boolean zLJFF2 = Intrinsics.LJFF(this.LL.image, c0juy.LL.image);
            boolean zLJFF3 = Intrinsics.LJFF(this.LL.emoteResource, c0juy.LL.emoteResource);
            boolean zLJFF4 = Intrinsics.LJFF(c0juy.LLILLJJLI, this.LLILLJJLI);
            if (zLJFF && zLJFF2 && zLJFF3 && zLJFF4) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C0JUN, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C0JUY(EmoteModel emoteModel, LiveSubMediaModel liveSubMediaModel, int i, int i2, int i3) {
        this(emoteModel, (Bitmap) null, (i3 & 4) != 0 ? null : liveSubMediaModel, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    public static C0JUY LIZ(C0JUY c0juy, EmoteModel emoteModel, Bitmap bitmap, int i, int i2) {
        LiveSubMediaModel liveSubMediaModel;
        int i3;
        int i4 = i;
        Bitmap bitmap2 = bitmap;
        EmoteModel emoteModel2 = emoteModel;
        if ((i2 & 1) != 0) {
            emoteModel2 = c0juy.LL;
        }
        if ((i2 & 2) != 0) {
            bitmap2 = c0juy.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            liveSubMediaModel = c0juy.LLILLL;
        } else {
            liveSubMediaModel = null;
        }
        if ((i2 & 8) != 0) {
            i3 = c0juy.LLILZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            i4 = c0juy.LLILZIL;
        }
        c0juy.getClass();
        return new C0JUY(emoteModel2, bitmap2, liveSubMediaModel, i3, i4);
    }

    public C0JUY(EmoteModel emoteModel, Bitmap bitmap, LiveSubMediaModel liveSubMediaModel, int i, int i2) {
        this.LL = emoteModel;
        this.LLILLJJLI = bitmap;
        this.LLILLL = liveSubMediaModel;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = 2;
    }
}
