package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MusicShareStoryParser$prepareMusicShareStoryResource$1", f = "MusicShareStoryParser.kt", l = {147}, m = "invokeSuspend")
public final class C567680MOg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<Effect> LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> LLILZ;
    public final /* synthetic */ C0MOZ LLILZIL;
    public final /* synthetic */ C259800zU<MusicShareStoryData> LLILZLL;
    public final /* synthetic */ MusicShareStoryInputData LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ C567700MOi LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C567680MOg(C259800zU<Effect> c259800zU, InterfaceC1364105Vn<? super Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn, C0MOZ c0moz, C259800zU<MusicShareStoryData> c259800zU2, MusicShareStoryInputData musicShareStoryInputData, Context context, C567700MOi c567700MOi, InterfaceC1364105Vn<? super C567680MOg> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC1364105Vn;
        this.LLILZIL = c0moz;
        this.LLILZLL = c259800zU2;
        this.LLIZ = musicShareStoryInputData;
        this.LLIZLLLIL = context;
        this.LLJ = c567700MOi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567680MOg c567680MOg = new C567680MOg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c567680MOg.LLILLJJLI = obj;
        return c567680MOg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        String name;
        MusicModel music;
        MusicModel music2;
        String singer;
        Integer numIsMusicPop;
        MusicModel music3;
        C1C7U.LIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        LyricStickerStruct lyricStickerStruct = null;
        if (i != 0) {
            if (i == 1) {
                c259800zU = (C259800zU) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            c259800zU = new C259800zU();
            c259800zU.element = "";
            i2 = 1;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C567690MOh(this.LLIZ, this.LLIZLLLIL, this.LLILZLL, this.LLILZIL, this.LLJ, c259800zU, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2280108wZ(this.LLILLL, null), 3)};
            this.LLILLJJLI = c259800zU;
            this.LL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.element != null && ((CharSequence) c259800zU.element).length() != 0) {
            InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn = this.LLILZ;
            CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(this.LLILZIL, null);
            Integer landingBack = null;
            canvasVideoDataLIZLLL.setExtra(new CanvasExtra(0, 0, 0, 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(i2, i2, i2, i2, false, 2, false, false, false), new ForwardCanvasExtra(3, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, i2), 1.0f, 0L, 0));
            MusicShareStoryData musicShareStoryData = this.LLILZLL.element;
            String str = (String) c259800zU.element;
            Effect effect = this.LLILLL.element;
            MusicShareStoryInputData musicShareStoryInputData = this.LLIZ;
            if (musicShareStoryInputData == null || (name = musicShareStoryInputData.getSongName()) == null) {
                MusicShareStoryInputData musicShareStoryInputData2 = this.LLIZ;
                if (musicShareStoryInputData2 != null && (music2 = musicShareStoryInputData2.getMusic()) != null && !music2.isPgc()) {
                    name = this.LLIZLLLIL.getString(R.string.lx5);
                } else {
                    MusicShareStoryInputData musicShareStoryInputData3 = this.LLIZ;
                    if (musicShareStoryInputData3 != null && (music = musicShareStoryInputData3.getMusic()) != null) {
                        name = music.getName();
                    } else {
                        name = null;
                    }
                }
            }
            MusicShareStoryInputData musicShareStoryInputData4 = this.LLIZ;
            if (musicShareStoryInputData4 != null && (music3 = musicShareStoryInputData4.getMusic()) != null) {
                singer = music3.getSinger();
            } else {
                singer = null;
            }
            MusicShareStoryInputData musicShareStoryInputData5 = this.LLIZ;
            if (musicShareStoryInputData5 != null) {
                numIsMusicPop = musicShareStoryInputData5.isMusicPop();
            } else {
                numIsMusicPop = null;
            }
            MusicShareStoryInputData musicShareStoryInputData6 = this.LLIZ;
            if (musicShareStoryInputData6 != null) {
                landingBack = musicShareStoryInputData6.getLandingBack();
            }
            MusicShareStoryInputData musicShareStoryInputData7 = this.LLIZ;
            if (musicShareStoryInputData7 != null) {
                lyricStickerStruct = musicShareStoryInputData7.getLyricStickerStruct();
            }
            Pair pair = new Pair(canvasVideoDataLIZLLL, musicShareStoryData.copy(str, effect, musicShareStoryData.bgStartColor, musicShareStoryData.bgEndColor, musicShareStoryData.cardBgColor, musicShareStoryData.textColor, musicShareStoryData.waveColor, name, singer, numIsMusicPop, landingBack, lyricStickerStruct));
            C189200o6.m2constructorimpl(pair);
            interfaceC1364105Vn.resumeWith(pair);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1");
            return unit;
        }
        InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn2 = this.LLILZ;
        Pair pair2 = new Pair(null, new MusicShareStoryData(null, null, -16777216, -16777216, null, null, null, null, null, null, null, null));
        C189200o6.m2constructorimpl(pair2);
        interfaceC1364105Vn2.resumeWith(pair2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
