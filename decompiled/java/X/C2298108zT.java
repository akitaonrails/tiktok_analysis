package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2298108zT extends C2248208rQ {
    public final CreativeInfo LIZJ;

    @Override // X.C2248208rQ
    public final String LIZLLL() {
        return a0.LJJJLL(File.separator, C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LIZJ, C0MI0.EXTRACT_FRAMES, null, 12));
    }

    public C2298108zT(CreativeInfo creativeInfo) {
        super(C0CHQ.LIZ);
        this.LIZJ = creativeInfo;
        this.LIZIZ = LIZLLL();
    }
}
