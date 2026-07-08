package X;

import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.10uG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19394610uG extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJ = 0;
    public final InterfaceC1631620sYq<Integer, Integer, RecommendHashtag, Unit> LL;
    public final ViewModelStoreOwner LLILLJJLI;
    public HashTagMobHelper LLILLL;
    public final KeyboardStateViewModel LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;

    public final void I5(boolean z) {
        if (((Number) C296210BjH.LIZ.getValue()).intValue() == 1) {
            if (z) {
                C786410Ut5.B5((TuxTextView) this.itemView.findViewById(R.id.dmz), 0.2f);
                return;
            } else {
                C786410Ut5.B5((TuxTextView) this.itemView.findViewById(R.id.dmz), 1.0f);
                return;
            }
        }
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            if (numLIZJ == null) {
                return;
            }
            this.itemView.findViewById(R.id.eu6).setBackgroundColor(numLIZJ.intValue());
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c7, this.itemView.getContext());
        if (numLIZJ2 == null) {
            return;
        }
        this.itemView.findViewById(R.id.eu6).setBackgroundColor(numLIZJ2.intValue());
    }

    public C19394610uG(View view, AwS678S0100000_29 awS678S0100000_29, ViewModelStoreOwner viewModelStoreOwner) {
        KeyboardStateViewModel keyboardStateViewModel;
        super(view);
        this.LL = awS678S0100000_29;
        this.LLILLJJLI = viewModelStoreOwner;
        if (viewModelStoreOwner != null) {
            keyboardStateViewModel = (KeyboardStateViewModel) new ViewModelProvider(viewModelStoreOwner).get(KeyboardStateViewModel.class);
        } else {
            keyboardStateViewModel = null;
        }
        this.LLILZ = keyboardStateViewModel;
    }
}
