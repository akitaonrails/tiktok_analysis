package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.sticker.data.Word;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0ENs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363700ENs implements InterfaceC349700DnM {
    public final TextStickerData LIZ;

    @Override // X.InterfaceC349700DnM
    public final int LIZ() {
        return this.LIZ.getStartTime();
    }

    @Override // X.InterfaceC349700DnM
    public final List<Word> LIZIZ() {
        return this.LIZ.getWords();
    }

    @Override // X.InterfaceC349700DnM
    public final int LIZJ() {
        return this.LIZ.getEndTime();
    }

    @Override // X.InterfaceC349700DnM
    public final List<Word> LIZLLL() {
        return this.LIZ.getCacheWords();
    }

    @Override // X.InterfaceC349700DnM
    public final boolean LJ() {
        return this.LIZ.getMotionModel().autoWrapLine;
    }

    @Override // X.InterfaceC349700DnM
    public final long LJFF() {
        return this.LIZ.getClipEnd();
    }

    @Override // X.InterfaceC349700DnM
    public final String LJII() {
        return C13LQ.LJJJ(C123P.LJII(this.LIZ.getTextWrapList()), "\n", null, null, AFwS234S0000000_5.get$arr$(415), 30);
    }

    @Override // X.InterfaceC349700DnM
    public final String LJIIIIZZ() {
        return this.LIZ.getTextStr();
    }

    @Override // X.InterfaceC349700DnM
    public final long getClipStart() {
        return this.LIZ.getClipStart();
    }

    @Override // X.InterfaceC349700DnM
    public final int getDurationMs() {
        return LIZJ() - LIZ();
    }

    public C363700ENs(TextStickerData textStickerData) {
        this.LIZ = textStickerData;
    }

    @Override // X.InterfaceC349700DnM
    public final void LJI(List<Word> list) {
        this.LIZ.setCacheWords(list);
    }
}
