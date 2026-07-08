package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MusicMemeSongParser$prepareMusicShareStoryResource$1", f = "MusicMemeSongParser.kt", l = {217}, m = "invokeSuspend")
public final class C567650MOd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> LLILLL;
    public final /* synthetic */ C0MOZ LLILZ;
    public final /* synthetic */ C259800zU<MusicShareStoryData> LLILZIL;
    public final /* synthetic */ MusicShareStoryInputData LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ C0MOV LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C567650MOd(InterfaceC1364105Vn<? super Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn, C0MOZ c0moz, C259800zU<MusicShareStoryData> c259800zU, MusicShareStoryInputData musicShareStoryInputData, Context context, C0MOV c0mov, InterfaceC1364105Vn<? super C567650MOd> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = c0moz;
        this.LLILZIL = c259800zU;
        this.LLILZLL = musicShareStoryInputData;
        this.LLIZ = context;
        this.LLIZLLLIL = c0mov;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567650MOd c567650MOd = new C567650MOd(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c567650MOd.LLILLJJLI = obj;
        return c567650MOd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        int duration;
        String name;
        MusicModel music;
        MusicModel music2;
        MusicModel music3;
        MusicModel music4;
        C1C7U.LIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String singer = null;
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
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C567640MOc(this.LLILZLL, this.LLIZ, this.LLILZIL, this.LLILZ, this.LLIZLLLIL, c259800zU, null), 3)};
            this.LLILLJJLI = c259800zU;
            this.LL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1");
                return objLJFF;
            }
        }
        if (((CharSequence) c259800zU.element).length() == 0) {
            InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn = this.LLILLL;
            Pair pair = new Pair(null, new MusicShareStoryData(null, null, -16777216, -16777216, null, null, null, null, null, null, null, null));
            C189200o6.m2constructorimpl(pair);
            interfaceC1364105Vn.resumeWith(pair);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1");
            return unit;
        }
        InterfaceC1364105Vn<Pair<CanvasVideoData, MusicShareStoryData>> interfaceC1364105Vn2 = this.LLILLL;
        CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(this.LLILZ, null);
        MusicShareStoryInputData musicShareStoryInputData = this.LLILZLL;
        ForwardCanvasExtra forwardCanvasExtra = new ForwardCanvasExtra(6, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, 1);
        if (musicShareStoryInputData != null && (music4 = musicShareStoryInputData.getMusic()) != null) {
            duration = music4.getDuration();
        } else {
            duration = 0;
        }
        canvasVideoDataLIZLLL.setExtra(new CanvasExtra(0, 0, 0, 0, duration, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), forwardCanvasExtra, 1.0f, 0L, 0));
        MusicShareStoryData musicShareStoryData = this.LLILZIL.element;
        String str = (String) c259800zU.element;
        MusicShareStoryInputData musicShareStoryInputData2 = this.LLILZLL;
        if (musicShareStoryInputData2 == null || (name = musicShareStoryInputData2.getSongName()) == null) {
            MusicShareStoryInputData musicShareStoryInputData3 = this.LLILZLL;
            if (musicShareStoryInputData3 != null && (music2 = musicShareStoryInputData3.getMusic()) != null && !music2.isPgc()) {
                name = this.LLIZ.getString(R.string.lx5);
            } else {
                MusicShareStoryInputData musicShareStoryInputData4 = this.LLILZLL;
                if (musicShareStoryInputData4 != null && (music = musicShareStoryInputData4.getMusic()) != null) {
                    name = music.getName();
                } else {
                    name = null;
                }
            }
        }
        MusicShareStoryInputData musicShareStoryInputData5 = this.LLILZLL;
        if (musicShareStoryInputData5 != null && (music3 = musicShareStoryInputData5.getMusic()) != null) {
            singer = music3.getSinger();
        }
        Pair pair2 = new Pair(canvasVideoDataLIZLLL, musicShareStoryData.copy(str, musicShareStoryData.sticker, musicShareStoryData.bgStartColor, musicShareStoryData.bgEndColor, musicShareStoryData.cardBgColor, musicShareStoryData.textColor, musicShareStoryData.waveColor, name, singer, musicShareStoryData.isMusicPop, musicShareStoryData.landingBack, musicShareStoryData.lyricStickerStruct));
        C189200o6.m2constructorimpl(pair2);
        interfaceC1364105Vn2.resumeWith(pair2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
