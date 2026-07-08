package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.1555, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1555 extends C155B implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1555.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1555.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C155B
    public final List<MusicModel> LIZ() {
        MusicModel musicModelLIZ;
        ArrayList arrayList = new ArrayList();
        if ((!LIZJ().LJIIZILJ && !LIZJ().LIZJ.invoke().getUnlimitedOnly()) || (LIZJ().LIZJ.invoke().isReplaceMusic() && LIZJ().LIZJ.invoke().getUnlimitedOnly())) {
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, (AnonymousClass1555) arrayList, (List<MusicModel>) 0);
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(((C155W) this.LLILZIL.getValue(this, LLILZLL[1])).zt().LIZIZ());
            if (aVMusicExtractAVMusic == null || (musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic)) == null) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_adapter_no_fill_capsule_in_panel_opt", true, true)) {
                    awS409S0200000_8.invoke();
                    return arrayList;
                }
            } else if (!musicModelLIZ.getIsStripMusic() && C155C.LIZ(musicModelLIZ, LIZJ())) {
                musicModelLIZ.setSelected(true);
                arrayList.add(musicModelLIZ);
                awS409S0200000_8.invoke();
            }
        }
        return arrayList;
    }

    public final C155H LIZJ() {
        return (C155H) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public AnonymousClass1555(C1DRG c1drg) {
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C155W.class, null);
    }
}
