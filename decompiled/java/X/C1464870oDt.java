package X;

import Y.AfS191S0100000_22;
import android.app.Activity;
import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicListRequest;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.lyric.copyright.LyricsRightsNetApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464870oDt extends AbstractC2255721DQs<C0EZ2> implements C0EZ2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final C0EZ2 LLILLJJLI = this;
    public final LyricsRightsNetApi LLILLL = (LyricsRightsNetApi) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, LyricsRightsNetApi.class);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public boolean LLILZLL;
    public InterfaceC420801kM LLIZ;
    public InterfaceC420801kM LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464870oDt.class, "lyricBusinessApi", "getLyricBusinessApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1464870oDt.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final void clear() {
        InterfaceC420801kM interfaceC420801kM = this.LLIZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLIZ = null;
        InterfaceC420801kM interfaceC420801kM2 = this.LLIZLLLIL;
        if (interfaceC420801kM2 != null) {
            interfaceC420801kM2.dispose();
        }
        this.LLIZLLLIL = null;
        this.LLILZLL = false;
        C04QO.LIZ.clear();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[1]);
    }

    public final InterfaceC366450EYh w2() {
        return (InterfaceC366450EYh) this.LLILZ.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS601S0100000_22(this, 512));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        clear();
    }

    public C0EZ2 Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1464870oDt(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C11NZ<X.InterfaceC1168504hf> W1(java.util.List<java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1464870oDt.W1(java.util.List):X.11NZ");
    }

    private final Boolean o2(String str) {
        if (a0.LJJJIL(str)) {
            return null;
        }
        return C04QO.LIZ.get(str);
    }

    public final void G2(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (true ^ a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList);
        if (listLJJJJI.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLJJJJI) {
            if (o2((String) obj) == null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        InterfaceC420801kM interfaceC420801kM = this.LLIZLLLIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLIZLLLIL = this.LLILLL.getMusicDetailByIdList(new RecentMusicListRequest((String[]) arrayList2.toArray(new String[0]))).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0oDu
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                List<Music> list2 = ((MusicList) obj2).musicList;
                if (list2 == null) {
                    return C13BV.INSTANCE;
                }
                return list2;
            }
        }).LJJLL(new AfS191S0100000_22(this, 27), new C09JN() { // from class: X.0oDv
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("LyricsRightsCheckerComponent@be56.preCheck$3");
                C1C7U.LIZIZ("LyricsRightsCheckerComponent@be56.preCheck$3");
            }
        });
    }

    public final void T2(Scene scene) {
        Context sceneContext = scene.getSceneContext();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131836932);
        C1390380mHk.LIZJ(sceneContext, 2037, creativeToastBuilder);
    }

    @Override // X.C0EZ2
    public void Sh1(String str, boolean z) {
        if (!a0.LJJJIL(str)) {
            C04QO.LIZ.put(str, Boolean.valueOf(z));
        }
    }

    public final void H2(Activity activity, Function0<Unit> function0, Function0<Unit> function02) {
        C1397580mTM c1397580mTM = new C1397580mTM(new C1361400lX0(activity, R.style.y0));
        c1397580mTM.LIZ(2131836929);
        C985403tE.LIZ(c1397580mTM, new AwS388S0200000_22(function02, function0, (Function0<Unit>) 140));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    private final void X1(List<String> list, final Function0<Unit> function0, final Function1<? super List<String>, Unit> function1, final Function0<Unit> function02) {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        InterfaceC420801kM interfaceC420801kM = this.LLIZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLIZ = W1(list).LJJLJLI(new C09JN() { // from class: X.057A
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LyricsRightsCheckerComponent@be56.checkBeforePublish$1");
                InterfaceC1168504hf interfaceC1168504hf = (InterfaceC1168504hf) obj;
                if (interfaceC1168504hf instanceof C1168304hd) {
                    this.LL.LLILZLL = false;
                    function0.invoke();
                } else if (interfaceC1168504hf instanceof C1168604hg) {
                    this.LL.LLILZLL = false;
                    function1.invoke(((C1168604hg) interfaceC1168504hf).LIZ);
                } else if (interfaceC1168504hf instanceof C1168404he) {
                    this.LL.LLILZLL = false;
                    function02.invoke();
                } else {
                    throw new C1954807lC();
                }
                C1C7U.LIZIZ("LyricsRightsCheckerComponent@be56.checkBeforePublish$1");
            }
        });
    }

    @Override // X.C0EZ2
    public void pZ0(Scene scene, InterfaceC364330EQd interfaceC364330EQd, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
        List<AVMusic> mergedMusicList;
        if (videoPublishEditModel != null && interfaceC364330EQd != null) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.draftInfoModel.isDraft) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(creativeModel.musicBuzModel);
                List listLJJJJI = null;
                if (aVMusicExtractAVMusic != null && (mergedMusicList = aVMusicExtractAVMusic.getMergedMusicList()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<AVMusic> it2 = mergedMusicList.iterator();
                    while (it2.hasNext()) {
                        String musicId = it2.next().getMusicId();
                        if (musicId != null) {
                            arrayList.add(musicId);
                        }
                    }
                    listLJJJJI = C13LP.LJJJJI(arrayList);
                }
                List<LyricStickerModel> listI4 = interfaceC364330EQd.i4();
                if (!listI4.isEmpty() && listLJJJJI != null && !listLJJJJI.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listLJJJJI) {
                        Iterator<LyricStickerModel> it3 = listI4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                LyricStickerModel next = it3.next();
                                if (Intrinsics.LJFF(next.getMusicId(), obj)) {
                                    if (next != null) {
                                        arrayList2.add(obj);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        function0.invoke();
                        return;
                    } else {
                        X1(arrayList2, new AwS566S0100000_22(function0, (Function0<Boolean>) 733), new AwS231S0300000_22(this, (C1464870oDt) interfaceC364330EQd, (InterfaceC364330EQd) function0, (Function0<Unit>) 24), new AwS423S0200000_22(this, scene, 66));
                        return;
                    }
                }
                function0.invoke();
                return;
            }
        }
        function0.invoke();
    }
}
