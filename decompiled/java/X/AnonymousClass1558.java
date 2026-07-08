package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1558, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1558 extends C155B implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1558.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C155B
    public final List<MusicModel> LIZ() {
        MusicModel musicModel = ((C155H) this.LLILZ.getValue(this, LLILZIL[0])).LJJII.LIZJ;
        if (musicModel != null) {
            return Collections.singletonList(musicModel);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public AnonymousClass1558(C1DRG c1drg) {
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C155H.class, null);
    }
}
