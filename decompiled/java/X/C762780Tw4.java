package X;

import android.view.View;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.LiveBGMMiniWidget$observeViewModel$1$1$1", f = "LiveBGMMiniWidget.kt", l = {}, m = "invokeSuspend")
public final class C762780Tw4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveBGMMiniWidget LL;
    public final /* synthetic */ AbstractC762710Tvx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762780Tw4(LiveBGMMiniWidget liveBGMMiniWidget, AbstractC762710Tvx abstractC762710Tvx, InterfaceC1364105Vn<? super C762780Tw4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveBGMMiniWidget;
        this.LLILLJJLI = abstractC762710Tvx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762780Tw4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("LiveBGMMiniWidget@67d4.observeViewModel$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveBGMMiniWidget liveBGMMiniWidget = this.LL;
        liveBGMMiniWidget.LLJJ = ((C762740Tw0) this.LLILLJJLI).LIZ;
        String str3 = null;
        liveBGMMiniWidget.A1(null);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        MusicSong musicSong = this.LL.LLJJ;
        if (musicSong != null) {
            str = musicSong.coverUrl;
        } else {
            str = null;
        }
        C1324610kZf url = c0jbnLIZ.setUrl(str);
        View view = this.LL.LLJILJILJ;
        if (view == null) {
            view = null;
        }
        url.LJJI(view);
        C427340GpI c427340GpI = this.LL.LLJILLL;
        if (c427340GpI == null) {
            c427340GpI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MusicSong musicSong2 = this.LL.LLJJ;
        if (musicSong2 != null) {
            str2 = musicSong2.title;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append('-');
        MusicSong musicSong3 = this.LL.LLJJ;
        if (musicSong3 != null) {
            str3 = musicSong3.author;
        }
        sbLIZ.append(str3);
        c427340GpI.setText(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.C1(C763260Twq.LJIIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBGMMiniWidget@67d4.observeViewModel$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
