package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839130xxX extends RecyclerView.ViewHolder {
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final CommerceMusicLogger LLILLL;
    public final Function1<MusicModel, Unit> LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTag LLJI;
    public final C197039127h LLJIJIL;
    public final TuxIconView LLJILJIL;
    public final View LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public final Animation LLJJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1839130xxX(View view, LifecycleOwner lifecycleOwner, CommerceMusicLogger commerceMusicLogger, Function1<? super MusicModel, Unit> function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = commerceMusicLogger;
        this.LLILZ = function1;
        this.LLILZIL = (SmartImageView) this.itemView.findViewById(R.id.sxd);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.sxk);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.sx_);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.sxj);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.sxb);
        this.LLJI = (TuxTag) this.itemView.findViewById(R.id.sx9);
        this.LLJIJIL = (C197039127h) this.itemView.findViewById(R.id.sxi);
        this.LLJILJIL = (TuxIconView) this.itemView.findViewById(R.id.sxg);
        this.LLJILJILJ = this.itemView.findViewById(R.id.sxe);
        this.LLJILLL = C1BNE.LIZ(-1);
        this.LLJJ = AnimationUtils.loadAnimation(view.getContext(), R.anim.a1);
    }
}
