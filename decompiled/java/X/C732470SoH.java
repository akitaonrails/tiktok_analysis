package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p5a.a;

/* JADX INFO: renamed from: X.0SoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732470SoH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoShareAssem LL;
    public final /* synthetic */ a LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732470SoH(VideoShareAssem videoShareAssem, a aVar) {
        super(0);
        this.LL = videoShareAssem;
        this.LLILLJJLI = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0SoG, X.0lcl] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final VideoShareAssem videoShareAssem = this.LL;
        final a aVar = this.LLILLJJLI;
        ?? r1 = new InterfaceC1364970lcl() { // from class: X.0SoG
            @Override // X.InterfaceC1364970lcl
            public final void onDismiss() {
                VideoShareAssem videoShareAssem2 = videoShareAssem;
                a aVar2 = aVar;
                videoShareAssem2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                aVar2.onTouch(videoShareAssem2.getContentView().findViewById(R.id.uzq), MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 3, 0.0f, 0.0f, 0));
            }
        };
        if (videoShareAssem.LLLFZ) {
            videoShareAssem.Gp().LJJI();
            ViewOnTouchListenerC1364750lcP.LIZ(r1);
        }
        videoShareAssem.LLLIIIL = r1;
        return Unit.LIZ;
    }
}
