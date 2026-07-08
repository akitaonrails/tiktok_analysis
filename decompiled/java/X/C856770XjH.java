package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0XjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856770XjH extends AbstractC856750XjF {
    public final VideoPublishEditModel LIZLLL;
    public final ArrayList<AbstractC856710XjB> LJ;
    public final InterfaceC1455860nzM LJFF;

    @Override // X.AbstractC856750XjF
    public final int LIZIZ() {
        return EnumC856780XjI.LONG_VIDEO_CHECK_TYPE.getCheckType();
    }

    @Override // X.AbstractC856750XjF
    public final AbstractC856710XjB LIZJ() {
        AbstractC856710XjB next;
        Iterator<AbstractC856710XjB> it2 = this.LJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ() == C0FPS.LONG_VIDEO.getScene()) {
                break;
            }
        }
        return next;
    }

    @Override // X.AbstractC856750XjF
    public final boolean LJII() {
        AbstractC856710XjB abstractC856710XjBLIZJ = LIZJ();
        return abstractC856710XjBLIZJ != null && abstractC856710XjBLIZJ.LIZJ();
    }

    @Override // X.AbstractC856750XjF
    public final ArrayList<AbstractC856710XjB> LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC856750XjF
    public final InterfaceC1455860nzM LJFF() {
        return this.LJFF;
    }

    @Override // X.AbstractC856750XjF
    public final VideoPublishEditModel LJI() {
        return this.LIZLLL;
    }

    public C856770XjH(VideoPublishEditModel videoPublishEditModel, ArrayList arrayList, InterfaceC1446740nke interfaceC1446740nke) {
        super(videoPublishEditModel, arrayList, interfaceC1446740nke);
        this.LIZLLL = videoPublishEditModel;
        this.LJ = arrayList;
        this.LJFF = interfaceC1446740nke;
    }
}
