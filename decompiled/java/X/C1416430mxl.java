package X;

import Y.AkS483S0100000_22;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.EffectAssetDownloader$downloadMusic$1", f = "EffectAssetDownloader.kt", l = {267, 294, 299, 307}, m = "invokeSuspend")
public final class C1416430mxl extends C09AX implements Function2<C094D<? super C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1416470mxp LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Effect LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416430mxl(String str, C1416470mxp c1416470mxp, String str2, Effect effect, InterfaceC1364105Vn<? super C1416430mxl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = c1416470mxp;
        this.LLIZLLLIL = str2;
        this.LLJ = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416430mxl c1416430mxl = new C1416430mxl(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1416430mxl.LLILZIL = obj;
        return c1416430mxl;
    }

    public static final C19484211Ku LIZ(final C1416470mxp c1416470mxp) {
        C1458410o3T.LIZ.getClass();
        C11NZ c11nzLJJIJLIJ = C1458410o3T.LIZLLL;
        if (c11nzLJJIJLIJ == null) {
            c11nzLJJIJLIJ = C11NZ.LJJIJLIJ(new RuntimeException("get music list failed"));
        }
        return c11nzLJJIJLIJ.LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new AkS483S0100000_22(c1416470mxp, 9)).LJJLI(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0n2C
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<MusicModel>> c09aj) {
                List<MusicModel> musicList;
                C1C7U.LIZ("EffectAssetDownloader@f641.downloadMusic$1$getMusicList$2");
                InterfaceC1453200nv4 interfaceC1453200nv4 = c1416470mxp.LLILZ;
                if (interfaceC1453200nv4 != null && (musicList = interfaceC1453200nv4.getMusicList()) != null) {
                    c09aj.onNext(musicList);
                    c09aj.onComplete();
                } else {
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadMusic$1$getMusicList$2");
            }
        }).LJL(C1701940uOG.LIZIZ()));
    }

    public static final String LJ(C1416470mxp c1416470mxp) {
        ReusedMusicInfo reusedMusicInfo = c1416470mxp.LLILZLL.invoke().creativeModel.mixEditingModel.reusedMusicInfo;
        if (reusedMusicInfo != null) {
            if (C13LP.LJJJJ(reusedMusicInfo.reusedMusicOrigin, (Iterable) C299320BoI.LIZIZ.getValue())) {
                return reusedMusicInfo.reusedMusicId;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba A[LOOP:3: B:63:0x01b4->B:65:0x01ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416430mxl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
