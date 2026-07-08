package X;

import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ERP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ERP implements InterfaceC349700DnM {
    public final TextStickerModel LIZ;

    @Override // X.InterfaceC349700DnM
    public final int LIZ() {
        return C814420VxA.LIZIZ(C364540EQy.LIZIZ(this.LIZ));
    }

    @Override // X.InterfaceC349700DnM
    public final List<Word> LIZIZ() {
        return this.LIZ.getWords();
    }

    @Override // X.InterfaceC349700DnM
    public final int LIZJ() {
        return C814420VxA.LIZIZ(this.LIZ.getBaseStickerModel().getEndTime());
    }

    @Override // X.InterfaceC349700DnM
    public final List<Word> LIZLLL() {
        return this.LIZ.getCacheWords();
    }

    @Override // X.InterfaceC349700DnM
    public final boolean LJ() {
        return this.LIZ.getTextMotionModel().autoWrapLine;
    }

    @Override // X.InterfaceC349700DnM
    public final long LJFF() {
        return this.LIZ.getClipEnd();
    }

    @Override // X.InterfaceC349700DnM
    public final String LJII() {
        return this.LIZ.getTextStrWithLineBreak();
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
        BaseStickerModel baseStickerModel = this.LIZ.getBaseStickerModel();
        return (int) (baseStickerModel.getEndTime() - baseStickerModel.getStartTime());
    }

    public C0ERP(TextStickerModel textStickerModel) {
        this.LIZ = textStickerModel;
    }

    @Override // X.InterfaceC349700DnM
    public final void LJI(List<Word> list) {
        this.LIZ.setCacheWords(list);
    }
}
