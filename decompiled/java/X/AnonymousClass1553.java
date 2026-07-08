package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1553, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1553 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C154J LLILLJJLI = new C154J();
    public final AnonymousClass1556 LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public volatile List<? extends MusicModel> LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1553.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1553.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1553.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C155W LIZJ() {
        return (C155W) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    public final C155H LIZLLL() {
        return (C155H) this.LLILZ.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AnonymousClass1553(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = new AnonymousClass1556(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C155W.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
    }

    public final List<MusicModel> LIZ(List<MusicModel> list) {
        AVMusic aVMusicExtractAVMusic;
        MusicModel musicModelLJIL;
        IMusicRequestParam iMusicRequestParamInvoke = LIZLLL().LIZJ.invoke();
        if (iMusicRequestParamInvoke.getDisableCache() || iMusicRequestParamInvoke.getRecommendMusicProvider() == null || !LIZLLL().LJJIIZ.LIZ || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LIZJ().zt().LIZIZ())) == null) {
            return list;
        }
        C1456960o18 stripMusicModel = aVMusicExtractAVMusic.getStripMusicModel();
        if (stripMusicModel != null && stripMusicModel.getStrippedMusic()) {
            return list;
        }
        MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic);
        if (musicModelLIZ.isMultiMusicFromTemplate() || !C155C.LIZ(musicModelLIZ, LIZLLL())) {
            return list;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((MusicModel) it2.next()).getMusicId(), musicModelLIZ.getMusicId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if ((!C0BOF.LIZ() || (musicModelLJIL = ((AbstractC204621154x) this.LLILZLL.getValue(this, LLIZLLLIL[2])).LJIL()) == null || musicModelLJIL.getMusicSelectedFromNonRecommendedTab()) && i != 0) {
            if (i > 0) {
                if (C0BOF.LIZ() && !((MusicModel) ListProtector.get(list, i)).getMusicSelectedFromNonRecommendedTab()) {
                    return list;
                }
                ListProtector.add(list, 0, ListProtector.remove(list, i));
                return list;
            }
            musicModelLIZ.setSelected(true);
            ListProtector.add(list, 0, musicModelLIZ);
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> LIZIZ(java.util.List<? extends java.lang.Class<? extends X.C155B>> r10) {
        /*
            r9 = this;
            X.154J r0 = r9.LLILLJJLI
            r7 = 1
            r0.LJFF = r7
            X.1556 r0 = r9.LLILLL
            X.1559 r0 = r0.LLILLJJLI
            java.util.List<X.155B> r0 = r0.LLILLL
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r8 = r0.iterator()
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r2 = r8.next()
            X.155B r2 = (X.C155B) r2
            java.lang.Class r0 = r2.getClass()
            boolean r1 = r10.contains(r0)
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L6d
            boolean r0 = r2.LLILLJJLI
            if (r0 == 0) goto L6d
            if (r1 != 0) goto L6d
            java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r2.LL
        L38:
            java.util.Iterator r5 = r0.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r4
            java.util.Iterator r3 = r6.iterator()
        L4c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            java.lang.String r1 = r0.getMusicId()
            java.lang.String r0 = r4.getMusicId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            if (r2 != 0) goto L3c
        L69:
            r6.add(r4)
            goto L3c
        L6d:
            java.util.List r0 = r2.LIZ()
            r2.LL = r0
            r2.LLILLJJLI = r7
            goto L38
        L76:
            r9.LLIZ = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1553.LIZIZ(java.util.List):java.util.List");
    }

    public final void LJ(C204607154j c204607154j) {
        if (c204607154j.LIZJ == 2) {
            this.LLILLJJLI.getClass();
        }
        List<? extends MusicModel> list = c204607154j.LIZ;
        boolean zBooleanValue = false;
        if (list != null && !list.isEmpty()) {
            C154J c154j = this.LLILLJJLI;
            c154j.LJI = Boolean.TRUE;
            LJFF(c154j, c204607154j);
        } else {
            this.LLILLJJLI.LJI = Boolean.FALSE;
        }
        C524780Ki4.LIZ.end(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "music_data_set");
        C155D c155dH5 = LIZJ().H5();
        if (c155dH5 != null) {
            c155dH5.LIZIZ();
        }
        Boolean bool = this.LLILLJJLI.LJI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_AI.getStringValue(), "", zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> LJFF(X.C154J r14, X.C204607154j r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1553.LJFF(X.154J, X.154j):java.util.List");
    }
}
