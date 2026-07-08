package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1557, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1557 extends C155B implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1557.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1557.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C155B
    public final List<MusicModel> LIZ() {
        ArrayList arrayList = new ArrayList();
        List<MusicModel> list = ((C155H) this.LLILZ.getValue(this, LLILZLL[0])).LJIJJ;
        if (list != null) {
            for (MusicModel musicModel : list) {
                String musicId = musicModel.getMusicId();
                MusicModel musicModelLJIL = ((AbstractC204621154x) this.LLILZIL.getValue(this, LLILZLL[1])).LJIL();
                if (!Intrinsics.LJFF(musicId, musicModelLJIL != null ? musicModelLJIL.getMusicId() : null)) {
                    String musicId2 = musicModel.getMusicId();
                    C1452640nuA.LIZ.getClass();
                    if (!Intrinsics.LJFF(musicId2, C1452640nuA.LIZIZ)) {
                        arrayList.add(musicModel);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public AnonymousClass1557(C1DRG c1drg) {
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
    }
}
