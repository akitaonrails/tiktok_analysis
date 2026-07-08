package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zoz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910710zoz extends RecyclerView.ViewHolder {
    public static final int LLJ;
    public final DonationFragment LL;
    public final SmartAvatarImageView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final ImageView LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;

    static {
        C844470XAv.LIZ.getClass();
        LLJ = (int) C12ES.LIZJ(32.0f, C786410Ut5.N3(C844470XAv.LIZ()));
    }

    public C1910710zoz(View view, DonationFragment donationFragment) {
        super(view);
        this.LL = donationFragment;
        this.LLILLJJLI = (SmartAvatarImageView) view.findViewById(R.id.bh2);
        this.LLILLL = (TextView) view.findViewById(R.id.p09);
        this.LLILZ = (TextView) view.findViewById(R.id.desc);
        this.LLILZIL = (TextView) view.findViewById(R.id.xvw);
        this.LLILZLL = (ImageView) view.findViewById(R.id.vx4);
        this.LLIZ = (TextView) view.findViewById(R.id.y8z);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.y90);
    }
}
