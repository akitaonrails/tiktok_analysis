package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalSound;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioFetcher$createJob$1", f = "ReuseAudioFetcher.kt", l = {}, m = "invokeSuspend")
public final class C20019513Ur extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20019813Uu LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20019513Ur(C20019813Uu c20019813Uu, String str, InterfaceC1364105Vn<? super C20019513Ur> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20019813Uu;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20019513Ur(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        String strLIZ;
        List<String> listSubList;
        Audio audio;
        C1C7U.LIZ("ReuseAudioFetcher@f825.createJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20306414cw c20306414cw = new C20306414cw(this.LL, 0);
        try {
            C20019813Uu c20019813Uu = this.LL;
            String str = this.LLILLJJLI;
            c20019813Uu.getClass();
            Aweme awemeLIZ = C20019813Uu.LIZ(str);
            if (awemeLIZ == null || (audio = awemeLIZ.getAudio()) == null || (list = audio.originalSoundInfos) == null) {
                list = C13BV.INSTANCE;
            }
            if (!list.isEmpty()) {
                this.LL.LJFF = ((OriginalSound) list.get(0)).playAddr;
            }
            if (awemeLIZ != null) {
                C20019813Uu c20019813Uu2 = this.LL;
                c20019813Uu2.LJ = awemeLIZ;
                InterfaceC20019613Us interfaceC20019613Us = c20019813Uu2.LIZJ;
                if (interfaceC20019613Us != null) {
                    interfaceC20019613Us.LJI(awemeLIZ, c20019813Uu2.LJFF);
                }
            }
            UrlModel urlModel = this.LL.LJFF;
            String strLIZ2 = null;
            if (urlModel != null) {
                strLIZ = C1838950xxF.LIZ(urlModel);
            } else {
                strLIZ = null;
            }
            if (C123100dR.LIZ(strLIZ)) {
                C20019813Uu c20019813Uu3 = this.LL;
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(C1838950xxF.LIZ(this.LL.LJFF));
                if (this.LL.LJFF.getUrlList().size() > 1) {
                    listSubList = this.LL.LJFF.getUrlList().subList(1, this.LL.LJFF.getUrlList().size());
                } else {
                    listSubList = C13BV.INSTANCE;
                }
                abstractC2199801B7qWith.LJIIIIZZ = listSubList;
                C20019813Uu c20019813Uu4 = this.LL;
                abstractC2199801B7qWith.LJ = c20019813Uu4.LJI;
                UrlModel urlModel2 = c20019813Uu4.LJFF;
                if (urlModel2 != null) {
                    strLIZ2 = C1838950xxF.LIZ(urlModel2);
                }
                abstractC2199801B7qWith.LIZJ = C1487190ont.LIZJ(strLIZ2);
                abstractC2199801B7qWith.LJII = 3;
                abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("downloader_scene", "reuse_audio")));
                abstractC2199801B7qWith.LJIIJ = "reuse_audio";
                abstractC2199801B7qWith.LJIIL = c20306414cw;
                abstractC2199801B7qWith.LJJ = true;
                abstractC2199801B7qWith.LJIJJLI = true;
                C2286608xc.LJ(abstractC2199801B7qWith.LIZJ());
                c20019813Uu3.getClass();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC20019613Us interfaceC20019613Us2 = this.LL.LIZJ;
            if (interfaceC20019613Us2 != null) {
                interfaceC20019613Us2.LIZIZ();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReuseAudioFetcher@f825.createJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
