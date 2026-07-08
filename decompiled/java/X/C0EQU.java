package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EQU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQU extends AbstractC19622511pv<LyricStickerModel> implements InterfaceC379610EuV {
    public final C1DRG LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public final EnumC1466150oFx LLIZLLLIL;

    @Override // X.AbstractC19622511pv
    public final EnumC1466150oFx LJJIJLIJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C0EQU(C1DRG c1drg) {
        super(LyricStickerModel.class);
        this.LLILLJJLI = c1drg;
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 686));
        this.LLIZ = -1;
        this.LLIZLLLIL = EnumC1466150oFx.LYRIC_STICKER;
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJI(StickerModel stickerModel) {
        C0E55 player;
        this.LLILZ = true;
        this.LLIZ = ((LyricStickerModel) stickerModel).getId();
        C0E48 c0e48 = (C0E48) this.LLILLL.getValue();
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJLL(StickerModel stickerModel) {
        C0E55 player;
        this.LLILZIL = true;
        this.LLIZ = ((LyricStickerModel) stickerModel).getId();
        C0E48 c0e48 = (C0E48) this.LLILLL.getValue();
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJLIIL(StickerModel stickerModel) {
        C0E55 player;
        this.LLILZLL = true;
        this.LLIZ = ((LyricStickerModel) stickerModel).getId();
        C0E48 c0e48 = (C0E48) this.LLILLL.getValue();
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJL(StickerModel stickerModel) {
        LyricStickerModel lyricStickerModel = (LyricStickerModel) stickerModel;
        if ((this.LLILZ || this.LLILZIL || this.LLILZLL) && this.LLIZ == lyricStickerModel.getId()) {
            this.LLIZ = -1;
            this.LLILZIL = false;
            this.LLILZ = false;
            this.LLILZLL = false;
            C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 687));
        }
    }
}
