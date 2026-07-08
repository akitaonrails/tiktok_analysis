package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20495115Hp extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final Context LLIZ;
    public MusicModel LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

    public C20495115Hp(View view) {
        super(view);
        this.LLIZ = view.getContext();
        this.LL = (SmartImageView) view.findViewById(R.id.ld7);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.lqe);
        this.LLILLL = (ImageView) view.findViewById(R.id.lp5);
        this.LLILZ = (TextView) view.findViewById(R.id.zym);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_singer);
        this.LLILZLL = (TextView) view.findViewById(R.id.zy9);
        view.findViewById(R.id.lp6);
        view.findViewById(R.id.zzi);
    }
}
