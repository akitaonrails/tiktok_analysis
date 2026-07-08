package X;

import Y.ARunnableS45S0300000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398970mVb implements InterfaceC1399020mVg {
    public static final int LIZLLL = VideoTag.MDP_SQUARE_MUSIC.getVideoTag();
    public final Function0<Music> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Aweme> LIZJ;

    @Override // X.InterfaceC1399020mVg
    public final int LIZIZ() {
        if (C1398670mV7.LIZ(this.LIZJ.invoke())) {
            return 2131829785;
        }
        C629940OnI c629940OnI = C629940OnI.LIZ;
        Music musicInvoke = this.LIZ.invoke();
        c629940OnI.getClass();
        return C629940OnI.LIZ(musicInvoke) ? 2131848259 : 2131857974;
    }

    @Override // X.InterfaceC1399020mVg
    public final void LIZ(ViewGroup viewGroup) {
        View viewFindViewById;
        TextView textView;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.cbx)) == null || (textView = (TextView) viewFindViewById.findViewById(R.id.szn)) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS45S0300000_12(viewFindViewById, textView, this, 25));
    }

    public C1398970mVb(AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212, AwS565S0100000_21 awS565S0100000_213) {
        this.LIZ = awS565S0100000_21;
        this.LIZIZ = awS565S0100000_212;
        this.LIZJ = awS565S0100000_213;
    }

    @Override // X.InterfaceC1399020mVg
    public final void LIZJ(Context context, Aweme aweme, Integer num) {
        this.LIZIZ.invoke();
    }
}
