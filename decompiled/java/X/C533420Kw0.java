package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AITemplateAssetDownloaderKt$downloadMusic$1", f = "AITemplateAssetDownloader.kt", l = {670}, m = "invokeSuspend")
public final class C533420Kw0 extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends AVMusic>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533420Kw0(String str, Context context, InterfaceC1364105Vn<? super C533420Kw0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533420Kw0 c533420Kw0 = new C533420Kw0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c533420Kw0.LLILLJJLI = obj;
        return c533420Kw0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITemplateAssetDownloaderKt@9c5a.downloadMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MixEditDl] downloadMusic start musicId=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" (requestMusic)");
            C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
            IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
            final String str = this.LLILLL;
            final Context context = this.LLILZ;
            musicService.requestMusic(str, new InterfaceC1416890myV() { // from class: X.0Kw1
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    String message;
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[MixEditDl] downloadMusic requestMusic fail musicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" err=");
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ2.append(message);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    if (exc == null) {
                        exc = new RuntimeException("onLoadMusicFail");
                    }
                    C201955140j.LJIIJ(c0mj82, strLIZIZ, exc);
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("456, ");
                    sbLIZ3.append(str);
                    c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(final AVMusic aVMusic) {
                    if (aVMusic == null) {
                        C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[MixEditDl] downloadMusic requestMusic success but music null musicId=");
                        sbLIZ2.append(str);
                        C201955140j.LJIJI(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                        C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("downloadMusic failed, music ");
                        sbLIZ3.append(str);
                        c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                        return;
                    }
                    C0MJ8 c0mj83 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[MixEditDl] downloadMusic requestMusic ok musicId=");
                    sbLIZ4.append(str);
                    sbLIZ4.append(" -> downloadMusic file");
                    C201955140j.LIZJ(c0mj83, C2188811AlT.LIZIZ(sbLIZ4));
                    IAnotherMusicService musicService2 = C1403010mc7.LIZ.getMusicService();
                    Context context2 = context;
                    final String str2 = str;
                    final C118300cf c118300cf2 = c118300cf;
                    final C094D<Pair<Integer, ? extends AVMusic>> c094d3 = c094d;
                    musicService2.LJ("ai_template", context2, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0Kw2
                        @Override // X.InterfaceC1416880myU
                        public final void LIZJ(boolean z) {
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void onStart() {
                            C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("[MixEditDl] downloadMusic file onStart musicId=");
                            sbLIZ5.append(str2);
                            C201955140j.LIZJ(c0mj84, C2188811AlT.LIZIZ(sbLIZ5));
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void onProgress(int i2) {
                            int iLJ = C13LZ.LJ(i2 / 10, 0, 10);
                            C118300cf c118300cf3 = c118300cf2;
                            if (iLJ != c118300cf3.element) {
                                c118300cf3.element = iLJ;
                                C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("[MixEditDl] downloadMusic file progress musicId=");
                                sbLIZ5.append(str2);
                                sbLIZ5.append(" progress=");
                                sbLIZ5.append(i2);
                                sbLIZ5.append(" ~");
                                sbLIZ5.append(iLJ * 10);
                                sbLIZ5.append('%');
                                C201955140j.LIZJ(c0mj84, C2188811AlT.LIZIZ(sbLIZ5));
                            }
                            c094d3.LJIIIIZZ(new Pair<>(Integer.valueOf(i2), null));
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void LIZ(Integer num, String str3) {
                            C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("[MixEditDl] downloadMusic file onFailed musicId=");
                            sbLIZ5.append(str2);
                            sbLIZ5.append(" code=");
                            sbLIZ5.append(num);
                            sbLIZ5.append(" msg=");
                            sbLIZ5.append(str3);
                            C201955140j.LJII(c0mj84, C2188811AlT.LIZIZ(sbLIZ5));
                            C094D<Pair<Integer, ? extends AVMusic>> c094d4 = c094d3;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("123, ");
                            sbLIZ6.append(str2);
                            c094d4.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ6)));
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void LIZIZ(String str3, MusicWaveBean musicWaveBean) {
                            C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("[MixEditDl] downloadMusic file onSuccess musicId=");
                            sbLIZ5.append(str2);
                            sbLIZ5.append(" path=");
                            sbLIZ5.append(str3);
                            C201955140j.LIZJ(c0mj84, C2188811AlT.LIZIZ(sbLIZ5));
                            C094D<Pair<Integer, ? extends AVMusic>> c094d4 = c094d3;
                            AVMusic aVMusic2 = aVMusic;
                            aVMusic2.path = str3;
                            c094d4.LJIIIIZZ(new Pair<>(100, aVMusic2));
                            c094d3.LJIIJJI(null);
                        }
                    }, false);
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(521);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AITemplateAssetDownloaderKt@9c5a.downloadMusic$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITemplateAssetDownloaderKt@9c5a.downloadMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends AVMusic>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
