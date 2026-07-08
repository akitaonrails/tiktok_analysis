package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OO5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO5 extends BulletinBaseItem {
    public final Long LLILZLL;
    public final int LLIZ;
    public final EnumC618810OOx LLIZLLLIL;
    public final long LLJ;
    public final Long LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;
    public final CharSequence LLJJI;
    public final int LLJJIII;
    public final EnumC618810OOx LLJJIJI;
    public final String LLJJIJIIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OO5)) {
            return false;
        }
        C0OO5 c0oo5 = (C0OO5) obj;
        return Intrinsics.LJFF(this.LLILZLL, c0oo5.LLILZLL) && this.LLIZ == c0oo5.LLIZ && this.LLIZLLLIL == c0oo5.LLIZLLLIL && this.LLJ == c0oo5.LLJ && Intrinsics.LJFF(this.LLJI, c0oo5.LLJI) && this.LLJIJIL == c0oo5.LLJIJIL && this.LLJILJIL == c0oo5.LLJILJIL && this.LLJILJILJ == c0oo5.LLJILJILJ && this.LLJILLL == c0oo5.LLJILLL && Intrinsics.LJFF(this.LLJJ, c0oo5.LLJJ) && Intrinsics.LJFF(this.LLJJI, c0oo5.LLJJI) && this.LLJJIII == c0oo5.LLJJIII && this.LLJJIJI == c0oo5.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c0oo5.LLJJIJIIJIL);
    }

    public final int hashCode() {
        Long l = this.LLILZLL;
        int iHashCode = (((((((l == null ? 0 : l.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJ)) * 31;
        Long l2 = this.LLJI;
        int iHashCode2 = (((((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31;
        String str = this.LLJJ;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII) * 31) + this.LLJJIJI.hashCode()) * 31;
        String str2 = this.LLJJIJIIJIL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(" + isFirst:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" + isLast:");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" + padding");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final EnumC618810OOx LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJILJIL;
    }

    public /* synthetic */ C0OO5(Long l, int i, EnumC618810OOx enumC618810OOx, long j, Long l2, boolean z, String str, CharSequence charSequence, int i2, EnumC618810OOx enumC618810OOx2, String str2, int i3) {
        this(l, i, enumC618810OOx, j, l2, false, false, 0, z, (i3 & 512) != 0 ? null : str, (i3 & 1024) != 0 ? "" : charSequence, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C0OO3.DEFAULT.getType() : i2, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? EnumC618810OOx.NONE : enumC618810OOx2, (i3 & 8192) == 0 ? str2 : null);
    }

    public C0OO5(Long l, int i, EnumC618810OOx enumC618810OOx, long j, Long l2, boolean z, boolean z2, int i2, boolean z3, String str, CharSequence charSequence, int i3, EnumC618810OOx enumC618810OOx2, String str2) {
        super(EnumC618810OOx.INLINE_MSG, C0OK6.INLINE, 0, true, j, l2, l, null, null, i, C2097608Jq.LJ(), z, z2, false, 0, i2, null, false, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str, 0, null, null, null);
        this.LLILZLL = l;
        this.LLIZ = i;
        this.LLIZLLLIL = enumC618810OOx;
        this.LLJ = j;
        this.LLJI = l2;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = i2;
        this.LLJILLL = z3;
        this.LLJJ = str;
        this.LLJJI = charSequence;
        this.LLJJIII = i3;
        this.LLJJIJI = enumC618810OOx2;
        this.LLJJIJIIJIL = str2;
    }
}
