package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* JADX INFO: renamed from: X.11vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19658711vl {
    public final TextStickerModel LIZ;
    public final C390420FSm LIZIZ;
    public final C0FHM LIZJ;
    public final C0FSC LIZLLL;

    public C19658711vl() {
        this(0);
    }

    public /* synthetic */ C19658711vl(int i) {
        this(new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null), new C390420FSm(), C0FHM.GONE, null);
    }

    public C19658711vl(TextStickerModel textStickerModel, C390420FSm c390420FSm, C0FHM c0fhm, C0FSC c0fsc) {
        this.LIZ = textStickerModel;
        this.LIZIZ = c390420FSm;
        this.LIZJ = c0fhm;
        this.LIZLLL = c0fsc;
    }

    public static C19658711vl LIZ(C19658711vl c19658711vl, TextStickerModel textStickerModel, C0FHM c0fhm, int i) {
        C390420FSm c390420FSm;
        if ((i & 1) != 0) {
            textStickerModel = c19658711vl.LIZ;
        }
        C0FSC c0fsc = null;
        if ((i & 2) != 0) {
            c390420FSm = c19658711vl.LIZIZ;
        } else {
            c390420FSm = null;
        }
        if ((i & 4) != 0) {
            c0fhm = c19658711vl.LIZJ;
        }
        if ((i & 8) != 0) {
            c0fsc = c19658711vl.LIZLLL;
        }
        c19658711vl.getClass();
        return new C19658711vl(textStickerModel, c390420FSm, c0fhm, c0fsc);
    }
}
