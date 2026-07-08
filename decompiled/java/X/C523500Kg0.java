package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import g3a.a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523500Kg0 extends a {
    public final Context LLIZLLLIL;
    public final MusicModel LLJ;
    public final Function1<String, Unit> LLJI;
    public final Function0<Unit> LLJIJIL;

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        if (this.LLIZLLLIL == null) {
            LJIIJ();
        } else {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLZIJ("mv_pre_download", this.LLIZLLLIL, this.LLJ, 0, new InterfaceC202028143e() { // from class: X.0Kg3
                @Override // X.InterfaceC202028143e
                public final void LIZIZ(Map map, Map map2) {
                }

                @Override // X.InterfaceC202028143e
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC202028143e
                public final void onStart() {
                }

                @Override // X.InterfaceC202028143e
                public final void onCancel() {
                    this.LIZ.LLJIJIL.invoke();
                }

                @Override // X.InterfaceC202028143e
                public final void LIZJ(C202035143l c202035143l) {
                    this.LIZ.LLJIJIL.invoke();
                    this.LIZ.LJIIJ();
                }

                @Override // X.InterfaceC202028143e
                public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                    this.LIZ.LLJI.invoke(str);
                    this.LIZ.LJIIJ();
                }
            });
        }
    }

    public C523500Kg0(Context context, MusicModel musicModel, AwS374S0200000_8 awS374S0200000_8, AwS552S0100000_8 awS552S0100000_8) {
        this.LLIZLLLIL = context;
        this.LLJ = musicModel;
        this.LLJI = awS374S0200000_8;
        this.LLJIJIL = awS552S0100000_8;
        LJ(AFwS239S0000000_8.get$arr$(10));
    }
}
