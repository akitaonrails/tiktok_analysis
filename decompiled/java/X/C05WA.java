package X;

import com.ss.android.ugc.gamora.editor.lyric.model.LyricEffectDependResource;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$downloadEffectWithDepInternal$2$depResDeferredList$1$1", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {183}, m = "invokeSuspend")
public final class C05WA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WE>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILLL;
    public final /* synthetic */ LyricEffectDependResource LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WA(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, LyricEffectDependResource lyricEffectDependResource, InterfaceC1364105Vn<? super C05WA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lyricStickerEffectDownloadServiceImpl;
        this.LLILZ = lyricEffectDependResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WA(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLIZ;
        Object objLIZLLL;
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDepInternal$2$depResDeferredList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jLIZ = this.LL;
                C155000ia.LIZIZ(obj);
                objLIZLLL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl = this.LLILLL;
            LyricEffectDependResource lyricEffectDependResource = this.LLILZ;
            C1302050jzH.LIZ.getClass();
            jLIZ = C1302050jzH.LIZ();
            this.LL = jLIZ;
            this.LLILLJJLI = 1;
            objLIZLLL = lyricStickerEffectDownloadServiceImpl.LIZLLL(lyricEffectDependResource, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDepInternal$2$depResDeferredList$1$1");
                return objLJFF;
            }
        }
        C05XE c05xe = new C05XE(C189200o6.m1boximpl(objLIZLLL), C1302080jzK.LIZJ(jLIZ), null);
        long jLJIIIZ = C19990113Jj.LJIIIZ(c05xe.LIZIZ);
        Object objM10unboximpl = ((C189200o6) c05xe.LIZ).m10unboximpl();
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl == null) {
            C1366105Wh.LIZJ(EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_DEP_RES_DOWNLOAD, true, jLJIIIZ, ((C05WE) objM10unboximpl).LIZJ, 0, "");
        } else {
            Pair<Integer, String> pairLIZ = C1366105Wh.LIZ(thM5exceptionOrNullimpl);
            C1366105Wh.LIZJ(EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_DEP_RES_DOWNLOAD, false, jLJIIIZ, false, pairLIZ.getFirst().intValue(), pairLIZ.getSecond());
        }
        T t = c05xe.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDepInternal$2$depResDeferredList$1$1");
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WE>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
